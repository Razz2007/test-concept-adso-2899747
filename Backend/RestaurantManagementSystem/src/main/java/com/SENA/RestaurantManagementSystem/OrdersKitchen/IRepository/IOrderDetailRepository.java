package com.SENA.RestaurantManagementSystem.OrdersKitchen.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.OrderDetail;

@Repository
public interface IOrderDetailRepository extends JpaRepository<OrderDetail, String>, IBaseRepositoryOrdersKitchen<OrderDetail, String> {

}
