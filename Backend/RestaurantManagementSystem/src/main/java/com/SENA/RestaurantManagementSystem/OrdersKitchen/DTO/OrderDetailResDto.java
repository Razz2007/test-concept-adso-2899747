package com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Schema(name = "OrderDetailDto", description = "DTO que representa un detalle de pedido")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDetailResDto {
    @Schema(description = "ID único del detalle", example = "123e4567-e89b-12d3-a456-426614174000")
    private String id;

    @Schema(description = "Estado del detalle (activo/inactivo)", example = "true")
    private Boolean status;

    @Schema(description = "ID del pedido", example = "123e4567-e89b-12d3-a456-426614174000")
    private String orderId;

    @Schema(description = "Nombre del pedido", example = "Pedido 1")
    private String orderName;

    @Schema(description = "ID del plato", example = "123e4567-e89b-12d3-a456-426614174000")
    private String dishId;

    @Schema(description = "Nombre del plato", example = "Pizza Margherita")
    private String dishName;

    @Schema(description = "Cantidad", example = "2")
    private Integer quantity;

    @Schema(description = "Precio", example = "25.00")
    private BigDecimal price;
}
