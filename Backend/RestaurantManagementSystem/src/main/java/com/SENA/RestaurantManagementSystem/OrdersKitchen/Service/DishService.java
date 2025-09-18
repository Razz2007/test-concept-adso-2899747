package com.SENA.RestaurantManagementSystem.OrdersKitchen.Service;

import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.Dish;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IRepository.IBaseRepositoryOrdersKitchen;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IRepository.IDishRepository;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IService.IDishService;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.DishReqDto;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.DishResDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DishService extends ABaseServiceOrdersKitchen<Dish, DishReqDto, DishResDto> implements IDishService {
    @Override
    protected IBaseRepositoryOrdersKitchen<Dish, String> getRepository() {
        return repository;
    }

    @Autowired
    private IDishRepository repository;

    @Override
    public DishResDto mapToResDto(Dish entity) {
        return DishResDto.builder()
                .id(entity.getId())
                .code(entity.getCode())
                .name(entity.getName())
                .description(entity.getDescription())
                .status(entity.getStatus())
                .price(entity.getPrice())
                .preparationTime(entity.getPreparationTime())
                .build();
    }

    @Override
    public Dish mapToEntity(DishReqDto dto) {
        Dish dish = new Dish();
        dish.setCode(dto.getCode());
        dish.setName(dto.getName());
        dish.setDescription(dto.getDescription());
        dish.setStatus(dto.getStatus());
        dish.setPrice(dto.getPrice());
        dish.setPreparationTime(dto.getPreparationTime());

        return dish;
    }
}
