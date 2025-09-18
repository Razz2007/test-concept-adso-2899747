package com.SENA.RestaurantManagementSystem.CustomersReservations.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "TableDto", description = "DTO que representa una mesa")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TableResDto {
    @Schema(description = "ID único de la mesa", example = "123e4567-e89b-12d3-a456-426614174000")
    private String id;

    @Schema(description = "Código de la mesa", example = "T001")
    private String code;

    @Schema(description = "Nombre de la mesa", example = "Mesa 1")
    private String name;

    @Schema(description = "Descripción de la mesa", example = "Mesa para 4 personas")
    private String description;

    @Schema(description = "Capacidad de la mesa", example = "4")
    private Integer capacity;

    @Schema(description = "Ubicación de la mesa", example = "Terraza")
    private String location;

    @Schema(description = "Estado de la mesa (activo/inactivo)", example = "true")
    private Boolean status;
}