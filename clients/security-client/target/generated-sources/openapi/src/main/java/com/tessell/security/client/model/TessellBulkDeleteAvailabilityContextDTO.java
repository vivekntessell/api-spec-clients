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
import com.tessell.security.client.model.TessellEncryptionKeyStatusDTO;
import com.tessell.security.client.model.TessellResourceBulkDeleteStatusOpsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellBulkDeleteAvailabilityContextDTO
 */
@JsonPropertyOrder({
  TessellBulkDeleteAvailabilityContextDTO.JSON_PROPERTY_SUBSCRIPTION_ID,
  TessellBulkDeleteAvailabilityContextDTO.JSON_PROPERTY_REGION,
  TessellBulkDeleteAvailabilityContextDTO.JSON_PROPERTY_STATUS,
  TessellBulkDeleteAvailabilityContextDTO.JSON_PROPERTY_DELETION_STATUS
})
@JsonTypeName("BulkDeleteAvailabilityContext")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellBulkDeleteAvailabilityContextDTO {
  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private UUID subscriptionId;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellEncryptionKeyStatusDTO status;

  public static final String JSON_PROPERTY_DELETION_STATUS = "deletionStatus";
  private TessellResourceBulkDeleteStatusOpsDTO deletionStatus;


  public TessellBulkDeleteAvailabilityContextDTO subscriptionId(UUID subscriptionId) {
    
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


  public TessellBulkDeleteAvailabilityContextDTO region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  public TessellBulkDeleteAvailabilityContextDTO status(TessellEncryptionKeyStatusDTO status) {
    
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

  public TessellEncryptionKeyStatusDTO getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TessellEncryptionKeyStatusDTO status) {
    this.status = status;
  }


  public TessellBulkDeleteAvailabilityContextDTO deletionStatus(TessellResourceBulkDeleteStatusOpsDTO deletionStatus) {
    
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

  public TessellResourceBulkDeleteStatusOpsDTO getDeletionStatus() {
    return deletionStatus;
  }


  @JsonProperty(JSON_PROPERTY_DELETION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeletionStatus(TessellResourceBulkDeleteStatusOpsDTO deletionStatus) {
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
    TessellBulkDeleteAvailabilityContextDTO bulkDeleteAvailabilityContext = (TessellBulkDeleteAvailabilityContextDTO) o;
    return Objects.equals(this.subscriptionId, bulkDeleteAvailabilityContext.subscriptionId) &&
        Objects.equals(this.region, bulkDeleteAvailabilityContext.region) &&
        Objects.equals(this.status, bulkDeleteAvailabilityContext.status) &&
        Objects.equals(this.deletionStatus, bulkDeleteAvailabilityContext.deletionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, region, status, deletionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellBulkDeleteAvailabilityContextDTO {\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
