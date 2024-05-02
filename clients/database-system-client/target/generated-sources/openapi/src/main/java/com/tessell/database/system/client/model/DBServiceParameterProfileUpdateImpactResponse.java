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
 * DBServiceParameterProfileUpdateImpactResponse
 */
@JsonPropertyOrder({
  DBServiceParameterProfileUpdateImpactResponse.JSON_PROPERTY_SERVICE_REBOOT_NEEDED
})
@JsonTypeName("DBServiceParameterProfileUpdateImpactResponse")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DBServiceParameterProfileUpdateImpactResponse {
  public static final String JSON_PROPERTY_SERVICE_REBOOT_NEEDED = "serviceRebootNeeded";
  private Boolean serviceRebootNeeded;


  public DBServiceParameterProfileUpdateImpactResponse serviceRebootNeeded(Boolean serviceRebootNeeded) {
    
    this.serviceRebootNeeded = serviceRebootNeeded;
    return this;
  }

   /**
   * If service reboot is needed as part of processing parameter profile update request
   * @return serviceRebootNeeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If service reboot is needed as part of processing parameter profile update request")
  @JsonProperty(JSON_PROPERTY_SERVICE_REBOOT_NEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getServiceRebootNeeded() {
    return serviceRebootNeeded;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_REBOOT_NEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceRebootNeeded(Boolean serviceRebootNeeded) {
    this.serviceRebootNeeded = serviceRebootNeeded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DBServiceParameterProfileUpdateImpactResponse dbServiceParameterProfileUpdateImpactResponse = (DBServiceParameterProfileUpdateImpactResponse) o;
    return Objects.equals(this.serviceRebootNeeded, dbServiceParameterProfileUpdateImpactResponse.serviceRebootNeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRebootNeeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBServiceParameterProfileUpdateImpactResponse {\n");
    sb.append("    serviceRebootNeeded: ").append(toIndentedString(serviceRebootNeeded)).append("\n");
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

