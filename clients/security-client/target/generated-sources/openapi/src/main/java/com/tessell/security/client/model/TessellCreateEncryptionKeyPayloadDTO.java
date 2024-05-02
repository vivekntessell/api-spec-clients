/*
 * Tessell REST API Documentation
 * Tessell REST API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.security.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.security.client.model.TessellCloudConfigDTO;
import com.tessell.security.client.model.TessellCloudTypeDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Payload for Creating encryption Key
 */
@ApiModel(description = "Payload for Creating encryption Key")
@JsonPropertyOrder({
  TessellCreateEncryptionKeyPayloadDTO.JSON_PROPERTY_CLOUD,
  TessellCreateEncryptionKeyPayloadDTO.JSON_PROPERTY_NAME,
  TessellCreateEncryptionKeyPayloadDTO.JSON_PROPERTY_DESCRIPTION,
  TessellCreateEncryptionKeyPayloadDTO.JSON_PROPERTY_CLOUD_CONFIG
})
@JsonTypeName("CreateEncryptionKeyPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellCreateEncryptionKeyPayloadDTO {
  public static final String JSON_PROPERTY_CLOUD = "cloud";
  private TessellCloudTypeDTO cloud;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CLOUD_CONFIG = "cloudConfig";
  private TessellCloudConfigDTO cloudConfig;


  public TessellCreateEncryptionKeyPayloadDTO cloud(TessellCloudTypeDTO cloud) {
    
    this.cloud = cloud;
    return this;
  }

   /**
   * Get cloud
   * @return cloud
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellCloudTypeDTO getCloud() {
    return cloud;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloud(TessellCloudTypeDTO cloud) {
    this.cloud = cloud;
  }


  public TessellCreateEncryptionKeyPayloadDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name of encryption key alias
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "name of encryption key alias")
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


  public TessellCreateEncryptionKeyPayloadDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the encryption key
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the encryption key")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public TessellCreateEncryptionKeyPayloadDTO cloudConfig(TessellCloudConfigDTO cloudConfig) {
    
    this.cloudConfig = cloudConfig;
    return this;
  }

   /**
   * Get cloudConfig
   * @return cloudConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellCloudConfigDTO getCloudConfig() {
    return cloudConfig;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudConfig(TessellCloudConfigDTO cloudConfig) {
    this.cloudConfig = cloudConfig;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellCreateEncryptionKeyPayloadDTO createEncryptionKeyPayload = (TessellCreateEncryptionKeyPayloadDTO) o;
    return Objects.equals(this.cloud, createEncryptionKeyPayload.cloud) &&
        Objects.equals(this.name, createEncryptionKeyPayload.name) &&
        Objects.equals(this.description, createEncryptionKeyPayload.description) &&
        Objects.equals(this.cloudConfig, createEncryptionKeyPayload.cloudConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloud, name, description, cloudConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellCreateEncryptionKeyPayloadDTO {\n");
    sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cloudConfig: ").append(toIndentedString(cloudConfig)).append("\n");
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
