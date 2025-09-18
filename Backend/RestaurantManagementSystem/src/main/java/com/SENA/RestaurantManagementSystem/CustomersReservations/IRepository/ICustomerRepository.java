package com.SENA.RestaurantManagementSystem.CustomersReservations.IRepository;

import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, String> {
    List<Customer> findByStatusTrue();
}