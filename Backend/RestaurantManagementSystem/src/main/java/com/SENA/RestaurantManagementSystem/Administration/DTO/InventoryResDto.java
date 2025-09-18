package com.SENA.RestaurantManagementSystem.Administration.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Schema(name = "InventoryDto", description = "DTO que representa el inventario")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InventoryResDto {
    @Schema(description = "ID único del inventario", example = "123e4567-e89b-12d3-a456-426614174000")
    private String id;

    @Schema(description = "ID del ingrediente", example = "123e4567-e89b-12d3-a456-426614174000")
    private String ingredientId;

    @Schema(description = "Nombre del ingrediente", example = "Tomate")
    private String ingredientName;

    @Schema(description = "Stock actual", example = "100.00")
    private BigDecimal currentStock;

    @Schema(description = "Última actualización", example = "2023-12-01T10:00:00")
    private LocalDateTime lastUpdated;

    @Schema(description = "Estado del inventario (activo/inactivo)", example = "true")
    private Boolean status;
}