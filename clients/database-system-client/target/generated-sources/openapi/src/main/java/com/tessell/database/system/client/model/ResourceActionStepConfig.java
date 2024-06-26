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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * ResourceActionStepConfig
 */
@JsonPropertyOrder({
  ResourceActionStepConfig.JSON_PROPERTY_STEP_NAME,
  ResourceActionStepConfig.JSON_PROPERTY_DISPLAY_NAME,
  ResourceActionStepConfig.JSON_PROPERTY_USER_VISIBLE,
  ResourceActionStepConfig.JSON_PROPERTY_DETAILS,
  ResourceActionStepConfig.JSON_PROPERTY_INTERNAL_WEIGHT,
  ResourceActionStepConfig.JSON_PROPERTY_USER_VISIBLE_WEIGHT
})
@JsonTypeName("ResourceActionStepConfig")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceActionStepConfig {
  public static final String JSON_PROPERTY_STEP_NAME = "stepName";
  private String stepName;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_USER_VISIBLE = "userVisible";
  private Boolean userVisible;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private String details;

  public static final String JSON_PROPERTY_INTERNAL_WEIGHT = "internalWeight";
  private Integer internalWeight;

  public static final String JSON_PROPERTY_USER_VISIBLE_WEIGHT = "userVisibleWeight";
  private Integer userVisibleWeight;


  public ResourceActionStepConfig stepName(String stepName) {
    
    this.stepName = stepName;
    return this;
  }

   /**
   * Get stepName
   * @return stepName
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STEP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStepName() {
    return stepName;
  }


  @JsonProperty(JSON_PROPERTY_STEP_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStepName(String stepName) {
    this.stepName = stepName;
  }


  public ResourceActionStepConfig displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ResourceActionStepConfig userVisible(Boolean userVisible) {
    
    this.userVisible = userVisible;
    return this;
  }

   /**
   * Get userVisible
   * @return userVisible
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_USER_VISIBLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getUserVisible() {
    return userVisible;
  }


  @JsonProperty(JSON_PROPERTY_USER_VISIBLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserVisible(Boolean userVisible) {
    this.userVisible = userVisible;
  }


  public ResourceActionStepConfig details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(String details) {
    this.details = details;
  }


  public ResourceActionStepConfig internalWeight(Integer internalWeight) {
    
    this.internalWeight = internalWeight;
    return this;
  }

   /**
   * Get internalWeight
   * minimum: 0
   * maximum: 100
   * @return internalWeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTERNAL_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInternalWeight() {
    return internalWeight;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternalWeight(Integer internalWeight) {
    this.internalWeight = internalWeight;
  }


  public ResourceActionStepConfig userVisibleWeight(Integer userVisibleWeight) {
    
    this.userVisibleWeight = userVisibleWeight;
    return this;
  }

   /**
   * Get userVisibleWeight
   * minimum: 0
   * maximum: 100
   * @return userVisibleWeight
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_USER_VISIBLE_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getUserVisibleWeight() {
    return userVisibleWeight;
  }


  @JsonProperty(JSON_PROPERTY_USER_VISIBLE_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserVisibleWeight(Integer userVisibleWeight) {
    this.userVisibleWeight = userVisibleWeight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceActionStepConfig resourceActionStepConfig = (ResourceActionStepConfig) o;
    return Objects.equals(this.stepName, resourceActionStepConfig.stepName) &&
        Objects.equals(this.displayName, resourceActionStepConfig.displayName) &&
        Objects.equals(this.userVisible, resourceActionStepConfig.userVisible) &&
        Objects.equals(this.details, resourceActionStepConfig.details) &&
        Objects.equals(this.internalWeight, resourceActionStepConfig.internalWeight) &&
        Objects.equals(this.userVisibleWeight, resourceActionStepConfig.userVisibleWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stepName, displayName, userVisible, details, internalWeight, userVisibleWeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceActionStepConfig {\n");
    sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    userVisible: ").append(toIndentedString(userVisible)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    internalWeight: ").append(toIndentedString(internalWeight)).append("\n");
    sb.append("    userVisibleWeight: ").append(toIndentedString(userVisibleWeight)).append("\n");
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

