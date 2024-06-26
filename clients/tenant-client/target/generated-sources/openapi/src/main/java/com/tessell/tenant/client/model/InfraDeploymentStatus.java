/*
 * Tessell Tenant Onboarding Service API
 * Tenant Onboarding API
 *
 * The version of the OpenAPI document: v1beta
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.tenant.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Infra Deployment Status
 */
public enum InfraDeploymentStatus {
  
  CREATING("CREATING"),
  
  CREATED("CREATED"),
  
  DISABLED("DISABLED"),
  
  DELETING("DELETING"),
  
  DELETED("DELETED"),
  
  FAILED("FAILED"),
  
  UPDATING("UPDATING"),
  
  UPDATE_FAILED("UPDATE_FAILED");

  private String value;

  InfraDeploymentStatus(String value) {
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
  public static InfraDeploymentStatus fromValue(String value) {
    for (InfraDeploymentStatus b : InfraDeploymentStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

