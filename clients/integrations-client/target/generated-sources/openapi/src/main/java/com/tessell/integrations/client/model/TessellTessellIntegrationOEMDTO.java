/*
 * REST API Documentation
 * REST API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.integrations.client.model;

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
 * TessellTessellIntegrationOEMDTO
 */
@JsonPropertyOrder({
  TessellTessellIntegrationOEMDTO.JSON_PROPERTY_SERVER_NAME,
  TessellTessellIntegrationOEMDTO.JSON_PROPERTY_IP,
  TessellTessellIntegrationOEMDTO.JSON_PROPERTY_AGENT_PASSWORD,
  TessellTessellIntegrationOEMDTO.JSON_PROPERTY_SYSMAN_PASSWORD,
  TessellTessellIntegrationOEMDTO.JSON_PROPERTY_OEM_UPLOAD_PORT,
  TessellTessellIntegrationOEMDTO.JSON_PROPERTY_AGENT_PORT,
  TessellTessellIntegrationOEMDTO.JSON_PROPERTY_OEM_CONSOLE_PORT
})
@JsonTypeName("TessellIntegrationOEM")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:57.635527+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellTessellIntegrationOEMDTO {
  public static final String JSON_PROPERTY_SERVER_NAME = "serverName";
  private String serverName;

  public static final String JSON_PROPERTY_IP = "ip";
  private String ip;

  public static final String JSON_PROPERTY_AGENT_PASSWORD = "agentPassword";
  private String agentPassword;

  public static final String JSON_PROPERTY_SYSMAN_PASSWORD = "sysmanPassword";
  private String sysmanPassword;

  public static final String JSON_PROPERTY_OEM_UPLOAD_PORT = "oemUploadPort";
  private Integer oemUploadPort;

  public static final String JSON_PROPERTY_AGENT_PORT = "agentPort";
  private Integer agentPort;

  public static final String JSON_PROPERTY_OEM_CONSOLE_PORT = "oemConsolePort";
  private Integer oemConsolePort;


  public TessellTessellIntegrationOEMDTO serverName(String serverName) {
    
    this.serverName = serverName;
    return this;
  }

   /**
   * Get serverName
   * @return serverName
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SERVER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getServerName() {
    return serverName;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServerName(String serverName) {
    this.serverName = serverName;
  }


  public TessellTessellIntegrationOEMDTO ip(String ip) {
    
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIp() {
    return ip;
  }


  @JsonProperty(JSON_PROPERTY_IP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIp(String ip) {
    this.ip = ip;
  }


  public TessellTessellIntegrationOEMDTO agentPassword(String agentPassword) {
    
    this.agentPassword = agentPassword;
    return this;
  }

   /**
   * Agent registration password.
   * @return agentPassword
  **/
  @ApiModelProperty(required = true, value = "Agent registration password.")
  @JsonProperty(JSON_PROPERTY_AGENT_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAgentPassword() {
    return agentPassword;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAgentPassword(String agentPassword) {
    this.agentPassword = agentPassword;
  }


  public TessellTessellIntegrationOEMDTO sysmanPassword(String sysmanPassword) {
    
    this.sysmanPassword = sysmanPassword;
    return this;
  }

   /**
   * OEM sysman password.
   * @return sysmanPassword
  **/
  @ApiModelProperty(required = true, value = "OEM sysman password.")
  @JsonProperty(JSON_PROPERTY_SYSMAN_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSysmanPassword() {
    return sysmanPassword;
  }


  @JsonProperty(JSON_PROPERTY_SYSMAN_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSysmanPassword(String sysmanPassword) {
    this.sysmanPassword = sysmanPassword;
  }


  public TessellTessellIntegrationOEMDTO oemUploadPort(Integer oemUploadPort) {
    
    this.oemUploadPort = oemUploadPort;
    return this;
  }

   /**
   * Port for agent to upload the data.
   * @return oemUploadPort
  **/
  @ApiModelProperty(required = true, value = "Port for agent to upload the data.")
  @JsonProperty(JSON_PROPERTY_OEM_UPLOAD_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getOemUploadPort() {
    return oemUploadPort;
  }


  @JsonProperty(JSON_PROPERTY_OEM_UPLOAD_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOemUploadPort(Integer oemUploadPort) {
    this.oemUploadPort = oemUploadPort;
  }


  public TessellTessellIntegrationOEMDTO agentPort(Integer agentPort) {
    
    this.agentPort = agentPort;
    return this;
  }

   /**
   * Port for installation and other communication.
   * @return agentPort
  **/
  @ApiModelProperty(required = true, value = "Port for installation and other communication.")
  @JsonProperty(JSON_PROPERTY_AGENT_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAgentPort() {
    return agentPort;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAgentPort(Integer agentPort) {
    this.agentPort = agentPort;
  }


  public TessellTessellIntegrationOEMDTO oemConsolePort(Integer oemConsolePort) {
    
    this.oemConsolePort = oemConsolePort;
    return this;
  }

   /**
   * OEM console port
   * @return oemConsolePort
  **/
  @ApiModelProperty(required = true, value = "OEM console port")
  @JsonProperty(JSON_PROPERTY_OEM_CONSOLE_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getOemConsolePort() {
    return oemConsolePort;
  }


  @JsonProperty(JSON_PROPERTY_OEM_CONSOLE_PORT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOemConsolePort(Integer oemConsolePort) {
    this.oemConsolePort = oemConsolePort;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellTessellIntegrationOEMDTO tessellIntegrationOEM = (TessellTessellIntegrationOEMDTO) o;
    return Objects.equals(this.serverName, tessellIntegrationOEM.serverName) &&
        Objects.equals(this.ip, tessellIntegrationOEM.ip) &&
        Objects.equals(this.agentPassword, tessellIntegrationOEM.agentPassword) &&
        Objects.equals(this.sysmanPassword, tessellIntegrationOEM.sysmanPassword) &&
        Objects.equals(this.oemUploadPort, tessellIntegrationOEM.oemUploadPort) &&
        Objects.equals(this.agentPort, tessellIntegrationOEM.agentPort) &&
        Objects.equals(this.oemConsolePort, tessellIntegrationOEM.oemConsolePort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverName, ip, agentPassword, sysmanPassword, oemUploadPort, agentPort, oemConsolePort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellTessellIntegrationOEMDTO {\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    agentPassword: ").append(toIndentedString(agentPassword)).append("\n");
    sb.append("    sysmanPassword: ").append(toIndentedString(sysmanPassword)).append("\n");
    sb.append("    oemUploadPort: ").append(toIndentedString(oemUploadPort)).append("\n");
    sb.append("    agentPort: ").append(toIndentedString(agentPort)).append("\n");
    sb.append("    oemConsolePort: ").append(toIndentedString(oemConsolePort)).append("\n");
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

