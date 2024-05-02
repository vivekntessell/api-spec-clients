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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TerraformDataSourceListDBServiceExtra
 */
@JsonPropertyOrder({
  TerraformDataSourceListDBServiceExtra.JSON_PROPERTY_NAME,
  TerraformDataSourceListDBServiceExtra.JSON_PROPERTY_STATUSES,
  TerraformDataSourceListDBServiceExtra.JSON_PROPERTY_ENGINE_TYPES,
  TerraformDataSourceListDBServiceExtra.JSON_PROPERTY_CLONED_FROM_SERVICE_ID,
  TerraformDataSourceListDBServiceExtra.JSON_PROPERTY_CLONED_FROM_AVAILABILITY_MACHINE_ID,
  TerraformDataSourceListDBServiceExtra.JSON_PROPERTY_LOAD_INSTANCES,
  TerraformDataSourceListDBServiceExtra.JSON_PROPERTY_LOAD_DATABASES,
  TerraformDataSourceListDBServiceExtra.JSON_PROPERTY_OWNERS,
  TerraformDataSourceListDBServiceExtra.JSON_PROPERTY_LOAD_ACLS
})
@JsonTypeName("TerraformDataSourceListDBServiceExtra")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TerraformDataSourceListDBServiceExtra {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * Gets or Sets statuses
   */
  public enum StatusesEnum {
    CREATING("CREATING"),
    
    FAILED("FAILED"),
    
    READY("READY"),
    
    STOPPING("STOPPING"),
    
    STOPPED("STOPPED"),
    
    DEGRADED("DEGRADED"),
    
    STARTING("STARTING"),
    
    DELETING("DELETING"),
    
    SWITCHOVER("SWITCHOVER"),
    
    REBUILDING("REBUILDING");

    private String value;

    StatusesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusesEnum fromValue(String value) {
      for (StatusesEnum b : StatusesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUSES = "statuses";
  private List<StatusesEnum> statuses = null;

  /**
   * Gets or Sets engineTypes
   */
  public enum EngineTypesEnum {
    ORACLE("ORACLE"),
    
    POSTGRESQL("POSTGRESQL"),
    
    SQLSERVER("SQLSERVER"),
    
    MYSQL("MYSQL"),
    
    APACHE_KAFKA("APACHE_KAFKA"),
    
    MONGODB("MONGODB");

    private String value;

    EngineTypesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EngineTypesEnum fromValue(String value) {
      for (EngineTypesEnum b : EngineTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ENGINE_TYPES = "engineTypes";
  private List<EngineTypesEnum> engineTypes = null;

  public static final String JSON_PROPERTY_CLONED_FROM_SERVICE_ID = "clonedFromServiceId";
  private UUID clonedFromServiceId;

  public static final String JSON_PROPERTY_CLONED_FROM_AVAILABILITY_MACHINE_ID = "clonedFromAvailabilityMachineId";
  private UUID clonedFromAvailabilityMachineId;

  public static final String JSON_PROPERTY_LOAD_INSTANCES = "loadInstances";
  private Boolean loadInstances = true;

  public static final String JSON_PROPERTY_LOAD_DATABASES = "loadDatabases";
  private Boolean loadDatabases = true;

  public static final String JSON_PROPERTY_OWNERS = "owners";
  private List<String> owners = null;

  public static final String JSON_PROPERTY_LOAD_ACLS = "loadAcls";
  private Boolean loadAcls = false;


  public TerraformDataSourceListDBServiceExtra name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the DB Service
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the DB Service")
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


  public TerraformDataSourceListDBServiceExtra statuses(List<StatusesEnum> statuses) {
    
    this.statuses = statuses;
    return this;
  }

  public TerraformDataSourceListDBServiceExtra addStatusesItem(StatusesEnum statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * statuses
   * @return statuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "statuses")
  @JsonProperty(JSON_PROPERTY_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<StatusesEnum> getStatuses() {
    return statuses;
  }


  @JsonProperty(JSON_PROPERTY_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatuses(List<StatusesEnum> statuses) {
    this.statuses = statuses;
  }


  public TerraformDataSourceListDBServiceExtra engineTypes(List<EngineTypesEnum> engineTypes) {
    
    this.engineTypes = engineTypes;
    return this;
  }

  public TerraformDataSourceListDBServiceExtra addEngineTypesItem(EngineTypesEnum engineTypesItem) {
    if (this.engineTypes == null) {
      this.engineTypes = new ArrayList<>();
    }
    this.engineTypes.add(engineTypesItem);
    return this;
  }

   /**
   * DB Service&#39;s engine-types
   * @return engineTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DB Service's engine-types")
  @JsonProperty(JSON_PROPERTY_ENGINE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EngineTypesEnum> getEngineTypes() {
    return engineTypes;
  }


  @JsonProperty(JSON_PROPERTY_ENGINE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEngineTypes(List<EngineTypesEnum> engineTypes) {
    this.engineTypes = engineTypes;
  }


  public TerraformDataSourceListDBServiceExtra clonedFromServiceId(UUID clonedFromServiceId) {
    
    this.clonedFromServiceId = clonedFromServiceId;
    return this;
  }

   /**
   * The ID of the DB Service from which the services are cloned
   * @return clonedFromServiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the DB Service from which the services are cloned")
  @JsonProperty(JSON_PROPERTY_CLONED_FROM_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getClonedFromServiceId() {
    return clonedFromServiceId;
  }


  @JsonProperty(JSON_PROPERTY_CLONED_FROM_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClonedFromServiceId(UUID clonedFromServiceId) {
    this.clonedFromServiceId = clonedFromServiceId;
  }


  public TerraformDataSourceListDBServiceExtra clonedFromAvailabilityMachineId(UUID clonedFromAvailabilityMachineId) {
    
    this.clonedFromAvailabilityMachineId = clonedFromAvailabilityMachineId;
    return this;
  }

   /**
   * The id of the Availability Machine from which the services are cloned
   * @return clonedFromAvailabilityMachineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the Availability Machine from which the services are cloned")
  @JsonProperty(JSON_PROPERTY_CLONED_FROM_AVAILABILITY_MACHINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getClonedFromAvailabilityMachineId() {
    return clonedFromAvailabilityMachineId;
  }


  @JsonProperty(JSON_PROPERTY_CLONED_FROM_AVAILABILITY_MACHINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClonedFromAvailabilityMachineId(UUID clonedFromAvailabilityMachineId) {
    this.clonedFromAvailabilityMachineId = clonedFromAvailabilityMachineId;
  }


  public TerraformDataSourceListDBServiceExtra loadInstances(Boolean loadInstances) {
    
    this.loadInstances = loadInstances;
    return this;
  }

   /**
   * Load the instances that are part of the DB Service
   * @return loadInstances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Load the instances that are part of the DB Service")
  @JsonProperty(JSON_PROPERTY_LOAD_INSTANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLoadInstances() {
    return loadInstances;
  }


  @JsonProperty(JSON_PROPERTY_LOAD_INSTANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoadInstances(Boolean loadInstances) {
    this.loadInstances = loadInstances;
  }


  public TerraformDataSourceListDBServiceExtra loadDatabases(Boolean loadDatabases) {
    
    this.loadDatabases = loadDatabases;
    return this;
  }

   /**
   * Load the databases that are part of the DB Service
   * @return loadDatabases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Load the databases that are part of the DB Service")
  @JsonProperty(JSON_PROPERTY_LOAD_DATABASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLoadDatabases() {
    return loadDatabases;
  }


  @JsonProperty(JSON_PROPERTY_LOAD_DATABASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoadDatabases(Boolean loadDatabases) {
    this.loadDatabases = loadDatabases;
  }


  public TerraformDataSourceListDBServiceExtra owners(List<String> owners) {
    
    this.owners = owners;
    return this;
  }

  public TerraformDataSourceListDBServiceExtra addOwnersItem(String ownersItem) {
    if (this.owners == null) {
      this.owners = new ArrayList<>();
    }
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * List of Email Addresses for entity or resource owners
   * @return owners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of Email Addresses for entity or resource owners")
  @JsonProperty(JSON_PROPERTY_OWNERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getOwners() {
    return owners;
  }


  @JsonProperty(JSON_PROPERTY_OWNERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwners(List<String> owners) {
    this.owners = owners;
  }


  public TerraformDataSourceListDBServiceExtra loadAcls(Boolean loadAcls) {
    
    this.loadAcls = loadAcls;
    return this;
  }

   /**
   * Load ACL information
   * @return loadAcls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Load ACL information")
  @JsonProperty(JSON_PROPERTY_LOAD_ACLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLoadAcls() {
    return loadAcls;
  }


  @JsonProperty(JSON_PROPERTY_LOAD_ACLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoadAcls(Boolean loadAcls) {
    this.loadAcls = loadAcls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerraformDataSourceListDBServiceExtra terraformDataSourceListDBServiceExtra = (TerraformDataSourceListDBServiceExtra) o;
    return Objects.equals(this.name, terraformDataSourceListDBServiceExtra.name) &&
        Objects.equals(this.statuses, terraformDataSourceListDBServiceExtra.statuses) &&
        Objects.equals(this.engineTypes, terraformDataSourceListDBServiceExtra.engineTypes) &&
        Objects.equals(this.clonedFromServiceId, terraformDataSourceListDBServiceExtra.clonedFromServiceId) &&
        Objects.equals(this.clonedFromAvailabilityMachineId, terraformDataSourceListDBServiceExtra.clonedFromAvailabilityMachineId) &&
        Objects.equals(this.loadInstances, terraformDataSourceListDBServiceExtra.loadInstances) &&
        Objects.equals(this.loadDatabases, terraformDataSourceListDBServiceExtra.loadDatabases) &&
        Objects.equals(this.owners, terraformDataSourceListDBServiceExtra.owners) &&
        Objects.equals(this.loadAcls, terraformDataSourceListDBServiceExtra.loadAcls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, statuses, engineTypes, clonedFromServiceId, clonedFromAvailabilityMachineId, loadInstances, loadDatabases, owners, loadAcls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerraformDataSourceListDBServiceExtra {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    engineTypes: ").append(toIndentedString(engineTypes)).append("\n");
    sb.append("    clonedFromServiceId: ").append(toIndentedString(clonedFromServiceId)).append("\n");
    sb.append("    clonedFromAvailabilityMachineId: ").append(toIndentedString(clonedFromAvailabilityMachineId)).append("\n");
    sb.append("    loadInstances: ").append(toIndentedString(loadInstances)).append("\n");
    sb.append("    loadDatabases: ").append(toIndentedString(loadDatabases)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    loadAcls: ").append(toIndentedString(loadAcls)).append("\n");
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

