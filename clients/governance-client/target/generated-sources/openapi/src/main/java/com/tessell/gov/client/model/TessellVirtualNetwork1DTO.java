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


package com.tessell.gov.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellVirtualNetwork1DTO
 */
@JsonPropertyOrder({
  TessellVirtualNetwork1DTO.JSON_PROPERTY_CLOUD_ACCOUNT_ID,
  TessellVirtualNetwork1DTO.JSON_PROPERTY_CLOUD_LOCATION_ID,
  TessellVirtualNetwork1DTO.JSON_PROPERTY_NAME
})
@JsonTypeName("VirtualNetwork_1")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.675868+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellVirtualNetwork1DTO {
  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_ID = "cloudAccountId";
  private UUID cloudAccountId;

  public static final String JSON_PROPERTY_CLOUD_LOCATION_ID = "cloudLocationId";
  private String cloudLocationId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public TessellVirtualNetwork1DTO cloudAccountId(UUID cloudAccountId) {
    
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * ID of the cloud account to which this compute belongs
   * @return cloudAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "ID of the cloud account to which this compute belongs")
  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCloudAccountId() {
    return cloudAccountId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAccountId(UUID cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }


  public TessellVirtualNetwork1DTO cloudLocationId(String cloudLocationId) {
    
    this.cloudLocationId = cloudLocationId;
    return this;
  }

   /**
   * ID of the cloud location where this compute belongs
   * @return cloudLocationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aws", value = "ID of the cloud location where this compute belongs")
  @JsonProperty(JSON_PROPERTY_CLOUD_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudLocationId() {
    return cloudLocationId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudLocationId(String cloudLocationId) {
    this.cloudLocationId = cloudLocationId;
  }


  public TessellVirtualNetwork1DTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the entity
   * @return name
  **/
  @ApiModelProperty(example = "sample-entity", required = true, value = "Name of the entity")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellVirtualNetwork1DTO virtualNetwork1 = (TessellVirtualNetwork1DTO) o;
    return Objects.equals(this.cloudAccountId, virtualNetwork1.cloudAccountId) &&
        Objects.equals(this.cloudLocationId, virtualNetwork1.cloudLocationId) &&
        Objects.equals(this.name, virtualNetwork1.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAccountId, cloudLocationId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellVirtualNetwork1DTO {\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    cloudLocationId: ").append(toIndentedString(cloudLocationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

