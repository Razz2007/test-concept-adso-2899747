package com.SENA.RestaurantManagementSystem.ClientReservations.DTO;

import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(name = "ClientReqDto", description = "Client request DTO")
@Data
public class ClientReqDto {
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
}