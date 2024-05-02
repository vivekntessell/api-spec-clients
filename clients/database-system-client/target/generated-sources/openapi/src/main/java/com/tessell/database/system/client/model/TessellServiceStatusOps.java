/*
 * Tessell Database System REST Web Services' API Documentation
 * Tessell Database System REST Web Services' Api Documentation
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.database.system.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TessellServiceStatusOps
 */
public enum TessellServiceStatusOps {
  
  CREATING("CREATING"),
  
  CREATION_FAILED("CREATION_FAILED"),
  
  DELETED("DELETED"),
  
  DELETING("DELETING"),
  
  READY("READY"),
  
  STOPPED("STOPPED"),
  
  STOPPING("STOPPING"),
  
  CONNECTION_STOPPED("CONNECTION_STOPPED"),
  
  STARTING("STARTING"),
  
  DEGRADED("DEGRADED"),
  
  HEALING("HEALING"),
  
  DOWN("DOWN"),
  
  DELETION_FAILED("DELETION_FAILED"),
  
  WARM_STOPPED("WARM_STOPPED"),
  
  TO_BE_DELETED("TO_BE_DELETED"),
  
  DELETED_FOR_USER("DELETED_FOR_USER"),
  
  SWITCHING_OVER("SWITCHING_OVER"),
  
  REBUILDING("REBUILDING"),
  
  RESIZING_STORAGE("RESIZING_STORAGE"),
  
  RESTORING("RESTORING"),
  
  RESTORE_FAILED("RESTORE_FAILED"),
  
  START_FAILED("START_FAILED"),
  
  CONNECTION_STOP_FAILED("CONNECTION_STOP_FAILED"),
  
  VM_STOP_FAILED("VM_STOP_FAILED"),
  
  SWITCHOVER_FAILED("SWITCHOVER_FAILED"),
  
  BACKING_UP("BACKING_UP"),
  
  PATCHING("PATCHING"),
  
  PATCH_FAILED("PATCH_FAILED"),
  
  UPDATING_PARAMETER_PROFILE("UPDATING_PARAMETER_PROFILE"),
  
  UNDER_MAINTENANCE("UNDER_MAINTENANCE");

  private String value;

  TessellServiceStatusOps(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TessellServiceStatusOps fromValue(String value) {
    for (TessellServiceStatusOps b : TessellServiceStatusOps.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
