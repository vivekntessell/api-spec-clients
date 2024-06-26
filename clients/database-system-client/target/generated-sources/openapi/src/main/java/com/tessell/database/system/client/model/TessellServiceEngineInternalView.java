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
import com.tessell.database.system.client.model.ScriptInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is the union of all engine config internal view
 */
@ApiModel(description = "This is the union of all engine config internal view")
@JsonPropertyOrder({
  TessellServiceEngineInternalView.JSON_PROPERTY_PARAMETER_PROFILE_ID,
  TessellServiceEngineInternalView.JSON_PROPERTY_PARAMETER_PROFILE_VERSION,
  TessellServiceEngineInternalView.JSON_PROPERTY_OPTIONS_PROFILE_ID,
  TessellServiceEngineInternalView.JSON_PROPERTY_PRE_SCRIPT_INFO,
  TessellServiceEngineInternalView.JSON_PROPERTY_POST_SCRIPT_INFO
})
@JsonTypeName("TessellServiceEngineInternalView")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceEngineInternalView {
  public static final String JSON_PROPERTY_PARAMETER_PROFILE_ID = "parameterProfileId";
  private UUID parameterProfileId;

  public static final String JSON_PROPERTY_PARAMETER_PROFILE_VERSION = "parameterProfileVersion";
  private UUID parameterProfileVersion;

  public static final String JSON_PROPERTY_OPTIONS_PROFILE_ID = "optionsProfileId";
  private UUID optionsProfileId;

  public static final String JSON_PROPERTY_PRE_SCRIPT_INFO = "preScriptInfo";
  private ScriptInfo preScriptInfo;

  public static final String JSON_PROPERTY_POST_SCRIPT_INFO = "postScriptInfo";
  private ScriptInfo postScriptInfo;


  public TessellServiceEngineInternalView parameterProfileId(UUID parameterProfileId) {
    
    this.parameterProfileId = parameterProfileId;
    return this;
  }

   /**
   * Get parameterProfileId
   * @return parameterProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARAMETER_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getParameterProfileId() {
    return parameterProfileId;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameterProfileId(UUID parameterProfileId) {
    this.parameterProfileId = parameterProfileId;
  }


  public TessellServiceEngineInternalView parameterProfileVersion(UUID parameterProfileVersion) {
    
    this.parameterProfileVersion = parameterProfileVersion;
    return this;
  }

   /**
   * Get parameterProfileVersion
   * @return parameterProfileVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARAMETER_PROFILE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getParameterProfileVersion() {
    return parameterProfileVersion;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER_PROFILE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameterProfileVersion(UUID parameterProfileVersion) {
    this.parameterProfileVersion = parameterProfileVersion;
  }


  public TessellServiceEngineInternalView optionsProfileId(UUID optionsProfileId) {
    
    this.optionsProfileId = optionsProfileId;
    return this;
  }

   /**
   * Get optionsProfileId
   * @return optionsProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPTIONS_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getOptionsProfileId() {
    return optionsProfileId;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptionsProfileId(UUID optionsProfileId) {
    this.optionsProfileId = optionsProfileId;
  }


  public TessellServiceEngineInternalView preScriptInfo(ScriptInfo preScriptInfo) {
    
    this.preScriptInfo = preScriptInfo;
    return this;
  }

   /**
   * Get preScriptInfo
   * @return preScriptInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRE_SCRIPT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScriptInfo getPreScriptInfo() {
    return preScriptInfo;
  }


  @JsonProperty(JSON_PROPERTY_PRE_SCRIPT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreScriptInfo(ScriptInfo preScriptInfo) {
    this.preScriptInfo = preScriptInfo;
  }


  public TessellServiceEngineInternalView postScriptInfo(ScriptInfo postScriptInfo) {
    
    this.postScriptInfo = postScriptInfo;
    return this;
  }

   /**
   * Get postScriptInfo
   * @return postScriptInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POST_SCRIPT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScriptInfo getPostScriptInfo() {
    return postScriptInfo;
  }


  @JsonProperty(JSON_PROPERTY_POST_SCRIPT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostScriptInfo(ScriptInfo postScriptInfo) {
    this.postScriptInfo = postScriptInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellServiceEngineInternalView tessellServiceEngineInternalView = (TessellServiceEngineInternalView) o;
    return Objects.equals(this.parameterProfileId, tessellServiceEngineInternalView.parameterProfileId) &&
        Objects.equals(this.parameterProfileVersion, tessellServiceEngineInternalView.parameterProfileVersion) &&
        Objects.equals(this.optionsProfileId, tessellServiceEngineInternalView.optionsProfileId) &&
        Objects.equals(this.preScriptInfo, tessellServiceEngineInternalView.preScriptInfo) &&
        Objects.equals(this.postScriptInfo, tessellServiceEngineInternalView.postScriptInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterProfileId, parameterProfileVersion, optionsProfileId, preScriptInfo, postScriptInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceEngineInternalView {\n");
    sb.append("    parameterProfileId: ").append(toIndentedString(parameterProfileId)).append("\n");
    sb.append("    parameterProfileVersion: ").append(toIndentedString(parameterProfileVersion)).append("\n");
    sb.append("    optionsProfileId: ").append(toIndentedString(optionsProfileId)).append("\n");
    sb.append("    preScriptInfo: ").append(toIndentedString(preScriptInfo)).append("\n");
    sb.append("    postScriptInfo: ").append(toIndentedString(postScriptInfo)).append("\n");
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

