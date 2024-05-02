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
import com.tessell.tenant.client.model.CreditConfig;
import com.tessell.tenant.client.model.DeploymentConfig;
import com.tessell.tenant.client.model.DockerConfig;
import com.tessell.tenant.client.model.ElkConfigCloud;
import com.tessell.tenant.client.model.HarnessConfig;
import com.tessell.tenant.client.model.InfraGenericPayload;
import com.tessell.tenant.client.model.LibraryVersionConfig;
import com.tessell.tenant.client.model.RepositoryComputeConfigPayload;
import com.tessell.tenant.client.model.SubscriptionStaticConfig;
import com.tessell.tenant.client.model.TailscaleConfig;
import com.tessell.tenant.client.model.TenantStaticConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * SeedData
 */
@JsonPropertyOrder({
  SeedData.JSON_PROPERTY_REPOSITORY_COMPUTE_CONFIG,
  SeedData.JSON_PROPERTY_GENERIC_CONFIG,
  SeedData.JSON_PROPERTY_SUBSCRIPTION_CONFIG,
  SeedData.JSON_PROPERTY_TENANT_CONFIG,
  SeedData.JSON_PROPERTY_HARNESS_CONFIG,
  SeedData.JSON_PROPERTY_DOCKER_CONFIG,
  SeedData.JSON_PROPERTY_TAILSCALE_CONFIG,
  SeedData.JSON_PROPERTY_DEPLOYMENT_CONFIG,
  SeedData.JSON_PROPERTY_TERRAFORM_CONFIG,
  SeedData.JSON_PROPERTY_ELASTIC_CONFIG,
  SeedData.JSON_PROPERTY_INITIAL_DEFAULT_CREDIT_CONFIG,
  SeedData.JSON_PROPERTY_LIBRARY_VERSION_CONFIG
})
@JsonTypeName("SeedData")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SeedData {
  public static final String JSON_PROPERTY_REPOSITORY_COMPUTE_CONFIG = "repositoryComputeConfig";
  private RepositoryComputeConfigPayload repositoryComputeConfig;

  public static final String JSON_PROPERTY_GENERIC_CONFIG = "genericConfig";
  private InfraGenericPayload genericConfig;

  public static final String JSON_PROPERTY_SUBSCRIPTION_CONFIG = "subscriptionConfig";
  private SubscriptionStaticConfig subscriptionConfig;

  public static final String JSON_PROPERTY_TENANT_CONFIG = "tenantConfig";
  private TenantStaticConfig tenantConfig;

  public static final String JSON_PROPERTY_HARNESS_CONFIG = "harnessConfig";
  private HarnessConfig harnessConfig;

  public static final String JSON_PROPERTY_DOCKER_CONFIG = "dockerConfig";
  private DockerConfig dockerConfig;

  public static final String JSON_PROPERTY_TAILSCALE_CONFIG = "tailscaleConfig";
  private TailscaleConfig tailscaleConfig;

  public static final String JSON_PROPERTY_DEPLOYMENT_CONFIG = "deploymentConfig";
  private DeploymentConfig deploymentConfig;

  public static final String JSON_PROPERTY_TERRAFORM_CONFIG = "terraformConfig";
  private Map<String, String> terraformConfig = new HashMap<>();

  public static final String JSON_PROPERTY_ELASTIC_CONFIG = "elasticConfig";
  private ElkConfigCloud elasticConfig;

  public static final String JSON_PROPERTY_INITIAL_DEFAULT_CREDIT_CONFIG = "initialDefaultCreditConfig";
  private CreditConfig initialDefaultCreditConfig;

  public static final String JSON_PROPERTY_LIBRARY_VERSION_CONFIG = "libraryVersionConfig";
  private LibraryVersionConfig libraryVersionConfig;


  public SeedData repositoryComputeConfig(RepositoryComputeConfigPayload repositoryComputeConfig) {
    
    this.repositoryComputeConfig = repositoryComputeConfig;
    return this;
  }

   /**
   * Get repositoryComputeConfig
   * @return repositoryComputeConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPOSITORY_COMPUTE_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RepositoryComputeConfigPayload getRepositoryComputeConfig() {
    return repositoryComputeConfig;
  }


  @JsonProperty(JSON_PROPERTY_REPOSITORY_COMPUTE_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepositoryComputeConfig(RepositoryComputeConfigPayload repositoryComputeConfig) {
    this.repositoryComputeConfig = repositoryComputeConfig;
  }


  public SeedData genericConfig(InfraGenericPayload genericConfig) {
    
    this.genericConfig = genericConfig;
    return this;
  }

   /**
   * Get genericConfig
   * @return genericConfig
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_GENERIC_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InfraGenericPayload getGenericConfig() {
    return genericConfig;
  }


  @JsonProperty(JSON_PROPERTY_GENERIC_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGenericConfig(InfraGenericPayload genericConfig) {
    this.genericConfig = genericConfig;
  }


  public SeedData subscriptionConfig(SubscriptionStaticConfig subscriptionConfig) {
    
    this.subscriptionConfig = subscriptionConfig;
    return this;
  }

   /**
   * Get subscriptionConfig
   * @return subscriptionConfig
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SubscriptionStaticConfig getSubscriptionConfig() {
    return subscriptionConfig;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscriptionConfig(SubscriptionStaticConfig subscriptionConfig) {
    this.subscriptionConfig = subscriptionConfig;
  }


  public SeedData tenantConfig(TenantStaticConfig tenantConfig) {
    
    this.tenantConfig = tenantConfig;
    return this;
  }

   /**
   * Get tenantConfig
   * @return tenantConfig
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TENANT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TenantStaticConfig getTenantConfig() {
    return tenantConfig;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTenantConfig(TenantStaticConfig tenantConfig) {
    this.tenantConfig = tenantConfig;
  }


  public SeedData harnessConfig(HarnessConfig harnessConfig) {
    
    this.harnessConfig = harnessConfig;
    return this;
  }

   /**
   * Get harnessConfig
   * @return harnessConfig
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HARNESS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public HarnessConfig getHarnessConfig() {
    return harnessConfig;
  }


  @JsonProperty(JSON_PROPERTY_HARNESS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHarnessConfig(HarnessConfig harnessConfig) {
    this.harnessConfig = harnessConfig;
  }


  public SeedData dockerConfig(DockerConfig dockerConfig) {
    
    this.dockerConfig = dockerConfig;
    return this;
  }

   /**
   * Get dockerConfig
   * @return dockerConfig
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DOCKER_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DockerConfig getDockerConfig() {
    return dockerConfig;
  }


  @JsonProperty(JSON_PROPERTY_DOCKER_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDockerConfig(DockerConfig dockerConfig) {
    this.dockerConfig = dockerConfig;
  }


  public SeedData tailscaleConfig(TailscaleConfig tailscaleConfig) {
    
    this.tailscaleConfig = tailscaleConfig;
    return this;
  }

   /**
   * Get tailscaleConfig
   * @return tailscaleConfig
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TAILSCALE_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TailscaleConfig getTailscaleConfig() {
    return tailscaleConfig;
  }


  @JsonProperty(JSON_PROPERTY_TAILSCALE_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTailscaleConfig(TailscaleConfig tailscaleConfig) {
    this.tailscaleConfig = tailscaleConfig;
  }


  public SeedData deploymentConfig(DeploymentConfig deploymentConfig) {
    
    this.deploymentConfig = deploymentConfig;
    return this;
  }

   /**
   * Get deploymentConfig
   * @return deploymentConfig
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DeploymentConfig getDeploymentConfig() {
    return deploymentConfig;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeploymentConfig(DeploymentConfig deploymentConfig) {
    this.deploymentConfig = deploymentConfig;
  }


  public SeedData terraformConfig(Map<String, String> terraformConfig) {
    
    this.terraformConfig = terraformConfig;
    return this;
  }

  public SeedData putTerraformConfigItem(String key, String terraformConfigItem) {
    this.terraformConfig.put(key, terraformConfigItem);
    return this;
  }

   /**
   * Get terraformConfig
   * @return terraformConfig
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TERRAFORM_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, String> getTerraformConfig() {
    return terraformConfig;
  }


  @JsonProperty(JSON_PROPERTY_TERRAFORM_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTerraformConfig(Map<String, String> terraformConfig) {
    this.terraformConfig = terraformConfig;
  }


  public SeedData elasticConfig(ElkConfigCloud elasticConfig) {
    
    this.elasticConfig = elasticConfig;
    return this;
  }

   /**
   * Get elasticConfig
   * @return elasticConfig
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ELASTIC_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ElkConfigCloud getElasticConfig() {
    return elasticConfig;
  }


  @JsonProperty(JSON_PROPERTY_ELASTIC_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setElasticConfig(ElkConfigCloud elasticConfig) {
    this.elasticConfig = elasticConfig;
  }


  public SeedData initialDefaultCreditConfig(CreditConfig initialDefaultCreditConfig) {
    
    this.initialDefaultCreditConfig = initialDefaultCreditConfig;
    return this;
  }

   /**
   * Get initialDefaultCreditConfig
   * @return initialDefaultCreditConfig
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INITIAL_DEFAULT_CREDIT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreditConfig getInitialDefaultCreditConfig() {
    return initialDefaultCreditConfig;
  }


  @JsonProperty(JSON_PROPERTY_INITIAL_DEFAULT_CREDIT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInitialDefaultCreditConfig(CreditConfig initialDefaultCreditConfig) {
    this.initialDefaultCreditConfig = initialDefaultCreditConfig;
  }


  public SeedData libraryVersionConfig(LibraryVersionConfig libraryVersionConfig) {
    
    this.libraryVersionConfig = libraryVersionConfig;
    return this;
  }

   /**
   * Get libraryVersionConfig
   * @return libraryVersionConfig
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LIBRARY_VERSION_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LibraryVersionConfig getLibraryVersionConfig() {
    return libraryVersionConfig;
  }


  @JsonProperty(JSON_PROPERTY_LIBRARY_VERSION_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLibraryVersionConfig(LibraryVersionConfig libraryVersionConfig) {
    this.libraryVersionConfig = libraryVersionConfig;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeedData seedData = (SeedData) o;
    return Objects.equals(this.repositoryComputeConfig, seedData.repositoryComputeConfig) &&
        Objects.equals(this.genericConfig, seedData.genericConfig) &&
        Objects.equals(this.subscriptionConfig, seedData.subscriptionConfig) &&
        Objects.equals(this.tenantConfig, seedData.tenantConfig) &&
        Objects.equals(this.harnessConfig, seedData.harnessConfig) &&
        Objects.equals(this.dockerConfig, seedData.dockerConfig) &&
        Objects.equals(this.tailscaleConfig, seedData.tailscaleConfig) &&
        Objects.equals(this.deploymentConfig, seedData.deploymentConfig) &&
        Objects.equals(this.terraformConfig, seedData.terraformConfig) &&
        Objects.equals(this.elasticConfig, seedData.elasticConfig) &&
        Objects.equals(this.initialDefaultCreditConfig, seedData.initialDefaultCreditConfig) &&
        Objects.equals(this.libraryVersionConfig, seedData.libraryVersionConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repositoryComputeConfig, genericConfig, subscriptionConfig, tenantConfig, harnessConfig, dockerConfig, tailscaleConfig, deploymentConfig, terraformConfig, elasticConfig, initialDefaultCreditConfig, libraryVersionConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeedData {\n");
    sb.append("    repositoryComputeConfig: ").append(toIndentedString(repositoryComputeConfig)).append("\n");
    sb.append("    genericConfig: ").append(toIndentedString(genericConfig)).append("\n");
    sb.append("    subscriptionConfig: ").append(toIndentedString(subscriptionConfig)).append("\n");
    sb.append("    tenantConfig: ").append(toIndentedString(tenantConfig)).append("\n");
    sb.append("    harnessConfig: ").append(toIndentedString(harnessConfig)).append("\n");
    sb.append("    dockerConfig: ").append(toIndentedString(dockerConfig)).append("\n");
    sb.append("    tailscaleConfig: ").append(toIndentedString(tailscaleConfig)).append("\n");
    sb.append("    deploymentConfig: ").append(toIndentedString(deploymentConfig)).append("\n");
    sb.append("    terraformConfig: ").append(toIndentedString(terraformConfig)).append("\n");
    sb.append("    elasticConfig: ").append(toIndentedString(elasticConfig)).append("\n");
    sb.append("    initialDefaultCreditConfig: ").append(toIndentedString(initialDefaultCreditConfig)).append("\n");
    sb.append("    libraryVersionConfig: ").append(toIndentedString(libraryVersionConfig)).append("\n");
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
