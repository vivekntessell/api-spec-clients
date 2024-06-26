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
import com.tessell.database.system.client.model.AwsInfraConfig;
import com.tessell.database.system.client.model.CloudRegionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This field contains DB Service&#39;s infrastructure related information, like, where the service is hosted - cloud, region; what compute shape, or network is is configured with.
 */
@ApiModel(description = "This field contains DB Service's infrastructure related information, like, where the service is hosted - cloud, region; what compute shape, or network is is configured with.")
@JsonPropertyOrder({
  TessellServiceInfrastructureInfo.JSON_PROPERTY_CLOUD,
  TessellServiceInfrastructureInfo.JSON_PROPERTY_REGION,
  TessellServiceInfrastructureInfo.JSON_PROPERTY_AVAILABILITY_ZONE,
  TessellServiceInfrastructureInfo.JSON_PROPERTY_CLOUD_AVAILABILITY,
  TessellServiceInfrastructureInfo.JSON_PROPERTY_VPC,
  TessellServiceInfrastructureInfo.JSON_PROPERTY_ENABLE_ENCRYPTION,
  TessellServiceInfrastructureInfo.JSON_PROPERTY_ENCRYPTION_KEY,
  TessellServiceInfrastructureInfo.JSON_PROPERTY_COMPUTE_TYPE,
  TessellServiceInfrastructureInfo.JSON_PROPERTY_AWS_INFRA_CONFIG,
  TessellServiceInfrastructureInfo.JSON_PROPERTY_STORAGE,
  TessellServiceInfrastructureInfo.JSON_PROPERTY_ADDITIONAL_STORAGE,
  TessellServiceInfrastructureInfo.JSON_PROPERTY_ENABLE_COMPUTE_SHARING,
  TessellServiceInfrastructureInfo.JSON_PROPERTY_TIMEZONE,
  TessellServiceInfrastructureInfo.JSON_PROPERTY_MULTI_DISK,
  TessellServiceInfrastructureInfo.JSON_PROPERTY_IOPS,
  TessellServiceInfrastructureInfo.JSON_PROPERTY_THROUGHPUT
})
@JsonTypeName("TessellServiceInfrastructureInfo")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceInfrastructureInfo {
  public static final String JSON_PROPERTY_CLOUD = "cloud";
  private String cloud;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_AVAILABILITY_ZONE = "availabilityZone";
  private String availabilityZone;

  public static final String JSON_PROPERTY_CLOUD_AVAILABILITY = "cloudAvailability";
  private List<CloudRegionInfo> cloudAvailability = null;

  public static final String JSON_PROPERTY_VPC = "vpc";
  private String vpc;

  public static final String JSON_PROPERTY_ENABLE_ENCRYPTION = "enableEncryption";
  private Boolean enableEncryption = false;

  public static final String JSON_PROPERTY_ENCRYPTION_KEY = "encryptionKey";
  private String encryptionKey;

  public static final String JSON_PROPERTY_COMPUTE_TYPE = "computeType";
  private String computeType;

  public static final String JSON_PROPERTY_AWS_INFRA_CONFIG = "awsInfraConfig";
  private AwsInfraConfig awsInfraConfig;

  public static final String JSON_PROPERTY_STORAGE = "storage";
  private Long storage = 0l;

  public static final String JSON_PROPERTY_ADDITIONAL_STORAGE = "additionalStorage";
  private Long additionalStorage = 0l;

  public static final String JSON_PROPERTY_ENABLE_COMPUTE_SHARING = "enableComputeSharing";
  private Boolean enableComputeSharing;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone = "UTC";

  public static final String JSON_PROPERTY_MULTI_DISK = "multiDisk";
  private Boolean multiDisk;

  public static final String JSON_PROPERTY_IOPS = "iops";
  private Integer iops;

  public static final String JSON_PROPERTY_THROUGHPUT = "throughput";
  private Integer throughput;


  public TessellServiceInfrastructureInfo cloud(String cloud) {
    
    this.cloud = cloud;
    return this;
  }

   /**
   * The cloud-type in which the DB Service is provisioned (ex. aws, azure)
   * @return cloud
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cloud-type in which the DB Service is provisioned (ex. aws, azure)")
  @JsonProperty(JSON_PROPERTY_CLOUD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloud() {
    return cloud;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloud(String cloud) {
    this.cloud = cloud;
  }


  public TessellServiceInfrastructureInfo region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The region in which the DB Service provisioned
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The region in which the DB Service provisioned")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  public TessellServiceInfrastructureInfo availabilityZone(String availabilityZone) {
    
    this.availabilityZone = availabilityZone;
    return this;
  }

   /**
   * The availability-zone in which the DB Service is provisioned
   * @return availabilityZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The availability-zone in which the DB Service is provisioned")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAvailabilityZone() {
    return availabilityZone;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }


  public TessellServiceInfrastructureInfo cloudAvailability(List<CloudRegionInfo> cloudAvailability) {
    
    this.cloudAvailability = cloudAvailability;
    return this;
  }

  public TessellServiceInfrastructureInfo addCloudAvailabilityItem(CloudRegionInfo cloudAvailabilityItem) {
    if (this.cloudAvailability == null) {
      this.cloudAvailability = new ArrayList<>();
    }
    this.cloudAvailability.add(cloudAvailabilityItem);
    return this;
  }

   /**
   * Get cloudAvailability
   * @return cloudAvailability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CloudRegionInfo> getCloudAvailability() {
    return cloudAvailability;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAvailability(List<CloudRegionInfo> cloudAvailability) {
    this.cloudAvailability = cloudAvailability;
  }


  public TessellServiceInfrastructureInfo vpc(String vpc) {
    
    this.vpc = vpc;
    return this;
  }

   /**
   * The VPC to be used for provisioning the DB Service
   * @return vpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The VPC to be used for provisioning the DB Service")
  @JsonProperty(JSON_PROPERTY_VPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVpc() {
    return vpc;
  }


  @JsonProperty(JSON_PROPERTY_VPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpc(String vpc) {
    this.vpc = vpc;
  }


  public TessellServiceInfrastructureInfo enableEncryption(Boolean enableEncryption) {
    
    this.enableEncryption = enableEncryption;
    return this;
  }

   /**
   * Get enableEncryption
   * @return enableEncryption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLE_ENCRYPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableEncryption() {
    return enableEncryption;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_ENCRYPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableEncryption(Boolean enableEncryption) {
    this.enableEncryption = enableEncryption;
  }


  public TessellServiceInfrastructureInfo encryptionKey(String encryptionKey) {
    
    this.encryptionKey = encryptionKey;
    return this;
  }

   /**
   * The encryption key name which is used to encrypt the data at rest
   * @return encryptionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The encryption key name which is used to encrypt the data at rest")
  @JsonProperty(JSON_PROPERTY_ENCRYPTION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncryptionKey() {
    return encryptionKey;
  }


  @JsonProperty(JSON_PROPERTY_ENCRYPTION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptionKey(String encryptionKey) {
    this.encryptionKey = encryptionKey;
  }


  public TessellServiceInfrastructureInfo computeType(String computeType) {
    
    this.computeType = computeType;
    return this;
  }

   /**
   * The compute-type to be used for provisioning the DB Service
   * @return computeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The compute-type to be used for provisioning the DB Service")
  @JsonProperty(JSON_PROPERTY_COMPUTE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComputeType() {
    return computeType;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComputeType(String computeType) {
    this.computeType = computeType;
  }


  public TessellServiceInfrastructureInfo awsInfraConfig(AwsInfraConfig awsInfraConfig) {
    
    this.awsInfraConfig = awsInfraConfig;
    return this;
  }

   /**
   * Get awsInfraConfig
   * @return awsInfraConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AWS_INFRA_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AwsInfraConfig getAwsInfraConfig() {
    return awsInfraConfig;
  }


  @JsonProperty(JSON_PROPERTY_AWS_INFRA_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAwsInfraConfig(AwsInfraConfig awsInfraConfig) {
    this.awsInfraConfig = awsInfraConfig;
  }


  public TessellServiceInfrastructureInfo storage(Long storage) {
    
    this.storage = storage;
    return this;
  }

   /**
   * The storage (in bytes) that has been provisioned for the DB Service
   * minimum: 0
   * @return storage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The storage (in bytes) that has been provisioned for the DB Service")
  @JsonProperty(JSON_PROPERTY_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStorage() {
    return storage;
  }


  @JsonProperty(JSON_PROPERTY_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStorage(Long storage) {
    this.storage = storage;
  }


  public TessellServiceInfrastructureInfo additionalStorage(Long additionalStorage) {
    
    this.additionalStorage = additionalStorage;
    return this;
  }

   /**
   * Size in GB. This is maintained for backward compatibility and would be deprecated soon.
   * minimum: 0
   * @return additionalStorage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size in GB. This is maintained for backward compatibility and would be deprecated soon.")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAdditionalStorage() {
    return additionalStorage;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_STORAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalStorage(Long additionalStorage) {
    this.additionalStorage = additionalStorage;
  }


  public TessellServiceInfrastructureInfo enableComputeSharing(Boolean enableComputeSharing) {
    
    this.enableComputeSharing = enableComputeSharing;
    return this;
  }

   /**
   * Specify if the computes should be shared across DB Services
   * @return enableComputeSharing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify if the computes should be shared across DB Services")
  @JsonProperty(JSON_PROPERTY_ENABLE_COMPUTE_SHARING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableComputeSharing() {
    return enableComputeSharing;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_COMPUTE_SHARING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableComputeSharing(Boolean enableComputeSharing) {
    this.enableComputeSharing = enableComputeSharing;
  }


  public TessellServiceInfrastructureInfo timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * The timezone detail
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timezone detail")
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public TessellServiceInfrastructureInfo multiDisk(Boolean multiDisk) {
    
    this.multiDisk = multiDisk;
    return this;
  }

   /**
   * Specify whether the DB service uses multiple data disks
   * @return multiDisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify whether the DB service uses multiple data disks")
  @JsonProperty(JSON_PROPERTY_MULTI_DISK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMultiDisk() {
    return multiDisk;
  }


  @JsonProperty(JSON_PROPERTY_MULTI_DISK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiDisk(Boolean multiDisk) {
    this.multiDisk = multiDisk;
  }


  public TessellServiceInfrastructureInfo iops(Integer iops) {
    
    this.iops = iops;
    return this;
  }

   /**
   * IOPS requested for the DB Service
   * @return iops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IOPS requested for the DB Service")
  @JsonProperty(JSON_PROPERTY_IOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIops() {
    return iops;
  }


  @JsonProperty(JSON_PROPERTY_IOPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIops(Integer iops) {
    this.iops = iops;
  }


  public TessellServiceInfrastructureInfo throughput(Integer throughput) {
    
    this.throughput = throughput;
    return this;
  }

   /**
   * throughput requested for the DB Service
   * @return throughput
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "throughput requested for the DB Service")
  @JsonProperty(JSON_PROPERTY_THROUGHPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getThroughput() {
    return throughput;
  }


  @JsonProperty(JSON_PROPERTY_THROUGHPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThroughput(Integer throughput) {
    this.throughput = throughput;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellServiceInfrastructureInfo tessellServiceInfrastructureInfo = (TessellServiceInfrastructureInfo) o;
    return Objects.equals(this.cloud, tessellServiceInfrastructureInfo.cloud) &&
        Objects.equals(this.region, tessellServiceInfrastructureInfo.region) &&
        Objects.equals(this.availabilityZone, tessellServiceInfrastructureInfo.availabilityZone) &&
        Objects.equals(this.cloudAvailability, tessellServiceInfrastructureInfo.cloudAvailability) &&
        Objects.equals(this.vpc, tessellServiceInfrastructureInfo.vpc) &&
        Objects.equals(this.enableEncryption, tessellServiceInfrastructureInfo.enableEncryption) &&
        Objects.equals(this.encryptionKey, tessellServiceInfrastructureInfo.encryptionKey) &&
        Objects.equals(this.computeType, tessellServiceInfrastructureInfo.computeType) &&
        Objects.equals(this.awsInfraConfig, tessellServiceInfrastructureInfo.awsInfraConfig) &&
        Objects.equals(this.storage, tessellServiceInfrastructureInfo.storage) &&
        Objects.equals(this.additionalStorage, tessellServiceInfrastructureInfo.additionalStorage) &&
        Objects.equals(this.enableComputeSharing, tessellServiceInfrastructureInfo.enableComputeSharing) &&
        Objects.equals(this.timezone, tessellServiceInfrastructureInfo.timezone) &&
        Objects.equals(this.multiDisk, tessellServiceInfrastructureInfo.multiDisk) &&
        Objects.equals(this.iops, tessellServiceInfrastructureInfo.iops) &&
        Objects.equals(this.throughput, tessellServiceInfrastructureInfo.throughput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloud, region, availabilityZone, cloudAvailability, vpc, enableEncryption, encryptionKey, computeType, awsInfraConfig, storage, additionalStorage, enableComputeSharing, timezone, multiDisk, iops, throughput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceInfrastructureInfo {\n");
    sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    cloudAvailability: ").append(toIndentedString(cloudAvailability)).append("\n");
    sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
    sb.append("    enableEncryption: ").append(toIndentedString(enableEncryption)).append("\n");
    sb.append("    encryptionKey: ").append(toIndentedString(encryptionKey)).append("\n");
    sb.append("    computeType: ").append(toIndentedString(computeType)).append("\n");
    sb.append("    awsInfraConfig: ").append(toIndentedString(awsInfraConfig)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    additionalStorage: ").append(toIndentedString(additionalStorage)).append("\n");
    sb.append("    enableComputeSharing: ").append(toIndentedString(enableComputeSharing)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    multiDisk: ").append(toIndentedString(multiDisk)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
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

