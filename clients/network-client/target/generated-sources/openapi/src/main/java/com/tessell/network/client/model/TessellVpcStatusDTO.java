/*
 * REST API Documentation
 * REST API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.network.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Tessell Vpc Status
 */
public enum TessellVpcStatusDTO {
  
  ACTIVE("ACTIVE"),
  
  CREATING("CREATING"),
  
  CREATION_FAILED("CREATION_FAILED"),
  
  VALIDATING("VALIDATING"),
  
  VALIDATION_FAILED("VALIDATION_FAILED"),
  
  DELETING("DELETING"),
  
  DELETED("DELETED");

  private String value;

  TessellVpcStatusDTO(String value) {
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
  public static TessellVpcStatusDTO fromValue(String value) {
    for (TessellVpcStatusDTO b : TessellVpcStatusDTO.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

