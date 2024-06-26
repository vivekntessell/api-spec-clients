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
import com.tessell.database.system.client.model.DbLicenseInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * WorkflowInstanceResizeConfigAllOf
 */
@JsonPropertyOrder({
  WorkflowInstanceResizeConfigAllOf.JSON_PROPERTY_STORAGE,
  WorkflowInstanceResizeConfigAllOf.JSON_PROPERTY_PARAMETER_PROFILE_ID,
  WorkflowInstanceResizeConfigAllOf.JSON_PROPERTY_CURRENT_LICENSE_INFO,
  WorkflowInstanceResizeConfigAllOf.JSON_PROPERTY_NEW_LICENSE_INFO
})
@JsonTypeName("WorkflowInstanceResizeConfig_allOf")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkflowInstanceResizeConfigAllOf {
  public static final String JSON_PROPERTY_STORAGE = "storage";
  private Long storage;

  public static final String JSON_PROPERTY_PARAMETER_PROFILE_ID = "parameterProfileId";
  private UUID parameterProfileId;

  public static final String JSON_PROPERTY_CURRENT_LICENSE_INFO = "currentLicenseInfo";
  private DbLicenseInfo currentLicenseInfo;

  public static final String JSON_PROPERTY_NEW_LICENSE_INFO = "newLicenseInfo";
  private DbLicenseInfo newLicenseInfo;


  public WorkflowInstanceResizeConfigAllOf storage(Long storage) {
    
    this.storage = storage;
    return this;
  }

   /**
   * The new storage (in bytes) for the service
   * @return storage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The new storage (in bytes) for the service")
  @JsonProperty(JSON_PROPERTY_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStorage() {
    return storage;
  }


  @JsonProperty(JSON_PROPERTY_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStorage(Long storage) {
    this.storage = storage;
  }


  public WorkflowInstanceResizeConfigAllOf parameterProfileId(UUID parameterProfileId) {
    
    this.parameterProfileId = parameterProfileId;
    return this;
  }

   /**
   * Get parameterProfileId
   * @return parameterProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARAMETER_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getParameterProfileId() {
    return parameterProfileId;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameterProfileId(UUID parameterProfileId) {
    this.parameterProfileId = parameterProfileId;
  }


  public WorkflowInstanceResizeConfigAllOf currentLicenseInfo(DbLicenseInfo currentLicenseInfo) {
    
    this.currentLicenseInfo = currentLicenseInfo;
    return this;
  }

   /**
   * Get currentLicenseInfo
   * @return currentLicenseInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENT_LICENSE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbLicenseInfo getCurrentLicenseInfo() {
    return currentLicenseInfo;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_LICENSE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentLicenseInfo(DbLicenseInfo currentLicenseInfo) {
    this.currentLicenseInfo = currentLicenseInfo;
  }


  public WorkflowInstanceResizeConfigAllOf newLicenseInfo(DbLicenseInfo newLicenseInfo) {
    
    this.newLicenseInfo = newLicenseInfo;
    return this;
  }

   /**
   * Get newLicenseInfo
   * @return newLicenseInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEW_LICENSE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbLicenseInfo getNewLicenseInfo() {
    return newLicenseInfo;
  }


  @JsonProperty(JSON_PROPERTY_NEW_LICENSE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewLicenseInfo(DbLicenseInfo newLicenseInfo) {
    this.newLicenseInfo = newLicenseInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowInstanceResizeConfigAllOf workflowInstanceResizeConfigAllOf = (WorkflowInstanceResizeConfigAllOf) o;
    return Objects.equals(this.storage, workflowInstanceResizeConfigAllOf.storage) &&
        Objects.equals(this.parameterProfileId, workflowInstanceResizeConfigAllOf.parameterProfileId) &&
        Objects.equals(this.currentLicenseInfo, workflowInstanceResizeConfigAllOf.currentLicenseInfo) &&
        Objects.equals(this.newLicenseInfo, workflowInstanceResizeConfigAllOf.newLicenseInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storage, parameterProfileId, currentLicenseInfo, newLicenseInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowInstanceResizeConfigAllOf {\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    parameterProfileId: ").append(toIndentedString(parameterProfileId)).append("\n");
    sb.append("    currentLicenseInfo: ").append(toIndentedString(currentLicenseInfo)).append("\n");
    sb.append("    newLicenseInfo: ").append(toIndentedString(newLicenseInfo)).append("\n");
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

