package com.SENA.RestaurantManagementSystem.ClientReservations.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "restaurant_table", schema = "client_reservations")
@Schema(name = "restaurant_table", description = "Entity representing restaurant tables")
@Data
public class RestaurantTable extends AClientReservationsBaseEntity {
    @Column(name = "code", nullable = false, length = 10, unique = true)
    @Schema(description = "Unique table code", example = "T001")
    private String code;

    @Column(name = "capacity", nullable = false)
    @Schema(description = "Table capacity", example = "4")
    private Integer capacity;

    @Column(name = "location", nullable = false, length = 100)
    @Schema(description = "Table location", example = "Terrace")
    private String location;

    @Column(name = "status", nullable = false)
    @Schema(description = "Table status (available/occupied)", example = "true")
    private Boolean status;
}