/*
 * Software Library Governance Service API Documentation
 * Software Library Governance Service API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.softwarelib.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.softwarelib.client.model.TessellSoftwareImageStatusDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellRestrictSoftwareImagesInRegionsResponseImagesDTO
 */
@JsonPropertyOrder({
  TessellRestrictSoftwareImagesInRegionsResponseImagesDTO.JSON_PROPERTY_NAME,
  TessellRestrictSoftwareImagesInRegionsResponseImagesDTO.JSON_PROPERTY_CLOUD_AND_AVAILABILTY,
  TessellRestrictSoftwareImagesInRegionsResponseImagesDTO.JSON_PROPERTY_STATUS
})
@JsonTypeName("restrictSoftwareImagesInRegionsResponse_images")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:13.690299+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellRestrictSoftwareImagesInRegionsResponseImagesDTO {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CLOUD_AND_AVAILABILTY = "cloudAndAvailabilty";
  private String cloudAndAvailabilty;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellSoftwareImageStatusDTO status;


  public TessellRestrictSoftwareImagesInRegionsResponseImagesDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public TessellRestrictSoftwareImagesInRegionsResponseImagesDTO cloudAndAvailabilty(String cloudAndAvailabilty) {
    
    this.cloudAndAvailabilty = cloudAndAvailabilty;
    return this;
  }

   /**
   * Get cloudAndAvailabilty
   * @return cloudAndAvailabilty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_AND_AVAILABILTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudAndAvailabilty() {
    return cloudAndAvailabilty;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_AND_AVAILABILTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAndAvailabilty(String cloudAndAvailabilty) {
    this.cloudAndAvailabilty = cloudAndAvailabilty;
  }


  public TessellRestrictSoftwareImagesInRegionsResponseImagesDTO status(TessellSoftwareImageStatusDTO status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellSoftwareImageStatusDTO getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TessellSoftwareImageStatusDTO status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellRestrictSoftwareImagesInRegionsResponseImagesDTO restrictSoftwareImagesInRegionsResponseImages = (TessellRestrictSoftwareImagesInRegionsResponseImagesDTO) o;
    return Objects.equals(this.name, restrictSoftwareImagesInRegionsResponseImages.name) &&
        Objects.equals(this.cloudAndAvailabilty, restrictSoftwareImagesInRegionsResponseImages.cloudAndAvailabilty) &&
        Objects.equals(this.status, restrictSoftwareImagesInRegionsResponseImages.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, cloudAndAvailabilty, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellRestrictSoftwareImagesInRegionsResponseImagesDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cloudAndAvailabilty: ").append(toIndentedString(cloudAndAvailabilty)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
