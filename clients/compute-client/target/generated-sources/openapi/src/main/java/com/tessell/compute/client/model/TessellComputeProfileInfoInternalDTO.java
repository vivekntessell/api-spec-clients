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
import com.tessell.compute.client.model.TessellComputeArchitectureDTO;
import com.tessell.compute.client.model.TessellCpuConfigDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Compute Profile Metadata for Internal Use
 */
@ApiModel(description = "Compute Profile Metadata for Internal Use")
@JsonPropertyOrder({
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_READ_IOPS,
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_WRITE_IOPS,
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_MEMORY_G_B,
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_NO_OF_DISKS,
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_MAX_NO_OF_DISKS,
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_MIN_STORAGE_G_B,
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_MAX_STORAGE_G_B,
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_VCPUS,
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_ALLOWED_VCPU_VALUES,
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_IO2_BLOCK_EXPRESS_ENABLED,
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_CPU_CONFIG,
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_HYPER_THREADING,
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_WORKLOAD_TYPE,
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_USABLE_STORAGE_G_B,
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_TSM,
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_TSM_META_SIZE,
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_ARCHITECTURE,
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_MAX_THROUGHPUT_M_BPS,
  TessellComputeProfileInfoInternalDTO.JSON_PROPERTY_MAX_IOPS
})
@JsonTypeName("ComputeProfileInfoInternal")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:15.462654+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellComputeProfileInfoInternalDTO {
  public static final String JSON_PROPERTY_READ_IOPS = "readIops";
  private Integer readIops;

  public static final String JSON_PROPERTY_WRITE_IOPS = "writeIops";
  private Integer writeIops;

  public static final String JSON_PROPERTY_MEMORY_G_B = "memoryGB";
  private Float memoryGB;

  public static final String JSON_PROPERTY_NO_OF_DISKS = "noOfDisks";
  private Integer noOfDisks;

  public static final String JSON_PROPERTY_MAX_NO_OF_DISKS = "maxNoOfDisks";
  private Integer maxNoOfDisks;

  public static final String JSON_PROPERTY_MIN_STORAGE_G_B = "minStorageGB";
  private Integer minStorageGB;

  public static final String JSON_PROPERTY_MAX_STORAGE_G_B = "maxStorageGB";
  private Integer maxStorageGB;

  public static final String JSON_PROPERTY_VCPUS = "vcpus";
  private Integer vcpus;

  public static final String JSON_PROPERTY_ALLOWED_VCPU_VALUES = "allowedVcpuValues";
  private List<Integer> allowedVcpuValues = null;

  public static final String JSON_PROPERTY_IO2_BLOCK_EXPRESS_ENABLED = "io2BlockExpressEnabled";
  private Boolean io2BlockExpressEnabled = false;

  public static final String JSON_PROPERTY_CPU_CONFIG = "cpuConfig";
  private TessellCpuConfigDTO cpuConfig;

  public static final String JSON_PROPERTY_HYPER_THREADING = "hyperThreading";
  private String hyperThreading;

  public static final String JSON_PROPERTY_WORKLOAD_TYPE = "workloadType";
  private String workloadType;

  public static final String JSON_PROPERTY_USABLE_STORAGE_G_B = "usableStorageGB";
  private Integer usableStorageGB;

  public static final String JSON_PROPERTY_TSM = "tsm";
  private Boolean tsm;

  public static final String JSON_PROPERTY_TSM_META_SIZE = "tsmMetaSize";
  private Integer tsmMetaSize;

  public static final String JSON_PROPERTY_ARCHITECTURE = "architecture";
  private TessellComputeArchitectureDTO architecture;

  public static final String JSON_PROPERTY_MAX_THROUGHPUT_M_BPS = "maxThroughputMBps";
  private Integer maxThroughputMBps;

  public static final String JSON_PROPERTY_MAX_IOPS = "maxIops";
  private Integer maxIops;


  public TessellComputeProfileInfoInternalDTO readIops(Integer readIops) {
    
    this.readIops = readIops;
    return this;
  }

   /**
   * Read IOPS throughput supported by an instance
   * @return readIops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read IOPS throughput supported by an instance")
  @JsonProperty(JSON_PROPERTY_READ_IOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReadIops() {
    return readIops;
  }


  @JsonProperty(JSON_PROPERTY_READ_IOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadIops(Integer readIops) {
    this.readIops = readIops;
  }


  public TessellComputeProfileInfoInternalDTO writeIops(Integer writeIops) {
    
    this.writeIops = writeIops;
    return this;
  }

   /**
   * Write IOPS throughput supported by an instance
   * @return writeIops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Write IOPS throughput supported by an instance")
  @JsonProperty(JSON_PROPERTY_WRITE_IOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWriteIops() {
    return writeIops;
  }


  @JsonProperty(JSON_PROPERTY_WRITE_IOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWriteIops(Integer writeIops) {
    this.writeIops = writeIops;
  }


  public TessellComputeProfileInfoInternalDTO memoryGB(Float memoryGB) {
    
    this.memoryGB = memoryGB;
    return this;
  }

   /**
   * Amount of memory (GB) in this compute
   * @return memoryGB
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of memory (GB) in this compute")
  @JsonProperty(JSON_PROPERTY_MEMORY_G_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getMemoryGB() {
    return memoryGB;
  }


  @JsonProperty(JSON_PROPERTY_MEMORY_G_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemoryGB(Float memoryGB) {
    this.memoryGB = memoryGB;
  }


  public TessellComputeProfileInfoInternalDTO noOfDisks(Integer noOfDisks) {
    
    this.noOfDisks = noOfDisks;
    return this;
  }

   /**
   * No of disks attached to a compute instance
   * @return noOfDisks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "No of disks attached to a compute instance")
  @JsonProperty(JSON_PROPERTY_NO_OF_DISKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNoOfDisks() {
    return noOfDisks;
  }


  @JsonProperty(JSON_PROPERTY_NO_OF_DISKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoOfDisks(Integer noOfDisks) {
    this.noOfDisks = noOfDisks;
  }


  public TessellComputeProfileInfoInternalDTO maxNoOfDisks(Integer maxNoOfDisks) {
    
    this.maxNoOfDisks = maxNoOfDisks;
    return this;
  }

   /**
   * No of disks attached to a compute instance
   * @return maxNoOfDisks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "No of disks attached to a compute instance")
  @JsonProperty(JSON_PROPERTY_MAX_NO_OF_DISKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxNoOfDisks() {
    return maxNoOfDisks;
  }


  @JsonProperty(JSON_PROPERTY_MAX_NO_OF_DISKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxNoOfDisks(Integer maxNoOfDisks) {
    this.maxNoOfDisks = maxNoOfDisks;
  }


  public TessellComputeProfileInfoInternalDTO minStorageGB(Integer minStorageGB) {
    
    this.minStorageGB = minStorageGB;
    return this;
  }

   /**
   * Amount of min storage (GiB) supported by this compute shape
   * @return minStorageGB
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of min storage (GiB) supported by this compute shape")
  @JsonProperty(JSON_PROPERTY_MIN_STORAGE_G_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinStorageGB() {
    return minStorageGB;
  }


  @JsonProperty(JSON_PROPERTY_MIN_STORAGE_G_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinStorageGB(Integer minStorageGB) {
    this.minStorageGB = minStorageGB;
  }


  public TessellComputeProfileInfoInternalDTO maxStorageGB(Integer maxStorageGB) {
    
    this.maxStorageGB = maxStorageGB;
    return this;
  }

   /**
   * Amount of max storage (GiB) supported by this compute shape
   * @return maxStorageGB
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of max storage (GiB) supported by this compute shape")
  @JsonProperty(JSON_PROPERTY_MAX_STORAGE_G_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxStorageGB() {
    return maxStorageGB;
  }


  @JsonProperty(JSON_PROPERTY_MAX_STORAGE_G_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxStorageGB(Integer maxStorageGB) {
    this.maxStorageGB = maxStorageGB;
  }


  public TessellComputeProfileInfoInternalDTO vcpus(Integer vcpus) {
    
    this.vcpus = vcpus;
    return this;
  }

   /**
   * Number of VCPUs in this compute
   * @return vcpus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of VCPUs in this compute")
  @JsonProperty(JSON_PROPERTY_VCPUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVcpus() {
    return vcpus;
  }


  @JsonProperty(JSON_PROPERTY_VCPUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVcpus(Integer vcpus) {
    this.vcpus = vcpus;
  }


  public TessellComputeProfileInfoInternalDTO allowedVcpuValues(List<Integer> allowedVcpuValues) {
    
    this.allowedVcpuValues = allowedVcpuValues;
    return this;
  }

  public TessellComputeProfileInfoInternalDTO addAllowedVcpuValuesItem(Integer allowedVcpuValuesItem) {
    if (this.allowedVcpuValues == null) {
      this.allowedVcpuValues = new ArrayList<>();
    }
    this.allowedVcpuValues.add(allowedVcpuValuesItem);
    return this;
  }

   /**
   * Allowed Values of Vcpu in the shape
   * @return allowedVcpuValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allowed Values of Vcpu in the shape")
  @JsonProperty(JSON_PROPERTY_ALLOWED_VCPU_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getAllowedVcpuValues() {
    return allowedVcpuValues;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_VCPU_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedVcpuValues(List<Integer> allowedVcpuValues) {
    this.allowedVcpuValues = allowedVcpuValues;
  }


  public TessellComputeProfileInfoInternalDTO io2BlockExpressEnabled(Boolean io2BlockExpressEnabled) {
    
    this.io2BlockExpressEnabled = io2BlockExpressEnabled;
    return this;
  }

   /**
   * Shape Supports io2 Block Express volume
   * @return io2BlockExpressEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shape Supports io2 Block Express volume")
  @JsonProperty(JSON_PROPERTY_IO2_BLOCK_EXPRESS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIo2BlockExpressEnabled() {
    return io2BlockExpressEnabled;
  }


  @JsonProperty(JSON_PROPERTY_IO2_BLOCK_EXPRESS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIo2BlockExpressEnabled(Boolean io2BlockExpressEnabled) {
    this.io2BlockExpressEnabled = io2BlockExpressEnabled;
  }


  public TessellComputeProfileInfoInternalDTO cpuConfig(TessellCpuConfigDTO cpuConfig) {
    
    this.cpuConfig = cpuConfig;
    return this;
  }

   /**
   * Get cpuConfig
   * @return cpuConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CPU_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellCpuConfigDTO getCpuConfig() {
    return cpuConfig;
  }


  @JsonProperty(JSON_PROPERTY_CPU_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpuConfig(TessellCpuConfigDTO cpuConfig) {
    this.cpuConfig = cpuConfig;
  }


  public TessellComputeProfileInfoInternalDTO hyperThreading(String hyperThreading) {
    
    this.hyperThreading = hyperThreading;
    return this;
  }

   /**
   * Hyperthreading status
   * @return hyperThreading
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hyperthreading status")
  @JsonProperty(JSON_PROPERTY_HYPER_THREADING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHyperThreading() {
    return hyperThreading;
  }


  @JsonProperty(JSON_PROPERTY_HYPER_THREADING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHyperThreading(String hyperThreading) {
    this.hyperThreading = hyperThreading;
  }


  public TessellComputeProfileInfoInternalDTO workloadType(String workloadType) {
    
    this.workloadType = workloadType;
    return this;
  }

   /**
   * Type of compute
   * @return workloadType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of compute")
  @JsonProperty(JSON_PROPERTY_WORKLOAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWorkloadType() {
    return workloadType;
  }


  @JsonProperty(JSON_PROPERTY_WORKLOAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkloadType(String workloadType) {
    this.workloadType = workloadType;
  }


  public TessellComputeProfileInfoInternalDTO usableStorageGB(Integer usableStorageGB) {
    
    this.usableStorageGB = usableStorageGB;
    return this;
  }

   /**
   * Amount of usable storage (GiB) supported by this compute shape
   * @return usableStorageGB
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of usable storage (GiB) supported by this compute shape")
  @JsonProperty(JSON_PROPERTY_USABLE_STORAGE_G_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUsableStorageGB() {
    return usableStorageGB;
  }


  @JsonProperty(JSON_PROPERTY_USABLE_STORAGE_G_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsableStorageGB(Integer usableStorageGB) {
    this.usableStorageGB = usableStorageGB;
  }


  public TessellComputeProfileInfoInternalDTO tsm(Boolean tsm) {
    
    this.tsm = tsm;
    return this;
  }

   /**
   * Is TSM Shape
   * @return tsm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is TSM Shape")
  @JsonProperty(JSON_PROPERTY_TSM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTsm() {
    return tsm;
  }


  @JsonProperty(JSON_PROPERTY_TSM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTsm(Boolean tsm) {
    this.tsm = tsm;
  }


  public TessellComputeProfileInfoInternalDTO tsmMetaSize(Integer tsmMetaSize) {
    
    this.tsmMetaSize = tsmMetaSize;
    return this;
  }

   /**
   * Storage Required for TSM
   * @return tsmMetaSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Storage Required for TSM")
  @JsonProperty(JSON_PROPERTY_TSM_META_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTsmMetaSize() {
    return tsmMetaSize;
  }


  @JsonProperty(JSON_PROPERTY_TSM_META_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTsmMetaSize(Integer tsmMetaSize) {
    this.tsmMetaSize = tsmMetaSize;
  }


  public TessellComputeProfileInfoInternalDTO architecture(TessellComputeArchitectureDTO architecture) {
    
    this.architecture = architecture;
    return this;
  }

   /**
   * Get architecture
   * @return architecture
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ARCHITECTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellComputeArchitectureDTO getArchitecture() {
    return architecture;
  }


  @JsonProperty(JSON_PROPERTY_ARCHITECTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArchitecture(TessellComputeArchitectureDTO architecture) {
    this.architecture = architecture;
  }


  public TessellComputeProfileInfoInternalDTO maxThroughputMBps(Integer maxThroughputMBps) {
    
    this.maxThroughputMBps = maxThroughputMBps;
    return this;
  }

   /**
   * Maximum Throughput supported by underlying disks (in MB/s)
   * @return maxThroughputMBps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum Throughput supported by underlying disks (in MB/s)")
  @JsonProperty(JSON_PROPERTY_MAX_THROUGHPUT_M_BPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxThroughputMBps() {
    return maxThroughputMBps;
  }


  @JsonProperty(JSON_PROPERTY_MAX_THROUGHPUT_M_BPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxThroughputMBps(Integer maxThroughputMBps) {
    this.maxThroughputMBps = maxThroughputMBps;
  }


  public TessellComputeProfileInfoInternalDTO maxIops(Integer maxIops) {
    
    this.maxIops = maxIops;
    return this;
  }

   /**
   * Maximum IOPS supported by underlying disks
   * @return maxIops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum IOPS supported by underlying disks")
  @JsonProperty(JSON_PROPERTY_MAX_IOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxIops() {
    return maxIops;
  }


  @JsonProperty(JSON_PROPERTY_MAX_IOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxIops(Integer maxIops) {
    this.maxIops = maxIops;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellComputeProfileInfoInternalDTO computeProfileInfoInternal = (TessellComputeProfileInfoInternalDTO) o;
    return Objects.equals(this.readIops, computeProfileInfoInternal.readIops) &&
        Objects.equals(this.writeIops, computeProfileInfoInternal.writeIops) &&
        Objects.equals(this.memoryGB, computeProfileInfoInternal.memoryGB) &&
        Objects.equals(this.noOfDisks, computeProfileInfoInternal.noOfDisks) &&
        Objects.equals(this.maxNoOfDisks, computeProfileInfoInternal.maxNoOfDisks) &&
        Objects.equals(this.minStorageGB, computeProfileInfoInternal.minStorageGB) &&
        Objects.equals(this.maxStorageGB, computeProfileInfoInternal.maxStorageGB) &&
        Objects.equals(this.vcpus, computeProfileInfoInternal.vcpus) &&
        Objects.equals(this.allowedVcpuValues, computeProfileInfoInternal.allowedVcpuValues) &&
        Objects.equals(this.io2BlockExpressEnabled, computeProfileInfoInternal.io2BlockExpressEnabled) &&
        Objects.equals(this.cpuConfig, computeProfileInfoInternal.cpuConfig) &&
        Objects.equals(this.hyperThreading, computeProfileInfoInternal.hyperThreading) &&
        Objects.equals(this.workloadType, computeProfileInfoInternal.workloadType) &&
        Objects.equals(this.usableStorageGB, computeProfileInfoInternal.usableStorageGB) &&
        Objects.equals(this.tsm, computeProfileInfoInternal.tsm) &&
        Objects.equals(this.tsmMetaSize, computeProfileInfoInternal.tsmMetaSize) &&
        Objects.equals(this.architecture, computeProfileInfoInternal.architecture) &&
        Objects.equals(this.maxThroughputMBps, computeProfileInfoInternal.maxThroughputMBps) &&
        Objects.equals(this.maxIops, computeProfileInfoInternal.maxIops);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readIops, writeIops, memoryGB, noOfDisks, maxNoOfDisks, minStorageGB, maxStorageGB, vcpus, allowedVcpuValues, io2BlockExpressEnabled, cpuConfig, hyperThreading, workloadType, usableStorageGB, tsm, tsmMetaSize, architecture, maxThroughputMBps, maxIops);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellComputeProfileInfoInternalDTO {\n");
    sb.append("    readIops: ").append(toIndentedString(readIops)).append("\n");
    sb.append("    writeIops: ").append(toIndentedString(writeIops)).append("\n");
    sb.append("    memoryGB: ").append(toIndentedString(memoryGB)).append("\n");
    sb.append("    noOfDisks: ").append(toIndentedString(noOfDisks)).append("\n");
    sb.append("    maxNoOfDisks: ").append(toIndentedString(maxNoOfDisks)).append("\n");
    sb.append("    minStorageGB: ").append(toIndentedString(minStorageGB)).append("\n");
    sb.append("    maxStorageGB: ").append(toIndentedString(maxStorageGB)).append("\n");
    sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
    sb.append("    allowedVcpuValues: ").append(toIndentedString(allowedVcpuValues)).append("\n");
    sb.append("    io2BlockExpressEnabled: ").append(toIndentedString(io2BlockExpressEnabled)).append("\n");
    sb.append("    cpuConfig: ").append(toIndentedString(cpuConfig)).append("\n");
    sb.append("    hyperThreading: ").append(toIndentedString(hyperThreading)).append("\n");
    sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
    sb.append("    usableStorageGB: ").append(toIndentedString(usableStorageGB)).append("\n");
    sb.append("    tsm: ").append(toIndentedString(tsm)).append("\n");
    sb.append("    tsmMetaSize: ").append(toIndentedString(tsmMetaSize)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    maxThroughputMBps: ").append(toIndentedString(maxThroughputMBps)).append("\n");
    sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
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

