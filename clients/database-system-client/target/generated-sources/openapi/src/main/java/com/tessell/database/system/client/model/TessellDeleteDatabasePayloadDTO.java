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
 * TessellDeleteDatabasePayloadDTO
 */
@JsonPropertyOrder({
  TessellDeleteDatabasePayloadDTO.JSON_PROPERTY_RETAIN_AVAILABILITY_MACHINE
})
@JsonTypeName("TessellDeleteDatabasePayloadDTO")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellDeleteDatabasePayloadDTO {
  public static final String JSON_PROPERTY_RETAIN_AVAILABILITY_MACHINE = "retainAvailabilityMachine";
  private Boolean retainAvailabilityMachine = false;


  public TessellDeleteDatabasePayloadDTO retainAvailabilityMachine(Boolean retainAvailabilityMachine) {
    
    this.retainAvailabilityMachine = retainAvailabilityMachine;
    return this;
  }

   /**
   * If &#39;retainAvailabilityMachine&#39; is true then set value of field takeFinalBackup and dapsToRetain. By default retainAvailabilityMachine is false, that means delete all details like DMM, Backups, DAPs, Logs etc
   * @return retainAvailabilityMachine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If 'retainAvailabilityMachine' is true then set value of field takeFinalBackup and dapsToRetain. By default retainAvailabilityMachine is false, that means delete all details like DMM, Backups, DAPs, Logs etc")
  @JsonProperty(JSON_PROPERTY_RETAIN_AVAILABILITY_MACHINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRetainAvailabilityMachine() {
    return retainAvailabilityMachine;
  }


  @JsonProperty(JSON_PROPERTY_RETAIN_AVAILABILITY_MACHINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetainAvailabilityMachine(Boolean retainAvailabilityMachine) {
    this.retainAvailabilityMachine = retainAvailabilityMachine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellDeleteDatabasePayloadDTO tessellDeleteDatabasePayloadDTO = (TessellDeleteDatabasePayloadDTO) o;
    return Objects.equals(this.retainAvailabilityMachine, tessellDeleteDatabasePayloadDTO.retainAvailabilityMachine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retainAvailabilityMachine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellDeleteDatabasePayloadDTO {\n");
    sb.append("    retainAvailabilityMachine: ").append(toIndentedString(retainAvailabilityMachine)).append("\n");
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
