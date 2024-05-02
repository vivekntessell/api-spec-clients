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
import com.tessell.dmm.client.model.CreateDapContentInfoPayload;
import com.tessell.dmm.client.model.DapContentType;
import com.tessell.dmm.client.model.DapRetentionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Payload to create an Access Policy (DAP) and the associated configuration
 */
@ApiModel(description = "Payload to create an Access Policy (DAP) and the associated configuration")
@JsonPropertyOrder({
  CreateDapPayload.JSON_PROPERTY_NAME,
  CreateDapPayload.JSON_PROPERTY_CONTENT_TYPE,
  CreateDapPayload.JSON_PROPERTY_CONTENT_INFO,
  CreateDapPayload.JSON_PROPERTY_DATA_ACCESS_CONFIG,
  CreateDapPayload.JSON_PROPERTY_TARGET_CLOUD_LOCATIONS,
  CreateDapPayload.JSON_PROPERTY_USERS
})
@JsonTypeName("CreateDapPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateDapPayload {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CONTENT_TYPE = "contentType";
  private DapContentType contentType;

  public static final String JSON_PROPERTY_CONTENT_INFO = "contentInfo";
  private CreateDapContentInfoPayload contentInfo;

  public static final String JSON_PROPERTY_DATA_ACCESS_CONFIG = "dataAccessConfig";
  private DapRetentionInfo dataAccessConfig;

  public static final String JSON_PROPERTY_TARGET_CLOUD_LOCATIONS = "targetCloudLocations";
  private Map<String, List<String>> targetCloudLocations = new HashMap<>();

  public static final String JSON_PROPERTY_USERS = "users";
  private List<String> users = null;


  public CreateDapPayload name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the Access Policy
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the Access Policy")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CreateDapPayload contentType(DapContentType contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DapContentType getContentType() {
    return contentType;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContentType(DapContentType contentType) {
    this.contentType = contentType;
  }


  public CreateDapPayload contentInfo(CreateDapContentInfoPayload contentInfo) {
    
    this.contentInfo = contentInfo;
    return this;
  }

   /**
   * Get contentInfo
   * @return contentInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateDapContentInfoPayload getContentInfo() {
    return contentInfo;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentInfo(CreateDapContentInfoPayload contentInfo) {
    this.contentInfo = contentInfo;
  }


  public CreateDapPayload dataAccessConfig(DapRetentionInfo dataAccessConfig) {
    
    this.dataAccessConfig = dataAccessConfig;
    return this;
  }

   /**
   * Get dataAccessConfig
   * @return dataAccessConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA_ACCESS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DapRetentionInfo getDataAccessConfig() {
    return dataAccessConfig;
  }


  @JsonProperty(JSON_PROPERTY_DATA_ACCESS_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataAccessConfig(DapRetentionInfo dataAccessConfig) {
    this.dataAccessConfig = dataAccessConfig;
  }


  public CreateDapPayload targetCloudLocations(Map<String, List<String>> targetCloudLocations) {
    
    this.targetCloudLocations = targetCloudLocations;
    return this;
  }

  public CreateDapPayload putTargetCloudLocationsItem(String key, List<String> targetCloudLocationsItem) {
    this.targetCloudLocations.put(key, targetCloudLocationsItem);
    return this;
  }

   /**
   * The cloud and region information where the data is being managed by this Access Policy
   * @return targetCloudLocations
  **/
  @ApiModelProperty(required = true, value = "The cloud and region information where the data is being managed by this Access Policy")
  @JsonProperty(JSON_PROPERTY_TARGET_CLOUD_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Map<String, List<String>> getTargetCloudLocations() {
    return targetCloudLocations;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_CLOUD_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetCloudLocations(Map<String, List<String>> targetCloudLocations) {
    this.targetCloudLocations = targetCloudLocations;
  }


  public CreateDapPayload users(List<String> users) {
    
    this.users = users;
    return this;
  }

  public CreateDapPayload addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * List of users who have access to the data/content managed by this Access Policy
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of users who have access to the data/content managed by this Access Policy")
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUsers() {
    return users;
  }


  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsers(List<String> users) {
    this.users = users;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDapPayload createDapPayload = (CreateDapPayload) o;
    return Objects.equals(this.name, createDapPayload.name) &&
        Objects.equals(this.contentType, createDapPayload.contentType) &&
        Objects.equals(this.contentInfo, createDapPayload.contentInfo) &&
        Objects.equals(this.dataAccessConfig, createDapPayload.dataAccessConfig) &&
        Objects.equals(this.targetCloudLocations, createDapPayload.targetCloudLocations) &&
        Objects.equals(this.users, createDapPayload.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contentType, contentInfo, dataAccessConfig, targetCloudLocations, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDapPayload {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentInfo: ").append(toIndentedString(contentInfo)).append("\n");
    sb.append("    dataAccessConfig: ").append(toIndentedString(dataAccessConfig)).append("\n");
    sb.append("    targetCloudLocations: ").append(toIndentedString(targetCloudLocations)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
