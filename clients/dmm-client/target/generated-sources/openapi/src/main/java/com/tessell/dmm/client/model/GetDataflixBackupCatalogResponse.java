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
import com.tessell.dmm.client.model.DatabaseEngineType;
import com.tessell.dmm.client.model.DataflixBackup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * The Dataflix catalog details for native backup contents
 */
@ApiModel(description = "The Dataflix catalog details for native backup contents")
@JsonPropertyOrder({
  GetDataflixBackupCatalogResponse.JSON_PROPERTY_AVAILABILITY_MACHINE_ID,
  GetDataflixBackupCatalogResponse.JSON_PROPERTY_TESSELL_SERVICE_ID,
  GetDataflixBackupCatalogResponse.JSON_PROPERTY_SERVICE_NAME,
  GetDataflixBackupCatalogResponse.JSON_PROPERTY_ENGINE_TYPE,
  GetDataflixBackupCatalogResponse.JSON_PROPERTY_TIME_ZONE,
  GetDataflixBackupCatalogResponse.JSON_PROPERTY_OWNER,
  GetDataflixBackupCatalogResponse.JSON_PROPERTY_BACKUP_CATALOG
})
@JsonTypeName("GetDataflixBackupCatalogResponse")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetDataflixBackupCatalogResponse {
  public static final String JSON_PROPERTY_AVAILABILITY_MACHINE_ID = "availabilityMachineId";
  private UUID availabilityMachineId;

  public static final String JSON_PROPERTY_TESSELL_SERVICE_ID = "tessellServiceId";
  private UUID tessellServiceId;

  public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
  private String serviceName;

  public static final String JSON_PROPERTY_ENGINE_TYPE = "engineType";
  private DatabaseEngineType engineType;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  private String timeZone;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_BACKUP_CATALOG = "backupCatalog";
  private List<DataflixBackup> backupCatalog = null;


  public GetDataflixBackupCatalogResponse availabilityMachineId(UUID availabilityMachineId) {
    
    this.availabilityMachineId = availabilityMachineId;
    return this;
  }

   /**
   * ID of the Availability Machine
   * @return availabilityMachineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the Availability Machine")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_MACHINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getAvailabilityMachineId() {
    return availabilityMachineId;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_MACHINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityMachineId(UUID availabilityMachineId) {
    this.availabilityMachineId = availabilityMachineId;
  }


  public GetDataflixBackupCatalogResponse tessellServiceId(UUID tessellServiceId) {
    
    this.tessellServiceId = tessellServiceId;
    return this;
  }

   /**
   * ID of the associated DB Service
   * @return tessellServiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the associated DB Service")
  @JsonProperty(JSON_PROPERTY_TESSELL_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getTessellServiceId() {
    return tessellServiceId;
  }


  @JsonProperty(JSON_PROPERTY_TESSELL_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTessellServiceId(UUID tessellServiceId) {
    this.tessellServiceId = tessellServiceId;
  }


  public GetDataflixBackupCatalogResponse serviceName(String serviceName) {
    
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Name of the associated DB Service
   * @return serviceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the associated DB Service")
  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceName() {
    return serviceName;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public GetDataflixBackupCatalogResponse engineType(DatabaseEngineType engineType) {
    
    this.engineType = engineType;
    return this;
  }

   /**
   * Get engineType
   * @return engineType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENGINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DatabaseEngineType getEngineType() {
    return engineType;
  }


  @JsonProperty(JSON_PROPERTY_ENGINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEngineType(DatabaseEngineType engineType) {
    this.engineType = engineType;
  }


  public GetDataflixBackupCatalogResponse timeZone(String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Timezone applicable for timestamps that are returned in this response
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timezone applicable for timestamps that are returned in this response")
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  public GetDataflixBackupCatalogResponse owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Owner of the Availability Machine
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Owner of the Availability Machine")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwner(String owner) {
    this.owner = owner;
  }


  public GetDataflixBackupCatalogResponse backupCatalog(List<DataflixBackup> backupCatalog) {
    
    this.backupCatalog = backupCatalog;
    return this;
  }

  public GetDataflixBackupCatalogResponse addBackupCatalogItem(DataflixBackup backupCatalogItem) {
    if (this.backupCatalog == null) {
      this.backupCatalog = new ArrayList<>();
    }
    this.backupCatalog.add(backupCatalogItem);
    return this;
  }

   /**
   * Catalog information for the available native backups
   * @return backupCatalog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Catalog information for the available native backups")
  @JsonProperty(JSON_PROPERTY_BACKUP_CATALOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DataflixBackup> getBackupCatalog() {
    return backupCatalog;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_CATALOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupCatalog(List<DataflixBackup> backupCatalog) {
    this.backupCatalog = backupCatalog;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDataflixBackupCatalogResponse getDataflixBackupCatalogResponse = (GetDataflixBackupCatalogResponse) o;
    return Objects.equals(this.availabilityMachineId, getDataflixBackupCatalogResponse.availabilityMachineId) &&
        Objects.equals(this.tessellServiceId, getDataflixBackupCatalogResponse.tessellServiceId) &&
        Objects.equals(this.serviceName, getDataflixBackupCatalogResponse.serviceName) &&
        Objects.equals(this.engineType, getDataflixBackupCatalogResponse.engineType) &&
        Objects.equals(this.timeZone, getDataflixBackupCatalogResponse.timeZone) &&
        Objects.equals(this.owner, getDataflixBackupCatalogResponse.owner) &&
        Objects.equals(this.backupCatalog, getDataflixBackupCatalogResponse.backupCatalog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityMachineId, tessellServiceId, serviceName, engineType, timeZone, owner, backupCatalog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDataflixBackupCatalogResponse {\n");
    sb.append("    availabilityMachineId: ").append(toIndentedString(availabilityMachineId)).append("\n");
    sb.append("    tessellServiceId: ").append(toIndentedString(tessellServiceId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    backupCatalog: ").append(toIndentedString(backupCatalog)).append("\n");
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
