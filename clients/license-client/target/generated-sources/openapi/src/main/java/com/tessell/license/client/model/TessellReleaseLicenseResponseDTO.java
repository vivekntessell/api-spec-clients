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
import com.tessell.license.client.model.TessellLicenseReleaseObjectDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellReleaseLicenseResponseDTO
 */
@JsonPropertyOrder({
  TessellReleaseLicenseResponseDTO.JSON_PROPERTY_LICENSES,
  TessellReleaseLicenseResponseDTO.JSON_PROPERTY_LOCK_HASH,
  TessellReleaseLicenseResponseDTO.JSON_PROPERTY_STATUS
})
@JsonTypeName("releaseLicenseResponse")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:59.688756+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellReleaseLicenseResponseDTO {
  public static final String JSON_PROPERTY_LICENSES = "licenses";
  private List<TessellLicenseReleaseObjectDTO> licenses = null;

  public static final String JSON_PROPERTY_LOCK_HASH = "lockHash";
  private String lockHash;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;


  public TessellReleaseLicenseResponseDTO licenses(List<TessellLicenseReleaseObjectDTO> licenses) {
    
    this.licenses = licenses;
    return this;
  }

  public TessellReleaseLicenseResponseDTO addLicensesItem(TessellLicenseReleaseObjectDTO licensesItem) {
    if (this.licenses == null) {
      this.licenses = new ArrayList<>();
    }
    this.licenses.add(licensesItem);
    return this;
  }

   /**
   * Get licenses
   * @return licenses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LICENSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellLicenseReleaseObjectDTO> getLicenses() {
    return licenses;
  }


  @JsonProperty(JSON_PROPERTY_LICENSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLicenses(List<TessellLicenseReleaseObjectDTO> licenses) {
    this.licenses = licenses;
  }


  public TessellReleaseLicenseResponseDTO lockHash(String lockHash) {
    
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


  public TessellReleaseLicenseResponseDTO status(String status) {
    
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

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
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
    TessellReleaseLicenseResponseDTO releaseLicenseResponse = (TessellReleaseLicenseResponseDTO) o;
    return Objects.equals(this.licenses, releaseLicenseResponse.licenses) &&
        Objects.equals(this.lockHash, releaseLicenseResponse.lockHash) &&
        Objects.equals(this.status, releaseLicenseResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenses, lockHash, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellReleaseLicenseResponseDTO {\n");
    sb.append("    licenses: ").append(toIndentedString(licenses)).append("\n");
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
