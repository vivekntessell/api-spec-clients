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


package com.tessell.iam.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.iam.client.model.TessellBatchAclEntityResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell internal get acls batch
 */
@ApiModel(description = "This is a definition for Tessell internal get acls batch")
@JsonPropertyOrder({
  TessellBatchAclResponse.JSON_PROPERTY_BATCH_ACLS
})
@JsonTypeName("BatchAclResponse")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:35.244225+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellBatchAclResponse {
  public static final String JSON_PROPERTY_BATCH_ACLS = "batchAcls";
  private Map<String, List<TessellBatchAclEntityResponse>> batchAcls = null;


  public TessellBatchAclResponse batchAcls(Map<String, List<TessellBatchAclEntityResponse>> batchAcls) {
    
    this.batchAcls = batchAcls;
    return this;
  }

  public TessellBatchAclResponse putBatchAclsItem(String key, List<TessellBatchAclEntityResponse> batchAclsItem) {
    if (this.batchAcls == null) {
      this.batchAcls = new HashMap<>();
    }
    this.batchAcls.put(key, batchAclsItem);
    return this;
  }

   /**
   * Get batchAcls
   * @return batchAcls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BATCH_ACLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, List<TessellBatchAclEntityResponse>> getBatchAcls() {
    return batchAcls;
  }


  @JsonProperty(JSON_PROPERTY_BATCH_ACLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBatchAcls(Map<String, List<TessellBatchAclEntityResponse>> batchAcls) {
    this.batchAcls = batchAcls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellBatchAclResponse batchAclResponse = (TessellBatchAclResponse) o;
    return Objects.equals(this.batchAcls, batchAclResponse.batchAcls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchAcls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellBatchAclResponse {\n");
    sb.append("    batchAcls: ").append(toIndentedString(batchAcls)).append("\n");
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

