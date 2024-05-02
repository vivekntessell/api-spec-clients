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
import com.tessell.database.system.client.model.DbCollectionIndexPayload;
import com.tessell.database.system.client.model.IndexWorkflowActionTypeOps;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * IndexTaskPayloadOps
 */
@JsonPropertyOrder({
  IndexTaskPayloadOps.JSON_PROPERTY_ACTION,
  IndexTaskPayloadOps.JSON_PROPERTY_DATABASE_ID,
  IndexTaskPayloadOps.JSON_PROPERTY_SERVICE_ID,
  IndexTaskPayloadOps.JSON_PROPERTY_COLLECTION_ID,
  IndexTaskPayloadOps.JSON_PROPERTY_INDEX_ID,
  IndexTaskPayloadOps.JSON_PROPERTY_TENANT_ID,
  IndexTaskPayloadOps.JSON_PROPERTY_COLLECTION_NAME,
  IndexTaskPayloadOps.JSON_PROPERTY_DB_COLLECTION_INDEX_CREATE_PAYLOAD
})
@JsonTypeName("IndexTaskPayloadOps")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class IndexTaskPayloadOps {
  public static final String JSON_PROPERTY_ACTION = "action";
  private IndexWorkflowActionTypeOps action;

  public static final String JSON_PROPERTY_DATABASE_ID = "databaseId";
  private UUID databaseId;

  public static final String JSON_PROPERTY_SERVICE_ID = "serviceId";
  private UUID serviceId;

  public static final String JSON_PROPERTY_COLLECTION_ID = "collectionId";
  private UUID collectionId;

  public static final String JSON_PROPERTY_INDEX_ID = "indexId";
  private UUID indexId;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private String tenantId;

  public static final String JSON_PROPERTY_COLLECTION_NAME = "collectionName";
  private String collectionName;

  public static final String JSON_PROPERTY_DB_COLLECTION_INDEX_CREATE_PAYLOAD = "DbCollectionIndexCreatePayload";
  private DbCollectionIndexPayload dbCollectionIndexCreatePayload;


  public IndexTaskPayloadOps action(IndexWorkflowActionTypeOps action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IndexWorkflowActionTypeOps getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAction(IndexWorkflowActionTypeOps action) {
    this.action = action;
  }


  public IndexTaskPayloadOps databaseId(UUID databaseId) {
    
    this.databaseId = databaseId;
    return this;
  }

   /**
   * Get databaseId
   * @return databaseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public IndexTaskPayloadOps serviceId(UUID serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Get serviceId
   * @return serviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public IndexTaskPayloadOps collectionId(UUID collectionId) {
    
    this.collectionId = collectionId;
    return this;
  }

   /**
   * Get collectionId
   * @return collectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLLECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCollectionId() {
    return collectionId;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollectionId(UUID collectionId) {
    this.collectionId = collectionId;
  }


  public IndexTaskPayloadOps indexId(UUID indexId) {
    
    this.indexId = indexId;
    return this;
  }

   /**
   * Get indexId
   * @return indexId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDEX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getIndexId() {
    return indexId;
  }


  @JsonProperty(JSON_PROPERTY_INDEX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndexId(UUID indexId) {
    this.indexId = indexId;
  }


  public IndexTaskPayloadOps tenantId(String tenantId) {
    
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


  public IndexTaskPayloadOps collectionName(String collectionName) {
    
    this.collectionName = collectionName;
    return this;
  }

   /**
   * Get collectionName
   * @return collectionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLLECTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCollectionName() {
    return collectionName;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollectionName(String collectionName) {
    this.collectionName = collectionName;
  }


  public IndexTaskPayloadOps dbCollectionIndexCreatePayload(DbCollectionIndexPayload dbCollectionIndexCreatePayload) {
    
    this.dbCollectionIndexCreatePayload = dbCollectionIndexCreatePayload;
    return this;
  }

   /**
   * Get dbCollectionIndexCreatePayload
   * @return dbCollectionIndexCreatePayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DB_COLLECTION_INDEX_CREATE_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbCollectionIndexPayload getDbCollectionIndexCreatePayload() {
    return dbCollectionIndexCreatePayload;
  }


  @JsonProperty(JSON_PROPERTY_DB_COLLECTION_INDEX_CREATE_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbCollectionIndexCreatePayload(DbCollectionIndexPayload dbCollectionIndexCreatePayload) {
    this.dbCollectionIndexCreatePayload = dbCollectionIndexCreatePayload;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexTaskPayloadOps indexTaskPayloadOps = (IndexTaskPayloadOps) o;
    return Objects.equals(this.action, indexTaskPayloadOps.action) &&
        Objects.equals(this.databaseId, indexTaskPayloadOps.databaseId) &&
        Objects.equals(this.serviceId, indexTaskPayloadOps.serviceId) &&
        Objects.equals(this.collectionId, indexTaskPayloadOps.collectionId) &&
        Objects.equals(this.indexId, indexTaskPayloadOps.indexId) &&
        Objects.equals(this.tenantId, indexTaskPayloadOps.tenantId) &&
        Objects.equals(this.collectionName, indexTaskPayloadOps.collectionName) &&
        Objects.equals(this.dbCollectionIndexCreatePayload, indexTaskPayloadOps.dbCollectionIndexCreatePayload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, databaseId, serviceId, collectionId, indexId, tenantId, collectionName, dbCollectionIndexCreatePayload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexTaskPayloadOps {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    indexId: ").append(toIndentedString(indexId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    collectionName: ").append(toIndentedString(collectionName)).append("\n");
    sb.append("    dbCollectionIndexCreatePayload: ").append(toIndentedString(dbCollectionIndexCreatePayload)).append("\n");
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

