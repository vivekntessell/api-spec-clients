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


package com.tessell.gov.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Cloud Type
 */
public enum TessellCloudAccountTypeDTO {
  
  INFRA_SERVICE("INFRA_SERVICE"),
  
  TENANT_ASSETS("TENANT_ASSETS"),
  
  INFRA_SERVICE_GLOBAL("INFRA_SERVICE_GLOBAL"),
  
  SES("SES"),
  
  TENANT_ASSETS_GLOBAL("TENANT_ASSETS_GLOBAL");

  private String value;

  TessellCloudAccountTypeDTO(String value) {
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
  public static TessellCloudAccountTypeDTO fromValue(String value) {
    for (TessellCloudAccountTypeDTO b : TessellCloudAccountTypeDTO.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

