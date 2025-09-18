package com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity;

import java.math.BigDecimal;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ingredient", schema = "orders_kitchen")
@Schema(name = "ingredient", description = "Entity representing ingredients")
@Data
public class Ingredient extends AOrdersKitchenBaseEntity {
    @Column(name = "code", nullable = false, length = 10, unique = true)
    @Schema(description = "Unique ingredient code", example = "I001")
    private String code;

    @Column(name = "name", nullable = false, length = 100)
    @Schema(description = "Ingredient name", example = "Tomato")
    private String name;

    @Column(name = "unit", nullable = false, length = 20)
    @Schema(description = "Unit of measurement", example = "kg")
    private String unit;

    @Column(name = "stock", nullable = false, precision = 10, scale = 2)
    @Schema(description = "Current stock", example = "50.00")
    private BigDecimal stock;

    @Column(name = "min_stock", nullable = false, precision = 10, scale = 2)
    @Schema(description = "Minimum stock", example = "10.00")
    private BigDecimal minStock;

    @Column(name = "max_stock", nullable = false, precision = 10, scale = 2)
    @Schema(description = "Maximum stock", example = "100.00")
    private BigDecimal maxStock;
}