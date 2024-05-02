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


package com.tessell.network.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.network.client.model.TessellTessellTagDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellCreateVpcCloudResourcesConfigDTO
 */
@JsonPropertyOrder({
  TessellCreateVpcCloudResourcesConfigDTO.JSON_PROPERTY_PRIVATE_SUBNET,
  TessellCreateVpcCloudResourcesConfigDTO.JSON_PROPERTY_TAGS
})
@JsonTypeName("CreateVpcCloudResourcesConfig")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:07.428121+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellCreateVpcCloudResourcesConfigDTO {
  public static final String JSON_PROPERTY_PRIVATE_SUBNET = "private_subnet";
  private Boolean privateSubnet = false;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<TessellTessellTagDTO> tags = null;


  public TessellCreateVpcCloudResourcesConfigDTO privateSubnet(Boolean privateSubnet) {
    
    this.privateSubnet = privateSubnet;
    return this;
  }

   /**
   * Get privateSubnet
   * @return privateSubnet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIVATE_SUBNET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrivateSubnet() {
    return privateSubnet;
  }


  @JsonProperty(JSON_PROPERTY_PRIVATE_SUBNET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivateSubnet(Boolean privateSubnet) {
    this.privateSubnet = privateSubnet;
  }


  public TessellCreateVpcCloudResourcesConfigDTO tags(List<TessellTessellTagDTO> tags) {
    
    this.tags = tags;
    return this;
  }

  public TessellCreateVpcCloudResourcesConfigDTO addTagsItem(TessellTessellTagDTO tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Additional tags to be applied
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional tags to be applied")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellTessellTagDTO> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<TessellTessellTagDTO> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellCreateVpcCloudResourcesConfigDTO createVpcCloudResourcesConfig = (TessellCreateVpcCloudResourcesConfigDTO) o;
    return Objects.equals(this.privateSubnet, createVpcCloudResourcesConfig.privateSubnet) &&
        Objects.equals(this.tags, createVpcCloudResourcesConfig.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateSubnet, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellCreateVpcCloudResourcesConfigDTO {\n");
    sb.append("    privateSubnet: ").append(toIndentedString(privateSubnet)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

