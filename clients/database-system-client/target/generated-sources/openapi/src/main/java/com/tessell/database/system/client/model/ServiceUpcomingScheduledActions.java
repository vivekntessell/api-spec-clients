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
import com.tessell.database.system.client.model.ServiceUpcomingScheduledActionsDelete;
import com.tessell.database.system.client.model.ServiceUpcomingScheduledActionsPatch;
import com.tessell.database.system.client.model.ServiceUpcomingScheduledActionsStartStop;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * ServiceUpcomingScheduledActions
 */
@JsonPropertyOrder({
  ServiceUpcomingScheduledActions.JSON_PROPERTY_START_STOP,
  ServiceUpcomingScheduledActions.JSON_PROPERTY_PATCH,
  ServiceUpcomingScheduledActions.JSON_PROPERTY_DELETE
})
@JsonTypeName("ServiceUpcomingScheduledActions")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceUpcomingScheduledActions {
  public static final String JSON_PROPERTY_START_STOP = "startStop";
  private ServiceUpcomingScheduledActionsStartStop startStop;

  public static final String JSON_PROPERTY_PATCH = "patch";
  private ServiceUpcomingScheduledActionsPatch patch;

  public static final String JSON_PROPERTY_DELETE = "delete";
  private ServiceUpcomingScheduledActionsDelete delete;


  public ServiceUpcomingScheduledActions startStop(ServiceUpcomingScheduledActionsStartStop startStop) {
    
    this.startStop = startStop;
    return this;
  }

   /**
   * Get startStop
   * @return startStop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_STOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceUpcomingScheduledActionsStartStop getStartStop() {
    return startStop;
  }


  @JsonProperty(JSON_PROPERTY_START_STOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartStop(ServiceUpcomingScheduledActionsStartStop startStop) {
    this.startStop = startStop;
  }


  public ServiceUpcomingScheduledActions patch(ServiceUpcomingScheduledActionsPatch patch) {
    
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

  public ServiceUpcomingScheduledActionsPatch getPatch() {
    return patch;
  }


  @JsonProperty(JSON_PROPERTY_PATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPatch(ServiceUpcomingScheduledActionsPatch patch) {
    this.patch = patch;
  }


  public ServiceUpcomingScheduledActions delete(ServiceUpcomingScheduledActionsDelete delete) {
    
    this.delete = delete;
    return this;
  }

   /**
   * Get delete
   * @return delete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceUpcomingScheduledActionsDelete getDelete() {
    return delete;
  }


  @JsonProperty(JSON_PROPERTY_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelete(ServiceUpcomingScheduledActionsDelete delete) {
    this.delete = delete;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceUpcomingScheduledActions serviceUpcomingScheduledActions = (ServiceUpcomingScheduledActions) o;
    return Objects.equals(this.startStop, serviceUpcomingScheduledActions.startStop) &&
        Objects.equals(this.patch, serviceUpcomingScheduledActions.patch) &&
        Objects.equals(this.delete, serviceUpcomingScheduledActions.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startStop, patch, delete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceUpcomingScheduledActions {\n");
    sb.append("    startStop: ").append(toIndentedString(startStop)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
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
