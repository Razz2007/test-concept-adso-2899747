package com.SENA.RestaurantManagementSystem.CustomersReservations.IRepository;

import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.TableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITableRepository extends JpaRepository<TableEntity, String>, IBaseRepositoryCustomersReservations<TableEntity> {
    List<TableEntity> findByStatusTrue();
}