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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DBServiceParameterProfileUpdateOpsRequestAllOf
 */
@JsonPropertyOrder({
  DBServiceParameterProfileUpdateOpsRequestAllOf.JSON_PROPERTY_REBOOT_ALLOWED
})
@JsonTypeName("DBServiceParameterProfileUpdateOpsRequest_allOf")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DBServiceParameterProfileUpdateOpsRequestAllOf {
  public static final String JSON_PROPERTY_REBOOT_ALLOWED = "rebootAllowed";
  private Boolean rebootAllowed;


  public DBServiceParameterProfileUpdateOpsRequestAllOf rebootAllowed(Boolean rebootAllowed) {
    
    this.rebootAllowed = rebootAllowed;
    return this;
  }

   /**
   * Get rebootAllowed
   * @return rebootAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REBOOT_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRebootAllowed() {
    return rebootAllowed;
  }


  @JsonProperty(JSON_PROPERTY_REBOOT_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRebootAllowed(Boolean rebootAllowed) {
    this.rebootAllowed = rebootAllowed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DBServiceParameterProfileUpdateOpsRequestAllOf dbServiceParameterProfileUpdateOpsRequestAllOf = (DBServiceParameterProfileUpdateOpsRequestAllOf) o;
    return Objects.equals(this.rebootAllowed, dbServiceParameterProfileUpdateOpsRequestAllOf.rebootAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rebootAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBServiceParameterProfileUpdateOpsRequestAllOf {\n");
    sb.append("    rebootAllowed: ").append(toIndentedString(rebootAllowed)).append("\n");
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

