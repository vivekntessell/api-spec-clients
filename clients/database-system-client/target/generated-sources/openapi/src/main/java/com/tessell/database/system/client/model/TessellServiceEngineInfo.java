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
import com.tessell.database.system.client.model.ScriptInfo;
import com.tessell.database.system.client.model.TessellServiceApacheKafkaEngineConfig;
import com.tessell.database.system.client.model.TessellServiceMilvusEngineConfig;
import com.tessell.database.system.client.model.TessellServiceMongodbEngineConfig;
import com.tessell.database.system.client.model.TessellServiceMySqlEngineConfig;
import com.tessell.database.system.client.model.TessellServiceOracleEngineConfig;
import com.tessell.database.system.client.model.TessellServicePostgresqlEngineConfig;
import com.tessell.database.system.client.model.TessellServiceSqlServerEngineConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This field details the DB Service engine configuration details like - parameter profile, or options profile (if applicable) are used to configure the DB Service.
 */
@ApiModel(description = "This field details the DB Service engine configuration details like - parameter profile, or options profile (if applicable) are used to configure the DB Service.")
@JsonPropertyOrder({
  TessellServiceEngineInfo.JSON_PROPERTY_ORACLE_CONFIG,
  TessellServiceEngineInfo.JSON_PROPERTY_POSTGRESQL_CONFIG,
  TessellServiceEngineInfo.JSON_PROPERTY_MYSQL_CONFIG,
  TessellServiceEngineInfo.JSON_PROPERTY_SQL_SERVER_CONFIG,
  TessellServiceEngineInfo.JSON_PROPERTY_APACHE_KAFKA_CONFIG,
  TessellServiceEngineInfo.JSON_PROPERTY_MONGODB_CONFIG,
  TessellServiceEngineInfo.JSON_PROPERTY_MILVUS_CONFIG,
  TessellServiceEngineInfo.JSON_PROPERTY_PRE_SCRIPT_INFO,
  TessellServiceEngineInfo.JSON_PROPERTY_POST_SCRIPT_INFO
})
@JsonTypeName("TessellServiceEngineInfo")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceEngineInfo {
  public static final String JSON_PROPERTY_ORACLE_CONFIG = "oracleConfig";
  private TessellServiceOracleEngineConfig oracleConfig;

  public static final String JSON_PROPERTY_POSTGRESQL_CONFIG = "postgresqlConfig";
  private TessellServicePostgresqlEngineConfig postgresqlConfig;

  public static final String JSON_PROPERTY_MYSQL_CONFIG = "mysqlConfig";
  private TessellServiceMySqlEngineConfig mysqlConfig;

  public static final String JSON_PROPERTY_SQL_SERVER_CONFIG = "sqlServerConfig";
  private TessellServiceSqlServerEngineConfig sqlServerConfig;

  public static final String JSON_PROPERTY_APACHE_KAFKA_CONFIG = "apacheKafkaConfig";
  private TessellServiceApacheKafkaEngineConfig apacheKafkaConfig;

  public static final String JSON_PROPERTY_MONGODB_CONFIG = "mongodbConfig";
  private TessellServiceMongodbEngineConfig mongodbConfig;

  public static final String JSON_PROPERTY_MILVUS_CONFIG = "milvusConfig";
  private TessellServiceMilvusEngineConfig milvusConfig;

  public static final String JSON_PROPERTY_PRE_SCRIPT_INFO = "preScriptInfo";
  private ScriptInfo preScriptInfo;

  public static final String JSON_PROPERTY_POST_SCRIPT_INFO = "postScriptInfo";
  private ScriptInfo postScriptInfo;


  public TessellServiceEngineInfo oracleConfig(TessellServiceOracleEngineConfig oracleConfig) {
    
    this.oracleConfig = oracleConfig;
    return this;
  }

   /**
   * Get oracleConfig
   * @return oracleConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORACLE_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceOracleEngineConfig getOracleConfig() {
    return oracleConfig;
  }


  @JsonProperty(JSON_PROPERTY_ORACLE_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOracleConfig(TessellServiceOracleEngineConfig oracleConfig) {
    this.oracleConfig = oracleConfig;
  }


  public TessellServiceEngineInfo postgresqlConfig(TessellServicePostgresqlEngineConfig postgresqlConfig) {
    
    this.postgresqlConfig = postgresqlConfig;
    return this;
  }

   /**
   * Get postgresqlConfig
   * @return postgresqlConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSTGRESQL_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServicePostgresqlEngineConfig getPostgresqlConfig() {
    return postgresqlConfig;
  }


  @JsonProperty(JSON_PROPERTY_POSTGRESQL_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostgresqlConfig(TessellServicePostgresqlEngineConfig postgresqlConfig) {
    this.postgresqlConfig = postgresqlConfig;
  }


  public TessellServiceEngineInfo mysqlConfig(TessellServiceMySqlEngineConfig mysqlConfig) {
    
    this.mysqlConfig = mysqlConfig;
    return this;
  }

   /**
   * Get mysqlConfig
   * @return mysqlConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MYSQL_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceMySqlEngineConfig getMysqlConfig() {
    return mysqlConfig;
  }


  @JsonProperty(JSON_PROPERTY_MYSQL_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMysqlConfig(TessellServiceMySqlEngineConfig mysqlConfig) {
    this.mysqlConfig = mysqlConfig;
  }


  public TessellServiceEngineInfo sqlServerConfig(TessellServiceSqlServerEngineConfig sqlServerConfig) {
    
    this.sqlServerConfig = sqlServerConfig;
    return this;
  }

   /**
   * Get sqlServerConfig
   * @return sqlServerConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SQL_SERVER_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceSqlServerEngineConfig getSqlServerConfig() {
    return sqlServerConfig;
  }


  @JsonProperty(JSON_PROPERTY_SQL_SERVER_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSqlServerConfig(TessellServiceSqlServerEngineConfig sqlServerConfig) {
    this.sqlServerConfig = sqlServerConfig;
  }


  public TessellServiceEngineInfo apacheKafkaConfig(TessellServiceApacheKafkaEngineConfig apacheKafkaConfig) {
    
    this.apacheKafkaConfig = apacheKafkaConfig;
    return this;
  }

   /**
   * Get apacheKafkaConfig
   * @return apacheKafkaConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APACHE_KAFKA_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceApacheKafkaEngineConfig getApacheKafkaConfig() {
    return apacheKafkaConfig;
  }


  @JsonProperty(JSON_PROPERTY_APACHE_KAFKA_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApacheKafkaConfig(TessellServiceApacheKafkaEngineConfig apacheKafkaConfig) {
    this.apacheKafkaConfig = apacheKafkaConfig;
  }


  public TessellServiceEngineInfo mongodbConfig(TessellServiceMongodbEngineConfig mongodbConfig) {
    
    this.mongodbConfig = mongodbConfig;
    return this;
  }

   /**
   * Get mongodbConfig
   * @return mongodbConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MONGODB_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceMongodbEngineConfig getMongodbConfig() {
    return mongodbConfig;
  }


  @JsonProperty(JSON_PROPERTY_MONGODB_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMongodbConfig(TessellServiceMongodbEngineConfig mongodbConfig) {
    this.mongodbConfig = mongodbConfig;
  }


  public TessellServiceEngineInfo milvusConfig(TessellServiceMilvusEngineConfig milvusConfig) {
    
    this.milvusConfig = milvusConfig;
    return this;
  }

   /**
   * Get milvusConfig
   * @return milvusConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MILVUS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceMilvusEngineConfig getMilvusConfig() {
    return milvusConfig;
  }


  @JsonProperty(JSON_PROPERTY_MILVUS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMilvusConfig(TessellServiceMilvusEngineConfig milvusConfig) {
    this.milvusConfig = milvusConfig;
  }


  public TessellServiceEngineInfo preScriptInfo(ScriptInfo preScriptInfo) {
    
    this.preScriptInfo = preScriptInfo;
    return this;
  }

   /**
   * Get preScriptInfo
   * @return preScriptInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRE_SCRIPT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScriptInfo getPreScriptInfo() {
    return preScriptInfo;
  }


  @JsonProperty(JSON_PROPERTY_PRE_SCRIPT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreScriptInfo(ScriptInfo preScriptInfo) {
    this.preScriptInfo = preScriptInfo;
  }


  public TessellServiceEngineInfo postScriptInfo(ScriptInfo postScriptInfo) {
    
    this.postScriptInfo = postScriptInfo;
    return this;
  }

   /**
   * Get postScriptInfo
   * @return postScriptInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POST_SCRIPT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScriptInfo getPostScriptInfo() {
    return postScriptInfo;
  }


  @JsonProperty(JSON_PROPERTY_POST_SCRIPT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostScriptInfo(ScriptInfo postScriptInfo) {
    this.postScriptInfo = postScriptInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellServiceEngineInfo tessellServiceEngineInfo = (TessellServiceEngineInfo) o;
    return Objects.equals(this.oracleConfig, tessellServiceEngineInfo.oracleConfig) &&
        Objects.equals(this.postgresqlConfig, tessellServiceEngineInfo.postgresqlConfig) &&
        Objects.equals(this.mysqlConfig, tessellServiceEngineInfo.mysqlConfig) &&
        Objects.equals(this.sqlServerConfig, tessellServiceEngineInfo.sqlServerConfig) &&
        Objects.equals(this.apacheKafkaConfig, tessellServiceEngineInfo.apacheKafkaConfig) &&
        Objects.equals(this.mongodbConfig, tessellServiceEngineInfo.mongodbConfig) &&
        Objects.equals(this.milvusConfig, tessellServiceEngineInfo.milvusConfig) &&
        Objects.equals(this.preScriptInfo, tessellServiceEngineInfo.preScriptInfo) &&
        Objects.equals(this.postScriptInfo, tessellServiceEngineInfo.postScriptInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oracleConfig, postgresqlConfig, mysqlConfig, sqlServerConfig, apacheKafkaConfig, mongodbConfig, milvusConfig, preScriptInfo, postScriptInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceEngineInfo {\n");
    sb.append("    oracleConfig: ").append(toIndentedString(oracleConfig)).append("\n");
    sb.append("    postgresqlConfig: ").append(toIndentedString(postgresqlConfig)).append("\n");
    sb.append("    mysqlConfig: ").append(toIndentedString(mysqlConfig)).append("\n");
    sb.append("    sqlServerConfig: ").append(toIndentedString(sqlServerConfig)).append("\n");
    sb.append("    apacheKafkaConfig: ").append(toIndentedString(apacheKafkaConfig)).append("\n");
    sb.append("    mongodbConfig: ").append(toIndentedString(mongodbConfig)).append("\n");
    sb.append("    milvusConfig: ").append(toIndentedString(milvusConfig)).append("\n");
    sb.append("    preScriptInfo: ").append(toIndentedString(preScriptInfo)).append("\n");
    sb.append("    postScriptInfo: ").append(toIndentedString(postScriptInfo)).append("\n");
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
