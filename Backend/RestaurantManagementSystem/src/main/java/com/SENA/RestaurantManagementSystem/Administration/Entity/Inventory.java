package com.SENA.RestaurantManagementSystem.Administration.Entity;

import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.ABaseEntityAudit;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.Ingredient;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "inventory", schema = "administration")
@Schema(name="inventory", description = "Entidad que representa el inventario")
public class Inventory extends ABaseEntityAudit {

    @Schema(description = "Ingrediente")
    @ManyToOne
    @JoinColumn(name = "ingredient_id", nullable = false)
    private Ingredient ingredient;

    @Schema(description = "Stock actual", example = "100.00")
    @Column(name = "current_stock", nullable = false, precision = 10, scale = 2)
    private BigDecimal currentStock;

    @Schema(description = "Última actualización", example = "2023-12-01T10:00:00")
    @Column(name = "last_updated", nullable = false)
    private LocalDateTime lastUpdated;

}