package com.SENA.RestaurantManagementSystem.CustomersReservations.Service;

import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.Customer;
import com.SENA.RestaurantManagementSystem.CustomersReservations.IRepository.ICustomerRepository;
import com.SENA.RestaurantManagementSystem.CustomersReservations.IService.ICustomerService;
import com.SENA.RestaurantManagementSystem.CustomersReservations.DTO.CustomerReqDto;
import com.SENA.RestaurantManagementSystem.CustomersReservations.DTO.CustomerResDto;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends ABaseServiceCustomersReservations<Customer, CustomerReqDto, CustomerResDto, ICustomerRepository> implements ICustomerService {

    @Override
    public Customer mapToEntity(CustomerReqDto dto) {
        Customer entity = new Customer();
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setPhone(dto.getPhone());
        entity.setEmail(dto.getEmail());
        entity.setAddress(dto.getAddress());
        entity.setBirthDate(dto.getBirthDate());
        entity.setStatus(dto.getStatus());
        return entity;
    }

    @Override
    public CustomerResDto mapToResDto(Customer entity) {
        return CustomerResDto.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .phone(entity.getPhone())
                .email(entity.getEmail())
                .address(entity.getAddress())
                .birthDate(entity.getBirthDate())
                .status(entity.getStatus())
                .build();
    }
}