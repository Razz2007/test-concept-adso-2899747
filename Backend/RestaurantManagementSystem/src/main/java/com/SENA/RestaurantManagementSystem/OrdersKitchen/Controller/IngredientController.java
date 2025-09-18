package com.SENA.RestaurantManagementSystem.OrdersKitchen.Controller;

import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.Ingredient;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IService.IIngredientService;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.IngredientReqDto;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.IngredientResDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/ingredient")
public class IngredientController extends ABaseControllerOrdersKitchen<Ingredient, IngredientReqDto, IngredientResDto, IIngredientService> {

    public IngredientController(IIngredientService service) {
        super(service, "Ingredient");
    }

}
