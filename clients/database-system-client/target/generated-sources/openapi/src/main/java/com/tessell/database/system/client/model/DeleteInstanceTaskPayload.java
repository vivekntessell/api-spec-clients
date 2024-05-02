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
import com.tessell.database.system.client.model.CloudType;
import com.tessell.database.system.client.model.DatabaseEngineType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DeleteInstanceTaskPayload
 */
@JsonPropertyOrder({
  DeleteInstanceTaskPayload.JSON_PROPERTY_SERVICE_NAME,
  DeleteInstanceTaskPayload.JSON_PROPERTY_TESSELL_SERVICE_ID,
  DeleteInstanceTaskPayload.JSON_PROPERTY_AVAILABILITY_MACHINE_ID,
  DeleteInstanceTaskPayload.JSON_PROPERTY_DATABASE_ENGINE_TYPE,
  DeleteInstanceTaskPayload.JSON_PROPERTY_OWNER_ID,
  DeleteInstanceTaskPayload.JSON_PROPERTY_SUBSCRIPTION_ID,
  DeleteInstanceTaskPayload.JSON_PROPERTY_TENANT_ID,
  DeleteInstanceTaskPayload.JSON_PROPERTY_CLOUD,
  DeleteInstanceTaskPayload.JSON_PROPERTY_REGION,
  DeleteInstanceTaskPayload.JSON_PROPERTY_INSTANCE_GROUP_ID,
  DeleteInstanceTaskPayload.JSON_PROPERTY_INSTANCE_IDS,
  DeleteInstanceTaskPayload.JSON_PROPERTY_CLOUD_ACCOUNT_ID,
  DeleteInstanceTaskPayload.JSON_PROPERTY_CLOUD_LOCATION,
  DeleteInstanceTaskPayload.JSON_PROPERTY_METADATA
})
@JsonTypeName("DeleteInstanceTaskPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteInstanceTaskPayload {
  public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
  private String serviceName;

  public static final String JSON_PROPERTY_TESSELL_SERVICE_ID = "tessellServiceId";
  private UUID tessellServiceId;

  public static final String JSON_PROPERTY_AVAILABILITY_MACHINE_ID = "availabilityMachineId";
  private UUID availabilityMachineId;

  public static final String JSON_PROPERTY_DATABASE_ENGINE_TYPE = "databaseEngineType";
  private DatabaseEngineType databaseEngineType;

  public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
  private String ownerId;

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private UUID subscriptionId;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private String tenantId;

  public static final String JSON_PROPERTY_CLOUD = "cloud";
  private CloudType cloud;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_INSTANCE_GROUP_ID = "instanceGroupId";
  private UUID instanceGroupId;

  public static final String JSON_PROPERTY_INSTANCE_IDS = "instanceIds";
  private Set<UUID> instanceIds = null;

  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_ID = "cloudAccountId";
  private UUID cloudAccountId;

  public static final String JSON_PROPERTY_CLOUD_LOCATION = "cloudLocation";
  private String cloudLocation;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;


  public DeleteInstanceTaskPayload serviceName(String serviceName) {
    
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceName() {
    return serviceName;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public DeleteInstanceTaskPayload tessellServiceId(UUID tessellServiceId) {
    
    this.tessellServiceId = tessellServiceId;
    return this;
  }

   /**
   * Get tessellServiceId
   * @return tessellServiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TESSELL_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getTessellServiceId() {
    return tessellServiceId;
  }


  @JsonProperty(JSON_PROPERTY_TESSELL_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTessellServiceId(UUID tessellServiceId) {
    this.tessellServiceId = tessellServiceId;
  }


  public DeleteInstanceTaskPayload availabilityMachineId(UUID availabilityMachineId) {
    
    this.availabilityMachineId = availabilityMachineId;
    return this;
  }

   /**
   * Get availabilityMachineId
   * @return availabilityMachineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_MACHINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getAvailabilityMachineId() {
    return availabilityMachineId;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_MACHINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityMachineId(UUID availabilityMachineId) {
    this.availabilityMachineId = availabilityMachineId;
  }


  public DeleteInstanceTaskPayload databaseEngineType(DatabaseEngineType databaseEngineType) {
    
    this.databaseEngineType = databaseEngineType;
    return this;
  }

   /**
   * Get databaseEngineType
   * @return databaseEngineType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATABASE_ENGINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DatabaseEngineType getDatabaseEngineType() {
    return databaseEngineType;
  }


  @JsonProperty(JSON_PROPERTY_DATABASE_ENGINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatabaseEngineType(DatabaseEngineType databaseEngineType) {
    this.databaseEngineType = databaseEngineType;
  }


  public DeleteInstanceTaskPayload ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwnerId() {
    return ownerId;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public DeleteInstanceTaskPayload subscriptionId(UUID subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSubscriptionId() {
    return subscriptionId;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public DeleteInstanceTaskPayload tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public DeleteInstanceTaskPayload cloud(CloudType cloud) {
    
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

  public CloudType getCloud() {
    return cloud;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloud(CloudType cloud) {
    this.cloud = cloud;
  }


  public DeleteInstanceTaskPayload region(String region) {
    
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


  public DeleteInstanceTaskPayload instanceGroupId(UUID instanceGroupId) {
    
    this.instanceGroupId = instanceGroupId;
    return this;
  }

   /**
   * Get instanceGroupId
   * @return instanceGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTANCE_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getInstanceGroupId() {
    return instanceGroupId;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstanceGroupId(UUID instanceGroupId) {
    this.instanceGroupId = instanceGroupId;
  }


  public DeleteInstanceTaskPayload instanceIds(Set<UUID> instanceIds) {
    
    this.instanceIds = instanceIds;
    return this;
  }

  public DeleteInstanceTaskPayload addInstanceIdsItem(UUID instanceIdsItem) {
    if (this.instanceIds == null) {
      this.instanceIds = new LinkedHashSet<>();
    }
    this.instanceIds.add(instanceIdsItem);
    return this;
  }

   /**
   * Get instanceIds
   * @return instanceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTANCE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<UUID> getInstanceIds() {
    return instanceIds;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstanceIds(Set<UUID> instanceIds) {
    this.instanceIds = instanceIds;
  }


  public DeleteInstanceTaskPayload cloudAccountId(UUID cloudAccountId) {
    
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * Get cloudAccountId
   * @return cloudAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCloudAccountId() {
    return cloudAccountId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAccountId(UUID cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }


  public DeleteInstanceTaskPayload cloudLocation(String cloudLocation) {
    
    this.cloudLocation = cloudLocation;
    return this;
  }

   /**
   * Get cloudLocation
   * @return cloudLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudLocation() {
    return cloudLocation;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudLocation(String cloudLocation) {
    this.cloudLocation = cloudLocation;
  }


  public DeleteInstanceTaskPayload metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public DeleteInstanceTaskPayload putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteInstanceTaskPayload deleteInstanceTaskPayload = (DeleteInstanceTaskPayload) o;
    return Objects.equals(this.serviceName, deleteInstanceTaskPayload.serviceName) &&
        Objects.equals(this.tessellServiceId, deleteInstanceTaskPayload.tessellServiceId) &&
        Objects.equals(this.availabilityMachineId, deleteInstanceTaskPayload.availabilityMachineId) &&
        Objects.equals(this.databaseEngineType, deleteInstanceTaskPayload.databaseEngineType) &&
        Objects.equals(this.ownerId, deleteInstanceTaskPayload.ownerId) &&
        Objects.equals(this.subscriptionId, deleteInstanceTaskPayload.subscriptionId) &&
        Objects.equals(this.tenantId, deleteInstanceTaskPayload.tenantId) &&
        Objects.equals(this.cloud, deleteInstanceTaskPayload.cloud) &&
        Objects.equals(this.region, deleteInstanceTaskPayload.region) &&
        Objects.equals(this.instanceGroupId, deleteInstanceTaskPayload.instanceGroupId) &&
        Objects.equals(this.instanceIds, deleteInstanceTaskPayload.instanceIds) &&
        Objects.equals(this.cloudAccountId, deleteInstanceTaskPayload.cloudAccountId) &&
        Objects.equals(this.cloudLocation, deleteInstanceTaskPayload.cloudLocation) &&
        Objects.equals(this.metadata, deleteInstanceTaskPayload.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, tessellServiceId, availabilityMachineId, databaseEngineType, ownerId, subscriptionId, tenantId, cloud, region, instanceGroupId, instanceIds, cloudAccountId, cloudLocation, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteInstanceTaskPayload {\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    tessellServiceId: ").append(toIndentedString(tessellServiceId)).append("\n");
    sb.append("    availabilityMachineId: ").append(toIndentedString(availabilityMachineId)).append("\n");
    sb.append("    databaseEngineType: ").append(toIndentedString(databaseEngineType)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    instanceGroupId: ").append(toIndentedString(instanceGroupId)).append("\n");
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    cloudLocation: ").append(toIndentedString(cloudLocation)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

