package com.SENA.RestaurantManagementSystem.ClientReservations.Entity;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "reservation", schema = "client_reservations")
@Schema(name = "reservation", description = "Entity representing reservations")
@Data
public class Reservation extends AClientReservationsBaseEntity {
    @Column(name = "code", nullable = false, length = 10, unique = true)
    @Schema(description = "Unique reservation code", example = "R001")
    private String code;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    @Schema(description = "Client making the reservation")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "table_id", nullable = false)
    @Schema(description = "Reserved table")
    private RestaurantTable table;

    @Column(name = "reservation_date", nullable = false)
    @Schema(description = "Reservation date", example = "2023-12-25")
    private LocalDateTime reservationDate;

    @Column(name = "reservation_time", nullable = false)
    @Schema(description = "Reservation time", example = "19:00")
    private LocalDateTime reservationTime;

    @Column(name = "number_of_people", nullable = false)
    @Schema(description = "Number of people", example = "4")
    private Integer numberOfPeople;

    @Column(name = "special_request", nullable = true, length = 255)
    @Schema(description = "Special requests", example = "Garden view")
    private String specialRequest;
}