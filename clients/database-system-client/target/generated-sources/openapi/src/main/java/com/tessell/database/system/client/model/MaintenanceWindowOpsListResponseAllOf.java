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
import com.tessell.database.system.client.model.MaintenanceWindowOpsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * MaintenanceWindowOpsListResponseAllOf
 */
@JsonPropertyOrder({
  MaintenanceWindowOpsListResponseAllOf.JSON_PROPERTY_RESPONSE
})
@JsonTypeName("MaintenanceWindowOpsListResponse_allOf")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MaintenanceWindowOpsListResponseAllOf {
  public static final String JSON_PROPERTY_RESPONSE = "response";
  private List<MaintenanceWindowOpsDTO> response = null;


  public MaintenanceWindowOpsListResponseAllOf response(List<MaintenanceWindowOpsDTO> response) {
    
    this.response = response;
    return this;
  }

  public MaintenanceWindowOpsListResponseAllOf addResponseItem(MaintenanceWindowOpsDTO responseItem) {
    if (this.response == null) {
      this.response = new ArrayList<>();
    }
    this.response.add(responseItem);
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MaintenanceWindowOpsDTO> getResponse() {
    return response;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponse(List<MaintenanceWindowOpsDTO> response) {
    this.response = response;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceWindowOpsListResponseAllOf maintenanceWindowOpsListResponseAllOf = (MaintenanceWindowOpsListResponseAllOf) o;
    return Objects.equals(this.response, maintenanceWindowOpsListResponseAllOf.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceWindowOpsListResponseAllOf {\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

