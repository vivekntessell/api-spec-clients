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
 * ElkConfig
 */
@JsonPropertyOrder({
  ElkConfig.JSON_PROPERTY_ELASTIC_SERVICE_NAME,
  ElkConfig.JSON_PROPERTY_ELASTIC_PRIVATE_DOMAIN_NAME,
  ElkConfig.JSON_PROPERTY_KIBANA_URL,
  ElkConfig.JSON_PROPERTY_ELASTIC_URL,
  ElkConfig.JSON_PROPERTY_ELASTIC_USERNAME,
  ElkConfig.JSON_PROPERTY_ELASTIC_PASSWORD,
  ElkConfig.JSON_PROPERTY_ELASTIC_DEPLOYMENT_ID,
  ElkConfig.JSON_PROPERTY_ELASTIC_REGION,
  ElkConfig.JSON_PROPERTY_ELASTIC_KEY
})
@JsonTypeName("ElkConfig")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ElkConfig {
  public static final String JSON_PROPERTY_ELASTIC_SERVICE_NAME = "elasticServiceName";
  private String elasticServiceName;

  public static final String JSON_PROPERTY_ELASTIC_PRIVATE_DOMAIN_NAME = "elasticPrivateDomainName";
  private String elasticPrivateDomainName;

  public static final String JSON_PROPERTY_KIBANA_URL = "kibanaUrl";
  private String kibanaUrl;

  public static final String JSON_PROPERTY_ELASTIC_URL = "elasticUrl";
  private String elasticUrl;

  public static final String JSON_PROPERTY_ELASTIC_USERNAME = "elasticUsername";
  private String elasticUsername;

  public static final String JSON_PROPERTY_ELASTIC_PASSWORD = "elasticPassword";
  private String elasticPassword;

  public static final String JSON_PROPERTY_ELASTIC_DEPLOYMENT_ID = "elasticDeploymentId";
  private String elasticDeploymentId;

  public static final String JSON_PROPERTY_ELASTIC_REGION = "elasticRegion";
  private String elasticRegion;

  public static final String JSON_PROPERTY_ELASTIC_KEY = "elasticKey";
  private String elasticKey;


  public ElkConfig elasticServiceName(String elasticServiceName) {
    
    this.elasticServiceName = elasticServiceName;
    return this;
  }

   /**
   * Service name to create VPC endpoint
   * @return elasticServiceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Service name to create VPC endpoint")
  @JsonProperty(JSON_PROPERTY_ELASTIC_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getElasticServiceName() {
    return elasticServiceName;
  }


  @JsonProperty(JSON_PROPERTY_ELASTIC_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElasticServiceName(String elasticServiceName) {
    this.elasticServiceName = elasticServiceName;
  }


  public ElkConfig elasticPrivateDomainName(String elasticPrivateDomainName) {
    
    this.elasticPrivateDomainName = elasticPrivateDomainName;
    return this;
  }

   /**
   * Private Hosted Zone
   * @return elasticPrivateDomainName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Private Hosted Zone")
  @JsonProperty(JSON_PROPERTY_ELASTIC_PRIVATE_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getElasticPrivateDomainName() {
    return elasticPrivateDomainName;
  }


  @JsonProperty(JSON_PROPERTY_ELASTIC_PRIVATE_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElasticPrivateDomainName(String elasticPrivateDomainName) {
    this.elasticPrivateDomainName = elasticPrivateDomainName;
  }


  public ElkConfig kibanaUrl(String kibanaUrl) {
    
    this.kibanaUrl = kibanaUrl;
    return this;
  }

   /**
   * Get kibanaUrl
   * @return kibanaUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KIBANA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKibanaUrl() {
    return kibanaUrl;
  }


  @JsonProperty(JSON_PROPERTY_KIBANA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKibanaUrl(String kibanaUrl) {
    this.kibanaUrl = kibanaUrl;
  }


  public ElkConfig elasticUrl(String elasticUrl) {
    
    this.elasticUrl = elasticUrl;
    return this;
  }

   /**
   * Get elasticUrl
   * @return elasticUrl
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ELASTIC_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getElasticUrl() {
    return elasticUrl;
  }


  @JsonProperty(JSON_PROPERTY_ELASTIC_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setElasticUrl(String elasticUrl) {
    this.elasticUrl = elasticUrl;
  }


  public ElkConfig elasticUsername(String elasticUsername) {
    
    this.elasticUsername = elasticUsername;
    return this;
  }

   /**
   * Get elasticUsername
   * @return elasticUsername
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ELASTIC_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getElasticUsername() {
    return elasticUsername;
  }


  @JsonProperty(JSON_PROPERTY_ELASTIC_USERNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setElasticUsername(String elasticUsername) {
    this.elasticUsername = elasticUsername;
  }


  public ElkConfig elasticPassword(String elasticPassword) {
    
    this.elasticPassword = elasticPassword;
    return this;
  }

   /**
   * Get elasticPassword
   * @return elasticPassword
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ELASTIC_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getElasticPassword() {
    return elasticPassword;
  }


  @JsonProperty(JSON_PROPERTY_ELASTIC_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setElasticPassword(String elasticPassword) {
    this.elasticPassword = elasticPassword;
  }


  public ElkConfig elasticDeploymentId(String elasticDeploymentId) {
    
    this.elasticDeploymentId = elasticDeploymentId;
    return this;
  }

   /**
   * Elastic Deployment Id
   * @return elasticDeploymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Elastic Deployment Id")
  @JsonProperty(JSON_PROPERTY_ELASTIC_DEPLOYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getElasticDeploymentId() {
    return elasticDeploymentId;
  }


  @JsonProperty(JSON_PROPERTY_ELASTIC_DEPLOYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElasticDeploymentId(String elasticDeploymentId) {
    this.elasticDeploymentId = elasticDeploymentId;
  }


  public ElkConfig elasticRegion(String elasticRegion) {
    
    this.elasticRegion = elasticRegion;
    return this;
  }

   /**
   * Elastic Deployment Region
   * @return elasticRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Elastic Deployment Region")
  @JsonProperty(JSON_PROPERTY_ELASTIC_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getElasticRegion() {
    return elasticRegion;
  }


  @JsonProperty(JSON_PROPERTY_ELASTIC_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElasticRegion(String elasticRegion) {
    this.elasticRegion = elasticRegion;
  }


  public ElkConfig elasticKey(String elasticKey) {
    
    this.elasticKey = elasticKey;
    return this;
  }

   /**
   * Elastic Cloud API Key
   * @return elasticKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Elastic Cloud API Key")
  @JsonProperty(JSON_PROPERTY_ELASTIC_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getElasticKey() {
    return elasticKey;
  }


  @JsonProperty(JSON_PROPERTY_ELASTIC_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElasticKey(String elasticKey) {
    this.elasticKey = elasticKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElkConfig elkConfig = (ElkConfig) o;
    return Objects.equals(this.elasticServiceName, elkConfig.elasticServiceName) &&
        Objects.equals(this.elasticPrivateDomainName, elkConfig.elasticPrivateDomainName) &&
        Objects.equals(this.kibanaUrl, elkConfig.kibanaUrl) &&
        Objects.equals(this.elasticUrl, elkConfig.elasticUrl) &&
        Objects.equals(this.elasticUsername, elkConfig.elasticUsername) &&
        Objects.equals(this.elasticPassword, elkConfig.elasticPassword) &&
        Objects.equals(this.elasticDeploymentId, elkConfig.elasticDeploymentId) &&
        Objects.equals(this.elasticRegion, elkConfig.elasticRegion) &&
        Objects.equals(this.elasticKey, elkConfig.elasticKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elasticServiceName, elasticPrivateDomainName, kibanaUrl, elasticUrl, elasticUsername, elasticPassword, elasticDeploymentId, elasticRegion, elasticKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElkConfig {\n");
    sb.append("    elasticServiceName: ").append(toIndentedString(elasticServiceName)).append("\n");
    sb.append("    elasticPrivateDomainName: ").append(toIndentedString(elasticPrivateDomainName)).append("\n");
    sb.append("    kibanaUrl: ").append(toIndentedString(kibanaUrl)).append("\n");
    sb.append("    elasticUrl: ").append(toIndentedString(elasticUrl)).append("\n");
    sb.append("    elasticUsername: ").append(toIndentedString(elasticUsername)).append("\n");
    sb.append("    elasticPassword: ").append(toIndentedString(elasticPassword)).append("\n");
    sb.append("    elasticDeploymentId: ").append(toIndentedString(elasticDeploymentId)).append("\n");
    sb.append("    elasticRegion: ").append(toIndentedString(elasticRegion)).append("\n");
    sb.append("    elasticKey: ").append(toIndentedString(elasticKey)).append("\n");
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

