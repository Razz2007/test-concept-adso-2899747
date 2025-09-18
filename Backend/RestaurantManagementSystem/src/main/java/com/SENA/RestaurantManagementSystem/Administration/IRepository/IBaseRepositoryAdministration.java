package com.SENA.RestaurantManagementSystem.Administration.IRepository;

import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.ABaseEntityAudit;

import java.util.List;
import java.util.Optional;

public interface IBaseRepositoryAdministration<T extends ABaseEntityAudit> {
    List<T> findByStatusTrue();

    Optional<T> findById(String id);

    <T extends ABaseEntityAudit> T save(T entity);
}