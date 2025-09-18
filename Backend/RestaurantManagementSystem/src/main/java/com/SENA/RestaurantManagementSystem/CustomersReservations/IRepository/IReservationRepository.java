package com.SENA.RestaurantManagementSystem.CustomersReservations.IRepository;

import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation, String>, IBaseRepositoryCustomersReservations<Reservation> {
    List<Reservation> findByStatusTrue();
}