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
 * Type of target service of a VPC Endpoint
 */
public enum TessellVpcEndpointTargetServiceTypeDTO {
  
  EC2("EC2"),
  
  CLOUDWATCH_LOGS("CLOUDWATCH_LOGS"),
  
  SECRET_MANAGER("SECRET_MANAGER"),
  
  SQS("SQS"),
  
  S3("S3"),
  
  TESSELL_PROXY_NLB("TESSELL_PROXY_NLB"),
  
  TESSELL_NATS("TESSELL_NATS"),
  
  TESSELL_PUSHPROX("TESSELL_PUSHPROX"),
  
  TESSELL_FRPS("TESSELL_FRPS"),
  
  TESSELL_MINIO("TESSELL_MINIO");

  private String value;

  TessellVpcEndpointTargetServiceTypeDTO(String value) {
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
  public static TessellVpcEndpointTargetServiceTypeDTO fromValue(String value) {
    for (TessellVpcEndpointTargetServiceTypeDTO b : TessellVpcEndpointTargetServiceTypeDTO.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

