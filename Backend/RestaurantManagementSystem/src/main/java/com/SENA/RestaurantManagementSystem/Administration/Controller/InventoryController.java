package com.SENA.RestaurantManagementSystem.Administration.Controller;

import com.SENA.RestaurantManagementSystem.Administration.Entity.Inventory;
import com.SENA.RestaurantManagementSystem.Administration.IService.IInventoryService;
import com.SENA.RestaurantManagementSystem.Administration.DTO.InventoryReqDto;
import com.SENA.RestaurantManagementSystem.Administration.DTO.InventoryResDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/inventory")
public class InventoryController extends ABaseControllerAdministration<Inventory, InventoryReqDto, InventoryResDto, IInventoryService> {

    public InventoryController(IInventoryService service) {
        super(service, "Inventory");
    }

}