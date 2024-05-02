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
import com.tessell.database.system.client.model.TessellServiceCredsDTOCreds;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellServiceCredsDTO
 */
@JsonPropertyOrder({
  TessellServiceCredsDTO.JSON_PROPERTY_CREDS
})
@JsonTypeName("TessellServiceCredsDTO")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceCredsDTO {
  public static final String JSON_PROPERTY_CREDS = "creds";
  private List<TessellServiceCredsDTOCreds> creds = null;


  public TessellServiceCredsDTO creds(List<TessellServiceCredsDTOCreds> creds) {
    
    this.creds = creds;
    return this;
  }

  public TessellServiceCredsDTO addCredsItem(TessellServiceCredsDTOCreds credsItem) {
    if (this.creds == null) {
      this.creds = new ArrayList<>();
    }
    this.creds.add(credsItem);
    return this;
  }

   /**
   * Get creds
   * @return creds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellServiceCredsDTOCreds> getCreds() {
    return creds;
  }


  @JsonProperty(JSON_PROPERTY_CREDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreds(List<TessellServiceCredsDTOCreds> creds) {
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
    TessellServiceCredsDTO tessellServiceCredsDTO = (TessellServiceCredsDTO) o;
    return Objects.equals(this.creds, tessellServiceCredsDTO.creds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceCredsDTO {\n");
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
