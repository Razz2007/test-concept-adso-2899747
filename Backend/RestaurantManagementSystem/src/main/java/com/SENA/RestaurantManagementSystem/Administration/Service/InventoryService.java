package com.SENA.RestaurantManagementSystem.Administration.Service;

import com.SENA.RestaurantManagementSystem.Administration.Entity.Inventory;
import com.SENA.RestaurantManagementSystem.Administration.IRepository.IInventoryRepository;
import com.SENA.RestaurantManagementSystem.Administration.IService.IInventoryService;
import com.SENA.RestaurantManagementSystem.Administration.DTO.InventoryReqDto;
import com.SENA.RestaurantManagementSystem.Administration.DTO.InventoryResDto;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.Ingredient;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IService.IIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService extends ABaseServiceAdministration<Inventory, InventoryReqDto, InventoryResDto, IInventoryRepository> implements IInventoryService {

    @Autowired
    private IIngredientService ingredientService;

    @Override
    public Inventory mapToEntity(InventoryReqDto dto) {
        Inventory entity = new Inventory();

        if (dto.getIngredientId() != null) {
            try {
                Ingredient ingredient = ingredientService.findById(dto.getIngredientId()).orElse(null);
                if (ingredient == null) {
                    throw new IllegalArgumentException("Ingredient with ID " + dto.getIngredientId() + " not found");
                }
                entity.setIngredient(ingredient);
            } catch (Exception e) {
                throw new IllegalArgumentException("Ingredient with ID " + dto.getIngredientId() + " not found: " + e.getMessage());
            }
        } else {
            throw new IllegalArgumentException("Ingredient ID is required for creating inventory");
        }

        entity.setCurrentStock(dto.getCurrentStock());
        entity.setLastUpdated(dto.getLastUpdated());
        entity.setStatus(dto.getStatus());
        return entity;
    }

    @Override
    public InventoryResDto mapToResDto(Inventory entity) {
        return InventoryResDto.builder()
                .id(entity.getId())
                .ingredientId(entity.getIngredient().getId())
                .ingredientName(entity.getIngredient().getName())
                .currentStock(entity.getCurrentStock())
                .lastUpdated(entity.getLastUpdated())
                .status(entity.getStatus())
                .build();
    }
}