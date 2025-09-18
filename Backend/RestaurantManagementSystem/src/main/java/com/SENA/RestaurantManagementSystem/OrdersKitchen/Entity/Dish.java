package com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity;

import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.ABaseEntityOrdersKitchenBase;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "dish", schema = "orders_kitchen")
@Schema(name="dish", description = "Entidad que representa un plato")
public class Dish extends ABaseEntityOrdersKitchenBase {

    @Schema(description = "Precio del plato", example = "15.00")
    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Schema(description = "Tiempo de preparación", example = "00:30:00")
    @Column(name = "preparation_time", nullable = false)
    private LocalTime preparationTime;

}
