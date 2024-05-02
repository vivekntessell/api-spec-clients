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
import com.tessell.dmm.client.model.CreateDatabasePayload;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Database&#39;s provision information
 */
@ApiModel(description = "Database's provision information")
@JsonPropertyOrder({
  TessellDatabaseOpsDTOProvisioningInfo.JSON_PROPERTY_USER_VIEW
})
@JsonTypeName("TessellDatabaseOpsDTO_provisioningInfo")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellDatabaseOpsDTOProvisioningInfo {
  public static final String JSON_PROPERTY_USER_VIEW = "userView";
  private CreateDatabasePayload userView;


  public TessellDatabaseOpsDTOProvisioningInfo userView(CreateDatabasePayload userView) {
    
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

  public CreateDatabasePayload getUserView() {
    return userView;
  }


  @JsonProperty(JSON_PROPERTY_USER_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserView(CreateDatabasePayload userView) {
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
    TessellDatabaseOpsDTOProvisioningInfo tessellDatabaseOpsDTOProvisioningInfo = (TessellDatabaseOpsDTOProvisioningInfo) o;
    return Objects.equals(this.userView, tessellDatabaseOpsDTOProvisioningInfo.userView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userView);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellDatabaseOpsDTOProvisioningInfo {\n");
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

