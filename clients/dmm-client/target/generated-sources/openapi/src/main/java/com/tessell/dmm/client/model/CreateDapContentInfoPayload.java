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
import com.tessell.dmm.client.model.CreateDapAsIsContentPayload;
import com.tessell.dmm.client.model.CreateDapBackupContentPayload;
import com.tessell.dmm.client.model.CreateDapSanitizationContentPayload;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * CreateDapContentInfoPayload
 */
@JsonPropertyOrder({
  CreateDapContentInfoPayload.JSON_PROPERTY_AS_IS_CONTENT,
  CreateDapContentInfoPayload.JSON_PROPERTY_SANITIZED_CONTENT,
  CreateDapContentInfoPayload.JSON_PROPERTY_BACKUP_CONTENT
})
@JsonTypeName("CreateDapContentInfoPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateDapContentInfoPayload {
  public static final String JSON_PROPERTY_AS_IS_CONTENT = "asIsContent";
  private CreateDapAsIsContentPayload asIsContent;

  public static final String JSON_PROPERTY_SANITIZED_CONTENT = "sanitizedContent";
  private CreateDapSanitizationContentPayload sanitizedContent;

  public static final String JSON_PROPERTY_BACKUP_CONTENT = "backupContent";
  private CreateDapBackupContentPayload backupContent;


  public CreateDapContentInfoPayload asIsContent(CreateDapAsIsContentPayload asIsContent) {
    
    this.asIsContent = asIsContent;
    return this;
  }

   /**
   * Get asIsContent
   * @return asIsContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AS_IS_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateDapAsIsContentPayload getAsIsContent() {
    return asIsContent;
  }


  @JsonProperty(JSON_PROPERTY_AS_IS_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsIsContent(CreateDapAsIsContentPayload asIsContent) {
    this.asIsContent = asIsContent;
  }


  public CreateDapContentInfoPayload sanitizedContent(CreateDapSanitizationContentPayload sanitizedContent) {
    
    this.sanitizedContent = sanitizedContent;
    return this;
  }

   /**
   * Get sanitizedContent
   * @return sanitizedContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SANITIZED_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateDapSanitizationContentPayload getSanitizedContent() {
    return sanitizedContent;
  }


  @JsonProperty(JSON_PROPERTY_SANITIZED_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSanitizedContent(CreateDapSanitizationContentPayload sanitizedContent) {
    this.sanitizedContent = sanitizedContent;
  }


  public CreateDapContentInfoPayload backupContent(CreateDapBackupContentPayload backupContent) {
    
    this.backupContent = backupContent;
    return this;
  }

   /**
   * Get backupContent
   * @return backupContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BACKUP_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreateDapBackupContentPayload getBackupContent() {
    return backupContent;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupContent(CreateDapBackupContentPayload backupContent) {
    this.backupContent = backupContent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDapContentInfoPayload createDapContentInfoPayload = (CreateDapContentInfoPayload) o;
    return Objects.equals(this.asIsContent, createDapContentInfoPayload.asIsContent) &&
        Objects.equals(this.sanitizedContent, createDapContentInfoPayload.sanitizedContent) &&
        Objects.equals(this.backupContent, createDapContentInfoPayload.backupContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asIsContent, sanitizedContent, backupContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDapContentInfoPayload {\n");
    sb.append("    asIsContent: ").append(toIndentedString(asIsContent)).append("\n");
    sb.append("    sanitizedContent: ").append(toIndentedString(sanitizedContent)).append("\n");
    sb.append("    backupContent: ").append(toIndentedString(backupContent)).append("\n");
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

