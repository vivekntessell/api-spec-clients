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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * HostedDbServiceOnCr
 */
@JsonPropertyOrder({
  HostedDbServiceOnCr.JSON_PROPERTY_DB_SERVICE_ID,
  HostedDbServiceOnCr.JSON_PROPERTY_DATABASES
})
@JsonTypeName("HostedDbServiceOnCr")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class HostedDbServiceOnCr {
  public static final String JSON_PROPERTY_DB_SERVICE_ID = "dbServiceId";
  private UUID dbServiceId;

  public static final String JSON_PROPERTY_DATABASES = "databases";
  private Set<String> databases = null;


  public HostedDbServiceOnCr dbServiceId(UUID dbServiceId) {
    
    this.dbServiceId = dbServiceId;
    return this;
  }

   /**
   * Get dbServiceId
   * @return dbServiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DB_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getDbServiceId() {
    return dbServiceId;
  }


  @JsonProperty(JSON_PROPERTY_DB_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbServiceId(UUID dbServiceId) {
    this.dbServiceId = dbServiceId;
  }


  public HostedDbServiceOnCr databases(Set<String> databases) {
    
    this.databases = databases;
    return this;
  }

  public HostedDbServiceOnCr addDatabasesItem(String databasesItem) {
    if (this.databases == null) {
      this.databases = new LinkedHashSet<>();
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

  public Set<String> getDatabases() {
    return databases;
  }


  @JsonProperty(JSON_PROPERTY_DATABASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatabases(Set<String> databases) {
    this.databases = databases;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostedDbServiceOnCr hostedDbServiceOnCr = (HostedDbServiceOnCr) o;
    return Objects.equals(this.dbServiceId, hostedDbServiceOnCr.dbServiceId) &&
        Objects.equals(this.databases, hostedDbServiceOnCr.databases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbServiceId, databases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostedDbServiceOnCr {\n");
    sb.append("    dbServiceId: ").append(toIndentedString(dbServiceId)).append("\n");
    sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
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

