package com.SENA.RestaurantManagementSystem.Administration.IRepository;

import com.SENA.RestaurantManagementSystem.Administration.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, String>, IBaseRepositoryAdministration<Employee> {
    List<Employee> findByStatusTrue();
}