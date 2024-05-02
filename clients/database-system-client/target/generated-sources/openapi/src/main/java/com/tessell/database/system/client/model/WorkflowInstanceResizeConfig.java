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
import com.tessell.database.system.client.model.DbLicenseInfo;
import com.tessell.database.system.client.model.InstanceResizeConfig;
import com.tessell.database.system.client.model.WorkflowInstanceResizeConfigAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * WorkflowInstanceResizeConfig
 */
@JsonPropertyOrder({
  WorkflowInstanceResizeConfig.JSON_PROPERTY_COMPUTE_TYPE,
  WorkflowInstanceResizeConfig.JSON_PROPERTY_PARAMETER_PROFILE_ID,
  WorkflowInstanceResizeConfig.JSON_PROPERTY_IOPS,
  WorkflowInstanceResizeConfig.JSON_PROPERTY_THROUGHPUT,
  WorkflowInstanceResizeConfig.JSON_PROPERTY_INSTANCE_ID,
  WorkflowInstanceResizeConfig.JSON_PROPERTY_STORAGE,
  WorkflowInstanceResizeConfig.JSON_PROPERTY_CURRENT_LICENSE_INFO,
  WorkflowInstanceResizeConfig.JSON_PROPERTY_NEW_LICENSE_INFO
})
@JsonTypeName("WorkflowInstanceResizeConfig")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkflowInstanceResizeConfig {
  public static final String JSON_PROPERTY_COMPUTE_TYPE = "computeType";
  private String computeType;

  public static final String JSON_PROPERTY_PARAMETER_PROFILE_ID = "parameterProfileId";
  private UUID parameterProfileId;

  public static final String JSON_PROPERTY_IOPS = "iops";
  private Long iops;

  public static final String JSON_PROPERTY_THROUGHPUT = "throughput";
  private Integer throughput;

  public static final String JSON_PROPERTY_INSTANCE_ID = "instanceId";
  private UUID instanceId;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private Long storage;

  public static final String JSON_PROPERTY_CURRENT_LICENSE_INFO = "currentLicenseInfo";
  private DbLicenseInfo currentLicenseInfo;

  public static final String JSON_PROPERTY_NEW_LICENSE_INFO = "newLicenseInfo";
  private DbLicenseInfo newLicenseInfo;


  public WorkflowInstanceResizeConfig computeType(String computeType) {
    
    this.computeType = computeType;
    return this;
  }

   /**
   * The new compute type for the service/instance
   * @return computeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The new compute type for the service/instance")
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


  public WorkflowInstanceResizeConfig parameterProfileId(UUID parameterProfileId) {
    
    this.parameterProfileId = parameterProfileId;
    return this;
  }

   /**
   * Get parameterProfileId
   * @return parameterProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARAMETER_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getParameterProfileId() {
    return parameterProfileId;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameterProfileId(UUID parameterProfileId) {
    this.parameterProfileId = parameterProfileId;
  }


  public WorkflowInstanceResizeConfig iops(Long iops) {
    
    this.iops = iops;
    return this;
  }

   /**
   * The new IOPS for the service/instance
   * @return iops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The new IOPS for the service/instance")
  @JsonProperty(JSON_PROPERTY_IOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIops() {
    return iops;
  }


  @JsonProperty(JSON_PROPERTY_IOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIops(Long iops) {
    this.iops = iops;
  }


  public WorkflowInstanceResizeConfig throughput(Integer throughput) {
    
    this.throughput = throughput;
    return this;
  }

   /**
   * The new Throughput for the service/instance
   * @return throughput
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The new Throughput for the service/instance")
  @JsonProperty(JSON_PROPERTY_THROUGHPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getThroughput() {
    return throughput;
  }


  @JsonProperty(JSON_PROPERTY_THROUGHPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThroughput(Integer throughput) {
    this.throughput = throughput;
  }


  public WorkflowInstanceResizeConfig instanceId(UUID instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * UUID for the instance that needs to be resized.
   * @return instanceId
  **/
  @ApiModelProperty(required = true, value = "UUID for the instance that needs to be resized.")
  @JsonProperty(JSON_PROPERTY_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getInstanceId() {
    return instanceId;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstanceId(UUID instanceId) {
    this.instanceId = instanceId;
  }


  public WorkflowInstanceResizeConfig storage(Long storage) {
    
    this.storage = storage;
    return this;
  }

   /**
   * The new storage (in bytes) for the service
   * @return storage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The new storage (in bytes) for the service")
  @JsonProperty(JSON_PROPERTY_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStorage() {
    return storage;
  }


  @JsonProperty(JSON_PROPERTY_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStorage(Long storage) {
    this.storage = storage;
  }


  public WorkflowInstanceResizeConfig currentLicenseInfo(DbLicenseInfo currentLicenseInfo) {
    
    this.currentLicenseInfo = currentLicenseInfo;
    return this;
  }

   /**
   * Get currentLicenseInfo
   * @return currentLicenseInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENT_LICENSE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbLicenseInfo getCurrentLicenseInfo() {
    return currentLicenseInfo;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_LICENSE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentLicenseInfo(DbLicenseInfo currentLicenseInfo) {
    this.currentLicenseInfo = currentLicenseInfo;
  }


  public WorkflowInstanceResizeConfig newLicenseInfo(DbLicenseInfo newLicenseInfo) {
    
    this.newLicenseInfo = newLicenseInfo;
    return this;
  }

   /**
   * Get newLicenseInfo
   * @return newLicenseInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEW_LICENSE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbLicenseInfo getNewLicenseInfo() {
    return newLicenseInfo;
  }


  @JsonProperty(JSON_PROPERTY_NEW_LICENSE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewLicenseInfo(DbLicenseInfo newLicenseInfo) {
    this.newLicenseInfo = newLicenseInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowInstanceResizeConfig workflowInstanceResizeConfig = (WorkflowInstanceResizeConfig) o;
    return Objects.equals(this.computeType, workflowInstanceResizeConfig.computeType) &&
        Objects.equals(this.parameterProfileId, workflowInstanceResizeConfig.parameterProfileId) &&
        Objects.equals(this.iops, workflowInstanceResizeConfig.iops) &&
        Objects.equals(this.throughput, workflowInstanceResizeConfig.throughput) &&
        Objects.equals(this.instanceId, workflowInstanceResizeConfig.instanceId) &&
        Objects.equals(this.storage, workflowInstanceResizeConfig.storage) &&
        Objects.equals(this.currentLicenseInfo, workflowInstanceResizeConfig.currentLicenseInfo) &&
        Objects.equals(this.newLicenseInfo, workflowInstanceResizeConfig.newLicenseInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computeType, parameterProfileId, iops, throughput, instanceId, storage, currentLicenseInfo, newLicenseInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowInstanceResizeConfig {\n");
    sb.append("    computeType: ").append(toIndentedString(computeType)).append("\n");
    sb.append("    parameterProfileId: ").append(toIndentedString(parameterProfileId)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    currentLicenseInfo: ").append(toIndentedString(currentLicenseInfo)).append("\n");
    sb.append("    newLicenseInfo: ").append(toIndentedString(newLicenseInfo)).append("\n");
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

