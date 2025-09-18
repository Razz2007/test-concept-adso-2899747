package com.SENA.RestaurantManagementSystem.OrdersKitchen.Controller;

import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.OrderDetail;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IService.IOrderDetailService;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.OrderDetailReqDto;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.OrderDetailResDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/order-detail")
public class OrderDetailController extends ABaseControllerOrdersKitchen<OrderDetail, OrderDetailReqDto, OrderDetailResDto, IOrderDetailService> {

    public OrderDetailController(IOrderDetailService service) {
        super(service, "OrderDetail");
    }

}
