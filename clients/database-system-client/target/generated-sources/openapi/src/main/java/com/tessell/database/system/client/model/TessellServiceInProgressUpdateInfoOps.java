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
import com.tessell.database.system.client.model.TessellResourceUpdateInfo;
import com.tessell.database.system.client.model.TessellServiceInProgressUpdateInfoOpsRestore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellServiceInProgressUpdateInfoOps
 */
@JsonPropertyOrder({
  TessellServiceInProgressUpdateInfoOps.JSON_PROPERTY_RESTORE,
  TessellServiceInProgressUpdateInfoOps.JSON_PROPERTY_PATCH,
  TessellServiceInProgressUpdateInfoOps.JSON_PROPERTY_RESIZE,
  TessellServiceInProgressUpdateInfoOps.JSON_PROPERTY_CREDS,
  TessellServiceInProgressUpdateInfoOps.JSON_PROPERTY_INTEGRATION
})
@JsonTypeName("TessellServiceInProgressUpdateInfoOps")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceInProgressUpdateInfoOps {
  public static final String JSON_PROPERTY_RESTORE = "restore";
  private TessellServiceInProgressUpdateInfoOpsRestore restore;

  public static final String JSON_PROPERTY_PATCH = "patch";
  private TessellResourceUpdateInfo patch;

  public static final String JSON_PROPERTY_RESIZE = "resize";
  private TessellResourceUpdateInfo resize;

  public static final String JSON_PROPERTY_CREDS = "creds";
  private TessellResourceUpdateInfo creds;

  public static final String JSON_PROPERTY_INTEGRATION = "integration";
  private TessellResourceUpdateInfo integration;


  public TessellServiceInProgressUpdateInfoOps restore(TessellServiceInProgressUpdateInfoOpsRestore restore) {
    
    this.restore = restore;
    return this;
  }

   /**
   * Get restore
   * @return restore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESTORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceInProgressUpdateInfoOpsRestore getRestore() {
    return restore;
  }


  @JsonProperty(JSON_PROPERTY_RESTORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestore(TessellServiceInProgressUpdateInfoOpsRestore restore) {
    this.restore = restore;
  }


  public TessellServiceInProgressUpdateInfoOps patch(TessellResourceUpdateInfo patch) {
    
    this.patch = patch;
    return this;
  }

   /**
   * Get patch
   * @return patch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellResourceUpdateInfo getPatch() {
    return patch;
  }


  @JsonProperty(JSON_PROPERTY_PATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPatch(TessellResourceUpdateInfo patch) {
    this.patch = patch;
  }


  public TessellServiceInProgressUpdateInfoOps resize(TessellResourceUpdateInfo resize) {
    
    this.resize = resize;
    return this;
  }

   /**
   * Get resize
   * @return resize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellResourceUpdateInfo getResize() {
    return resize;
  }


  @JsonProperty(JSON_PROPERTY_RESIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResize(TessellResourceUpdateInfo resize) {
    this.resize = resize;
  }


  public TessellServiceInProgressUpdateInfoOps creds(TessellResourceUpdateInfo creds) {
    
    this.creds = creds;
    return this;
  }

   /**
   * Get creds
   * @return creds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellResourceUpdateInfo getCreds() {
    return creds;
  }


  @JsonProperty(JSON_PROPERTY_CREDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreds(TessellResourceUpdateInfo creds) {
    this.creds = creds;
  }


  public TessellServiceInProgressUpdateInfoOps integration(TessellResourceUpdateInfo integration) {
    
    this.integration = integration;
    return this;
  }

   /**
   * Get integration
   * @return integration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTEGRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellResourceUpdateInfo getIntegration() {
    return integration;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegration(TessellResourceUpdateInfo integration) {
    this.integration = integration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellServiceInProgressUpdateInfoOps tessellServiceInProgressUpdateInfoOps = (TessellServiceInProgressUpdateInfoOps) o;
    return Objects.equals(this.restore, tessellServiceInProgressUpdateInfoOps.restore) &&
        Objects.equals(this.patch, tessellServiceInProgressUpdateInfoOps.patch) &&
        Objects.equals(this.resize, tessellServiceInProgressUpdateInfoOps.resize) &&
        Objects.equals(this.creds, tessellServiceInProgressUpdateInfoOps.creds) &&
        Objects.equals(this.integration, tessellServiceInProgressUpdateInfoOps.integration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restore, patch, resize, creds, integration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceInProgressUpdateInfoOps {\n");
    sb.append("    restore: ").append(toIndentedString(restore)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    resize: ").append(toIndentedString(resize)).append("\n");
    sb.append("    creds: ").append(toIndentedString(creds)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
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
