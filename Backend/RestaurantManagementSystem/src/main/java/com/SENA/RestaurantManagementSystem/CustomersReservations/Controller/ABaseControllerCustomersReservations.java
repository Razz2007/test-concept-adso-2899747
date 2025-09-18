package com.SENA.RestaurantManagementSystem.CustomersReservations.Controller;

import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.ABaseEntityCustomersReservationsBase;
import com.SENA.RestaurantManagementSystem.CustomersReservations.IService.IBaseServiceCustomersReservations;
import com.SENA.RestaurantManagementSystem.CustomersReservations.DTO.ApiResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class ABaseControllerCustomersReservations <T, DReq, DRes, S extends IBaseServiceCustomersReservations<T, DReq, DRes>> {
    protected S service;
    protected String entityName;

    protected ABaseControllerCustomersReservations(S service, String entityName) {
        this.service = service;
        this.entityName = entityName;
    }

    @GetMapping
    public ResponseEntity<ApiResponseDto<List<DRes>>> findAll() {
        try {
            List<T> entities = service.findAll();
            List<DRes> dtos = entities.stream().map(service::mapToResDto).collect(Collectors.toList());
            return ResponseEntity.ok(new ApiResponseDto<List<DRes>>("Datos obtenidos", dtos, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<DRes>>(e.getMessage(), null, false));
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<ApiResponseDto<DRes>> show(@PathVariable String id) {
        try {
            Optional<T> entity = service.findById(id);
            DRes dto = entity.map(service::mapToResDto).orElse(null);
            return ResponseEntity.ok(new ApiResponseDto<DRes>("Registro encontrado", dto, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body(new ApiResponseDto<DRes>(e.getMessage(), null, false));
        }
    }

    @PostMapping
    public ResponseEntity<ApiResponseDto<DRes>> save(@RequestBody DReq dto) {
        try {
            T entity = service.mapToEntity(dto);
            T saved = service.save(entity);
            DRes responseDto = service.mapToResDto(saved);
            return ResponseEntity.ok(new ApiResponseDto<DRes>("Datos guardados", responseDto, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<DRes>(e.getMessage(), null, false));
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<ApiResponseDto<DRes>> update(@PathVariable String id, @RequestBody DReq dto) {
        try {
            T entity = service.mapToEntity(dto);
            service.update(id, entity);
            return ResponseEntity.ok(new ApiResponseDto<DRes>("Datos actualizados", null, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<DRes>(e.getMessage(), null, false));
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ApiResponseDto<DRes>> delete(@PathVariable String id) {
        try {
            service.delete(id);
            return ResponseEntity.ok(new ApiResponseDto<DRes>("Registro eliminado", null, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<DRes>(e.getMessage(), null, false));
        }
    }
}