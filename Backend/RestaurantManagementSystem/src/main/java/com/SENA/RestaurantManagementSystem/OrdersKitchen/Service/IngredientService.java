package com.SENA.RestaurantManagementSystem.OrdersKitchen.Service;

import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.Ingredient;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IRepository.IBaseRepositoryOrdersKitchen;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IRepository.IIngredientRepository;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IService.IIngredientService;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.IngredientReqDto;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.IngredientResDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService extends ABaseServiceOrdersKitchen<Ingredient, IngredientReqDto, IngredientResDto> implements IIngredientService {
    @Override
    protected IBaseRepositoryOrdersKitchen<Ingredient, String> getRepository() {
        return repository;
    }

    @Autowired
    private IIngredientRepository repository;

    @Override
    public IngredientResDto mapToResDto(Ingredient entity) {
        return IngredientResDto.builder()
                .id(entity.getId())
                .code(entity.getCode())
                .name(entity.getName())
                .description(entity.getDescription())
                .status(entity.getStatus())
                .unit(entity.getUnit())
                .stock(entity.getStock())
                .minStock(entity.getMinStock())
                .maxStock(entity.getMaxStock())
                .build();
    }

    @Override
    public Ingredient mapToEntity(IngredientReqDto dto) {
        Ingredient ingredient = new Ingredient();
        ingredient.setCode(dto.getCode());
        ingredient.setName(dto.getName());
        ingredient.setDescription(dto.getDescription());
        ingredient.setStatus(dto.getStatus());
        ingredient.setUnit(dto.getUnit());
        ingredient.setStock(dto.getStock());
        ingredient.setMinStock(dto.getMinStock());
        ingredient.setMaxStock(dto.getMaxStock());

        return ingredient;
    }
}
