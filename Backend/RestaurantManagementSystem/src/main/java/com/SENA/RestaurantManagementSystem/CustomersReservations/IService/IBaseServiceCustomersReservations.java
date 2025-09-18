package com.SENA.RestaurantManagementSystem.CustomersReservations.IService;

import java.util.List;
import java.util.Optional;

public interface IBaseServiceCustomersReservations<T, DReq, DRes> {
    List<T> findAll();
    Optional<T> findById(String id);
    T save(T entity);
    void update(String id, T entity);
    void delete(String id);
    T mapToEntity(DReq dto);
    DRes mapToResDto(T entity);
}