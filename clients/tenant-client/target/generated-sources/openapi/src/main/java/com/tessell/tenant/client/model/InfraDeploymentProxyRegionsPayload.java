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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Payload for updating proxy regions in Infra Deployment
 */
@ApiModel(description = "Payload for updating proxy regions in Infra Deployment")
@JsonPropertyOrder({
  InfraDeploymentProxyRegionsPayload.JSON_PROPERTY_PROXY_REGIONS
})
@JsonTypeName("InfraDeploymentProxyRegionsPayload")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InfraDeploymentProxyRegionsPayload {
  public static final String JSON_PROPERTY_PROXY_REGIONS = "proxyRegions";
  private List<String> proxyRegions = null;


  public InfraDeploymentProxyRegionsPayload proxyRegions(List<String> proxyRegions) {
    
    this.proxyRegions = proxyRegions;
    return this;
  }

  public InfraDeploymentProxyRegionsPayload addProxyRegionsItem(String proxyRegionsItem) {
    if (this.proxyRegions == null) {
      this.proxyRegions = new ArrayList<>();
    }
    this.proxyRegions.add(proxyRegionsItem);
    return this;
  }

   /**
   * List of proxy regions for Infra Deployment
   * @return proxyRegions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of proxy regions for Infra Deployment")
  @JsonProperty(JSON_PROPERTY_PROXY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getProxyRegions() {
    return proxyRegions;
  }


  @JsonProperty(JSON_PROPERTY_PROXY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProxyRegions(List<String> proxyRegions) {
    this.proxyRegions = proxyRegions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfraDeploymentProxyRegionsPayload infraDeploymentProxyRegionsPayload = (InfraDeploymentProxyRegionsPayload) o;
    return Objects.equals(this.proxyRegions, infraDeploymentProxyRegionsPayload.proxyRegions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proxyRegions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfraDeploymentProxyRegionsPayload {\n");
    sb.append("    proxyRegions: ").append(toIndentedString(proxyRegions)).append("\n");
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

