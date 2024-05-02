/*
 * Tessell Monitoring Service API
 * Monitoring API
 *
 * The version of the OpenAPI document: v1beta
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.monitoring.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets MonitoringDeploymentStatusOps
 */
public enum MonitoringDeploymentStatusOps {
  
  CREATING("CREATING"),
  
  CREATION_FAILED("CREATION_FAILED"),
  
  RUNNING("RUNNING"),
  
  STOPPED("STOPPED"),
  
  DELETING("DELETING"),
  
  DELETED("DELETED"),
  
  DELETION_FAILED("DELETION_FAILED");

  private String value;

  MonitoringDeploymentStatusOps(String value) {
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
  public static MonitoringDeploymentStatusOps fromValue(String value) {
    for (MonitoringDeploymentStatusOps b : MonitoringDeploymentStatusOps.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

