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
import com.tessell.tenant.client.model.AwsByoaExecutionOutputResources;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Output from the execution done at customer&#39;s account either via cloud formation or via script
 */
@ApiModel(description = "Output from the execution done at customer's account either via cloud formation or via script")
@JsonPropertyOrder({
  AwsByoaExecutionOutput.JSON_PROPERTY_ALLOW_TESSELL_CREATION,
  AwsByoaExecutionOutput.JSON_PROPERTY_RESOURCES,
  AwsByoaExecutionOutput.JSON_PROPERTY_REGION,
  AwsByoaExecutionOutput.JSON_PROPERTY_TENANT_ACCOUNT_ID
})
@JsonTypeName("AwsByoaExecutionOutput")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AwsByoaExecutionOutput {
  public static final String JSON_PROPERTY_ALLOW_TESSELL_CREATION = "allowTessellCreation";
  private Boolean allowTessellCreation = false;

  public static final String JSON_PROPERTY_RESOURCES = "resources";
  private AwsByoaExecutionOutputResources resources;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_TENANT_ACCOUNT_ID = "tenantAccountId";
  private String tenantAccountId;


  public AwsByoaExecutionOutput allowTessellCreation(Boolean allowTessellCreation) {
    
    this.allowTessellCreation = allowTessellCreation;
    return this;
  }

   /**
   * Whether Tessell is given create permissions or not
   * @return allowTessellCreation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether Tessell is given create permissions or not")
  @JsonProperty(JSON_PROPERTY_ALLOW_TESSELL_CREATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowTessellCreation() {
    return allowTessellCreation;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_TESSELL_CREATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowTessellCreation(Boolean allowTessellCreation) {
    this.allowTessellCreation = allowTessellCreation;
  }


  public AwsByoaExecutionOutput resources(AwsByoaExecutionOutputResources resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AwsByoaExecutionOutputResources getResources() {
    return resources;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResources(AwsByoaExecutionOutputResources resources) {
    this.resources = resources;
  }


  public AwsByoaExecutionOutput region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Region in which the stack was deployed
   * @return region
  **/
  @ApiModelProperty(required = true, value = "Region in which the stack was deployed")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRegion(String region) {
    this.region = region;
  }


  public AwsByoaExecutionOutput tenantAccountId(String tenantAccountId) {
    
    this.tenantAccountId = tenantAccountId;
    return this;
  }

   /**
   * Aws Account id of the tenant
   * @return tenantAccountId
  **/
  @ApiModelProperty(required = true, value = "Aws Account id of the tenant")
  @JsonProperty(JSON_PROPERTY_TENANT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTenantAccountId() {
    return tenantAccountId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTenantAccountId(String tenantAccountId) {
    this.tenantAccountId = tenantAccountId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsByoaExecutionOutput awsByoaExecutionOutput = (AwsByoaExecutionOutput) o;
    return Objects.equals(this.allowTessellCreation, awsByoaExecutionOutput.allowTessellCreation) &&
        Objects.equals(this.resources, awsByoaExecutionOutput.resources) &&
        Objects.equals(this.region, awsByoaExecutionOutput.region) &&
        Objects.equals(this.tenantAccountId, awsByoaExecutionOutput.tenantAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowTessellCreation, resources, region, tenantAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsByoaExecutionOutput {\n");
    sb.append("    allowTessellCreation: ").append(toIndentedString(allowTessellCreation)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    tenantAccountId: ").append(toIndentedString(tenantAccountId)).append("\n");
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

