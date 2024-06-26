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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DeleteTessellServiceInstancePayload
 */
@JsonPropertyOrder({
  DeleteTessellServiceInstancePayload.JSON_PROPERTY_INSTANCE_IDS
})
@JsonTypeName("DeleteTessellServiceInstancePayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteTessellServiceInstancePayload {
  public static final String JSON_PROPERTY_INSTANCE_IDS = "instanceIds";
  private List<UUID> instanceIds = new ArrayList<>();


  public DeleteTessellServiceInstancePayload instanceIds(List<UUID> instanceIds) {
    
    this.instanceIds = instanceIds;
    return this;
  }

  public DeleteTessellServiceInstancePayload addInstanceIdsItem(UUID instanceIdsItem) {
    this.instanceIds.add(instanceIdsItem);
    return this;
  }

   /**
   * The id of the instances that are to be deleted
   * @return instanceIds
  **/
  @ApiModelProperty(required = true, value = "The id of the instances that are to be deleted")
  @JsonProperty(JSON_PROPERTY_INSTANCE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<UUID> getInstanceIds() {
    return instanceIds;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstanceIds(List<UUID> instanceIds) {
    this.instanceIds = instanceIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteTessellServiceInstancePayload deleteTessellServiceInstancePayload = (DeleteTessellServiceInstancePayload) o;
    return Objects.equals(this.instanceIds, deleteTessellServiceInstancePayload.instanceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteTessellServiceInstancePayload {\n");
    sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
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

