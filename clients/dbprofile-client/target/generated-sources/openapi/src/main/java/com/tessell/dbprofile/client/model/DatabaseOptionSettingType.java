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


package com.tessell.dbprofile.client.model;

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
 * DatabaseOptionSettingType
 */
@JsonPropertyOrder({
  DatabaseOptionSettingType.JSON_PROPERTY_ALLOWED_VALUES,
  DatabaseOptionSettingType.JSON_PROPERTY_DATA_TYPE,
  DatabaseOptionSettingType.JSON_PROPERTY_DESCRIPTION,
  DatabaseOptionSettingType.JSON_PROPERTY_NAME
})
@JsonTypeName("DatabaseOptionSettingType")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:18.047782+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DatabaseOptionSettingType {
  public static final String JSON_PROPERTY_ALLOWED_VALUES = "allowedValues";
  private String allowedValues;

  public static final String JSON_PROPERTY_DATA_TYPE = "dataType";
  private String dataType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public DatabaseOptionSettingType allowedValues(String allowedValues) {
    
    this.allowedValues = allowedValues;
    return this;
  }

   /**
   * Get allowedValues
   * @return allowedValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALLOWED_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAllowedValues() {
    return allowedValues;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedValues(String allowedValues) {
    this.allowedValues = allowedValues;
  }


  public DatabaseOptionSettingType dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataType() {
    return dataType;
  }


  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public DatabaseOptionSettingType description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public DatabaseOptionSettingType name(String name) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseOptionSettingType databaseOptionSettingType = (DatabaseOptionSettingType) o;
    return Objects.equals(this.allowedValues, databaseOptionSettingType.allowedValues) &&
        Objects.equals(this.dataType, databaseOptionSettingType.dataType) &&
        Objects.equals(this.description, databaseOptionSettingType.description) &&
        Objects.equals(this.name, databaseOptionSettingType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedValues, dataType, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseOptionSettingType {\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
