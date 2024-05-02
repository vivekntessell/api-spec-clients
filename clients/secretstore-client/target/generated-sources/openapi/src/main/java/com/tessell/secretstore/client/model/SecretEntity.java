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
import com.tessell.secretstore.client.model.CloudType;
import com.tessell.secretstore.client.model.SecretAvailabilityEntity;
import com.tessell.secretstore.client.model.SecretType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Secrets in Tessell
 */
@ApiModel(description = "This is a definition for Secrets in Tessell")
@JsonPropertyOrder({
  SecretEntity.JSON_PROPERTY_ID,
  SecretEntity.JSON_PROPERTY_TENANT_ID,
  SecretEntity.JSON_PROPERTY_GROUP_ID,
  SecretEntity.JSON_PROPERTY_KEY_NAME,
  SecretEntity.JSON_PROPERTY_CLOUD_TYPE,
  SecretEntity.JSON_PROPERTY_SUBSCRIPTION_ID,
  SecretEntity.JSON_PROPERTY_CLOUD_ACCOUNT_ID,
  SecretEntity.JSON_PROPERTY_PRIMARY_AVAILABILITY_EXTERNAL_ID,
  SecretEntity.JSON_PROPERTY_SECRET_TYPE,
  SecretEntity.JSON_PROPERTY_REGION_AVAILABILITY,
  SecretEntity.JSON_PROPERTY_DATE_CREATED,
  SecretEntity.JSON_PROPERTY_DATE_MODIFIED
})
@JsonTypeName("SecretEntity")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T23:17:31.013725+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SecretEntity {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private String tenantId;

  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private String groupId;

  public static final String JSON_PROPERTY_KEY_NAME = "keyName";
  private String keyName;

  public static final String JSON_PROPERTY_CLOUD_TYPE = "cloudType";
  private CloudType cloudType;

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private UUID subscriptionId;

  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_ID = "cloudAccountId";
  private UUID cloudAccountId;

  public static final String JSON_PROPERTY_PRIMARY_AVAILABILITY_EXTERNAL_ID = "primaryAvailabilityExternalId";
  private String primaryAvailabilityExternalId;

  public static final String JSON_PROPERTY_SECRET_TYPE = "secretType";
  private SecretType secretType;

  public static final String JSON_PROPERTY_REGION_AVAILABILITY = "regionAvailability";
  private List<SecretAvailabilityEntity> regionAvailability = null;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private OffsetDateTime dateModified;


  public SecretEntity id(UUID id) {
    
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


  public SecretEntity tenantId(String tenantId) {
    
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


  public SecretEntity groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Group ID, grouping the secrets
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "Group ID, grouping the secrets")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public SecretEntity keyName(String keyName) {
    
    this.keyName = keyName;
    return this;
  }

   /**
   * Key Name
   * @return keyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "masterPassword", value = "Key Name")
  @JsonProperty(JSON_PROPERTY_KEY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeyName() {
    return keyName;
  }


  @JsonProperty(JSON_PROPERTY_KEY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }


  public SecretEntity cloudType(CloudType cloudType) {
    
    this.cloudType = cloudType;
    return this;
  }

   /**
   * Cloud
   * @return cloudType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cloud")
  @JsonProperty(JSON_PROPERTY_CLOUD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CloudType getCloudType() {
    return cloudType;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudType(CloudType cloudType) {
    this.cloudType = cloudType;
  }


  public SecretEntity subscriptionId(UUID subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * subscriptionId
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "subscriptionId")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSubscriptionId() {
    return subscriptionId;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public SecretEntity cloudAccountId(UUID cloudAccountId) {
    
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


  public SecretEntity primaryAvailabilityExternalId(String primaryAvailabilityExternalId) {
    
    this.primaryAvailabilityExternalId = primaryAvailabilityExternalId;
    return this;
  }

   /**
   * primaryAvailabilityExternalId
   * @return primaryAvailabilityExternalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "arn:aws:secretsmanager:ap-south-1:213776060323:secret:DB-CRED_9d79e1f8-1bk3-4b79-8580-e935ea3b8ca3-e9KLch", value = "primaryAvailabilityExternalId")
  @JsonProperty(JSON_PROPERTY_PRIMARY_AVAILABILITY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimaryAvailabilityExternalId() {
    return primaryAvailabilityExternalId;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_AVAILABILITY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryAvailabilityExternalId(String primaryAvailabilityExternalId) {
    this.primaryAvailabilityExternalId = primaryAvailabilityExternalId;
  }


  public SecretEntity secretType(SecretType secretType) {
    
    this.secretType = secretType;
    return this;
  }

   /**
   * Type of the secret
   * @return secretType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of the secret")
  @JsonProperty(JSON_PROPERTY_SECRET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecretType getSecretType() {
    return secretType;
  }


  @JsonProperty(JSON_PROPERTY_SECRET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecretType(SecretType secretType) {
    this.secretType = secretType;
  }


  public SecretEntity regionAvailability(List<SecretAvailabilityEntity> regionAvailability) {
    
    this.regionAvailability = regionAvailability;
    return this;
  }

  public SecretEntity addRegionAvailabilityItem(SecretAvailabilityEntity regionAvailabilityItem) {
    if (this.regionAvailability == null) {
      this.regionAvailability = new ArrayList<>();
    }
    this.regionAvailability.add(regionAvailabilityItem);
    return this;
  }

   /**
   * Cloud and Location detail
   * @return regionAvailability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cloud and Location detail")
  @JsonProperty(JSON_PROPERTY_REGION_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SecretAvailabilityEntity> getRegionAvailability() {
    return regionAvailability;
  }


  @JsonProperty(JSON_PROPERTY_REGION_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegionAvailability(List<SecretAvailabilityEntity> regionAvailability) {
    this.regionAvailability = regionAvailability;
  }


  public SecretEntity dateCreated(OffsetDateTime dateCreated) {
    
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


  public SecretEntity dateModified(OffsetDateTime dateModified) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretEntity secretEntity = (SecretEntity) o;
    return Objects.equals(this.id, secretEntity.id) &&
        Objects.equals(this.tenantId, secretEntity.tenantId) &&
        Objects.equals(this.groupId, secretEntity.groupId) &&
        Objects.equals(this.keyName, secretEntity.keyName) &&
        Objects.equals(this.cloudType, secretEntity.cloudType) &&
        Objects.equals(this.subscriptionId, secretEntity.subscriptionId) &&
        Objects.equals(this.cloudAccountId, secretEntity.cloudAccountId) &&
        Objects.equals(this.primaryAvailabilityExternalId, secretEntity.primaryAvailabilityExternalId) &&
        Objects.equals(this.secretType, secretEntity.secretType) &&
        Objects.equals(this.regionAvailability, secretEntity.regionAvailability) &&
        Objects.equals(this.dateCreated, secretEntity.dateCreated) &&
        Objects.equals(this.dateModified, secretEntity.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, groupId, keyName, cloudType, subscriptionId, cloudAccountId, primaryAvailabilityExternalId, secretType, regionAvailability, dateCreated, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    primaryAvailabilityExternalId: ").append(toIndentedString(primaryAvailabilityExternalId)).append("\n");
    sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
    sb.append("    regionAvailability: ").append(toIndentedString(regionAvailability)).append("\n");
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

