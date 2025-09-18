package com.SENA.RestaurantManagementSystem.Administration.Entity;

import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.ABaseEntityAudit;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "employee", schema = "administration")
@Schema(name="employee", description = "Entidad que representa un empleado")
public class Employee extends ABaseEntityAudit {

    @Schema(description = "Nombre del empleado", example = "Juan")
    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Schema(description = "Apellido del empleado", example = "Pérez")
    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Schema(description = "Número de documento", example = "123456789")
    @Column(name = "document_number", nullable = false, length = 20, unique = true)
    private String documentNumber;

    @Schema(description = "Rol del empleado", example = "Cocinero")
    @Column(name = "role", nullable = false, length = 50)
    private String role;

    @Schema(description = "Teléfono del empleado", example = "+57 300 123 4567")
    @Column(name = "phone", nullable = false, length = 20)
    private String phone;

    @Schema(description = "Correo electrónico del empleado", example = "juan.perez@restaurant.com")
    @Column(name = "email", nullable = false, length = 100, unique = true)
    private String email;

    @Schema(description = "Fecha de contratación", example = "2020-01-01")
    @Column(name = "hire_date", nullable = false)
    private LocalDate hireDate;

    @Schema(description = "Salario del empleado", example = "1500000.00")
    @Column(name = "salary", nullable = false, precision = 10, scale = 2)
    private BigDecimal salary;

}