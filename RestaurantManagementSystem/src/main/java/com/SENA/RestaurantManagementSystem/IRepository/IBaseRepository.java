package com.SENA.RestaurantManagementSystem.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SENA.RestaurantManagementSystem.Entity.ABaseEntity;

public interface IBaseRepository<T extends ABaseEntity, ID> extends JpaRepository<T, ID> {
    // Métodos comunes para repositorios
}