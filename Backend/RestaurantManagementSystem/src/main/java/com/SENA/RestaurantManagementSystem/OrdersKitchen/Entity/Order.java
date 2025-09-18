package com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity;

import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.ABaseEntityOrdersKitchenBase;
import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.Customer;
import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.TableEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "restaurant_order", schema = "orders_kitchen")
@Schema(name="restaurant_order", description = "Entidad que representa un pedido")
public class Order extends ABaseEntityOrdersKitchenBase {

    @Schema(description = "Cliente que hace el pedido")
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Schema(description = "Mesa del pedido")
    @ManyToOne
    @JoinColumn(name = "table_id", nullable = false)
    private TableEntity table;

    @Schema(description = "Fecha del pedido", example = "2023-12-25")
    @Column(name = "order_date", nullable = false)
    private LocalDate orderDate;

    @Schema(description = "Estado del pedido", example = "PENDING")
    @Column(name = "order_status", nullable = false, length = 20)
    private String orderStatus;

    @Schema(description = "Total del pedido", example = "150.00")
    @Column(name = "total", nullable = false, precision = 10, scale = 2)
    private BigDecimal total;

}
