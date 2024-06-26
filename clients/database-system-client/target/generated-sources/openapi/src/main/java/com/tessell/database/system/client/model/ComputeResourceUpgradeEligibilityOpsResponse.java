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
import com.tessell.database.system.client.model.ComputeResourceStatusOps;
import com.tessell.database.system.client.model.ComputeResourceType;
import com.tessell.database.system.client.model.DbserviceForCrUpgrade;
import com.tessell.database.system.client.model.TessellComputeResourceOpsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * ComputeResourceUpgradeEligibilityOpsResponse
 */
@JsonPropertyOrder({
  ComputeResourceUpgradeEligibilityOpsResponse.JSON_PROPERTY_ID,
  ComputeResourceUpgradeEligibilityOpsResponse.JSON_PROPERTY_NAME,
  ComputeResourceUpgradeEligibilityOpsResponse.JSON_PROPERTY_STATUS,
  ComputeResourceUpgradeEligibilityOpsResponse.JSON_PROPERTY_TYPE,
  ComputeResourceUpgradeEligibilityOpsResponse.JSON_PROPERTY_ELIGIBLE_FOR_LIBRARY_UPGRADE,
  ComputeResourceUpgradeEligibilityOpsResponse.JSON_PROPERTY_MESSAGE,
  ComputeResourceUpgradeEligibilityOpsResponse.JSON_PROPERTY_DB_SERVICES,
  ComputeResourceUpgradeEligibilityOpsResponse.JSON_PROPERTY_COMPUTE_RESOURCE
})
@JsonTypeName("ComputeResourceUpgradeEligibilityOpsResponse")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComputeResourceUpgradeEligibilityOpsResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ComputeResourceStatusOps status;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ComputeResourceType type;

  public static final String JSON_PROPERTY_ELIGIBLE_FOR_LIBRARY_UPGRADE = "eligibleForLibraryUpgrade";
  private Boolean eligibleForLibraryUpgrade = true;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_DB_SERVICES = "dbServices";
  private List<DbserviceForCrUpgrade> dbServices = null;

  public static final String JSON_PROPERTY_COMPUTE_RESOURCE = "computeResource";
  private TessellComputeResourceOpsDTO computeResource;


  public ComputeResourceUpgradeEligibilityOpsResponse id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the Compute Resource
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the Compute Resource")
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


  public ComputeResourceUpgradeEligibilityOpsResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the Compute Resource
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the Compute Resource")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ComputeResourceUpgradeEligibilityOpsResponse status(ComputeResourceStatusOps status) {
    
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

  public ComputeResourceStatusOps getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(ComputeResourceStatusOps status) {
    this.status = status;
  }


  public ComputeResourceUpgradeEligibilityOpsResponse type(ComputeResourceType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ComputeResourceType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(ComputeResourceType type) {
    this.type = type;
  }


  public ComputeResourceUpgradeEligibilityOpsResponse eligibleForLibraryUpgrade(Boolean eligibleForLibraryUpgrade) {
    
    this.eligibleForLibraryUpgrade = eligibleForLibraryUpgrade;
    return this;
  }

   /**
   * Whether Compute Resource is eligible for upgrade
   * @return eligibleForLibraryUpgrade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether Compute Resource is eligible for upgrade")
  @JsonProperty(JSON_PROPERTY_ELIGIBLE_FOR_LIBRARY_UPGRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEligibleForLibraryUpgrade() {
    return eligibleForLibraryUpgrade;
  }


  @JsonProperty(JSON_PROPERTY_ELIGIBLE_FOR_LIBRARY_UPGRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEligibleForLibraryUpgrade(Boolean eligibleForLibraryUpgrade) {
    this.eligibleForLibraryUpgrade = eligibleForLibraryUpgrade;
  }


  public ComputeResourceUpgradeEligibilityOpsResponse message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Details on why the compute resource is not eligible for upgrade
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details on why the compute resource is not eligible for upgrade")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public ComputeResourceUpgradeEligibilityOpsResponse dbServices(List<DbserviceForCrUpgrade> dbServices) {
    
    this.dbServices = dbServices;
    return this;
  }

  public ComputeResourceUpgradeEligibilityOpsResponse addDbServicesItem(DbserviceForCrUpgrade dbServicesItem) {
    if (this.dbServices == null) {
      this.dbServices = new ArrayList<>();
    }
    this.dbServices.add(dbServicesItem);
    return this;
  }

   /**
   * Get dbServices
   * @return dbServices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DB_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbserviceForCrUpgrade> getDbServices() {
    return dbServices;
  }


  @JsonProperty(JSON_PROPERTY_DB_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbServices(List<DbserviceForCrUpgrade> dbServices) {
    this.dbServices = dbServices;
  }


  public ComputeResourceUpgradeEligibilityOpsResponse computeResource(TessellComputeResourceOpsDTO computeResource) {
    
    this.computeResource = computeResource;
    return this;
  }

   /**
   * Get computeResource
   * @return computeResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPUTE_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellComputeResourceOpsDTO getComputeResource() {
    return computeResource;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTE_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComputeResource(TessellComputeResourceOpsDTO computeResource) {
    this.computeResource = computeResource;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputeResourceUpgradeEligibilityOpsResponse computeResourceUpgradeEligibilityOpsResponse = (ComputeResourceUpgradeEligibilityOpsResponse) o;
    return Objects.equals(this.id, computeResourceUpgradeEligibilityOpsResponse.id) &&
        Objects.equals(this.name, computeResourceUpgradeEligibilityOpsResponse.name) &&
        Objects.equals(this.status, computeResourceUpgradeEligibilityOpsResponse.status) &&
        Objects.equals(this.type, computeResourceUpgradeEligibilityOpsResponse.type) &&
        Objects.equals(this.eligibleForLibraryUpgrade, computeResourceUpgradeEligibilityOpsResponse.eligibleForLibraryUpgrade) &&
        Objects.equals(this.message, computeResourceUpgradeEligibilityOpsResponse.message) &&
        Objects.equals(this.dbServices, computeResourceUpgradeEligibilityOpsResponse.dbServices) &&
        Objects.equals(this.computeResource, computeResourceUpgradeEligibilityOpsResponse.computeResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, type, eligibleForLibraryUpgrade, message, dbServices, computeResource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputeResourceUpgradeEligibilityOpsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    eligibleForLibraryUpgrade: ").append(toIndentedString(eligibleForLibraryUpgrade)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    dbServices: ").append(toIndentedString(dbServices)).append("\n");
    sb.append("    computeResource: ").append(toIndentedString(computeResource)).append("\n");
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

