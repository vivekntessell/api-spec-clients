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
import com.tessell.tenant.client.model.AzureCredentials;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Azure Data plane account config
 */
@ApiModel(description = "Azure Data plane account config")
@JsonPropertyOrder({
  DataPlaneAccountAzureConfig.JSON_PROPERTY_CREDENTIALS,
  DataPlaneAccountAzureConfig.JSON_PROPERTY_EXECUTION_OUTPUT,
  DataPlaneAccountAzureConfig.JSON_PROPERTY_DEPLOYMENT_REGION
})
@JsonTypeName("DataPlaneAccountAzureConfig")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataPlaneAccountAzureConfig {
  public static final String JSON_PROPERTY_CREDENTIALS = "credentials";
  private AzureCredentials credentials;

  public static final String JSON_PROPERTY_EXECUTION_OUTPUT = "executionOutput";
  private Object executionOutput;

  public static final String JSON_PROPERTY_DEPLOYMENT_REGION = "deploymentRegion";
  private String deploymentRegion = "eastUS";


  public DataPlaneAccountAzureConfig credentials(AzureCredentials credentials) {
    
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AzureCredentials getCredentials() {
    return credentials;
  }


  @JsonProperty(JSON_PROPERTY_CREDENTIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredentials(AzureCredentials credentials) {
    this.credentials = credentials;
  }


  public DataPlaneAccountAzureConfig executionOutput(Object executionOutput) {
    
    this.executionOutput = executionOutput;
    return this;
  }

   /**
   * Execution output from ARM Template Run
   * @return executionOutput
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Execution output from ARM Template Run")
  @JsonProperty(JSON_PROPERTY_EXECUTION_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getExecutionOutput() {
    return executionOutput;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTION_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecutionOutput(Object executionOutput) {
    this.executionOutput = executionOutput;
  }


  public DataPlaneAccountAzureConfig deploymentRegion(String deploymentRegion) {
    
    this.deploymentRegion = deploymentRegion;
    return this;
  }

   /**
   * Deployment Region
   * @return deploymentRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deployment Region")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeploymentRegion() {
    return deploymentRegion;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeploymentRegion(String deploymentRegion) {
    this.deploymentRegion = deploymentRegion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataPlaneAccountAzureConfig dataPlaneAccountAzureConfig = (DataPlaneAccountAzureConfig) o;
    return Objects.equals(this.credentials, dataPlaneAccountAzureConfig.credentials) &&
        Objects.equals(this.executionOutput, dataPlaneAccountAzureConfig.executionOutput) &&
        Objects.equals(this.deploymentRegion, dataPlaneAccountAzureConfig.deploymentRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, executionOutput, deploymentRegion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataPlaneAccountAzureConfig {\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    executionOutput: ").append(toIndentedString(executionOutput)).append("\n");
    sb.append("    deploymentRegion: ").append(toIndentedString(deploymentRegion)).append("\n");
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
