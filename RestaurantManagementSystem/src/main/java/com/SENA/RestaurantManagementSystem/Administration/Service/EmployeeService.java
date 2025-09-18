package com.SENA.RestaurantManagementSystem.Administration.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SENA.RestaurantManagementSystem.Administration.Entity.Employee;
import com.SENA.RestaurantManagementSystem.Administration.IRepository.IEmployeeRepository;
import com.SENA.RestaurantManagementSystem.IRepository.IBaseRepository;
import com.SENA.RestaurantManagementSystem.Service.ABaseService;

@Service
public class EmployeeService extends ABaseService<Employee> {

    @Autowired
    private IEmployeeRepository repository;

    @Override
    protected IBaseRepository<Employee, String> getRepository() {
        return repository;
    }
}