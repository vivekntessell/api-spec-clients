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
import com.tessell.dmm.client.model.DbExportDapContentAutomatic;
import com.tessell.dmm.client.model.DbExportDapContentManual;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DbExportDapContent
 */
@JsonPropertyOrder({
  DbExportDapContent.JSON_PROPERTY_AUTOMATIC,
  DbExportDapContent.JSON_PROPERTY_MANUAL
})
@JsonTypeName("DbExportDapContent")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DbExportDapContent {
  public static final String JSON_PROPERTY_AUTOMATIC = "automatic";
  private DbExportDapContentAutomatic automatic;

  public static final String JSON_PROPERTY_MANUAL = "manual";
  private DbExportDapContentManual manual;


  public DbExportDapContent automatic(DbExportDapContentAutomatic automatic) {
    
    this.automatic = automatic;
    return this;
  }

   /**
   * Get automatic
   * @return automatic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTOMATIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbExportDapContentAutomatic getAutomatic() {
    return automatic;
  }


  @JsonProperty(JSON_PROPERTY_AUTOMATIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutomatic(DbExportDapContentAutomatic automatic) {
    this.automatic = automatic;
  }


  public DbExportDapContent manual(DbExportDapContentManual manual) {
    
    this.manual = manual;
    return this;
  }

   /**
   * Get manual
   * @return manual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MANUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbExportDapContentManual getManual() {
    return manual;
  }


  @JsonProperty(JSON_PROPERTY_MANUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManual(DbExportDapContentManual manual) {
    this.manual = manual;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbExportDapContent dbExportDapContent = (DbExportDapContent) o;
    return Objects.equals(this.automatic, dbExportDapContent.automatic) &&
        Objects.equals(this.manual, dbExportDapContent.manual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automatic, manual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbExportDapContent {\n");
    sb.append("    automatic: ").append(toIndentedString(automatic)).append("\n");
    sb.append("    manual: ").append(toIndentedString(manual)).append("\n");
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

