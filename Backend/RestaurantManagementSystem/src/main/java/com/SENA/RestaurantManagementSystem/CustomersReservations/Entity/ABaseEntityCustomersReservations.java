package com.SENA.RestaurantManagementSystem.CustomersReservations.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@MappedSuperclass
public abstract class ABaseEntityCustomersReservations {
    @Schema(description = "Código del dato", example = "CUST001")
    @Column(name = "code", nullable = false, length = 10, unique = true)
    private String code;

    @Schema(description = "Nombre del dato", example = "Cliente Principal")
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Schema(description = "Descripción del dato", example = "Descripción del cliente")
    @Column(name = "description", nullable = false, length = 255)
    private String description;

}