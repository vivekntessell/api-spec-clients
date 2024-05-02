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
import com.tessell.dmm.client.model.ScriptMaturityStatus;
import com.tessell.dmm.client.model.ScriptStatus;
import com.tessell.dmm.client.model.TessellScriptLocationInfo;
import com.tessell.dmm.client.model.TessellScriptVersionDriverInfo;
import com.tessell.dmm.client.model.TessellScriptVersionMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Tessell Script Version DTO definition
 */
@ApiModel(description = "Tessell Script Version DTO definition")
@JsonPropertyOrder({
  TessellScriptVersionDTO.JSON_PROPERTY_SCRIPT_ID,
  TessellScriptVersionDTO.JSON_PROPERTY_NAME,
  TessellScriptVersionDTO.JSON_PROPERTY_INTERNAL_VERSION,
  TessellScriptVersionDTO.JSON_PROPERTY_FILE_NAME,
  TessellScriptVersionDTO.JSON_PROPERTY_FILE_TYPE,
  TessellScriptVersionDTO.JSON_PROPERTY_STATUS,
  TessellScriptVersionDTO.JSON_PROPERTY_MATURITY_STATUS,
  TessellScriptVersionDTO.JSON_PROPERTY_LOCATION_INFO,
  TessellScriptVersionDTO.JSON_PROPERTY_METADATA,
  TessellScriptVersionDTO.JSON_PROPERTY_DRIVER_INFO,
  TessellScriptVersionDTO.JSON_PROPERTY_BLOB,
  TessellScriptVersionDTO.JSON_PROPERTY_DATE_CREATED,
  TessellScriptVersionDTO.JSON_PROPERTY_DATE_MODIFIED
})
@JsonTypeName("TessellScriptVersionDTO")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellScriptVersionDTO {
  public static final String JSON_PROPERTY_SCRIPT_ID = "scriptId";
  private UUID scriptId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INTERNAL_VERSION = "internalVersion";
  private Integer internalVersion;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_FILE_TYPE = "fileType";
  private ScriptFileType fileType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ScriptStatus status;

  public static final String JSON_PROPERTY_MATURITY_STATUS = "maturityStatus";
  private ScriptMaturityStatus maturityStatus;

  public static final String JSON_PROPERTY_LOCATION_INFO = "locationInfo";
  private TessellScriptLocationInfo locationInfo;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private TessellScriptVersionMetadata metadata;

  public static final String JSON_PROPERTY_DRIVER_INFO = "driverInfo";
  private TessellScriptVersionDriverInfo driverInfo;

  public static final String JSON_PROPERTY_BLOB = "blob";
  private byte[] blob;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private Date dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private Date dateModified;


  public TessellScriptVersionDTO scriptId(UUID scriptId) {
    
    this.scriptId = scriptId;
    return this;
  }

   /**
   * Get scriptId
   * @return scriptId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public TessellScriptVersionDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Version of the script.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version of the script.")
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


  public TessellScriptVersionDTO internalVersion(Integer internalVersion) {
    
    this.internalVersion = internalVersion;
    return this;
  }

   /**
   * Internal version of the script.
   * @return internalVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Internal version of the script.")
  @JsonProperty(JSON_PROPERTY_INTERNAL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInternalVersion() {
    return internalVersion;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternalVersion(Integer internalVersion) {
    this.internalVersion = internalVersion;
  }


  public TessellScriptVersionDTO fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public TessellScriptVersionDTO fileType(ScriptFileType fileType) {
    
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


  public TessellScriptVersionDTO status(ScriptStatus status) {
    
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


  public TessellScriptVersionDTO maturityStatus(ScriptMaturityStatus maturityStatus) {
    
    this.maturityStatus = maturityStatus;
    return this;
  }

   /**
   * Get maturityStatus
   * @return maturityStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATURITY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScriptMaturityStatus getMaturityStatus() {
    return maturityStatus;
  }


  @JsonProperty(JSON_PROPERTY_MATURITY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaturityStatus(ScriptMaturityStatus maturityStatus) {
    this.maturityStatus = maturityStatus;
  }


  public TessellScriptVersionDTO locationInfo(TessellScriptLocationInfo locationInfo) {
    
    this.locationInfo = locationInfo;
    return this;
  }

   /**
   * Get locationInfo
   * @return locationInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCATION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellScriptLocationInfo getLocationInfo() {
    return locationInfo;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocationInfo(TessellScriptLocationInfo locationInfo) {
    this.locationInfo = locationInfo;
  }


  public TessellScriptVersionDTO metadata(TessellScriptVersionMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellScriptVersionMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(TessellScriptVersionMetadata metadata) {
    this.metadata = metadata;
  }


  public TessellScriptVersionDTO driverInfo(TessellScriptVersionDriverInfo driverInfo) {
    
    this.driverInfo = driverInfo;
    return this;
  }

   /**
   * Get driverInfo
   * @return driverInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DRIVER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellScriptVersionDriverInfo getDriverInfo() {
    return driverInfo;
  }


  @JsonProperty(JSON_PROPERTY_DRIVER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDriverInfo(TessellScriptVersionDriverInfo driverInfo) {
    this.driverInfo = driverInfo;
  }


  public TessellScriptVersionDTO blob(byte[] blob) {
    
    this.blob = blob;
    return this;
  }

   /**
   * Script content
   * @return blob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Script content")
  @JsonProperty(JSON_PROPERTY_BLOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getBlob() {
    return blob;
  }


  @JsonProperty(JSON_PROPERTY_BLOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlob(byte[] blob) {
    this.blob = blob;
  }


  public TessellScriptVersionDTO dateCreated(Date dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public TessellScriptVersionDTO dateModified(Date dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Get dateModified
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDateModified() {
    return dateModified;
  }


  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellScriptVersionDTO tessellScriptVersionDTO = (TessellScriptVersionDTO) o;
    return Objects.equals(this.scriptId, tessellScriptVersionDTO.scriptId) &&
        Objects.equals(this.name, tessellScriptVersionDTO.name) &&
        Objects.equals(this.internalVersion, tessellScriptVersionDTO.internalVersion) &&
        Objects.equals(this.fileName, tessellScriptVersionDTO.fileName) &&
        Objects.equals(this.fileType, tessellScriptVersionDTO.fileType) &&
        Objects.equals(this.status, tessellScriptVersionDTO.status) &&
        Objects.equals(this.maturityStatus, tessellScriptVersionDTO.maturityStatus) &&
        Objects.equals(this.locationInfo, tessellScriptVersionDTO.locationInfo) &&
        Objects.equals(this.metadata, tessellScriptVersionDTO.metadata) &&
        Objects.equals(this.driverInfo, tessellScriptVersionDTO.driverInfo) &&
        Arrays.equals(this.blob, tessellScriptVersionDTO.blob) &&
        Objects.equals(this.dateCreated, tessellScriptVersionDTO.dateCreated) &&
        Objects.equals(this.dateModified, tessellScriptVersionDTO.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scriptId, name, internalVersion, fileName, fileType, status, maturityStatus, locationInfo, metadata, driverInfo, Arrays.hashCode(blob), dateCreated, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellScriptVersionDTO {\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    internalVersion: ").append(toIndentedString(internalVersion)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    maturityStatus: ").append(toIndentedString(maturityStatus)).append("\n");
    sb.append("    locationInfo: ").append(toIndentedString(locationInfo)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    driverInfo: ").append(toIndentedString(driverInfo)).append("\n");
    sb.append("    blob: ").append(toIndentedString(blob)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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
