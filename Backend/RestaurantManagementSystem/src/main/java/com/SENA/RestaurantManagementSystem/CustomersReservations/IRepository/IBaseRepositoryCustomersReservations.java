package com.SENA.RestaurantManagementSystem.CustomersReservations.IRepository;

import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.ABaseEntityCustomersReservationsBase;

import java.util.List;

public interface IBaseRepositoryCustomersReservations<T extends ABaseEntityCustomersReservationsBase> {
    List<T> findByStatusTrue();
}