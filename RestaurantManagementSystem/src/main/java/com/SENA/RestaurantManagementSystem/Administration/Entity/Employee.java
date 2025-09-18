package com.SENA.RestaurantManagementSystem.Administration.Entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employee", schema = "administration")
@Schema(name = "employee", description = "Entity representing employees")
@Data
public class Employee extends AAdministrationBaseEntity {
    @Column(name = "first_name", nullable = false, length = 100)
    @Schema(description = "Employee's first name", example = "John")
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    @Schema(description = "Employee's last name", example = "Smith")
    private String lastName;

    @Column(name = "document_number", nullable = false, length = 20, unique = true)
    @Schema(description = "Employee's document number", example = "1234567890")
    private String documentNumber;

    @Column(name = "role", nullable = false, length = 50)
    @Schema(description = "Employee's role", example = "Waiter")
    private String role;

    @Column(name = "phone", nullable = false, length = 20)
    @Schema(description = "Employee's phone number", example = "+57 300 123 4567")
    private String phone;

    @Column(name = "email", nullable = false, length = 100)
    @Schema(description = "Employee's email address", example = "john.smith@restaurant.com")
    private String email;

    @Column(name = "hire_date", nullable = false)
    @Schema(description = "Employee's hire date", example = "2023-01-15")
    private LocalDateTime hireDate;

    @Column(name = "salary", nullable = false, precision = 10, scale = 2)
    @Schema(description = "Employee's salary", example = "1500.00")
    private BigDecimal salary;
}