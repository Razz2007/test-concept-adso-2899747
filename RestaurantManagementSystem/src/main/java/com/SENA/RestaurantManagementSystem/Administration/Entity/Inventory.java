package com.SENA.RestaurantManagementSystem.Administration.Entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.SENA.RestaurantManagementSystem.Entity.ABaseEntity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory extends ABaseEntity {
    @Schema(description = "ID del ingrediente", example = "uuid-del-ingrediente")
    @Column(name = "ingredient_id", nullable = false, length = 36)
    private String ingredientId;

    @Schema(description = "Stock actual", example = "100.50")
    @Column(name = "current_stock", nullable = false, precision = 10, scale = 2)
    private BigDecimal currentStock;

    @Schema(description = "Última actualización del stock", example = "2023-01-01T10:00:00")
    @Column(name = "last_updated", nullable = false)
    private LocalDateTime lastUpdated;

    public String getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(String ingredientId) {
        this.ingredientId = ingredientId;
    }

    public BigDecimal getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(BigDecimal currentStock) {
        this.currentStock = currentStock;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}