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
import com.tessell.dmm.client.model.DbLicenseInfo;
import com.tessell.dmm.client.model.MonitoringConfig;
import com.tessell.dmm.client.model.TessellAgentLcmInfo;
import com.tessell.dmm.client.model.TessellServiceInstanceConnectionInfo;
import com.tessell.dmm.client.model.TessellServiceInstanceDriverInfo;
import com.tessell.dmm.client.model.TessellServiceInstanceGenericInfo;
import com.tessell.dmm.client.model.TessellServiceInstanceInProgressUpdateInfoOps;
import com.tessell.dmm.client.model.TessellServiceInstanceMetadata;
import com.tessell.dmm.client.model.TessellServiceInstancePluginStatus;
import com.tessell.dmm.client.model.TessellServiceInstanceRole;
import com.tessell.dmm.client.model.TessellServiceInstanceStatusOps;
import com.tessell.dmm.client.model.TessellServiceInstanceType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition of the DB Service Instance Ops object
 */
@ApiModel(description = "This is a definition of the DB Service Instance Ops object")
@JsonPropertyOrder({
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_ID,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_NAME,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_DESCRIPTION,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_TESSELL_SERVICE_ID,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_COMPUTE_RESOURCE_ID,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_CLOUD_LOCATION_ID,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_PARAMETER_PROFILE_ID,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_CLOUD_ACCOUNT_ID,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_INSTANCE_GROUP_ID,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_TYPE,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_ROLE,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_USER_VISIBLE_ROLE,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_STATUS,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_PLUGIN_STATUS,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_CONNECTION_INFO,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_GENERIC_INFO,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_LICENSE_INFO,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_MONITORING_CONFIG,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_DATE_CREATED,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_DATE_MODIFIED,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_DATE_MODIFIED_BY_USER,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_METADATA,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_DRIVER_INFO,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_UPDATES_IN_PROGRESS_INFO,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_LAST_STARTED_AT,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_LAST_STOPPED_AT,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_LAST_DEGRADED_AT,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_DELETED_FOR_USER_AT,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_IS_CONSUMABLE,
  TessellServiceInstanceOpsDTO.JSON_PROPERTY_TESSELL_AGENT_LCM_INFO
})
@JsonTypeName("TessellServiceInstanceOpsDTO")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceInstanceOpsDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TESSELL_SERVICE_ID = "tessellServiceId";
  private UUID tessellServiceId;

  public static final String JSON_PROPERTY_COMPUTE_RESOURCE_ID = "computeResourceId";
  private UUID computeResourceId;

  public static final String JSON_PROPERTY_CLOUD_LOCATION_ID = "cloudLocationId";
  private String cloudLocationId;

  public static final String JSON_PROPERTY_PARAMETER_PROFILE_ID = "parameterProfileId";
  private UUID parameterProfileId;

  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_ID = "cloudAccountId";
  private UUID cloudAccountId;

  public static final String JSON_PROPERTY_INSTANCE_GROUP_ID = "instanceGroupId";
  private UUID instanceGroupId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TessellServiceInstanceType type;

  public static final String JSON_PROPERTY_ROLE = "role";
  private TessellServiceInstanceRole role;

  public static final String JSON_PROPERTY_USER_VISIBLE_ROLE = "userVisibleRole";
  private TessellServiceInstanceRole userVisibleRole;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellServiceInstanceStatusOps status;

  public static final String JSON_PROPERTY_PLUGIN_STATUS = "pluginStatus";
  private TessellServiceInstancePluginStatus pluginStatus;

  public static final String JSON_PROPERTY_CONNECTION_INFO = "connectionInfo";
  private TessellServiceInstanceConnectionInfo connectionInfo;

  public static final String JSON_PROPERTY_GENERIC_INFO = "genericInfo";
  private TessellServiceInstanceGenericInfo genericInfo;

  public static final String JSON_PROPERTY_LICENSE_INFO = "licenseInfo";
  private DbLicenseInfo licenseInfo;

  public static final String JSON_PROPERTY_MONITORING_CONFIG = "monitoringConfig";
  private MonitoringConfig monitoringConfig;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private Date dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private Date dateModified;

  public static final String JSON_PROPERTY_DATE_MODIFIED_BY_USER = "dateModifiedByUser";
  private Date dateModifiedByUser;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private TessellServiceInstanceMetadata metadata;

  public static final String JSON_PROPERTY_DRIVER_INFO = "driverInfo";
  private TessellServiceInstanceDriverInfo driverInfo;

  public static final String JSON_PROPERTY_UPDATES_IN_PROGRESS_INFO = "updatesInProgressInfo";
  private TessellServiceInstanceInProgressUpdateInfoOps updatesInProgressInfo;

  public static final String JSON_PROPERTY_LAST_STARTED_AT = "lastStartedAt";
  private Date lastStartedAt;

  public static final String JSON_PROPERTY_LAST_STOPPED_AT = "lastStoppedAt";
  private Date lastStoppedAt;

  public static final String JSON_PROPERTY_LAST_DEGRADED_AT = "lastDegradedAt";
  private Date lastDegradedAt;

  public static final String JSON_PROPERTY_DELETED_FOR_USER_AT = "deletedForUserAt";
  private Date deletedForUserAt;

  public static final String JSON_PROPERTY_IS_CONSUMABLE = "isConsumable";
  private Boolean isConsumable;

  public static final String JSON_PROPERTY_TESSELL_AGENT_LCM_INFO = "tessellAgentLcmInfo";
  private TessellAgentLcmInfo tessellAgentLcmInfo;


  public TessellServiceInstanceOpsDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Tessell generated UUID for the DB Service Instance
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tessell generated UUID for the DB Service Instance")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public TessellServiceInstanceOpsDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the DB Service Instance
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the DB Service Instance")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public TessellServiceInstanceOpsDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * DB Service Instance description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DB Service Instance description")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public TessellServiceInstanceOpsDTO tessellServiceId(UUID tessellServiceId) {
    
    this.tessellServiceId = tessellServiceId;
    return this;
  }

   /**
   * DB Service Instance&#39;s associated DB Service ID
   * @return tessellServiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DB Service Instance's associated DB Service ID")
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


  public TessellServiceInstanceOpsDTO computeResourceId(UUID computeResourceId) {
    
    this.computeResourceId = computeResourceId;
    return this;
  }

   /**
   * Associated compute resource ID
   * @return computeResourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Associated compute resource ID")
  @JsonProperty(JSON_PROPERTY_COMPUTE_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getComputeResourceId() {
    return computeResourceId;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTE_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComputeResourceId(UUID computeResourceId) {
    this.computeResourceId = computeResourceId;
  }


  public TessellServiceInstanceOpsDTO cloudLocationId(String cloudLocationId) {
    
    this.cloudLocationId = cloudLocationId;
    return this;
  }

   /**
   * DB Service Instance&#39;s cloud location
   * @return cloudLocationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DB Service Instance's cloud location")
  @JsonProperty(JSON_PROPERTY_CLOUD_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudLocationId() {
    return cloudLocationId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudLocationId(String cloudLocationId) {
    this.cloudLocationId = cloudLocationId;
  }


  public TessellServiceInstanceOpsDTO parameterProfileId(UUID parameterProfileId) {
    
    this.parameterProfileId = parameterProfileId;
    return this;
  }

   /**
   * Parameter Profile linked with the DB service instance
   * @return parameterProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameter Profile linked with the DB service instance")
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


  public TessellServiceInstanceOpsDTO cloudAccountId(UUID cloudAccountId) {
    
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * The cloud account on which the instance is hosted
   * @return cloudAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cloud account on which the instance is hosted")
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


  public TessellServiceInstanceOpsDTO instanceGroupId(UUID instanceGroupId) {
    
    this.instanceGroupId = instanceGroupId;
    return this;
  }

   /**
   * The instance groupd Id
   * @return instanceGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The instance groupd Id")
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


  public TessellServiceInstanceOpsDTO type(TessellServiceInstanceType type) {
    
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

  public TessellServiceInstanceType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TessellServiceInstanceType type) {
    this.type = type;
  }


  public TessellServiceInstanceOpsDTO role(TessellServiceInstanceRole role) {
    
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


  public TessellServiceInstanceOpsDTO userVisibleRole(TessellServiceInstanceRole userVisibleRole) {
    
    this.userVisibleRole = userVisibleRole;
    return this;
  }

   /**
   * Get userVisibleRole
   * @return userVisibleRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_VISIBLE_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceInstanceRole getUserVisibleRole() {
    return userVisibleRole;
  }


  @JsonProperty(JSON_PROPERTY_USER_VISIBLE_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserVisibleRole(TessellServiceInstanceRole userVisibleRole) {
    this.userVisibleRole = userVisibleRole;
  }


  public TessellServiceInstanceOpsDTO status(TessellServiceInstanceStatusOps status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceInstanceStatusOps getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TessellServiceInstanceStatusOps status) {
    this.status = status;
  }


  public TessellServiceInstanceOpsDTO pluginStatus(TessellServiceInstancePluginStatus pluginStatus) {
    
    this.pluginStatus = pluginStatus;
    return this;
  }

   /**
   * Get pluginStatus
   * @return pluginStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLUGIN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceInstancePluginStatus getPluginStatus() {
    return pluginStatus;
  }


  @JsonProperty(JSON_PROPERTY_PLUGIN_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPluginStatus(TessellServiceInstancePluginStatus pluginStatus) {
    this.pluginStatus = pluginStatus;
  }


  public TessellServiceInstanceOpsDTO connectionInfo(TessellServiceInstanceConnectionInfo connectionInfo) {
    
    this.connectionInfo = connectionInfo;
    return this;
  }

   /**
   * Get connectionInfo
   * @return connectionInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceInstanceConnectionInfo getConnectionInfo() {
    return connectionInfo;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionInfo(TessellServiceInstanceConnectionInfo connectionInfo) {
    this.connectionInfo = connectionInfo;
  }


  public TessellServiceInstanceOpsDTO genericInfo(TessellServiceInstanceGenericInfo genericInfo) {
    
    this.genericInfo = genericInfo;
    return this;
  }

   /**
   * Get genericInfo
   * @return genericInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GENERIC_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceInstanceGenericInfo getGenericInfo() {
    return genericInfo;
  }


  @JsonProperty(JSON_PROPERTY_GENERIC_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGenericInfo(TessellServiceInstanceGenericInfo genericInfo) {
    this.genericInfo = genericInfo;
  }


  public TessellServiceInstanceOpsDTO licenseInfo(DbLicenseInfo licenseInfo) {
    
    this.licenseInfo = licenseInfo;
    return this;
  }

   /**
   * Get licenseInfo
   * @return licenseInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LICENSE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbLicenseInfo getLicenseInfo() {
    return licenseInfo;
  }


  @JsonProperty(JSON_PROPERTY_LICENSE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLicenseInfo(DbLicenseInfo licenseInfo) {
    this.licenseInfo = licenseInfo;
  }


  public TessellServiceInstanceOpsDTO monitoringConfig(MonitoringConfig monitoringConfig) {
    
    this.monitoringConfig = monitoringConfig;
    return this;
  }

   /**
   * Get monitoringConfig
   * @return monitoringConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MONITORING_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MonitoringConfig getMonitoringConfig() {
    return monitoringConfig;
  }


  @JsonProperty(JSON_PROPERTY_MONITORING_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitoringConfig(MonitoringConfig monitoringConfig) {
    this.monitoringConfig = monitoringConfig;
  }


  public TessellServiceInstanceOpsDTO dateCreated(Date dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Timestamp when the entity was created
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the entity was created")
  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  public TessellServiceInstanceOpsDTO dateModified(Date dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Timestamp when the entity was last modified, either by system or by user
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the entity was last modified, either by system or by user")
  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDateModified() {
    return dateModified;
  }


  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  public TessellServiceInstanceOpsDTO dateModifiedByUser(Date dateModifiedByUser) {
    
    this.dateModifiedByUser = dateModifiedByUser;
    return this;
  }

   /**
   * Timestamp when the entity was last modified by the user
   * @return dateModifiedByUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the entity was last modified by the user")
  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDateModifiedByUser() {
    return dateModifiedByUser;
  }


  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateModifiedByUser(Date dateModifiedByUser) {
    this.dateModifiedByUser = dateModifiedByUser;
  }


  public TessellServiceInstanceOpsDTO metadata(TessellServiceInstanceMetadata metadata) {
    
    this.metadata = metadata;
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

  public TessellServiceInstanceMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(TessellServiceInstanceMetadata metadata) {
    this.metadata = metadata;
  }


  public TessellServiceInstanceOpsDTO driverInfo(TessellServiceInstanceDriverInfo driverInfo) {
    
    this.driverInfo = driverInfo;
    return this;
  }

   /**
   * Get driverInfo
   * @return driverInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DRIVER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceInstanceDriverInfo getDriverInfo() {
    return driverInfo;
  }


  @JsonProperty(JSON_PROPERTY_DRIVER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDriverInfo(TessellServiceInstanceDriverInfo driverInfo) {
    this.driverInfo = driverInfo;
  }


  public TessellServiceInstanceOpsDTO updatesInProgressInfo(TessellServiceInstanceInProgressUpdateInfoOps updatesInProgressInfo) {
    
    this.updatesInProgressInfo = updatesInProgressInfo;
    return this;
  }

   /**
   * Get updatesInProgressInfo
   * @return updatesInProgressInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATES_IN_PROGRESS_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceInstanceInProgressUpdateInfoOps getUpdatesInProgressInfo() {
    return updatesInProgressInfo;
  }


  @JsonProperty(JSON_PROPERTY_UPDATES_IN_PROGRESS_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatesInProgressInfo(TessellServiceInstanceInProgressUpdateInfoOps updatesInProgressInfo) {
    this.updatesInProgressInfo = updatesInProgressInfo;
  }


  public TessellServiceInstanceOpsDTO lastStartedAt(Date lastStartedAt) {
    
    this.lastStartedAt = lastStartedAt;
    return this;
  }

   /**
   * Timestamp when the service instance was last started at
   * @return lastStartedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the service instance was last started at")
  @JsonProperty(JSON_PROPERTY_LAST_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getLastStartedAt() {
    return lastStartedAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastStartedAt(Date lastStartedAt) {
    this.lastStartedAt = lastStartedAt;
  }


  public TessellServiceInstanceOpsDTO lastStoppedAt(Date lastStoppedAt) {
    
    this.lastStoppedAt = lastStoppedAt;
    return this;
  }

   /**
   * Timestamp when the Service Instance was last stopped at
   * @return lastStoppedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the Service Instance was last stopped at")
  @JsonProperty(JSON_PROPERTY_LAST_STOPPED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getLastStoppedAt() {
    return lastStoppedAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_STOPPED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastStoppedAt(Date lastStoppedAt) {
    this.lastStoppedAt = lastStoppedAt;
  }


  public TessellServiceInstanceOpsDTO lastDegradedAt(Date lastDegradedAt) {
    
    this.lastDegradedAt = lastDegradedAt;
    return this;
  }

   /**
   * Timestamp when the Service Instance was DEGRADED
   * @return lastDegradedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the Service Instance was DEGRADED")
  @JsonProperty(JSON_PROPERTY_LAST_DEGRADED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getLastDegradedAt() {
    return lastDegradedAt;
  }


  @JsonProperty(JSON_PROPERTY_LAST_DEGRADED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastDegradedAt(Date lastDegradedAt) {
    this.lastDegradedAt = lastDegradedAt;
  }


  public TessellServiceInstanceOpsDTO deletedForUserAt(Date deletedForUserAt) {
    
    this.deletedForUserAt = deletedForUserAt;
    return this;
  }

   /**
   * Timestamp when the service instance was marked &#39;delete for user&#39;.
   * @return deletedForUserAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the service instance was marked 'delete for user'.")
  @JsonProperty(JSON_PROPERTY_DELETED_FOR_USER_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDeletedForUserAt() {
    return deletedForUserAt;
  }


  @JsonProperty(JSON_PROPERTY_DELETED_FOR_USER_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeletedForUserAt(Date deletedForUserAt) {
    this.deletedForUserAt = deletedForUserAt;
  }


  public TessellServiceInstanceOpsDTO isConsumable(Boolean isConsumable) {
    
    this.isConsumable = isConsumable;
    return this;
  }

   /**
   * Whether the service instance is consumable for purposes like billing
   * @return isConsumable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the service instance is consumable for purposes like billing")
  @JsonProperty(JSON_PROPERTY_IS_CONSUMABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsConsumable() {
    return isConsumable;
  }


  @JsonProperty(JSON_PROPERTY_IS_CONSUMABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsConsumable(Boolean isConsumable) {
    this.isConsumable = isConsumable;
  }


  public TessellServiceInstanceOpsDTO tessellAgentLcmInfo(TessellAgentLcmInfo tessellAgentLcmInfo) {
    
    this.tessellAgentLcmInfo = tessellAgentLcmInfo;
    return this;
  }

   /**
   * Get tessellAgentLcmInfo
   * @return tessellAgentLcmInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TESSELL_AGENT_LCM_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellAgentLcmInfo getTessellAgentLcmInfo() {
    return tessellAgentLcmInfo;
  }


  @JsonProperty(JSON_PROPERTY_TESSELL_AGENT_LCM_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTessellAgentLcmInfo(TessellAgentLcmInfo tessellAgentLcmInfo) {
    this.tessellAgentLcmInfo = tessellAgentLcmInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellServiceInstanceOpsDTO tessellServiceInstanceOpsDTO = (TessellServiceInstanceOpsDTO) o;
    return Objects.equals(this.id, tessellServiceInstanceOpsDTO.id) &&
        Objects.equals(this.name, tessellServiceInstanceOpsDTO.name) &&
        Objects.equals(this.description, tessellServiceInstanceOpsDTO.description) &&
        Objects.equals(this.tessellServiceId, tessellServiceInstanceOpsDTO.tessellServiceId) &&
        Objects.equals(this.computeResourceId, tessellServiceInstanceOpsDTO.computeResourceId) &&
        Objects.equals(this.cloudLocationId, tessellServiceInstanceOpsDTO.cloudLocationId) &&
        Objects.equals(this.parameterProfileId, tessellServiceInstanceOpsDTO.parameterProfileId) &&
        Objects.equals(this.cloudAccountId, tessellServiceInstanceOpsDTO.cloudAccountId) &&
        Objects.equals(this.instanceGroupId, tessellServiceInstanceOpsDTO.instanceGroupId) &&
        Objects.equals(this.type, tessellServiceInstanceOpsDTO.type) &&
        Objects.equals(this.role, tessellServiceInstanceOpsDTO.role) &&
        Objects.equals(this.userVisibleRole, tessellServiceInstanceOpsDTO.userVisibleRole) &&
        Objects.equals(this.status, tessellServiceInstanceOpsDTO.status) &&
        Objects.equals(this.pluginStatus, tessellServiceInstanceOpsDTO.pluginStatus) &&
        Objects.equals(this.connectionInfo, tessellServiceInstanceOpsDTO.connectionInfo) &&
        Objects.equals(this.genericInfo, tessellServiceInstanceOpsDTO.genericInfo) &&
        Objects.equals(this.licenseInfo, tessellServiceInstanceOpsDTO.licenseInfo) &&
        Objects.equals(this.monitoringConfig, tessellServiceInstanceOpsDTO.monitoringConfig) &&
        Objects.equals(this.dateCreated, tessellServiceInstanceOpsDTO.dateCreated) &&
        Objects.equals(this.dateModified, tessellServiceInstanceOpsDTO.dateModified) &&
        Objects.equals(this.dateModifiedByUser, tessellServiceInstanceOpsDTO.dateModifiedByUser) &&
        Objects.equals(this.metadata, tessellServiceInstanceOpsDTO.metadata) &&
        Objects.equals(this.driverInfo, tessellServiceInstanceOpsDTO.driverInfo) &&
        Objects.equals(this.updatesInProgressInfo, tessellServiceInstanceOpsDTO.updatesInProgressInfo) &&
        Objects.equals(this.lastStartedAt, tessellServiceInstanceOpsDTO.lastStartedAt) &&
        Objects.equals(this.lastStoppedAt, tessellServiceInstanceOpsDTO.lastStoppedAt) &&
        Objects.equals(this.lastDegradedAt, tessellServiceInstanceOpsDTO.lastDegradedAt) &&
        Objects.equals(this.deletedForUserAt, tessellServiceInstanceOpsDTO.deletedForUserAt) &&
        Objects.equals(this.isConsumable, tessellServiceInstanceOpsDTO.isConsumable) &&
        Objects.equals(this.tessellAgentLcmInfo, tessellServiceInstanceOpsDTO.tessellAgentLcmInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, tessellServiceId, computeResourceId, cloudLocationId, parameterProfileId, cloudAccountId, instanceGroupId, type, role, userVisibleRole, status, pluginStatus, connectionInfo, genericInfo, licenseInfo, monitoringConfig, dateCreated, dateModified, dateModifiedByUser, metadata, driverInfo, updatesInProgressInfo, lastStartedAt, lastStoppedAt, lastDegradedAt, deletedForUserAt, isConsumable, tessellAgentLcmInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceInstanceOpsDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tessellServiceId: ").append(toIndentedString(tessellServiceId)).append("\n");
    sb.append("    computeResourceId: ").append(toIndentedString(computeResourceId)).append("\n");
    sb.append("    cloudLocationId: ").append(toIndentedString(cloudLocationId)).append("\n");
    sb.append("    parameterProfileId: ").append(toIndentedString(parameterProfileId)).append("\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    instanceGroupId: ").append(toIndentedString(instanceGroupId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    userVisibleRole: ").append(toIndentedString(userVisibleRole)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    pluginStatus: ").append(toIndentedString(pluginStatus)).append("\n");
    sb.append("    connectionInfo: ").append(toIndentedString(connectionInfo)).append("\n");
    sb.append("    genericInfo: ").append(toIndentedString(genericInfo)).append("\n");
    sb.append("    licenseInfo: ").append(toIndentedString(licenseInfo)).append("\n");
    sb.append("    monitoringConfig: ").append(toIndentedString(monitoringConfig)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateModifiedByUser: ").append(toIndentedString(dateModifiedByUser)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    driverInfo: ").append(toIndentedString(driverInfo)).append("\n");
    sb.append("    updatesInProgressInfo: ").append(toIndentedString(updatesInProgressInfo)).append("\n");
    sb.append("    lastStartedAt: ").append(toIndentedString(lastStartedAt)).append("\n");
    sb.append("    lastStoppedAt: ").append(toIndentedString(lastStoppedAt)).append("\n");
    sb.append("    lastDegradedAt: ").append(toIndentedString(lastDegradedAt)).append("\n");
    sb.append("    deletedForUserAt: ").append(toIndentedString(deletedForUserAt)).append("\n");
    sb.append("    isConsumable: ").append(toIndentedString(isConsumable)).append("\n");
    sb.append("    tessellAgentLcmInfo: ").append(toIndentedString(tessellAgentLcmInfo)).append("\n");
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
