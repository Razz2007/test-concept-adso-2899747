package com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Schema(name = "IngredientDto", description = "DTO que representa un ingrediente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientReqDto {
    @Schema(description = "Código del ingrediente", example = "ING001")
    private String code;

    @Schema(description = "Nombre del ingrediente", example = "Tomate")
    private String name;

    @Schema(description = "Descripción del ingrediente", example = "Tomate fresco")
    private String description;

    @Schema(description = "Estado del ingrediente (activo/inactivo)", example = "true")
    private Boolean status;

    @Schema(description = "Unidad de medida", example = "kg")
    private String unit;

    @Schema(description = "Stock actual", example = "100.00")
    private BigDecimal stock;

    @Schema(description = "Stock mínimo", example = "10.00")
    private BigDecimal minStock;

    @Schema(description = "Stock máximo", example = "200.00")
    private BigDecimal maxStock;
}
