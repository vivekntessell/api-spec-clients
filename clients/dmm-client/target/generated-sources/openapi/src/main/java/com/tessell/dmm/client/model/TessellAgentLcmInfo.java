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
 * TessellAgentLcmInfo
 */
@JsonPropertyOrder({
  TessellAgentLcmInfo.JSON_PROPERTY_COMPUTE_RESOURCE_INFO,
  TessellAgentLcmInfo.JSON_PROPERTY_SERVICE_INFO,
  TessellAgentLcmInfo.JSON_PROPERTY_INSTANCE_INFO,
  TessellAgentLcmInfo.JSON_PROPERTY_DATA
})
@JsonTypeName("TessellAgentLcmInfo")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellAgentLcmInfo {
  public static final String JSON_PROPERTY_COMPUTE_RESOURCE_INFO = "computeResourceInfo";
  private Object computeResourceInfo;

  public static final String JSON_PROPERTY_SERVICE_INFO = "serviceInfo";
  private Object serviceInfo;

  public static final String JSON_PROPERTY_INSTANCE_INFO = "instanceInfo";
  private Object instanceInfo;

  public static final String JSON_PROPERTY_DATA = "data";
  private Object data;


  public TessellAgentLcmInfo computeResourceInfo(Object computeResourceInfo) {
    
    this.computeResourceInfo = computeResourceInfo;
    return this;
  }

   /**
   * Get computeResourceInfo
   * @return computeResourceInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPUTE_RESOURCE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getComputeResourceInfo() {
    return computeResourceInfo;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTE_RESOURCE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComputeResourceInfo(Object computeResourceInfo) {
    this.computeResourceInfo = computeResourceInfo;
  }


  public TessellAgentLcmInfo serviceInfo(Object serviceInfo) {
    
    this.serviceInfo = serviceInfo;
    return this;
  }

   /**
   * Get serviceInfo
   * @return serviceInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getServiceInfo() {
    return serviceInfo;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceInfo(Object serviceInfo) {
    this.serviceInfo = serviceInfo;
  }


  public TessellAgentLcmInfo instanceInfo(Object instanceInfo) {
    
    this.instanceInfo = instanceInfo;
    return this;
  }

   /**
   * Get instanceInfo
   * @return instanceInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTANCE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getInstanceInfo() {
    return instanceInfo;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstanceInfo(Object instanceInfo) {
    this.instanceInfo = instanceInfo;
  }


  public TessellAgentLcmInfo data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(Object data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellAgentLcmInfo tessellAgentLcmInfo = (TessellAgentLcmInfo) o;
    return Objects.equals(this.computeResourceInfo, tessellAgentLcmInfo.computeResourceInfo) &&
        Objects.equals(this.serviceInfo, tessellAgentLcmInfo.serviceInfo) &&
        Objects.equals(this.instanceInfo, tessellAgentLcmInfo.instanceInfo) &&
        Objects.equals(this.data, tessellAgentLcmInfo.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computeResourceInfo, serviceInfo, instanceInfo, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellAgentLcmInfo {\n");
    sb.append("    computeResourceInfo: ").append(toIndentedString(computeResourceInfo)).append("\n");
    sb.append("    serviceInfo: ").append(toIndentedString(serviceInfo)).append("\n");
    sb.append("    instanceInfo: ").append(toIndentedString(instanceInfo)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

