package com.SENA.RestaurantManagementSystem.Administration.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "SupplierDto", description = "DTO que representa un proveedor")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SupplierResDto {
    @Schema(description = "ID único del proveedor", example = "123e4567-e89b-12d3-a456-426614174000")
    private String id;

    @Schema(description = "Nombre del proveedor", example = "Proveedor ABC")
    private String name;

    @Schema(description = "Nombre del contacto", example = "Juan Pérez")
    private String contactName;

    @Schema(description = "Teléfono", example = "+57 300 123 4567")
    private String phone;

    @Schema(description = "Correo electrónico", example = "contacto@proveedor.com")
    private String email;

    @Schema(description = "Dirección", example = "Calle 123 #45-67")
    private String address;

    @Schema(description = "Estado del proveedor (activo/inactivo)", example = "true")
    private Boolean status;
}