/*
 * REST API Documentation
 * REST API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.gov.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.gov.client.model.TessellBaseEntityDTO;
import com.tessell.gov.client.model.TessellVirtualNetwork1DTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Virtual Networks in Tessell
 */
@ApiModel(description = "This is a definition for Virtual Networks in Tessell")
@JsonPropertyOrder({
  TessellVirtualNetworkDTO.JSON_PROPERTY_DATE_CREATED,
  TessellVirtualNetworkDTO.JSON_PROPERTY_DATE_MODIFIED,
  TessellVirtualNetworkDTO.JSON_PROPERTY_ID,
  TessellVirtualNetworkDTO.JSON_PROPERTY_CLOUD_ACCOUNT_ID,
  TessellVirtualNetworkDTO.JSON_PROPERTY_CLOUD_LOCATION_ID,
  TessellVirtualNetworkDTO.JSON_PROPERTY_NAME
})
@JsonTypeName("VirtualNetwork")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.675868+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellVirtualNetworkDTO {
  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private Date dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private Date dateModified;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_ID = "cloudAccountId";
  private UUID cloudAccountId;

  public static final String JSON_PROPERTY_CLOUD_LOCATION_ID = "cloudLocationId";
  private String cloudLocationId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public TessellVirtualNetworkDTO dateCreated(Date dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Timestamp when the entity was created
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the entity was created")
  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  public TessellVirtualNetworkDTO dateModified(Date dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Timestamp when the entity was last modified
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the entity was last modified")
  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDateModified() {
    return dateModified;
  }


  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  public TessellVirtualNetworkDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * generated UUID for the entity
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "generated UUID for the entity")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public TessellVirtualNetworkDTO cloudAccountId(UUID cloudAccountId) {
    
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * ID of the cloud account to which this compute belongs
   * @return cloudAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "ID of the cloud account to which this compute belongs")
  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCloudAccountId() {
    return cloudAccountId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAccountId(UUID cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }


  public TessellVirtualNetworkDTO cloudLocationId(String cloudLocationId) {
    
    this.cloudLocationId = cloudLocationId;
    return this;
  }

   /**
   * ID of the cloud location where this compute belongs
   * @return cloudLocationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aws", value = "ID of the cloud location where this compute belongs")
  @JsonProperty(JSON_PROPERTY_CLOUD_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudLocationId() {
    return cloudLocationId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudLocationId(String cloudLocationId) {
    this.cloudLocationId = cloudLocationId;
  }


  public TessellVirtualNetworkDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the entity
   * @return name
  **/
  @ApiModelProperty(example = "sample-entity", required = true, value = "Name of the entity")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellVirtualNetworkDTO virtualNetwork = (TessellVirtualNetworkDTO) o;
    return Objects.equals(this.dateCreated, virtualNetwork.dateCreated) &&
        Objects.equals(this.dateModified, virtualNetwork.dateModified) &&
        Objects.equals(this.id, virtualNetwork.id) &&
        Objects.equals(this.cloudAccountId, virtualNetwork.cloudAccountId) &&
        Objects.equals(this.cloudLocationId, virtualNetwork.cloudLocationId) &&
        Objects.equals(this.name, virtualNetwork.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCreated, dateModified, id, cloudAccountId, cloudLocationId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellVirtualNetworkDTO {\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    cloudLocationId: ").append(toIndentedString(cloudLocationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
