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
import com.tessell.parameter_profile.client.model.DatabaseParameterProfileResponse;
import com.tessell.parameter_profile.client.model.ServiceInstances;
import com.tessell.parameter_profile.client.model.UpdatePropagationPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DatabaseParameterProfileUpdateEvent
 */
@JsonPropertyOrder({
  DatabaseParameterProfileUpdateEvent.JSON_PROPERTY_RESPONSE,
  DatabaseParameterProfileUpdateEvent.JSON_PROPERTY_PROPAGATION_POLICY,
  DatabaseParameterProfileUpdateEvent.JSON_PROPERTY_SERVICE_INSTANCE
})
@JsonTypeName("DatabaseParameterProfileUpdateEvent")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.959198+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DatabaseParameterProfileUpdateEvent {
  public static final String JSON_PROPERTY_RESPONSE = "response";
  private DatabaseParameterProfileResponse response;

  public static final String JSON_PROPERTY_PROPAGATION_POLICY = "propagationPolicy";
  private UpdatePropagationPolicy propagationPolicy;

  public static final String JSON_PROPERTY_SERVICE_INSTANCE = "serviceInstance";
  private ServiceInstances serviceInstance;


  public DatabaseParameterProfileUpdateEvent response(DatabaseParameterProfileResponse response) {
    
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DatabaseParameterProfileResponse getResponse() {
    return response;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponse(DatabaseParameterProfileResponse response) {
    this.response = response;
  }


  public DatabaseParameterProfileUpdateEvent propagationPolicy(UpdatePropagationPolicy propagationPolicy) {
    
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


  public DatabaseParameterProfileUpdateEvent serviceInstance(ServiceInstances serviceInstance) {
    
    this.serviceInstance = serviceInstance;
    return this;
  }

   /**
   * Get serviceInstance
   * @return serviceInstance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceInstances getServiceInstance() {
    return serviceInstance;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceInstance(ServiceInstances serviceInstance) {
    this.serviceInstance = serviceInstance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseParameterProfileUpdateEvent databaseParameterProfileUpdateEvent = (DatabaseParameterProfileUpdateEvent) o;
    return Objects.equals(this.response, databaseParameterProfileUpdateEvent.response) &&
        Objects.equals(this.propagationPolicy, databaseParameterProfileUpdateEvent.propagationPolicy) &&
        Objects.equals(this.serviceInstance, databaseParameterProfileUpdateEvent.serviceInstance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, propagationPolicy, serviceInstance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseParameterProfileUpdateEvent {\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    propagationPolicy: ").append(toIndentedString(propagationPolicy)).append("\n");
    sb.append("    serviceInstance: ").append(toIndentedString(serviceInstance)).append("\n");
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

