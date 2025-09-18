package com.SENA.RestaurantManagementSystem.OrdersKitchen.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.Ingredient;

@Repository
public interface IIngredientRepository extends JpaRepository<Ingredient, String>, IBaseRepositoryOrdersKitchen<Ingredient, String> {

}
