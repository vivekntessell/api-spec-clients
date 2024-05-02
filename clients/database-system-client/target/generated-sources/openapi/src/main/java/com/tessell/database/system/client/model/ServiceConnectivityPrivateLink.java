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
import com.tessell.database.system.client.model.DbServicePrivateLinkStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * The interface endpoint or Gateway Load Balancer endpoint to connect to your DB service.
 */
@ApiModel(description = "The interface endpoint or Gateway Load Balancer endpoint to connect to your DB service.")
@JsonPropertyOrder({
  ServiceConnectivityPrivateLink.JSON_PROPERTY_STATUS,
  ServiceConnectivityPrivateLink.JSON_PROPERTY_SERVICE_PRINCIPALS,
  ServiceConnectivityPrivateLink.JSON_PROPERTY_ENDPOINT_SERVICE_NAME,
  ServiceConnectivityPrivateLink.JSON_PROPERTY_CLIENT_AZURE_SUBSCRIPTION_IDS,
  ServiceConnectivityPrivateLink.JSON_PROPERTY_PRIVATE_LINK_SERVICE_ALIAS
})
@JsonTypeName("ServiceConnectivityPrivateLink")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceConnectivityPrivateLink {
  public static final String JSON_PROPERTY_STATUS = "status";
  private DbServicePrivateLinkStatus status;

  public static final String JSON_PROPERTY_SERVICE_PRINCIPALS = "servicePrincipals";
  private Set<String> servicePrincipals = null;

  public static final String JSON_PROPERTY_ENDPOINT_SERVICE_NAME = "endpointServiceName";
  private String endpointServiceName;

  public static final String JSON_PROPERTY_CLIENT_AZURE_SUBSCRIPTION_IDS = "clientAzureSubscriptionIds";
  private Set<UUID> clientAzureSubscriptionIds = null;

  public static final String JSON_PROPERTY_PRIVATE_LINK_SERVICE_ALIAS = "privateLinkServiceAlias";
  private String privateLinkServiceAlias;


  public ServiceConnectivityPrivateLink status(DbServicePrivateLinkStatus status) {
    
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

  public DbServicePrivateLinkStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(DbServicePrivateLinkStatus status) {
    this.status = status;
  }


  public ServiceConnectivityPrivateLink servicePrincipals(Set<String> servicePrincipals) {
    
    this.servicePrincipals = servicePrincipals;
    return this;
  }

  public ServiceConnectivityPrivateLink addServicePrincipalsItem(String servicePrincipalsItem) {
    if (this.servicePrincipals == null) {
      this.servicePrincipals = new LinkedHashSet<>();
    }
    this.servicePrincipals.add(servicePrincipalsItem);
    return this;
  }

   /**
   * The list of AWS account principals that are currently enabled
   * @return servicePrincipals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of AWS account principals that are currently enabled")
  @JsonProperty(JSON_PROPERTY_SERVICE_PRINCIPALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getServicePrincipals() {
    return servicePrincipals;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_PRINCIPALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServicePrincipals(Set<String> servicePrincipals) {
    this.servicePrincipals = servicePrincipals;
  }


  public ServiceConnectivityPrivateLink endpointServiceName(String endpointServiceName) {
    
    this.endpointServiceName = endpointServiceName;
    return this;
  }

   /**
   * The configured endpoint as a result of configuring the service-principals
   * @return endpointServiceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The configured endpoint as a result of configuring the service-principals")
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


  public ServiceConnectivityPrivateLink clientAzureSubscriptionIds(Set<UUID> clientAzureSubscriptionIds) {
    
    this.clientAzureSubscriptionIds = clientAzureSubscriptionIds;
    return this;
  }

  public ServiceConnectivityPrivateLink addClientAzureSubscriptionIdsItem(UUID clientAzureSubscriptionIdsItem) {
    if (this.clientAzureSubscriptionIds == null) {
      this.clientAzureSubscriptionIds = new LinkedHashSet<>();
    }
    this.clientAzureSubscriptionIds.add(clientAzureSubscriptionIdsItem);
    return this;
  }

   /**
   * The list of Azure subscription Ids
   * @return clientAzureSubscriptionIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of Azure subscription Ids")
  @JsonProperty(JSON_PROPERTY_CLIENT_AZURE_SUBSCRIPTION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<UUID> getClientAzureSubscriptionIds() {
    return clientAzureSubscriptionIds;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_AZURE_SUBSCRIPTION_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientAzureSubscriptionIds(Set<UUID> clientAzureSubscriptionIds) {
    this.clientAzureSubscriptionIds = clientAzureSubscriptionIds;
  }


  public ServiceConnectivityPrivateLink privateLinkServiceAlias(String privateLinkServiceAlias) {
    
    this.privateLinkServiceAlias = privateLinkServiceAlias;
    return this;
  }

   /**
   * The Azure private link service alias
   * @return privateLinkServiceAlias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Azure private link service alias")
  @JsonProperty(JSON_PROPERTY_PRIVATE_LINK_SERVICE_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrivateLinkServiceAlias() {
    return privateLinkServiceAlias;
  }


  @JsonProperty(JSON_PROPERTY_PRIVATE_LINK_SERVICE_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivateLinkServiceAlias(String privateLinkServiceAlias) {
    this.privateLinkServiceAlias = privateLinkServiceAlias;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceConnectivityPrivateLink serviceConnectivityPrivateLink = (ServiceConnectivityPrivateLink) o;
    return Objects.equals(this.status, serviceConnectivityPrivateLink.status) &&
        Objects.equals(this.servicePrincipals, serviceConnectivityPrivateLink.servicePrincipals) &&
        Objects.equals(this.endpointServiceName, serviceConnectivityPrivateLink.endpointServiceName) &&
        Objects.equals(this.clientAzureSubscriptionIds, serviceConnectivityPrivateLink.clientAzureSubscriptionIds) &&
        Objects.equals(this.privateLinkServiceAlias, serviceConnectivityPrivateLink.privateLinkServiceAlias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, servicePrincipals, endpointServiceName, clientAzureSubscriptionIds, privateLinkServiceAlias);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceConnectivityPrivateLink {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    servicePrincipals: ").append(toIndentedString(servicePrincipals)).append("\n");
    sb.append("    endpointServiceName: ").append(toIndentedString(endpointServiceName)).append("\n");
    sb.append("    clientAzureSubscriptionIds: ").append(toIndentedString(clientAzureSubscriptionIds)).append("\n");
    sb.append("    privateLinkServiceAlias: ").append(toIndentedString(privateLinkServiceAlias)).append("\n");
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
