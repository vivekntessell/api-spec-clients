/*
 * Tessell Tenant Onboarding Service API
 * Tenant Onboarding API
 *
 * The version of the OpenAPI document: v1beta
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.tenant.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.tenant.client.model.ResourceBulkDeleteStatusOps;
import com.tessell.tenant.client.model.SkipDeletionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * ResourceBulkDeleteResponseOps
 */
@JsonPropertyOrder({
  ResourceBulkDeleteResponseOps.JSON_PROPERTY_CLEANUP_ID,
  ResourceBulkDeleteResponseOps.JSON_PROPERTY_STATUS,
  ResourceBulkDeleteResponseOps.JSON_PROPERTY_TIMESTAMP,
  ResourceBulkDeleteResponseOps.JSON_PROPERTY_TENANT_ID,
  ResourceBulkDeleteResponseOps.JSON_PROPERTY_SUBSCRIPTION_ID,
  ResourceBulkDeleteResponseOps.JSON_PROPERTY_SKIP_DELETION,
  ResourceBulkDeleteResponseOps.JSON_PROPERTY_CONTEXT
})
@JsonTypeName("ResourceBulkDeleteResponseOps")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceBulkDeleteResponseOps {
  public static final String JSON_PROPERTY_CLEANUP_ID = "cleanupId";
  private UUID cleanupId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ResourceBulkDeleteStatusOps status;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Date timestamp;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private UUID tenantId;

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private UUID subscriptionId;

  public static final String JSON_PROPERTY_SKIP_DELETION = "skipDeletion";
  private List<SkipDeletionInfo> skipDeletion = null;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private Object context;


  public ResourceBulkDeleteResponseOps cleanupId(UUID cleanupId) {
    
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


  public ResourceBulkDeleteResponseOps status(ResourceBulkDeleteStatusOps status) {
    
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

  public ResourceBulkDeleteStatusOps getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(ResourceBulkDeleteStatusOps status) {
    this.status = status;
  }


  public ResourceBulkDeleteResponseOps timestamp(Date timestamp) {
    
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

  public Date getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }


  public ResourceBulkDeleteResponseOps tenantId(UUID tenantId) {
    
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


  public ResourceBulkDeleteResponseOps subscriptionId(UUID subscriptionId) {
    
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


  public ResourceBulkDeleteResponseOps skipDeletion(List<SkipDeletionInfo> skipDeletion) {
    
    this.skipDeletion = skipDeletion;
    return this;
  }

  public ResourceBulkDeleteResponseOps addSkipDeletionItem(SkipDeletionInfo skipDeletionItem) {
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

  public List<SkipDeletionInfo> getSkipDeletion() {
    return skipDeletion;
  }


  @JsonProperty(JSON_PROPERTY_SKIP_DELETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkipDeletion(List<SkipDeletionInfo> skipDeletion) {
    this.skipDeletion = skipDeletion;
  }


  public ResourceBulkDeleteResponseOps context(Object context) {
    
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
    ResourceBulkDeleteResponseOps resourceBulkDeleteResponseOps = (ResourceBulkDeleteResponseOps) o;
    return Objects.equals(this.cleanupId, resourceBulkDeleteResponseOps.cleanupId) &&
        Objects.equals(this.status, resourceBulkDeleteResponseOps.status) &&
        Objects.equals(this.timestamp, resourceBulkDeleteResponseOps.timestamp) &&
        Objects.equals(this.tenantId, resourceBulkDeleteResponseOps.tenantId) &&
        Objects.equals(this.subscriptionId, resourceBulkDeleteResponseOps.subscriptionId) &&
        Objects.equals(this.skipDeletion, resourceBulkDeleteResponseOps.skipDeletion) &&
        Objects.equals(this.context, resourceBulkDeleteResponseOps.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanupId, status, timestamp, tenantId, subscriptionId, skipDeletion, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceBulkDeleteResponseOps {\n");
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

