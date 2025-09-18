package com.SENA.RestaurantManagementSystem.Administration.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "supplier", schema = "administration")
@Schema(name = "supplier", description = "Entity representing suppliers")
@Data
public class Supplier extends AAdministrationBaseEntity {
    @Column(name = "name", nullable = false, length = 100)
    @Schema(description = "Supplier's name", example = "Fresh Foods Inc.")
    private String name;

    @Column(name = "contact_name", nullable = false, length = 100)
    @Schema(description = "Supplier's contact person", example = "Maria Garcia")
    private String contactName;

    @Column(name = "phone", nullable = false, length = 20)
    @Schema(description = "Supplier's phone number", example = "+57 301 987 6543")
    private String phone;

    @Column(name = "email", nullable = false, length = 100)
    @Schema(description = "Supplier's email address", example = "contact@freshfoods.com")
    private String email;

    @Column(name = "address", nullable = false, length = 255)
    @Schema(description = "Supplier's address", example = "456 Supplier St #78-90")
    private String address;
}