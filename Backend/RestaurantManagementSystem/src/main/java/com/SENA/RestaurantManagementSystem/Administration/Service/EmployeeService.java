package com.SENA.RestaurantManagementSystem.Administration.Service;

import com.SENA.RestaurantManagementSystem.Administration.Entity.Employee;
import com.SENA.RestaurantManagementSystem.Administration.IRepository.IEmployeeRepository;
import com.SENA.RestaurantManagementSystem.Administration.IService.IEmployeeService;
import com.SENA.RestaurantManagementSystem.Administration.DTO.EmployeeReqDto;
import com.SENA.RestaurantManagementSystem.Administration.DTO.EmployeeResDto;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends ABaseServiceAdministration<Employee, EmployeeReqDto, EmployeeResDto, IEmployeeRepository> implements IEmployeeService {

    @Override
    public Employee mapToEntity(EmployeeReqDto dto) {
        Employee entity = new Employee();
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setDocumentNumber(dto.getDocumentNumber());
        entity.setRole(dto.getRole());
        entity.setPhone(dto.getPhone());
        entity.setEmail(dto.getEmail());
        entity.setHireDate(dto.getHireDate());
        entity.setSalary(dto.getSalary());
        entity.setStatus(dto.getStatus());
        return entity;
    }

    @Override
    public EmployeeResDto mapToResDto(Employee entity) {
        return EmployeeResDto.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .documentNumber(entity.getDocumentNumber())
                .role(entity.getRole())
                .phone(entity.getPhone())
                .email(entity.getEmail())
                .hireDate(entity.getHireDate())
                .salary(entity.getSalary())
                .status(entity.getStatus())
                .build();
    }
}