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


package com.tessell.gov.client.model;

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
 * TessellAppPrivilegeDTO
 */
@JsonPropertyOrder({
  TessellAppPrivilegeDTO.JSON_PROPERTY_APP,
  TessellAppPrivilegeDTO.JSON_PROPERTY_PRIVILEGE
})
@JsonTypeName("AppPrivilege")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.675868+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellAppPrivilegeDTO {
  public static final String JSON_PROPERTY_APP = "app";
  private String app;

  public static final String JSON_PROPERTY_PRIVILEGE = "privilege";
  private String privilege;


  public TessellAppPrivilegeDTO app(String app) {
    
    this.app = app;
    return this;
  }

   /**
   * Name of the privilege
   * @return app
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the privilege")
  @JsonProperty(JSON_PROPERTY_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApp() {
    return app;
  }


  @JsonProperty(JSON_PROPERTY_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApp(String app) {
    this.app = app;
  }


  public TessellAppPrivilegeDTO privilege(String privilege) {
    
    this.privilege = privilege;
    return this;
  }

   /**
   * HTTP endpoint
   * @return privilege
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HTTP endpoint")
  @JsonProperty(JSON_PROPERTY_PRIVILEGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrivilege() {
    return privilege;
  }


  @JsonProperty(JSON_PROPERTY_PRIVILEGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivilege(String privilege) {
    this.privilege = privilege;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellAppPrivilegeDTO appPrivilege = (TessellAppPrivilegeDTO) o;
    return Objects.equals(this.app, appPrivilege.app) &&
        Objects.equals(this.privilege, appPrivilege.privilege);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, privilege);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellAppPrivilegeDTO {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
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

