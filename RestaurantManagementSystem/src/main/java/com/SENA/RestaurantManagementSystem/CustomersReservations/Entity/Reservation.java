package com.SENA.RestaurantManagementSystem.CustomersReservations.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import com.SENA.RestaurantManagementSystem.Entity.ABaseCodedEntity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation extends ABaseCodedEntity {
    @Schema(description = "ID del cliente", example = "uuid-del-cliente")
    @Column(name = "customer_id", nullable = false, length = 36)
    private String customerId;

    @Schema(description = "ID de la mesa", example = "uuid-de-la-mesa")
    @Column(name = "table_id", nullable = false, length = 36)
    private String tableId;

    @Schema(description = "Fecha de la reservación", example = "2023-12-25")
    @Column(name = "reservation_date", nullable = false)
    private LocalDate reservationDate;

    @Schema(description = "Hora de la reservación", example = "19:00:00")
    @Column(name = "reservation_time", nullable = false)
    private LocalTime reservationTime;

    @Schema(description = "Número de personas", example = "4")
    @Column(name = "number_of_people", nullable = false)
    private Integer numberOfPeople;

    @Schema(description = "Solicitud especial", example = "Mesa junto a la ventana")
    @Column(name = "special_request", nullable = true, length = 255)
    private String specialRequest;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalTime getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(LocalTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }
}