package com.SENA.RestaurantManagementSystem.CustomersReservations.Controller;

import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.TableEntity;
import com.SENA.RestaurantManagementSystem.CustomersReservations.IService.ITableService;
import com.SENA.RestaurantManagementSystem.CustomersReservations.DTO.TableReqDto;
import com.SENA.RestaurantManagementSystem.CustomersReservations.DTO.TableResDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/table")
public class TableController extends ABaseControllerCustomersReservations<TableEntity, TableReqDto, TableResDto, ITableService> {

    public TableController(ITableService service) {
        super(service, "Table");
    }

}