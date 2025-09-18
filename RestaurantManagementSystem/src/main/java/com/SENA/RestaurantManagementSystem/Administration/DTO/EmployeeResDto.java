package com.SENA.RestaurantManagementSystem.Administration.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(name = "EmployeeResDto", description = "Employee response DTO")
@Data
public class EmployeeResDto {
    @Schema(description = "Employee ID", example = "uuid-string")
    private String id;

    @Schema(description = "Employee's first name", example = "John")
    private String firstName;

    @Schema(description = "Employee's last name", example = "Smith")
    private String lastName;

    @Schema(description = "Employee's document number", example = "1234567890")
    private String documentNumber;

    @Schema(description = "Employee's role", example = "Waiter")
    private String role;

    @Schema(description = "Employee's phone number", example = "+57 300 123 4567")
    private String phone;

    @Schema(description = "Employee's email address", example = "john.smith@restaurant.com")
    private String email;

    @Schema(description = "Employee's hire date", example = "2023-01-15")
    private LocalDateTime hireDate;

    @Schema(description = "Employee's salary", example = "1500.00")
    private BigDecimal salary;

    @Schema(description = "Employee status", example = "true")
    private Boolean status;

    @Schema(description = "Creation date", example = "2023-01-01T10:00:00")
    private LocalDateTime createdAt;

    @Schema(description = "Created by user", example = "admin")
    private String createdBy;
}