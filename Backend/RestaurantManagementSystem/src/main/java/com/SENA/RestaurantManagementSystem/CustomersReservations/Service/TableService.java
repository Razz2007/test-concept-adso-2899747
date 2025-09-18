package com.SENA.RestaurantManagementSystem.CustomersReservations.Service;

import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.TableEntity;
import com.SENA.RestaurantManagementSystem.CustomersReservations.IRepository.ITableRepository;
import com.SENA.RestaurantManagementSystem.CustomersReservations.IService.ITableService;
import com.SENA.RestaurantManagementSystem.CustomersReservations.DTO.TableReqDto;
import com.SENA.RestaurantManagementSystem.CustomersReservations.DTO.TableResDto;
import org.springframework.stereotype.Service;

@Service
public class TableService extends ABaseServiceCustomersReservations<TableEntity, TableReqDto, TableResDto, ITableRepository> implements ITableService {

    @Override
    public TableEntity mapToEntity(TableReqDto dto) {
        TableEntity entity = new TableEntity();
        entity.setCode(dto.getCode());
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setCapacity(dto.getCapacity());
        entity.setLocation(dto.getLocation());
        entity.setStatus(dto.getStatus());
        return entity;
    }

    @Override
    public TableResDto mapToResDto(TableEntity entity) {
        return TableResDto.builder()
                .id(entity.getId())
                .code(entity.getCode())
                .name(entity.getName())
                .description(entity.getDescription())
                .capacity(entity.getCapacity())
                .location(entity.getLocation())
                .status(entity.getStatus())
                .build();
    }
}