/*
 * Benchmark Service API
 * Benchmark Service API Specification
 *
 * The version of the OpenAPI document: 1.0
 * Contact: yashesh.mankad@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.benchmark.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.benchmark.client.model.TessellBenchmarkCatalogMetadataDTO;
import com.tessell.benchmark.client.model.TessellBenchmarkTypeDTO;
import com.tessell.benchmark.client.model.TessellDatabaseEngineTypeDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Benchmark Catalog object
 */
@ApiModel(description = "Benchmark Catalog object")
@JsonPropertyOrder({
  TessellBenchmarkCatalogDTO.JSON_PROPERTY_ID,
  TessellBenchmarkCatalogDTO.JSON_PROPERTY_NAME,
  TessellBenchmarkCatalogDTO.JSON_PROPERTY_DESCRIPTION,
  TessellBenchmarkCatalogDTO.JSON_PROPERTY_BENCHMARK_TYPE,
  TessellBenchmarkCatalogDTO.JSON_PROPERTY_ENGINE_TYPE,
  TessellBenchmarkCatalogDTO.JSON_PROPERTY_VERSION,
  TessellBenchmarkCatalogDTO.JSON_PROPERTY_TENANT_ID,
  TessellBenchmarkCatalogDTO.JSON_PROPERTY_METADATA
})
@JsonTypeName("BenchmarkCatalog")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:13.006260+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellBenchmarkCatalogDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_BENCHMARK_TYPE = "benchmarkType";
  private TessellBenchmarkTypeDTO benchmarkType;

  public static final String JSON_PROPERTY_ENGINE_TYPE = "engineType";
  private TessellDatabaseEngineTypeDTO engineType;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private String tenantId;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private TessellBenchmarkCatalogMetadataDTO metadata;


  public TessellBenchmarkCatalogDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * entry identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "entry identifier")
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


  public TessellBenchmarkCatalogDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * entry name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "entry name")
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


  public TessellBenchmarkCatalogDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * entry description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "entry description")
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


  public TessellBenchmarkCatalogDTO benchmarkType(TessellBenchmarkTypeDTO benchmarkType) {
    
    this.benchmarkType = benchmarkType;
    return this;
  }

   /**
   * Get benchmarkType
   * @return benchmarkType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BENCHMARK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellBenchmarkTypeDTO getBenchmarkType() {
    return benchmarkType;
  }


  @JsonProperty(JSON_PROPERTY_BENCHMARK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBenchmarkType(TessellBenchmarkTypeDTO benchmarkType) {
    this.benchmarkType = benchmarkType;
  }


  public TessellBenchmarkCatalogDTO engineType(TessellDatabaseEngineTypeDTO engineType) {
    
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

  public TessellDatabaseEngineTypeDTO getEngineType() {
    return engineType;
  }


  @JsonProperty(JSON_PROPERTY_ENGINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEngineType(TessellDatabaseEngineTypeDTO engineType) {
    this.engineType = engineType;
  }


  public TessellBenchmarkCatalogDTO version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * catalog entry version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "catalog entry version")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(Integer version) {
    this.version = version;
  }


  public TessellBenchmarkCatalogDTO tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * tenant id
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "tenant id")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public TessellBenchmarkCatalogDTO metadata(TessellBenchmarkCatalogMetadataDTO metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * entry metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "entry metadata")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellBenchmarkCatalogMetadataDTO getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(TessellBenchmarkCatalogMetadataDTO metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellBenchmarkCatalogDTO benchmarkCatalog = (TessellBenchmarkCatalogDTO) o;
    return Objects.equals(this.id, benchmarkCatalog.id) &&
        Objects.equals(this.name, benchmarkCatalog.name) &&
        Objects.equals(this.description, benchmarkCatalog.description) &&
        Objects.equals(this.benchmarkType, benchmarkCatalog.benchmarkType) &&
        Objects.equals(this.engineType, benchmarkCatalog.engineType) &&
        Objects.equals(this.version, benchmarkCatalog.version) &&
        Objects.equals(this.tenantId, benchmarkCatalog.tenantId) &&
        Objects.equals(this.metadata, benchmarkCatalog.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, benchmarkType, engineType, version, tenantId, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellBenchmarkCatalogDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    benchmarkType: ").append(toIndentedString(benchmarkType)).append("\n");
    sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
