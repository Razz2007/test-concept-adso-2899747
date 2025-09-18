package com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Schema(name = "OrderDto", description = "DTO que representa un pedido")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderReqDto {
    @Schema(description = "Código del pedido", example = "ORD001")
    private String code;

    @Schema(description = "Nombre del pedido", example = "Pedido 1")
    private String name;

    @Schema(description = "Descripción del pedido", example = "Pedido para mesa 5")
    private String description;

    @Schema(description = "Estado del pedido (activo/inactivo)", example = "true")
    private Boolean status;

    @Schema(description = "ID del cliente", example = "123e4567-e89b-12d3-a456-426614174000")
    private String customerId;

    @Schema(description = "ID de la mesa", example = "123e4567-e89b-12d3-a456-426614174000")
    private String tableId;

    @Schema(description = "Fecha del pedido", example = "2023-12-25")
    private LocalDate orderDate;

    @Schema(description = "Estado del pedido", example = "PENDING")
    private String orderStatus;

    @Schema(description = "Total del pedido", example = "150.00")
    private BigDecimal total;
}
