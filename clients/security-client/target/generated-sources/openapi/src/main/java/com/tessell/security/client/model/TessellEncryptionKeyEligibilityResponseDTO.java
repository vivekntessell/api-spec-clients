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
 * Response for checking if encryption key is eligible
 */
@ApiModel(description = "Response for checking if encryption key is eligible")
@JsonPropertyOrder({
  TessellEncryptionKeyEligibilityResponseDTO.JSON_PROPERTY_ELIGIBLE
})
@JsonTypeName("EncryptionKeyEligibilityResponse")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellEncryptionKeyEligibilityResponseDTO {
  public static final String JSON_PROPERTY_ELIGIBLE = "eligible";
  private Boolean eligible;


  public TessellEncryptionKeyEligibilityResponseDTO eligible(Boolean eligible) {
    
    this.eligible = eligible;
    return this;
  }

   /**
   * if the key is eligible
   * @return eligible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "if the key is eligible")
  @JsonProperty(JSON_PROPERTY_ELIGIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEligible() {
    return eligible;
  }


  @JsonProperty(JSON_PROPERTY_ELIGIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEligible(Boolean eligible) {
    this.eligible = eligible;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellEncryptionKeyEligibilityResponseDTO encryptionKeyEligibilityResponse = (TessellEncryptionKeyEligibilityResponseDTO) o;
    return Objects.equals(this.eligible, encryptionKeyEligibilityResponse.eligible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellEncryptionKeyEligibilityResponseDTO {\n");
    sb.append("    eligible: ").append(toIndentedString(eligible)).append("\n");
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

