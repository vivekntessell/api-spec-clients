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
import com.tessell.database.system.client.model.CommonResizeConfig;
import com.tessell.database.system.client.model.InstanceResizeConfigAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * InstanceResizeConfig
 */
@JsonPropertyOrder({
  InstanceResizeConfig.JSON_PROPERTY_COMPUTE_TYPE,
  InstanceResizeConfig.JSON_PROPERTY_PARAMETER_PROFILE_ID,
  InstanceResizeConfig.JSON_PROPERTY_IOPS,
  InstanceResizeConfig.JSON_PROPERTY_THROUGHPUT,
  InstanceResizeConfig.JSON_PROPERTY_INSTANCE_ID
})
@JsonTypeName("InstanceResizeConfig")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstanceResizeConfig {
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


  public InstanceResizeConfig computeType(String computeType) {
    
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


  public InstanceResizeConfig parameterProfileId(UUID parameterProfileId) {
    
    this.parameterProfileId = parameterProfileId;
    return this;
  }

   /**
   * Mandatory when providing compute type
   * @return parameterProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mandatory when providing compute type")
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


  public InstanceResizeConfig iops(Long iops) {
    
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


  public InstanceResizeConfig throughput(Integer throughput) {
    
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


  public InstanceResizeConfig instanceId(UUID instanceId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceResizeConfig instanceResizeConfig = (InstanceResizeConfig) o;
    return Objects.equals(this.computeType, instanceResizeConfig.computeType) &&
        Objects.equals(this.parameterProfileId, instanceResizeConfig.parameterProfileId) &&
        Objects.equals(this.iops, instanceResizeConfig.iops) &&
        Objects.equals(this.throughput, instanceResizeConfig.throughput) &&
        Objects.equals(this.instanceId, instanceResizeConfig.instanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computeType, parameterProfileId, iops, throughput, instanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceResizeConfig {\n");
    sb.append("    computeType: ").append(toIndentedString(computeType)).append("\n");
    sb.append("    parameterProfileId: ").append(toIndentedString(parameterProfileId)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
