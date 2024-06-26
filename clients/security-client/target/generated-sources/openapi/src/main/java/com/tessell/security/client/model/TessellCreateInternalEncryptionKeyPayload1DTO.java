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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellCreateInternalEncryptionKeyPayload1DTO
 */
@JsonPropertyOrder({
  TessellCreateInternalEncryptionKeyPayload1DTO.JSON_PROPERTY_OOB
})
@JsonTypeName("CreateInternalEncryptionKeyPayload_1")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellCreateInternalEncryptionKeyPayload1DTO {
  public static final String JSON_PROPERTY_OOB = "oob";
  private Boolean oob = false;


  public TessellCreateInternalEncryptionKeyPayload1DTO oob(Boolean oob) {
    
    this.oob = oob;
    return this;
  }

   /**
   * of key is oob
   * @return oob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "of key is oob")
  @JsonProperty(JSON_PROPERTY_OOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOob() {
    return oob;
  }


  @JsonProperty(JSON_PROPERTY_OOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOob(Boolean oob) {
    this.oob = oob;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellCreateInternalEncryptionKeyPayload1DTO createInternalEncryptionKeyPayload1 = (TessellCreateInternalEncryptionKeyPayload1DTO) o;
    return Objects.equals(this.oob, createInternalEncryptionKeyPayload1.oob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellCreateInternalEncryptionKeyPayload1DTO {\n");
    sb.append("    oob: ").append(toIndentedString(oob)).append("\n");
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

