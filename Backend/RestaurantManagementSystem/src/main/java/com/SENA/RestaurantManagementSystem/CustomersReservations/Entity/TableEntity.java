package com.SENA.RestaurantManagementSystem.CustomersReservations.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "restaurant_table", schema = "customers_reservations")
@Schema(name="restaurant_table", description = "Entidad que representa una mesa")
public class TableEntity extends ABaseEntityCustomersReservationsBase {

    @Schema(description = "Capacidad de la mesa", example = "4")
    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @Schema(description = "Ubicación de la mesa", example = "Terraza")
    @Column(name = "location", nullable = false, length = 100)
    private String location;

}