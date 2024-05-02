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
import com.tessell.database.system.client.model.DBServerSystemDriverInfo;
import com.tessell.database.system.client.model.DBServerSystemIpAddressInfo;
import com.tessell.database.system.client.model.DBServerSystemMetadata;
import com.tessell.database.system.client.model.DBServerSystemStatus;
import com.tessell.database.system.client.model.DatabaseEngineType;
import com.tessell.database.system.client.model.SwitchOverStatus;
import com.tessell.database.system.client.model.TessellComputeResourceOpsDTO;
import com.tessell.database.system.client.model.TessellDbssCrMappingDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell DBServer System Object
 */
@ApiModel(description = "This is a definition for Tessell DBServer System Object")
@JsonPropertyOrder({
  TessellDBServerSystemDTO.JSON_PROPERTY_ID,
  TessellDBServerSystemDTO.JSON_PROPERTY_NAME,
  TessellDBServerSystemDTO.JSON_PROPERTY_DESCRIPTION,
  TessellDBServerSystemDTO.JSON_PROPERTY_ENGINE_TYPE,
  TessellDBServerSystemDTO.JSON_PROPERTY_STATUS,
  TessellDBServerSystemDTO.JSON_PROPERTY_COMPUTE_SHARING_ENABLED,
  TessellDBServerSystemDTO.JSON_PROPERTY_SWITCH_OVER_POLICY,
  TessellDBServerSystemDTO.JSON_PROPERTY_SWITCH_OVER_STATUS,
  TessellDBServerSystemDTO.JSON_PROPERTY_TYPE,
  TessellDBServerSystemDTO.JSON_PROPERTY_USER_ID,
  TessellDBServerSystemDTO.JSON_PROPERTY_COMPUTE_RESOURCES,
  TessellDBServerSystemDTO.JSON_PROPERTY_DATE_CREATED,
  TessellDBServerSystemDTO.JSON_PROPERTY_DATE_MODIFIED,
  TessellDBServerSystemDTO.JSON_PROPERTY_DBSERVER_SYSTEM_AND_COMPUTE_RESOURCES,
  TessellDBServerSystemDTO.JSON_PROPERTY_IP_ADDRESS_INFO,
  TessellDBServerSystemDTO.JSON_PROPERTY_METADATA,
  TessellDBServerSystemDTO.JSON_PROPERTY_DRIVER_INFO
})
@JsonTypeName("TessellDBServerSystemDTO")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellDBServerSystemDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENGINE_TYPE = "engineType";
  private DatabaseEngineType engineType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private DBServerSystemStatus status;

  public static final String JSON_PROPERTY_COMPUTE_SHARING_ENABLED = "computeSharingEnabled";
  private Boolean computeSharingEnabled = false;

  public static final String JSON_PROPERTY_SWITCH_OVER_POLICY = "switchOverPolicy";
  private Object switchOverPolicy;

  public static final String JSON_PROPERTY_SWITCH_OVER_STATUS = "switchOverStatus";
  private SwitchOverStatus switchOverStatus;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private UUID userId;

  public static final String JSON_PROPERTY_COMPUTE_RESOURCES = "computeResources";
  private List<TessellComputeResourceOpsDTO> computeResources = null;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private Date dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private Date dateModified;

  public static final String JSON_PROPERTY_DBSERVER_SYSTEM_AND_COMPUTE_RESOURCES = "dbserverSystemAndComputeResources";
  private List<TessellDbssCrMappingDTO> dbserverSystemAndComputeResources = null;

  public static final String JSON_PROPERTY_IP_ADDRESS_INFO = "ipAddressInfo";
  private DBServerSystemIpAddressInfo ipAddressInfo;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private DBServerSystemMetadata metadata;

  public static final String JSON_PROPERTY_DRIVER_INFO = "driverInfo";
  private DBServerSystemDriverInfo driverInfo;


  public TessellDBServerSystemDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Tessell generated UUID for the entity
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "Tessell generated UUID for the entity")
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


  public TessellDBServerSystemDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the entity
   * @return name
  **/
  @ApiModelProperty(example = "sample_entity", required = true, value = "Name of the entity")
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


  public TessellDBServerSystemDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * DBServer System description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DBServer System description")
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


  public TessellDBServerSystemDTO engineType(DatabaseEngineType engineType) {
    
    this.engineType = engineType;
    return this;
  }

   /**
   * Get engineType
   * @return engineType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENGINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DatabaseEngineType getEngineType() {
    return engineType;
  }


  @JsonProperty(JSON_PROPERTY_ENGINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEngineType(DatabaseEngineType engineType) {
    this.engineType = engineType;
  }


  public TessellDBServerSystemDTO status(DBServerSystemStatus status) {
    
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

  public DBServerSystemStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(DBServerSystemStatus status) {
    this.status = status;
  }


  public TessellDBServerSystemDTO computeSharingEnabled(Boolean computeSharingEnabled) {
    
    this.computeSharingEnabled = computeSharingEnabled;
    return this;
  }

   /**
   * Whether the Compute Resource is shared across multiple DB Services
   * @return computeSharingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the Compute Resource is shared across multiple DB Services")
  @JsonProperty(JSON_PROPERTY_COMPUTE_SHARING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getComputeSharingEnabled() {
    return computeSharingEnabled;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTE_SHARING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComputeSharingEnabled(Boolean computeSharingEnabled) {
    this.computeSharingEnabled = computeSharingEnabled;
  }


  public TessellDBServerSystemDTO switchOverPolicy(Object switchOverPolicy) {
    
    this.switchOverPolicy = switchOverPolicy;
    return this;
  }

   /**
   * DBServer System&#39;s switchover policy details
   * @return switchOverPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DBServer System's switchover policy details")
  @JsonProperty(JSON_PROPERTY_SWITCH_OVER_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getSwitchOverPolicy() {
    return switchOverPolicy;
  }


  @JsonProperty(JSON_PROPERTY_SWITCH_OVER_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSwitchOverPolicy(Object switchOverPolicy) {
    this.switchOverPolicy = switchOverPolicy;
  }


  public TessellDBServerSystemDTO switchOverStatus(SwitchOverStatus switchOverStatus) {
    
    this.switchOverStatus = switchOverStatus;
    return this;
  }

   /**
   * Get switchOverStatus
   * @return switchOverStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SWITCH_OVER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SwitchOverStatus getSwitchOverStatus() {
    return switchOverStatus;
  }


  @JsonProperty(JSON_PROPERTY_SWITCH_OVER_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSwitchOverStatus(SwitchOverStatus switchOverStatus) {
    this.switchOverStatus = switchOverStatus;
  }


  public TessellDBServerSystemDTO type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * DBServer System type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DBServer System type")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public TessellDBServerSystemDTO userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * DBServer System&#39;s user id
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DBServer System's user id")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public TessellDBServerSystemDTO computeResources(List<TessellComputeResourceOpsDTO> computeResources) {
    
    this.computeResources = computeResources;
    return this;
  }

  public TessellDBServerSystemDTO addComputeResourcesItem(TessellComputeResourceOpsDTO computeResourcesItem) {
    if (this.computeResources == null) {
      this.computeResources = new ArrayList<>();
    }
    this.computeResources.add(computeResourcesItem);
    return this;
  }

   /**
   * Compute Resources associated with this DBServer System
   * @return computeResources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Compute Resources associated with this DBServer System")
  @JsonProperty(JSON_PROPERTY_COMPUTE_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellComputeResourceOpsDTO> getComputeResources() {
    return computeResources;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTE_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComputeResources(List<TessellComputeResourceOpsDTO> computeResources) {
    this.computeResources = computeResources;
  }


  public TessellDBServerSystemDTO dateCreated(Date dateCreated) {
    
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


  public TessellDBServerSystemDTO dateModified(Date dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Timestamp when the entity was last modified
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the entity was last modified")
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


  public TessellDBServerSystemDTO dbserverSystemAndComputeResources(List<TessellDbssCrMappingDTO> dbserverSystemAndComputeResources) {
    
    this.dbserverSystemAndComputeResources = dbserverSystemAndComputeResources;
    return this;
  }

  public TessellDBServerSystemDTO addDbserverSystemAndComputeResourcesItem(TessellDbssCrMappingDTO dbserverSystemAndComputeResourcesItem) {
    if (this.dbserverSystemAndComputeResources == null) {
      this.dbserverSystemAndComputeResources = new ArrayList<>();
    }
    this.dbserverSystemAndComputeResources.add(dbserverSystemAndComputeResourcesItem);
    return this;
  }

   /**
   * DBServers associated with this DBServer System
   * @return dbserverSystemAndComputeResources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DBServers associated with this DBServer System")
  @JsonProperty(JSON_PROPERTY_DBSERVER_SYSTEM_AND_COMPUTE_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellDbssCrMappingDTO> getDbserverSystemAndComputeResources() {
    return dbserverSystemAndComputeResources;
  }


  @JsonProperty(JSON_PROPERTY_DBSERVER_SYSTEM_AND_COMPUTE_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbserverSystemAndComputeResources(List<TessellDbssCrMappingDTO> dbserverSystemAndComputeResources) {
    this.dbserverSystemAndComputeResources = dbserverSystemAndComputeResources;
  }


  public TessellDBServerSystemDTO ipAddressInfo(DBServerSystemIpAddressInfo ipAddressInfo) {
    
    this.ipAddressInfo = ipAddressInfo;
    return this;
  }

   /**
   * Get ipAddressInfo
   * @return ipAddressInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DBServerSystemIpAddressInfo getIpAddressInfo() {
    return ipAddressInfo;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddressInfo(DBServerSystemIpAddressInfo ipAddressInfo) {
    this.ipAddressInfo = ipAddressInfo;
  }


  public TessellDBServerSystemDTO metadata(DBServerSystemMetadata metadata) {
    
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

  public DBServerSystemMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(DBServerSystemMetadata metadata) {
    this.metadata = metadata;
  }


  public TessellDBServerSystemDTO driverInfo(DBServerSystemDriverInfo driverInfo) {
    
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

  public DBServerSystemDriverInfo getDriverInfo() {
    return driverInfo;
  }


  @JsonProperty(JSON_PROPERTY_DRIVER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDriverInfo(DBServerSystemDriverInfo driverInfo) {
    this.driverInfo = driverInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellDBServerSystemDTO tessellDBServerSystemDTO = (TessellDBServerSystemDTO) o;
    return Objects.equals(this.id, tessellDBServerSystemDTO.id) &&
        Objects.equals(this.name, tessellDBServerSystemDTO.name) &&
        Objects.equals(this.description, tessellDBServerSystemDTO.description) &&
        Objects.equals(this.engineType, tessellDBServerSystemDTO.engineType) &&
        Objects.equals(this.status, tessellDBServerSystemDTO.status) &&
        Objects.equals(this.computeSharingEnabled, tessellDBServerSystemDTO.computeSharingEnabled) &&
        Objects.equals(this.switchOverPolicy, tessellDBServerSystemDTO.switchOverPolicy) &&
        Objects.equals(this.switchOverStatus, tessellDBServerSystemDTO.switchOverStatus) &&
        Objects.equals(this.type, tessellDBServerSystemDTO.type) &&
        Objects.equals(this.userId, tessellDBServerSystemDTO.userId) &&
        Objects.equals(this.computeResources, tessellDBServerSystemDTO.computeResources) &&
        Objects.equals(this.dateCreated, tessellDBServerSystemDTO.dateCreated) &&
        Objects.equals(this.dateModified, tessellDBServerSystemDTO.dateModified) &&
        Objects.equals(this.dbserverSystemAndComputeResources, tessellDBServerSystemDTO.dbserverSystemAndComputeResources) &&
        Objects.equals(this.ipAddressInfo, tessellDBServerSystemDTO.ipAddressInfo) &&
        Objects.equals(this.metadata, tessellDBServerSystemDTO.metadata) &&
        Objects.equals(this.driverInfo, tessellDBServerSystemDTO.driverInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, engineType, status, computeSharingEnabled, switchOverPolicy, switchOverStatus, type, userId, computeResources, dateCreated, dateModified, dbserverSystemAndComputeResources, ipAddressInfo, metadata, driverInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellDBServerSystemDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    computeSharingEnabled: ").append(toIndentedString(computeSharingEnabled)).append("\n");
    sb.append("    switchOverPolicy: ").append(toIndentedString(switchOverPolicy)).append("\n");
    sb.append("    switchOverStatus: ").append(toIndentedString(switchOverStatus)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    computeResources: ").append(toIndentedString(computeResources)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dbserverSystemAndComputeResources: ").append(toIndentedString(dbserverSystemAndComputeResources)).append("\n");
    sb.append("    ipAddressInfo: ").append(toIndentedString(ipAddressInfo)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    driverInfo: ").append(toIndentedString(driverInfo)).append("\n");
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
