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
import com.tessell.tenant.client.model.SubscriptionStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * BulkDeleteSubscriptionsContext
 */
@JsonPropertyOrder({
  BulkDeleteSubscriptionsContext.JSON_PROPERTY_SUBSCRIPTION_ID,
  BulkDeleteSubscriptionsContext.JSON_PROPERTY_SUBSCRIPTION_STATUS,
  BulkDeleteSubscriptionsContext.JSON_PROPERTY_DELETION_STATUS
})
@JsonTypeName("BulkDeleteSubscriptionsContext")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BulkDeleteSubscriptionsContext {
  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private UUID subscriptionId;

  public static final String JSON_PROPERTY_SUBSCRIPTION_STATUS = "subscriptionStatus";
  private SubscriptionStatus subscriptionStatus;

  public static final String JSON_PROPERTY_DELETION_STATUS = "deletionStatus";
  private ResourceBulkDeleteStatusOps deletionStatus;


  public BulkDeleteSubscriptionsContext subscriptionId(UUID subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * id of the tessell subscription
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "id of the tessell subscription")
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


  public BulkDeleteSubscriptionsContext subscriptionStatus(SubscriptionStatus subscriptionStatus) {
    
    this.subscriptionStatus = subscriptionStatus;
    return this;
  }

   /**
   * Get subscriptionStatus
   * @return subscriptionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionStatus getSubscriptionStatus() {
    return subscriptionStatus;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionStatus(SubscriptionStatus subscriptionStatus) {
    this.subscriptionStatus = subscriptionStatus;
  }


  public BulkDeleteSubscriptionsContext deletionStatus(ResourceBulkDeleteStatusOps deletionStatus) {
    
    this.deletionStatus = deletionStatus;
    return this;
  }

   /**
   * Get deletionStatus
   * @return deletionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELETION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResourceBulkDeleteStatusOps getDeletionStatus() {
    return deletionStatus;
  }


  @JsonProperty(JSON_PROPERTY_DELETION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeletionStatus(ResourceBulkDeleteStatusOps deletionStatus) {
    this.deletionStatus = deletionStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkDeleteSubscriptionsContext bulkDeleteSubscriptionsContext = (BulkDeleteSubscriptionsContext) o;
    return Objects.equals(this.subscriptionId, bulkDeleteSubscriptionsContext.subscriptionId) &&
        Objects.equals(this.subscriptionStatus, bulkDeleteSubscriptionsContext.subscriptionStatus) &&
        Objects.equals(this.deletionStatus, bulkDeleteSubscriptionsContext.deletionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, subscriptionStatus, deletionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkDeleteSubscriptionsContext {\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    subscriptionStatus: ").append(toIndentedString(subscriptionStatus)).append("\n");
    sb.append("    deletionStatus: ").append(toIndentedString(deletionStatus)).append("\n");
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
