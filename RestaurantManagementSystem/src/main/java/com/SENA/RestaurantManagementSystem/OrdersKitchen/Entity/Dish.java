package com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity;

import java.math.BigDecimal;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "dish", schema = "orders_kitchen")
@Schema(name = "dish", description = "Entity representing menu dishes")
@Data
public class Dish extends AOrdersKitchenBaseEntity {
    @Column(name = "code", nullable = false, length = 10, unique = true)
    @Schema(description = "Unique dish code", example = "D001")
    private String code;

    @Column(name = "name", nullable = false, length = 100)
    @Schema(description = "Dish name", example = "Carbonara Pasta")
    private String name;

    @Column(name = "description", nullable = true, length = 255)
    @Schema(description = "Dish description", example = "Pasta with carbonara sauce")
    private String description;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    @Schema(description = "Dish price", example = "25.50")
    private BigDecimal price;

    @Column(name = "preparation_time", nullable = false)
    @Schema(description = "Preparation time in minutes", example = "20")
    private Integer preparationTime;

    @Column(name = "status", nullable = false)
    @Schema(description = "Dish availability status", example = "true")
    private Boolean status;
}