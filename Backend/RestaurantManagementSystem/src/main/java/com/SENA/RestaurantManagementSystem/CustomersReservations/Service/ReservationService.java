package com.SENA.RestaurantManagementSystem.CustomersReservations.Service;

import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.Reservation;
import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.Customer;
import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.TableEntity;
import com.SENA.RestaurantManagementSystem.CustomersReservations.IRepository.IReservationRepository;
import com.SENA.RestaurantManagementSystem.CustomersReservations.IService.IReservationService;
import com.SENA.RestaurantManagementSystem.CustomersReservations.DTO.ReservationReqDto;
import com.SENA.RestaurantManagementSystem.CustomersReservations.DTO.ReservationResDto;
import org.springframework.stereotype.Service;

@Service
public class ReservationService extends ABaseServiceCustomersReservations<Reservation, ReservationReqDto, ReservationResDto, IReservationRepository> implements IReservationService {

    @Override
    public Reservation mapToEntity(ReservationReqDto dto) {
        Reservation entity = new Reservation();
        entity.setCode(dto.getCode());
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        // Note: Customer and Table would need to be fetched from repositories
        // For simplicity, assuming IDs are set directly
        Customer customer = new Customer();
        customer.setId(dto.getCustomerId());
        entity.setCustomer(customer);
        TableEntity table = new TableEntity();
        table.setId(dto.getTableId());
        entity.setTable(table);
        entity.setReservationDate(dto.getReservationDate());
        entity.setReservationTime(dto.getReservationTime());
        entity.setNumberOfPeople(dto.getNumberOfPeople());
        entity.setSpecialRequest(dto.getSpecialRequest());
        entity.setStatus(dto.getStatus());
        return entity;
    }

    @Override
    public ReservationResDto mapToResDto(Reservation entity) {
        return ReservationResDto.builder()
                .id(entity.getId())
                .code(entity.getCode())
                .name(entity.getName())
                .description(entity.getDescription())
                .customerId(entity.getCustomer() != null ? entity.getCustomer().getId() : null)
                .customerName(entity.getCustomer() != null ? entity.getCustomer().getFirstName() + " " + entity.getCustomer().getLastName() : null)
                .tableId(entity.getTable() != null ? entity.getTable().getId() : null)
                .tableName(entity.getTable() != null ? entity.getTable().getName() : null)
                .reservationDate(entity.getReservationDate())
                .reservationTime(entity.getReservationTime())
                .numberOfPeople(entity.getNumberOfPeople())
                .specialRequest(entity.getSpecialRequest())
                .status(entity.getStatus())
                .build();
    }
}