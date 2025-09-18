package com.SENA.RestaurantManagementSystem.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ABaseCodedEntity extends ABaseEntity {
    @Schema(description = "Código del dato", example = "EMP001")
    @Column(name = "code", nullable = false, length = 10, unique = true)
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}