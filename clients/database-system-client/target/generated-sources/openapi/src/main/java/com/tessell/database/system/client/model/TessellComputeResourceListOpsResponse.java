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
import com.tessell.database.system.client.model.ApiMetadata;
import com.tessell.database.system.client.model.ModelApiResponse;
import com.tessell.database.system.client.model.TessellComputeResourceOpsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellComputeResourceListOpsResponse
 */
@JsonPropertyOrder({
  TessellComputeResourceListOpsResponse.JSON_PROPERTY_RESPONSE,
  TessellComputeResourceListOpsResponse.JSON_PROPERTY_METADATA
})
@JsonTypeName("TessellComputeResourceListOpsResponse")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellComputeResourceListOpsResponse {
  public static final String JSON_PROPERTY_RESPONSE = "response";
  private List<TessellComputeResourceOpsDTO> response = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private ApiMetadata metadata;


  public TessellComputeResourceListOpsResponse response(List<TessellComputeResourceOpsDTO> response) {
    
    this.response = response;
    return this;
  }

  public TessellComputeResourceListOpsResponse addResponseItem(TessellComputeResourceOpsDTO responseItem) {
    if (this.response == null) {
      this.response = new ArrayList<>();
    }
    this.response.add(responseItem);
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellComputeResourceOpsDTO> getResponse() {
    return response;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponse(List<TessellComputeResourceOpsDTO> response) {
    this.response = response;
  }


  public TessellComputeResourceListOpsResponse metadata(ApiMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApiMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(ApiMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellComputeResourceListOpsResponse tessellComputeResourceListOpsResponse = (TessellComputeResourceListOpsResponse) o;
    return Objects.equals(this.response, tessellComputeResourceListOpsResponse.response) &&
        Objects.equals(this.metadata, tessellComputeResourceListOpsResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellComputeResourceListOpsResponse {\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
