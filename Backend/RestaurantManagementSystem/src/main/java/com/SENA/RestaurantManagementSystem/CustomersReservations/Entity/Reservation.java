package com.SENA.RestaurantManagementSystem.CustomersReservations.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "reservation", schema = "customers_reservations")
@Schema(name="reservation", description = "Entidad que representa una reserva")
public class Reservation extends ABaseEntityCustomersReservationsBase {

    @Schema(description = "Cliente que hace la reserva")
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Schema(description = "Mesa reservada")
    @ManyToOne
    @JoinColumn(name = "table_id", nullable = false)
    private TableEntity table;

    @Schema(description = "Fecha de la reserva", example = "2023-12-25")
    @Column(name = "reservation_date", nullable = false)
    private LocalDate reservationDate;

    @Schema(description = "Hora de la reserva", example = "19:00:00")
    @Column(name = "reservation_time", nullable = false)
    private LocalTime reservationTime;

    @Schema(description = "Número de personas", example = "4")
    @Column(name = "number_of_people", nullable = false)
    private Integer numberOfPeople;

    @Schema(description = "Solicitud especial", example = "Vista al mar")
    @Column(name = "special_request", nullable = true, length = 255)
    private String specialRequest;

}