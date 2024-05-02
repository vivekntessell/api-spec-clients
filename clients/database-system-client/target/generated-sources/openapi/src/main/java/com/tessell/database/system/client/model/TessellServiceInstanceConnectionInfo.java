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
import com.tessell.database.system.client.model.TessellServiceInstanceConnectString;
import com.tessell.database.system.client.model.TessellServiceInstanceConnectionInfoEndPoints;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellServiceInstanceConnectionInfo
 */
@JsonPropertyOrder({
  TessellServiceInstanceConnectionInfo.JSON_PROPERTY_CONNECT_STRING,
  TessellServiceInstanceConnectionInfo.JSON_PROPERTY_END_POINTS,
  TessellServiceInstanceConnectionInfo.JSON_PROPERTY_DATA
})
@JsonTypeName("TessellServiceInstanceConnectionInfo")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceInstanceConnectionInfo {
  public static final String JSON_PROPERTY_CONNECT_STRING = "connectString";
  private TessellServiceInstanceConnectString connectString;

  public static final String JSON_PROPERTY_END_POINTS = "endPoints";
  private List<TessellServiceInstanceConnectionInfoEndPoints> endPoints = null;

  public static final String JSON_PROPERTY_DATA = "data";
  private Object data;


  public TessellServiceInstanceConnectionInfo connectString(TessellServiceInstanceConnectString connectString) {
    
    this.connectString = connectString;
    return this;
  }

   /**
   * Get connectString
   * @return connectString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECT_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceInstanceConnectString getConnectString() {
    return connectString;
  }


  @JsonProperty(JSON_PROPERTY_CONNECT_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectString(TessellServiceInstanceConnectString connectString) {
    this.connectString = connectString;
  }


  public TessellServiceInstanceConnectionInfo endPoints(List<TessellServiceInstanceConnectionInfoEndPoints> endPoints) {
    
    this.endPoints = endPoints;
    return this;
  }

  public TessellServiceInstanceConnectionInfo addEndPointsItem(TessellServiceInstanceConnectionInfoEndPoints endPointsItem) {
    if (this.endPoints == null) {
      this.endPoints = new ArrayList<>();
    }
    this.endPoints.add(endPointsItem);
    return this;
  }

   /**
   * Get endPoints
   * @return endPoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellServiceInstanceConnectionInfoEndPoints> getEndPoints() {
    return endPoints;
  }


  @JsonProperty(JSON_PROPERTY_END_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndPoints(List<TessellServiceInstanceConnectionInfoEndPoints> endPoints) {
    this.endPoints = endPoints;
  }


  public TessellServiceInstanceConnectionInfo data(Object data) {
    
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
    TessellServiceInstanceConnectionInfo tessellServiceInstanceConnectionInfo = (TessellServiceInstanceConnectionInfo) o;
    return Objects.equals(this.connectString, tessellServiceInstanceConnectionInfo.connectString) &&
        Objects.equals(this.endPoints, tessellServiceInstanceConnectionInfo.endPoints) &&
        Objects.equals(this.data, tessellServiceInstanceConnectionInfo.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectString, endPoints, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceInstanceConnectionInfo {\n");
    sb.append("    connectString: ").append(toIndentedString(connectString)).append("\n");
    sb.append("    endPoints: ").append(toIndentedString(endPoints)).append("\n");
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

