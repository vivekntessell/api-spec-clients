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
import com.tessell.database.system.client.model.DeletePostgresqlConnectionPoolWfPayload;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DeleteConnectionPoolWorkflowPayload
 */
@JsonPropertyOrder({
  DeleteConnectionPoolWorkflowPayload.JSON_PROPERTY_CONNECTION_POOL_ID,
  DeleteConnectionPoolWorkflowPayload.JSON_PROPERTY_DATABASE_ENGINE_TYPE,
  DeleteConnectionPoolWorkflowPayload.JSON_PROPERTY_DELETE_POSTGRESQL_CONN_POOL_PAYLOAD
})
@JsonTypeName("DeleteConnectionPoolWorkflowPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteConnectionPoolWorkflowPayload {
  public static final String JSON_PROPERTY_CONNECTION_POOL_ID = "connectionPoolId";
  private UUID connectionPoolId;

  public static final String JSON_PROPERTY_DATABASE_ENGINE_TYPE = "databaseEngineType";
  private DatabaseEngineType databaseEngineType;

  public static final String JSON_PROPERTY_DELETE_POSTGRESQL_CONN_POOL_PAYLOAD = "deletePostgresqlConnPoolPayload";
  private DeletePostgresqlConnectionPoolWfPayload deletePostgresqlConnPoolPayload;


  public DeleteConnectionPoolWorkflowPayload connectionPoolId(UUID connectionPoolId) {
    
    this.connectionPoolId = connectionPoolId;
    return this;
  }

   /**
   * Get connectionPoolId
   * @return connectionPoolId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTION_POOL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getConnectionPoolId() {
    return connectionPoolId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_POOL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionPoolId(UUID connectionPoolId) {
    this.connectionPoolId = connectionPoolId;
  }


  public DeleteConnectionPoolWorkflowPayload databaseEngineType(DatabaseEngineType databaseEngineType) {
    
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


  public DeleteConnectionPoolWorkflowPayload deletePostgresqlConnPoolPayload(DeletePostgresqlConnectionPoolWfPayload deletePostgresqlConnPoolPayload) {
    
    this.deletePostgresqlConnPoolPayload = deletePostgresqlConnPoolPayload;
    return this;
  }

   /**
   * Get deletePostgresqlConnPoolPayload
   * @return deletePostgresqlConnPoolPayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELETE_POSTGRESQL_CONN_POOL_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeletePostgresqlConnectionPoolWfPayload getDeletePostgresqlConnPoolPayload() {
    return deletePostgresqlConnPoolPayload;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_POSTGRESQL_CONN_POOL_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeletePostgresqlConnPoolPayload(DeletePostgresqlConnectionPoolWfPayload deletePostgresqlConnPoolPayload) {
    this.deletePostgresqlConnPoolPayload = deletePostgresqlConnPoolPayload;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteConnectionPoolWorkflowPayload deleteConnectionPoolWorkflowPayload = (DeleteConnectionPoolWorkflowPayload) o;
    return Objects.equals(this.connectionPoolId, deleteConnectionPoolWorkflowPayload.connectionPoolId) &&
        Objects.equals(this.databaseEngineType, deleteConnectionPoolWorkflowPayload.databaseEngineType) &&
        Objects.equals(this.deletePostgresqlConnPoolPayload, deleteConnectionPoolWorkflowPayload.deletePostgresqlConnPoolPayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionPoolId, databaseEngineType, deletePostgresqlConnPoolPayload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteConnectionPoolWorkflowPayload {\n");
    sb.append("    connectionPoolId: ").append(toIndentedString(connectionPoolId)).append("\n");
    sb.append("    databaseEngineType: ").append(toIndentedString(databaseEngineType)).append("\n");
    sb.append("    deletePostgresqlConnPoolPayload: ").append(toIndentedString(deletePostgresqlConnPoolPayload)).append("\n");
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

