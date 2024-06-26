/*
 * Tessell Availability Machine REST Web Services' API Documentation
 * Tessell Availability Machine REST Web Services' Api Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sagar.sontakke@tessell.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.dmm.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.dmm.client.model.TessellServiceGenieInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DB Service&#39;s Genie Config Information
 */
@ApiModel(description = "DB Service's Genie Config Information")
@JsonPropertyOrder({
  TessellServiceGenieInfoOps.JSON_PROPERTY_USER_VIEW
})
@JsonTypeName("TessellServiceGenieInfoOps")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceGenieInfoOps {
  public static final String JSON_PROPERTY_USER_VIEW = "userView";
  private TessellServiceGenieInfo userView;


  public TessellServiceGenieInfoOps userView(TessellServiceGenieInfo userView) {
    
    this.userView = userView;
    return this;
  }

   /**
   * Get userView
   * @return userView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceGenieInfo getUserView() {
    return userView;
  }


  @JsonProperty(JSON_PROPERTY_USER_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserView(TessellServiceGenieInfo userView) {
    this.userView = userView;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellServiceGenieInfoOps tessellServiceGenieInfoOps = (TessellServiceGenieInfoOps) o;
    return Objects.equals(this.userView, tessellServiceGenieInfoOps.userView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userView);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceGenieInfoOps {\n");
    sb.append("    userView: ").append(toIndentedString(userView)).append("\n");
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

