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
import com.tessell.dmm.client.model.MilvusDatabaseConfig;
import com.tessell.dmm.client.model.MongodbDatabaseConfig;
import com.tessell.dmm.client.model.MySqlDatabaseConfig;
import com.tessell.dmm.client.model.OracleDatabaseConfig;
import com.tessell.dmm.client.model.PostgresqlDatabaseConfig;
import com.tessell.dmm.client.model.SqlServerDatabaseConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DatabaseConfiguration
 */
@JsonPropertyOrder({
  DatabaseConfiguration.JSON_PROPERTY_ORACLE_CONFIG,
  DatabaseConfiguration.JSON_PROPERTY_POSTGRESQL_CONFIG,
  DatabaseConfiguration.JSON_PROPERTY_MY_SQL_CONFIG,
  DatabaseConfiguration.JSON_PROPERTY_SQL_SERVER_CONFIG,
  DatabaseConfiguration.JSON_PROPERTY_MONGODB_CONFIG,
  DatabaseConfiguration.JSON_PROPERTY_MILVUS_CONFIG
})
@JsonTypeName("DatabaseConfiguration")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DatabaseConfiguration {
  public static final String JSON_PROPERTY_ORACLE_CONFIG = "oracleConfig";
  private OracleDatabaseConfig oracleConfig;

  public static final String JSON_PROPERTY_POSTGRESQL_CONFIG = "postgresqlConfig";
  private PostgresqlDatabaseConfig postgresqlConfig;

  public static final String JSON_PROPERTY_MY_SQL_CONFIG = "mySqlConfig";
  private MySqlDatabaseConfig mySqlConfig;

  public static final String JSON_PROPERTY_SQL_SERVER_CONFIG = "sqlServerConfig";
  private SqlServerDatabaseConfig sqlServerConfig;

  public static final String JSON_PROPERTY_MONGODB_CONFIG = "mongodbConfig";
  private MongodbDatabaseConfig mongodbConfig;

  public static final String JSON_PROPERTY_MILVUS_CONFIG = "milvusConfig";
  private MilvusDatabaseConfig milvusConfig;


  public DatabaseConfiguration oracleConfig(OracleDatabaseConfig oracleConfig) {
    
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

  public OracleDatabaseConfig getOracleConfig() {
    return oracleConfig;
  }


  @JsonProperty(JSON_PROPERTY_ORACLE_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOracleConfig(OracleDatabaseConfig oracleConfig) {
    this.oracleConfig = oracleConfig;
  }


  public DatabaseConfiguration postgresqlConfig(PostgresqlDatabaseConfig postgresqlConfig) {
    
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

  public PostgresqlDatabaseConfig getPostgresqlConfig() {
    return postgresqlConfig;
  }


  @JsonProperty(JSON_PROPERTY_POSTGRESQL_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostgresqlConfig(PostgresqlDatabaseConfig postgresqlConfig) {
    this.postgresqlConfig = postgresqlConfig;
  }


  public DatabaseConfiguration mySqlConfig(MySqlDatabaseConfig mySqlConfig) {
    
    this.mySqlConfig = mySqlConfig;
    return this;
  }

   /**
   * Get mySqlConfig
   * @return mySqlConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MY_SQL_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MySqlDatabaseConfig getMySqlConfig() {
    return mySqlConfig;
  }


  @JsonProperty(JSON_PROPERTY_MY_SQL_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMySqlConfig(MySqlDatabaseConfig mySqlConfig) {
    this.mySqlConfig = mySqlConfig;
  }


  public DatabaseConfiguration sqlServerConfig(SqlServerDatabaseConfig sqlServerConfig) {
    
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

  public SqlServerDatabaseConfig getSqlServerConfig() {
    return sqlServerConfig;
  }


  @JsonProperty(JSON_PROPERTY_SQL_SERVER_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSqlServerConfig(SqlServerDatabaseConfig sqlServerConfig) {
    this.sqlServerConfig = sqlServerConfig;
  }


  public DatabaseConfiguration mongodbConfig(MongodbDatabaseConfig mongodbConfig) {
    
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

  public MongodbDatabaseConfig getMongodbConfig() {
    return mongodbConfig;
  }


  @JsonProperty(JSON_PROPERTY_MONGODB_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMongodbConfig(MongodbDatabaseConfig mongodbConfig) {
    this.mongodbConfig = mongodbConfig;
  }


  public DatabaseConfiguration milvusConfig(MilvusDatabaseConfig milvusConfig) {
    
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

  public MilvusDatabaseConfig getMilvusConfig() {
    return milvusConfig;
  }


  @JsonProperty(JSON_PROPERTY_MILVUS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMilvusConfig(MilvusDatabaseConfig milvusConfig) {
    this.milvusConfig = milvusConfig;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseConfiguration databaseConfiguration = (DatabaseConfiguration) o;
    return Objects.equals(this.oracleConfig, databaseConfiguration.oracleConfig) &&
        Objects.equals(this.postgresqlConfig, databaseConfiguration.postgresqlConfig) &&
        Objects.equals(this.mySqlConfig, databaseConfiguration.mySqlConfig) &&
        Objects.equals(this.sqlServerConfig, databaseConfiguration.sqlServerConfig) &&
        Objects.equals(this.mongodbConfig, databaseConfiguration.mongodbConfig) &&
        Objects.equals(this.milvusConfig, databaseConfiguration.milvusConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oracleConfig, postgresqlConfig, mySqlConfig, sqlServerConfig, mongodbConfig, milvusConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseConfiguration {\n");
    sb.append("    oracleConfig: ").append(toIndentedString(oracleConfig)).append("\n");
    sb.append("    postgresqlConfig: ").append(toIndentedString(postgresqlConfig)).append("\n");
    sb.append("    mySqlConfig: ").append(toIndentedString(mySqlConfig)).append("\n");
    sb.append("    sqlServerConfig: ").append(toIndentedString(sqlServerConfig)).append("\n");
    sb.append("    mongodbConfig: ").append(toIndentedString(mongodbConfig)).append("\n");
    sb.append("    milvusConfig: ").append(toIndentedString(milvusConfig)).append("\n");
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

