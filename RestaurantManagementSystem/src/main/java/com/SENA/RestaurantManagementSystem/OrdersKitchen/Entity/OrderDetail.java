package com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity;

import java.math.BigDecimal;

import com.SENA.RestaurantManagementSystem.Entity.ABaseEntity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_detail")
public class OrderDetail extends ABaseEntity {
    @Schema(description = "ID del pedido", example = "uuid-del-pedido")
    @Column(name = "order_id", nullable = false, length = 36)
    private String orderId;

    @Schema(description = "ID del plato", example = "uuid-del-plato")
    @Column(name = "dish_id", nullable = false, length = 36)
    private String dishId;

    @Schema(description = "Cantidad", example = "2")
    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Schema(description = "Precio", example = "25.00")
    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDishId() {
        return dishId;
    }

    public void setDishId(String dishId) {
        this.dishId = dishId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}