package com.SENA.RestaurantManagementSystem.Administration.Entity;

import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.ABaseEntityAudit;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "supplier", schema = "administration")
@Schema(name="supplier", description = "Entidad que representa un proveedor")
public class Supplier extends ABaseEntityAudit {

    @Schema(description = "Nombre del proveedor", example = "Proveedor ABC")
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Schema(description = "Nombre del contacto", example = "Juan Pérez")
    @Column(name = "contact_name", nullable = false, length = 100)
    private String contactName;

    @Schema(description = "Teléfono", example = "+57 300 123 4567")
    @Column(name = "phone", nullable = false, length = 20)
    private String phone;

    @Schema(description = "Correo electrónico", example = "contacto@proveedor.com")
    @Column(name = "email", nullable = false, length = 100, unique = true)
    private String email;

    @Schema(description = "Dirección", example = "Calle 123 #45-67")
    @Column(name = "address", nullable = false, length = 255)
    private String address;

}