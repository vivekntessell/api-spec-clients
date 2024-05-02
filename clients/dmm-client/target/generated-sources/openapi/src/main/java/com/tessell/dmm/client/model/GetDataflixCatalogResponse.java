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
import com.tessell.dmm.client.model.DataflixSnapshot;
import com.tessell.dmm.client.model.TessellDataflixPitrInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * The Dataflix catalog details for as-is contents
 */
@ApiModel(description = "The Dataflix catalog details for as-is contents")
@JsonPropertyOrder({
  GetDataflixCatalogResponse.JSON_PROPERTY_AVAILABILITY_MACHINE_ID,
  GetDataflixCatalogResponse.JSON_PROPERTY_TESSELL_SERVICE_ID,
  GetDataflixCatalogResponse.JSON_PROPERTY_SERVICE_NAME,
  GetDataflixCatalogResponse.JSON_PROPERTY_ENGINE_TYPE,
  GetDataflixCatalogResponse.JSON_PROPERTY_TIME_ZONE,
  GetDataflixCatalogResponse.JSON_PROPERTY_OWNER,
  GetDataflixCatalogResponse.JSON_PROPERTY_PITR_CATALOG,
  GetDataflixCatalogResponse.JSON_PROPERTY_SNAPSHOT_CATALOG
})
@JsonTypeName("GetDataflixCatalogResponse")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetDataflixCatalogResponse {
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

  public static final String JSON_PROPERTY_PITR_CATALOG = "pitrCatalog";
  private List<TessellDataflixPitrInfo> pitrCatalog = null;

  public static final String JSON_PROPERTY_SNAPSHOT_CATALOG = "snapshotCatalog";
  private List<DataflixSnapshot> snapshotCatalog = null;


  public GetDataflixCatalogResponse availabilityMachineId(UUID availabilityMachineId) {
    
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


  public GetDataflixCatalogResponse tessellServiceId(UUID tessellServiceId) {
    
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


  public GetDataflixCatalogResponse serviceName(String serviceName) {
    
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


  public GetDataflixCatalogResponse engineType(DatabaseEngineType engineType) {
    
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


  public GetDataflixCatalogResponse timeZone(String timeZone) {
    
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


  public GetDataflixCatalogResponse owner(String owner) {
    
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


  public GetDataflixCatalogResponse pitrCatalog(List<TessellDataflixPitrInfo> pitrCatalog) {
    
    this.pitrCatalog = pitrCatalog;
    return this;
  }

  public GetDataflixCatalogResponse addPitrCatalogItem(TessellDataflixPitrInfo pitrCatalogItem) {
    if (this.pitrCatalog == null) {
      this.pitrCatalog = new ArrayList<>();
    }
    this.pitrCatalog.add(pitrCatalogItem);
    return this;
  }

   /**
   * Catalog information for the point-in-time recoverability
   * @return pitrCatalog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Catalog information for the point-in-time recoverability")
  @JsonProperty(JSON_PROPERTY_PITR_CATALOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellDataflixPitrInfo> getPitrCatalog() {
    return pitrCatalog;
  }


  @JsonProperty(JSON_PROPERTY_PITR_CATALOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPitrCatalog(List<TessellDataflixPitrInfo> pitrCatalog) {
    this.pitrCatalog = pitrCatalog;
  }


  public GetDataflixCatalogResponse snapshotCatalog(List<DataflixSnapshot> snapshotCatalog) {
    
    this.snapshotCatalog = snapshotCatalog;
    return this;
  }

  public GetDataflixCatalogResponse addSnapshotCatalogItem(DataflixSnapshot snapshotCatalogItem) {
    if (this.snapshotCatalog == null) {
      this.snapshotCatalog = new ArrayList<>();
    }
    this.snapshotCatalog.add(snapshotCatalogItem);
    return this;
  }

   /**
   * Catalog information for the available snapshots
   * @return snapshotCatalog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Catalog information for the available snapshots")
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_CATALOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DataflixSnapshot> getSnapshotCatalog() {
    return snapshotCatalog;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT_CATALOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshotCatalog(List<DataflixSnapshot> snapshotCatalog) {
    this.snapshotCatalog = snapshotCatalog;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDataflixCatalogResponse getDataflixCatalogResponse = (GetDataflixCatalogResponse) o;
    return Objects.equals(this.availabilityMachineId, getDataflixCatalogResponse.availabilityMachineId) &&
        Objects.equals(this.tessellServiceId, getDataflixCatalogResponse.tessellServiceId) &&
        Objects.equals(this.serviceName, getDataflixCatalogResponse.serviceName) &&
        Objects.equals(this.engineType, getDataflixCatalogResponse.engineType) &&
        Objects.equals(this.timeZone, getDataflixCatalogResponse.timeZone) &&
        Objects.equals(this.owner, getDataflixCatalogResponse.owner) &&
        Objects.equals(this.pitrCatalog, getDataflixCatalogResponse.pitrCatalog) &&
        Objects.equals(this.snapshotCatalog, getDataflixCatalogResponse.snapshotCatalog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityMachineId, tessellServiceId, serviceName, engineType, timeZone, owner, pitrCatalog, snapshotCatalog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDataflixCatalogResponse {\n");
    sb.append("    availabilityMachineId: ").append(toIndentedString(availabilityMachineId)).append("\n");
    sb.append("    tessellServiceId: ").append(toIndentedString(tessellServiceId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    pitrCatalog: ").append(toIndentedString(pitrCatalog)).append("\n");
    sb.append("    snapshotCatalog: ").append(toIndentedString(snapshotCatalog)).append("\n");
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
