package com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.SENA.RestaurantManagementSystem.ClientReservations.Entity.Client;
import com.SENA.RestaurantManagementSystem.ClientReservations.Entity.RestaurantTable;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "order_table", schema = "orders_kitchen")
@Schema(name = "order", description = "Entity representing orders")
@Data
public class Order extends AOrdersKitchenBaseEntity {
    @Column(name = "code", nullable = false, length = 10, unique = true)
    @Schema(description = "Unique order code", example = "O001")
    private String code;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    @Schema(description = "Client making the order")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "table_id", nullable = false)
    @Schema(description = "Table for the order")
    private RestaurantTable table;

    @Column(name = "order_date", nullable = false)
    @Schema(description = "Order date", example = "2023-12-25T19:00:00")
    private LocalDateTime orderDate;

    @Column(name = "order_status", nullable = false, length = 20)
    @Schema(description = "Order status", example = "PENDING")
    private String orderStatus;

    @Column(name = "total", nullable = false, precision = 10, scale = 2)
    @Schema(description = "Order total", example = "150.50")
    private BigDecimal total;
}