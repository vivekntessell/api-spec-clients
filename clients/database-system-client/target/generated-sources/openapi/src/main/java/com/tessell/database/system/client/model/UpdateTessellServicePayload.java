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
 * UpdateTessellServicePayload
 */
@JsonPropertyOrder({
  UpdateTessellServicePayload.JSON_PROPERTY_NAME,
  UpdateTessellServicePayload.JSON_PROPERTY_DESCRIPTION,
  UpdateTessellServicePayload.JSON_PROPERTY_ENABLE_DELETION_PROTECTION,
  UpdateTessellServicePayload.JSON_PROPERTY_ENABLE_STOP_PROTECTION,
  UpdateTessellServicePayload.JSON_PROPERTY_AUTO_MINOR_VERSION_UPDATE
})
@JsonTypeName("UpdateTessellServicePayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateTessellServicePayload {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENABLE_DELETION_PROTECTION = "enableDeletionProtection";
  private Boolean enableDeletionProtection;

  public static final String JSON_PROPERTY_ENABLE_STOP_PROTECTION = "enableStopProtection";
  private Boolean enableStopProtection;

  public static final String JSON_PROPERTY_AUTO_MINOR_VERSION_UPDATE = "autoMinorVersionUpdate";
  private Boolean autoMinorVersionUpdate;


  public UpdateTessellServicePayload name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * If not specified, this field will be ignored and the existing value will be assumed.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not specified, this field will be ignored and the existing value will be assumed.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public UpdateTessellServicePayload description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * If not specified, this field will be ignored and the existing value will be assumed.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not specified, this field will be ignored and the existing value will be assumed.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateTessellServicePayload enableDeletionProtection(Boolean enableDeletionProtection) {
    
    this.enableDeletionProtection = enableDeletionProtection;
    return this;
  }

   /**
   * If not specified, this field will be ignored and the existing setting will be assumed.
   * @return enableDeletionProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not specified, this field will be ignored and the existing setting will be assumed.")
  @JsonProperty(JSON_PROPERTY_ENABLE_DELETION_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableDeletionProtection() {
    return enableDeletionProtection;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_DELETION_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableDeletionProtection(Boolean enableDeletionProtection) {
    this.enableDeletionProtection = enableDeletionProtection;
  }


  public UpdateTessellServicePayload enableStopProtection(Boolean enableStopProtection) {
    
    this.enableStopProtection = enableStopProtection;
    return this;
  }

   /**
   * Whether stop operation is allowed on the service or not.
   * @return enableStopProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether stop operation is allowed on the service or not.")
  @JsonProperty(JSON_PROPERTY_ENABLE_STOP_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnableStopProtection() {
    return enableStopProtection;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_STOP_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableStopProtection(Boolean enableStopProtection) {
    this.enableStopProtection = enableStopProtection;
  }


  public UpdateTessellServicePayload autoMinorVersionUpdate(Boolean autoMinorVersionUpdate) {
    
    this.autoMinorVersionUpdate = autoMinorVersionUpdate;
    return this;
  }

   /**
   * If not specified, this field will be ignored and the existing setting will be assumed.
   * @return autoMinorVersionUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not specified, this field will be ignored and the existing setting will be assumed.")
  @JsonProperty(JSON_PROPERTY_AUTO_MINOR_VERSION_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoMinorVersionUpdate() {
    return autoMinorVersionUpdate;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_MINOR_VERSION_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoMinorVersionUpdate(Boolean autoMinorVersionUpdate) {
    this.autoMinorVersionUpdate = autoMinorVersionUpdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTessellServicePayload updateTessellServicePayload = (UpdateTessellServicePayload) o;
    return Objects.equals(this.name, updateTessellServicePayload.name) &&
        Objects.equals(this.description, updateTessellServicePayload.description) &&
        Objects.equals(this.enableDeletionProtection, updateTessellServicePayload.enableDeletionProtection) &&
        Objects.equals(this.enableStopProtection, updateTessellServicePayload.enableStopProtection) &&
        Objects.equals(this.autoMinorVersionUpdate, updateTessellServicePayload.autoMinorVersionUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, enableDeletionProtection, enableStopProtection, autoMinorVersionUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTessellServicePayload {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enableDeletionProtection: ").append(toIndentedString(enableDeletionProtection)).append("\n");
    sb.append("    enableStopProtection: ").append(toIndentedString(enableStopProtection)).append("\n");
    sb.append("    autoMinorVersionUpdate: ").append(toIndentedString(autoMinorVersionUpdate)).append("\n");
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

