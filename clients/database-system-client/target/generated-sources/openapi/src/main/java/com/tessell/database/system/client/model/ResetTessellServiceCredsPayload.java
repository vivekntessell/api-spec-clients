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
import com.tessell.database.system.client.model.ResetTessellServiceCredsPayloadCreds;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * ResetTessellServiceCredsPayload
 */
@JsonPropertyOrder({
  ResetTessellServiceCredsPayload.JSON_PROPERTY_CREDS
})
@JsonTypeName("ResetTessellServiceCredsPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResetTessellServiceCredsPayload {
  public static final String JSON_PROPERTY_CREDS = "creds";
  private List<ResetTessellServiceCredsPayloadCreds> creds = new ArrayList<>();


  public ResetTessellServiceCredsPayload creds(List<ResetTessellServiceCredsPayloadCreds> creds) {
    
    this.creds = creds;
    return this;
  }

  public ResetTessellServiceCredsPayload addCredsItem(ResetTessellServiceCredsPayloadCreds credsItem) {
    this.creds.add(credsItem);
    return this;
  }

   /**
   * Get creds
   * @return creds
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CREDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ResetTessellServiceCredsPayloadCreds> getCreds() {
    return creds;
  }


  @JsonProperty(JSON_PROPERTY_CREDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreds(List<ResetTessellServiceCredsPayloadCreds> creds) {
    this.creds = creds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetTessellServiceCredsPayload resetTessellServiceCredsPayload = (ResetTessellServiceCredsPayload) o;
    return Objects.equals(this.creds, resetTessellServiceCredsPayload.creds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetTessellServiceCredsPayload {\n");
    sb.append("    creds: ").append(toIndentedString(creds)).append("\n");
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

