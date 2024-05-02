/*
 * Tessell Availability Machine REST Web Services' API Documentation
 * Tessell Availability Machine REST Web Services' Api Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sagar.sontakke@tessell.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.dmm.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellServiceDatabaseConnectString
 */
@JsonPropertyOrder({
  TessellServiceDatabaseConnectString.JSON_PROPERTY_CONNECT_DESCRIPTOR,
  TessellServiceDatabaseConnectString.JSON_PROPERTY_MASTER_USER,
  TessellServiceDatabaseConnectString.JSON_PROPERTY_ENDPOINT,
  TessellServiceDatabaseConnectString.JSON_PROPERTY_SERVICE_PORT
})
@JsonTypeName("TessellServiceDatabaseConnectString")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceDatabaseConnectString {
  public static final String JSON_PROPERTY_CONNECT_DESCRIPTOR = "connectDescriptor";
  private String connectDescriptor;

  public static final String JSON_PROPERTY_MASTER_USER = "masterUser";
  private String masterUser;

  public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
  private String endpoint;

  public static final String JSON_PROPERTY_SERVICE_PORT = "servicePort";
  private String servicePort;


  public TessellServiceDatabaseConnectString connectDescriptor(String connectDescriptor) {
    
    this.connectDescriptor = connectDescriptor;
    return this;
  }

   /**
   * Get connectDescriptor
   * @return connectDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECT_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectDescriptor() {
    return connectDescriptor;
  }


  @JsonProperty(JSON_PROPERTY_CONNECT_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectDescriptor(String connectDescriptor) {
    this.connectDescriptor = connectDescriptor;
  }


  public TessellServiceDatabaseConnectString masterUser(String masterUser) {
    
    this.masterUser = masterUser;
    return this;
  }

   /**
   * Get masterUser
   * @return masterUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MASTER_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMasterUser() {
    return masterUser;
  }


  @JsonProperty(JSON_PROPERTY_MASTER_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMasterUser(String masterUser) {
    this.masterUser = masterUser;
  }


  public TessellServiceDatabaseConnectString endpoint(String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndpoint() {
    return endpoint;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  public TessellServiceDatabaseConnectString servicePort(String servicePort) {
    
    this.servicePort = servicePort;
    return this;
  }

   /**
   * Get servicePort
   * @return servicePort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServicePort() {
    return servicePort;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServicePort(String servicePort) {
    this.servicePort = servicePort;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellServiceDatabaseConnectString tessellServiceDatabaseConnectString = (TessellServiceDatabaseConnectString) o;
    return Objects.equals(this.connectDescriptor, tessellServiceDatabaseConnectString.connectDescriptor) &&
        Objects.equals(this.masterUser, tessellServiceDatabaseConnectString.masterUser) &&
        Objects.equals(this.endpoint, tessellServiceDatabaseConnectString.endpoint) &&
        Objects.equals(this.servicePort, tessellServiceDatabaseConnectString.servicePort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectDescriptor, masterUser, endpoint, servicePort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceDatabaseConnectString {\n");
    sb.append("    connectDescriptor: ").append(toIndentedString(connectDescriptor)).append("\n");
    sb.append("    masterUser: ").append(toIndentedString(masterUser)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    servicePort: ").append(toIndentedString(servicePort)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

