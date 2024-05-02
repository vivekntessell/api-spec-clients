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
import com.tessell.database.system.client.model.ProvisionGenericInfo;
import com.tessell.database.system.client.model.TessellServiceConnectivityInfoPayload;
import com.tessell.database.system.client.model.TessellServiceInfrastructurePayload;
import com.tessell.database.system.client.model.TessellServiceProvisionInfoInfraReservationInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DB Service&#39;s provisioning information
 */
@ApiModel(description = "DB Service's provisioning information")
@JsonPropertyOrder({
  TessellServiceProvisionInfo.JSON_PROPERTY_DATA,
  TessellServiceProvisionInfo.JSON_PROPERTY_PROVISION_GENERIC_INFO,
  TessellServiceProvisionInfo.JSON_PROPERTY_INFRASTRUCTURE,
  TessellServiceProvisionInfo.JSON_PROPERTY_SERVICE_CONNECTIVITY,
  TessellServiceProvisionInfo.JSON_PROPERTY_INFRA_RESERVATION_INFO
})
@JsonTypeName("TessellServiceProvisionInfo")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceProvisionInfo {
  public static final String JSON_PROPERTY_DATA = "data";
  private Object data;

  public static final String JSON_PROPERTY_PROVISION_GENERIC_INFO = "provisionGenericInfo";
  private ProvisionGenericInfo provisionGenericInfo;

  public static final String JSON_PROPERTY_INFRASTRUCTURE = "infrastructure";
  private TessellServiceInfrastructurePayload infrastructure;

  public static final String JSON_PROPERTY_SERVICE_CONNECTIVITY = "serviceConnectivity";
  private TessellServiceConnectivityInfoPayload serviceConnectivity;

  public static final String JSON_PROPERTY_INFRA_RESERVATION_INFO = "infraReservationInfo";
  private TessellServiceProvisionInfoInfraReservationInfo infraReservationInfo;


  public TessellServiceProvisionInfo data(Object data) {
    
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


  public TessellServiceProvisionInfo provisionGenericInfo(ProvisionGenericInfo provisionGenericInfo) {
    
    this.provisionGenericInfo = provisionGenericInfo;
    return this;
  }

   /**
   * Get provisionGenericInfo
   * @return provisionGenericInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROVISION_GENERIC_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProvisionGenericInfo getProvisionGenericInfo() {
    return provisionGenericInfo;
  }


  @JsonProperty(JSON_PROPERTY_PROVISION_GENERIC_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvisionGenericInfo(ProvisionGenericInfo provisionGenericInfo) {
    this.provisionGenericInfo = provisionGenericInfo;
  }


  public TessellServiceProvisionInfo infrastructure(TessellServiceInfrastructurePayload infrastructure) {
    
    this.infrastructure = infrastructure;
    return this;
  }

   /**
   * Get infrastructure
   * @return infrastructure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INFRASTRUCTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceInfrastructurePayload getInfrastructure() {
    return infrastructure;
  }


  @JsonProperty(JSON_PROPERTY_INFRASTRUCTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfrastructure(TessellServiceInfrastructurePayload infrastructure) {
    this.infrastructure = infrastructure;
  }


  public TessellServiceProvisionInfo serviceConnectivity(TessellServiceConnectivityInfoPayload serviceConnectivity) {
    
    this.serviceConnectivity = serviceConnectivity;
    return this;
  }

   /**
   * Get serviceConnectivity
   * @return serviceConnectivity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_CONNECTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceConnectivityInfoPayload getServiceConnectivity() {
    return serviceConnectivity;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_CONNECTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceConnectivity(TessellServiceConnectivityInfoPayload serviceConnectivity) {
    this.serviceConnectivity = serviceConnectivity;
  }


  public TessellServiceProvisionInfo infraReservationInfo(TessellServiceProvisionInfoInfraReservationInfo infraReservationInfo) {
    
    this.infraReservationInfo = infraReservationInfo;
    return this;
  }

   /**
   * Get infraReservationInfo
   * @return infraReservationInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INFRA_RESERVATION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceProvisionInfoInfraReservationInfo getInfraReservationInfo() {
    return infraReservationInfo;
  }


  @JsonProperty(JSON_PROPERTY_INFRA_RESERVATION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfraReservationInfo(TessellServiceProvisionInfoInfraReservationInfo infraReservationInfo) {
    this.infraReservationInfo = infraReservationInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellServiceProvisionInfo tessellServiceProvisionInfo = (TessellServiceProvisionInfo) o;
    return Objects.equals(this.data, tessellServiceProvisionInfo.data) &&
        Objects.equals(this.provisionGenericInfo, tessellServiceProvisionInfo.provisionGenericInfo) &&
        Objects.equals(this.infrastructure, tessellServiceProvisionInfo.infrastructure) &&
        Objects.equals(this.serviceConnectivity, tessellServiceProvisionInfo.serviceConnectivity) &&
        Objects.equals(this.infraReservationInfo, tessellServiceProvisionInfo.infraReservationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, provisionGenericInfo, infrastructure, serviceConnectivity, infraReservationInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceProvisionInfo {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    provisionGenericInfo: ").append(toIndentedString(provisionGenericInfo)).append("\n");
    sb.append("    infrastructure: ").append(toIndentedString(infrastructure)).append("\n");
    sb.append("    serviceConnectivity: ").append(toIndentedString(serviceConnectivity)).append("\n");
    sb.append("    infraReservationInfo: ").append(toIndentedString(infraReservationInfo)).append("\n");
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

