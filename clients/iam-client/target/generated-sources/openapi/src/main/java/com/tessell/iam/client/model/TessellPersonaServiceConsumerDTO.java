/*
 * Tessell REST API Documentation
 * Tessell REST API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.iam.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.iam.client.model.TessellAppServiceConsumerDTO;
import com.tessell.iam.client.model.TessellPersonaStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell persona object for service consumers
 */
@ApiModel(description = "This is a definition for Tessell persona object for service consumers")
@JsonPropertyOrder({
  TessellPersonaServiceConsumerDTO.JSON_PROPERTY_NAME,
  TessellPersonaServiceConsumerDTO.JSON_PROPERTY_DESCRIPTION,
  TessellPersonaServiceConsumerDTO.JSON_PROPERTY_APPS,
  TessellPersonaServiceConsumerDTO.JSON_PROPERTY_STATUS,
  TessellPersonaServiceConsumerDTO.JSON_PROPERTY_SYSTEM_CREATED
})
@JsonTypeName("PersonaServiceConsumerDTO")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:35.244225+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellPersonaServiceConsumerDTO {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_APPS = "apps";
  private List<TessellAppServiceConsumerDTO> apps = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellPersonaStatus status;

  public static final String JSON_PROPERTY_SYSTEM_CREATED = "systemCreated";
  private Boolean systemCreated;


  public TessellPersonaServiceConsumerDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the persona
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the persona")
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


  public TessellPersonaServiceConsumerDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the persona
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the persona")
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


  public TessellPersonaServiceConsumerDTO apps(List<TessellAppServiceConsumerDTO> apps) {
    
    this.apps = apps;
    return this;
  }

  public TessellPersonaServiceConsumerDTO addAppsItem(TessellAppServiceConsumerDTO appsItem) {
    if (this.apps == null) {
      this.apps = new ArrayList<>();
    }
    this.apps.add(appsItem);
    return this;
  }

   /**
   * List of apps
   * @return apps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of apps")
  @JsonProperty(JSON_PROPERTY_APPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellAppServiceConsumerDTO> getApps() {
    return apps;
  }


  @JsonProperty(JSON_PROPERTY_APPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApps(List<TessellAppServiceConsumerDTO> apps) {
    this.apps = apps;
  }


  public TessellPersonaServiceConsumerDTO status(TessellPersonaStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellPersonaStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TessellPersonaStatus status) {
    this.status = status;
  }


  public TessellPersonaServiceConsumerDTO systemCreated(Boolean systemCreated) {
    
    this.systemCreated = systemCreated;
    return this;
  }

   /**
   * Whether a Persona is system created (OOB) or not
   * @return systemCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether a Persona is system created (OOB) or not")
  @JsonProperty(JSON_PROPERTY_SYSTEM_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSystemCreated() {
    return systemCreated;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystemCreated(Boolean systemCreated) {
    this.systemCreated = systemCreated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellPersonaServiceConsumerDTO personaServiceConsumerDTO = (TessellPersonaServiceConsumerDTO) o;
    return Objects.equals(this.name, personaServiceConsumerDTO.name) &&
        Objects.equals(this.description, personaServiceConsumerDTO.description) &&
        Objects.equals(this.apps, personaServiceConsumerDTO.apps) &&
        Objects.equals(this.status, personaServiceConsumerDTO.status) &&
        Objects.equals(this.systemCreated, personaServiceConsumerDTO.systemCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, apps, status, systemCreated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellPersonaServiceConsumerDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    systemCreated: ").append(toIndentedString(systemCreated)).append("\n");
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

