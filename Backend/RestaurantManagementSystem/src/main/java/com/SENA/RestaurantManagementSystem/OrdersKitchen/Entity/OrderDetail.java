package com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity;

import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.ABaseEntityOrdersKitchenBase;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "order_detail", schema = "orders_kitchen")
@Schema(name="order_detail", description = "Entidad que representa un detalle de pedido")
public class OrderDetail extends ABaseEntityOrdersKitchenBase {

    @Schema(description = "Pedido al que pertenece")
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Schema(description = "Plato del detalle")
    @ManyToOne
    @JoinColumn(name = "dish_id", nullable = false)
    private Dish dish;

    @Schema(description = "Cantidad", example = "2")
    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Schema(description = "Precio", example = "25.00")
    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

}
