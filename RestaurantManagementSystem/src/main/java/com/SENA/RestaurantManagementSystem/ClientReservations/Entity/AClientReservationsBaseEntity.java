package com.SENA.RestaurantManagementSystem.ClientReservations.Entity;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AClientReservationsBaseEntity {
    @Id
    @Column(name = "id", nullable = false, updatable = false, length = 36)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Schema(description = "Record status (active/inactive)", example = "true")
    @Column(name = "status", nullable = false)
    private Boolean status;

    @Schema(description = "Record creation date", example = "2023-01-01T10:00:00")
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Schema(description = "Record update date", example = "2023-01-02T10:00:00")
    @Column(name = "updated_at", nullable = true)
    private LocalDateTime updatedAt;

    @Schema(description = "Record deletion date", example = "2023-01-03T10:00:00")
    @Column(name = "deleted_at", nullable = true)
    private LocalDateTime deletedAt;

    @Schema(description = "User who created the record", example = "admin")
    @Column(name = "created_by", nullable = false, length = 100)
    private String createdBy;

    @Schema(description = "User who updated the record", example = "editor")
    @Column(name = "updated_by", nullable = true, length = 100)
    private String updatedBy;

    @Schema(description = "User who deleted the record", example = "deleter")
    @Column(name = "deleted_by", nullable = true, length = 100)
    private String deletedBy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }
}