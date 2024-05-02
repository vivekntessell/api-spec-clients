/*
 * REST API Documentation
 * REST API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.network.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.network.client.model.TessellResourceBulkDeleteStatusOpsDTO;
import com.tessell.network.client.model.TessellVpcPeeringStatusDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellBulkDeleteVpcPeeringContextDTO
 */
@JsonPropertyOrder({
  TessellBulkDeleteVpcPeeringContextDTO.JSON_PROPERTY_ID,
  TessellBulkDeleteVpcPeeringContextDTO.JSON_PROPERTY_STATUS,
  TessellBulkDeleteVpcPeeringContextDTO.JSON_PROPERTY_DELETION_STATUS
})
@JsonTypeName("BulkDeleteVpcPeeringContext")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:07.428121+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellBulkDeleteVpcPeeringContextDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellVpcPeeringStatusDTO status;

  public static final String JSON_PROPERTY_DELETION_STATUS = "deletionStatus";
  private TessellResourceBulkDeleteStatusOpsDTO deletionStatus;


  public TessellBulkDeleteVpcPeeringContextDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * id of the vpc peering
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "id of the vpc peering")
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


  public TessellBulkDeleteVpcPeeringContextDTO status(TessellVpcPeeringStatusDTO status) {
    
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

  public TessellVpcPeeringStatusDTO getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TessellVpcPeeringStatusDTO status) {
    this.status = status;
  }


  public TessellBulkDeleteVpcPeeringContextDTO deletionStatus(TessellResourceBulkDeleteStatusOpsDTO deletionStatus) {
    
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
    TessellBulkDeleteVpcPeeringContextDTO bulkDeleteVpcPeeringContext = (TessellBulkDeleteVpcPeeringContextDTO) o;
    return Objects.equals(this.id, bulkDeleteVpcPeeringContext.id) &&
        Objects.equals(this.status, bulkDeleteVpcPeeringContext.status) &&
        Objects.equals(this.deletionStatus, bulkDeleteVpcPeeringContext.deletionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, deletionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellBulkDeleteVpcPeeringContextDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

