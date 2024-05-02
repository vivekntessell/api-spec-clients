/*
 * Tessell REST API Documentation
 * Tessell REST API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.security.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.security.client.model.TessellAwsDTO;
import com.tessell.security.client.model.TessellAzureDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Cloud configuration for the key
 */
@ApiModel(description = "Cloud configuration for the key")
@JsonPropertyOrder({
  TessellCloudConfigDTO.JSON_PROPERTY_AWS,
  TessellCloudConfigDTO.JSON_PROPERTY_AZURE
})
@JsonTypeName("CloudConfig")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellCloudConfigDTO {
  public static final String JSON_PROPERTY_AWS = "aws";
  private TessellAwsDTO aws;

  public static final String JSON_PROPERTY_AZURE = "azure";
  private TessellAzureDTO azure;


  public TessellCloudConfigDTO aws(TessellAwsDTO aws) {
    
    this.aws = aws;
    return this;
  }

   /**
   * Get aws
   * @return aws
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellAwsDTO getAws() {
    return aws;
  }


  @JsonProperty(JSON_PROPERTY_AWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAws(TessellAwsDTO aws) {
    this.aws = aws;
  }


  public TessellCloudConfigDTO azure(TessellAzureDTO azure) {
    
    this.azure = azure;
    return this;
  }

   /**
   * Get azure
   * @return azure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AZURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellAzureDTO getAzure() {
    return azure;
  }


  @JsonProperty(JSON_PROPERTY_AZURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAzure(TessellAzureDTO azure) {
    this.azure = azure;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellCloudConfigDTO cloudConfig = (TessellCloudConfigDTO) o;
    return Objects.equals(this.aws, cloudConfig.aws) &&
        Objects.equals(this.azure, cloudConfig.azure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aws, azure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellCloudConfigDTO {\n");
    sb.append("    aws: ").append(toIndentedString(aws)).append("\n");
    sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
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
