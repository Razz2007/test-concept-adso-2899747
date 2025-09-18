package com.SENA.RestaurantManagementSystem.Administration.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SENA.RestaurantManagementSystem.Administration.Entity.Supplier;
import com.SENA.RestaurantManagementSystem.Administration.IRepository.ISupplierRepository;
import com.SENA.RestaurantManagementSystem.IRepository.IBaseRepository;
import com.SENA.RestaurantManagementSystem.Service.ABaseService;

@Service
public class SupplierService extends ABaseService<Supplier> {

    @Autowired
    private ISupplierRepository repository;

    @Override
    protected IBaseRepository<Supplier, String> getRepository() {
        return repository;
    }
}