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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Payload for Creating API Key
 */
@ApiModel(description = "Payload for Creating API Key")
@JsonPropertyOrder({
  TessellCreateApiKeyPayload.JSON_PROPERTY_LABEL,
  TessellCreateApiKeyPayload.JSON_PROPERTY_DESCRIPTION,
  TessellCreateApiKeyPayload.JSON_PROPERTY_MAX_AGE,
  TessellCreateApiKeyPayload.JSON_PROPERTY_NEVER_EXPIRE
})
@JsonTypeName("CreateApiKeyPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:35.244225+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellCreateApiKeyPayload {
  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_MAX_AGE = "maxAge";
  private Long maxAge = 0l;

  public static final String JSON_PROPERTY_NEVER_EXPIRE = "neverExpire";
  private Boolean neverExpire = false;


  public TessellCreateApiKeyPayload label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * API key label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "API key label")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  public TessellCreateApiKeyPayload description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the API key
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the API key")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public TessellCreateApiKeyPayload maxAge(Long maxAge) {
    
    this.maxAge = maxAge;
    return this;
  }

   /**
   * Maximum age of the API key in seconds
   * minimum: 0
   * maximum: 3156000000
   * @return maxAge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum age of the API key in seconds")
  @JsonProperty(JSON_PROPERTY_MAX_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaxAge() {
    return maxAge;
  }


  @JsonProperty(JSON_PROPERTY_MAX_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxAge(Long maxAge) {
    this.maxAge = maxAge;
  }


  public TessellCreateApiKeyPayload neverExpire(Boolean neverExpire) {
    
    this.neverExpire = neverExpire;
    return this;
  }

   /**
   * Get neverExpire
   * @return neverExpire
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEVER_EXPIRE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNeverExpire() {
    return neverExpire;
  }


  @JsonProperty(JSON_PROPERTY_NEVER_EXPIRE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNeverExpire(Boolean neverExpire) {
    this.neverExpire = neverExpire;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellCreateApiKeyPayload createApiKeyPayload = (TessellCreateApiKeyPayload) o;
    return Objects.equals(this.label, createApiKeyPayload.label) &&
        Objects.equals(this.description, createApiKeyPayload.description) &&
        Objects.equals(this.maxAge, createApiKeyPayload.maxAge) &&
        Objects.equals(this.neverExpire, createApiKeyPayload.neverExpire);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, description, maxAge, neverExpire);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellCreateApiKeyPayload {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
    sb.append("    neverExpire: ").append(toIndentedString(neverExpire)).append("\n");
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
