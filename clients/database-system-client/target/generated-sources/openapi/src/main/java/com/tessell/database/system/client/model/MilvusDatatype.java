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
 * Gets or Sets MilvusDatatype
 */
public enum MilvusDatatype {
  
  VARCHAR("VARCHAR"),
  
  INT64("INT64"),
  
  BOOL("BOOL"),
  
  INT8("INT8"),
  
  INT16("INT16"),
  
  INT32("INT32"),
  
  FLOAT("FLOAT"),
  
  DOUBLE("DOUBLE"),
  
  JSON("JSON"),
  
  BINARY_VECTOR("BINARY_VECTOR"),
  
  FLOAT_VECTOR("FLOAT_VECTOR");

  private String value;

  MilvusDatatype(String value) {
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
  public static MilvusDatatype fromValue(String value) {
    for (MilvusDatatype b : MilvusDatatype.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
