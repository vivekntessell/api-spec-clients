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
import com.tessell.security.client.model.TessellPasswordPolicyDTODTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell password Policies
 */
@ApiModel(description = "This is a definition for Tessell password Policies")
@JsonPropertyOrder({
  TessellPasswordPolicyEntityDTO.JSON_PROPERTY_DATE_CREATED,
  TessellPasswordPolicyEntityDTO.JSON_PROPERTY_DATE_MODIFIED,
  TessellPasswordPolicyEntityDTO.JSON_PROPERTY_TENANT_ID,
  TessellPasswordPolicyEntityDTO.JSON_PROPERTY_PASSWORD_POLICY
})
@JsonTypeName("PasswordPolicyEntity")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellPasswordPolicyEntityDTO {
  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private OffsetDateTime dateModified;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private UUID tenantId;

  public static final String JSON_PROPERTY_PASSWORD_POLICY = "passwordPolicy";
  private TessellPasswordPolicyDTODTO passwordPolicy;


  public TessellPasswordPolicyEntityDTO dateCreated(OffsetDateTime dateCreated) {
    
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


  public TessellPasswordPolicyEntityDTO dateModified(OffsetDateTime dateModified) {
    
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


  public TessellPasswordPolicyEntityDTO tenantId(UUID tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * assigned UUID for the entity
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "assigned UUID for the entity")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }


  public TessellPasswordPolicyEntityDTO passwordPolicy(TessellPasswordPolicyDTODTO passwordPolicy) {
    
    this.passwordPolicy = passwordPolicy;
    return this;
  }

   /**
   * Get passwordPolicy
   * @return passwordPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PASSWORD_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellPasswordPolicyDTODTO getPasswordPolicy() {
    return passwordPolicy;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPasswordPolicy(TessellPasswordPolicyDTODTO passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellPasswordPolicyEntityDTO passwordPolicyEntity = (TessellPasswordPolicyEntityDTO) o;
    return Objects.equals(this.dateCreated, passwordPolicyEntity.dateCreated) &&
        Objects.equals(this.dateModified, passwordPolicyEntity.dateModified) &&
        Objects.equals(this.tenantId, passwordPolicyEntity.tenantId) &&
        Objects.equals(this.passwordPolicy, passwordPolicyEntity.passwordPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCreated, dateModified, tenantId, passwordPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellPasswordPolicyEntityDTO {\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    passwordPolicy: ").append(toIndentedString(passwordPolicy)).append("\n");
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

