/*
 * Compute Governance API Documentation
 * Compute Governance  API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.compute.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.compute.client.model.TessellComputeUseCaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellComputeUseCasesInfoDTO
 */
@JsonPropertyOrder({
  TessellComputeUseCasesInfoDTO.JSON_PROPERTY_USE_CASES
})
@JsonTypeName("ComputeUseCasesInfo")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:15.462654+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellComputeUseCasesInfoDTO {
  public static final String JSON_PROPERTY_USE_CASES = "useCases";
  private List<TessellComputeUseCaseDTO> useCases = null;


  public TessellComputeUseCasesInfoDTO useCases(List<TessellComputeUseCaseDTO> useCases) {
    
    this.useCases = useCases;
    return this;
  }

  public TessellComputeUseCasesInfoDTO addUseCasesItem(TessellComputeUseCaseDTO useCasesItem) {
    if (this.useCases == null) {
      this.useCases = new ArrayList<>();
    }
    this.useCases.add(useCasesItem);
    return this;
  }

   /**
   * Get useCases
   * @return useCases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_CASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellComputeUseCaseDTO> getUseCases() {
    return useCases;
  }


  @JsonProperty(JSON_PROPERTY_USE_CASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseCases(List<TessellComputeUseCaseDTO> useCases) {
    this.useCases = useCases;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellComputeUseCasesInfoDTO computeUseCasesInfo = (TessellComputeUseCasesInfoDTO) o;
    return Objects.equals(this.useCases, computeUseCasesInfo.useCases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(useCases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellComputeUseCasesInfoDTO {\n");
    sb.append("    useCases: ").append(toIndentedString(useCases)).append("\n");
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
