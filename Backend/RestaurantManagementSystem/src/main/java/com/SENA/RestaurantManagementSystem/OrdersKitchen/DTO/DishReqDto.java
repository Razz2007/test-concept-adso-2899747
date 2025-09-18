package com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalTime;

@Schema(name = "DishDto", description = "DTO que representa un plato")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DishReqDto {
    @Schema(description = "Código del plato", example = "DISH001")
    private String code;

    @Schema(description = "Nombre del plato", example = "Pizza Margherita")
    private String name;

    @Schema(description = "Descripción del plato", example = "Pizza clásica con tomate y mozzarella")
    private String description;

    @Schema(description = "Estado del plato (activo/inactivo)", example = "true")
    private Boolean status;

    @Schema(description = "Precio del plato", example = "15.00")
    private BigDecimal price;

    @Schema(description = "Tiempo de preparación", example = "00:30:00")
    private LocalTime preparationTime;
}
