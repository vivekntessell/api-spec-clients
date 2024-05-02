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
import com.tessell.database.system.client.model.MilvusCreateCollectionConfigSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * MilvusCreateCollectionConfig
 */
@JsonPropertyOrder({
  MilvusCreateCollectionConfig.JSON_PROPERTY_NAME,
  MilvusCreateCollectionConfig.JSON_PROPERTY_SHARD_NUMS,
  MilvusCreateCollectionConfig.JSON_PROPERTY_NUM_PARTITIONS,
  MilvusCreateCollectionConfig.JSON_PROPERTY_SCHEMA
})
@JsonTypeName("MilvusCreateCollectionConfig")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MilvusCreateCollectionConfig {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SHARD_NUMS = "shardNums";
  private Integer shardNums;

  public static final String JSON_PROPERTY_NUM_PARTITIONS = "numPartitions";
  private Integer numPartitions;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private MilvusCreateCollectionConfigSchema schema;


  public MilvusCreateCollectionConfig name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public MilvusCreateCollectionConfig shardNums(Integer shardNums) {
    
    this.shardNums = shardNums;
    return this;
  }

   /**
   * Get shardNums
   * minimum: 1
   * maximum: 16
   * @return shardNums
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHARD_NUMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getShardNums() {
    return shardNums;
  }


  @JsonProperty(JSON_PROPERTY_SHARD_NUMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShardNums(Integer shardNums) {
    this.shardNums = shardNums;
  }


  public MilvusCreateCollectionConfig numPartitions(Integer numPartitions) {
    
    this.numPartitions = numPartitions;
    return this;
  }

   /**
   * Get numPartitions
   * minimum: 1
   * maximum: 4096
   * @return numPartitions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUM_PARTITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumPartitions() {
    return numPartitions;
  }


  @JsonProperty(JSON_PROPERTY_NUM_PARTITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumPartitions(Integer numPartitions) {
    this.numPartitions = numPartitions;
  }


  public MilvusCreateCollectionConfig schema(MilvusCreateCollectionConfigSchema schema) {
    
    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MilvusCreateCollectionConfigSchema getSchema() {
    return schema;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchema(MilvusCreateCollectionConfigSchema schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MilvusCreateCollectionConfig milvusCreateCollectionConfig = (MilvusCreateCollectionConfig) o;
    return Objects.equals(this.name, milvusCreateCollectionConfig.name) &&
        Objects.equals(this.shardNums, milvusCreateCollectionConfig.shardNums) &&
        Objects.equals(this.numPartitions, milvusCreateCollectionConfig.numPartitions) &&
        Objects.equals(this.schema, milvusCreateCollectionConfig.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shardNums, numPartitions, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MilvusCreateCollectionConfig {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shardNums: ").append(toIndentedString(shardNums)).append("\n");
    sb.append("    numPartitions: ").append(toIndentedString(numPartitions)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

