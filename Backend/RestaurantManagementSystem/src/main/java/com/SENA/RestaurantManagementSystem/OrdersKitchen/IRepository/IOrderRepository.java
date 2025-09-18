package com.SENA.RestaurantManagementSystem.OrdersKitchen.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.Order;

@Repository
public interface IOrderRepository extends JpaRepository<Order, String>, IBaseRepositoryOrdersKitchen<Order, String> {

}
