/*
 * REST API Documentation
 * REST API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.gov.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.gov.client.model.TessellBaseEntityDTO;
import com.tessell.gov.client.model.TessellCloudAccount1DTO;
import com.tessell.gov.client.model.TessellCloudAccountStatusDTO;
import com.tessell.gov.client.model.TessellCloudAccountTypeDTO;
import com.tessell.gov.client.model.TessellManagedTypeDTO;
import com.tessell.gov.client.model.TessellParameterDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Cloud Accounts in Tessell
 */
@ApiModel(description = "This is a definition for Cloud Accounts in Tessell")
@JsonPropertyOrder({
  TessellCloudAccountDTO.JSON_PROPERTY_DATE_CREATED,
  TessellCloudAccountDTO.JSON_PROPERTY_DATE_MODIFIED,
  TessellCloudAccountDTO.JSON_PROPERTY_ID,
  TessellCloudAccountDTO.JSON_PROPERTY_SECRET,
  TessellCloudAccountDTO.JSON_PROPERTY_SECRET_A_R_N,
  TessellCloudAccountDTO.JSON_PROPERTY_ACCOUNT_ID,
  TessellCloudAccountDTO.JSON_PROPERTY_CLOUD_ACCOUNT_TYPE,
  TessellCloudAccountDTO.JSON_PROPERTY_CLOUD_LOCATION_ID,
  TessellCloudAccountDTO.JSON_PROPERTY_DESCRIPTION,
  TessellCloudAccountDTO.JSON_PROPERTY_NAME,
  TessellCloudAccountDTO.JSON_PROPERTY_MANAGED_TYPE,
  TessellCloudAccountDTO.JSON_PROPERTY_STATUS
})
@JsonTypeName("CloudAccount")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.675868+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellCloudAccountDTO {
  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private Date dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private Date dateModified;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_SECRET = "secret";
  private Map<String, TessellParameterDTO> secret = null;

  public static final String JSON_PROPERTY_SECRET_A_R_N = "secretARN";
  private String secretARN;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_TYPE = "cloudAccountType";
  private TessellCloudAccountTypeDTO cloudAccountType;

  public static final String JSON_PROPERTY_CLOUD_LOCATION_ID = "cloudLocationId";
  private String cloudLocationId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_MANAGED_TYPE = "managedType";
  private TessellManagedTypeDTO managedType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellCloudAccountStatusDTO status;


  public TessellCloudAccountDTO dateCreated(Date dateCreated) {
    
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


  public TessellCloudAccountDTO dateModified(Date dateModified) {
    
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

  public Date getDateModified() {
    return dateModified;
  }


  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  public TessellCloudAccountDTO id(UUID id) {
    
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


  public TessellCloudAccountDTO secret(Map<String, TessellParameterDTO> secret) {
    
    this.secret = secret;
    return this;
  }

  public TessellCloudAccountDTO putSecretItem(String key, TessellParameterDTO secretItem) {
    if (this.secret == null) {
      this.secret = new HashMap<>();
    }
    this.secret.put(key, secretItem);
    return this;
  }

   /**
   * Cloud Login Secrets
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cloud Login Secrets")
  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, TessellParameterDTO> getSecret() {
    return secret;
  }


  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecret(Map<String, TessellParameterDTO> secret) {
    this.secret = secret;
  }


  public TessellCloudAccountDTO secretARN(String secretARN) {
    
    this.secretARN = secretARN;
    return this;
  }

   /**
   * Secret identifier
   * @return secretARN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secret identifier")
  @JsonProperty(JSON_PROPERTY_SECRET_A_R_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecretARN() {
    return secretARN;
  }


  @JsonProperty(JSON_PROPERTY_SECRET_A_R_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecretARN(String secretARN) {
    this.secretARN = secretARN;
  }


  public TessellCloudAccountDTO accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Account ID
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567890", value = "Account ID")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public TessellCloudAccountDTO cloudAccountType(TessellCloudAccountTypeDTO cloudAccountType) {
    
    this.cloudAccountType = cloudAccountType;
    return this;
  }

   /**
   * Get cloudAccountType
   * @return cloudAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellCloudAccountTypeDTO getCloudAccountType() {
    return cloudAccountType;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAccountType(TessellCloudAccountTypeDTO cloudAccountType) {
    this.cloudAccountType = cloudAccountType;
  }


  public TessellCloudAccountDTO cloudLocationId(String cloudLocationId) {
    
    this.cloudLocationId = cloudLocationId;
    return this;
  }

   /**
   * ID of the cloud location where this account belongs
   * @return cloudLocationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aws", value = "ID of the cloud location where this account belongs")
  @JsonProperty(JSON_PROPERTY_CLOUD_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudLocationId() {
    return cloudLocationId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudLocationId(String cloudLocationId) {
    this.cloudLocationId = cloudLocationId;
  }


  public TessellCloudAccountDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Production Account", value = "Description")
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


  public TessellCloudAccountDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the entity
   * @return name
  **/
  @ApiModelProperty(example = "sample-entity", required = true, value = "Name of the entity")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public TessellCloudAccountDTO managedType(TessellManagedTypeDTO managedType) {
    
    this.managedType = managedType;
    return this;
  }

   /**
   * Get managedType
   * @return managedType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MANAGED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellManagedTypeDTO getManagedType() {
    return managedType;
  }


  @JsonProperty(JSON_PROPERTY_MANAGED_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManagedType(TessellManagedTypeDTO managedType) {
    this.managedType = managedType;
  }


  public TessellCloudAccountDTO status(TessellCloudAccountStatusDTO status) {
    
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

  public TessellCloudAccountStatusDTO getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TessellCloudAccountStatusDTO status) {
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
    TessellCloudAccountDTO cloudAccount = (TessellCloudAccountDTO) o;
    return Objects.equals(this.dateCreated, cloudAccount.dateCreated) &&
        Objects.equals(this.dateModified, cloudAccount.dateModified) &&
        Objects.equals(this.id, cloudAccount.id) &&
        Objects.equals(this.secret, cloudAccount.secret) &&
        Objects.equals(this.secretARN, cloudAccount.secretARN) &&
        Objects.equals(this.accountId, cloudAccount.accountId) &&
        Objects.equals(this.cloudAccountType, cloudAccount.cloudAccountType) &&
        Objects.equals(this.cloudLocationId, cloudAccount.cloudLocationId) &&
        Objects.equals(this.description, cloudAccount.description) &&
        Objects.equals(this.name, cloudAccount.name) &&
        Objects.equals(this.managedType, cloudAccount.managedType) &&
        Objects.equals(this.status, cloudAccount.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCreated, dateModified, id, secret, secretARN, accountId, cloudAccountType, cloudLocationId, description, name, managedType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellCloudAccountDTO {\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    secretARN: ").append(toIndentedString(secretARN)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    cloudAccountType: ").append(toIndentedString(cloudAccountType)).append("\n");
    sb.append("    cloudLocationId: ").append(toIndentedString(cloudLocationId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    managedType: ").append(toIndentedString(managedType)).append("\n");
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

