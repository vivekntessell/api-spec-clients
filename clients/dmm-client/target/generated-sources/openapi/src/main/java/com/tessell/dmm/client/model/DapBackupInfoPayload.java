/*
 * Tessell Availability Machine REST Web Services' API Documentation
 * Tessell Availability Machine REST Web Services' Api Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sagar.sontakke@tessell.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.dmm.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DapBackupInfoPayload
 */
@JsonPropertyOrder({
  DapBackupInfoPayload.JSON_PROPERTY_BACKUP_ID
})
@JsonTypeName("DapBackupInfoPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DapBackupInfoPayload {
  public static final String JSON_PROPERTY_BACKUP_ID = "backupId";
  private UUID backupId;


  public DapBackupInfoPayload backupId(UUID backupId) {
    
    this.backupId = backupId;
    return this;
  }

   /**
   * The snapshot id
   * @return backupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The snapshot id")
  @JsonProperty(JSON_PROPERTY_BACKUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getBackupId() {
    return backupId;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupId(UUID backupId) {
    this.backupId = backupId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DapBackupInfoPayload dapBackupInfoPayload = (DapBackupInfoPayload) o;
    return Objects.equals(this.backupId, dapBackupInfoPayload.backupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DapBackupInfoPayload {\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
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
