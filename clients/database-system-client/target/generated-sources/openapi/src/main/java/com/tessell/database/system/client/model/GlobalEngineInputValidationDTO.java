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
import com.tessell.database.system.client.model.TessellGlobalEngineConfigType;
import com.tessell.database.system.client.model.TessellGlobalEngineCriteria;
import com.tessell.database.system.client.model.TessellGlobalEngineInputDataType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Tessell inputs criteria for validation.
 */
@ApiModel(description = "Tessell inputs criteria for validation.")
@JsonPropertyOrder({
  GlobalEngineInputValidationDTO.JSON_PROPERTY_INPUT_DATA_TYPE,
  GlobalEngineInputValidationDTO.JSON_PROPERTY_CONFIG_TYPE,
  GlobalEngineInputValidationDTO.JSON_PROPERTY_ENTITY_TYPE,
  GlobalEngineInputValidationDTO.JSON_PROPERTY_TOPOLOGY,
  GlobalEngineInputValidationDTO.JSON_PROPERTY_ENGINE_VERSION,
  GlobalEngineInputValidationDTO.JSON_PROPERTY_CRITERIA,
  GlobalEngineInputValidationDTO.JSON_PROPERTY_REQUIRED,
  GlobalEngineInputValidationDTO.JSON_PROPERTY_REGEX,
  GlobalEngineInputValidationDTO.JSON_PROPERTY_MAX_LENGTH,
  GlobalEngineInputValidationDTO.JSON_PROPERTY_SECURE,
  GlobalEngineInputValidationDTO.JSON_PROPERTY_ERROR_MESSAGE,
  GlobalEngineInputValidationDTO.JSON_PROPERTY_DEFAULT_VALUE
})
@JsonTypeName("GlobalEngineInputValidationDTO")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GlobalEngineInputValidationDTO {
  public static final String JSON_PROPERTY_INPUT_DATA_TYPE = "inputDataType";
  private TessellGlobalEngineInputDataType inputDataType;

  public static final String JSON_PROPERTY_CONFIG_TYPE = "configType";
  private TessellGlobalEngineConfigType configType;

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private String entityType;

  public static final String JSON_PROPERTY_TOPOLOGY = "topology";
  private Object topology;

  public static final String JSON_PROPERTY_ENGINE_VERSION = "engineVersion";
  private List<String> engineVersion = null;

  public static final String JSON_PROPERTY_CRITERIA = "criteria";
  private TessellGlobalEngineCriteria criteria;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required;

  public static final String JSON_PROPERTY_REGEX = "regex";
  private String regex;

  public static final String JSON_PROPERTY_MAX_LENGTH = "maxLength";
  private Integer maxLength;

  public static final String JSON_PROPERTY_SECURE = "secure";
  private Map<String, Boolean> secure = null;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
  private String errorMessage;

  public static final String JSON_PROPERTY_DEFAULT_VALUE = "defaultValue";
  private String defaultValue;


  public GlobalEngineInputValidationDTO inputDataType(TessellGlobalEngineInputDataType inputDataType) {
    
    this.inputDataType = inputDataType;
    return this;
  }

   /**
   * Get inputDataType
   * @return inputDataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INPUT_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellGlobalEngineInputDataType getInputDataType() {
    return inputDataType;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputDataType(TessellGlobalEngineInputDataType inputDataType) {
    this.inputDataType = inputDataType;
  }


  public GlobalEngineInputValidationDTO configType(TessellGlobalEngineConfigType configType) {
    
    this.configType = configType;
    return this;
  }

   /**
   * Get configType
   * @return configType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIG_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellGlobalEngineConfigType getConfigType() {
    return configType;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigType(TessellGlobalEngineConfigType configType) {
    this.configType = configType;
  }


  public GlobalEngineInputValidationDTO entityType(String entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public GlobalEngineInputValidationDTO topology(Object topology) {
    
    this.topology = topology;
    return this;
  }

   /**
   * Get topology
   * @return topology
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOPOLOGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTopology() {
    return topology;
  }


  @JsonProperty(JSON_PROPERTY_TOPOLOGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopology(Object topology) {
    this.topology = topology;
  }


  public GlobalEngineInputValidationDTO engineVersion(List<String> engineVersion) {
    
    this.engineVersion = engineVersion;
    return this;
  }

  public GlobalEngineInputValidationDTO addEngineVersionItem(String engineVersionItem) {
    if (this.engineVersion == null) {
      this.engineVersion = new ArrayList<>();
    }
    this.engineVersion.add(engineVersionItem);
    return this;
  }

   /**
   * Get engineVersion
   * @return engineVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENGINE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEngineVersion() {
    return engineVersion;
  }


  @JsonProperty(JSON_PROPERTY_ENGINE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEngineVersion(List<String> engineVersion) {
    this.engineVersion = engineVersion;
  }


  public GlobalEngineInputValidationDTO criteria(TessellGlobalEngineCriteria criteria) {
    
    this.criteria = criteria;
    return this;
  }

   /**
   * Get criteria
   * @return criteria
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CRITERIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellGlobalEngineCriteria getCriteria() {
    return criteria;
  }


  @JsonProperty(JSON_PROPERTY_CRITERIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCriteria(TessellGlobalEngineCriteria criteria) {
    this.criteria = criteria;
  }


  public GlobalEngineInputValidationDTO required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequired() {
    return required;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequired(Boolean required) {
    this.required = required;
  }


  public GlobalEngineInputValidationDTO regex(String regex) {
    
    this.regex = regex;
    return this;
  }

   /**
   * Get regex
   * @return regex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegex() {
    return regex;
  }


  @JsonProperty(JSON_PROPERTY_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegex(String regex) {
    this.regex = regex;
  }


  public GlobalEngineInputValidationDTO maxLength(Integer maxLength) {
    
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Get maxLength
   * @return maxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxLength() {
    return maxLength;
  }


  @JsonProperty(JSON_PROPERTY_MAX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }


  public GlobalEngineInputValidationDTO secure(Map<String, Boolean> secure) {
    
    this.secure = secure;
    return this;
  }

  public GlobalEngineInputValidationDTO putSecureItem(String key, Boolean secureItem) {
    if (this.secure == null) {
      this.secure = new HashMap<>();
    }
    this.secure.put(key, secureItem);
    return this;
  }

   /**
   * Get secure
   * @return secure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Boolean> getSecure() {
    return secure;
  }


  @JsonProperty(JSON_PROPERTY_SECURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecure(Map<String, Boolean> secure) {
    this.secure = secure;
  }


  public GlobalEngineInputValidationDTO errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorMessage() {
    return errorMessage;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public GlobalEngineInputValidationDTO defaultValue(String defaultValue) {
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultValue() {
    return defaultValue;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalEngineInputValidationDTO globalEngineInputValidationDTO = (GlobalEngineInputValidationDTO) o;
    return Objects.equals(this.inputDataType, globalEngineInputValidationDTO.inputDataType) &&
        Objects.equals(this.configType, globalEngineInputValidationDTO.configType) &&
        Objects.equals(this.entityType, globalEngineInputValidationDTO.entityType) &&
        Objects.equals(this.topology, globalEngineInputValidationDTO.topology) &&
        Objects.equals(this.engineVersion, globalEngineInputValidationDTO.engineVersion) &&
        Objects.equals(this.criteria, globalEngineInputValidationDTO.criteria) &&
        Objects.equals(this.required, globalEngineInputValidationDTO.required) &&
        Objects.equals(this.regex, globalEngineInputValidationDTO.regex) &&
        Objects.equals(this.maxLength, globalEngineInputValidationDTO.maxLength) &&
        Objects.equals(this.secure, globalEngineInputValidationDTO.secure) &&
        Objects.equals(this.errorMessage, globalEngineInputValidationDTO.errorMessage) &&
        Objects.equals(this.defaultValue, globalEngineInputValidationDTO.defaultValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputDataType, configType, entityType, topology, engineVersion, criteria, required, regex, maxLength, secure, errorMessage, defaultValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalEngineInputValidationDTO {\n");
    sb.append("    inputDataType: ").append(toIndentedString(inputDataType)).append("\n");
    sb.append("    configType: ").append(toIndentedString(configType)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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

