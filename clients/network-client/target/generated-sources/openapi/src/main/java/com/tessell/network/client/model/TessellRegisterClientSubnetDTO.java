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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellRegisterClientSubnetDTO
 */
@JsonPropertyOrder({
  TessellRegisterClientSubnetDTO.JSON_PROPERTY_CLOUD_ID,
  TessellRegisterClientSubnetDTO.JSON_PROPERTY_SUBNET_GROUPS
})
@JsonTypeName("RegisterClientSubnet")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:07.428121+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellRegisterClientSubnetDTO {
  public static final String JSON_PROPERTY_CLOUD_ID = "cloudId";
  private String cloudId;

  public static final String JSON_PROPERTY_SUBNET_GROUPS = "subnetGroups";
  private List<String> subnetGroups = null;


  public TessellRegisterClientSubnetDTO cloudId(String cloudId) {
    
    this.cloudId = cloudId;
    return this;
  }

   /**
   * Cloud id of the subnet
   * @return cloudId
  **/
  @ApiModelProperty(example = "subnet-1a2b3c4d", required = true, value = "Cloud id of the subnet")
  @JsonProperty(JSON_PROPERTY_CLOUD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCloudId() {
    return cloudId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCloudId(String cloudId) {
    this.cloudId = cloudId;
  }


  public TessellRegisterClientSubnetDTO subnetGroups(List<String> subnetGroups) {
    
    this.subnetGroups = subnetGroups;
    return this;
  }

  public TessellRegisterClientSubnetDTO addSubnetGroupsItem(String subnetGroupsItem) {
    if (this.subnetGroups == null) {
      this.subnetGroups = new ArrayList<>();
    }
    this.subnetGroups.add(subnetGroupsItem);
    return this;
  }

   /**
   * Get subnetGroups
   * @return subnetGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBNET_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSubnetGroups() {
    return subnetGroups;
  }


  @JsonProperty(JSON_PROPERTY_SUBNET_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubnetGroups(List<String> subnetGroups) {
    this.subnetGroups = subnetGroups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellRegisterClientSubnetDTO registerClientSubnet = (TessellRegisterClientSubnetDTO) o;
    return Objects.equals(this.cloudId, registerClientSubnet.cloudId) &&
        Objects.equals(this.subnetGroups, registerClientSubnet.subnetGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudId, subnetGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellRegisterClientSubnetDTO {\n");
    sb.append("    cloudId: ").append(toIndentedString(cloudId)).append("\n");
    sb.append("    subnetGroups: ").append(toIndentedString(subnetGroups)).append("\n");
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

