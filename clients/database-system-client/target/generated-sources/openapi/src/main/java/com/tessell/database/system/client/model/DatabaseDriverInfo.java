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
import com.tessell.database.system.client.model.TessellServiceDatabaseConnectString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Database&#39;s metadata information for driver use
 */
@ApiModel(description = "Database's metadata information for driver use")
@JsonPropertyOrder({
  DatabaseDriverInfo.JSON_PROPERTY_CONNECT_STRING,
  DatabaseDriverInfo.JSON_PROPERTY_DATA
})
@JsonTypeName("DatabaseDriverInfo")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DatabaseDriverInfo {
  public static final String JSON_PROPERTY_CONNECT_STRING = "connectString";
  private TessellServiceDatabaseConnectString connectString;

  public static final String JSON_PROPERTY_DATA = "data";
  private Object data;


  public DatabaseDriverInfo connectString(TessellServiceDatabaseConnectString connectString) {
    
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

  public TessellServiceDatabaseConnectString getConnectString() {
    return connectString;
  }


  @JsonProperty(JSON_PROPERTY_CONNECT_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectString(TessellServiceDatabaseConnectString connectString) {
    this.connectString = connectString;
  }


  public DatabaseDriverInfo data(Object data) {
    
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
    DatabaseDriverInfo databaseDriverInfo = (DatabaseDriverInfo) o;
    return Objects.equals(this.connectString, databaseDriverInfo.connectString) &&
        Objects.equals(this.data, databaseDriverInfo.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectString, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseDriverInfo {\n");
    sb.append("    connectString: ").append(toIndentedString(connectString)).append("\n");
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

