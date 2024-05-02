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
import com.tessell.database.system.client.model.ParameterProfile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * ParameterProfileUpdateForDBServiceInstanceWorkflowPayload
 */
@JsonPropertyOrder({
  ParameterProfileUpdateForDBServiceInstanceWorkflowPayload.JSON_PROPERTY_INSTANCE_ID,
  ParameterProfileUpdateForDBServiceInstanceWorkflowPayload.JSON_PROPERTY_CURRENT_PARAMETER_PROFILE,
  ParameterProfileUpdateForDBServiceInstanceWorkflowPayload.JSON_PROPERTY_NEW_PARAMETER_PROFILE
})
@JsonTypeName("ParameterProfileUpdateForDBServiceInstanceWorkflowPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParameterProfileUpdateForDBServiceInstanceWorkflowPayload {
  public static final String JSON_PROPERTY_INSTANCE_ID = "instanceId";
  private UUID instanceId;

  public static final String JSON_PROPERTY_CURRENT_PARAMETER_PROFILE = "currentParameterProfile";
  private ParameterProfile currentParameterProfile;

  public static final String JSON_PROPERTY_NEW_PARAMETER_PROFILE = "newParameterProfile";
  private ParameterProfile newParameterProfile;


  public ParameterProfileUpdateForDBServiceInstanceWorkflowPayload instanceId(UUID instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getInstanceId() {
    return instanceId;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstanceId(UUID instanceId) {
    this.instanceId = instanceId;
  }


  public ParameterProfileUpdateForDBServiceInstanceWorkflowPayload currentParameterProfile(ParameterProfile currentParameterProfile) {
    
    this.currentParameterProfile = currentParameterProfile;
    return this;
  }

   /**
   * Get currentParameterProfile
   * @return currentParameterProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENT_PARAMETER_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ParameterProfile getCurrentParameterProfile() {
    return currentParameterProfile;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_PARAMETER_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentParameterProfile(ParameterProfile currentParameterProfile) {
    this.currentParameterProfile = currentParameterProfile;
  }


  public ParameterProfileUpdateForDBServiceInstanceWorkflowPayload newParameterProfile(ParameterProfile newParameterProfile) {
    
    this.newParameterProfile = newParameterProfile;
    return this;
  }

   /**
   * Get newParameterProfile
   * @return newParameterProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEW_PARAMETER_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ParameterProfile getNewParameterProfile() {
    return newParameterProfile;
  }


  @JsonProperty(JSON_PROPERTY_NEW_PARAMETER_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewParameterProfile(ParameterProfile newParameterProfile) {
    this.newParameterProfile = newParameterProfile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterProfileUpdateForDBServiceInstanceWorkflowPayload parameterProfileUpdateForDBServiceInstanceWorkflowPayload = (ParameterProfileUpdateForDBServiceInstanceWorkflowPayload) o;
    return Objects.equals(this.instanceId, parameterProfileUpdateForDBServiceInstanceWorkflowPayload.instanceId) &&
        Objects.equals(this.currentParameterProfile, parameterProfileUpdateForDBServiceInstanceWorkflowPayload.currentParameterProfile) &&
        Objects.equals(this.newParameterProfile, parameterProfileUpdateForDBServiceInstanceWorkflowPayload.newParameterProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, currentParameterProfile, newParameterProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterProfileUpdateForDBServiceInstanceWorkflowPayload {\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    currentParameterProfile: ").append(toIndentedString(currentParameterProfile)).append("\n");
    sb.append("    newParameterProfile: ").append(toIndentedString(newParameterProfile)).append("\n");
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
