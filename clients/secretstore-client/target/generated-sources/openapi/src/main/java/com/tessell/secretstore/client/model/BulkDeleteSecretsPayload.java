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


package com.tessell.secretstore.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.secretstore.client.model.SkipDeletionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * BulkDeleteSecretsPayload
 */
@JsonPropertyOrder({
  BulkDeleteSecretsPayload.JSON_PROPERTY_TENANT_ID,
  BulkDeleteSecretsPayload.JSON_PROPERTY_SUBSCRIPTION_ID,
  BulkDeleteSecretsPayload.JSON_PROPERTY_SKIP_DELETION,
  BulkDeleteSecretsPayload.JSON_PROPERTY_SCHEDULE_DELETION_AFTER_DAYS
})
@JsonTypeName("BulkDeleteSecretsPayload")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T23:17:31.013725+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BulkDeleteSecretsPayload {
  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private UUID tenantId;

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private UUID subscriptionId;

  public static final String JSON_PROPERTY_SKIP_DELETION = "skipDeletion";
  private List<SkipDeletionInfo> skipDeletion = null;

  public static final String JSON_PROPERTY_SCHEDULE_DELETION_AFTER_DAYS = "scheduleDeletionAfterDays";
  private Integer scheduleDeletionAfterDays;


  public BulkDeleteSecretsPayload tenantId(UUID tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }


  public BulkDeleteSecretsPayload subscriptionId(UUID subscriptionId) {
    
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


  public BulkDeleteSecretsPayload skipDeletion(List<SkipDeletionInfo> skipDeletion) {
    
    this.skipDeletion = skipDeletion;
    return this;
  }

  public BulkDeleteSecretsPayload addSkipDeletionItem(SkipDeletionInfo skipDeletionItem) {
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


  public BulkDeleteSecretsPayload scheduleDeletionAfterDays(Integer scheduleDeletionAfterDays) {
    
    this.scheduleDeletionAfterDays = scheduleDeletionAfterDays;
    return this;
  }

   /**
   * days after which deletion should be scheduled
   * @return scheduleDeletionAfterDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "days after which deletion should be scheduled")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_DELETION_AFTER_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getScheduleDeletionAfterDays() {
    return scheduleDeletionAfterDays;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_DELETION_AFTER_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleDeletionAfterDays(Integer scheduleDeletionAfterDays) {
    this.scheduleDeletionAfterDays = scheduleDeletionAfterDays;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkDeleteSecretsPayload bulkDeleteSecretsPayload = (BulkDeleteSecretsPayload) o;
    return Objects.equals(this.tenantId, bulkDeleteSecretsPayload.tenantId) &&
        Objects.equals(this.subscriptionId, bulkDeleteSecretsPayload.subscriptionId) &&
        Objects.equals(this.skipDeletion, bulkDeleteSecretsPayload.skipDeletion) &&
        Objects.equals(this.scheduleDeletionAfterDays, bulkDeleteSecretsPayload.scheduleDeletionAfterDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, subscriptionId, skipDeletion, scheduleDeletionAfterDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkDeleteSecretsPayload {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    skipDeletion: ").append(toIndentedString(skipDeletion)).append("\n");
    sb.append("    scheduleDeletionAfterDays: ").append(toIndentedString(scheduleDeletionAfterDays)).append("\n");
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
