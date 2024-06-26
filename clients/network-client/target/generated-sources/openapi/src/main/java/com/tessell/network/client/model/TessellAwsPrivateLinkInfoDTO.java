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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Aws Private Link Info
 */
@ApiModel(description = "Aws Private Link Info")
@JsonPropertyOrder({
  TessellAwsPrivateLinkInfoDTO.JSON_PROPERTY_ENDPOINT_SERVICE_ID,
  TessellAwsPrivateLinkInfoDTO.JSON_PROPERTY_ENDPOINT_SERVICE_NAME,
  TessellAwsPrivateLinkInfoDTO.JSON_PROPERTY_LOAD_BALANCER_ID,
  TessellAwsPrivateLinkInfoDTO.JSON_PROPERTY_TARGET_GROUP_ID,
  TessellAwsPrivateLinkInfoDTO.JSON_PROPERTY_LOAD_BALANCER_DNS_NAME,
  TessellAwsPrivateLinkInfoDTO.JSON_PROPERTY_CLIENT_SERVICE_PRINCIPAL_LIST
})
@JsonTypeName("AwsPrivateLinkInfo")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:07.428121+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellAwsPrivateLinkInfoDTO {
  public static final String JSON_PROPERTY_ENDPOINT_SERVICE_ID = "endpointServiceId";
  private String endpointServiceId;

  public static final String JSON_PROPERTY_ENDPOINT_SERVICE_NAME = "endpointServiceName";
  private String endpointServiceName;

  public static final String JSON_PROPERTY_LOAD_BALANCER_ID = "loadBalancerId";
  private String loadBalancerId;

  public static final String JSON_PROPERTY_TARGET_GROUP_ID = "targetGroupId";
  private String targetGroupId;

  public static final String JSON_PROPERTY_LOAD_BALANCER_DNS_NAME = "loadBalancerDnsName";
  private String loadBalancerDnsName;

  public static final String JSON_PROPERTY_CLIENT_SERVICE_PRINCIPAL_LIST = "clientServicePrincipalList";
  private List<String> clientServicePrincipalList = null;


  public TessellAwsPrivateLinkInfoDTO endpointServiceId(String endpointServiceId) {
    
    this.endpointServiceId = endpointServiceId;
    return this;
  }

   /**
   * Get endpointServiceId
   * @return endpointServiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENDPOINT_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndpointServiceId() {
    return endpointServiceId;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointServiceId(String endpointServiceId) {
    this.endpointServiceId = endpointServiceId;
  }


  public TessellAwsPrivateLinkInfoDTO endpointServiceName(String endpointServiceName) {
    
    this.endpointServiceName = endpointServiceName;
    return this;
  }

   /**
   * Get endpointServiceName
   * @return endpointServiceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENDPOINT_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndpointServiceName() {
    return endpointServiceName;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_SERVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointServiceName(String endpointServiceName) {
    this.endpointServiceName = endpointServiceName;
  }


  public TessellAwsPrivateLinkInfoDTO loadBalancerId(String loadBalancerId) {
    
    this.loadBalancerId = loadBalancerId;
    return this;
  }

   /**
   * Get loadBalancerId
   * @return loadBalancerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOAD_BALANCER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLoadBalancerId() {
    return loadBalancerId;
  }


  @JsonProperty(JSON_PROPERTY_LOAD_BALANCER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoadBalancerId(String loadBalancerId) {
    this.loadBalancerId = loadBalancerId;
  }


  public TessellAwsPrivateLinkInfoDTO targetGroupId(String targetGroupId) {
    
    this.targetGroupId = targetGroupId;
    return this;
  }

   /**
   * Get targetGroupId
   * @return targetGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetGroupId() {
    return targetGroupId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetGroupId(String targetGroupId) {
    this.targetGroupId = targetGroupId;
  }


  public TessellAwsPrivateLinkInfoDTO loadBalancerDnsName(String loadBalancerDnsName) {
    
    this.loadBalancerDnsName = loadBalancerDnsName;
    return this;
  }

   /**
   * Get loadBalancerDnsName
   * @return loadBalancerDnsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOAD_BALANCER_DNS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLoadBalancerDnsName() {
    return loadBalancerDnsName;
  }


  @JsonProperty(JSON_PROPERTY_LOAD_BALANCER_DNS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoadBalancerDnsName(String loadBalancerDnsName) {
    this.loadBalancerDnsName = loadBalancerDnsName;
  }


  public TessellAwsPrivateLinkInfoDTO clientServicePrincipalList(List<String> clientServicePrincipalList) {
    
    this.clientServicePrincipalList = clientServicePrincipalList;
    return this;
  }

  public TessellAwsPrivateLinkInfoDTO addClientServicePrincipalListItem(String clientServicePrincipalListItem) {
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
    TessellAwsPrivateLinkInfoDTO awsPrivateLinkInfo = (TessellAwsPrivateLinkInfoDTO) o;
    return Objects.equals(this.endpointServiceId, awsPrivateLinkInfo.endpointServiceId) &&
        Objects.equals(this.endpointServiceName, awsPrivateLinkInfo.endpointServiceName) &&
        Objects.equals(this.loadBalancerId, awsPrivateLinkInfo.loadBalancerId) &&
        Objects.equals(this.targetGroupId, awsPrivateLinkInfo.targetGroupId) &&
        Objects.equals(this.loadBalancerDnsName, awsPrivateLinkInfo.loadBalancerDnsName) &&
        Objects.equals(this.clientServicePrincipalList, awsPrivateLinkInfo.clientServicePrincipalList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointServiceId, endpointServiceName, loadBalancerId, targetGroupId, loadBalancerDnsName, clientServicePrincipalList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellAwsPrivateLinkInfoDTO {\n");
    sb.append("    endpointServiceId: ").append(toIndentedString(endpointServiceId)).append("\n");
    sb.append("    endpointServiceName: ").append(toIndentedString(endpointServiceName)).append("\n");
    sb.append("    loadBalancerId: ").append(toIndentedString(loadBalancerId)).append("\n");
    sb.append("    targetGroupId: ").append(toIndentedString(targetGroupId)).append("\n");
    sb.append("    loadBalancerDnsName: ").append(toIndentedString(loadBalancerDnsName)).append("\n");
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

