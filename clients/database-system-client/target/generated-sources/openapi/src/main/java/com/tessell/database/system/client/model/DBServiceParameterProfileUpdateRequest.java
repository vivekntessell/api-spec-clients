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
import com.tessell.database.system.client.model.ApplyConfig;
import com.tessell.database.system.client.model.DBServiceInstanceParameterProfileUpdateRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DBServiceParameterProfileUpdateRequest
 */
@JsonPropertyOrder({
  DBServiceParameterProfileUpdateRequest.JSON_PROPERTY_INSTANCE_PARAMETER_PROFILE_CONFIG,
  DBServiceParameterProfileUpdateRequest.JSON_PROPERTY_APPLY_CONFIG
})
@JsonTypeName("DBServiceParameterProfileUpdateRequest")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DBServiceParameterProfileUpdateRequest {
  public static final String JSON_PROPERTY_INSTANCE_PARAMETER_PROFILE_CONFIG = "instanceParameterProfileConfig";
  private List<DBServiceInstanceParameterProfileUpdateRequest> instanceParameterProfileConfig = null;

  public static final String JSON_PROPERTY_APPLY_CONFIG = "applyConfig";
  private ApplyConfig applyConfig;


  public DBServiceParameterProfileUpdateRequest instanceParameterProfileConfig(List<DBServiceInstanceParameterProfileUpdateRequest> instanceParameterProfileConfig) {
    
    this.instanceParameterProfileConfig = instanceParameterProfileConfig;
    return this;
  }

  public DBServiceParameterProfileUpdateRequest addInstanceParameterProfileConfigItem(DBServiceInstanceParameterProfileUpdateRequest instanceParameterProfileConfigItem) {
    if (this.instanceParameterProfileConfig == null) {
      this.instanceParameterProfileConfig = new ArrayList<>();
    }
    this.instanceParameterProfileConfig.add(instanceParameterProfileConfigItem);
    return this;
  }

   /**
   * Get instanceParameterProfileConfig
   * @return instanceParameterProfileConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTANCE_PARAMETER_PROFILE_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DBServiceInstanceParameterProfileUpdateRequest> getInstanceParameterProfileConfig() {
    return instanceParameterProfileConfig;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_PARAMETER_PROFILE_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstanceParameterProfileConfig(List<DBServiceInstanceParameterProfileUpdateRequest> instanceParameterProfileConfig) {
    this.instanceParameterProfileConfig = instanceParameterProfileConfig;
  }


  public DBServiceParameterProfileUpdateRequest applyConfig(ApplyConfig applyConfig) {
    
    this.applyConfig = applyConfig;
    return this;
  }

   /**
   * Get applyConfig
   * @return applyConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPLY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApplyConfig getApplyConfig() {
    return applyConfig;
  }


  @JsonProperty(JSON_PROPERTY_APPLY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplyConfig(ApplyConfig applyConfig) {
    this.applyConfig = applyConfig;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DBServiceParameterProfileUpdateRequest dbServiceParameterProfileUpdateRequest = (DBServiceParameterProfileUpdateRequest) o;
    return Objects.equals(this.instanceParameterProfileConfig, dbServiceParameterProfileUpdateRequest.instanceParameterProfileConfig) &&
        Objects.equals(this.applyConfig, dbServiceParameterProfileUpdateRequest.applyConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceParameterProfileConfig, applyConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBServiceParameterProfileUpdateRequest {\n");
    sb.append("    instanceParameterProfileConfig: ").append(toIndentedString(instanceParameterProfileConfig)).append("\n");
    sb.append("    applyConfig: ").append(toIndentedString(applyConfig)).append("\n");
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

