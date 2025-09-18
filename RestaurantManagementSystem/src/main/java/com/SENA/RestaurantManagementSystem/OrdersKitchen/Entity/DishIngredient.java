package com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity;

import java.math.BigDecimal;

import com.SENA.RestaurantManagementSystem.Entity.ABaseEntity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "dish_ingredient")
public class DishIngredient extends ABaseEntity {
    @Schema(description = "ID del plato", example = "uuid-del-plato")
    @Column(name = "dish_id", nullable = false, length = 36)
    private String dishId;

    @Schema(description = "ID del ingrediente", example = "uuid-del-ingrediente")
    @Column(name = "ingredient_id", nullable = false, length = 36)
    private String ingredientId;

    @Schema(description = "Cantidad requerida", example = "0.5")
    @Column(name = "quantity_required", nullable = false, precision = 10, scale = 2)
    private BigDecimal quantityRequired;

    public String getDishId() {
        return dishId;
    }

    public void setDishId(String dishId) {
        this.dishId = dishId;
    }

    public String getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(String ingredientId) {
        this.ingredientId = ingredientId;
    }

    public BigDecimal getQuantityRequired() {
        return quantityRequired;
    }

    public void setQuantityRequired(BigDecimal quantityRequired) {
        this.quantityRequired = quantityRequired;
    }
}