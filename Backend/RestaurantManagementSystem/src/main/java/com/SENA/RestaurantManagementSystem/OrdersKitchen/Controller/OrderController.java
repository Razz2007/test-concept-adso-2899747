package com.SENA.RestaurantManagementSystem.OrdersKitchen.Controller;

import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.Order;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IService.IOrderService;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.OrderReqDto;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.OrderResDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/order")
public class OrderController extends ABaseControllerOrdersKitchen<Order, OrderReqDto, OrderResDto, IOrderService> {

    public OrderController(IOrderService service) {
        super(service, "Order");
    }

}
