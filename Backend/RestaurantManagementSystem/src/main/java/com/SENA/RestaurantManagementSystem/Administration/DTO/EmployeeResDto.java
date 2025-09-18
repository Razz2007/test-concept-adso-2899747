package com.SENA.RestaurantManagementSystem.Administration.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Schema(name = "EmployeeDto", description = "DTO que representa un empleado")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeResDto {
    @Schema(description = "ID único del empleado", example = "123e4567-e89b-12d3-a456-426614174000")
    private String id;

    @Schema(description = "Nombre del empleado", example = "Juan")
    private String firstName;

    @Schema(description = "Apellido del empleado", example = "Pérez")
    private String lastName;

    @Schema(description = "Número de documento", example = "123456789")
    private String documentNumber;

    @Schema(description = "Rol del empleado", example = "Cocinero")
    private String role;

    @Schema(description = "Teléfono del empleado", example = "+57 300 123 4567")
    private String phone;

    @Schema(description = "Correo electrónico del empleado", example = "juan.perez@restaurant.com")
    private String email;

    @Schema(description = "Fecha de contratación", example = "2020-01-01")
    private LocalDate hireDate;

    @Schema(description = "Salario del empleado", example = "1500000.00")
    private BigDecimal salary;

    @Schema(description = "Estado del empleado (activo/inactivo)", example = "true")
    private Boolean status;
}