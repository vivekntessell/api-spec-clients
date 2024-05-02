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
import com.tessell.database.system.client.model.CreateDatabasePayloadDatabaseConfiguration;
import com.tessell.database.system.client.model.DbCollectionCreatePayload;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * CreateDatabasePayload
 */
@JsonPropertyOrder({
  CreateDatabasePayload.JSON_PROPERTY_DATABASE_NAME,
  CreateDatabasePayload.JSON_PROPERTY_SOURCE_DATABASE_ID,
  CreateDatabasePayload.JSON_PROPERTY_DATABASE_CONFIGURATION,
  CreateDatabasePayload.JSON_PROPERTY_COLLECTION_CONFIG
})
@JsonTypeName("CreateDatabasePayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateDatabasePayload {
  public static final String JSON_PROPERTY_DATABASE_NAME = "databaseName";
  private String databaseName;

  public static final String JSON_PROPERTY_SOURCE_DATABASE_ID = "sourceDatabaseId";
  private UUID sourceDatabaseId;

  public static final String JSON_PROPERTY_DATABASE_CONFIGURATION = "databaseConfiguration";
  private CreateDatabasePayloadDatabaseConfiguration databaseConfiguration;

  public static final String JSON_PROPERTY_COLLECTION_CONFIG = "collectionConfig";
  private DbCollectionCreatePayload collectionConfig;


  public CreateDatabasePayload databaseName(String databaseName) {
    
    this.databaseName = databaseName;
    return this;
  }

   /**
   * The name of the database to be created
   * @return databaseName
  **/
  @ApiModelProperty(required = true, value = "The name of the database to be created")
  @JsonProperty(JSON_PROPERTY_DATABASE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDatabaseName() {
    return databaseName;
  }


  @JsonProperty(JSON_PROPERTY_DATABASE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }


  public CreateDatabasePayload sourceDatabaseId(UUID sourceDatabaseId) {
    
    this.sourceDatabaseId = sourceDatabaseId;
    return this;
  }

   /**
   * Required while creating a clone. It specifies the Id of the source database from which the clone is being created.
   * @return sourceDatabaseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required while creating a clone. It specifies the Id of the source database from which the clone is being created.")
  @JsonProperty(JSON_PROPERTY_SOURCE_DATABASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSourceDatabaseId() {
    return sourceDatabaseId;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_DATABASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceDatabaseId(UUID sourceDatabaseId) {
    this.sourceDatabaseId = sourceDatabaseId;
  }


  public CreateDatabasePayload databaseConfiguration(CreateDatabasePayloadDatabaseConfiguration databaseConfiguration) {
    
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

  public CreateDatabasePayloadDatabaseConfiguration getDatabaseConfiguration() {
    return databaseConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_DATABASE_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatabaseConfiguration(CreateDatabasePayloadDatabaseConfiguration databaseConfiguration) {
    this.databaseConfiguration = databaseConfiguration;
  }


  public CreateDatabasePayload collectionConfig(DbCollectionCreatePayload collectionConfig) {
    
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

  public DbCollectionCreatePayload getCollectionConfig() {
    return collectionConfig;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTION_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollectionConfig(DbCollectionCreatePayload collectionConfig) {
    this.collectionConfig = collectionConfig;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDatabasePayload createDatabasePayload = (CreateDatabasePayload) o;
    return Objects.equals(this.databaseName, createDatabasePayload.databaseName) &&
        Objects.equals(this.sourceDatabaseId, createDatabasePayload.sourceDatabaseId) &&
        Objects.equals(this.databaseConfiguration, createDatabasePayload.databaseConfiguration) &&
        Objects.equals(this.collectionConfig, createDatabasePayload.collectionConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databaseName, sourceDatabaseId, databaseConfiguration, collectionConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDatabasePayload {\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    sourceDatabaseId: ").append(toIndentedString(sourceDatabaseId)).append("\n");
    sb.append("    databaseConfiguration: ").append(toIndentedString(databaseConfiguration)).append("\n");
    sb.append("    collectionConfig: ").append(toIndentedString(collectionConfig)).append("\n");
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

