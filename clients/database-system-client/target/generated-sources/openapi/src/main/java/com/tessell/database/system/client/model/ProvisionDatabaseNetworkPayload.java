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
import com.tessell.database.system.client.model.ProvisionDatabaseNetworkSGPayload;
import com.tessell.database.system.client.model.ProvisionDatabaseNetworkSubnetPayload;
import com.tessell.database.system.client.model.ProvisionDatabaseNetworkVPCPayload;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * ProvisionDatabaseNetworkPayload
 */
@JsonPropertyOrder({
  ProvisionDatabaseNetworkPayload.JSON_PROPERTY_NAME,
  ProvisionDatabaseNetworkPayload.JSON_PROPERTY_SECURITY_GROUP,
  ProvisionDatabaseNetworkPayload.JSON_PROPERTY_SUBNETS,
  ProvisionDatabaseNetworkPayload.JSON_PROPERTY_VPC
})
@JsonTypeName("ProvisionDatabaseNetworkPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProvisionDatabaseNetworkPayload {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SECURITY_GROUP = "securityGroup";
  private ProvisionDatabaseNetworkSGPayload securityGroup;

  public static final String JSON_PROPERTY_SUBNETS = "subnets";
  private List<ProvisionDatabaseNetworkSubnetPayload> subnets = null;

  public static final String JSON_PROPERTY_VPC = "vpc";
  private ProvisionDatabaseNetworkVPCPayload vpc;


  public ProvisionDatabaseNetworkPayload name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ProvisionDatabaseNetworkPayload securityGroup(ProvisionDatabaseNetworkSGPayload securityGroup) {
    
    this.securityGroup = securityGroup;
    return this;
  }

   /**
   * Get securityGroup
   * @return securityGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECURITY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProvisionDatabaseNetworkSGPayload getSecurityGroup() {
    return securityGroup;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecurityGroup(ProvisionDatabaseNetworkSGPayload securityGroup) {
    this.securityGroup = securityGroup;
  }


  public ProvisionDatabaseNetworkPayload subnets(List<ProvisionDatabaseNetworkSubnetPayload> subnets) {
    
    this.subnets = subnets;
    return this;
  }

  public ProvisionDatabaseNetworkPayload addSubnetsItem(ProvisionDatabaseNetworkSubnetPayload subnetsItem) {
    if (this.subnets == null) {
      this.subnets = new ArrayList<>();
    }
    this.subnets.add(subnetsItem);
    return this;
  }

   /**
   * Get subnets
   * @return subnets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBNETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProvisionDatabaseNetworkSubnetPayload> getSubnets() {
    return subnets;
  }


  @JsonProperty(JSON_PROPERTY_SUBNETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubnets(List<ProvisionDatabaseNetworkSubnetPayload> subnets) {
    this.subnets = subnets;
  }


  public ProvisionDatabaseNetworkPayload vpc(ProvisionDatabaseNetworkVPCPayload vpc) {
    
    this.vpc = vpc;
    return this;
  }

   /**
   * Get vpc
   * @return vpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProvisionDatabaseNetworkVPCPayload getVpc() {
    return vpc;
  }


  @JsonProperty(JSON_PROPERTY_VPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpc(ProvisionDatabaseNetworkVPCPayload vpc) {
    this.vpc = vpc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionDatabaseNetworkPayload provisionDatabaseNetworkPayload = (ProvisionDatabaseNetworkPayload) o;
    return Objects.equals(this.name, provisionDatabaseNetworkPayload.name) &&
        Objects.equals(this.securityGroup, provisionDatabaseNetworkPayload.securityGroup) &&
        Objects.equals(this.subnets, provisionDatabaseNetworkPayload.subnets) &&
        Objects.equals(this.vpc, provisionDatabaseNetworkPayload.vpc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, securityGroup, subnets, vpc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionDatabaseNetworkPayload {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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

