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
import com.tessell.secretstore.client.model.SecretAvailabilityStatus;
import com.tessell.secretstore.client.model.SecretEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Secrets Availability in Tessell
 */
@ApiModel(description = "This is a definition for Secrets Availability in Tessell")
@JsonPropertyOrder({
  SecretAvailabilityEntity.JSON_PROPERTY_ID,
  SecretAvailabilityEntity.JSON_PROPERTY_SECRET,
  SecretAvailabilityEntity.JSON_PROPERTY_CLOUD_LOCATION,
  SecretAvailabilityEntity.JSON_PROPERTY_CLOUD_ACCOUNT_ID,
  SecretAvailabilityEntity.JSON_PROPERTY_EXTERNAL_ID,
  SecretAvailabilityEntity.JSON_PROPERTY_SECRET_ENCRYPTION_KEY_ID,
  SecretAvailabilityEntity.JSON_PROPERTY_STATUS
})
@JsonTypeName("SecretAvailabilityEntity")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T23:17:31.013725+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SecretAvailabilityEntity {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_SECRET = "secret";
  private SecretEntity secret;

  public static final String JSON_PROPERTY_CLOUD_LOCATION = "cloudLocation";
  private String cloudLocation;

  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_ID = "cloudAccountId";
  private UUID cloudAccountId;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_SECRET_ENCRYPTION_KEY_ID = "secretEncryptionKeyId";
  private UUID secretEncryptionKeyId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SecretAvailabilityStatus status;


  public SecretAvailabilityEntity id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public SecretAvailabilityEntity secret(SecretEntity secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecretEntity getSecret() {
    return secret;
  }


  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecret(SecretEntity secret) {
    this.secret = secret;
  }


  public SecretAvailabilityEntity cloudLocation(String cloudLocation) {
    
    this.cloudLocation = cloudLocation;
    return this;
  }

   /**
   * Cloud location of the secret
   * @return cloudLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cloud location of the secret")
  @JsonProperty(JSON_PROPERTY_CLOUD_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudLocation() {
    return cloudLocation;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudLocation(String cloudLocation) {
    this.cloudLocation = cloudLocation;
  }


  public SecretAvailabilityEntity cloudAccountId(UUID cloudAccountId) {
    
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


  public SecretAvailabilityEntity externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * External Id of the Secret
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "arn:aws:secretsmanager:ap-south-1:213776060323:secret:DB-CRED_9d79e1f8-1bk3-4b79-8580-e935ea3b8ca3-e9KLch", value = "External Id of the Secret")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public SecretAvailabilityEntity secretEncryptionKeyId(UUID secretEncryptionKeyId) {
    
    this.secretEncryptionKeyId = secretEncryptionKeyId;
    return this;
  }

   /**
   * Id of the Secret Encryption Key used
   * @return secretEncryptionKeyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "Id of the Secret Encryption Key used")
  @JsonProperty(JSON_PROPERTY_SECRET_ENCRYPTION_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSecretEncryptionKeyId() {
    return secretEncryptionKeyId;
  }


  @JsonProperty(JSON_PROPERTY_SECRET_ENCRYPTION_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecretEncryptionKeyId(UUID secretEncryptionKeyId) {
    this.secretEncryptionKeyId = secretEncryptionKeyId;
  }


  public SecretAvailabilityEntity status(SecretAvailabilityStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the secret availability
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the secret availability")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecretAvailabilityStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(SecretAvailabilityStatus status) {
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
    SecretAvailabilityEntity secretAvailabilityEntity = (SecretAvailabilityEntity) o;
    return Objects.equals(this.id, secretAvailabilityEntity.id) &&
        Objects.equals(this.secret, secretAvailabilityEntity.secret) &&
        Objects.equals(this.cloudLocation, secretAvailabilityEntity.cloudLocation) &&
        Objects.equals(this.cloudAccountId, secretAvailabilityEntity.cloudAccountId) &&
        Objects.equals(this.externalId, secretAvailabilityEntity.externalId) &&
        Objects.equals(this.secretEncryptionKeyId, secretAvailabilityEntity.secretEncryptionKeyId) &&
        Objects.equals(this.status, secretAvailabilityEntity.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, secret, cloudLocation, cloudAccountId, externalId, secretEncryptionKeyId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretAvailabilityEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    cloudLocation: ").append(toIndentedString(cloudLocation)).append("\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    secretEncryptionKeyId: ").append(toIndentedString(secretEncryptionKeyId)).append("\n");
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
