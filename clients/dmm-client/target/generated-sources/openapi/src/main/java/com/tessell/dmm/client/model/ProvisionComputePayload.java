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
import com.tessell.dmm.client.model.TessellServiceInstanceRole;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * ProvisionComputePayload
 */
@JsonPropertyOrder({
  ProvisionComputePayload.JSON_PROPERTY_REGION,
  ProvisionComputePayload.JSON_PROPERTY_AVAILABILITY_ZONE,
  ProvisionComputePayload.JSON_PROPERTY_ROLE,
  ProvisionComputePayload.JSON_PROPERTY_VPC,
  ProvisionComputePayload.JSON_PROPERTY_COMPUTE_TYPE,
  ProvisionComputePayload.JSON_PROPERTY_COMPUTE_ID,
  ProvisionComputePayload.JSON_PROPERTY_TIMEZONE
})
@JsonTypeName("ProvisionComputePayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProvisionComputePayload {
  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_AVAILABILITY_ZONE = "availabilityZone";
  private String availabilityZone;

  public static final String JSON_PROPERTY_ROLE = "role";
  private TessellServiceInstanceRole role;

  public static final String JSON_PROPERTY_VPC = "vpc";
  private String vpc;

  public static final String JSON_PROPERTY_COMPUTE_TYPE = "computeType";
  private String computeType;

  public static final String JSON_PROPERTY_COMPUTE_ID = "computeId";
  private UUID computeId;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone = "UTC";


  public ProvisionComputePayload region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The region in which the compute is to be provisioned
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The region in which the compute is to be provisioned")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  public ProvisionComputePayload availabilityZone(String availabilityZone) {
    
    this.availabilityZone = availabilityZone;
    return this;
  }

   /**
   * The availability-zone in which the compute is to be provisioned
   * @return availabilityZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The availability-zone in which the compute is to be provisioned")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAvailabilityZone() {
    return availabilityZone;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }


  public ProvisionComputePayload role(TessellServiceInstanceRole role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceInstanceRole getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(TessellServiceInstanceRole role) {
    this.role = role;
  }


  public ProvisionComputePayload vpc(String vpc) {
    
    this.vpc = vpc;
    return this;
  }

   /**
   * The VPC to be used for provisioning the compute resource
   * @return vpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The VPC to be used for provisioning the compute resource")
  @JsonProperty(JSON_PROPERTY_VPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVpc() {
    return vpc;
  }


  @JsonProperty(JSON_PROPERTY_VPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpc(String vpc) {
    this.vpc = vpc;
  }


  public ProvisionComputePayload computeType(String computeType) {
    
    this.computeType = computeType;
    return this;
  }

   /**
   * The compute-type to be used for provisioning the compute resource
   * @return computeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The compute-type to be used for provisioning the compute resource")
  @JsonProperty(JSON_PROPERTY_COMPUTE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComputeType() {
    return computeType;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComputeType(String computeType) {
    this.computeType = computeType;
  }


  public ProvisionComputePayload computeId(UUID computeId) {
    
    this.computeId = computeId;
    return this;
  }

   /**
   * Specify the compute resource if it has to be shared
   * @return computeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify the compute resource if it has to be shared")
  @JsonProperty(JSON_PROPERTY_COMPUTE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getComputeId() {
    return computeId;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComputeId(UUID computeId) {
    this.computeId = computeId;
  }


  public ProvisionComputePayload timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * The timezone detail
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timezone detail")
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionComputePayload provisionComputePayload = (ProvisionComputePayload) o;
    return Objects.equals(this.region, provisionComputePayload.region) &&
        Objects.equals(this.availabilityZone, provisionComputePayload.availabilityZone) &&
        Objects.equals(this.role, provisionComputePayload.role) &&
        Objects.equals(this.vpc, provisionComputePayload.vpc) &&
        Objects.equals(this.computeType, provisionComputePayload.computeType) &&
        Objects.equals(this.computeId, provisionComputePayload.computeId) &&
        Objects.equals(this.timezone, provisionComputePayload.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, availabilityZone, role, vpc, computeType, computeId, timezone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionComputePayload {\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
    sb.append("    computeType: ").append(toIndentedString(computeType)).append("\n");
    sb.append("    computeId: ").append(toIndentedString(computeId)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
