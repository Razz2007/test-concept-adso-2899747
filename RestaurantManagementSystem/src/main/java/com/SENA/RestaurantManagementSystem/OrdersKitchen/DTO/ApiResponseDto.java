package com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "ApiResponseDto", description = "API response DTO")
public class ApiResponseDto<T> {
    @Schema(description = "Indicates if the operation was successful", example = "true")
    private Boolean success;

    @Schema(description = "Response message", example = "Operation successful")
    private String message;

    @Schema(description = "Response data")
    private T data;

    public ApiResponseDto() {
    }

    public ApiResponseDto(Boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}