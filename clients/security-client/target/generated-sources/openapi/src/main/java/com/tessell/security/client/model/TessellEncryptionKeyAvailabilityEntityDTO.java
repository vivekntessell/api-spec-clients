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
import com.tessell.security.client.model.TessellEncryptionKeyAvailabilityEntityIdDTO;
import com.tessell.security.client.model.TessellEncryptionKeyStatusDTO;
import com.tessell.security.client.model.TessellEncryptionKeyTypeDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell encryption keys availabilities
 */
@ApiModel(description = "This is a definition for Tessell encryption keys availabilities")
@JsonPropertyOrder({
  TessellEncryptionKeyAvailabilityEntityDTO.JSON_PROPERTY_ID,
  TessellEncryptionKeyAvailabilityEntityDTO.JSON_PROPERTY_STATUS,
  TessellEncryptionKeyAvailabilityEntityDTO.JSON_PROPERTY_EXTERNAL_ID,
  TessellEncryptionKeyAvailabilityEntityDTO.JSON_PROPERTY_DEPLOYMENT_ID,
  TessellEncryptionKeyAvailabilityEntityDTO.JSON_PROPERTY_TYPE
})
@JsonTypeName("EncryptionKeyAvailabilityEntity")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellEncryptionKeyAvailabilityEntityDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private TessellEncryptionKeyAvailabilityEntityIdDTO id;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellEncryptionKeyStatusDTO status;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_DEPLOYMENT_ID = "deploymentId";
  private UUID deploymentId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TessellEncryptionKeyTypeDTO type;


  public TessellEncryptionKeyAvailabilityEntityDTO id(TessellEncryptionKeyAvailabilityEntityIdDTO id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellEncryptionKeyAvailabilityEntityIdDTO getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(TessellEncryptionKeyAvailabilityEntityIdDTO id) {
    this.id = id;
  }


  public TessellEncryptionKeyAvailabilityEntityDTO status(TessellEncryptionKeyStatusDTO status) {
    
    this.status = status;
    return this;
  }

   /**
   * Availability status of encryption key
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Availability status of encryption key")
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


  public TessellEncryptionKeyAvailabilityEntityDTO externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * external id like arn of the encryption key
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "external id like arn of the encryption key")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public TessellEncryptionKeyAvailabilityEntityDTO deploymentId(UUID deploymentId) {
    
    this.deploymentId = deploymentId;
    return this;
  }

   /**
   * deployment id of the encryption key
   * @return deploymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "deployment id of the encryption key")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getDeploymentId() {
    return deploymentId;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeploymentId(UUID deploymentId) {
    this.deploymentId = deploymentId;
  }


  public TessellEncryptionKeyAvailabilityEntityDTO type(TessellEncryptionKeyTypeDTO type) {
    
    this.type = type;
    return this;
  }

   /**
   * type of key primary or replica
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "type of key primary or replica")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellEncryptionKeyTypeDTO getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TessellEncryptionKeyTypeDTO type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellEncryptionKeyAvailabilityEntityDTO encryptionKeyAvailabilityEntity = (TessellEncryptionKeyAvailabilityEntityDTO) o;
    return Objects.equals(this.id, encryptionKeyAvailabilityEntity.id) &&
        Objects.equals(this.status, encryptionKeyAvailabilityEntity.status) &&
        Objects.equals(this.externalId, encryptionKeyAvailabilityEntity.externalId) &&
        Objects.equals(this.deploymentId, encryptionKeyAvailabilityEntity.deploymentId) &&
        Objects.equals(this.type, encryptionKeyAvailabilityEntity.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, externalId, deploymentId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellEncryptionKeyAvailabilityEntityDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

