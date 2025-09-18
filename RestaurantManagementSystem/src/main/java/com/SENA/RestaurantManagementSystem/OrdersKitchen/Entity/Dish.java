package com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity;

import java.math.BigDecimal;

import com.SENA.RestaurantManagementSystem.Entity.ABaseNamedEntity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "dish")
public class Dish extends ABaseNamedEntity {
    @Schema(description = "Precio del plato", example = "15.50")
    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Schema(description = "Tiempo de preparación en minutos", example = "30")
    @Column(name = "preparation_time", nullable = false)
    private Integer preparationTime;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(Integer preparationTime) {
        this.preparationTime = preparationTime;
    }
}