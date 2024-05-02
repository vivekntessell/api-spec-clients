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
import com.tessell.database.system.client.model.ComputeConnectivityConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * GenieConnectivityPayload
 */
@JsonPropertyOrder({
  GenieConnectivityPayload.JSON_PROPERTY_REQUEST_ID,
  GenieConnectivityPayload.JSON_PROPERTY_ACTION,
  GenieConnectivityPayload.JSON_PROPERTY_COMPUTES_CONNECTIVITY
})
@JsonTypeName("GenieConnectivityPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenieConnectivityPayload {
  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_ACTION = "action";
  private String action;

  public static final String JSON_PROPERTY_COMPUTES_CONNECTIVITY = "computesConnectivity";
  private List<ComputeConnectivityConfig> computesConnectivity = null;


  public GenieConnectivityPayload requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * requestId needed to make a callback
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "requestId needed to make a callback")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public GenieConnectivityPayload action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Type of action - enable or disable
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of action - enable or disable")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAction(String action) {
    this.action = action;
  }


  public GenieConnectivityPayload computesConnectivity(List<ComputeConnectivityConfig> computesConnectivity) {
    
    this.computesConnectivity = computesConnectivity;
    return this;
  }

  public GenieConnectivityPayload addComputesConnectivityItem(ComputeConnectivityConfig computesConnectivityItem) {
    if (this.computesConnectivity == null) {
      this.computesConnectivity = new ArrayList<>();
    }
    this.computesConnectivity.add(computesConnectivityItem);
    return this;
  }

   /**
   * Get computesConnectivity
   * @return computesConnectivity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPUTES_CONNECTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ComputeConnectivityConfig> getComputesConnectivity() {
    return computesConnectivity;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTES_CONNECTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComputesConnectivity(List<ComputeConnectivityConfig> computesConnectivity) {
    this.computesConnectivity = computesConnectivity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenieConnectivityPayload genieConnectivityPayload = (GenieConnectivityPayload) o;
    return Objects.equals(this.requestId, genieConnectivityPayload.requestId) &&
        Objects.equals(this.action, genieConnectivityPayload.action) &&
        Objects.equals(this.computesConnectivity, genieConnectivityPayload.computesConnectivity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, action, computesConnectivity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenieConnectivityPayload {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    computesConnectivity: ").append(toIndentedString(computesConnectivity)).append("\n");
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
