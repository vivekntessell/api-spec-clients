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
import com.tessell.database.system.client.model.ComputeConnectivityConfig;
import com.tessell.database.system.client.model.ServiceConnectivityUpdateInProgressInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DB Service connectivity update-in-progress details
 */
@ApiModel(description = "DB Service connectivity update-in-progress details")
@JsonPropertyOrder({
  TessellServiceConnectivityUpdateInProgressInfo.JSON_PROPERTY_DNS_PREFIX,
  TessellServiceConnectivityUpdateInProgressInfo.JSON_PROPERTY_ENABLE_PUBLIC_ACCESS,
  TessellServiceConnectivityUpdateInProgressInfo.JSON_PROPERTY_ALLOWED_IP_ADDRESSES,
  TessellServiceConnectivityUpdateInProgressInfo.JSON_PROPERTY_PRIVATE_LINK,
  TessellServiceConnectivityUpdateInProgressInfo.JSON_PROPERTY_COMPUTES_CONNECTIVITY
})
@JsonTypeName("TessellServiceConnectivityUpdateInProgressInfo")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceConnectivityUpdateInProgressInfo {
  public static final String JSON_PROPERTY_DNS_PREFIX = "dnsPrefix";
  private String dnsPrefix;

  public static final String JSON_PROPERTY_ENABLE_PUBLIC_ACCESS = "enablePublicAccess";
  private Boolean enablePublicAccess;

  public static final String JSON_PROPERTY_ALLOWED_IP_ADDRESSES = "allowedIpAddresses";
  private List<String> allowedIpAddresses = null;

  public static final String JSON_PROPERTY_PRIVATE_LINK = "privateLink";
  private ServiceConnectivityUpdateInProgressInfo privateLink;

  public static final String JSON_PROPERTY_COMPUTES_CONNECTIVITY = "computesConnectivity";
  private List<ComputeConnectivityConfig> computesConnectivity = null;


  public TessellServiceConnectivityUpdateInProgressInfo dnsPrefix(String dnsPrefix) {
    
    this.dnsPrefix = dnsPrefix;
    return this;
  }

   /**
   * The DNS prefix associated with the DB Service
   * @return dnsPrefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The DNS prefix associated with the DB Service")
  @JsonProperty(JSON_PROPERTY_DNS_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDnsPrefix() {
    return dnsPrefix;
  }


  @JsonProperty(JSON_PROPERTY_DNS_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDnsPrefix(String dnsPrefix) {
    this.dnsPrefix = dnsPrefix;
  }


  public TessellServiceConnectivityUpdateInProgressInfo enablePublicAccess(Boolean enablePublicAccess) {
    
    this.enablePublicAccess = enablePublicAccess;
    return this;
  }

   /**
   * Specify whether to enable public access to the DB Service, default false
   * @return enablePublicAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify whether to enable public access to the DB Service, default false")
  @JsonProperty(JSON_PROPERTY_ENABLE_PUBLIC_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnablePublicAccess() {
    return enablePublicAccess;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_PUBLIC_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnablePublicAccess(Boolean enablePublicAccess) {
    this.enablePublicAccess = enablePublicAccess;
  }


  public TessellServiceConnectivityUpdateInProgressInfo allowedIpAddresses(List<String> allowedIpAddresses) {
    
    this.allowedIpAddresses = allowedIpAddresses;
    return this;
  }

  public TessellServiceConnectivityUpdateInProgressInfo addAllowedIpAddressesItem(String allowedIpAddressesItem) {
    if (this.allowedIpAddresses == null) {
      this.allowedIpAddresses = new ArrayList<>();
    }
    this.allowedIpAddresses.add(allowedIpAddressesItem);
    return this;
  }

   /**
   * The list of allowed ipv4 addresses that can connect to the DB Service
   * @return allowedIpAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of allowed ipv4 addresses that can connect to the DB Service")
  @JsonProperty(JSON_PROPERTY_ALLOWED_IP_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAllowedIpAddresses() {
    return allowedIpAddresses;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_IP_ADDRESSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedIpAddresses(List<String> allowedIpAddresses) {
    this.allowedIpAddresses = allowedIpAddresses;
  }


  public TessellServiceConnectivityUpdateInProgressInfo privateLink(ServiceConnectivityUpdateInProgressInfo privateLink) {
    
    this.privateLink = privateLink;
    return this;
  }

   /**
   * Get privateLink
   * @return privateLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIVATE_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceConnectivityUpdateInProgressInfo getPrivateLink() {
    return privateLink;
  }


  @JsonProperty(JSON_PROPERTY_PRIVATE_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivateLink(ServiceConnectivityUpdateInProgressInfo privateLink) {
    this.privateLink = privateLink;
  }


  public TessellServiceConnectivityUpdateInProgressInfo computesConnectivity(List<ComputeConnectivityConfig> computesConnectivity) {
    
    this.computesConnectivity = computesConnectivity;
    return this;
  }

  public TessellServiceConnectivityUpdateInProgressInfo addComputesConnectivityItem(ComputeConnectivityConfig computesConnectivityItem) {
    if (this.computesConnectivity == null) {
      this.computesConnectivity = new ArrayList<>();
    }
    this.computesConnectivity.add(computesConnectivityItem);
    return this;
  }

   /**
   * The Genie endpoint to connect to your DB service.
   * @return computesConnectivity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Genie endpoint to connect to your DB service.")
  @JsonProperty(JSON_PROPERTY_COMPUTES_CONNECTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ComputeConnectivityConfig> getComputesConnectivity() {
    return computesConnectivity;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTES_CONNECTIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComputesConnectivity(List<ComputeConnectivityConfig> computesConnectivity) {
    this.computesConnectivity = computesConnectivity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellServiceConnectivityUpdateInProgressInfo tessellServiceConnectivityUpdateInProgressInfo = (TessellServiceConnectivityUpdateInProgressInfo) o;
    return Objects.equals(this.dnsPrefix, tessellServiceConnectivityUpdateInProgressInfo.dnsPrefix) &&
        Objects.equals(this.enablePublicAccess, tessellServiceConnectivityUpdateInProgressInfo.enablePublicAccess) &&
        Objects.equals(this.allowedIpAddresses, tessellServiceConnectivityUpdateInProgressInfo.allowedIpAddresses) &&
        Objects.equals(this.privateLink, tessellServiceConnectivityUpdateInProgressInfo.privateLink) &&
        Objects.equals(this.computesConnectivity, tessellServiceConnectivityUpdateInProgressInfo.computesConnectivity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsPrefix, enablePublicAccess, allowedIpAddresses, privateLink, computesConnectivity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceConnectivityUpdateInProgressInfo {\n");
    sb.append("    dnsPrefix: ").append(toIndentedString(dnsPrefix)).append("\n");
    sb.append("    enablePublicAccess: ").append(toIndentedString(enablePublicAccess)).append("\n");
    sb.append("    allowedIpAddresses: ").append(toIndentedString(allowedIpAddresses)).append("\n");
    sb.append("    privateLink: ").append(toIndentedString(privateLink)).append("\n");
    sb.append("    computesConnectivity: ").append(toIndentedString(computesConnectivity)).append("\n");
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

