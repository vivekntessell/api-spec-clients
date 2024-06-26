/*
 * Tessell Tenant Onboarding Service API
 * Tenant Onboarding API
 *
 * The version of the OpenAPI document: v1beta
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.tenant.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.tenant.client.model.LibraryVersionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * LibraryVersionInfoByEngine
 */
@JsonPropertyOrder({
  LibraryVersionInfoByEngine.JSON_PROPERTY_ORACLE,
  LibraryVersionInfoByEngine.JSON_PROPERTY_POSTGRESQL,
  LibraryVersionInfoByEngine.JSON_PROPERTY_MYSQL,
  LibraryVersionInfoByEngine.JSON_PROPERTY_SQLSERVER,
  LibraryVersionInfoByEngine.JSON_PROPERTY_APACHE_KAFKA,
  LibraryVersionInfoByEngine.JSON_PROPERTY_MONGODB
})
@JsonTypeName("LibraryVersionInfoByEngine")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class LibraryVersionInfoByEngine {
  public static final String JSON_PROPERTY_ORACLE = "oracle";
  private LibraryVersionInfo oracle;

  public static final String JSON_PROPERTY_POSTGRESQL = "postgresql";
  private LibraryVersionInfo postgresql;

  public static final String JSON_PROPERTY_MYSQL = "mysql";
  private LibraryVersionInfo mysql;

  public static final String JSON_PROPERTY_SQLSERVER = "sqlserver";
  private LibraryVersionInfo sqlserver;

  public static final String JSON_PROPERTY_APACHE_KAFKA = "apache_kafka";
  private LibraryVersionInfo apacheKafka;

  public static final String JSON_PROPERTY_MONGODB = "mongodb";
  private LibraryVersionInfo mongodb;


  public LibraryVersionInfoByEngine oracle(LibraryVersionInfo oracle) {
    
    this.oracle = oracle;
    return this;
  }

   /**
   * Get oracle
   * @return oracle
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORACLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LibraryVersionInfo getOracle() {
    return oracle;
  }


  @JsonProperty(JSON_PROPERTY_ORACLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOracle(LibraryVersionInfo oracle) {
    this.oracle = oracle;
  }


  public LibraryVersionInfoByEngine postgresql(LibraryVersionInfo postgresql) {
    
    this.postgresql = postgresql;
    return this;
  }

   /**
   * Get postgresql
   * @return postgresql
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_POSTGRESQL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LibraryVersionInfo getPostgresql() {
    return postgresql;
  }


  @JsonProperty(JSON_PROPERTY_POSTGRESQL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPostgresql(LibraryVersionInfo postgresql) {
    this.postgresql = postgresql;
  }


  public LibraryVersionInfoByEngine mysql(LibraryVersionInfo mysql) {
    
    this.mysql = mysql;
    return this;
  }

   /**
   * Get mysql
   * @return mysql
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MYSQL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LibraryVersionInfo getMysql() {
    return mysql;
  }


  @JsonProperty(JSON_PROPERTY_MYSQL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMysql(LibraryVersionInfo mysql) {
    this.mysql = mysql;
  }


  public LibraryVersionInfoByEngine sqlserver(LibraryVersionInfo sqlserver) {
    
    this.sqlserver = sqlserver;
    return this;
  }

   /**
   * Get sqlserver
   * @return sqlserver
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SQLSERVER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LibraryVersionInfo getSqlserver() {
    return sqlserver;
  }


  @JsonProperty(JSON_PROPERTY_SQLSERVER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSqlserver(LibraryVersionInfo sqlserver) {
    this.sqlserver = sqlserver;
  }


  public LibraryVersionInfoByEngine apacheKafka(LibraryVersionInfo apacheKafka) {
    
    this.apacheKafka = apacheKafka;
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

  public LibraryVersionInfo getApacheKafka() {
    return apacheKafka;
  }


  @JsonProperty(JSON_PROPERTY_APACHE_KAFKA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApacheKafka(LibraryVersionInfo apacheKafka) {
    this.apacheKafka = apacheKafka;
  }


  public LibraryVersionInfoByEngine mongodb(LibraryVersionInfo mongodb) {
    
    this.mongodb = mongodb;
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

  public LibraryVersionInfo getMongodb() {
    return mongodb;
  }


  @JsonProperty(JSON_PROPERTY_MONGODB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMongodb(LibraryVersionInfo mongodb) {
    this.mongodb = mongodb;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryVersionInfoByEngine libraryVersionInfoByEngine = (LibraryVersionInfoByEngine) o;
    return Objects.equals(this.oracle, libraryVersionInfoByEngine.oracle) &&
        Objects.equals(this.postgresql, libraryVersionInfoByEngine.postgresql) &&
        Objects.equals(this.mysql, libraryVersionInfoByEngine.mysql) &&
        Objects.equals(this.sqlserver, libraryVersionInfoByEngine.sqlserver) &&
        Objects.equals(this.apacheKafka, libraryVersionInfoByEngine.apacheKafka) &&
        Objects.equals(this.mongodb, libraryVersionInfoByEngine.mongodb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oracle, postgresql, mysql, sqlserver, apacheKafka, mongodb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryVersionInfoByEngine {\n");
    sb.append("    oracle: ").append(toIndentedString(oracle)).append("\n");
    sb.append("    postgresql: ").append(toIndentedString(postgresql)).append("\n");
    sb.append("    mysql: ").append(toIndentedString(mysql)).append("\n");
    sb.append("    sqlserver: ").append(toIndentedString(sqlserver)).append("\n");
    sb.append("    apacheKafka: ").append(toIndentedString(apacheKafka)).append("\n");
    sb.append("    mongodb: ").append(toIndentedString(mongodb)).append("\n");
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

