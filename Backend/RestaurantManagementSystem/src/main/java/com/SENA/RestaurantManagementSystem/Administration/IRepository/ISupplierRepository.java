package com.SENA.RestaurantManagementSystem.Administration.IRepository;

import com.SENA.RestaurantManagementSystem.Administration.Entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISupplierRepository extends JpaRepository<Supplier, String>, IBaseRepositoryAdministration<Supplier> {
    List<Supplier> findByStatusTrue();
}