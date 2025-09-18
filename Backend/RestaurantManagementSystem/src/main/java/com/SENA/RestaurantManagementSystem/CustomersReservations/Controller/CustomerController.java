package com.SENA.RestaurantManagementSystem.CustomersReservations.Controller;

import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.Customer;
import com.SENA.RestaurantManagementSystem.CustomersReservations.IService.ICustomerService;
import com.SENA.RestaurantManagementSystem.CustomersReservations.DTO.CustomerReqDto;
import com.SENA.RestaurantManagementSystem.CustomersReservations.DTO.CustomerResDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/customer")
public class CustomerController extends ABaseControllerCustomersReservations<Customer, CustomerReqDto, CustomerResDto, ICustomerService> {

    public CustomerController(ICustomerService service) {
        super(service, "Customer");
    }

}