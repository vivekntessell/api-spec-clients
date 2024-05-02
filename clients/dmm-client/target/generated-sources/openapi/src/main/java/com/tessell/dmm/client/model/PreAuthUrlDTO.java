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
import com.tessell.dmm.client.model.ExpiryConfig;
import com.tessell.dmm.client.model.PreAuthUrlMetadata;
import com.tessell.dmm.client.model.PreAuthUrlStatusOps;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell Pre auth url Object
 */
@ApiModel(description = "This is a definition for Tessell Pre auth url Object")
@JsonPropertyOrder({
  PreAuthUrlDTO.JSON_PROPERTY_ID,
  PreAuthUrlDTO.JSON_PROPERTY_NATIVE_BACKUP_ID,
  PreAuthUrlDTO.JSON_PROPERTY_DMM_ID,
  PreAuthUrlDTO.JSON_PROPERTY_SOURCE_BACKUP_IDENTIFIER,
  PreAuthUrlDTO.JSON_PROPERTY_USER,
  PreAuthUrlDTO.JSON_PROPERTY_PRE_AUTH_URL,
  PreAuthUrlDTO.JSON_PROPERTY_STATUS,
  PreAuthUrlDTO.JSON_PROPERTY_CREATED_AT,
  PreAuthUrlDTO.JSON_PROPERTY_EXPIRY_CONFIG,
  PreAuthUrlDTO.JSON_PROPERTY_DATE_CREATED,
  PreAuthUrlDTO.JSON_PROPERTY_DATE_MODIFIED,
  PreAuthUrlDTO.JSON_PROPERTY_METADATA
})
@JsonTypeName("PreAuthUrlDTO")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PreAuthUrlDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id = null;

  public static final String JSON_PROPERTY_NATIVE_BACKUP_ID = "nativeBackupId";
  private UUID nativeBackupId = null;

  public static final String JSON_PROPERTY_DMM_ID = "dmmId";
  private UUID dmmId = null;

  public static final String JSON_PROPERTY_SOURCE_BACKUP_IDENTIFIER = "sourceBackupIdentifier";
  private UUID sourceBackupIdentifier = null;

  public static final String JSON_PROPERTY_USER = "user";
  private String user;

  public static final String JSON_PROPERTY_PRE_AUTH_URL = "preAuthUrl";
  private String preAuthUrl;

  public static final String JSON_PROPERTY_STATUS = "status";
  private PreAuthUrlStatusOps status;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private Date createdAt;

  public static final String JSON_PROPERTY_EXPIRY_CONFIG = "expiryConfig";
  private ExpiryConfig expiryConfig;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private Date dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private Date dateModified;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private PreAuthUrlMetadata metadata;


  public PreAuthUrlDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Tessell generated UUID for the url
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "Tessell generated UUID for the url")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public PreAuthUrlDTO nativeBackupId(UUID nativeBackupId) {
    
    this.nativeBackupId = nativeBackupId;
    return this;
  }

   /**
   * Native backup uuid
   * @return nativeBackupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "Native backup uuid")
  @JsonProperty(JSON_PROPERTY_NATIVE_BACKUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getNativeBackupId() {
    return nativeBackupId;
  }


  @JsonProperty(JSON_PROPERTY_NATIVE_BACKUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNativeBackupId(UUID nativeBackupId) {
    this.nativeBackupId = nativeBackupId;
  }


  public PreAuthUrlDTO dmmId(UUID dmmId) {
    
    this.dmmId = dmmId;
    return this;
  }

   /**
   * ID of the Availability Machine of the url
   * @return dmmId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "ID of the Availability Machine of the url")
  @JsonProperty(JSON_PROPERTY_DMM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getDmmId() {
    return dmmId;
  }


  @JsonProperty(JSON_PROPERTY_DMM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDmmId(UUID dmmId) {
    this.dmmId = dmmId;
  }


  public PreAuthUrlDTO sourceBackupIdentifier(UUID sourceBackupIdentifier) {
    
    this.sourceBackupIdentifier = sourceBackupIdentifier;
    return this;
  }

   /**
   * source backup id
   * @return sourceBackupIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "source backup id")
  @JsonProperty(JSON_PROPERTY_SOURCE_BACKUP_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSourceBackupIdentifier() {
    return sourceBackupIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_BACKUP_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceBackupIdentifier(UUID sourceBackupIdentifier) {
    this.sourceBackupIdentifier = sourceBackupIdentifier;
  }


  public PreAuthUrlDTO user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * email of the user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "email of the user")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(String user) {
    this.user = user;
  }


  public PreAuthUrlDTO preAuthUrl(String preAuthUrl) {
    
    this.preAuthUrl = preAuthUrl;
    return this;
  }

   /**
   * pre auth url
   * @return preAuthUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "pre auth url")
  @JsonProperty(JSON_PROPERTY_PRE_AUTH_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreAuthUrl() {
    return preAuthUrl;
  }


  @JsonProperty(JSON_PROPERTY_PRE_AUTH_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreAuthUrl(String preAuthUrl) {
    this.preAuthUrl = preAuthUrl;
  }


  public PreAuthUrlDTO status(PreAuthUrlStatusOps status) {
    
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

  public PreAuthUrlStatusOps getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(PreAuthUrlStatusOps status) {
    this.status = status;
  }


  public PreAuthUrlDTO createdAt(Date createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * time of request of preauth url
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "time of request of preauth url")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  public PreAuthUrlDTO expiryConfig(ExpiryConfig expiryConfig) {
    
    this.expiryConfig = expiryConfig;
    return this;
  }

   /**
   * Get expiryConfig
   * @return expiryConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPIRY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExpiryConfig getExpiryConfig() {
    return expiryConfig;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryConfig(ExpiryConfig expiryConfig) {
    this.expiryConfig = expiryConfig;
  }


  public PreAuthUrlDTO dateCreated(Date dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * time of creation
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "time of creation")
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


  public PreAuthUrlDTO dateModified(Date dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * time of modification
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "time of modification")
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


  public PreAuthUrlDTO metadata(PreAuthUrlMetadata metadata) {
    
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

  public PreAuthUrlMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(PreAuthUrlMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreAuthUrlDTO preAuthUrlDTO = (PreAuthUrlDTO) o;
    return Objects.equals(this.id, preAuthUrlDTO.id) &&
        Objects.equals(this.nativeBackupId, preAuthUrlDTO.nativeBackupId) &&
        Objects.equals(this.dmmId, preAuthUrlDTO.dmmId) &&
        Objects.equals(this.sourceBackupIdentifier, preAuthUrlDTO.sourceBackupIdentifier) &&
        Objects.equals(this.user, preAuthUrlDTO.user) &&
        Objects.equals(this.preAuthUrl, preAuthUrlDTO.preAuthUrl) &&
        Objects.equals(this.status, preAuthUrlDTO.status) &&
        Objects.equals(this.createdAt, preAuthUrlDTO.createdAt) &&
        Objects.equals(this.expiryConfig, preAuthUrlDTO.expiryConfig) &&
        Objects.equals(this.dateCreated, preAuthUrlDTO.dateCreated) &&
        Objects.equals(this.dateModified, preAuthUrlDTO.dateModified) &&
        Objects.equals(this.metadata, preAuthUrlDTO.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nativeBackupId, dmmId, sourceBackupIdentifier, user, preAuthUrl, status, createdAt, expiryConfig, dateCreated, dateModified, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreAuthUrlDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nativeBackupId: ").append(toIndentedString(nativeBackupId)).append("\n");
    sb.append("    dmmId: ").append(toIndentedString(dmmId)).append("\n");
    sb.append("    sourceBackupIdentifier: ").append(toIndentedString(sourceBackupIdentifier)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    preAuthUrl: ").append(toIndentedString(preAuthUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expiryConfig: ").append(toIndentedString(expiryConfig)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

