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
import com.tessell.database.system.client.model.DbserverSoftwareImageInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * ComputeResourceDbserverInfo
 */
@JsonPropertyOrder({
  ComputeResourceDbserverInfo.JSON_PROPERTY_FIRST_PROVISIONED_DBSERVICE_ID,
  ComputeResourceDbserverInfo.JSON_PROPERTY_DB_SERVICE_IDS,
  ComputeResourceDbserverInfo.JSON_PROPERTY_ENABLE_PUBLIC_ACCESS,
  ComputeResourceDbserverInfo.JSON_PROPERTY_ENABLE_S_S_L,
  ComputeResourceDbserverInfo.JSON_PROPERTY_SOFTWARE_IMAGE_INFO
})
@JsonTypeName("ComputeResourceDbserverInfo")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComputeResourceDbserverInfo {
  public static final String JSON_PROPERTY_FIRST_PROVISIONED_DBSERVICE_ID = "firstProvisionedDbserviceId";
  private UUID firstProvisionedDbserviceId;

  public static final String JSON_PROPERTY_DB_SERVICE_IDS = "dbServiceIds";
  private Set<UUID> dbServiceIds = null;

  public static final String JSON_PROPERTY_ENABLE_PUBLIC_ACCESS = "enablePublicAccess";
  private Boolean enablePublicAccess;

  public static final String JSON_PROPERTY_ENABLE_S_S_L = "enableSSL";
  private Boolean enableSSL;

  public static final String JSON_PROPERTY_SOFTWARE_IMAGE_INFO = "softwareImageInfo";
  private DbserverSoftwareImageInfo softwareImageInfo;


  public ComputeResourceDbserverInfo firstProvisionedDbserviceId(UUID firstProvisionedDbserviceId) {
    
    this.firstProvisionedDbserviceId = firstProvisionedDbserviceId;
    return this;
  }

   /**
   * Get firstProvisionedDbserviceId
   * @return firstProvisionedDbserviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_PROVISIONED_DBSERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getFirstProvisionedDbserviceId() {
    return firstProvisionedDbserviceId;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_PROVISIONED_DBSERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstProvisionedDbserviceId(UUID firstProvisionedDbserviceId) {
    this.firstProvisionedDbserviceId = firstProvisionedDbserviceId;
  }


  public ComputeResourceDbserverInfo dbServiceIds(Set<UUID> dbServiceIds) {
    
    this.dbServiceIds = dbServiceIds;
    return this;
  }

  public ComputeResourceDbserverInfo addDbServiceIdsItem(UUID dbServiceIdsItem) {
    if (this.dbServiceIds == null) {
      this.dbServiceIds = new LinkedHashSet<>();
    }
    this.dbServiceIds.add(dbServiceIdsItem);
    return this;
  }

   /**
   * The list of DB Service ids that are hosted on this compute resource
   * @return dbServiceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of DB Service ids that are hosted on this compute resource")
  @JsonProperty(JSON_PROPERTY_DB_SERVICE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<UUID> getDbServiceIds() {
    return dbServiceIds;
  }


  @JsonProperty(JSON_PROPERTY_DB_SERVICE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbServiceIds(Set<UUID> dbServiceIds) {
    this.dbServiceIds = dbServiceIds;
  }


  public ComputeResourceDbserverInfo enablePublicAccess(Boolean enablePublicAccess) {
    
    this.enablePublicAccess = enablePublicAccess;
    return this;
  }

   /**
   * Get enablePublicAccess
   * @return enablePublicAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLE_PUBLIC_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnablePublicAccess() {
    return enablePublicAccess;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_PUBLIC_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnablePublicAccess(Boolean enablePublicAccess) {
    this.enablePublicAccess = enablePublicAccess;
  }


  public ComputeResourceDbserverInfo enableSSL(Boolean enableSSL) {
    
    this.enableSSL = enableSSL;
    return this;
  }

   /**
   * Get enableSSL
   * @return enableSSL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLE_S_S_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableSSL() {
    return enableSSL;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_S_S_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableSSL(Boolean enableSSL) {
    this.enableSSL = enableSSL;
  }


  public ComputeResourceDbserverInfo softwareImageInfo(DbserverSoftwareImageInfo softwareImageInfo) {
    
    this.softwareImageInfo = softwareImageInfo;
    return this;
  }

   /**
   * Get softwareImageInfo
   * @return softwareImageInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOFTWARE_IMAGE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbserverSoftwareImageInfo getSoftwareImageInfo() {
    return softwareImageInfo;
  }


  @JsonProperty(JSON_PROPERTY_SOFTWARE_IMAGE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoftwareImageInfo(DbserverSoftwareImageInfo softwareImageInfo) {
    this.softwareImageInfo = softwareImageInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputeResourceDbserverInfo computeResourceDbserverInfo = (ComputeResourceDbserverInfo) o;
    return Objects.equals(this.firstProvisionedDbserviceId, computeResourceDbserverInfo.firstProvisionedDbserviceId) &&
        Objects.equals(this.dbServiceIds, computeResourceDbserverInfo.dbServiceIds) &&
        Objects.equals(this.enablePublicAccess, computeResourceDbserverInfo.enablePublicAccess) &&
        Objects.equals(this.enableSSL, computeResourceDbserverInfo.enableSSL) &&
        Objects.equals(this.softwareImageInfo, computeResourceDbserverInfo.softwareImageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstProvisionedDbserviceId, dbServiceIds, enablePublicAccess, enableSSL, softwareImageInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputeResourceDbserverInfo {\n");
    sb.append("    firstProvisionedDbserviceId: ").append(toIndentedString(firstProvisionedDbserviceId)).append("\n");
    sb.append("    dbServiceIds: ").append(toIndentedString(dbServiceIds)).append("\n");
    sb.append("    enablePublicAccess: ").append(toIndentedString(enablePublicAccess)).append("\n");
    sb.append("    enableSSL: ").append(toIndentedString(enableSSL)).append("\n");
    sb.append("    softwareImageInfo: ").append(toIndentedString(softwareImageInfo)).append("\n");
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
