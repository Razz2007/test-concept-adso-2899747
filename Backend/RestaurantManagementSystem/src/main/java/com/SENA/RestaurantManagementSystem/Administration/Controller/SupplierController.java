package com.SENA.RestaurantManagementSystem.Administration.Controller;

import com.SENA.RestaurantManagementSystem.Administration.Entity.Supplier;
import com.SENA.RestaurantManagementSystem.Administration.IService.ISupplierService;
import com.SENA.RestaurantManagementSystem.Administration.DTO.SupplierReqDto;
import com.SENA.RestaurantManagementSystem.Administration.DTO.SupplierResDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/supplier")
public class SupplierController extends ABaseControllerAdministration<Supplier, SupplierReqDto, SupplierResDto, ISupplierService> {

    public SupplierController(ISupplierService service) {
        super(service, "Supplier");
    }

}