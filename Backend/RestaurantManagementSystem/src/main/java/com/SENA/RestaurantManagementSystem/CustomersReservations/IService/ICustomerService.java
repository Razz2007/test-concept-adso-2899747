package com.SENA.RestaurantManagementSystem.CustomersReservations.IService;

import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.Customer;
import com.SENA.RestaurantManagementSystem.CustomersReservations.DTO.CustomerReqDto;
import com.SENA.RestaurantManagementSystem.CustomersReservations.DTO.CustomerResDto;

public interface ICustomerService extends IBaseServiceCustomersReservations<Customer, CustomerReqDto, CustomerResDto> {
}