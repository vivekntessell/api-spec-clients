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
import com.tessell.database.system.client.model.DatabaseStatusOps;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Database&#39;s clone details
 */
@ApiModel(description = "Database's clone details")
@JsonPropertyOrder({
  DatabaseCloneMetadataInfo.JSON_PROPERTY_CLONED_FROM_DATABASE,
  DatabaseCloneMetadataInfo.JSON_PROPERTY_CLONED_FROM_DATABASE_STATUS
})
@JsonTypeName("DatabaseCloneMetadataInfo")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DatabaseCloneMetadataInfo {
  public static final String JSON_PROPERTY_CLONED_FROM_DATABASE = "clonedFromDatabase";
  private String clonedFromDatabase;

  public static final String JSON_PROPERTY_CLONED_FROM_DATABASE_STATUS = "clonedFromDatabaseStatus";
  private DatabaseStatusOps clonedFromDatabaseStatus;


  public DatabaseCloneMetadataInfo clonedFromDatabase(String clonedFromDatabase) {
    
    this.clonedFromDatabase = clonedFromDatabase;
    return this;
  }

   /**
   * Get clonedFromDatabase
   * @return clonedFromDatabase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLONED_FROM_DATABASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClonedFromDatabase() {
    return clonedFromDatabase;
  }


  @JsonProperty(JSON_PROPERTY_CLONED_FROM_DATABASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClonedFromDatabase(String clonedFromDatabase) {
    this.clonedFromDatabase = clonedFromDatabase;
  }


  public DatabaseCloneMetadataInfo clonedFromDatabaseStatus(DatabaseStatusOps clonedFromDatabaseStatus) {
    
    this.clonedFromDatabaseStatus = clonedFromDatabaseStatus;
    return this;
  }

   /**
   * Get clonedFromDatabaseStatus
   * @return clonedFromDatabaseStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLONED_FROM_DATABASE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DatabaseStatusOps getClonedFromDatabaseStatus() {
    return clonedFromDatabaseStatus;
  }


  @JsonProperty(JSON_PROPERTY_CLONED_FROM_DATABASE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClonedFromDatabaseStatus(DatabaseStatusOps clonedFromDatabaseStatus) {
    this.clonedFromDatabaseStatus = clonedFromDatabaseStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseCloneMetadataInfo databaseCloneMetadataInfo = (DatabaseCloneMetadataInfo) o;
    return Objects.equals(this.clonedFromDatabase, databaseCloneMetadataInfo.clonedFromDatabase) &&
        Objects.equals(this.clonedFromDatabaseStatus, databaseCloneMetadataInfo.clonedFromDatabaseStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clonedFromDatabase, clonedFromDatabaseStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseCloneMetadataInfo {\n");
    sb.append("    clonedFromDatabase: ").append(toIndentedString(clonedFromDatabase)).append("\n");
    sb.append("    clonedFromDatabaseStatus: ").append(toIndentedString(clonedFromDatabaseStatus)).append("\n");
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

