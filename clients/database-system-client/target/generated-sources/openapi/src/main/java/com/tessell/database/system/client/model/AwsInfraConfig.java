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
import com.tessell.database.system.client.model.AwsCpuOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * AwsInfraConfig
 */
@JsonPropertyOrder({
  AwsInfraConfig.JSON_PROPERTY_AWS_CPU_OPTIONS
})
@JsonTypeName("AwsInfraConfig")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AwsInfraConfig {
  public static final String JSON_PROPERTY_AWS_CPU_OPTIONS = "awsCpuOptions";
  private AwsCpuOptions awsCpuOptions;


  public AwsInfraConfig awsCpuOptions(AwsCpuOptions awsCpuOptions) {
    
    this.awsCpuOptions = awsCpuOptions;
    return this;
  }

   /**
   * Get awsCpuOptions
   * @return awsCpuOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AWS_CPU_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AwsCpuOptions getAwsCpuOptions() {
    return awsCpuOptions;
  }


  @JsonProperty(JSON_PROPERTY_AWS_CPU_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAwsCpuOptions(AwsCpuOptions awsCpuOptions) {
    this.awsCpuOptions = awsCpuOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsInfraConfig awsInfraConfig = (AwsInfraConfig) o;
    return Objects.equals(this.awsCpuOptions, awsInfraConfig.awsCpuOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsCpuOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsInfraConfig {\n");
    sb.append("    awsCpuOptions: ").append(toIndentedString(awsCpuOptions)).append("\n");
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

