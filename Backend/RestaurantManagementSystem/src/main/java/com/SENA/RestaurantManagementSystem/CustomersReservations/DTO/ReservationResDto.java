package com.SENA.RestaurantManagementSystem.CustomersReservations.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Schema(name = "ReservationDto", description = "DTO que representa una reserva")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservationResDto {
    @Schema(description = "ID único de la reserva", example = "123e4567-e89b-12d3-a456-426614174000")
    private String id;

    @Schema(description = "Código de la reserva", example = "R001")
    private String code;

    @Schema(description = "Nombre de la reserva", example = "Reserva Juan Pérez")
    private String name;

    @Schema(description = "Descripción de la reserva", example = "Reserva para cena")
    private String description;

    @Schema(description = "ID del cliente", example = "123e4567-e89b-12d3-a456-426614174000")
    private String customerId;

    @Schema(description = "Nombre del cliente", example = "Juan Pérez")
    private String customerName;

    @Schema(description = "ID de la mesa", example = "123e4567-e89b-12d3-a456-426614174000")
    private String tableId;

    @Schema(description = "Nombre de la mesa", example = "Mesa 1")
    private String tableName;

    @Schema(description = "Fecha de la reserva", example = "2023-12-25")
    private LocalDate reservationDate;

    @Schema(description = "Hora de la reserva", example = "19:00:00")
    private LocalTime reservationTime;

    @Schema(description = "Número de personas", example = "4")
    private Integer numberOfPeople;

    @Schema(description = "Solicitud especial", example = "Vista al mar")
    private String specialRequest;

    @Schema(description = "Estado de la reserva (activo/inactivo)", example = "true")
    private Boolean status;
}