/*
 * Compute Governance API Documentation
 * Compute Governance  API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.compute.client.model;

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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellCpuConfigDTO
 */
@JsonPropertyOrder({
  TessellCpuConfigDTO.JSON_PROPERTY_CORES,
  TessellCpuConfigDTO.JSON_PROPERTY_THREADS,
  TessellCpuConfigDTO.JSON_PROPERTY_ALLOWED_CORE_VALUES
})
@JsonTypeName("CpuConfig")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:15.462654+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellCpuConfigDTO {
  public static final String JSON_PROPERTY_CORES = "cores";
  private Integer cores;

  public static final String JSON_PROPERTY_THREADS = "threads";
  private Integer threads;

  public static final String JSON_PROPERTY_ALLOWED_CORE_VALUES = "allowedCoreValues";
  private List<Integer> allowedCoreValues = null;


  public TessellCpuConfigDTO cores(Integer cores) {
    
    this.cores = cores;
    return this;
  }

   /**
   * Number of cores in the shape
   * @return cores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of cores in the shape")
  @JsonProperty(JSON_PROPERTY_CORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCores() {
    return cores;
  }


  @JsonProperty(JSON_PROPERTY_CORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCores(Integer cores) {
    this.cores = cores;
  }


  public TessellCpuConfigDTO threads(Integer threads) {
    
    this.threads = threads;
    return this;
  }

   /**
   * Number of threads in the shape
   * @return threads
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of threads in the shape")
  @JsonProperty(JSON_PROPERTY_THREADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getThreads() {
    return threads;
  }


  @JsonProperty(JSON_PROPERTY_THREADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreads(Integer threads) {
    this.threads = threads;
  }


  public TessellCpuConfigDTO allowedCoreValues(List<Integer> allowedCoreValues) {
    
    this.allowedCoreValues = allowedCoreValues;
    return this;
  }

  public TessellCpuConfigDTO addAllowedCoreValuesItem(Integer allowedCoreValuesItem) {
    if (this.allowedCoreValues == null) {
      this.allowedCoreValues = new ArrayList<>();
    }
    this.allowedCoreValues.add(allowedCoreValuesItem);
    return this;
  }

   /**
   * Allowed Values of Core in the shape
   * @return allowedCoreValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allowed Values of Core in the shape")
  @JsonProperty(JSON_PROPERTY_ALLOWED_CORE_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getAllowedCoreValues() {
    return allowedCoreValues;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_CORE_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedCoreValues(List<Integer> allowedCoreValues) {
    this.allowedCoreValues = allowedCoreValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellCpuConfigDTO cpuConfig = (TessellCpuConfigDTO) o;
    return Objects.equals(this.cores, cpuConfig.cores) &&
        Objects.equals(this.threads, cpuConfig.threads) &&
        Objects.equals(this.allowedCoreValues, cpuConfig.allowedCoreValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cores, threads, allowedCoreValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellCpuConfigDTO {\n");
    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
    sb.append("    threads: ").append(toIndentedString(threads)).append("\n");
    sb.append("    allowedCoreValues: ").append(toIndentedString(allowedCoreValues)).append("\n");
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

