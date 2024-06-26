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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * CloneDatabaseInfrastructurePayload
 */
@JsonPropertyOrder({
  CloneDatabaseInfrastructurePayload.JSON_PROPERTY_AVAILABILITY_ZONE,
  CloneDatabaseInfrastructurePayload.JSON_PROPERTY_CLOUD,
  CloneDatabaseInfrastructurePayload.JSON_PROPERTY_COMPUTE_TYPE,
  CloneDatabaseInfrastructurePayload.JSON_PROPERTY_VPC_NAME,
  CloneDatabaseInfrastructurePayload.JSON_PROPERTY_REGION,
  CloneDatabaseInfrastructurePayload.JSON_PROPERTY_DATABASE_PORT,
  CloneDatabaseInfrastructurePayload.JSON_PROPERTY_ENABLE_PUBLIC_ACCESS,
  CloneDatabaseInfrastructurePayload.JSON_PROPERTY_ALLOWED_IP_ADDRESSES,
  CloneDatabaseInfrastructurePayload.JSON_PROPERTY_ADDITIONAL_STORAGE
})
@JsonTypeName("CloneDatabaseInfrastructurePayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CloneDatabaseInfrastructurePayload {
  public static final String JSON_PROPERTY_AVAILABILITY_ZONE = "availabilityZone";
  private String availabilityZone;

  public static final String JSON_PROPERTY_CLOUD = "cloud";
  private String cloud;

  public static final String JSON_PROPERTY_COMPUTE_TYPE = "computeType";
  private String computeType;

  public static final String JSON_PROPERTY_VPC_NAME = "vpcName";
  private String vpcName;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_DATABASE_PORT = "databasePort";
  private Integer databasePort;

  public static final String JSON_PROPERTY_ENABLE_PUBLIC_ACCESS = "enablePublicAccess";
  private Boolean enablePublicAccess;

  public static final String JSON_PROPERTY_ALLOWED_IP_ADDRESSES = "allowedIpAddresses";
  private List<String> allowedIpAddresses = null;

  public static final String JSON_PROPERTY_ADDITIONAL_STORAGE = "additionalStorage";
  private Integer additionalStorage;


  public CloneDatabaseInfrastructurePayload availabilityZone(String availabilityZone) {
    
    this.availabilityZone = availabilityZone;
    return this;
  }

   /**
   * Get availabilityZone
   * @return availabilityZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public CloneDatabaseInfrastructurePayload cloud(String cloud) {
    
    this.cloud = cloud;
    return this;
  }

   /**
   * Get cloud
   * @return cloud
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloud() {
    return cloud;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloud(String cloud) {
    this.cloud = cloud;
  }


  public CloneDatabaseInfrastructurePayload computeType(String computeType) {
    
    this.computeType = computeType;
    return this;
  }

   /**
   * Get computeType
   * @return computeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public CloneDatabaseInfrastructurePayload vpcName(String vpcName) {
    
    this.vpcName = vpcName;
    return this;
  }

   /**
   * Get vpcName
   * @return vpcName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VPC_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVpcName() {
    return vpcName;
  }


  @JsonProperty(JSON_PROPERTY_VPC_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpcName(String vpcName) {
    this.vpcName = vpcName;
  }


  public CloneDatabaseInfrastructurePayload region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public CloneDatabaseInfrastructurePayload databasePort(Integer databasePort) {
    
    this.databasePort = databasePort;
    return this;
  }

   /**
   * Get databasePort
   * @return databasePort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATABASE_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDatabasePort() {
    return databasePort;
  }


  @JsonProperty(JSON_PROPERTY_DATABASE_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatabasePort(Integer databasePort) {
    this.databasePort = databasePort;
  }


  public CloneDatabaseInfrastructurePayload enablePublicAccess(Boolean enablePublicAccess) {
    
    this.enablePublicAccess = enablePublicAccess;
    return this;
  }

   /**
   * Get enablePublicAccess
   * @return enablePublicAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLE_PUBLIC_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnablePublicAccess() {
    return enablePublicAccess;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_PUBLIC_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnablePublicAccess(Boolean enablePublicAccess) {
    this.enablePublicAccess = enablePublicAccess;
  }


  public CloneDatabaseInfrastructurePayload allowedIpAddresses(List<String> allowedIpAddresses) {
    
    this.allowedIpAddresses = allowedIpAddresses;
    return this;
  }

  public CloneDatabaseInfrastructurePayload addAllowedIpAddressesItem(String allowedIpAddressesItem) {
    if (this.allowedIpAddresses == null) {
      this.allowedIpAddresses = new ArrayList<>();
    }
    this.allowedIpAddresses.add(allowedIpAddressesItem);
    return this;
  }

   /**
   * Get allowedIpAddresses
   * @return allowedIpAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALLOWED_IP_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAllowedIpAddresses() {
    return allowedIpAddresses;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_IP_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedIpAddresses(List<String> allowedIpAddresses) {
    this.allowedIpAddresses = allowedIpAddresses;
  }


  public CloneDatabaseInfrastructurePayload additionalStorage(Integer additionalStorage) {
    
    this.additionalStorage = additionalStorage;
    return this;
  }

   /**
   * Get additionalStorage
   * @return additionalStorage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAdditionalStorage() {
    return additionalStorage;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalStorage(Integer additionalStorage) {
    this.additionalStorage = additionalStorage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloneDatabaseInfrastructurePayload cloneDatabaseInfrastructurePayload = (CloneDatabaseInfrastructurePayload) o;
    return Objects.equals(this.availabilityZone, cloneDatabaseInfrastructurePayload.availabilityZone) &&
        Objects.equals(this.cloud, cloneDatabaseInfrastructurePayload.cloud) &&
        Objects.equals(this.computeType, cloneDatabaseInfrastructurePayload.computeType) &&
        Objects.equals(this.vpcName, cloneDatabaseInfrastructurePayload.vpcName) &&
        Objects.equals(this.region, cloneDatabaseInfrastructurePayload.region) &&
        Objects.equals(this.databasePort, cloneDatabaseInfrastructurePayload.databasePort) &&
        Objects.equals(this.enablePublicAccess, cloneDatabaseInfrastructurePayload.enablePublicAccess) &&
        Objects.equals(this.allowedIpAddresses, cloneDatabaseInfrastructurePayload.allowedIpAddresses) &&
        Objects.equals(this.additionalStorage, cloneDatabaseInfrastructurePayload.additionalStorage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityZone, cloud, computeType, vpcName, region, databasePort, enablePublicAccess, allowedIpAddresses, additionalStorage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloneDatabaseInfrastructurePayload {\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
    sb.append("    computeType: ").append(toIndentedString(computeType)).append("\n");
    sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    databasePort: ").append(toIndentedString(databasePort)).append("\n");
    sb.append("    enablePublicAccess: ").append(toIndentedString(enablePublicAccess)).append("\n");
    sb.append("    allowedIpAddresses: ").append(toIndentedString(allowedIpAddresses)).append("\n");
    sb.append("    additionalStorage: ").append(toIndentedString(additionalStorage)).append("\n");
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

