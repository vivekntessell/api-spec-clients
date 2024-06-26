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
import com.tessell.database.system.client.model.ConnectionPoolOpsInfoConnectionPoolInfoUserView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * ConnectionPoolOpsInfoConnectionPoolInfo
 */
@JsonPropertyOrder({
  ConnectionPoolOpsInfoConnectionPoolInfo.JSON_PROPERTY_USER_VIEW,
  ConnectionPoolOpsInfoConnectionPoolInfo.JSON_PROPERTY_INTERNAL_VIEW
})
@JsonTypeName("ConnectionPoolOpsInfo_connectionPoolInfo")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConnectionPoolOpsInfoConnectionPoolInfo {
  public static final String JSON_PROPERTY_USER_VIEW = "userView";
  private ConnectionPoolOpsInfoConnectionPoolInfoUserView userView;

  public static final String JSON_PROPERTY_INTERNAL_VIEW = "internalView";
  private Object internalView;


  public ConnectionPoolOpsInfoConnectionPoolInfo userView(ConnectionPoolOpsInfoConnectionPoolInfoUserView userView) {
    
    this.userView = userView;
    return this;
  }

   /**
   * Get userView
   * @return userView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USER_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConnectionPoolOpsInfoConnectionPoolInfoUserView getUserView() {
    return userView;
  }


  @JsonProperty(JSON_PROPERTY_USER_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserView(ConnectionPoolOpsInfoConnectionPoolInfoUserView userView) {
    this.userView = userView;
  }


  public ConnectionPoolOpsInfoConnectionPoolInfo internalView(Object internalView) {
    
    this.internalView = internalView;
    return this;
  }

   /**
   * Get internalView
   * @return internalView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTERNAL_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getInternalView() {
    return internalView;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternalView(Object internalView) {
    this.internalView = internalView;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionPoolOpsInfoConnectionPoolInfo connectionPoolOpsInfoConnectionPoolInfo = (ConnectionPoolOpsInfoConnectionPoolInfo) o;
    return Objects.equals(this.userView, connectionPoolOpsInfoConnectionPoolInfo.userView) &&
        Objects.equals(this.internalView, connectionPoolOpsInfoConnectionPoolInfo.internalView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userView, internalView);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionPoolOpsInfoConnectionPoolInfo {\n");
    sb.append("    userView: ").append(toIndentedString(userView)).append("\n");
    sb.append("    internalView: ").append(toIndentedString(internalView)).append("\n");
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

