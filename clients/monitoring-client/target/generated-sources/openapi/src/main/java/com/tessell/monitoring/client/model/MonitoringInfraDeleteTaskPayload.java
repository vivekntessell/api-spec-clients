/*
 * Tessell Monitoring Service API
 * Monitoring API
 *
 * The version of the OpenAPI document: v1beta
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.monitoring.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.monitoring.client.model.CloudType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * MonitoringInfraDeleteTaskPayload
 */
@JsonPropertyOrder({
  MonitoringInfraDeleteTaskPayload.JSON_PROPERTY_TENANT_ID,
  MonitoringInfraDeleteTaskPayload.JSON_PROPERTY_SUBSCRIPTION_ID,
  MonitoringInfraDeleteTaskPayload.JSON_PROPERTY_CLOUD_TYPE,
  MonitoringInfraDeleteTaskPayload.JSON_PROPERTY_CLOUD_ACCOUNT_ID,
  MonitoringInfraDeleteTaskPayload.JSON_PROPERTY_REGION,
  MonitoringInfraDeleteTaskPayload.JSON_PROPERTY_MONITORING_DEPLOYMENT_OPS_D_T_O_ID
})
@JsonTypeName("MonitoringInfraDeleteTaskPayload")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:03.958037+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MonitoringInfraDeleteTaskPayload {
  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private UUID tenantId;

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private UUID subscriptionId;

  public static final String JSON_PROPERTY_CLOUD_TYPE = "cloudType";
  private CloudType cloudType;

  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_ID = "cloudAccountId";
  private UUID cloudAccountId;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_MONITORING_DEPLOYMENT_OPS_D_T_O_ID = "monitoringDeploymentOpsDTOId";
  private UUID monitoringDeploymentOpsDTOId;


  public MonitoringInfraDeleteTaskPayload tenantId(UUID tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }


  public MonitoringInfraDeleteTaskPayload subscriptionId(UUID subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getSubscriptionId() {
    return subscriptionId;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public MonitoringInfraDeleteTaskPayload cloudType(CloudType cloudType) {
    
    this.cloudType = cloudType;
    return this;
  }

   /**
   * Get cloudType
   * @return cloudType
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CloudType getCloudType() {
    return cloudType;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCloudType(CloudType cloudType) {
    this.cloudType = cloudType;
  }


  public MonitoringInfraDeleteTaskPayload cloudAccountId(UUID cloudAccountId) {
    
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * Get cloudAccountId
   * @return cloudAccountId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getCloudAccountId() {
    return cloudAccountId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCloudAccountId(UUID cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }


  public MonitoringInfraDeleteTaskPayload region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRegion(String region) {
    this.region = region;
  }


  public MonitoringInfraDeleteTaskPayload monitoringDeploymentOpsDTOId(UUID monitoringDeploymentOpsDTOId) {
    
    this.monitoringDeploymentOpsDTOId = monitoringDeploymentOpsDTOId;
    return this;
  }

   /**
   * Get monitoringDeploymentOpsDTOId
   * @return monitoringDeploymentOpsDTOId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MONITORING_DEPLOYMENT_OPS_D_T_O_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getMonitoringDeploymentOpsDTOId() {
    return monitoringDeploymentOpsDTOId;
  }


  @JsonProperty(JSON_PROPERTY_MONITORING_DEPLOYMENT_OPS_D_T_O_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMonitoringDeploymentOpsDTOId(UUID monitoringDeploymentOpsDTOId) {
    this.monitoringDeploymentOpsDTOId = monitoringDeploymentOpsDTOId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringInfraDeleteTaskPayload monitoringInfraDeleteTaskPayload = (MonitoringInfraDeleteTaskPayload) o;
    return Objects.equals(this.tenantId, monitoringInfraDeleteTaskPayload.tenantId) &&
        Objects.equals(this.subscriptionId, monitoringInfraDeleteTaskPayload.subscriptionId) &&
        Objects.equals(this.cloudType, monitoringInfraDeleteTaskPayload.cloudType) &&
        Objects.equals(this.cloudAccountId, monitoringInfraDeleteTaskPayload.cloudAccountId) &&
        Objects.equals(this.region, monitoringInfraDeleteTaskPayload.region) &&
        Objects.equals(this.monitoringDeploymentOpsDTOId, monitoringInfraDeleteTaskPayload.monitoringDeploymentOpsDTOId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, subscriptionId, cloudType, cloudAccountId, region, monitoringDeploymentOpsDTOId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringInfraDeleteTaskPayload {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    monitoringDeploymentOpsDTOId: ").append(toIndentedString(monitoringDeploymentOpsDTOId)).append("\n");
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

