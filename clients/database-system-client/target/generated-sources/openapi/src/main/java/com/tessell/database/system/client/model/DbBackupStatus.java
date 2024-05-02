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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * DB Backup Status
 */
public enum DbBackupStatus {
  
  AVAILABLE("AVAILABLE"),
  
  CREATING("CREATING"),
  
  SOFT_DELETED("SOFT_DELETED"),
  
  DELETED("DELETED"),
  
  DELETING("DELETING"),
  
  QUEUED("QUEUED"),
  
  SCHEDULED("SCHEDULED"),
  
  REPLICATING("REPLICATING"),
  
  DELETED_FOR_USER("DELETED_FOR_USER"),
  
  DELETED_FOR_SLA("DELETED_FOR_SLA"),
  
  DELETION_FAILED("DELETION_FAILED"),
  
  FAILED("FAILED"),
  
  PREPARING("PREPARING"),
  
  REPLICATION_FAILED("REPLICATION_FAILED");

  private String value;

  DbBackupStatus(String value) {
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
  public static DbBackupStatus fromValue(String value) {
    for (DbBackupStatus b : DbBackupStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

