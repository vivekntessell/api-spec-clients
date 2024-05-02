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
 * MonitoringInfraProvisionTaskPayload
 */
@JsonPropertyOrder({
  MonitoringInfraProvisionTaskPayload.JSON_PROPERTY_TENANT_ID,
  MonitoringInfraProvisionTaskPayload.JSON_PROPERTY_SUBSCRIPTION_ID,
  MonitoringInfraProvisionTaskPayload.JSON_PROPERTY_CLOUD_TYPE,
  MonitoringInfraProvisionTaskPayload.JSON_PROPERTY_REGION,
  MonitoringInfraProvisionTaskPayload.JSON_PROPERTY_VPC_ID,
  MonitoringInfraProvisionTaskPayload.JSON_PROPERTY_CLOUD_ACCOUNT_ID,
  MonitoringInfraProvisionTaskPayload.JSON_PROPERTY_ENCRYPTION_KEY_CLOUD_ID,
  MonitoringInfraProvisionTaskPayload.JSON_PROPERTY_COMPUTE_ID,
  MonitoringInfraProvisionTaskPayload.JSON_PROPERTY_VOLUME_SIZE,
  MonitoringInfraProvisionTaskPayload.JSON_PROPERTY_OWNER,
  MonitoringInfraProvisionTaskPayload.JSON_PROPERTY_SKIP_PROVISION_ROLLBACK
})
@JsonTypeName("MonitoringInfraProvisionTaskPayload")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:03.958037+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MonitoringInfraProvisionTaskPayload {
  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private UUID tenantId;

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private UUID subscriptionId;

  public static final String JSON_PROPERTY_CLOUD_TYPE = "cloudType";
  private CloudType cloudType;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_VPC_ID = "vpcId";
  private UUID vpcId;

  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_ID = "cloudAccountId";
  private UUID cloudAccountId;

  public static final String JSON_PROPERTY_ENCRYPTION_KEY_CLOUD_ID = "encryptionKeyCloudId";
  private String encryptionKeyCloudId;

  public static final String JSON_PROPERTY_COMPUTE_ID = "computeId";
  private UUID computeId;

  public static final String JSON_PROPERTY_VOLUME_SIZE = "volumeSize";
  private Integer volumeSize;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_SKIP_PROVISION_ROLLBACK = "skipProvisionRollback";
  private Boolean skipProvisionRollback;


  public MonitoringInfraProvisionTaskPayload tenantId(UUID tenantId) {
    
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


  public MonitoringInfraProvisionTaskPayload subscriptionId(UUID subscriptionId) {
    
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


  public MonitoringInfraProvisionTaskPayload cloudType(CloudType cloudType) {
    
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


  public MonitoringInfraProvisionTaskPayload region(String region) {
    
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


  public MonitoringInfraProvisionTaskPayload vpcId(UUID vpcId) {
    
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Get vpcId
   * @return vpcId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VPC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getVpcId() {
    return vpcId;
  }


  @JsonProperty(JSON_PROPERTY_VPC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVpcId(UUID vpcId) {
    this.vpcId = vpcId;
  }


  public MonitoringInfraProvisionTaskPayload cloudAccountId(UUID cloudAccountId) {
    
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


  public MonitoringInfraProvisionTaskPayload encryptionKeyCloudId(String encryptionKeyCloudId) {
    
    this.encryptionKeyCloudId = encryptionKeyCloudId;
    return this;
  }

   /**
   * Get encryptionKeyCloudId
   * @return encryptionKeyCloudId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENCRYPTION_KEY_CLOUD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncryptionKeyCloudId() {
    return encryptionKeyCloudId;
  }


  @JsonProperty(JSON_PROPERTY_ENCRYPTION_KEY_CLOUD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptionKeyCloudId(String encryptionKeyCloudId) {
    this.encryptionKeyCloudId = encryptionKeyCloudId;
  }


  public MonitoringInfraProvisionTaskPayload computeId(UUID computeId) {
    
    this.computeId = computeId;
    return this;
  }

   /**
   * Get computeId
   * @return computeId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COMPUTE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getComputeId() {
    return computeId;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setComputeId(UUID computeId) {
    this.computeId = computeId;
  }


  public MonitoringInfraProvisionTaskPayload volumeSize(Integer volumeSize) {
    
    this.volumeSize = volumeSize;
    return this;
  }

   /**
   * Get volumeSize
   * @return volumeSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOLUME_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVolumeSize() {
    return volumeSize;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolumeSize(Integer volumeSize) {
    this.volumeSize = volumeSize;
  }


  public MonitoringInfraProvisionTaskPayload owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOwner(String owner) {
    this.owner = owner;
  }


  public MonitoringInfraProvisionTaskPayload skipProvisionRollback(Boolean skipProvisionRollback) {
    
    this.skipProvisionRollback = skipProvisionRollback;
    return this;
  }

   /**
   * Get skipProvisionRollback
   * @return skipProvisionRollback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SKIP_PROVISION_ROLLBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSkipProvisionRollback() {
    return skipProvisionRollback;
  }


  @JsonProperty(JSON_PROPERTY_SKIP_PROVISION_ROLLBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkipProvisionRollback(Boolean skipProvisionRollback) {
    this.skipProvisionRollback = skipProvisionRollback;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitoringInfraProvisionTaskPayload monitoringInfraProvisionTaskPayload = (MonitoringInfraProvisionTaskPayload) o;
    return Objects.equals(this.tenantId, monitoringInfraProvisionTaskPayload.tenantId) &&
        Objects.equals(this.subscriptionId, monitoringInfraProvisionTaskPayload.subscriptionId) &&
        Objects.equals(this.cloudType, monitoringInfraProvisionTaskPayload.cloudType) &&
        Objects.equals(this.region, monitoringInfraProvisionTaskPayload.region) &&
        Objects.equals(this.vpcId, monitoringInfraProvisionTaskPayload.vpcId) &&
        Objects.equals(this.cloudAccountId, monitoringInfraProvisionTaskPayload.cloudAccountId) &&
        Objects.equals(this.encryptionKeyCloudId, monitoringInfraProvisionTaskPayload.encryptionKeyCloudId) &&
        Objects.equals(this.computeId, monitoringInfraProvisionTaskPayload.computeId) &&
        Objects.equals(this.volumeSize, monitoringInfraProvisionTaskPayload.volumeSize) &&
        Objects.equals(this.owner, monitoringInfraProvisionTaskPayload.owner) &&
        Objects.equals(this.skipProvisionRollback, monitoringInfraProvisionTaskPayload.skipProvisionRollback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, subscriptionId, cloudType, region, vpcId, cloudAccountId, encryptionKeyCloudId, computeId, volumeSize, owner, skipProvisionRollback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitoringInfraProvisionTaskPayload {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    encryptionKeyCloudId: ").append(toIndentedString(encryptionKeyCloudId)).append("\n");
    sb.append("    computeId: ").append(toIndentedString(computeId)).append("\n");
    sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    skipProvisionRollback: ").append(toIndentedString(skipProvisionRollback)).append("\n");
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
