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
 * ComputeResourceMetadataConnectivityInfo
 */
@JsonPropertyOrder({
  ComputeResourceMetadataConnectivityInfo.JSON_PROPERTY_SERVICE_PORT
})
@JsonTypeName("ComputeResourceMetadata_connectivityInfo")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComputeResourceMetadataConnectivityInfo {
  public static final String JSON_PROPERTY_SERVICE_PORT = "servicePort";
  private Integer servicePort;


  public ComputeResourceMetadataConnectivityInfo servicePort(Integer servicePort) {
    
    this.servicePort = servicePort;
    return this;
  }

   /**
   * The connection port for the DB Service
   * minimum: 0
   * @return servicePort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The connection port for the DB Service")
  @JsonProperty(JSON_PROPERTY_SERVICE_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getServicePort() {
    return servicePort;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServicePort(Integer servicePort) {
    this.servicePort = servicePort;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputeResourceMetadataConnectivityInfo computeResourceMetadataConnectivityInfo = (ComputeResourceMetadataConnectivityInfo) o;
    return Objects.equals(this.servicePort, computeResourceMetadataConnectivityInfo.servicePort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicePort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputeResourceMetadataConnectivityInfo {\n");
    sb.append("    servicePort: ").append(toIndentedString(servicePort)).append("\n");
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
