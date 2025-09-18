package com.SENA.RestaurantManagementSystem.Administration.Entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "inventory", schema = "administration")
@Schema(name = "inventory", description = "Entity representing inventory items")
@Data
public class Inventory extends AAdministrationBaseEntity {
    @Column(name = "ingredient_id", nullable = false, length = 36)
    @Schema(description = "Ingredient ID in inventory", example = "uuid-string")
    private String ingredientId;

    @Column(name = "current_stock", nullable = false, precision = 10, scale = 2)
    @Schema(description = "Current stock quantity", example = "50.00")
    private BigDecimal currentStock;

    @Column(name = "last_updated", nullable = false)
    @Schema(description = "Last update timestamp", example = "2023-12-01T10:00:00")
    private LocalDateTime lastUpdated;
}