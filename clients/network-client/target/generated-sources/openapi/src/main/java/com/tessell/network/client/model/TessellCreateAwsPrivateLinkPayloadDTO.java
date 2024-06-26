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


package com.tessell.network.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Create AWS Private Link Payload
 */
@ApiModel(description = "Create AWS Private Link Payload")
@JsonPropertyOrder({
  TessellCreateAwsPrivateLinkPayloadDTO.JSON_PROPERTY_SERVICE_ID,
  TessellCreateAwsPrivateLinkPayloadDTO.JSON_PROPERTY_SUBSCRIPTION_ID,
  TessellCreateAwsPrivateLinkPayloadDTO.JSON_PROPERTY_SERVICE_NAME,
  TessellCreateAwsPrivateLinkPayloadDTO.JSON_PROPERTY_SERVICE_PRIVATE_IP,
  TessellCreateAwsPrivateLinkPayloadDTO.JSON_PROPERTY_SERVICE_CONNECTION_PORT,
  TessellCreateAwsPrivateLinkPayloadDTO.JSON_PROPERTY_SERVICE_CONNECTION_PROTOCOL,
  TessellCreateAwsPrivateLinkPayloadDTO.JSON_PROPERTY_SERVICE_VPC_ID,
  TessellCreateAwsPrivateLinkPayloadDTO.JSON_PROPERTY_SERVICE_AVAILABILITY_ZONE,
  TessellCreateAwsPrivateLinkPayloadDTO.JSON_PROPERTY_CLIENT_SERVICE_PRINCIPAL_LIST
})
@JsonTypeName("CreateAwsPrivateLinkPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:07.428121+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellCreateAwsPrivateLinkPayloadDTO {
  public static final String JSON_PROPERTY_SERVICE_ID = "serviceId";
  private UUID serviceId;

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private UUID subscriptionId;

  public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
  private String serviceName;

  public static final String JSON_PROPERTY_SERVICE_PRIVATE_IP = "servicePrivateIp";
  private String servicePrivateIp;

  public static final String JSON_PROPERTY_SERVICE_CONNECTION_PORT = "serviceConnectionPort";
  private String serviceConnectionPort;

  public static final String JSON_PROPERTY_SERVICE_CONNECTION_PROTOCOL = "serviceConnectionProtocol";
  private String serviceConnectionProtocol;

  public static final String JSON_PROPERTY_SERVICE_VPC_ID = "serviceVpcId";
  private UUID serviceVpcId;

  public static final String JSON_PROPERTY_SERVICE_AVAILABILITY_ZONE = "serviceAvailabilityZone";
  private String serviceAvailabilityZone;

  public static final String JSON_PROPERTY_CLIENT_SERVICE_PRINCIPAL_LIST = "clientServicePrincipalList";
  private List<String> clientServicePrincipalList = null;


  public TessellCreateAwsPrivateLinkPayloadDTO serviceId(UUID serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

   /**
   * Tessell Service UUID
   * @return serviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tessell Service UUID")
  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getServiceId() {
    return serviceId;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceId(UUID serviceId) {
    this.serviceId = serviceId;
  }


  public TessellCreateAwsPrivateLinkPayloadDTO subscriptionId(UUID subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Id of the subscription
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the subscription")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSubscriptionId() {
    return subscriptionId;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public TessellCreateAwsPrivateLinkPayloadDTO serviceName(String serviceName) {
    
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Name of the Tessell Service
   * @return serviceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Tessell Service")
  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceName() {
    return serviceName;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  public TessellCreateAwsPrivateLinkPayloadDTO servicePrivateIp(String servicePrivateIp) {
    
    this.servicePrivateIp = servicePrivateIp;
    return this;
  }

   /**
   * Private Ip of the Tessell Service
   * @return servicePrivateIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Private Ip of the Tessell Service")
  @JsonProperty(JSON_PROPERTY_SERVICE_PRIVATE_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServicePrivateIp() {
    return servicePrivateIp;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_PRIVATE_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServicePrivateIp(String servicePrivateIp) {
    this.servicePrivateIp = servicePrivateIp;
  }


  public TessellCreateAwsPrivateLinkPayloadDTO serviceConnectionPort(String serviceConnectionPort) {
    
    this.serviceConnectionPort = serviceConnectionPort;
    return this;
  }

   /**
   * Port for the Tessell Service Connection
   * @return serviceConnectionPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Port for the Tessell Service Connection")
  @JsonProperty(JSON_PROPERTY_SERVICE_CONNECTION_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceConnectionPort() {
    return serviceConnectionPort;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_CONNECTION_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceConnectionPort(String serviceConnectionPort) {
    this.serviceConnectionPort = serviceConnectionPort;
  }


  public TessellCreateAwsPrivateLinkPayloadDTO serviceConnectionProtocol(String serviceConnectionProtocol) {
    
    this.serviceConnectionProtocol = serviceConnectionProtocol;
    return this;
  }

   /**
   * Protocol for the Tessell Service Connection. Example - TCP
   * @return serviceConnectionProtocol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Protocol for the Tessell Service Connection. Example - TCP")
  @JsonProperty(JSON_PROPERTY_SERVICE_CONNECTION_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceConnectionProtocol() {
    return serviceConnectionProtocol;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_CONNECTION_PROTOCOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceConnectionProtocol(String serviceConnectionProtocol) {
    this.serviceConnectionProtocol = serviceConnectionProtocol;
  }


  public TessellCreateAwsPrivateLinkPayloadDTO serviceVpcId(UUID serviceVpcId) {
    
    this.serviceVpcId = serviceVpcId;
    return this;
  }

   /**
   * VPC ID for the Tessell Service
   * @return serviceVpcId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VPC ID for the Tessell Service")
  @JsonProperty(JSON_PROPERTY_SERVICE_VPC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getServiceVpcId() {
    return serviceVpcId;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_VPC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceVpcId(UUID serviceVpcId) {
    this.serviceVpcId = serviceVpcId;
  }


  public TessellCreateAwsPrivateLinkPayloadDTO serviceAvailabilityZone(String serviceAvailabilityZone) {
    
    this.serviceAvailabilityZone = serviceAvailabilityZone;
    return this;
  }

   /**
   * Tessell Service Availability Zone
   * @return serviceAvailabilityZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tessell Service Availability Zone")
  @JsonProperty(JSON_PROPERTY_SERVICE_AVAILABILITY_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceAvailabilityZone() {
    return serviceAvailabilityZone;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_AVAILABILITY_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceAvailabilityZone(String serviceAvailabilityZone) {
    this.serviceAvailabilityZone = serviceAvailabilityZone;
  }


  public TessellCreateAwsPrivateLinkPayloadDTO clientServicePrincipalList(List<String> clientServicePrincipalList) {
    
    this.clientServicePrincipalList = clientServicePrincipalList;
    return this;
  }

  public TessellCreateAwsPrivateLinkPayloadDTO addClientServicePrincipalListItem(String clientServicePrincipalListItem) {
    if (this.clientServicePrincipalList == null) {
      this.clientServicePrincipalList = new ArrayList<>();
    }
    this.clientServicePrincipalList.add(clientServicePrincipalListItem);
    return this;
  }

   /**
   * List of service Principals allowed to connect to AWS Private Link
   * @return clientServicePrincipalList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of service Principals allowed to connect to AWS Private Link")
  @JsonProperty(JSON_PROPERTY_CLIENT_SERVICE_PRINCIPAL_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getClientServicePrincipalList() {
    return clientServicePrincipalList;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_SERVICE_PRINCIPAL_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientServicePrincipalList(List<String> clientServicePrincipalList) {
    this.clientServicePrincipalList = clientServicePrincipalList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellCreateAwsPrivateLinkPayloadDTO createAwsPrivateLinkPayload = (TessellCreateAwsPrivateLinkPayloadDTO) o;
    return Objects.equals(this.serviceId, createAwsPrivateLinkPayload.serviceId) &&
        Objects.equals(this.subscriptionId, createAwsPrivateLinkPayload.subscriptionId) &&
        Objects.equals(this.serviceName, createAwsPrivateLinkPayload.serviceName) &&
        Objects.equals(this.servicePrivateIp, createAwsPrivateLinkPayload.servicePrivateIp) &&
        Objects.equals(this.serviceConnectionPort, createAwsPrivateLinkPayload.serviceConnectionPort) &&
        Objects.equals(this.serviceConnectionProtocol, createAwsPrivateLinkPayload.serviceConnectionProtocol) &&
        Objects.equals(this.serviceVpcId, createAwsPrivateLinkPayload.serviceVpcId) &&
        Objects.equals(this.serviceAvailabilityZone, createAwsPrivateLinkPayload.serviceAvailabilityZone) &&
        Objects.equals(this.clientServicePrincipalList, createAwsPrivateLinkPayload.clientServicePrincipalList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, subscriptionId, serviceName, servicePrivateIp, serviceConnectionPort, serviceConnectionProtocol, serviceVpcId, serviceAvailabilityZone, clientServicePrincipalList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellCreateAwsPrivateLinkPayloadDTO {\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    servicePrivateIp: ").append(toIndentedString(servicePrivateIp)).append("\n");
    sb.append("    serviceConnectionPort: ").append(toIndentedString(serviceConnectionPort)).append("\n");
    sb.append("    serviceConnectionProtocol: ").append(toIndentedString(serviceConnectionProtocol)).append("\n");
    sb.append("    serviceVpcId: ").append(toIndentedString(serviceVpcId)).append("\n");
    sb.append("    serviceAvailabilityZone: ").append(toIndentedString(serviceAvailabilityZone)).append("\n");
    sb.append("    clientServicePrincipalList: ").append(toIndentedString(clientServicePrincipalList)).append("\n");
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

