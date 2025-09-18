package com.SENA.RestaurantManagementSystem.ClientReservations.Entity;

import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "client", schema = "client_reservations")
@Schema(name = "client", description = "Entity representing clients")
@Data
public class Client extends AClientReservationsBaseEntity {
    @Column(name = "first_name", nullable = false, length = 100)
    @Schema(description = "Client's first name", example = "John")
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    @Schema(description = "Client's last name", example = "Doe")
    private String lastName;

    @Column(name = "phone", nullable = false, length = 20)
    @Schema(description = "Client's phone number", example = "+57 300 123 4567")
    private String phone;

    @Column(name = "email", nullable = false, length = 100)
    @Schema(description = "Client's email address", example = "john.doe@example.com")
    private String email;

    @Column(name = "address", nullable = true, length = 255)
    @Schema(description = "Client's address", example = "123 Main St #45-67")
    private String address;

    @Column(name = "birth_date", nullable = true)
    @Schema(description = "Client's birth date", example = "1990-05-15")
    private LocalDate birthDate;
}