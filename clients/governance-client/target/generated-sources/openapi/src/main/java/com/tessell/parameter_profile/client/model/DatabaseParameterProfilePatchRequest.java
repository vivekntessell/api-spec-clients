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


package com.tessell.parameter_profile.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.parameter_profile.client.model.DatabaseParameterProfileRequest;
import com.tessell.parameter_profile.client.model.ServiceInstances;
import com.tessell.parameter_profile.client.model.UpdatePropagationPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Parameter Profile Object to be updates and details on how it should be propagated to the service instances using that
 */
@ApiModel(description = "Parameter Profile Object to be updates and details on how it should be propagated to the service instances using that")
@JsonPropertyOrder({
  DatabaseParameterProfilePatchRequest.JSON_PROPERTY_PARAMETER_PROFILE,
  DatabaseParameterProfilePatchRequest.JSON_PROPERTY_PROPAGATION_POLICY,
  DatabaseParameterProfilePatchRequest.JSON_PROPERTY_SERVICE_INSTANCES
})
@JsonTypeName("DatabaseParameterProfilePatchRequest")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.959198+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DatabaseParameterProfilePatchRequest {
  public static final String JSON_PROPERTY_PARAMETER_PROFILE = "parameterProfile";
  private DatabaseParameterProfileRequest parameterProfile;

  public static final String JSON_PROPERTY_PROPAGATION_POLICY = "propagationPolicy";
  private UpdatePropagationPolicy propagationPolicy;

  public static final String JSON_PROPERTY_SERVICE_INSTANCES = "serviceInstances";
  private List<ServiceInstances> serviceInstances = null;


  public DatabaseParameterProfilePatchRequest parameterProfile(DatabaseParameterProfileRequest parameterProfile) {
    
    this.parameterProfile = parameterProfile;
    return this;
  }

   /**
   * Get parameterProfile
   * @return parameterProfile
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PARAMETER_PROFILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DatabaseParameterProfileRequest getParameterProfile() {
    return parameterProfile;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER_PROFILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParameterProfile(DatabaseParameterProfileRequest parameterProfile) {
    this.parameterProfile = parameterProfile;
  }


  public DatabaseParameterProfilePatchRequest propagationPolicy(UpdatePropagationPolicy propagationPolicy) {
    
    this.propagationPolicy = propagationPolicy;
    return this;
  }

   /**
   * Get propagationPolicy
   * @return propagationPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROPAGATION_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdatePropagationPolicy getPropagationPolicy() {
    return propagationPolicy;
  }


  @JsonProperty(JSON_PROPERTY_PROPAGATION_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropagationPolicy(UpdatePropagationPolicy propagationPolicy) {
    this.propagationPolicy = propagationPolicy;
  }


  public DatabaseParameterProfilePatchRequest serviceInstances(List<ServiceInstances> serviceInstances) {
    
    this.serviceInstances = serviceInstances;
    return this;
  }

  public DatabaseParameterProfilePatchRequest addServiceInstancesItem(ServiceInstances serviceInstancesItem) {
    if (this.serviceInstances == null) {
      this.serviceInstances = new ArrayList<>();
    }
    this.serviceInstances.add(serviceInstancesItem);
    return this;
  }

   /**
   * Get serviceInstances
   * @return serviceInstances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_INSTANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ServiceInstances> getServiceInstances() {
    return serviceInstances;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_INSTANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceInstances(List<ServiceInstances> serviceInstances) {
    this.serviceInstances = serviceInstances;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseParameterProfilePatchRequest databaseParameterProfilePatchRequest = (DatabaseParameterProfilePatchRequest) o;
    return Objects.equals(this.parameterProfile, databaseParameterProfilePatchRequest.parameterProfile) &&
        Objects.equals(this.propagationPolicy, databaseParameterProfilePatchRequest.propagationPolicy) &&
        Objects.equals(this.serviceInstances, databaseParameterProfilePatchRequest.serviceInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterProfile, propagationPolicy, serviceInstances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseParameterProfilePatchRequest {\n");
    sb.append("    parameterProfile: ").append(toIndentedString(parameterProfile)).append("\n");
    sb.append("    propagationPolicy: ").append(toIndentedString(propagationPolicy)).append("\n");
    sb.append("    serviceInstances: ").append(toIndentedString(serviceInstances)).append("\n");
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
