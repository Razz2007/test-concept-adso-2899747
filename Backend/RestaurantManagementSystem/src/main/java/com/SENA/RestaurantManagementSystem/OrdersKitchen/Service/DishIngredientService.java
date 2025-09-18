package com.SENA.RestaurantManagementSystem.OrdersKitchen.Service;

import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.Dish;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.DishIngredient;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.Ingredient;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IRepository.IBaseRepositoryOrdersKitchen;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IRepository.IDishIngredientRepository;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IService.IDishIngredientService;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IService.IDishService;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IService.IIngredientService;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.DishIngredientReqDto;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.DishIngredientResDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DishIngredientService extends ABaseServiceOrdersKitchen<DishIngredient, DishIngredientReqDto, DishIngredientResDto> implements IDishIngredientService {
    @Override
    protected IBaseRepositoryOrdersKitchen<DishIngredient, String> getRepository() {
        return repository;
    }

    @Autowired
    private IDishIngredientRepository repository;

    @Autowired
    private IDishService dishService;

    @Autowired
    private IIngredientService ingredientService;

    @Override
    public DishIngredientResDto mapToResDto(DishIngredient entity) {
        return DishIngredientResDto.builder()
                .id(entity.getId())
                .status(entity.getStatus())
                .dishId(entity.getDish() != null ? entity.getDish().getId() : null)
                .dishName(entity.getDish() != null ? entity.getDish().getName() : null)
                .ingredientId(entity.getIngredient() != null ? entity.getIngredient().getId() : null)
                .ingredientName(entity.getIngredient() != null ? entity.getIngredient().getName() : null)
                .quantityRequired(entity.getQuantityRequired())
                .build();
    }

    @Override
    public DishIngredient mapToEntity(DishIngredientReqDto dto) {
        DishIngredient dishIngredient = new DishIngredient();
        dishIngredient.setStatus(dto.getStatus());
        dishIngredient.setQuantityRequired(dto.getQuantityRequired());

        if (dto.getDishId() != null) {
            try {
                Dish dish = dishService.findById(dto.getDishId()).orElse(null);
                if (dish == null) {
                    throw new IllegalArgumentException("Dish with ID " + dto.getDishId() + " not found");
                }
                dishIngredient.setDish(dish);
            } catch (Exception e) {
                throw new IllegalArgumentException("Dish with ID " + dto.getDishId() + " not found: " + e.getMessage());
            }
        } else {
            throw new IllegalArgumentException("Dish ID is required for creating a dish ingredient");
        }

        if (dto.getIngredientId() != null) {
            try {
                Ingredient ingredient = ingredientService.findById(dto.getIngredientId()).orElse(null);
                if (ingredient == null) {
                    throw new IllegalArgumentException("Ingredient with ID " + dto.getIngredientId() + " not found");
                }
                dishIngredient.setIngredient(ingredient);
            } catch (Exception e) {
                throw new IllegalArgumentException("Ingredient with ID " + dto.getIngredientId() + " not found: " + e.getMessage());
            }
        } else {
            throw new IllegalArgumentException("Ingredient ID is required for creating a dish ingredient");
        }

        return dishIngredient;
    }
}
