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
 * TessellAppFamilyConstantsDTO
 */
@JsonPropertyOrder({
  TessellAppFamilyConstantsDTO.JSON_PROPERTY_T_R_U_E,
  TessellAppFamilyConstantsDTO.JSON_PROPERTY_L_O_A_D_A_P_P_S,
  TessellAppFamilyConstantsDTO.JSON_PROPERTY_D_E_F_A_U_L_T_L_O_A_D_A_P_P_S
})
@JsonTypeName("appFamilyConstants")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.675868+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellAppFamilyConstantsDTO {
  public static final String JSON_PROPERTY_T_R_U_E = "TRUE";
  private String TRUE = "true";

  public static final String JSON_PROPERTY_L_O_A_D_A_P_P_S = "LOAD_APPS";
  private String LOAD_APPS = "load-apps";

  public static final String JSON_PROPERTY_D_E_F_A_U_L_T_L_O_A_D_A_P_P_S = "DEFAULT_LOAD_APPS";
  private String DEFAULT_LOAD_APPS = "false";


  public TessellAppFamilyConstantsDTO TRUE(String TRUE) {
    
    this.TRUE = TRUE;
    return this;
  }

   /**
   * Get TRUE
   * @return TRUE
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_T_R_U_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTRUE() {
    return TRUE;
  }


  @JsonProperty(JSON_PROPERTY_T_R_U_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTRUE(String TRUE) {
    this.TRUE = TRUE;
  }


  public TessellAppFamilyConstantsDTO LOAD_APPS(String LOAD_APPS) {
    
    this.LOAD_APPS = LOAD_APPS;
    return this;
  }

   /**
   * Get LOAD_APPS
   * @return LOAD_APPS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_L_O_A_D_A_P_P_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLOADAPPS() {
    return LOAD_APPS;
  }


  @JsonProperty(JSON_PROPERTY_L_O_A_D_A_P_P_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLOADAPPS(String LOAD_APPS) {
    this.LOAD_APPS = LOAD_APPS;
  }


  public TessellAppFamilyConstantsDTO DEFAULT_LOAD_APPS(String DEFAULT_LOAD_APPS) {
    
    this.DEFAULT_LOAD_APPS = DEFAULT_LOAD_APPS;
    return this;
  }

   /**
   * Get DEFAULT_LOAD_APPS
   * @return DEFAULT_LOAD_APPS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_D_E_F_A_U_L_T_L_O_A_D_A_P_P_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDEFAULTLOADAPPS() {
    return DEFAULT_LOAD_APPS;
  }


  @JsonProperty(JSON_PROPERTY_D_E_F_A_U_L_T_L_O_A_D_A_P_P_S)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDEFAULTLOADAPPS(String DEFAULT_LOAD_APPS) {
    this.DEFAULT_LOAD_APPS = DEFAULT_LOAD_APPS;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellAppFamilyConstantsDTO appFamilyConstants = (TessellAppFamilyConstantsDTO) o;
    return Objects.equals(this.TRUE, appFamilyConstants.TRUE) &&
        Objects.equals(this.LOAD_APPS, appFamilyConstants.LOAD_APPS) &&
        Objects.equals(this.DEFAULT_LOAD_APPS, appFamilyConstants.DEFAULT_LOAD_APPS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(TRUE, LOAD_APPS, DEFAULT_LOAD_APPS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellAppFamilyConstantsDTO {\n");
    sb.append("    TRUE: ").append(toIndentedString(TRUE)).append("\n");
    sb.append("    LOAD_APPS: ").append(toIndentedString(LOAD_APPS)).append("\n");
    sb.append("    DEFAULT_LOAD_APPS: ").append(toIndentedString(DEFAULT_LOAD_APPS)).append("\n");
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
