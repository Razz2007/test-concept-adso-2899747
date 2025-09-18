package com.SENA.RestaurantManagementSystem.CustomersReservations.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Schema(name = "CustomerDto", description = "DTO que representa un cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerResDto {
    @Schema(description = "ID único del cliente", example = "123e4567-e89b-12d3-a456-426614174000")
    private String id;

    @Schema(description = "Nombre del cliente", example = "Juan")
    private String firstName;

    @Schema(description = "Apellido del cliente", example = "Pérez")
    private String lastName;

    @Schema(description = "Teléfono del cliente", example = "+57 300 123 4567")
    private String phone;

    @Schema(description = "Correo electrónico del cliente", example = "juan.perez@example.com")
    private String email;

    @Schema(description = "Dirección del cliente", example = "Calle 123 #45-67")
    private String address;

    @Schema(description = "Fecha de nacimiento del cliente", example = "1990-01-01")
    private LocalDate birthDate;

    @Schema(description = "Estado del cliente (activo/inactivo)", example = "true")
    private Boolean status;
}