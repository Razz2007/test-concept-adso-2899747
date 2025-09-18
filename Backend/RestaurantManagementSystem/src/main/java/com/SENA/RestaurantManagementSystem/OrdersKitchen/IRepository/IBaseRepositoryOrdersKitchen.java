package com.SENA.RestaurantManagementSystem.OrdersKitchen.IRepository;

import java.util.List;
import java.util.Optional;

import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.ABaseEntityOrdersKitchenBase;

public interface IBaseRepositoryOrdersKitchen<T extends ABaseEntityOrdersKitchenBase, ID> {

    Optional<T> findById(String id);
    // Métodos comunes para repositorios

    List<T> findAll();

    T save(T entity);
}
