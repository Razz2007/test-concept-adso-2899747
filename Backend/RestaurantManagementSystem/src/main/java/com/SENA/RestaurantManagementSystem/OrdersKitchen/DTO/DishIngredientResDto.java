package com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Schema(name = "DishIngredientDto", description = "DTO que representa la relación plato-ingrediente")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DishIngredientResDto {
    @Schema(description = "ID único de la relación", example = "123e4567-e89b-12d3-a456-426614174000")
    private String id;

    @Schema(description = "Estado de la relación (activo/inactivo)", example = "true")
    private Boolean status;

    @Schema(description = "ID del plato", example = "123e4567-e89b-12d3-a456-426614174000")
    private String dishId;

    @Schema(description = "Nombre del plato", example = "Pizza Margherita")
    private String dishName;

    @Schema(description = "ID del ingrediente", example = "123e4567-e89b-12d3-a456-426614174000")
    private String ingredientId;

    @Schema(description = "Nombre del ingrediente", example = "Tomate")
    private String ingredientName;

    @Schema(description = "Cantidad requerida", example = "0.5")
    private BigDecimal quantityRequired;
}
