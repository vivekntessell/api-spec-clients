/*
 * Tessell Database System REST Web Services' API Documentation
 * Tessell Database System REST Web Services' Api Documentation
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.database.system.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.database.system.client.model.ProvisionDatabasebMaintenanceWindow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * ProvisionDatabaseConfigurationPayload
 */
@JsonPropertyOrder({
  ProvisionDatabaseConfigurationPayload.JSON_PROPERTY_AUTO_MINOR_VERSION_UPDATE,
  ProvisionDatabaseConfigurationPayload.JSON_PROPERTY_CHARACTER_SET,
  ProvisionDatabaseConfigurationPayload.JSON_PROPERTY_CREATE_REPLICA,
  ProvisionDatabaseConfigurationPayload.JSON_PROPERTY_ENABLE_DELETION_PROTECTION,
  ProvisionDatabaseConfigurationPayload.JSON_PROPERTY_LICENSE_TYPE,
  ProvisionDatabaseConfigurationPayload.JSON_PROPERTY_MAINTENANCE_WINDOW,
  ProvisionDatabaseConfigurationPayload.JSON_PROPERTY_MULTITENANT,
  ProvisionDatabaseConfigurationPayload.JSON_PROPERTY_NATIONAL_CHARACTER_SET,
  ProvisionDatabaseConfigurationPayload.JSON_PROPERTY_OPTIONS_PROFILE,
  ProvisionDatabaseConfigurationPayload.JSON_PROPERTY_PARAMETER_PROFILE_ID,
  ProvisionDatabaseConfigurationPayload.JSON_PROPERTY_SOFTWARE_IMAGE_VERSION
})
@JsonTypeName("ProvisionDatabaseConfigurationPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProvisionDatabaseConfigurationPayload {
  public static final String JSON_PROPERTY_AUTO_MINOR_VERSION_UPDATE = "autoMinorVersionUpdate";
  private Boolean autoMinorVersionUpdate;

  public static final String JSON_PROPERTY_CHARACTER_SET = "characterSet";
  private String characterSet;

  public static final String JSON_PROPERTY_CREATE_REPLICA = "createReplica";
  private Boolean createReplica;

  public static final String JSON_PROPERTY_ENABLE_DELETION_PROTECTION = "enableDeletionProtection";
  private Boolean enableDeletionProtection;

  public static final String JSON_PROPERTY_LICENSE_TYPE = "licenseType";
  private String licenseType;

  public static final String JSON_PROPERTY_MAINTENANCE_WINDOW = "maintenanceWindow";
  private ProvisionDatabasebMaintenanceWindow maintenanceWindow;

  public static final String JSON_PROPERTY_MULTITENANT = "multitenant";
  private Boolean multitenant;

  public static final String JSON_PROPERTY_NATIONAL_CHARACTER_SET = "nationalCharacterSet";
  private String nationalCharacterSet;

  public static final String JSON_PROPERTY_OPTIONS_PROFILE = "optionsProfile";
  private String optionsProfile;

  public static final String JSON_PROPERTY_PARAMETER_PROFILE_ID = "parameterProfileId";
  private UUID parameterProfileId;

  public static final String JSON_PROPERTY_SOFTWARE_IMAGE_VERSION = "softwareImageVersion";
  private String softwareImageVersion;


  public ProvisionDatabaseConfigurationPayload autoMinorVersionUpdate(Boolean autoMinorVersionUpdate) {
    
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


  public ProvisionDatabaseConfigurationPayload characterSet(String characterSet) {
    
    this.characterSet = characterSet;
    return this;
  }

   /**
   * Get characterSet
   * @return characterSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHARACTER_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCharacterSet() {
    return characterSet;
  }


  @JsonProperty(JSON_PROPERTY_CHARACTER_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCharacterSet(String characterSet) {
    this.characterSet = characterSet;
  }


  public ProvisionDatabaseConfigurationPayload createReplica(Boolean createReplica) {
    
    this.createReplica = createReplica;
    return this;
  }

   /**
   * Get createReplica
   * @return createReplica
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_REPLICA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCreateReplica() {
    return createReplica;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_REPLICA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateReplica(Boolean createReplica) {
    this.createReplica = createReplica;
  }


  public ProvisionDatabaseConfigurationPayload enableDeletionProtection(Boolean enableDeletionProtection) {
    
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


  public ProvisionDatabaseConfigurationPayload licenseType(String licenseType) {
    
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


  public ProvisionDatabaseConfigurationPayload maintenanceWindow(ProvisionDatabasebMaintenanceWindow maintenanceWindow) {
    
    this.maintenanceWindow = maintenanceWindow;
    return this;
  }

   /**
   * Get maintenanceWindow
   * @return maintenanceWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAINTENANCE_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProvisionDatabasebMaintenanceWindow getMaintenanceWindow() {
    return maintenanceWindow;
  }


  @JsonProperty(JSON_PROPERTY_MAINTENANCE_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaintenanceWindow(ProvisionDatabasebMaintenanceWindow maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
  }


  public ProvisionDatabaseConfigurationPayload multitenant(Boolean multitenant) {
    
    this.multitenant = multitenant;
    return this;
  }

   /**
   * Get multitenant
   * @return multitenant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MULTITENANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMultitenant() {
    return multitenant;
  }


  @JsonProperty(JSON_PROPERTY_MULTITENANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultitenant(Boolean multitenant) {
    this.multitenant = multitenant;
  }


  public ProvisionDatabaseConfigurationPayload nationalCharacterSet(String nationalCharacterSet) {
    
    this.nationalCharacterSet = nationalCharacterSet;
    return this;
  }

   /**
   * Get nationalCharacterSet
   * @return nationalCharacterSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NATIONAL_CHARACTER_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNationalCharacterSet() {
    return nationalCharacterSet;
  }


  @JsonProperty(JSON_PROPERTY_NATIONAL_CHARACTER_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNationalCharacterSet(String nationalCharacterSet) {
    this.nationalCharacterSet = nationalCharacterSet;
  }


  public ProvisionDatabaseConfigurationPayload optionsProfile(String optionsProfile) {
    
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


  public ProvisionDatabaseConfigurationPayload parameterProfileId(UUID parameterProfileId) {
    
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


  public ProvisionDatabaseConfigurationPayload softwareImageVersion(String softwareImageVersion) {
    
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
    ProvisionDatabaseConfigurationPayload provisionDatabaseConfigurationPayload = (ProvisionDatabaseConfigurationPayload) o;
    return Objects.equals(this.autoMinorVersionUpdate, provisionDatabaseConfigurationPayload.autoMinorVersionUpdate) &&
        Objects.equals(this.characterSet, provisionDatabaseConfigurationPayload.characterSet) &&
        Objects.equals(this.createReplica, provisionDatabaseConfigurationPayload.createReplica) &&
        Objects.equals(this.enableDeletionProtection, provisionDatabaseConfigurationPayload.enableDeletionProtection) &&
        Objects.equals(this.licenseType, provisionDatabaseConfigurationPayload.licenseType) &&
        Objects.equals(this.maintenanceWindow, provisionDatabaseConfigurationPayload.maintenanceWindow) &&
        Objects.equals(this.multitenant, provisionDatabaseConfigurationPayload.multitenant) &&
        Objects.equals(this.nationalCharacterSet, provisionDatabaseConfigurationPayload.nationalCharacterSet) &&
        Objects.equals(this.optionsProfile, provisionDatabaseConfigurationPayload.optionsProfile) &&
        Objects.equals(this.parameterProfileId, provisionDatabaseConfigurationPayload.parameterProfileId) &&
        Objects.equals(this.softwareImageVersion, provisionDatabaseConfigurationPayload.softwareImageVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoMinorVersionUpdate, characterSet, createReplica, enableDeletionProtection, licenseType, maintenanceWindow, multitenant, nationalCharacterSet, optionsProfile, parameterProfileId, softwareImageVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionDatabaseConfigurationPayload {\n");
    sb.append("    autoMinorVersionUpdate: ").append(toIndentedString(autoMinorVersionUpdate)).append("\n");
    sb.append("    characterSet: ").append(toIndentedString(characterSet)).append("\n");
    sb.append("    createReplica: ").append(toIndentedString(createReplica)).append("\n");
    sb.append("    enableDeletionProtection: ").append(toIndentedString(enableDeletionProtection)).append("\n");
    sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
    sb.append("    maintenanceWindow: ").append(toIndentedString(maintenanceWindow)).append("\n");
    sb.append("    multitenant: ").append(toIndentedString(multitenant)).append("\n");
    sb.append("    nationalCharacterSet: ").append(toIndentedString(nationalCharacterSet)).append("\n");
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
