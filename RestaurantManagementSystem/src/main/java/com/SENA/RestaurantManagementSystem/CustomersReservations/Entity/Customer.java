package com.SENA.RestaurantManagementSystem.CustomersReservations.Entity;

import java.time.LocalDate;

import com.SENA.RestaurantManagementSystem.Entity.ABaseEntity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer extends ABaseEntity {
    @Schema(description = "Primer nombre del cliente", example = "Ana")
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Schema(description = "Apellido del cliente", example = "López")
    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Schema(description = "Teléfono del cliente", example = "+57 300 123 4567")
    @Column(name = "phone", nullable = false, length = 20)
    private String phone;

    @Schema(description = "Correo electrónico", example = "ana.lopez@email.com")
    @Column(name = "email", nullable = false, length = 100, unique = true)
    private String email;

    @Schema(description = "Dirección", example = "Calle 456, Ciudad")
    @Column(name = "address", nullable = false, length = 255)
    private String address;

    @Schema(description = "Fecha de nacimiento", example = "1990-05-15")
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}