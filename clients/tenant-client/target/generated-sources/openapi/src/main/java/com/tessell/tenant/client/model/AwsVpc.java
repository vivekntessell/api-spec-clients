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
import com.tessell.tenant.client.model.AwsSubnet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Details of AWS VPC
 */
@ApiModel(description = "Details of AWS VPC")
@JsonPropertyOrder({
  AwsVpc.JSON_PROPERTY_VPC_NAME,
  AwsVpc.JSON_PROPERTY_VPC_ID,
  AwsVpc.JSON_PROPERTY_VPC_CIDR_BLOCK,
  AwsVpc.JSON_PROPERTY_ENABLE_PUBLIC_ACCESS,
  AwsVpc.JSON_PROPERTY_PUBLIC_SUBNETS,
  AwsVpc.JSON_PROPERTY_PRIVATE_SUBNETS
})
@JsonTypeName("AwsVpc")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AwsVpc {
  public static final String JSON_PROPERTY_VPC_NAME = "vpcName";
  private String vpcName;

  public static final String JSON_PROPERTY_VPC_ID = "vpcId";
  private String vpcId;

  public static final String JSON_PROPERTY_VPC_CIDR_BLOCK = "vpcCidrBlock";
  private String vpcCidrBlock;

  public static final String JSON_PROPERTY_ENABLE_PUBLIC_ACCESS = "enablePublicAccess";
  private Boolean enablePublicAccess = true;

  public static final String JSON_PROPERTY_PUBLIC_SUBNETS = "publicSubnets";
  private List<AwsSubnet> publicSubnets = null;

  public static final String JSON_PROPERTY_PRIVATE_SUBNETS = "privateSubnets";
  private List<AwsSubnet> privateSubnets = null;


  public AwsVpc vpcName(String vpcName) {
    
    this.vpcName = vpcName;
    return this;
  }

   /**
   * Name of the VPC
   * @return vpcName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the VPC")
  @JsonProperty(JSON_PROPERTY_VPC_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVpcName() {
    return vpcName;
  }


  @JsonProperty(JSON_PROPERTY_VPC_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpcName(String vpcName) {
    this.vpcName = vpcName;
  }


  public AwsVpc vpcId(String vpcId) {
    
    this.vpcId = vpcId;
    return this;
  }

   /**
   * Id of the vpc
   * @return vpcId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the vpc")
  @JsonProperty(JSON_PROPERTY_VPC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVpcId() {
    return vpcId;
  }


  @JsonProperty(JSON_PROPERTY_VPC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpcId(String vpcId) {
    this.vpcId = vpcId;
  }


  public AwsVpc vpcCidrBlock(String vpcCidrBlock) {
    
    this.vpcCidrBlock = vpcCidrBlock;
    return this;
  }

   /**
   * cidr block of the vpc
   * @return vpcCidrBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.0.0.4/24", value = "cidr block of the vpc")
  @JsonProperty(JSON_PROPERTY_VPC_CIDR_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVpcCidrBlock() {
    return vpcCidrBlock;
  }


  @JsonProperty(JSON_PROPERTY_VPC_CIDR_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpcCidrBlock(String vpcCidrBlock) {
    this.vpcCidrBlock = vpcCidrBlock;
  }


  public AwsVpc enablePublicAccess(Boolean enablePublicAccess) {
    
    this.enablePublicAccess = enablePublicAccess;
    return this;
  }

   /**
   * Whether VPC is public or not
   * @return enablePublicAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether VPC is public or not")
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


  public AwsVpc publicSubnets(List<AwsSubnet> publicSubnets) {
    
    this.publicSubnets = publicSubnets;
    return this;
  }

  public AwsVpc addPublicSubnetsItem(AwsSubnet publicSubnetsItem) {
    if (this.publicSubnets == null) {
      this.publicSubnets = new ArrayList<>();
    }
    this.publicSubnets.add(publicSubnetsItem);
    return this;
  }

   /**
   * Public subnets
   * @return publicSubnets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Public subnets")
  @JsonProperty(JSON_PROPERTY_PUBLIC_SUBNETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AwsSubnet> getPublicSubnets() {
    return publicSubnets;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_SUBNETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicSubnets(List<AwsSubnet> publicSubnets) {
    this.publicSubnets = publicSubnets;
  }


  public AwsVpc privateSubnets(List<AwsSubnet> privateSubnets) {
    
    this.privateSubnets = privateSubnets;
    return this;
  }

  public AwsVpc addPrivateSubnetsItem(AwsSubnet privateSubnetsItem) {
    if (this.privateSubnets == null) {
      this.privateSubnets = new ArrayList<>();
    }
    this.privateSubnets.add(privateSubnetsItem);
    return this;
  }

   /**
   * Private subnets
   * @return privateSubnets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Private subnets")
  @JsonProperty(JSON_PROPERTY_PRIVATE_SUBNETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AwsSubnet> getPrivateSubnets() {
    return privateSubnets;
  }


  @JsonProperty(JSON_PROPERTY_PRIVATE_SUBNETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivateSubnets(List<AwsSubnet> privateSubnets) {
    this.privateSubnets = privateSubnets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsVpc awsVpc = (AwsVpc) o;
    return Objects.equals(this.vpcName, awsVpc.vpcName) &&
        Objects.equals(this.vpcId, awsVpc.vpcId) &&
        Objects.equals(this.vpcCidrBlock, awsVpc.vpcCidrBlock) &&
        Objects.equals(this.enablePublicAccess, awsVpc.enablePublicAccess) &&
        Objects.equals(this.publicSubnets, awsVpc.publicSubnets) &&
        Objects.equals(this.privateSubnets, awsVpc.privateSubnets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vpcName, vpcId, vpcCidrBlock, enablePublicAccess, publicSubnets, privateSubnets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsVpc {\n");
    sb.append("    vpcName: ").append(toIndentedString(vpcName)).append("\n");
    sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
    sb.append("    vpcCidrBlock: ").append(toIndentedString(vpcCidrBlock)).append("\n");
    sb.append("    enablePublicAccess: ").append(toIndentedString(enablePublicAccess)).append("\n");
    sb.append("    publicSubnets: ").append(toIndentedString(publicSubnets)).append("\n");
    sb.append("    privateSubnets: ").append(toIndentedString(privateSubnets)).append("\n");
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

