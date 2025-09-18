package com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity;

import java.math.BigDecimal;

import com.SENA.RestaurantManagementSystem.Entity.ABaseCodedEntity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ingredient")
public class Ingredient extends ABaseCodedEntity {
    @Schema(description = "Nombre del ingrediente", example = "Tomate")
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Schema(description = "Unidad de medida", example = "kg")
    @Column(name = "unit", nullable = false, length = 10)
    private String unit;

    @Schema(description = "Stock actual", example = "50.00")
    @Column(name = "stock", nullable = false, precision = 10, scale = 2)
    private BigDecimal stock;

    @Schema(description = "Stock mínimo", example = "10.00")
    @Column(name = "min_stock", nullable = false, precision = 10, scale = 2)
    private BigDecimal minStock;

    @Schema(description = "Stock máximo", example = "100.00")
    @Column(name = "max_stock", nullable = false, precision = 10, scale = 2)
    private BigDecimal maxStock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public BigDecimal getMinStock() {
        return minStock;
    }

    public void setMinStock(BigDecimal minStock) {
        this.minStock = minStock;
    }

    public BigDecimal getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(BigDecimal maxStock) {
        this.maxStock = maxStock;
    }
}