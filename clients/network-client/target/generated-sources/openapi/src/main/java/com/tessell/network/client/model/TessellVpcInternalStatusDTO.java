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
 * Tessell Vpc Internal Status
 */
public enum TessellVpcInternalStatusDTO {
  
  INACTIVE("INACTIVE"),
  
  CREATING("CREATING"),
  
  UPDATING("UPDATING"),
  
  ACTIVE("ACTIVE"),
  
  FAILED("FAILED"),
  
  DELETING("DELETING"),
  
  DELETION_FAILED("DELETION_FAILED"),
  
  DELETED("DELETED");

  private String value;

  TessellVpcInternalStatusDTO(String value) {
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
  public static TessellVpcInternalStatusDTO fromValue(String value) {
    for (TessellVpcInternalStatusDTO b : TessellVpcInternalStatusDTO.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

