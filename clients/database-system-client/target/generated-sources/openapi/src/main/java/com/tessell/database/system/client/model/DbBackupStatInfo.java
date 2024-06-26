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
import com.tessell.database.system.client.model.BackupDatabaseInfoOps;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Database Backup stats information
 */
@ApiModel(description = "Database Backup stats information")
@JsonPropertyOrder({
  DbBackupStatInfo.JSON_PROPERTY_DATABASES,
  DbBackupStatInfo.JSON_PROPERTY_DATA
})
@JsonTypeName("DbBackupStatInfo")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DbBackupStatInfo {
  public static final String JSON_PROPERTY_DATABASES = "databases";
  private List<BackupDatabaseInfoOps> databases = null;

  public static final String JSON_PROPERTY_DATA = "data";
  private Object data;


  public DbBackupStatInfo databases(List<BackupDatabaseInfoOps> databases) {
    
    this.databases = databases;
    return this;
  }

  public DbBackupStatInfo addDatabasesItem(BackupDatabaseInfoOps databasesItem) {
    if (this.databases == null) {
      this.databases = new ArrayList<>();
    }
    this.databases.add(databasesItem);
    return this;
  }

   /**
   * Get databases
   * @return databases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATABASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BackupDatabaseInfoOps> getDatabases() {
    return databases;
  }


  @JsonProperty(JSON_PROPERTY_DATABASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatabases(List<BackupDatabaseInfoOps> databases) {
    this.databases = databases;
  }


  public DbBackupStatInfo data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(Object data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbBackupStatInfo dbBackupStatInfo = (DbBackupStatInfo) o;
    return Objects.equals(this.databases, dbBackupStatInfo.databases) &&
        Objects.equals(this.data, dbBackupStatInfo.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(databases, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbBackupStatInfo {\n");
    sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

