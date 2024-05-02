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
import com.tessell.database.system.client.model.DatabaseEngineType;
import com.tessell.database.system.client.model.DbCollectionConfig;
import com.tessell.database.system.client.model.DbCollectionStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Db collection
 */
@ApiModel(description = "Db collection")
@JsonPropertyOrder({
  DbCollectionDTO.JSON_PROPERTY_ID,
  DbCollectionDTO.JSON_PROPERTY_NAME,
  DbCollectionDTO.JSON_PROPERTY_DATABASE_ID,
  DbCollectionDTO.JSON_PROPERTY_SERVICE_ID,
  DbCollectionDTO.JSON_PROPERTY_CREATED_BY_USER,
  DbCollectionDTO.JSON_PROPERTY_ENGINE_TYPE,
  DbCollectionDTO.JSON_PROPERTY_STATUS,
  DbCollectionDTO.JSON_PROPERTY_COLLECTION_CONFIG,
  DbCollectionDTO.JSON_PROPERTY_DATE_MODIFIED
})
@JsonTypeName("DbCollectionDTO")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DbCollectionDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DATABASE_ID = "databaseId";
  private UUID databaseId;

  public static final String JSON_PROPERTY_SERVICE_ID = "serviceId";
  private UUID serviceId;

  public static final String JSON_PROPERTY_CREATED_BY_USER = "createdByUser";
  private String createdByUser;

  public static final String JSON_PROPERTY_ENGINE_TYPE = "engineType";
  private DatabaseEngineType engineType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private DbCollectionStatus status;

  public static final String JSON_PROPERTY_COLLECTION_CONFIG = "collectionConfig";
  private DbCollectionConfig collectionConfig;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private Date dateModified;


  public DbCollectionDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Tessell generated UUID for the collection
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tessell generated UUID for the collection")
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


  public DbCollectionDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the collection
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the collection")
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


  public DbCollectionDTO databaseId(UUID databaseId) {
    
    this.databaseId = databaseId;
    return this;
  }

   /**
   * The ID of the database which the collection falls under
   * @return databaseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the database which the collection falls under")
  @JsonProperty(JSON_PROPERTY_DATABASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getDatabaseId() {
    return databaseId;
  }


  @JsonProperty(JSON_PROPERTY_DATABASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatabaseId(UUID databaseId) {
    this.databaseId = databaseId;
  }


  public DbCollectionDTO serviceId(UUID serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

   /**
   * The ID of the service which the database falls under
   * @return serviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the service which the database falls under")
  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getServiceId() {
    return serviceId;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceId(UUID serviceId) {
    this.serviceId = serviceId;
  }


  public DbCollectionDTO createdByUser(String createdByUser) {
    
    this.createdByUser = createdByUser;
    return this;
  }

   /**
   * The user who created the collection
   * @return createdByUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user who created the collection")
  @JsonProperty(JSON_PROPERTY_CREATED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedByUser() {
    return createdByUser;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedByUser(String createdByUser) {
    this.createdByUser = createdByUser;
  }


  public DbCollectionDTO engineType(DatabaseEngineType engineType) {
    
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


  public DbCollectionDTO status(DbCollectionStatus status) {
    
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

  public DbCollectionStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(DbCollectionStatus status) {
    this.status = status;
  }


  public DbCollectionDTO collectionConfig(DbCollectionConfig collectionConfig) {
    
    this.collectionConfig = collectionConfig;
    return this;
  }

   /**
   * Get collectionConfig
   * @return collectionConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLLECTION_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbCollectionConfig getCollectionConfig() {
    return collectionConfig;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTION_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollectionConfig(DbCollectionConfig collectionConfig) {
    this.collectionConfig = collectionConfig;
  }


  public DbCollectionDTO dateModified(Date dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Timestamp when the entity was last modified by user
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the entity was last modified by user")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbCollectionDTO dbCollectionDTO = (DbCollectionDTO) o;
    return Objects.equals(this.id, dbCollectionDTO.id) &&
        Objects.equals(this.name, dbCollectionDTO.name) &&
        Objects.equals(this.databaseId, dbCollectionDTO.databaseId) &&
        Objects.equals(this.serviceId, dbCollectionDTO.serviceId) &&
        Objects.equals(this.createdByUser, dbCollectionDTO.createdByUser) &&
        Objects.equals(this.engineType, dbCollectionDTO.engineType) &&
        Objects.equals(this.status, dbCollectionDTO.status) &&
        Objects.equals(this.collectionConfig, dbCollectionDTO.collectionConfig) &&
        Objects.equals(this.dateModified, dbCollectionDTO.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, databaseId, serviceId, createdByUser, engineType, status, collectionConfig, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbCollectionDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    collectionConfig: ").append(toIndentedString(collectionConfig)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

