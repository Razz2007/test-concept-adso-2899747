package com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Schema(name = "OrderDetailDto", description = "DTO que representa un detalle de pedido")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailReqDto {
    @Schema(description = "Estado del detalle (activo/inactivo)", example = "true")
    private Boolean status;

    @Schema(description = "ID del pedido", example = "123e4567-e89b-12d3-a456-426614174000")
    private String orderId;

    @Schema(description = "ID del plato", example = "123e4567-e89b-12d3-a456-426614174000")
    private String dishId;

    @Schema(description = "Cantidad", example = "2")
    private Integer quantity;

    @Schema(description = "Precio", example = "25.00")
    private BigDecimal price;
}
