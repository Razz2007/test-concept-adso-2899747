package com.SENA.RestaurantManagementSystem.CustomersReservations.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "customer", schema = "customers_reservations")
@Schema(name="customer", description = "Entidad que representa un cliente")
public class Customer extends ABaseEntityAudit {

    @Schema(description = "Nombre del cliente", example = "Juan")
    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Schema(description = "Apellido del cliente", example = "Pérez")
    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Schema(description = "Teléfono del cliente", example = "+57 300 123 4567")
    @Column(name = "phone", nullable = false, length = 20)
    private String phone;

    @Schema(description = "Correo electrónico del cliente", example = "juan.perez@example.com")
    @Column(name = "email", nullable = false, length = 100, unique = true)
    private String email;

    @Schema(description = "Dirección del cliente", example = "Calle 123 #45-67")
    @Column(name = "address", nullable = false, length = 255)
    private String address;

    @Schema(description = "Fecha de nacimiento del cliente", example = "1990-01-01")
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

}