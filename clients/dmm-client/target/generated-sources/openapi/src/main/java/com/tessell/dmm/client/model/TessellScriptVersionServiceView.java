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
import com.tessell.dmm.client.model.ScriptFileType;
import com.tessell.dmm.client.model.ScriptStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Information about a Script Version
 */
@ApiModel(description = "Information about a Script Version")
@JsonPropertyOrder({
  TessellScriptVersionServiceView.JSON_PROPERTY_SCRIPT_ID,
  TessellScriptVersionServiceView.JSON_PROPERTY_NAME,
  TessellScriptVersionServiceView.JSON_PROPERTY_VERSION,
  TessellScriptVersionServiceView.JSON_PROPERTY_STATUS,
  TessellScriptVersionServiceView.JSON_PROPERTY_FILE_NAME,
  TessellScriptVersionServiceView.JSON_PROPERTY_FILE_TYPE,
  TessellScriptVersionServiceView.JSON_PROPERTY_DATE_CREATED
})
@JsonTypeName("TessellScriptVersionServiceView")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellScriptVersionServiceView {
  public static final String JSON_PROPERTY_SCRIPT_ID = "scriptId";
  private UUID scriptId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ScriptStatus status;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_FILE_TYPE = "fileType";
  private ScriptFileType fileType;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private Date dateCreated;


  public TessellScriptVersionServiceView scriptId(UUID scriptId) {
    
    this.scriptId = scriptId;
    return this;
  }

   /**
   * ID of the associated script
   * @return scriptId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the associated script")
  @JsonProperty(JSON_PROPERTY_SCRIPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getScriptId() {
    return scriptId;
  }


  @JsonProperty(JSON_PROPERTY_SCRIPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScriptId(UUID scriptId) {
    this.scriptId = scriptId;
  }


  public TessellScriptVersionServiceView name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Version (identifier or name) of the script-version.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version (identifier or name) of the script-version.")
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


  public TessellScriptVersionServiceView version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * System assigned version of the script.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "System assigned version of the script.")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(Integer version) {
    this.version = version;
  }


  public TessellScriptVersionServiceView status(ScriptStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScriptStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(ScriptStatus status) {
    this.status = status;
  }


  public TessellScriptVersionServiceView fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Name of the associated version file
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the associated version file")
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public TessellScriptVersionServiceView fileType(ScriptFileType fileType) {
    
    this.fileType = fileType;
    return this;
  }

   /**
   * Get fileType
   * @return fileType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScriptFileType getFileType() {
    return fileType;
  }


  @JsonProperty(JSON_PROPERTY_FILE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileType(ScriptFileType fileType) {
    this.fileType = fileType;
  }


  public TessellScriptVersionServiceView dateCreated(Date dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Timestamp when the version was created at
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the version was created at")
  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellScriptVersionServiceView tessellScriptVersionServiceView = (TessellScriptVersionServiceView) o;
    return Objects.equals(this.scriptId, tessellScriptVersionServiceView.scriptId) &&
        Objects.equals(this.name, tessellScriptVersionServiceView.name) &&
        Objects.equals(this.version, tessellScriptVersionServiceView.version) &&
        Objects.equals(this.status, tessellScriptVersionServiceView.status) &&
        Objects.equals(this.fileName, tessellScriptVersionServiceView.fileName) &&
        Objects.equals(this.fileType, tessellScriptVersionServiceView.fileType) &&
        Objects.equals(this.dateCreated, tessellScriptVersionServiceView.dateCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scriptId, name, version, status, fileName, fileType, dateCreated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellScriptVersionServiceView {\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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

