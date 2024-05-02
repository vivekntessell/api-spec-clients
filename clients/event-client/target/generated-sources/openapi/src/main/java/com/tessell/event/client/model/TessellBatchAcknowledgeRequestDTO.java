/*
 * Event Service API
 * Event Service API Specification
 *
 * The version of the OpenAPI document: 1.0
 * Contact: samir.das@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.event.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Batch acknowledge request
 */
@ApiModel(description = "Batch acknowledge request")
@JsonPropertyOrder({
  TessellBatchAcknowledgeRequestDTO.JSON_PROPERTY_IDS,
  TessellBatchAcknowledgeRequestDTO.JSON_PROPERTY_ACKNOWLEDGE_ALL
})
@JsonTypeName("BatchAcknowledgeRequest")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:47.078643+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellBatchAcknowledgeRequestDTO {
  public static final String JSON_PROPERTY_IDS = "ids";
  private List<String> ids = null;

  public static final String JSON_PROPERTY_ACKNOWLEDGE_ALL = "acknowledgeAll";
  private Boolean acknowledgeAll = true;


  public TessellBatchAcknowledgeRequestDTO ids(List<String> ids) {
    
    this.ids = ids;
    return this;
  }

  public TessellBatchAcknowledgeRequestDTO addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<String>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(List<String> ids) {
    this.ids = ids;
  }


  public TessellBatchAcknowledgeRequestDTO acknowledgeAll(Boolean acknowledgeAll) {
    
    this.acknowledgeAll = acknowledgeAll;
    return this;
  }

   /**
   * acknowledges all the notifications of the user
   * @return acknowledgeAll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "acknowledges all the notifications of the user")
  @JsonProperty(JSON_PROPERTY_ACKNOWLEDGE_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAcknowledgeAll() {
    return acknowledgeAll;
  }


  @JsonProperty(JSON_PROPERTY_ACKNOWLEDGE_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcknowledgeAll(Boolean acknowledgeAll) {
    this.acknowledgeAll = acknowledgeAll;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellBatchAcknowledgeRequestDTO batchAcknowledgeRequest = (TessellBatchAcknowledgeRequestDTO) o;
    return Objects.equals(this.ids, batchAcknowledgeRequest.ids) &&
        Objects.equals(this.acknowledgeAll, batchAcknowledgeRequest.acknowledgeAll);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, acknowledgeAll);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellBatchAcknowledgeRequestDTO {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    acknowledgeAll: ").append(toIndentedString(acknowledgeAll)).append("\n");
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
