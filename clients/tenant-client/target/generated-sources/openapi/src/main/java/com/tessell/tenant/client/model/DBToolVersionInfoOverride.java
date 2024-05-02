/*
 * Tessell Tenant Onboarding Service API
 * Tenant Onboarding API
 *
 * The version of the OpenAPI document: v1beta
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.tenant.client.model;

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
 * DBToolVersionInfoOverride
 */
@JsonPropertyOrder({
  DBToolVersionInfoOverride.JSON_PROPERTY_MYSQL
})
@JsonTypeName("DBToolVersionInfoOverride")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DBToolVersionInfoOverride {
  public static final String JSON_PROPERTY_MYSQL = "mysql";
  private String mysql;


  public DBToolVersionInfoOverride mysql(String mysql) {
    
    this.mysql = mysql;
    return this;
  }

   /**
   * Get mysql
   * @return mysql
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MYSQL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMysql() {
    return mysql;
  }


  @JsonProperty(JSON_PROPERTY_MYSQL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMysql(String mysql) {
    this.mysql = mysql;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DBToolVersionInfoOverride dbToolVersionInfoOverride = (DBToolVersionInfoOverride) o;
    return Objects.equals(this.mysql, dbToolVersionInfoOverride.mysql);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mysql);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBToolVersionInfoOverride {\n");
    sb.append("    mysql: ").append(toIndentedString(mysql)).append("\n");
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

