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


package com.tessell.iam.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.iam.client.model.TessellApiKeyStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell API key DTO object
 */
@ApiModel(description = "This is a definition for Tessell API key DTO object")
@JsonPropertyOrder({
  TessellApiKeyEntity.JSON_PROPERTY_ID,
  TessellApiKeyEntity.JSON_PROPERTY_DATE_CREATED,
  TessellApiKeyEntity.JSON_PROPERTY_DATE_LAST_USED,
  TessellApiKeyEntity.JSON_PROPERTY_DATE_EXPIRY,
  TessellApiKeyEntity.JSON_PROPERTY_API_KEY,
  TessellApiKeyEntity.JSON_PROPERTY_DESCRIPTION,
  TessellApiKeyEntity.JSON_PROPERTY_LABEL,
  TessellApiKeyEntity.JSON_PROPERTY_EMAIL_ID,
  TessellApiKeyEntity.JSON_PROPERTY_TENANT_ID,
  TessellApiKeyEntity.JSON_PROPERTY_NEVER_EXPIRE,
  TessellApiKeyEntity.JSON_PROPERTY_STATUS
})
@JsonTypeName("ApiKeyEntity")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:35.244225+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellApiKeyEntity {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private Date dateCreated;

  public static final String JSON_PROPERTY_DATE_LAST_USED = "dateLastUsed";
  private Date dateLastUsed;

  public static final String JSON_PROPERTY_DATE_EXPIRY = "dateExpiry";
  private Date dateExpiry;

  public static final String JSON_PROPERTY_API_KEY = "api-key";
  private String apiKey;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_EMAIL_ID = "emailId";
  private String emailId;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private String tenantId;

  public static final String JSON_PROPERTY_NEVER_EXPIRE = "neverExpire";
  private Boolean neverExpire;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellApiKeyStatus status;


  public TessellApiKeyEntity id(UUID id) {
    
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


  public TessellApiKeyEntity dateCreated(Date dateCreated) {
    
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

  public Date getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  public TessellApiKeyEntity dateLastUsed(Date dateLastUsed) {
    
    this.dateLastUsed = dateLastUsed;
    return this;
  }

   /**
   * Timestamp when the API key was last used
   * @return dateLastUsed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the API key was last used")
  @JsonProperty(JSON_PROPERTY_DATE_LAST_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDateLastUsed() {
    return dateLastUsed;
  }


  @JsonProperty(JSON_PROPERTY_DATE_LAST_USED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateLastUsed(Date dateLastUsed) {
    this.dateLastUsed = dateLastUsed;
  }


  public TessellApiKeyEntity dateExpiry(Date dateExpiry) {
    
    this.dateExpiry = dateExpiry;
    return this;
  }

   /**
   * Timestamp when the API key expires
   * @return dateExpiry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the API key expires")
  @JsonProperty(JSON_PROPERTY_DATE_EXPIRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDateExpiry() {
    return dateExpiry;
  }


  @JsonProperty(JSON_PROPERTY_DATE_EXPIRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateExpiry(Date dateExpiry) {
    this.dateExpiry = dateExpiry;
  }


  public TessellApiKeyEntity apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Hashed value of API key
   * @return apiKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hashed value of API key")
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApiKey() {
    return apiKey;
  }


  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  public TessellApiKeyEntity description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the API key
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the API key")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public TessellApiKeyEntity label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * label of the api key
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "label of the api key")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  public TessellApiKeyEntity emailId(String emailId) {
    
    this.emailId = emailId;
    return this;
  }

   /**
   * Emil id the key belongs to
   * @return emailId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Emil id the key belongs to")
  @JsonProperty(JSON_PROPERTY_EMAIL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailId() {
    return emailId;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }


  public TessellApiKeyEntity tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * tenant id the key belongs to
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "tenant id the key belongs to")
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


  public TessellApiKeyEntity neverExpire(Boolean neverExpire) {
    
    this.neverExpire = neverExpire;
    return this;
  }

   /**
   * never expire the key flag
   * @return neverExpire
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "never expire the key flag")
  @JsonProperty(JSON_PROPERTY_NEVER_EXPIRE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNeverExpire() {
    return neverExpire;
  }


  @JsonProperty(JSON_PROPERTY_NEVER_EXPIRE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNeverExpire(Boolean neverExpire) {
    this.neverExpire = neverExpire;
  }


  public TessellApiKeyEntity status(TessellApiKeyStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the role
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the role")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellApiKeyStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TessellApiKeyStatus status) {
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
    TessellApiKeyEntity apiKeyEntity = (TessellApiKeyEntity) o;
    return Objects.equals(this.id, apiKeyEntity.id) &&
        Objects.equals(this.dateCreated, apiKeyEntity.dateCreated) &&
        Objects.equals(this.dateLastUsed, apiKeyEntity.dateLastUsed) &&
        Objects.equals(this.dateExpiry, apiKeyEntity.dateExpiry) &&
        Objects.equals(this.apiKey, apiKeyEntity.apiKey) &&
        Objects.equals(this.description, apiKeyEntity.description) &&
        Objects.equals(this.label, apiKeyEntity.label) &&
        Objects.equals(this.emailId, apiKeyEntity.emailId) &&
        Objects.equals(this.tenantId, apiKeyEntity.tenantId) &&
        Objects.equals(this.neverExpire, apiKeyEntity.neverExpire) &&
        Objects.equals(this.status, apiKeyEntity.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateCreated, dateLastUsed, dateExpiry, apiKey, description, label, emailId, tenantId, neverExpire, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellApiKeyEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateLastUsed: ").append(toIndentedString(dateLastUsed)).append("\n");
    sb.append("    dateExpiry: ").append(toIndentedString(dateExpiry)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    neverExpire: ").append(toIndentedString(neverExpire)).append("\n");
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

