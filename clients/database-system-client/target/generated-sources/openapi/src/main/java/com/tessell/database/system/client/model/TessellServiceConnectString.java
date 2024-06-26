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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.database.system.client.model.ConnectStringType;
import com.tessell.database.system.client.model.ConnectStringUsageType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DB Service connect string info
 */
@ApiModel(description = "DB Service connect string info")
@JsonPropertyOrder({
  TessellServiceConnectString.JSON_PROPERTY_TYPE,
  TessellServiceConnectString.JSON_PROPERTY_USAGE_TYPE,
  TessellServiceConnectString.JSON_PROPERTY_CONNECT_DESCRIPTOR,
  TessellServiceConnectString.JSON_PROPERTY_ENDPOINT,
  TessellServiceConnectString.JSON_PROPERTY_MASTER_USER,
  TessellServiceConnectString.JSON_PROPERTY_SERVICE_PORT
})
@JsonTypeName("TessellServiceConnectString")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceConnectString {
  public static final String JSON_PROPERTY_TYPE = "type";
  private ConnectStringType type;

  public static final String JSON_PROPERTY_USAGE_TYPE = "usageType";
  private ConnectStringUsageType usageType;

  public static final String JSON_PROPERTY_CONNECT_DESCRIPTOR = "connectDescriptor";
  private String connectDescriptor;

  public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
  private String endpoint;

  public static final String JSON_PROPERTY_MASTER_USER = "masterUser";
  private String masterUser;

  public static final String JSON_PROPERTY_SERVICE_PORT = "servicePort";
  private Integer servicePort;


  public TessellServiceConnectString type(ConnectStringType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConnectStringType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(ConnectStringType type) {
    this.type = type;
  }


  public TessellServiceConnectString usageType(ConnectStringUsageType usageType) {
    
    this.usageType = usageType;
    return this;
  }

   /**
   * Get usageType
   * @return usageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConnectStringUsageType getUsageType() {
    return usageType;
  }


  @JsonProperty(JSON_PROPERTY_USAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsageType(ConnectStringUsageType usageType) {
    this.usageType = usageType;
  }


  public TessellServiceConnectString connectDescriptor(String connectDescriptor) {
    
    this.connectDescriptor = connectDescriptor;
    return this;
  }

   /**
   * The connection description for the DB Service
   * @return connectDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The connection description for the DB Service")
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


  public TessellServiceConnectString endpoint(String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * The connection end point for the DB Service
   * @return endpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The connection end point for the DB Service")
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


  public TessellServiceConnectString masterUser(String masterUser) {
    
    this.masterUser = masterUser;
    return this;
  }

   /**
   * The master user name for the DB Service
   * @return masterUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The master user name for the DB Service")
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


  public TessellServiceConnectString servicePort(Integer servicePort) {
    
    this.servicePort = servicePort;
    return this;
  }

   /**
   * The connection port for the DB Service
   * minimum: 0
   * @return servicePort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The connection port for the DB Service")
  @JsonProperty(JSON_PROPERTY_SERVICE_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getServicePort() {
    return servicePort;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServicePort(Integer servicePort) {
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
    TessellServiceConnectString tessellServiceConnectString = (TessellServiceConnectString) o;
    return Objects.equals(this.type, tessellServiceConnectString.type) &&
        Objects.equals(this.usageType, tessellServiceConnectString.usageType) &&
        Objects.equals(this.connectDescriptor, tessellServiceConnectString.connectDescriptor) &&
        Objects.equals(this.endpoint, tessellServiceConnectString.endpoint) &&
        Objects.equals(this.masterUser, tessellServiceConnectString.masterUser) &&
        Objects.equals(this.servicePort, tessellServiceConnectString.servicePort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, usageType, connectDescriptor, endpoint, masterUser, servicePort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceConnectString {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    connectDescriptor: ").append(toIndentedString(connectDescriptor)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    masterUser: ").append(toIndentedString(masterUser)).append("\n");
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

