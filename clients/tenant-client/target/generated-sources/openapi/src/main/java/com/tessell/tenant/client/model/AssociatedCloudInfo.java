/*
 * Tessell Tenant Onboarding Service API
 * Tenant Onboarding API
 *
 * The version of the OpenAPI document: v1beta
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.tenant.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.tenant.client.model.AssociationStatus;
import com.tessell.tenant.client.model.DnsService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * AssociatedCloudInfo
 */
@JsonPropertyOrder({
  AssociatedCloudInfo.JSON_PROPERTY_CLOUD_ACCOUNT_ID,
  AssociatedCloudInfo.JSON_PROPERTY_ASSOCIATION_STATUS,
  AssociatedCloudInfo.JSON_PROPERTY_REGIONS,
  AssociatedCloudInfo.JSON_PROPERTY_ASSOCIATING_REGIONS,
  AssociatedCloudInfo.JSON_PROPERTY_RESOURCE_DEPLOYMENT_REGION,
  AssociatedCloudInfo.JSON_PROPERTY_OBJECT_ID_OF_TESSELL_APP,
  AssociatedCloudInfo.JSON_PROPERTY_ASSOCIATED_CLOUD_RESOURCES,
  AssociatedCloudInfo.JSON_PROPERTY_DNS_USED_FOR_SERVICES
})
@JsonTypeName("AssociatedCloudInfo")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AssociatedCloudInfo {
  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_ID = "cloudAccountId";
  private UUID cloudAccountId;

  public static final String JSON_PROPERTY_ASSOCIATION_STATUS = "associationStatus";
  private AssociationStatus associationStatus;

  public static final String JSON_PROPERTY_REGIONS = "regions";
  private List<String> regions = null;

  public static final String JSON_PROPERTY_ASSOCIATING_REGIONS = "associatingRegions";
  private List<String> associatingRegions = null;

  public static final String JSON_PROPERTY_RESOURCE_DEPLOYMENT_REGION = "resourceDeploymentRegion";
  private String resourceDeploymentRegion;

  public static final String JSON_PROPERTY_OBJECT_ID_OF_TESSELL_APP = "objectIdOfTessellApp";
  private String objectIdOfTessellApp;

  public static final String JSON_PROPERTY_ASSOCIATED_CLOUD_RESOURCES = "associatedCloudResources";
  private Map<String, Object> associatedCloudResources = null;

  public static final String JSON_PROPERTY_DNS_USED_FOR_SERVICES = "dnsUsedForServices";
  private DnsService dnsUsedForServices = DnsService.ROUTE_53;


  public AssociatedCloudInfo cloudAccountId(UUID cloudAccountId) {
    
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * Cloud Account Id
   * @return cloudAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cloud Account Id")
  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCloudAccountId() {
    return cloudAccountId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAccountId(UUID cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }


  public AssociatedCloudInfo associationStatus(AssociationStatus associationStatus) {
    
    this.associationStatus = associationStatus;
    return this;
  }

   /**
   * Get associationStatus
   * @return associationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSOCIATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AssociationStatus getAssociationStatus() {
    return associationStatus;
  }


  @JsonProperty(JSON_PROPERTY_ASSOCIATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssociationStatus(AssociationStatus associationStatus) {
    this.associationStatus = associationStatus;
  }


  public AssociatedCloudInfo regions(List<String> regions) {
    
    this.regions = regions;
    return this;
  }

  public AssociatedCloudInfo addRegionsItem(String regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRegions() {
    return regions;
  }


  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegions(List<String> regions) {
    this.regions = regions;
  }


  public AssociatedCloudInfo associatingRegions(List<String> associatingRegions) {
    
    this.associatingRegions = associatingRegions;
    return this;
  }

  public AssociatedCloudInfo addAssociatingRegionsItem(String associatingRegionsItem) {
    if (this.associatingRegions == null) {
      this.associatingRegions = new ArrayList<>();
    }
    this.associatingRegions.add(associatingRegionsItem);
    return this;
  }

   /**
   * Get associatingRegions
   * @return associatingRegions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSOCIATING_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAssociatingRegions() {
    return associatingRegions;
  }


  @JsonProperty(JSON_PROPERTY_ASSOCIATING_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssociatingRegions(List<String> associatingRegions) {
    this.associatingRegions = associatingRegions;
  }


  public AssociatedCloudInfo resourceDeploymentRegion(String resourceDeploymentRegion) {
    
    this.resourceDeploymentRegion = resourceDeploymentRegion;
    return this;
  }

   /**
   * Region where the cloud resources for the subscription will be deployed (like Lambda etc.)
   * @return resourceDeploymentRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Region where the cloud resources for the subscription will be deployed (like Lambda etc.)")
  @JsonProperty(JSON_PROPERTY_RESOURCE_DEPLOYMENT_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResourceDeploymentRegion() {
    return resourceDeploymentRegion;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_DEPLOYMENT_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceDeploymentRegion(String resourceDeploymentRegion) {
    this.resourceDeploymentRegion = resourceDeploymentRegion;
  }


  public AssociatedCloudInfo objectIdOfTessellApp(String objectIdOfTessellApp) {
    
    this.objectIdOfTessellApp = objectIdOfTessellApp;
    return this;
  }

   /**
   * This is specific to azure. It is the object id of tessell app in customer&#39;s azure account
   * @return objectIdOfTessellApp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This is specific to azure. It is the object id of tessell app in customer's azure account")
  @JsonProperty(JSON_PROPERTY_OBJECT_ID_OF_TESSELL_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObjectIdOfTessellApp() {
    return objectIdOfTessellApp;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT_ID_OF_TESSELL_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjectIdOfTessellApp(String objectIdOfTessellApp) {
    this.objectIdOfTessellApp = objectIdOfTessellApp;
  }


  public AssociatedCloudInfo associatedCloudResources(Map<String, Object> associatedCloudResources) {
    
    this.associatedCloudResources = associatedCloudResources;
    return this;
  }

  public AssociatedCloudInfo putAssociatedCloudResourcesItem(String key, Object associatedCloudResourcesItem) {
    if (this.associatedCloudResources == null) {
      this.associatedCloudResources = new HashMap<>();
    }
    this.associatedCloudResources.put(key, associatedCloudResourcesItem);
    return this;
  }

   /**
   * Get associatedCloudResources
   * @return associatedCloudResources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSOCIATED_CLOUD_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getAssociatedCloudResources() {
    return associatedCloudResources;
  }


  @JsonProperty(JSON_PROPERTY_ASSOCIATED_CLOUD_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssociatedCloudResources(Map<String, Object> associatedCloudResources) {
    this.associatedCloudResources = associatedCloudResources;
  }


  public AssociatedCloudInfo dnsUsedForServices(DnsService dnsUsedForServices) {
    
    this.dnsUsedForServices = dnsUsedForServices;
    return this;
  }

   /**
   * Get dnsUsedForServices
   * @return dnsUsedForServices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DNS_USED_FOR_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DnsService getDnsUsedForServices() {
    return dnsUsedForServices;
  }


  @JsonProperty(JSON_PROPERTY_DNS_USED_FOR_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDnsUsedForServices(DnsService dnsUsedForServices) {
    this.dnsUsedForServices = dnsUsedForServices;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociatedCloudInfo associatedCloudInfo = (AssociatedCloudInfo) o;
    return Objects.equals(this.cloudAccountId, associatedCloudInfo.cloudAccountId) &&
        Objects.equals(this.associationStatus, associatedCloudInfo.associationStatus) &&
        Objects.equals(this.regions, associatedCloudInfo.regions) &&
        Objects.equals(this.associatingRegions, associatedCloudInfo.associatingRegions) &&
        Objects.equals(this.resourceDeploymentRegion, associatedCloudInfo.resourceDeploymentRegion) &&
        Objects.equals(this.objectIdOfTessellApp, associatedCloudInfo.objectIdOfTessellApp) &&
        Objects.equals(this.associatedCloudResources, associatedCloudInfo.associatedCloudResources) &&
        Objects.equals(this.dnsUsedForServices, associatedCloudInfo.dnsUsedForServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAccountId, associationStatus, regions, associatingRegions, resourceDeploymentRegion, objectIdOfTessellApp, associatedCloudResources, dnsUsedForServices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociatedCloudInfo {\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    associationStatus: ").append(toIndentedString(associationStatus)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    associatingRegions: ").append(toIndentedString(associatingRegions)).append("\n");
    sb.append("    resourceDeploymentRegion: ").append(toIndentedString(resourceDeploymentRegion)).append("\n");
    sb.append("    objectIdOfTessellApp: ").append(toIndentedString(objectIdOfTessellApp)).append("\n");
    sb.append("    associatedCloudResources: ").append(toIndentedString(associatedCloudResources)).append("\n");
    sb.append("    dnsUsedForServices: ").append(toIndentedString(dnsUsedForServices)).append("\n");
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

