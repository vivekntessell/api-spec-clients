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
import com.tessell.database.system.client.model.TessellPerfInsightsConfigTaskPayloadConnectivity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellPerfInsightsConfigTaskPayload
 */
@JsonPropertyOrder({
  TessellPerfInsightsConfigTaskPayload.JSON_PROPERTY_PERF_INSIGHTS_ENABLED,
  TessellPerfInsightsConfigTaskPayload.JSON_PROPERTY_MONITORING_DEPLOYMENT_ID,
  TessellPerfInsightsConfigTaskPayload.JSON_PROPERTY_CONNECTIVITY
})
@JsonTypeName("TessellPerfInsightsConfigTaskPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellPerfInsightsConfigTaskPayload {
  public static final String JSON_PROPERTY_PERF_INSIGHTS_ENABLED = "perfInsightsEnabled";
  private Boolean perfInsightsEnabled;

  public static final String JSON_PROPERTY_MONITORING_DEPLOYMENT_ID = "monitoringDeploymentId";
  private UUID monitoringDeploymentId;

  public static final String JSON_PROPERTY_CONNECTIVITY = "connectivity";
  private TessellPerfInsightsConfigTaskPayloadConnectivity connectivity;


  public TessellPerfInsightsConfigTaskPayload perfInsightsEnabled(Boolean perfInsightsEnabled) {
    
    this.perfInsightsEnabled = perfInsightsEnabled;
    return this;
  }

   /**
   * Get perfInsightsEnabled
   * @return perfInsightsEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERF_INSIGHTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPerfInsightsEnabled() {
    return perfInsightsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_PERF_INSIGHTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerfInsightsEnabled(Boolean perfInsightsEnabled) {
    this.perfInsightsEnabled = perfInsightsEnabled;
  }


  public TessellPerfInsightsConfigTaskPayload monitoringDeploymentId(UUID monitoringDeploymentId) {
    
    this.monitoringDeploymentId = monitoringDeploymentId;
    return this;
  }

   /**
   * Id of the monitoring deployment
   * @return monitoringDeploymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the monitoring deployment")
  @JsonProperty(JSON_PROPERTY_MONITORING_DEPLOYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getMonitoringDeploymentId() {
    return monitoringDeploymentId;
  }


  @JsonProperty(JSON_PROPERTY_MONITORING_DEPLOYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonitoringDeploymentId(UUID monitoringDeploymentId) {
    this.monitoringDeploymentId = monitoringDeploymentId;
  }


  public TessellPerfInsightsConfigTaskPayload connectivity(TessellPerfInsightsConfigTaskPayloadConnectivity connectivity) {
    
    this.connectivity = connectivity;
    return this;
  }

   /**
   * Get connectivity
   * @return connectivity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellPerfInsightsConfigTaskPayloadConnectivity getConnectivity() {
    return connectivity;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectivity(TessellPerfInsightsConfigTaskPayloadConnectivity connectivity) {
    this.connectivity = connectivity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellPerfInsightsConfigTaskPayload tessellPerfInsightsConfigTaskPayload = (TessellPerfInsightsConfigTaskPayload) o;
    return Objects.equals(this.perfInsightsEnabled, tessellPerfInsightsConfigTaskPayload.perfInsightsEnabled) &&
        Objects.equals(this.monitoringDeploymentId, tessellPerfInsightsConfigTaskPayload.monitoringDeploymentId) &&
        Objects.equals(this.connectivity, tessellPerfInsightsConfigTaskPayload.connectivity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(perfInsightsEnabled, monitoringDeploymentId, connectivity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellPerfInsightsConfigTaskPayload {\n");
    sb.append("    perfInsightsEnabled: ").append(toIndentedString(perfInsightsEnabled)).append("\n");
    sb.append("    monitoringDeploymentId: ").append(toIndentedString(monitoringDeploymentId)).append("\n");
    sb.append("    connectivity: ").append(toIndentedString(connectivity)).append("\n");
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

