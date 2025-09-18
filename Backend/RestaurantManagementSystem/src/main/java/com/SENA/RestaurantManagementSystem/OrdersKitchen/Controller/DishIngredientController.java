package com.SENA.RestaurantManagementSystem.OrdersKitchen.Controller;

import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.DishIngredient;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IService.IDishIngredientService;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.DishIngredientReqDto;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.DishIngredientResDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/dish-ingredient")
public class DishIngredientController extends ABaseControllerOrdersKitchen<DishIngredient, DishIngredientReqDto, DishIngredientResDto, IDishIngredientService> {

    public DishIngredientController(IDishIngredientService service) {
        super(service, "DishIngredient");
    }

}
