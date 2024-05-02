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


package com.tessell.parameter_profile.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.parameter_profile.client.model.DatabaseProfileParameterType;
import com.tessell.parameter_profile.client.model.ProfileCompareValueChange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * ParameterProfileCompareResponse
 */
@JsonPropertyOrder({
  ParameterProfileCompareResponse.JSON_PROPERTY_LEFT_ADDITIONS,
  ParameterProfileCompareResponse.JSON_PROPERTY_RIGHT_ADDITIONS,
  ParameterProfileCompareResponse.JSON_PROPERTY_DIFFS,
  ParameterProfileCompareResponse.JSON_PROPERTY_COMMON
})
@JsonTypeName("ParameterProfileCompareResponse")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.959198+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParameterProfileCompareResponse {
  public static final String JSON_PROPERTY_LEFT_ADDITIONS = "leftAdditions";
  private List<DatabaseProfileParameterType> leftAdditions = null;

  public static final String JSON_PROPERTY_RIGHT_ADDITIONS = "rightAdditions";
  private List<DatabaseProfileParameterType> rightAdditions = null;

  public static final String JSON_PROPERTY_DIFFS = "diffs";
  private List<ProfileCompareValueChange> diffs = null;

  public static final String JSON_PROPERTY_COMMON = "common";
  private List<DatabaseProfileParameterType> common = null;


  public ParameterProfileCompareResponse leftAdditions(List<DatabaseProfileParameterType> leftAdditions) {
    
    this.leftAdditions = leftAdditions;
    return this;
  }

  public ParameterProfileCompareResponse addLeftAdditionsItem(DatabaseProfileParameterType leftAdditionsItem) {
    if (this.leftAdditions == null) {
      this.leftAdditions = new ArrayList<>();
    }
    this.leftAdditions.add(leftAdditionsItem);
    return this;
  }

   /**
   * Get leftAdditions
   * @return leftAdditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEFT_ADDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DatabaseProfileParameterType> getLeftAdditions() {
    return leftAdditions;
  }


  @JsonProperty(JSON_PROPERTY_LEFT_ADDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeftAdditions(List<DatabaseProfileParameterType> leftAdditions) {
    this.leftAdditions = leftAdditions;
  }


  public ParameterProfileCompareResponse rightAdditions(List<DatabaseProfileParameterType> rightAdditions) {
    
    this.rightAdditions = rightAdditions;
    return this;
  }

  public ParameterProfileCompareResponse addRightAdditionsItem(DatabaseProfileParameterType rightAdditionsItem) {
    if (this.rightAdditions == null) {
      this.rightAdditions = new ArrayList<>();
    }
    this.rightAdditions.add(rightAdditionsItem);
    return this;
  }

   /**
   * Get rightAdditions
   * @return rightAdditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RIGHT_ADDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DatabaseProfileParameterType> getRightAdditions() {
    return rightAdditions;
  }


  @JsonProperty(JSON_PROPERTY_RIGHT_ADDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRightAdditions(List<DatabaseProfileParameterType> rightAdditions) {
    this.rightAdditions = rightAdditions;
  }


  public ParameterProfileCompareResponse diffs(List<ProfileCompareValueChange> diffs) {
    
    this.diffs = diffs;
    return this;
  }

  public ParameterProfileCompareResponse addDiffsItem(ProfileCompareValueChange diffsItem) {
    if (this.diffs == null) {
      this.diffs = new ArrayList<>();
    }
    this.diffs.add(diffsItem);
    return this;
  }

   /**
   * Get diffs
   * @return diffs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DIFFS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProfileCompareValueChange> getDiffs() {
    return diffs;
  }


  @JsonProperty(JSON_PROPERTY_DIFFS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiffs(List<ProfileCompareValueChange> diffs) {
    this.diffs = diffs;
  }


  public ParameterProfileCompareResponse common(List<DatabaseProfileParameterType> common) {
    
    this.common = common;
    return this;
  }

  public ParameterProfileCompareResponse addCommonItem(DatabaseProfileParameterType commonItem) {
    if (this.common == null) {
      this.common = new ArrayList<>();
    }
    this.common.add(commonItem);
    return this;
  }

   /**
   * Get common
   * @return common
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMMON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DatabaseProfileParameterType> getCommon() {
    return common;
  }


  @JsonProperty(JSON_PROPERTY_COMMON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommon(List<DatabaseProfileParameterType> common) {
    this.common = common;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterProfileCompareResponse parameterProfileCompareResponse = (ParameterProfileCompareResponse) o;
    return Objects.equals(this.leftAdditions, parameterProfileCompareResponse.leftAdditions) &&
        Objects.equals(this.rightAdditions, parameterProfileCompareResponse.rightAdditions) &&
        Objects.equals(this.diffs, parameterProfileCompareResponse.diffs) &&
        Objects.equals(this.common, parameterProfileCompareResponse.common);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leftAdditions, rightAdditions, diffs, common);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterProfileCompareResponse {\n");
    sb.append("    leftAdditions: ").append(toIndentedString(leftAdditions)).append("\n");
    sb.append("    rightAdditions: ").append(toIndentedString(rightAdditions)).append("\n");
    sb.append("    diffs: ").append(toIndentedString(diffs)).append("\n");
    sb.append("    common: ").append(toIndentedString(common)).append("\n");
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
