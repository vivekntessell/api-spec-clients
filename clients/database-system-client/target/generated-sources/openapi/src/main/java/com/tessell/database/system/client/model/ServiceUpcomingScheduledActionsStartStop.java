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
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * ServiceUpcomingScheduledActionsStartStop
 */
@JsonPropertyOrder({
  ServiceUpcomingScheduledActionsStartStop.JSON_PROPERTY_ACTION,
  ServiceUpcomingScheduledActionsStartStop.JSON_PROPERTY_AT
})
@JsonTypeName("ServiceUpcomingScheduledActions_startStop")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceUpcomingScheduledActionsStartStop {
  public static final String JSON_PROPERTY_ACTION = "action";
  private String action;

  public static final String JSON_PROPERTY_AT = "at";
  private Date at;


  public ServiceUpcomingScheduledActionsStartStop action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Action which can be either start/stop
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Action which can be either start/stop")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAction(String action) {
    this.action = action;
  }


  public ServiceUpcomingScheduledActionsStartStop at(Date at) {
    
    this.at = at;
    return this;
  }

   /**
   * The time at which the specified action is to be performed
   * @return at
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time at which the specified action is to be performed")
  @JsonProperty(JSON_PROPERTY_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getAt() {
    return at;
  }


  @JsonProperty(JSON_PROPERTY_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAt(Date at) {
    this.at = at;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceUpcomingScheduledActionsStartStop serviceUpcomingScheduledActionsStartStop = (ServiceUpcomingScheduledActionsStartStop) o;
    return Objects.equals(this.action, serviceUpcomingScheduledActionsStartStop.action) &&
        Objects.equals(this.at, serviceUpcomingScheduledActionsStartStop.at);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, at);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceUpcomingScheduledActionsStartStop {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    at: ").append(toIndentedString(at)).append("\n");
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

