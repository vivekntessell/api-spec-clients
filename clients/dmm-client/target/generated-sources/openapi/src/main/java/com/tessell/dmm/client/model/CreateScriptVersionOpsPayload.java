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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Create Script Version payload
 */
@ApiModel(description = "Create Script Version payload")
@JsonPropertyOrder({
  CreateScriptVersionOpsPayload.JSON_PROPERTY_BASE64_ENCODED_FILE,
  CreateScriptVersionOpsPayload.JSON_PROPERTY_FILE_NAME
})
@JsonTypeName("CreateScriptVersionOpsPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateScriptVersionOpsPayload {
  public static final String JSON_PROPERTY_BASE64_ENCODED_FILE = "base64EncodedFile";
  private String base64EncodedFile;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;


  public CreateScriptVersionOpsPayload base64EncodedFile(String base64EncodedFile) {
    
    this.base64EncodedFile = base64EncodedFile;
    return this;
  }

   /**
   * Base64 encoded File content
   * @return base64EncodedFile
  **/
  @ApiModelProperty(required = true, value = "Base64 encoded File content")
  @JsonProperty(JSON_PROPERTY_BASE64_ENCODED_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBase64EncodedFile() {
    return base64EncodedFile;
  }


  @JsonProperty(JSON_PROPERTY_BASE64_ENCODED_FILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBase64EncodedFile(String base64EncodedFile) {
    this.base64EncodedFile = base64EncodedFile;
  }


  public CreateScriptVersionOpsPayload fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Filename (since base64 encoding won&#39;t have the filename)
   * @return fileName
  **/
  @ApiModelProperty(required = true, value = "Filename (since base64 encoding won't have the filename)")
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateScriptVersionOpsPayload createScriptVersionOpsPayload = (CreateScriptVersionOpsPayload) o;
    return Objects.equals(this.base64EncodedFile, createScriptVersionOpsPayload.base64EncodedFile) &&
        Objects.equals(this.fileName, createScriptVersionOpsPayload.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64EncodedFile, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateScriptVersionOpsPayload {\n");
    sb.append("    base64EncodedFile: ").append(toIndentedString(base64EncodedFile)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

