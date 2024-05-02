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
import com.tessell.database.system.client.model.DatabaseConfigurationInfo;
import com.tessell.database.system.client.model.DatabaseDriverInfo;
import com.tessell.database.system.client.model.DatabaseEngineType;
import com.tessell.database.system.client.model.DatabaseMetadata;
import com.tessell.database.system.client.model.DatabaseStatusOps;
import com.tessell.database.system.client.model.TessellDatabaseOpsDTOProvisioningInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell Database Ops Object
 */
@ApiModel(description = "This is a definition for Tessell Database Ops Object")
@JsonPropertyOrder({
  TessellDatabaseOpsDTO.JSON_PROPERTY_ID,
  TessellDatabaseOpsDTO.JSON_PROPERTY_NAME,
  TessellDatabaseOpsDTO.JSON_PROPERTY_DESCRIPTION,
  TessellDatabaseOpsDTO.JSON_PROPERTY_TESSELL_SERVICE_ID,
  TessellDatabaseOpsDTO.JSON_PROPERTY_ENGINE_TYPE,
  TessellDatabaseOpsDTO.JSON_PROPERTY_STATUS,
  TessellDatabaseOpsDTO.JSON_PROPERTY_CLONED_FROM_DATABASE_ID,
  TessellDatabaseOpsDTO.JSON_PROPERTY_DATABASE_CONFIGURATION,
  TessellDatabaseOpsDTO.JSON_PROPERTY_METADATA,
  TessellDatabaseOpsDTO.JSON_PROPERTY_DRIVER_INFO,
  TessellDatabaseOpsDTO.JSON_PROPERTY_PROVISIONING_INFO,
  TessellDatabaseOpsDTO.JSON_PROPERTY_STARTED_AT,
  TessellDatabaseOpsDTO.JSON_PROPERTY_INTERNAL,
  TessellDatabaseOpsDTO.JSON_PROPERTY_TESSELL_CREATED,
  TessellDatabaseOpsDTO.JSON_PROPERTY_DELETED_FOR_USER_AT,
  TessellDatabaseOpsDTO.JSON_PROPERTY_DATE_CREATED,
  TessellDatabaseOpsDTO.JSON_PROPERTY_DATE_MODIFIED,
  TessellDatabaseOpsDTO.JSON_PROPERTY_DATE_MODIFIED_BY_USER
})
@JsonTypeName("TessellDatabaseOpsDTO")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellDatabaseOpsDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TESSELL_SERVICE_ID = "tessellServiceId";
  private UUID tessellServiceId;

  public static final String JSON_PROPERTY_ENGINE_TYPE = "engineType";
  private DatabaseEngineType engineType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private DatabaseStatusOps status;

  public static final String JSON_PROPERTY_CLONED_FROM_DATABASE_ID = "clonedFromDatabaseId";
  private UUID clonedFromDatabaseId;

  public static final String JSON_PROPERTY_DATABASE_CONFIGURATION = "databaseConfiguration";
  private DatabaseConfigurationInfo databaseConfiguration;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private DatabaseMetadata metadata;

  public static final String JSON_PROPERTY_DRIVER_INFO = "driverInfo";
  private DatabaseDriverInfo driverInfo;

  public static final String JSON_PROPERTY_PROVISIONING_INFO = "provisioningInfo";
  private TessellDatabaseOpsDTOProvisioningInfo provisioningInfo;

  public static final String JSON_PROPERTY_STARTED_AT = "startedAt";
  private Date startedAt;

  public static final String JSON_PROPERTY_INTERNAL = "internal";
  private Boolean internal = false;

  public static final String JSON_PROPERTY_TESSELL_CREATED = "tessellCreated";
  private Boolean tessellCreated = true;

  public static final String JSON_PROPERTY_DELETED_FOR_USER_AT = "deletedForUserAt";
  private Date deletedForUserAt;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private Date dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private Date dateModified;

  public static final String JSON_PROPERTY_DATE_MODIFIED_BY_USER = "dateModifiedByUser";
  private Date dateModifiedByUser;


  public TessellDatabaseOpsDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Tessell generated UUID for the database
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tessell generated UUID for the database")
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


  public TessellDatabaseOpsDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the database
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the database")
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


  public TessellDatabaseOpsDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description for the database
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description for the database")
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


  public TessellDatabaseOpsDTO tessellServiceId(UUID tessellServiceId) {
    
    this.tessellServiceId = tessellServiceId;
    return this;
  }

   /**
   * Associated DB Service Id
   * @return tessellServiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Associated DB Service Id")
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


  public TessellDatabaseOpsDTO engineType(DatabaseEngineType engineType) {
    
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


  public TessellDatabaseOpsDTO status(DatabaseStatusOps status) {
    
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

  public DatabaseStatusOps getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(DatabaseStatusOps status) {
    this.status = status;
  }


  public TessellDatabaseOpsDTO clonedFromDatabaseId(UUID clonedFromDatabaseId) {
    
    this.clonedFromDatabaseId = clonedFromDatabaseId;
    return this;
  }

   /**
   * Database Id from which this database has been cloned (if applicable)
   * @return clonedFromDatabaseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Database Id from which this database has been cloned (if applicable)")
  @JsonProperty(JSON_PROPERTY_CLONED_FROM_DATABASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getClonedFromDatabaseId() {
    return clonedFromDatabaseId;
  }


  @JsonProperty(JSON_PROPERTY_CLONED_FROM_DATABASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClonedFromDatabaseId(UUID clonedFromDatabaseId) {
    this.clonedFromDatabaseId = clonedFromDatabaseId;
  }


  public TessellDatabaseOpsDTO databaseConfiguration(DatabaseConfigurationInfo databaseConfiguration) {
    
    this.databaseConfiguration = databaseConfiguration;
    return this;
  }

   /**
   * Get databaseConfiguration
   * @return databaseConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATABASE_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DatabaseConfigurationInfo getDatabaseConfiguration() {
    return databaseConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_DATABASE_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatabaseConfiguration(DatabaseConfigurationInfo databaseConfiguration) {
    this.databaseConfiguration = databaseConfiguration;
  }


  public TessellDatabaseOpsDTO metadata(DatabaseMetadata metadata) {
    
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

  public DatabaseMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(DatabaseMetadata metadata) {
    this.metadata = metadata;
  }


  public TessellDatabaseOpsDTO driverInfo(DatabaseDriverInfo driverInfo) {
    
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

  public DatabaseDriverInfo getDriverInfo() {
    return driverInfo;
  }


  @JsonProperty(JSON_PROPERTY_DRIVER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDriverInfo(DatabaseDriverInfo driverInfo) {
    this.driverInfo = driverInfo;
  }


  public TessellDatabaseOpsDTO provisioningInfo(TessellDatabaseOpsDTOProvisioningInfo provisioningInfo) {
    
    this.provisioningInfo = provisioningInfo;
    return this;
  }

   /**
   * Get provisioningInfo
   * @return provisioningInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROVISIONING_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellDatabaseOpsDTOProvisioningInfo getProvisioningInfo() {
    return provisioningInfo;
  }


  @JsonProperty(JSON_PROPERTY_PROVISIONING_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvisioningInfo(TessellDatabaseOpsDTOProvisioningInfo provisioningInfo) {
    this.provisioningInfo = provisioningInfo;
  }


  public TessellDatabaseOpsDTO startedAt(Date startedAt) {
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Timestamp when the Database was started (initial creation)
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the Database was started (initial creation)")
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getStartedAt() {
    return startedAt;
  }


  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartedAt(Date startedAt) {
    this.startedAt = startedAt;
  }


  public TessellDatabaseOpsDTO internal(Boolean internal) {
    
    this.internal = internal;
    return this;
  }

   /**
   * Whether the database is for internal use (ex. system database)
   * @return internal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the database is for internal use (ex. system database)")
  @JsonProperty(JSON_PROPERTY_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInternal() {
    return internal;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public TessellDatabaseOpsDTO tessellCreated(Boolean tessellCreated) {
    
    this.tessellCreated = tessellCreated;
    return this;
  }

   /**
   * Whether the database is created using Tessell platform
   * @return tessellCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the database is created using Tessell platform")
  @JsonProperty(JSON_PROPERTY_TESSELL_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTessellCreated() {
    return tessellCreated;
  }


  @JsonProperty(JSON_PROPERTY_TESSELL_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTessellCreated(Boolean tessellCreated) {
    this.tessellCreated = tessellCreated;
  }


  public TessellDatabaseOpsDTO deletedForUserAt(Date deletedForUserAt) {
    
    this.deletedForUserAt = deletedForUserAt;
    return this;
  }

   /**
   * Timestamp when the database was deleted by the user
   * @return deletedForUserAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the database was deleted by the user")
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


  public TessellDatabaseOpsDTO dateCreated(Date dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Timestamp when the database was created
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the database was created")
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


  public TessellDatabaseOpsDTO dateModified(Date dateModified) {
    
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


  public TessellDatabaseOpsDTO dateModifiedByUser(Date dateModifiedByUser) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellDatabaseOpsDTO tessellDatabaseOpsDTO = (TessellDatabaseOpsDTO) o;
    return Objects.equals(this.id, tessellDatabaseOpsDTO.id) &&
        Objects.equals(this.name, tessellDatabaseOpsDTO.name) &&
        Objects.equals(this.description, tessellDatabaseOpsDTO.description) &&
        Objects.equals(this.tessellServiceId, tessellDatabaseOpsDTO.tessellServiceId) &&
        Objects.equals(this.engineType, tessellDatabaseOpsDTO.engineType) &&
        Objects.equals(this.status, tessellDatabaseOpsDTO.status) &&
        Objects.equals(this.clonedFromDatabaseId, tessellDatabaseOpsDTO.clonedFromDatabaseId) &&
        Objects.equals(this.databaseConfiguration, tessellDatabaseOpsDTO.databaseConfiguration) &&
        Objects.equals(this.metadata, tessellDatabaseOpsDTO.metadata) &&
        Objects.equals(this.driverInfo, tessellDatabaseOpsDTO.driverInfo) &&
        Objects.equals(this.provisioningInfo, tessellDatabaseOpsDTO.provisioningInfo) &&
        Objects.equals(this.startedAt, tessellDatabaseOpsDTO.startedAt) &&
        Objects.equals(this.internal, tessellDatabaseOpsDTO.internal) &&
        Objects.equals(this.tessellCreated, tessellDatabaseOpsDTO.tessellCreated) &&
        Objects.equals(this.deletedForUserAt, tessellDatabaseOpsDTO.deletedForUserAt) &&
        Objects.equals(this.dateCreated, tessellDatabaseOpsDTO.dateCreated) &&
        Objects.equals(this.dateModified, tessellDatabaseOpsDTO.dateModified) &&
        Objects.equals(this.dateModifiedByUser, tessellDatabaseOpsDTO.dateModifiedByUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, tessellServiceId, engineType, status, clonedFromDatabaseId, databaseConfiguration, metadata, driverInfo, provisioningInfo, startedAt, internal, tessellCreated, deletedForUserAt, dateCreated, dateModified, dateModifiedByUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellDatabaseOpsDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tessellServiceId: ").append(toIndentedString(tessellServiceId)).append("\n");
    sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    clonedFromDatabaseId: ").append(toIndentedString(clonedFromDatabaseId)).append("\n");
    sb.append("    databaseConfiguration: ").append(toIndentedString(databaseConfiguration)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    driverInfo: ").append(toIndentedString(driverInfo)).append("\n");
    sb.append("    provisioningInfo: ").append(toIndentedString(provisioningInfo)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    tessellCreated: ").append(toIndentedString(tessellCreated)).append("\n");
    sb.append("    deletedForUserAt: ").append(toIndentedString(deletedForUserAt)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateModifiedByUser: ").append(toIndentedString(dateModifiedByUser)).append("\n");
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

