package com.SENA.RestaurantManagementSystem.Administration.IRepository;

import com.SENA.RestaurantManagementSystem.Administration.Entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IInventoryRepository extends JpaRepository<Inventory, String>, IBaseRepositoryAdministration<Inventory> {
    List<Inventory> findByStatusTrue();
}