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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * CloneDatabaseConfigurationPayload
 */
@JsonPropertyOrder({
  CloneDatabaseConfigurationPayload.JSON_PROPERTY_AUTO_MINOR_VERSION_UPDATE,
  CloneDatabaseConfigurationPayload.JSON_PROPERTY_ENABLE_DELETION_PROTECTION,
  CloneDatabaseConfigurationPayload.JSON_PROPERTY_LICENSE_TYPE,
  CloneDatabaseConfigurationPayload.JSON_PROPERTY_OPTIONS_PROFILE,
  CloneDatabaseConfigurationPayload.JSON_PROPERTY_PARAMETER_PROFILE_ID,
  CloneDatabaseConfigurationPayload.JSON_PROPERTY_SOFTWARE_IMAGE_VERSION
})
@JsonTypeName("CloneDatabaseConfigurationPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CloneDatabaseConfigurationPayload {
  public static final String JSON_PROPERTY_AUTO_MINOR_VERSION_UPDATE = "autoMinorVersionUpdate";
  private Boolean autoMinorVersionUpdate;

  public static final String JSON_PROPERTY_ENABLE_DELETION_PROTECTION = "enableDeletionProtection";
  private Boolean enableDeletionProtection;

  public static final String JSON_PROPERTY_LICENSE_TYPE = "licenseType";
  private String licenseType;

  public static final String JSON_PROPERTY_OPTIONS_PROFILE = "optionsProfile";
  private String optionsProfile;

  public static final String JSON_PROPERTY_PARAMETER_PROFILE_ID = "parameterProfileId";
  private UUID parameterProfileId;

  public static final String JSON_PROPERTY_SOFTWARE_IMAGE_VERSION = "softwareImageVersion";
  private String softwareImageVersion;


  public CloneDatabaseConfigurationPayload autoMinorVersionUpdate(Boolean autoMinorVersionUpdate) {
    
    this.autoMinorVersionUpdate = autoMinorVersionUpdate;
    return this;
  }

   /**
   * Get autoMinorVersionUpdate
   * @return autoMinorVersionUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTO_MINOR_VERSION_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoMinorVersionUpdate() {
    return autoMinorVersionUpdate;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_MINOR_VERSION_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoMinorVersionUpdate(Boolean autoMinorVersionUpdate) {
    this.autoMinorVersionUpdate = autoMinorVersionUpdate;
  }


  public CloneDatabaseConfigurationPayload enableDeletionProtection(Boolean enableDeletionProtection) {
    
    this.enableDeletionProtection = enableDeletionProtection;
    return this;
  }

   /**
   * Get enableDeletionProtection
   * @return enableDeletionProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLE_DELETION_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableDeletionProtection() {
    return enableDeletionProtection;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_DELETION_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableDeletionProtection(Boolean enableDeletionProtection) {
    this.enableDeletionProtection = enableDeletionProtection;
  }


  public CloneDatabaseConfigurationPayload licenseType(String licenseType) {
    
    this.licenseType = licenseType;
    return this;
  }

   /**
   * Get licenseType
   * @return licenseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LICENSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLicenseType() {
    return licenseType;
  }


  @JsonProperty(JSON_PROPERTY_LICENSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLicenseType(String licenseType) {
    this.licenseType = licenseType;
  }


  public CloneDatabaseConfigurationPayload optionsProfile(String optionsProfile) {
    
    this.optionsProfile = optionsProfile;
    return this;
  }

   /**
   * Get optionsProfile
   * @return optionsProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPTIONS_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOptionsProfile() {
    return optionsProfile;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptionsProfile(String optionsProfile) {
    this.optionsProfile = optionsProfile;
  }


  public CloneDatabaseConfigurationPayload parameterProfileId(UUID parameterProfileId) {
    
    this.parameterProfileId = parameterProfileId;
    return this;
  }

   /**
   * Get parameterProfileId
   * @return parameterProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARAMETER_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getParameterProfileId() {
    return parameterProfileId;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameterProfileId(UUID parameterProfileId) {
    this.parameterProfileId = parameterProfileId;
  }


  public CloneDatabaseConfigurationPayload softwareImageVersion(String softwareImageVersion) {
    
    this.softwareImageVersion = softwareImageVersion;
    return this;
  }

   /**
   * Get softwareImageVersion
   * @return softwareImageVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOFTWARE_IMAGE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSoftwareImageVersion() {
    return softwareImageVersion;
  }


  @JsonProperty(JSON_PROPERTY_SOFTWARE_IMAGE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoftwareImageVersion(String softwareImageVersion) {
    this.softwareImageVersion = softwareImageVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloneDatabaseConfigurationPayload cloneDatabaseConfigurationPayload = (CloneDatabaseConfigurationPayload) o;
    return Objects.equals(this.autoMinorVersionUpdate, cloneDatabaseConfigurationPayload.autoMinorVersionUpdate) &&
        Objects.equals(this.enableDeletionProtection, cloneDatabaseConfigurationPayload.enableDeletionProtection) &&
        Objects.equals(this.licenseType, cloneDatabaseConfigurationPayload.licenseType) &&
        Objects.equals(this.optionsProfile, cloneDatabaseConfigurationPayload.optionsProfile) &&
        Objects.equals(this.parameterProfileId, cloneDatabaseConfigurationPayload.parameterProfileId) &&
        Objects.equals(this.softwareImageVersion, cloneDatabaseConfigurationPayload.softwareImageVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoMinorVersionUpdate, enableDeletionProtection, licenseType, optionsProfile, parameterProfileId, softwareImageVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloneDatabaseConfigurationPayload {\n");
    sb.append("    autoMinorVersionUpdate: ").append(toIndentedString(autoMinorVersionUpdate)).append("\n");
    sb.append("    enableDeletionProtection: ").append(toIndentedString(enableDeletionProtection)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    optionsProfile: ").append(toIndentedString(optionsProfile)).append("\n");
    sb.append("    parameterProfileId: ").append(toIndentedString(parameterProfileId)).append("\n");
    sb.append("    softwareImageVersion: ").append(toIndentedString(softwareImageVersion)).append("\n");
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

