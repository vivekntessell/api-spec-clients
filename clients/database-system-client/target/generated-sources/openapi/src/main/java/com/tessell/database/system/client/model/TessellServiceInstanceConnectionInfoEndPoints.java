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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellServiceInstanceConnectionInfoEndPoints
 */
@JsonPropertyOrder({
  TessellServiceInstanceConnectionInfoEndPoints.JSON_PROPERTY_ENDPOINT,
  TessellServiceInstanceConnectionInfoEndPoints.JSON_PROPERTY_LABELS,
  TessellServiceInstanceConnectionInfoEndPoints.JSON_PROPERTY_DATA
})
@JsonTypeName("TessellServiceInstanceConnectionInfo_endPoints")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceInstanceConnectionInfoEndPoints {
  public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
  private String endpoint;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<String> labels = null;

  public static final String JSON_PROPERTY_DATA = "data";
  private Object data;


  public TessellServiceInstanceConnectionInfoEndPoints endpoint(String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndpoint() {
    return endpoint;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  public TessellServiceInstanceConnectionInfoEndPoints labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public TessellServiceInstanceConnectionInfoEndPoints addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public TessellServiceInstanceConnectionInfoEndPoints data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(Object data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellServiceInstanceConnectionInfoEndPoints tessellServiceInstanceConnectionInfoEndPoints = (TessellServiceInstanceConnectionInfoEndPoints) o;
    return Objects.equals(this.endpoint, tessellServiceInstanceConnectionInfoEndPoints.endpoint) &&
        Objects.equals(this.labels, tessellServiceInstanceConnectionInfoEndPoints.labels) &&
        Objects.equals(this.data, tessellServiceInstanceConnectionInfoEndPoints.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoint, labels, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceInstanceConnectionInfoEndPoints {\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

