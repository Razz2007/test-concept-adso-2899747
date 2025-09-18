package com.SENA.RestaurantManagementSystem.OrdersKitchen.Controller;

import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.Dish;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IService.IDishService;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.DishReqDto;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.DishResDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/dish")
public class DishController extends ABaseControllerOrdersKitchen<Dish, DishReqDto, DishResDto, IDishService> {

    public DishController(IDishService service) {
        super(service, "Dish");
    }

}
