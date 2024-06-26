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
import com.tessell.database.system.client.model.TessellServiceInstanceInProgressUpdateInfoOpsInfra;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DB Service Instance&#39;s in progress updates
 */
@ApiModel(description = "DB Service Instance's in progress updates")
@JsonPropertyOrder({
  TessellServiceInstanceInProgressUpdateInfoOps.JSON_PROPERTY_INFRA
})
@JsonTypeName("TessellServiceInstanceInProgressUpdateInfoOps")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceInstanceInProgressUpdateInfoOps {
  public static final String JSON_PROPERTY_INFRA = "infra";
  private TessellServiceInstanceInProgressUpdateInfoOpsInfra infra;


  public TessellServiceInstanceInProgressUpdateInfoOps infra(TessellServiceInstanceInProgressUpdateInfoOpsInfra infra) {
    
    this.infra = infra;
    return this;
  }

   /**
   * Get infra
   * @return infra
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INFRA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceInstanceInProgressUpdateInfoOpsInfra getInfra() {
    return infra;
  }


  @JsonProperty(JSON_PROPERTY_INFRA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfra(TessellServiceInstanceInProgressUpdateInfoOpsInfra infra) {
    this.infra = infra;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellServiceInstanceInProgressUpdateInfoOps tessellServiceInstanceInProgressUpdateInfoOps = (TessellServiceInstanceInProgressUpdateInfoOps) o;
    return Objects.equals(this.infra, tessellServiceInstanceInProgressUpdateInfoOps.infra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infra);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceInstanceInProgressUpdateInfoOps {\n");
    sb.append("    infra: ").append(toIndentedString(infra)).append("\n");
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

