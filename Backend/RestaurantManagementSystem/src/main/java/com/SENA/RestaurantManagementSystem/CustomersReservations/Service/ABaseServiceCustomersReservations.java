package com.SENA.RestaurantManagementSystem.CustomersReservations.Service;

import com.SENA.RestaurantManagementSystem.CustomersReservations.IService.IBaseServiceCustomersReservations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public abstract class ABaseServiceCustomersReservations<T, DReq, DRes, R extends JpaRepository<T, String>> implements IBaseServiceCustomersReservations<T, DReq, DRes> {

    @Autowired
    protected R repository;

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<T> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public void update(String id, T entity) {
        repository.save(entity);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public abstract T mapToEntity(DReq dto);

    @Override
    public abstract DRes mapToResDto(T entity);
}