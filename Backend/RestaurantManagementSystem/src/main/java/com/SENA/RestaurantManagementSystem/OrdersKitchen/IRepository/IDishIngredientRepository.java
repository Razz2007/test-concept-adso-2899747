package com.SENA.RestaurantManagementSystem.OrdersKitchen.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.DishIngredient;

@Repository
public interface IDishIngredientRepository extends JpaRepository<DishIngredient, String>, IBaseRepositoryOrdersKitchen<DishIngredient, String> {

}
