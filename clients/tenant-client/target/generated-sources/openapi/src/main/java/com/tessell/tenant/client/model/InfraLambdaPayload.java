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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * InfraLambdaPayload
 */
@JsonPropertyOrder({
  InfraLambdaPayload.JSON_PROPERTY_NAME,
  InfraLambdaPayload.JSON_PROPERTY_PURPOSE,
  InfraLambdaPayload.JSON_PROPERTY_HANDLER,
  InfraLambdaPayload.JSON_PROPERTY_LOCATION,
  InfraLambdaPayload.JSON_PROPERTY_RUNTIME,
  InfraLambdaPayload.JSON_PROPERTY_FOR_ACCOUNT_TYPE
})
@JsonTypeName("InfraLambdaPayload")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InfraLambdaPayload {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PURPOSE = "purpose";
  private String purpose;

  public static final String JSON_PROPERTY_HANDLER = "handler";
  private String handler;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_RUNTIME = "runtime";
  private String runtime;

  public static final String JSON_PROPERTY_FOR_ACCOUNT_TYPE = "forAccountType";
  private String forAccountType;


  public InfraLambdaPayload name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public InfraLambdaPayload purpose(String purpose) {
    
    this.purpose = purpose;
    return this;
  }

   /**
   * Get purpose
   * @return purpose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPurpose() {
    return purpose;
  }


  @JsonProperty(JSON_PROPERTY_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }


  public InfraLambdaPayload handler(String handler) {
    
    this.handler = handler;
    return this;
  }

   /**
   * Get handler
   * @return handler
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HANDLER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHandler() {
    return handler;
  }


  @JsonProperty(JSON_PROPERTY_HANDLER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHandler(String handler) {
    this.handler = handler;
  }


  public InfraLambdaPayload location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(String location) {
    this.location = location;
  }


  public InfraLambdaPayload runtime(String runtime) {
    
    this.runtime = runtime;
    return this;
  }

   /**
   * Get runtime
   * @return runtime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RUNTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRuntime() {
    return runtime;
  }


  @JsonProperty(JSON_PROPERTY_RUNTIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }


  public InfraLambdaPayload forAccountType(String forAccountType) {
    
    this.forAccountType = forAccountType;
    return this;
  }

   /**
   * Get forAccountType
   * @return forAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FOR_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getForAccountType() {
    return forAccountType;
  }


  @JsonProperty(JSON_PROPERTY_FOR_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForAccountType(String forAccountType) {
    this.forAccountType = forAccountType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfraLambdaPayload infraLambdaPayload = (InfraLambdaPayload) o;
    return Objects.equals(this.name, infraLambdaPayload.name) &&
        Objects.equals(this.purpose, infraLambdaPayload.purpose) &&
        Objects.equals(this.handler, infraLambdaPayload.handler) &&
        Objects.equals(this.location, infraLambdaPayload.location) &&
        Objects.equals(this.runtime, infraLambdaPayload.runtime) &&
        Objects.equals(this.forAccountType, infraLambdaPayload.forAccountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, purpose, handler, location, runtime, forAccountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfraLambdaPayload {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    handler: ").append(toIndentedString(handler)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    forAccountType: ").append(toIndentedString(forAccountType)).append("\n");
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

