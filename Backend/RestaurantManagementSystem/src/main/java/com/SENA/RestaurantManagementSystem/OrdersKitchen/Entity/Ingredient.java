package com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity;

import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.ABaseEntityOrdersKitchenBase;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "ingredient", schema = "orders_kitchen")
@Schema(name="ingredient", description = "Entidad que representa un ingrediente")
public class Ingredient extends ABaseEntityOrdersKitchenBase {

    @Schema(description = "Unidad de medida", example = "kg")
    @Column(name = "unit", nullable = false, length = 10)
    private String unit;

    @Schema(description = "Stock actual", example = "100.00")
    @Column(name = "stock", nullable = false, precision = 10, scale = 2)
    private BigDecimal stock;

    @Schema(description = "Stock mínimo", example = "10.00")
    @Column(name = "min_stock", nullable = false, precision = 10, scale = 2)
    private BigDecimal minStock;

    @Schema(description = "Stock máximo", example = "200.00")
    @Column(name = "max_stock", nullable = false, precision = 10, scale = 2)
    private BigDecimal maxStock;

}
