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
import com.tessell.database.system.client.model.CreateDatabasePayload1;
import com.tessell.database.system.client.model.DatabaseEngineType;
import com.tessell.database.system.client.model.SnapshotConfigurationPayload;
import com.tessell.database.system.client.model.TessellServiceConnectivityInfoPayload;
import com.tessell.database.system.client.model.TessellServiceCredsPayload;
import com.tessell.database.system.client.model.TessellServiceDeletionConfig;
import com.tessell.database.system.client.model.TessellServiceEngineConfigurationPayload1;
import com.tessell.database.system.client.model.TessellServiceInfrastructurePayload1;
import com.tessell.database.system.client.model.TessellServiceIntegrationsPayload;
import com.tessell.database.system.client.model.TessellServiceMaintenanceWindow;
import com.tessell.database.system.client.model.TessellServiceTopology;
import com.tessell.database.system.client.model.TessellTag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * ProvisionTessellServicePayload1
 */
@JsonPropertyOrder({
  ProvisionTessellServicePayload1.JSON_PROPERTY_NAME,
  ProvisionTessellServicePayload1.JSON_PROPERTY_DESCRIPTION,
  ProvisionTessellServicePayload1.JSON_PROPERTY_SUBSCRIPTION,
  ProvisionTessellServicePayload1.JSON_PROPERTY_EDITION,
  ProvisionTessellServicePayload1.JSON_PROPERTY_ENGINE_TYPE,
  ProvisionTessellServicePayload1.JSON_PROPERTY_TOPOLOGY,
  ProvisionTessellServicePayload1.JSON_PROPERTY_NUM_OF_INSTANCES,
  ProvisionTessellServicePayload1.JSON_PROPERTY_SOFTWARE_IMAGE,
  ProvisionTessellServicePayload1.JSON_PROPERTY_SOFTWARE_IMAGE_VERSION,
  ProvisionTessellServicePayload1.JSON_PROPERTY_AUTO_MINOR_VERSION_UPDATE,
  ProvisionTessellServicePayload1.JSON_PROPERTY_ENABLE_DELETION_PROTECTION,
  ProvisionTessellServicePayload1.JSON_PROPERTY_ENABLE_STOP_PROTECTION,
  ProvisionTessellServicePayload1.JSON_PROPERTY_ENABLE_PERF_INSIGHTS,
  ProvisionTessellServicePayload1.JSON_PROPERTY_INFRASTRUCTURE,
  ProvisionTessellServicePayload1.JSON_PROPERTY_SERVICE_CONNECTIVITY,
  ProvisionTessellServicePayload1.JSON_PROPERTY_CREDS,
  ProvisionTessellServicePayload1.JSON_PROPERTY_MAINTENANCE_WINDOW,
  ProvisionTessellServicePayload1.JSON_PROPERTY_DELETION_CONFIG,
  ProvisionTessellServicePayload1.JSON_PROPERTY_SNAPSHOT_CONFIGURATION,
  ProvisionTessellServicePayload1.JSON_PROPERTY_ENGINE_CONFIGURATION,
  ProvisionTessellServicePayload1.JSON_PROPERTY_DATABASES,
  ProvisionTessellServicePayload1.JSON_PROPERTY_INTEGRATIONS_CONFIG,
  ProvisionTessellServicePayload1.JSON_PROPERTY_TAGS
})
@JsonTypeName("ProvisionTessellServicePayload_1")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProvisionTessellServicePayload1 {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  private String subscription;

  public static final String JSON_PROPERTY_EDITION = "edition";
  private String edition;

  public static final String JSON_PROPERTY_ENGINE_TYPE = "engineType";
  private DatabaseEngineType engineType;

  public static final String JSON_PROPERTY_TOPOLOGY = "topology";
  private TessellServiceTopology topology;

  public static final String JSON_PROPERTY_NUM_OF_INSTANCES = "numOfInstances";
  private Integer numOfInstances = 0;

  public static final String JSON_PROPERTY_SOFTWARE_IMAGE = "softwareImage";
  private String softwareImage;

  public static final String JSON_PROPERTY_SOFTWARE_IMAGE_VERSION = "softwareImageVersion";
  private String softwareImageVersion;

  public static final String JSON_PROPERTY_AUTO_MINOR_VERSION_UPDATE = "autoMinorVersionUpdate";
  private Boolean autoMinorVersionUpdate = true;

  public static final String JSON_PROPERTY_ENABLE_DELETION_PROTECTION = "enableDeletionProtection";
  private Boolean enableDeletionProtection = true;

  public static final String JSON_PROPERTY_ENABLE_STOP_PROTECTION = "enableStopProtection";
  private Boolean enableStopProtection = false;

  public static final String JSON_PROPERTY_ENABLE_PERF_INSIGHTS = "enablePerfInsights";
  private Boolean enablePerfInsights = true;

  public static final String JSON_PROPERTY_INFRASTRUCTURE = "infrastructure";
  private TessellServiceInfrastructurePayload1 infrastructure;

  public static final String JSON_PROPERTY_SERVICE_CONNECTIVITY = "serviceConnectivity";
  private TessellServiceConnectivityInfoPayload serviceConnectivity;

  public static final String JSON_PROPERTY_CREDS = "creds";
  private TessellServiceCredsPayload creds;

  public static final String JSON_PROPERTY_MAINTENANCE_WINDOW = "maintenanceWindow";
  private TessellServiceMaintenanceWindow maintenanceWindow;

  public static final String JSON_PROPERTY_DELETION_CONFIG = "deletionConfig";
  private TessellServiceDeletionConfig deletionConfig;

  public static final String JSON_PROPERTY_SNAPSHOT_CONFIGURATION = "snapshotConfiguration";
  private SnapshotConfigurationPayload snapshotConfiguration;

  public static final String JSON_PROPERTY_ENGINE_CONFIGURATION = "engineConfiguration";
  private TessellServiceEngineConfigurationPayload1 engineConfiguration;

  public static final String JSON_PROPERTY_DATABASES = "databases";
  private List<CreateDatabasePayload1> databases = null;

  public static final String JSON_PROPERTY_INTEGRATIONS_CONFIG = "integrationsConfig";
  private TessellServiceIntegrationsPayload integrationsConfig;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<TessellTag> tags = null;


  public ProvisionTessellServicePayload1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * DB Service name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "DB Service name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public ProvisionTessellServicePayload1 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * DB Service&#39;s description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DB Service's description")
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


  public ProvisionTessellServicePayload1 subscription(String subscription) {
    
    this.subscription = subscription;
    return this;
  }

   /**
   * Tessell Subscription in which the DB Service is to be created
   * @return subscription
  **/
  @ApiModelProperty(required = true, value = "Tessell Subscription in which the DB Service is to be created")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubscription() {
    return subscription;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscription(String subscription) {
    this.subscription = subscription;
  }


  public ProvisionTessellServicePayload1 edition(String edition) {
    
    this.edition = edition;
    return this;
  }

   /**
   * Get edition
   * @return edition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEdition() {
    return edition;
  }


  @JsonProperty(JSON_PROPERTY_EDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEdition(String edition) {
    this.edition = edition;
  }


  public ProvisionTessellServicePayload1 engineType(DatabaseEngineType engineType) {
    
    this.engineType = engineType;
    return this;
  }

   /**
   * Get engineType
   * @return engineType
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ENGINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DatabaseEngineType getEngineType() {
    return engineType;
  }


  @JsonProperty(JSON_PROPERTY_ENGINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEngineType(DatabaseEngineType engineType) {
    this.engineType = engineType;
  }


  public ProvisionTessellServicePayload1 topology(TessellServiceTopology topology) {
    
    this.topology = topology;
    return this;
  }

   /**
   * Get topology
   * @return topology
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOPOLOGY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TessellServiceTopology getTopology() {
    return topology;
  }


  @JsonProperty(JSON_PROPERTY_TOPOLOGY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTopology(TessellServiceTopology topology) {
    this.topology = topology;
  }


  public ProvisionTessellServicePayload1 numOfInstances(Integer numOfInstances) {
    
    this.numOfInstances = numOfInstances;
    return this;
  }

   /**
   * Number of instance (nodes) to be created for the DB Service. This is a required input for Apache Kafka. For all other engines, this input would be ignored even if specified.
   * minimum: 0
   * maximum: 5
   * @return numOfInstances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of instance (nodes) to be created for the DB Service. This is a required input for Apache Kafka. For all other engines, this input would be ignored even if specified.")
  @JsonProperty(JSON_PROPERTY_NUM_OF_INSTANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumOfInstances() {
    return numOfInstances;
  }


  @JsonProperty(JSON_PROPERTY_NUM_OF_INSTANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumOfInstances(Integer numOfInstances) {
    this.numOfInstances = numOfInstances;
  }


  public ProvisionTessellServicePayload1 softwareImage(String softwareImage) {
    
    this.softwareImage = softwareImage;
    return this;
  }

   /**
   * Software Image to be used to create the DB Service
   * @return softwareImage
  **/
  @ApiModelProperty(required = true, value = "Software Image to be used to create the DB Service")
  @JsonProperty(JSON_PROPERTY_SOFTWARE_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSoftwareImage() {
    return softwareImage;
  }


  @JsonProperty(JSON_PROPERTY_SOFTWARE_IMAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSoftwareImage(String softwareImage) {
    this.softwareImage = softwareImage;
  }


  public ProvisionTessellServicePayload1 softwareImageVersion(String softwareImageVersion) {
    
    this.softwareImageVersion = softwareImageVersion;
    return this;
  }

   /**
   * Software Image Version to be used to create the DB Service
   * @return softwareImageVersion
  **/
  @ApiModelProperty(required = true, value = "Software Image Version to be used to create the DB Service")
  @JsonProperty(JSON_PROPERTY_SOFTWARE_IMAGE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSoftwareImageVersion() {
    return softwareImageVersion;
  }


  @JsonProperty(JSON_PROPERTY_SOFTWARE_IMAGE_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSoftwareImageVersion(String softwareImageVersion) {
    this.softwareImageVersion = softwareImageVersion;
  }


  public ProvisionTessellServicePayload1 autoMinorVersionUpdate(Boolean autoMinorVersionUpdate) {
    
    this.autoMinorVersionUpdate = autoMinorVersionUpdate;
    return this;
  }

   /**
   * Specify whether to automatically update minor version for DB Service
   * @return autoMinorVersionUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify whether to automatically update minor version for DB Service")
  @JsonProperty(JSON_PROPERTY_AUTO_MINOR_VERSION_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoMinorVersionUpdate() {
    return autoMinorVersionUpdate;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_MINOR_VERSION_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoMinorVersionUpdate(Boolean autoMinorVersionUpdate) {
    this.autoMinorVersionUpdate = autoMinorVersionUpdate;
  }


  public ProvisionTessellServicePayload1 enableDeletionProtection(Boolean enableDeletionProtection) {
    
    this.enableDeletionProtection = enableDeletionProtection;
    return this;
  }

   /**
   * Specify whether to enable deletion protection for the DB Service
   * @return enableDeletionProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify whether to enable deletion protection for the DB Service")
  @JsonProperty(JSON_PROPERTY_ENABLE_DELETION_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableDeletionProtection() {
    return enableDeletionProtection;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_DELETION_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableDeletionProtection(Boolean enableDeletionProtection) {
    this.enableDeletionProtection = enableDeletionProtection;
  }


  public ProvisionTessellServicePayload1 enableStopProtection(Boolean enableStopProtection) {
    
    this.enableStopProtection = enableStopProtection;
    return this;
  }

   /**
   * Specify whether to enable stop protection for the DB Service
   * @return enableStopProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify whether to enable stop protection for the DB Service")
  @JsonProperty(JSON_PROPERTY_ENABLE_STOP_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableStopProtection() {
    return enableStopProtection;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_STOP_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableStopProtection(Boolean enableStopProtection) {
    this.enableStopProtection = enableStopProtection;
  }


  public ProvisionTessellServicePayload1 enablePerfInsights(Boolean enablePerfInsights) {
    
    this.enablePerfInsights = enablePerfInsights;
    return this;
  }

   /**
   * Specify whether to enable perf insights for the DB Service
   * @return enablePerfInsights
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify whether to enable perf insights for the DB Service")
  @JsonProperty(JSON_PROPERTY_ENABLE_PERF_INSIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnablePerfInsights() {
    return enablePerfInsights;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_PERF_INSIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnablePerfInsights(Boolean enablePerfInsights) {
    this.enablePerfInsights = enablePerfInsights;
  }


  public ProvisionTessellServicePayload1 infrastructure(TessellServiceInfrastructurePayload1 infrastructure) {
    
    this.infrastructure = infrastructure;
    return this;
  }

   /**
   * Get infrastructure
   * @return infrastructure
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INFRASTRUCTURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TessellServiceInfrastructurePayload1 getInfrastructure() {
    return infrastructure;
  }


  @JsonProperty(JSON_PROPERTY_INFRASTRUCTURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInfrastructure(TessellServiceInfrastructurePayload1 infrastructure) {
    this.infrastructure = infrastructure;
  }


  public ProvisionTessellServicePayload1 serviceConnectivity(TessellServiceConnectivityInfoPayload serviceConnectivity) {
    
    this.serviceConnectivity = serviceConnectivity;
    return this;
  }

   /**
   * Get serviceConnectivity
   * @return serviceConnectivity
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_CONNECTIVITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TessellServiceConnectivityInfoPayload getServiceConnectivity() {
    return serviceConnectivity;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_CONNECTIVITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServiceConnectivity(TessellServiceConnectivityInfoPayload serviceConnectivity) {
    this.serviceConnectivity = serviceConnectivity;
  }


  public ProvisionTessellServicePayload1 creds(TessellServiceCredsPayload creds) {
    
    this.creds = creds;
    return this;
  }

   /**
   * Get creds
   * @return creds
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CREDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TessellServiceCredsPayload getCreds() {
    return creds;
  }


  @JsonProperty(JSON_PROPERTY_CREDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreds(TessellServiceCredsPayload creds) {
    this.creds = creds;
  }


  public ProvisionTessellServicePayload1 maintenanceWindow(TessellServiceMaintenanceWindow maintenanceWindow) {
    
    this.maintenanceWindow = maintenanceWindow;
    return this;
  }

   /**
   * Get maintenanceWindow
   * @return maintenanceWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAINTENANCE_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceMaintenanceWindow getMaintenanceWindow() {
    return maintenanceWindow;
  }


  @JsonProperty(JSON_PROPERTY_MAINTENANCE_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaintenanceWindow(TessellServiceMaintenanceWindow maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
  }


  public ProvisionTessellServicePayload1 deletionConfig(TessellServiceDeletionConfig deletionConfig) {
    
    this.deletionConfig = deletionConfig;
    return this;
  }

   /**
   * Get deletionConfig
   * @return deletionConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELETION_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceDeletionConfig getDeletionConfig() {
    return deletionConfig;
  }


  @JsonProperty(JSON_PROPERTY_DELETION_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeletionConfig(TessellServiceDeletionConfig deletionConfig) {
    this.deletionConfig = deletionConfig;
  }


  public ProvisionTessellServicePayload1 snapshotConfiguration(SnapshotConfigurationPayload snapshotConfiguration) {
    
    this.snapshotConfiguration = snapshotConfiguration;
    return this;
  }

   /**
   * Get snapshotConfiguration
   * @return snapshotConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SnapshotConfigurationPayload getSnapshotConfiguration() {
    return snapshotConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshotConfiguration(SnapshotConfigurationPayload snapshotConfiguration) {
    this.snapshotConfiguration = snapshotConfiguration;
  }


  public ProvisionTessellServicePayload1 engineConfiguration(TessellServiceEngineConfigurationPayload1 engineConfiguration) {
    
    this.engineConfiguration = engineConfiguration;
    return this;
  }

   /**
   * Get engineConfiguration
   * @return engineConfiguration
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ENGINE_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TessellServiceEngineConfigurationPayload1 getEngineConfiguration() {
    return engineConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_ENGINE_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEngineConfiguration(TessellServiceEngineConfigurationPayload1 engineConfiguration) {
    this.engineConfiguration = engineConfiguration;
  }


  public ProvisionTessellServicePayload1 databases(List<CreateDatabasePayload1> databases) {
    
    this.databases = databases;
    return this;
  }

  public ProvisionTessellServicePayload1 addDatabasesItem(CreateDatabasePayload1 databasesItem) {
    if (this.databases == null) {
      this.databases = new ArrayList<>();
    }
    this.databases.add(databasesItem);
    return this;
  }

   /**
   * Specify the databases to be created in the DB Service
   * @return databases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify the databases to be created in the DB Service")
  @JsonProperty(JSON_PROPERTY_DATABASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreateDatabasePayload1> getDatabases() {
    return databases;
  }


  @JsonProperty(JSON_PROPERTY_DATABASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatabases(List<CreateDatabasePayload1> databases) {
    this.databases = databases;
  }


  public ProvisionTessellServicePayload1 integrationsConfig(TessellServiceIntegrationsPayload integrationsConfig) {
    
    this.integrationsConfig = integrationsConfig;
    return this;
  }

   /**
   * Get integrationsConfig
   * @return integrationsConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTEGRATIONS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceIntegrationsPayload getIntegrationsConfig() {
    return integrationsConfig;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATIONS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationsConfig(TessellServiceIntegrationsPayload integrationsConfig) {
    this.integrationsConfig = integrationsConfig;
  }


  public ProvisionTessellServicePayload1 tags(List<TessellTag> tags) {
    
    this.tags = tags;
    return this;
  }

  public ProvisionTessellServicePayload1 addTagsItem(TessellTag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags to be associated with the DB Service
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tags to be associated with the DB Service")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellTag> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<TessellTag> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionTessellServicePayload1 provisionTessellServicePayload1 = (ProvisionTessellServicePayload1) o;
    return Objects.equals(this.name, provisionTessellServicePayload1.name) &&
        Objects.equals(this.description, provisionTessellServicePayload1.description) &&
        Objects.equals(this.subscription, provisionTessellServicePayload1.subscription) &&
        Objects.equals(this.edition, provisionTessellServicePayload1.edition) &&
        Objects.equals(this.engineType, provisionTessellServicePayload1.engineType) &&
        Objects.equals(this.topology, provisionTessellServicePayload1.topology) &&
        Objects.equals(this.numOfInstances, provisionTessellServicePayload1.numOfInstances) &&
        Objects.equals(this.softwareImage, provisionTessellServicePayload1.softwareImage) &&
        Objects.equals(this.softwareImageVersion, provisionTessellServicePayload1.softwareImageVersion) &&
        Objects.equals(this.autoMinorVersionUpdate, provisionTessellServicePayload1.autoMinorVersionUpdate) &&
        Objects.equals(this.enableDeletionProtection, provisionTessellServicePayload1.enableDeletionProtection) &&
        Objects.equals(this.enableStopProtection, provisionTessellServicePayload1.enableStopProtection) &&
        Objects.equals(this.enablePerfInsights, provisionTessellServicePayload1.enablePerfInsights) &&
        Objects.equals(this.infrastructure, provisionTessellServicePayload1.infrastructure) &&
        Objects.equals(this.serviceConnectivity, provisionTessellServicePayload1.serviceConnectivity) &&
        Objects.equals(this.creds, provisionTessellServicePayload1.creds) &&
        Objects.equals(this.maintenanceWindow, provisionTessellServicePayload1.maintenanceWindow) &&
        Objects.equals(this.deletionConfig, provisionTessellServicePayload1.deletionConfig) &&
        Objects.equals(this.snapshotConfiguration, provisionTessellServicePayload1.snapshotConfiguration) &&
        Objects.equals(this.engineConfiguration, provisionTessellServicePayload1.engineConfiguration) &&
        Objects.equals(this.databases, provisionTessellServicePayload1.databases) &&
        Objects.equals(this.integrationsConfig, provisionTessellServicePayload1.integrationsConfig) &&
        Objects.equals(this.tags, provisionTessellServicePayload1.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, subscription, edition, engineType, topology, numOfInstances, softwareImage, softwareImageVersion, autoMinorVersionUpdate, enableDeletionProtection, enableStopProtection, enablePerfInsights, infrastructure, serviceConnectivity, creds, maintenanceWindow, deletionConfig, snapshotConfiguration, engineConfiguration, databases, integrationsConfig, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionTessellServicePayload1 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    edition: ").append(toIndentedString(edition)).append("\n");
    sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
    sb.append("    numOfInstances: ").append(toIndentedString(numOfInstances)).append("\n");
    sb.append("    softwareImage: ").append(toIndentedString(softwareImage)).append("\n");
    sb.append("    softwareImageVersion: ").append(toIndentedString(softwareImageVersion)).append("\n");
    sb.append("    autoMinorVersionUpdate: ").append(toIndentedString(autoMinorVersionUpdate)).append("\n");
    sb.append("    enableDeletionProtection: ").append(toIndentedString(enableDeletionProtection)).append("\n");
    sb.append("    enableStopProtection: ").append(toIndentedString(enableStopProtection)).append("\n");
    sb.append("    enablePerfInsights: ").append(toIndentedString(enablePerfInsights)).append("\n");
    sb.append("    infrastructure: ").append(toIndentedString(infrastructure)).append("\n");
    sb.append("    serviceConnectivity: ").append(toIndentedString(serviceConnectivity)).append("\n");
    sb.append("    creds: ").append(toIndentedString(creds)).append("\n");
    sb.append("    maintenanceWindow: ").append(toIndentedString(maintenanceWindow)).append("\n");
    sb.append("    deletionConfig: ").append(toIndentedString(deletionConfig)).append("\n");
    sb.append("    snapshotConfiguration: ").append(toIndentedString(snapshotConfiguration)).append("\n");
    sb.append("    engineConfiguration: ").append(toIndentedString(engineConfiguration)).append("\n");
    sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
    sb.append("    integrationsConfig: ").append(toIndentedString(integrationsConfig)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

