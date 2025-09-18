package com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(name = "OrderResDto", description = "Order response DTO")
@Data
public class OrderResDto {
    @Schema(description = "Order ID", example = "uuid-string")
    private String id;

    @Schema(description = "Unique order code", example = "O001")
    private String code;

    @Schema(description = "Client ID", example = "uuid-string")
    private String clientId;

    @Schema(description = "Table ID", example = "uuid-string")
    private String tableId;

    @Schema(description = "Order date", example = "2023-12-25T19:00:00")
    private LocalDateTime orderDate;

    @Schema(description = "Order status", example = "PENDING")
    private String orderStatus;

    @Schema(description = "Order total", example = "150.50")
    private BigDecimal total;

    @Schema(description = "Record status", example = "true")
    private Boolean status;

    @Schema(description = "Creation date", example = "2023-01-01T10:00:00")
    private LocalDateTime createdAt;

    @Schema(description = "Created by user", example = "admin")
    private String createdBy;
}