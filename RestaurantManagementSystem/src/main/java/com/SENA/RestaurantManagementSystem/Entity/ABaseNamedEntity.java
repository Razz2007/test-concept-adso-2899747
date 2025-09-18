package com.SENA.RestaurantManagementSystem.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ABaseNamedEntity extends ABaseCodedEntity {
    @Schema(description = "Nombre del dato", example = "Empleado Principal")
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Schema(description = "Descripción del dato", example = "Descripción detallada")
    @Column(name = "description", nullable = false, length = 255)
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}