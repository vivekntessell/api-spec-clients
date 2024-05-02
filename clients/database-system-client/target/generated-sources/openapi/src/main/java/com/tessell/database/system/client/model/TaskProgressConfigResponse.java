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
import com.tessell.database.system.client.model.ResourceActionConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TaskProgressConfigResponse
 */
@JsonPropertyOrder({
  TaskProgressConfigResponse.JSON_PROPERTY_ORACLE,
  TaskProgressConfigResponse.JSON_PROPERTY_POSTGRESQL,
  TaskProgressConfigResponse.JSON_PROPERTY_SQLSERVER,
  TaskProgressConfigResponse.JSON_PROPERTY_MYSQL,
  TaskProgressConfigResponse.JSON_PROPERTY_APACHE_KAFKA,
  TaskProgressConfigResponse.JSON_PROPERTY_MONGODB,
  TaskProgressConfigResponse.JSON_PROPERTY_MILVUS
})
@JsonTypeName("TaskProgressConfigResponse")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskProgressConfigResponse {
  public static final String JSON_PROPERTY_ORACLE = "oracle";
  private List<ResourceActionConfig> oracle = null;

  public static final String JSON_PROPERTY_POSTGRESQL = "postgresql";
  private List<ResourceActionConfig> postgresql = null;

  public static final String JSON_PROPERTY_SQLSERVER = "sqlserver";
  private List<ResourceActionConfig> sqlserver = null;

  public static final String JSON_PROPERTY_MYSQL = "mysql";
  private List<ResourceActionConfig> mysql = null;

  public static final String JSON_PROPERTY_APACHE_KAFKA = "apache_kafka";
  private List<ResourceActionConfig> apacheKafka = null;

  public static final String JSON_PROPERTY_MONGODB = "mongodb";
  private List<ResourceActionConfig> mongodb = null;

  public static final String JSON_PROPERTY_MILVUS = "milvus";
  private List<ResourceActionConfig> milvus = null;


  public TaskProgressConfigResponse oracle(List<ResourceActionConfig> oracle) {
    
    this.oracle = oracle;
    return this;
  }

  public TaskProgressConfigResponse addOracleItem(ResourceActionConfig oracleItem) {
    if (this.oracle == null) {
      this.oracle = new ArrayList<>();
    }
    this.oracle.add(oracleItem);
    return this;
  }

   /**
   * Get oracle
   * @return oracle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORACLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ResourceActionConfig> getOracle() {
    return oracle;
  }


  @JsonProperty(JSON_PROPERTY_ORACLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOracle(List<ResourceActionConfig> oracle) {
    this.oracle = oracle;
  }


  public TaskProgressConfigResponse postgresql(List<ResourceActionConfig> postgresql) {
    
    this.postgresql = postgresql;
    return this;
  }

  public TaskProgressConfigResponse addPostgresqlItem(ResourceActionConfig postgresqlItem) {
    if (this.postgresql == null) {
      this.postgresql = new ArrayList<>();
    }
    this.postgresql.add(postgresqlItem);
    return this;
  }

   /**
   * Get postgresql
   * @return postgresql
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSTGRESQL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ResourceActionConfig> getPostgresql() {
    return postgresql;
  }


  @JsonProperty(JSON_PROPERTY_POSTGRESQL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostgresql(List<ResourceActionConfig> postgresql) {
    this.postgresql = postgresql;
  }


  public TaskProgressConfigResponse sqlserver(List<ResourceActionConfig> sqlserver) {
    
    this.sqlserver = sqlserver;
    return this;
  }

  public TaskProgressConfigResponse addSqlserverItem(ResourceActionConfig sqlserverItem) {
    if (this.sqlserver == null) {
      this.sqlserver = new ArrayList<>();
    }
    this.sqlserver.add(sqlserverItem);
    return this;
  }

   /**
   * Get sqlserver
   * @return sqlserver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SQLSERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ResourceActionConfig> getSqlserver() {
    return sqlserver;
  }


  @JsonProperty(JSON_PROPERTY_SQLSERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSqlserver(List<ResourceActionConfig> sqlserver) {
    this.sqlserver = sqlserver;
  }


  public TaskProgressConfigResponse mysql(List<ResourceActionConfig> mysql) {
    
    this.mysql = mysql;
    return this;
  }

  public TaskProgressConfigResponse addMysqlItem(ResourceActionConfig mysqlItem) {
    if (this.mysql == null) {
      this.mysql = new ArrayList<>();
    }
    this.mysql.add(mysqlItem);
    return this;
  }

   /**
   * Get mysql
   * @return mysql
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MYSQL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ResourceActionConfig> getMysql() {
    return mysql;
  }


  @JsonProperty(JSON_PROPERTY_MYSQL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMysql(List<ResourceActionConfig> mysql) {
    this.mysql = mysql;
  }


  public TaskProgressConfigResponse apacheKafka(List<ResourceActionConfig> apacheKafka) {
    
    this.apacheKafka = apacheKafka;
    return this;
  }

  public TaskProgressConfigResponse addApacheKafkaItem(ResourceActionConfig apacheKafkaItem) {
    if (this.apacheKafka == null) {
      this.apacheKafka = new ArrayList<>();
    }
    this.apacheKafka.add(apacheKafkaItem);
    return this;
  }

   /**
   * Get apacheKafka
   * @return apacheKafka
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APACHE_KAFKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ResourceActionConfig> getApacheKafka() {
    return apacheKafka;
  }


  @JsonProperty(JSON_PROPERTY_APACHE_KAFKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApacheKafka(List<ResourceActionConfig> apacheKafka) {
    this.apacheKafka = apacheKafka;
  }


  public TaskProgressConfigResponse mongodb(List<ResourceActionConfig> mongodb) {
    
    this.mongodb = mongodb;
    return this;
  }

  public TaskProgressConfigResponse addMongodbItem(ResourceActionConfig mongodbItem) {
    if (this.mongodb == null) {
      this.mongodb = new ArrayList<>();
    }
    this.mongodb.add(mongodbItem);
    return this;
  }

   /**
   * Get mongodb
   * @return mongodb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MONGODB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ResourceActionConfig> getMongodb() {
    return mongodb;
  }


  @JsonProperty(JSON_PROPERTY_MONGODB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMongodb(List<ResourceActionConfig> mongodb) {
    this.mongodb = mongodb;
  }


  public TaskProgressConfigResponse milvus(List<ResourceActionConfig> milvus) {
    
    this.milvus = milvus;
    return this;
  }

  public TaskProgressConfigResponse addMilvusItem(ResourceActionConfig milvusItem) {
    if (this.milvus == null) {
      this.milvus = new ArrayList<>();
    }
    this.milvus.add(milvusItem);
    return this;
  }

   /**
   * Get milvus
   * @return milvus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MILVUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ResourceActionConfig> getMilvus() {
    return milvus;
  }


  @JsonProperty(JSON_PROPERTY_MILVUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMilvus(List<ResourceActionConfig> milvus) {
    this.milvus = milvus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskProgressConfigResponse taskProgressConfigResponse = (TaskProgressConfigResponse) o;
    return Objects.equals(this.oracle, taskProgressConfigResponse.oracle) &&
        Objects.equals(this.postgresql, taskProgressConfigResponse.postgresql) &&
        Objects.equals(this.sqlserver, taskProgressConfigResponse.sqlserver) &&
        Objects.equals(this.mysql, taskProgressConfigResponse.mysql) &&
        Objects.equals(this.apacheKafka, taskProgressConfigResponse.apacheKafka) &&
        Objects.equals(this.mongodb, taskProgressConfigResponse.mongodb) &&
        Objects.equals(this.milvus, taskProgressConfigResponse.milvus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oracle, postgresql, sqlserver, mysql, apacheKafka, mongodb, milvus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskProgressConfigResponse {\n");
    sb.append("    oracle: ").append(toIndentedString(oracle)).append("\n");
    sb.append("    postgresql: ").append(toIndentedString(postgresql)).append("\n");
    sb.append("    sqlserver: ").append(toIndentedString(sqlserver)).append("\n");
    sb.append("    mysql: ").append(toIndentedString(mysql)).append("\n");
    sb.append("    apacheKafka: ").append(toIndentedString(apacheKafka)).append("\n");
    sb.append("    mongodb: ").append(toIndentedString(mongodb)).append("\n");
    sb.append("    milvus: ").append(toIndentedString(milvus)).append("\n");
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

