/*
 * Tessell Gateway Service API
 * Tessell Gateway Service API Specification
 *
 * The version of the OpenAPI document: 1.0
 * Contact: samir.das@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.gateway.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.gateway.client.model.CommandStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Command status is sent by TA to TGA when a command is completed.
 */
@ApiModel(description = "Command status is sent by TA to TGA when a command is completed.")
@JsonPropertyOrder({
  CommandStatusResponse.JSON_PROPERTY_STATUS,
  CommandStatusResponse.JSON_PROPERTY_OUTPUT,
  CommandStatusResponse.JSON_PROPERTY_ERROR,
  CommandStatusResponse.JSON_PROPERTY_ERRNO
})
@JsonTypeName("commandStatusResponse")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:22.183784+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommandStatusResponse {
  public static final String JSON_PROPERTY_STATUS = "status";
  private CommandStatus status;

  public static final String JSON_PROPERTY_OUTPUT = "output";
  private byte[] output;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_ERRNO = "errno";
  private Integer errno;


  public CommandStatusResponse status(CommandStatus status) {
    
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

  public CommandStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(CommandStatus status) {
    this.status = status;
  }


  public CommandStatusResponse output(byte[] output) {
    
    this.output = output;
    return this;
  }

   /**
   * output of the associated log file.
   * @return output
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "output of the associated log file.")
  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getOutput() {
    return output;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutput(byte[] output) {
    this.output = output;
  }


  public CommandStatusResponse error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * error message.
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "error message.")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(String error) {
    this.error = error;
  }


  public CommandStatusResponse errno(Integer errno) {
    
    this.errno = errno;
    return this;
  }

   /**
   * Error number from the command.
   * @return errno
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error number from the command.")
  @JsonProperty(JSON_PROPERTY_ERRNO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getErrno() {
    return errno;
  }


  @JsonProperty(JSON_PROPERTY_ERRNO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrno(Integer errno) {
    this.errno = errno;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommandStatusResponse commandStatusResponse = (CommandStatusResponse) o;
    return Objects.equals(this.status, commandStatusResponse.status) &&
        Arrays.equals(this.output, commandStatusResponse.output) &&
        Objects.equals(this.error, commandStatusResponse.error) &&
        Objects.equals(this.errno, commandStatusResponse.errno);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, Arrays.hashCode(output), error, errno);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandStatusResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errno: ").append(toIndentedString(errno)).append("\n");
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

