package com.SENA.RestaurantManagementSystem.Administration.Service;

import com.SENA.RestaurantManagementSystem.Administration.Entity.Supplier;
import com.SENA.RestaurantManagementSystem.Administration.IRepository.ISupplierRepository;
import com.SENA.RestaurantManagementSystem.Administration.IService.ISupplierService;
import com.SENA.RestaurantManagementSystem.Administration.DTO.SupplierReqDto;
import com.SENA.RestaurantManagementSystem.Administration.DTO.SupplierResDto;
import org.springframework.stereotype.Service;

@Service
public class SupplierService extends ABaseServiceAdministration<Supplier, SupplierReqDto, SupplierResDto, ISupplierRepository> implements ISupplierService {

    @Override
    public Supplier mapToEntity(SupplierReqDto dto) {
        Supplier entity = new Supplier();
        entity.setName(dto.getName());
        entity.setContactName(dto.getContactName());
        entity.setPhone(dto.getPhone());
        entity.setEmail(dto.getEmail());
        entity.setAddress(dto.getAddress());
        entity.setStatus(dto.getStatus());
        return entity;
    }

    @Override
    public SupplierResDto mapToResDto(Supplier entity) {
        return SupplierResDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .contactName(entity.getContactName())
                .phone(entity.getPhone())
                .email(entity.getEmail())
                .address(entity.getAddress())
                .status(entity.getStatus())
                .build();
    }
}