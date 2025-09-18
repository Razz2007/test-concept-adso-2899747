package com.SENA.RestaurantManagementSystem.Administration.Entity;

import com.SENA.RestaurantManagementSystem.Entity.ABaseEntity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "supplier")
public class Supplier extends ABaseEntity {
    @Schema(description = "Nombre del proveedor", example = "Proveedor ABC")
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Schema(description = "Nombre del contacto", example = "María García")
    @Column(name = "contact_name", nullable = false, length = 100)
    private String contactName;

    @Schema(description = "Teléfono del proveedor", example = "+57 300 987 6543")
    @Column(name = "phone", nullable = false, length = 20)
    private String phone;

    @Schema(description = "Correo electrónico", example = "contacto@proveedor.com")
    @Column(name = "email", nullable = false, length = 100, unique = true)
    private String email;

    @Schema(description = "Dirección", example = "Calle 123, Ciudad")
    @Column(name = "address", nullable = false, length = 255)
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}