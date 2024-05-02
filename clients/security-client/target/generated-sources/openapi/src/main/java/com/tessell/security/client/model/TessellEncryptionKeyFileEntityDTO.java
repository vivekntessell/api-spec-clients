/*
 * Tessell REST API Documentation
 * Tessell REST API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.security.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.security.client.model.TessellEncryptionKeyFileStatusDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell encryption keys files
 */
@ApiModel(description = "This is a definition for Tessell encryption keys files")
@JsonPropertyOrder({
  TessellEncryptionKeyFileEntityDTO.JSON_PROPERTY_DATE_CREATED,
  TessellEncryptionKeyFileEntityDTO.JSON_PROPERTY_DATE_MODIFIED,
  TessellEncryptionKeyFileEntityDTO.JSON_PROPERTY_ID,
  TessellEncryptionKeyFileEntityDTO.JSON_PROPERTY_NAME,
  TessellEncryptionKeyFileEntityDTO.JSON_PROPERTY_TYPE,
  TessellEncryptionKeyFileEntityDTO.JSON_PROPERTY_BLOB,
  TessellEncryptionKeyFileEntityDTO.JSON_PROPERTY_PASSWORD,
  TessellEncryptionKeyFileEntityDTO.JSON_PROPERTY_STATUS,
  TessellEncryptionKeyFileEntityDTO.JSON_PROPERTY_TENANT_ID
})
@JsonTypeName("EncryptionKeyFileEntity")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellEncryptionKeyFileEntityDTO {
  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private OffsetDateTime dateModified;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_BLOB = "blob";
  private byte[] blob;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellEncryptionKeyFileStatusDTO status;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private String tenantId;


  public TessellEncryptionKeyFileEntityDTO dateCreated(OffsetDateTime dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Timestamp when the entity was created
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the entity was created")
  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public TessellEncryptionKeyFileEntityDTO dateModified(OffsetDateTime dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Timestamp when the entity was last modified
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the entity was last modified")
  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateModified() {
    return dateModified;
  }


  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }


  public TessellEncryptionKeyFileEntityDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * generated UUID for the entity
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "generated UUID for the entity")
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


  public TessellEncryptionKeyFileEntityDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name of the file
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "name of the file")
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


  public TessellEncryptionKeyFileEntityDTO type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * type of the file
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "type of the file")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public TessellEncryptionKeyFileEntityDTO blob(byte[] blob) {
    
    this.blob = blob;
    return this;
  }

   /**
   * File contents in binary.
   * @return blob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File contents in binary.")
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


  public TessellEncryptionKeyFileEntityDTO password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * optional password of the file
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "optional password of the file")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public TessellEncryptionKeyFileEntityDTO status(TessellEncryptionKeyFileStatusDTO status) {
    
    this.status = status;
    return this;
  }

   /**
   * Availability status of encryption key
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Availability status of encryption key")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellEncryptionKeyFileStatusDTO getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TessellEncryptionKeyFileStatusDTO status) {
    this.status = status;
  }


  public TessellEncryptionKeyFileEntityDTO tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * tenant id of the key
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "tenant id of the key")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellEncryptionKeyFileEntityDTO encryptionKeyFileEntity = (TessellEncryptionKeyFileEntityDTO) o;
    return Objects.equals(this.dateCreated, encryptionKeyFileEntity.dateCreated) &&
        Objects.equals(this.dateModified, encryptionKeyFileEntity.dateModified) &&
        Objects.equals(this.id, encryptionKeyFileEntity.id) &&
        Objects.equals(this.name, encryptionKeyFileEntity.name) &&
        Objects.equals(this.type, encryptionKeyFileEntity.type) &&
        Arrays.equals(this.blob, encryptionKeyFileEntity.blob) &&
        Objects.equals(this.password, encryptionKeyFileEntity.password) &&
        Objects.equals(this.status, encryptionKeyFileEntity.status) &&
        Objects.equals(this.tenantId, encryptionKeyFileEntity.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCreated, dateModified, id, name, type, Arrays.hashCode(blob), password, status, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellEncryptionKeyFileEntityDTO {\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    blob: ").append(toIndentedString(blob)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
