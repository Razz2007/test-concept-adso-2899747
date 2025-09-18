package com.SENA.RestaurantManagementSystem.CustomersReservations.Entity;

import com.SENA.RestaurantManagementSystem.Entity.ABaseCodedEntity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurant_table")
public class RestaurantTable extends ABaseCodedEntity {
    @Schema(description = "Capacidad de la mesa", example = "4")
    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @Schema(description = "Ubicación de la mesa", example = "Terraza")
    @Column(name = "location", nullable = false, length = 50)
    private String location;

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}