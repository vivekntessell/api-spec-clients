/*
 * REST API Documentation
 * REST API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.parameter_profile.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.parameter_profile.client.model.DatabaseEngineType;
import com.tessell.parameter_profile.client.model.DatabaseParameterType;
import com.tessell.parameter_profile.client.model.DatabaseParameterTypeStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * FactoryParametersEntity
 */
@JsonPropertyOrder({
  FactoryParametersEntity.JSON_PROPERTY_ID,
  FactoryParametersEntity.JSON_PROPERTY_NAME,
  FactoryParametersEntity.JSON_PROPERTY_DESCRIPTION,
  FactoryParametersEntity.JSON_PROPERTY_ENGINE_TYPE,
  FactoryParametersEntity.JSON_PROPERTY_VERSION,
  FactoryParametersEntity.JSON_PROPERTY_TOPOLOGY,
  FactoryParametersEntity.JSON_PROPERTY_PARAMETERS,
  FactoryParametersEntity.JSON_PROPERTY_DATE_CREATED,
  FactoryParametersEntity.JSON_PROPERTY_DATE_MODIFIED,
  FactoryParametersEntity.JSON_PROPERTY_STATUS
})
@JsonTypeName("factoryParametersEntity")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.959198+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FactoryParametersEntity {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENGINE_TYPE = "engineType";
  private DatabaseEngineType engineType;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_TOPOLOGY = "topology";
  private String topology;

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private List<DatabaseParameterType> parameters = null;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private Date dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private Date dateModified;

  public static final String JSON_PROPERTY_STATUS = "status";
  private DatabaseParameterTypeStatus status;


  public FactoryParametersEntity id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public FactoryParametersEntity name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * user created profile name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "user created profile name")
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


  public FactoryParametersEntity description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * edition of license
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "edition of license")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public FactoryParametersEntity engineType(DatabaseEngineType engineType) {
    
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


  public FactoryParametersEntity version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public FactoryParametersEntity topology(String topology) {
    
    this.topology = topology;
    return this;
  }

   /**
   * Get topology
   * @return topology
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOPOLOGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTopology() {
    return topology;
  }


  @JsonProperty(JSON_PROPERTY_TOPOLOGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopology(String topology) {
    this.topology = topology;
  }


  public FactoryParametersEntity parameters(List<DatabaseParameterType> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public FactoryParametersEntity addParametersItem(DatabaseParameterType parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Database Parameter Profile&#39;s associated parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Database Parameter Profile's associated parameters")
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DatabaseParameterType> getParameters() {
    return parameters;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameters(List<DatabaseParameterType> parameters) {
    this.parameters = parameters;
  }


  public FactoryParametersEntity dateCreated(Date dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * create date
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "create date")
  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  public FactoryParametersEntity dateModified(Date dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Get dateModified
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDateModified() {
    return dateModified;
  }


  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  public FactoryParametersEntity status(DatabaseParameterTypeStatus status) {
    
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

  public DatabaseParameterTypeStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(DatabaseParameterTypeStatus status) {
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
    FactoryParametersEntity factoryParametersEntity = (FactoryParametersEntity) o;
    return Objects.equals(this.id, factoryParametersEntity.id) &&
        Objects.equals(this.name, factoryParametersEntity.name) &&
        Objects.equals(this.description, factoryParametersEntity.description) &&
        Objects.equals(this.engineType, factoryParametersEntity.engineType) &&
        Objects.equals(this.version, factoryParametersEntity.version) &&
        Objects.equals(this.topology, factoryParametersEntity.topology) &&
        Objects.equals(this.parameters, factoryParametersEntity.parameters) &&
        Objects.equals(this.dateCreated, factoryParametersEntity.dateCreated) &&
        Objects.equals(this.dateModified, factoryParametersEntity.dateModified) &&
        Objects.equals(this.status, factoryParametersEntity.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, engineType, version, topology, parameters, dateCreated, dateModified, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactoryParametersEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

