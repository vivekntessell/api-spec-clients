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


package com.tessell.secretstore.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.secretstore.client.model.SecretEncryptionKeyStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is the mapping of kms keys to be used for a given cloud location to encrypt the secrets in that cloud location
 */
@ApiModel(description = "This is the mapping of kms keys to be used for a given cloud location to encrypt the secrets in that cloud location")
@JsonPropertyOrder({
  SecretEncryptionEntity.JSON_PROPERTY_ID,
  SecretEncryptionEntity.JSON_PROPERTY_TENANT_ID,
  SecretEncryptionEntity.JSON_PROPERTY_CLOUD_ACCOUNT_ID,
  SecretEncryptionEntity.JSON_PROPERTY_REGION,
  SecretEncryptionEntity.JSON_PROPERTY_KEY_EXTERNAL_I_D,
  SecretEncryptionEntity.JSON_PROPERTY_DATE_CREATED,
  SecretEncryptionEntity.JSON_PROPERTY_DATE_MODIFIED,
  SecretEncryptionEntity.JSON_PROPERTY_STATUS
})
@JsonTypeName("SecretEncryptionEntity")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T23:17:31.013725+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SecretEncryptionEntity {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private String tenantId;

  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_ID = "cloudAccountId";
  private UUID cloudAccountId;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_KEY_EXTERNAL_I_D = "keyExternalID";
  private String keyExternalID;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private OffsetDateTime dateModified;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SecretEncryptionKeyStatus status;


  public SecretEncryptionEntity id(UUID id) {
    
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


  public SecretEncryptionEntity tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Tenant ID
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "Tenant ID")
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


  public SecretEncryptionEntity cloudAccountId(UUID cloudAccountId) {
    
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * cloudAccountId
   * @return cloudAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "cloudAccountId")
  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCloudAccountId() {
    return cloudAccountId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAccountId(UUID cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }


  public SecretEncryptionEntity region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "us-east-1", value = "region")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  public SecretEncryptionEntity keyExternalID(String keyExternalID) {
    
    this.keyExternalID = keyExternalID;
    return this;
  }

   /**
   * keyExternalID
   * @return keyExternalID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "arn:aws:kms:ap-south-1:548045437132:key/mrk-515b486e4b90453e87a886dfc7199be0", value = "keyExternalID")
  @JsonProperty(JSON_PROPERTY_KEY_EXTERNAL_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeyExternalID() {
    return keyExternalID;
  }


  @JsonProperty(JSON_PROPERTY_KEY_EXTERNAL_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyExternalID(String keyExternalID) {
    this.keyExternalID = keyExternalID;
  }


  public SecretEncryptionEntity dateCreated(OffsetDateTime dateCreated) {
    
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


  public SecretEncryptionEntity dateModified(OffsetDateTime dateModified) {
    
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


  public SecretEncryptionEntity status(SecretEncryptionKeyStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the secret encryption key ID
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the secret encryption key ID")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecretEncryptionKeyStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(SecretEncryptionKeyStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretEncryptionEntity secretEncryptionEntity = (SecretEncryptionEntity) o;
    return Objects.equals(this.id, secretEncryptionEntity.id) &&
        Objects.equals(this.tenantId, secretEncryptionEntity.tenantId) &&
        Objects.equals(this.cloudAccountId, secretEncryptionEntity.cloudAccountId) &&
        Objects.equals(this.region, secretEncryptionEntity.region) &&
        Objects.equals(this.keyExternalID, secretEncryptionEntity.keyExternalID) &&
        Objects.equals(this.dateCreated, secretEncryptionEntity.dateCreated) &&
        Objects.equals(this.dateModified, secretEncryptionEntity.dateModified) &&
        Objects.equals(this.status, secretEncryptionEntity.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, cloudAccountId, region, keyExternalID, dateCreated, dateModified, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretEncryptionEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    keyExternalID: ").append(toIndentedString(keyExternalID)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

