package com.SENA.RestaurantManagementSystem.Administration.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.SENA.RestaurantManagementSystem.Entity.ABaseEntity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee extends ABaseEntity {
    @Schema(description = "Primer nombre del empleado", example = "Juan")
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Schema(description = "Apellido del empleado", example = "Pérez")
    @Column(name = "last_name", nullable = false, length = 50)
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

    @Schema(description = "Correo electrónico", example = "juan.perez@restaurant.com")
    @Column(name = "email", nullable = false, length = 100, unique = true)
    private String email;

    @Schema(description = "Fecha de contratación", example = "2023-01-15")
    @Column(name = "hire_date", nullable = false)
    private LocalDate hireDate;

    @Schema(description = "Salario", example = "1500000.00")
    @Column(name = "salary", nullable = false, precision = 10, scale = 2)
    private BigDecimal salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}