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
import com.tessell.dmm.client.model.DapManualContentPayload;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * CreateDapBackupContentPayload
 */
@JsonPropertyOrder({
  CreateDapBackupContentPayload.JSON_PROPERTY_AUTOMATED,
  CreateDapBackupContentPayload.JSON_PROPERTY_MANUAL
})
@JsonTypeName("CreateDapBackupContentPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateDapBackupContentPayload {
  public static final String JSON_PROPERTY_AUTOMATED = "automated";
  private Boolean automated;

  public static final String JSON_PROPERTY_MANUAL = "manual";
  private List<DapManualContentPayload> manual = null;


  public CreateDapBackupContentPayload automated(Boolean automated) {
    
    this.automated = automated;
    return this;
  }

   /**
   * Share the automated backups. This is exclusive with manual specification.
   * @return automated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Share the automated backups. This is exclusive with manual specification.")
  @JsonProperty(JSON_PROPERTY_AUTOMATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutomated() {
    return automated;
  }


  @JsonProperty(JSON_PROPERTY_AUTOMATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutomated(Boolean automated) {
    this.automated = automated;
  }


  public CreateDapBackupContentPayload manual(List<DapManualContentPayload> manual) {
    
    this.manual = manual;
    return this;
  }

  public CreateDapBackupContentPayload addManualItem(DapManualContentPayload manualItem) {
    if (this.manual == null) {
      this.manual = new ArrayList<>();
    }
    this.manual.add(manualItem);
    return this;
  }

   /**
   * The list of backups that are to be shared as part of this access policy
   * @return manual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of backups that are to be shared as part of this access policy")
  @JsonProperty(JSON_PROPERTY_MANUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DapManualContentPayload> getManual() {
    return manual;
  }


  @JsonProperty(JSON_PROPERTY_MANUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManual(List<DapManualContentPayload> manual) {
    this.manual = manual;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDapBackupContentPayload createDapBackupContentPayload = (CreateDapBackupContentPayload) o;
    return Objects.equals(this.automated, createDapBackupContentPayload.automated) &&
        Objects.equals(this.manual, createDapBackupContentPayload.manual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automated, manual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDapBackupContentPayload {\n");
    sb.append("    automated: ").append(toIndentedString(automated)).append("\n");
    sb.append("    manual: ").append(toIndentedString(manual)).append("\n");
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

