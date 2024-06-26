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
import com.tessell.database.system.client.model.CloneBackupValidationResponse;
import com.tessell.database.system.client.model.NativeBackupOpsPayload;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * CreateNativeBackupOpsPayloadAllOf
 */
@JsonPropertyOrder({
  CreateNativeBackupOpsPayloadAllOf.JSON_PROPERTY_NATIVE_BACKUP_PAYLOAD,
  CreateNativeBackupOpsPayloadAllOf.JSON_PROPERTY_BACKUP_VALIDATION_INFO
})
@JsonTypeName("CreateNativeBackupOpsPayload_allOf")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateNativeBackupOpsPayloadAllOf {
  public static final String JSON_PROPERTY_NATIVE_BACKUP_PAYLOAD = "nativeBackupPayload";
  private NativeBackupOpsPayload nativeBackupPayload;

  public static final String JSON_PROPERTY_BACKUP_VALIDATION_INFO = "backupValidationInfo";
  private CloneBackupValidationResponse backupValidationInfo;


  public CreateNativeBackupOpsPayloadAllOf nativeBackupPayload(NativeBackupOpsPayload nativeBackupPayload) {
    
    this.nativeBackupPayload = nativeBackupPayload;
    return this;
  }

   /**
   * Get nativeBackupPayload
   * @return nativeBackupPayload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NATIVE_BACKUP_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NativeBackupOpsPayload getNativeBackupPayload() {
    return nativeBackupPayload;
  }


  @JsonProperty(JSON_PROPERTY_NATIVE_BACKUP_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNativeBackupPayload(NativeBackupOpsPayload nativeBackupPayload) {
    this.nativeBackupPayload = nativeBackupPayload;
  }


  public CreateNativeBackupOpsPayloadAllOf backupValidationInfo(CloneBackupValidationResponse backupValidationInfo) {
    
    this.backupValidationInfo = backupValidationInfo;
    return this;
  }

   /**
   * Get backupValidationInfo
   * @return backupValidationInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BACKUP_VALIDATION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CloneBackupValidationResponse getBackupValidationInfo() {
    return backupValidationInfo;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_VALIDATION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupValidationInfo(CloneBackupValidationResponse backupValidationInfo) {
    this.backupValidationInfo = backupValidationInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateNativeBackupOpsPayloadAllOf createNativeBackupOpsPayloadAllOf = (CreateNativeBackupOpsPayloadAllOf) o;
    return Objects.equals(this.nativeBackupPayload, createNativeBackupOpsPayloadAllOf.nativeBackupPayload) &&
        Objects.equals(this.backupValidationInfo, createNativeBackupOpsPayloadAllOf.backupValidationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nativeBackupPayload, backupValidationInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateNativeBackupOpsPayloadAllOf {\n");
    sb.append("    nativeBackupPayload: ").append(toIndentedString(nativeBackupPayload)).append("\n");
    sb.append("    backupValidationInfo: ").append(toIndentedString(backupValidationInfo)).append("\n");
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

