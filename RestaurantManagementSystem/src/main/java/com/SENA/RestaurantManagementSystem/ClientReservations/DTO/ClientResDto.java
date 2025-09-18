package com.SENA.RestaurantManagementSystem.ClientReservations.DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(name = "ClientResDto", description = "Client response DTO")
@Data
public class ClientResDto {
    @Schema(description = "Client ID", example = "uuid-string")
    private String id;

    @Schema(description = "Client's first name", example = "John")
    private String firstName;

    @Schema(description = "Client's last name", example = "Doe")
    private String lastName;

    @Schema(description = "Client's phone number", example = "+57 300 123 4567")
    private String phone;

    @Schema(description = "Client's email address", example = "john.doe@example.com")
    private String email;

    @Schema(description = "Client's address", example = "123 Main St #45-67")
    private String address;

    @Schema(description = "Client's birth date", example = "1990-05-15")
    private LocalDate birthDate;

    @Schema(description = "Client status", example = "true")
    private Boolean status;

    @Schema(description = "Creation date", example = "2023-01-01T10:00:00")
    private LocalDateTime createdAt;

    @Schema(description = "Created by user", example = "admin")
    private String createdBy;
}