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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * OracleEngineConfigPayload
 */
@JsonPropertyOrder({
  OracleEngineConfigPayload.JSON_PROPERTY_MULTI_TENANT,
  OracleEngineConfigPayload.JSON_PROPERTY_PARAMETER_PROFILE_ID,
  OracleEngineConfigPayload.JSON_PROPERTY_OPTIONS_PROFILE,
  OracleEngineConfigPayload.JSON_PROPERTY_CHARACTER_SET,
  OracleEngineConfigPayload.JSON_PROPERTY_NATIONAL_CHARACTER_SET,
  OracleEngineConfigPayload.JSON_PROPERTY_ENABLE_ARCHIVE_MODE
})
@JsonTypeName("OracleEngineConfigPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class OracleEngineConfigPayload {
  public static final String JSON_PROPERTY_MULTI_TENANT = "multiTenant";
  private Boolean multiTenant = false;

  public static final String JSON_PROPERTY_PARAMETER_PROFILE_ID = "parameterProfileId";
  private UUID parameterProfileId;

  public static final String JSON_PROPERTY_OPTIONS_PROFILE = "optionsProfile";
  private String optionsProfile;

  public static final String JSON_PROPERTY_CHARACTER_SET = "characterSet";
  private String characterSet;

  public static final String JSON_PROPERTY_NATIONAL_CHARACTER_SET = "nationalCharacterSet";
  private String nationalCharacterSet;

  public static final String JSON_PROPERTY_ENABLE_ARCHIVE_MODE = "enableArchiveMode";
  private Boolean enableArchiveMode = true;


  public OracleEngineConfigPayload multiTenant(Boolean multiTenant) {
    
    this.multiTenant = multiTenant;
    return this;
  }

   /**
   * Specify whether the DB Service is multi-tenant.
   * @return multiTenant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify whether the DB Service is multi-tenant.")
  @JsonProperty(JSON_PROPERTY_MULTI_TENANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMultiTenant() {
    return multiTenant;
  }


  @JsonProperty(JSON_PROPERTY_MULTI_TENANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiTenant(Boolean multiTenant) {
    this.multiTenant = multiTenant;
  }


  public OracleEngineConfigPayload parameterProfileId(UUID parameterProfileId) {
    
    this.parameterProfileId = parameterProfileId;
    return this;
  }

   /**
   * The parameter profile id for the database
   * @return parameterProfileId
  **/
  @ApiModelProperty(required = true, value = "The parameter profile id for the database")
  @JsonProperty(JSON_PROPERTY_PARAMETER_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getParameterProfileId() {
    return parameterProfileId;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParameterProfileId(UUID parameterProfileId) {
    this.parameterProfileId = parameterProfileId;
  }


  public OracleEngineConfigPayload optionsProfile(String optionsProfile) {
    
    this.optionsProfile = optionsProfile;
    return this;
  }

   /**
   * The options profile for the database
   * @return optionsProfile
  **/
  @ApiModelProperty(required = true, value = "The options profile for the database")
  @JsonProperty(JSON_PROPERTY_OPTIONS_PROFILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOptionsProfile() {
    return optionsProfile;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS_PROFILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOptionsProfile(String optionsProfile) {
    this.optionsProfile = optionsProfile;
  }


  public OracleEngineConfigPayload characterSet(String characterSet) {
    
    this.characterSet = characterSet;
    return this;
  }

   /**
   * The character-set for the database
   * @return characterSet
  **/
  @ApiModelProperty(required = true, value = "The character-set for the database")
  @JsonProperty(JSON_PROPERTY_CHARACTER_SET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCharacterSet() {
    return characterSet;
  }


  @JsonProperty(JSON_PROPERTY_CHARACTER_SET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCharacterSet(String characterSet) {
    this.characterSet = characterSet;
  }


  public OracleEngineConfigPayload nationalCharacterSet(String nationalCharacterSet) {
    
    this.nationalCharacterSet = nationalCharacterSet;
    return this;
  }

   /**
   * The national-character-set for the database
   * @return nationalCharacterSet
  **/
  @ApiModelProperty(required = true, value = "The national-character-set for the database")
  @JsonProperty(JSON_PROPERTY_NATIONAL_CHARACTER_SET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNationalCharacterSet() {
    return nationalCharacterSet;
  }


  @JsonProperty(JSON_PROPERTY_NATIONAL_CHARACTER_SET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNationalCharacterSet(String nationalCharacterSet) {
    this.nationalCharacterSet = nationalCharacterSet;
  }


  public OracleEngineConfigPayload enableArchiveMode(Boolean enableArchiveMode) {
    
    this.enableArchiveMode = enableArchiveMode;
    return this;
  }

   /**
   * To explicitly enable archive mode, when PITR is disabled
   * @return enableArchiveMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To explicitly enable archive mode, when PITR is disabled")
  @JsonProperty(JSON_PROPERTY_ENABLE_ARCHIVE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableArchiveMode() {
    return enableArchiveMode;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_ARCHIVE_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableArchiveMode(Boolean enableArchiveMode) {
    this.enableArchiveMode = enableArchiveMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OracleEngineConfigPayload oracleEngineConfigPayload = (OracleEngineConfigPayload) o;
    return Objects.equals(this.multiTenant, oracleEngineConfigPayload.multiTenant) &&
        Objects.equals(this.parameterProfileId, oracleEngineConfigPayload.parameterProfileId) &&
        Objects.equals(this.optionsProfile, oracleEngineConfigPayload.optionsProfile) &&
        Objects.equals(this.characterSet, oracleEngineConfigPayload.characterSet) &&
        Objects.equals(this.nationalCharacterSet, oracleEngineConfigPayload.nationalCharacterSet) &&
        Objects.equals(this.enableArchiveMode, oracleEngineConfigPayload.enableArchiveMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multiTenant, parameterProfileId, optionsProfile, characterSet, nationalCharacterSet, enableArchiveMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OracleEngineConfigPayload {\n");
    sb.append("    multiTenant: ").append(toIndentedString(multiTenant)).append("\n");
    sb.append("    parameterProfileId: ").append(toIndentedString(parameterProfileId)).append("\n");
    sb.append("    optionsProfile: ").append(toIndentedString(optionsProfile)).append("\n");
    sb.append("    characterSet: ").append(toIndentedString(characterSet)).append("\n");
    sb.append("    nationalCharacterSet: ").append(toIndentedString(nationalCharacterSet)).append("\n");
    sb.append("    enableArchiveMode: ").append(toIndentedString(enableArchiveMode)).append("\n");
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
