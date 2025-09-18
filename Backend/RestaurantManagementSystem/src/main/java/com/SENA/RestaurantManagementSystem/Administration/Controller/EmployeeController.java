package com.SENA.RestaurantManagementSystem.Administration.Controller;

import com.SENA.RestaurantManagementSystem.Administration.Entity.Employee;
import com.SENA.RestaurantManagementSystem.Administration.IService.IEmployeeService;
import com.SENA.RestaurantManagementSystem.Administration.DTO.EmployeeReqDto;
import com.SENA.RestaurantManagementSystem.Administration.DTO.EmployeeResDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/employee")
public class EmployeeController extends ABaseControllerAdministration<Employee, EmployeeReqDto, EmployeeResDto, IEmployeeService> {

    public EmployeeController(IEmployeeService service) {
        super(service, "Employee");
    }

}