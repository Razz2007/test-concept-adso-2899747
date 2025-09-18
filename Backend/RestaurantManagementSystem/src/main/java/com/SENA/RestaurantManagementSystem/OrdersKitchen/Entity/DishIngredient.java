package com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity;

import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.ABaseEntityOrdersKitchenBase;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "dish_ingredient", schema = "orders_kitchen")
@Schema(name="dish_ingredient", description = "Entidad que representa la relación plato-ingrediente")
public class DishIngredient extends ABaseEntityOrdersKitchenBase {

    @Schema(description = "Plato")
    @ManyToOne
    @JoinColumn(name = "dish_id", nullable = false)
    private Dish dish;

    @Schema(description = "Ingrediente")
    @ManyToOne
    @JoinColumn(name = "ingredient_id", nullable = false)
    private Ingredient ingredient;

    @Schema(description = "Cantidad requerida", example = "0.5")
    @Column(name = "quantity_required", nullable = false, precision = 10, scale = 2)
    private BigDecimal quantityRequired;

}
