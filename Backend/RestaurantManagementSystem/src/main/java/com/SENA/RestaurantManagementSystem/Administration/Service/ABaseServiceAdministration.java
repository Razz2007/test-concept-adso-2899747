package com.SENA.RestaurantManagementSystem.Administration.Service;

import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.ABaseEntityAudit;
import com.SENA.RestaurantManagementSystem.Administration.IRepository.IBaseRepositoryAdministration;
import com.SENA.RestaurantManagementSystem.Administration.IService.IBaseServiceAdministration;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public abstract class ABaseServiceAdministration<T extends ABaseEntityAudit, DReq, DRes, R extends IBaseRepositoryAdministration<T>> implements IBaseServiceAdministration<T, DReq, DRes> {

    @Autowired
    protected R repository;

    @Override
    public List<T> findAll() {
        return repository.findByStatusTrue();
    }

    @Override
    public Optional<T> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public T save(T entity) {
        entity.setCreatedAt(LocalDateTime.now());
        entity.setCreatedBy("system");
        return repository.save(entity);
    }

    @Override
    public void update(String id, T entity) {
        entity.setId(id);
        entity.setUpdatedAt(LocalDateTime.now());
        entity.setUpdatedBy("system");
        repository.save(entity);
    }

    @Override
    public void delete(String id) {
        Optional<T> entity = repository.findById(id);
        if (entity.isPresent()) {
            T deleteEntity = entity.get();
            deleteEntity.setDeletedAt(LocalDateTime.now());
            deleteEntity.setDeletedBy("system");
            repository.save(deleteEntity);
        }
    }

    @Override
    public abstract T mapToEntity(DReq dto);

    @Override
    public abstract DRes mapToResDto(T entity);
}