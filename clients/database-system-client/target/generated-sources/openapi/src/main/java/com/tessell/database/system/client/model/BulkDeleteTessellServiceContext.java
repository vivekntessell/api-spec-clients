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
import com.tessell.database.system.client.model.ResourceBulkDeleteStatusOps;
import com.tessell.database.system.client.model.TessellServiceStatusOps;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * BulkDeleteTessellServiceContext
 */
@JsonPropertyOrder({
  BulkDeleteTessellServiceContext.JSON_PROPERTY_SERVICE_ID,
  BulkDeleteTessellServiceContext.JSON_PROPERTY_SERVICE_STATUS,
  BulkDeleteTessellServiceContext.JSON_PROPERTY_DELETION_STATUS
})
@JsonTypeName("BulkDeleteTessellServiceContext")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BulkDeleteTessellServiceContext {
  public static final String JSON_PROPERTY_SERVICE_ID = "serviceId";
  private UUID serviceId;

  public static final String JSON_PROPERTY_SERVICE_STATUS = "serviceStatus";
  private TessellServiceStatusOps serviceStatus;

  public static final String JSON_PROPERTY_DELETION_STATUS = "deletionStatus";
  private ResourceBulkDeleteStatusOps deletionStatus;


  public BulkDeleteTessellServiceContext serviceId(UUID serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

   /**
   * id of the tessell service
   * @return serviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "id of the tessell service")
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


  public BulkDeleteTessellServiceContext serviceStatus(TessellServiceStatusOps serviceStatus) {
    
    this.serviceStatus = serviceStatus;
    return this;
  }

   /**
   * Get serviceStatus
   * @return serviceStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceStatusOps getServiceStatus() {
    return serviceStatus;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceStatus(TessellServiceStatusOps serviceStatus) {
    this.serviceStatus = serviceStatus;
  }


  public BulkDeleteTessellServiceContext deletionStatus(ResourceBulkDeleteStatusOps deletionStatus) {
    
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
    BulkDeleteTessellServiceContext bulkDeleteTessellServiceContext = (BulkDeleteTessellServiceContext) o;
    return Objects.equals(this.serviceId, bulkDeleteTessellServiceContext.serviceId) &&
        Objects.equals(this.serviceStatus, bulkDeleteTessellServiceContext.serviceStatus) &&
        Objects.equals(this.deletionStatus, bulkDeleteTessellServiceContext.deletionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, serviceStatus, deletionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkDeleteTessellServiceContext {\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceStatus: ").append(toIndentedString(serviceStatus)).append("\n");
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

