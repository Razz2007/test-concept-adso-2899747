package com.SENA.RestaurantManagementSystem.CustomersReservations.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "ApiResponseDto", description = "DTO para respuestas de la API")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponseDto<T> {
    @Schema(description = "Mensaje de la respuesta", example = "Datos obtenidos correctamente")
    private String message;

    @Schema(description = "Datos de la respuesta")
    private T data;

    @Schema(description = "Estado de la respuesta", example = "true")
    private Boolean status;
}