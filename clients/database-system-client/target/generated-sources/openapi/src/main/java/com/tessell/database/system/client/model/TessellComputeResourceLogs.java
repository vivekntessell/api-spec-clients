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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellComputeResourceLogs
 */
@JsonPropertyOrder({
  TessellComputeResourceLogs.JSON_PROPERTY_FILE_CONTENT,
  TessellComputeResourceLogs.JSON_PROPERTY_ERROR
})
@JsonTypeName("TessellComputeResourceLogs")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellComputeResourceLogs {
  public static final String JSON_PROPERTY_FILE_CONTENT = "fileContent";
  private byte[] fileContent;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;


  public TessellComputeResourceLogs fileContent(byte[] fileContent) {
    
    this.fileContent = fileContent;
    return this;
  }

   /**
   * Get fileContent
   * @return fileContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILE_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getFileContent() {
    return fileContent;
  }


  @JsonProperty(JSON_PROPERTY_FILE_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileContent(byte[] fileContent) {
    this.fileContent = fileContent;
  }


  public TessellComputeResourceLogs error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * error message
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "error message")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellComputeResourceLogs tessellComputeResourceLogs = (TessellComputeResourceLogs) o;
    return Arrays.equals(this.fileContent, tessellComputeResourceLogs.fileContent) &&
        Objects.equals(this.error, tessellComputeResourceLogs.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(fileContent), error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellComputeResourceLogs {\n");
    sb.append("    fileContent: ").append(toIndentedString(fileContent)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

