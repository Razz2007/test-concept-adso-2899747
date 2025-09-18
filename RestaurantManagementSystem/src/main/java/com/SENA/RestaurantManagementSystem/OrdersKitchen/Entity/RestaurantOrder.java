package com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.SENA.RestaurantManagementSystem.Entity.ABaseCodedEntity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurant_order")
public class RestaurantOrder extends ABaseCodedEntity {
    @Schema(description = "ID del cliente", example = "uuid-del-cliente")
    @Column(name = "customer_id", nullable = false, length = 36)
    private String customerId;

    @Schema(description = "ID de la mesa", example = "uuid-de-la-mesa")
    @Column(name = "table_id", nullable = false, length = 36)
    private String tableId;

    @Schema(description = "Fecha del pedido", example = "2023-12-25")
    @Column(name = "order_date", nullable = false)
    private LocalDate orderDate;

    @Schema(description = "Estado del pedido", example = "PENDING")
    @Column(name = "order_status", nullable = false, length = 20)
    private String orderStatus;

    @Schema(description = "Total del pedido", example = "150.00")
    @Column(name = "total", nullable = false, precision = 10, scale = 2)
    private BigDecimal total;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}