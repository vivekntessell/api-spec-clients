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
 * Status of connection pool internal to Tessell
 */
public enum ConnectionPoolStatusOps {
  
  CREATING("CREATING"),
  
  CREATION_FAILED("CREATION_FAILED"),
  
  ACTIVE("ACTIVE"),
  
  UPDATING("UPDATING"),
  
  DELETING("DELETING"),
  
  DELETION_FAILED("DELETION_FAILED"),
  
  DELETED("DELETED");

  private String value;

  ConnectionPoolStatusOps(String value) {
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
  public static ConnectionPoolStatusOps fromValue(String value) {
    for (ConnectionPoolStatusOps b : ConnectionPoolStatusOps.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

