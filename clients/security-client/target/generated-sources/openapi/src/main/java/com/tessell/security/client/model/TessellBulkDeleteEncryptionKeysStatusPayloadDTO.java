/*
 * Tessell REST API Documentation
 * Tessell REST API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.security.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.security.client.model.TessellResourceBulkDeleteStatusOpsDTO;
import com.tessell.security.client.model.TessellSkipDeletionInfoDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellBulkDeleteEncryptionKeysStatusPayloadDTO
 */
@JsonPropertyOrder({
  TessellBulkDeleteEncryptionKeysStatusPayloadDTO.JSON_PROPERTY_CLEANUP_ID,
  TessellBulkDeleteEncryptionKeysStatusPayloadDTO.JSON_PROPERTY_STATUS,
  TessellBulkDeleteEncryptionKeysStatusPayloadDTO.JSON_PROPERTY_TIMESTAMP,
  TessellBulkDeleteEncryptionKeysStatusPayloadDTO.JSON_PROPERTY_TENANT_ID,
  TessellBulkDeleteEncryptionKeysStatusPayloadDTO.JSON_PROPERTY_SUBSCRIPTION_ID,
  TessellBulkDeleteEncryptionKeysStatusPayloadDTO.JSON_PROPERTY_SKIP_DELETION,
  TessellBulkDeleteEncryptionKeysStatusPayloadDTO.JSON_PROPERTY_CONTEXT
})
@JsonTypeName("BulkDeleteEncryptionKeysStatusPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellBulkDeleteEncryptionKeysStatusPayloadDTO {
  public static final String JSON_PROPERTY_CLEANUP_ID = "cleanupId";
  private UUID cleanupId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellResourceBulkDeleteStatusOpsDTO status;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private UUID tenantId;

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private UUID subscriptionId;

  public static final String JSON_PROPERTY_SKIP_DELETION = "skipDeletion";
  private List<TessellSkipDeletionInfoDTO> skipDeletion = null;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private Object context;


  public TessellBulkDeleteEncryptionKeysStatusPayloadDTO cleanupId(UUID cleanupId) {
    
    this.cleanupId = cleanupId;
    return this;
  }

   /**
   * Get cleanupId
   * @return cleanupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLEANUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCleanupId() {
    return cleanupId;
  }


  @JsonProperty(JSON_PROPERTY_CLEANUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCleanupId(UUID cleanupId) {
    this.cleanupId = cleanupId;
  }


  public TessellBulkDeleteEncryptionKeysStatusPayloadDTO status(TessellResourceBulkDeleteStatusOpsDTO status) {
    
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

  public TessellResourceBulkDeleteStatusOpsDTO getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TessellResourceBulkDeleteStatusOpsDTO status) {
    this.status = status;
  }


  public TessellBulkDeleteEncryptionKeysStatusPayloadDTO timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public TessellBulkDeleteEncryptionKeysStatusPayloadDTO tenantId(UUID tenantId) {
    
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

  public UUID getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }


  public TessellBulkDeleteEncryptionKeysStatusPayloadDTO subscriptionId(UUID subscriptionId) {
    
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


  public TessellBulkDeleteEncryptionKeysStatusPayloadDTO skipDeletion(List<TessellSkipDeletionInfoDTO> skipDeletion) {
    
    this.skipDeletion = skipDeletion;
    return this;
  }

  public TessellBulkDeleteEncryptionKeysStatusPayloadDTO addSkipDeletionItem(TessellSkipDeletionInfoDTO skipDeletionItem) {
    if (this.skipDeletion == null) {
      this.skipDeletion = new ArrayList<>();
    }
    this.skipDeletion.add(skipDeletionItem);
    return this;
  }

   /**
   * List of services to be skipped for deletion
   * @return skipDeletion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of services to be skipped for deletion")
  @JsonProperty(JSON_PROPERTY_SKIP_DELETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellSkipDeletionInfoDTO> getSkipDeletion() {
    return skipDeletion;
  }


  @JsonProperty(JSON_PROPERTY_SKIP_DELETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkipDeletion(List<TessellSkipDeletionInfoDTO> skipDeletion) {
    this.skipDeletion = skipDeletion;
  }


  public TessellBulkDeleteEncryptionKeysStatusPayloadDTO context(Object context) {
    
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getContext() {
    return context;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContext(Object context) {
    this.context = context;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellBulkDeleteEncryptionKeysStatusPayloadDTO bulkDeleteEncryptionKeysStatusPayload = (TessellBulkDeleteEncryptionKeysStatusPayloadDTO) o;
    return Objects.equals(this.cleanupId, bulkDeleteEncryptionKeysStatusPayload.cleanupId) &&
        Objects.equals(this.status, bulkDeleteEncryptionKeysStatusPayload.status) &&
        Objects.equals(this.timestamp, bulkDeleteEncryptionKeysStatusPayload.timestamp) &&
        Objects.equals(this.tenantId, bulkDeleteEncryptionKeysStatusPayload.tenantId) &&
        Objects.equals(this.subscriptionId, bulkDeleteEncryptionKeysStatusPayload.subscriptionId) &&
        Objects.equals(this.skipDeletion, bulkDeleteEncryptionKeysStatusPayload.skipDeletion) &&
        Objects.equals(this.context, bulkDeleteEncryptionKeysStatusPayload.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanupId, status, timestamp, tenantId, subscriptionId, skipDeletion, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellBulkDeleteEncryptionKeysStatusPayloadDTO {\n");
    sb.append("    cleanupId: ").append(toIndentedString(cleanupId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    skipDeletion: ").append(toIndentedString(skipDeletion)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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
