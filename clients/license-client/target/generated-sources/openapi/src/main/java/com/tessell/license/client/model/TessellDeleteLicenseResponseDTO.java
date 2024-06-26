/*
 * Tessell License Manager API Documentation
 * Tessell License Manager API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.license.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.license.client.model.TessellLicenseStatusDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * License Repositories Chronicle Response
 */
@ApiModel(description = "License Repositories Chronicle Response")
@JsonPropertyOrder({
  TessellDeleteLicenseResponseDTO.JSON_PROPERTY_LICENSE_ID,
  TessellDeleteLicenseResponseDTO.JSON_PROPERTY_LOCK_HASH,
  TessellDeleteLicenseResponseDTO.JSON_PROPERTY_STATUS
})
@JsonTypeName("deleteLicenseResponse")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:59.688756+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellDeleteLicenseResponseDTO {
  public static final String JSON_PROPERTY_LICENSE_ID = "licenseId";
  private UUID licenseId;

  public static final String JSON_PROPERTY_LOCK_HASH = "lockHash";
  private String lockHash;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellLicenseStatusDTO status;


  public TessellDeleteLicenseResponseDTO licenseId(UUID licenseId) {
    
    this.licenseId = licenseId;
    return this;
  }

   /**
   * Get licenseId
   * @return licenseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LICENSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getLicenseId() {
    return licenseId;
  }


  @JsonProperty(JSON_PROPERTY_LICENSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLicenseId(UUID licenseId) {
    this.licenseId = licenseId;
  }


  public TessellDeleteLicenseResponseDTO lockHash(String lockHash) {
    
    this.lockHash = lockHash;
    return this;
  }

   /**
   * Get lockHash
   * @return lockHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCK_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLockHash() {
    return lockHash;
  }


  @JsonProperty(JSON_PROPERTY_LOCK_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLockHash(String lockHash) {
    this.lockHash = lockHash;
  }


  public TessellDeleteLicenseResponseDTO status(TessellLicenseStatusDTO status) {
    
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

  public TessellLicenseStatusDTO getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TessellLicenseStatusDTO status) {
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
    TessellDeleteLicenseResponseDTO deleteLicenseResponse = (TessellDeleteLicenseResponseDTO) o;
    return Objects.equals(this.licenseId, deleteLicenseResponse.licenseId) &&
        Objects.equals(this.lockHash, deleteLicenseResponse.lockHash) &&
        Objects.equals(this.status, deleteLicenseResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseId, lockHash, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellDeleteLicenseResponseDTO {\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    lockHash: ").append(toIndentedString(lockHash)).append("\n");
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

