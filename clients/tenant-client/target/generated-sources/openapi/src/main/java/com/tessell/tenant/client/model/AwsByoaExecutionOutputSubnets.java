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
import com.tessell.tenant.client.model.AwsByoaExecutionOutputSubnet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * AwsByoaExecutionOutputSubnets
 */
@JsonPropertyOrder({
  AwsByoaExecutionOutputSubnets.JSON_PROPERTY_PRIVATE_SUBNETS,
  AwsByoaExecutionOutputSubnets.JSON_PROPERTY_PUBLIC_SUBNETS
})
@JsonTypeName("AwsByoaExecutionOutputSubnets")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AwsByoaExecutionOutputSubnets {
  public static final String JSON_PROPERTY_PRIVATE_SUBNETS = "privateSubnets";
  private List<AwsByoaExecutionOutputSubnet> privateSubnets = null;

  public static final String JSON_PROPERTY_PUBLIC_SUBNETS = "publicSubnets";
  private List<AwsByoaExecutionOutputSubnet> publicSubnets = null;


  public AwsByoaExecutionOutputSubnets privateSubnets(List<AwsByoaExecutionOutputSubnet> privateSubnets) {
    
    this.privateSubnets = privateSubnets;
    return this;
  }

  public AwsByoaExecutionOutputSubnets addPrivateSubnetsItem(AwsByoaExecutionOutputSubnet privateSubnetsItem) {
    if (this.privateSubnets == null) {
      this.privateSubnets = new ArrayList<>();
    }
    this.privateSubnets.add(privateSubnetsItem);
    return this;
  }

   /**
   * Private subnets created as part of the cloud formation deployment
   * @return privateSubnets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Private subnets created as part of the cloud formation deployment")
  @JsonProperty(JSON_PROPERTY_PRIVATE_SUBNETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AwsByoaExecutionOutputSubnet> getPrivateSubnets() {
    return privateSubnets;
  }


  @JsonProperty(JSON_PROPERTY_PRIVATE_SUBNETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivateSubnets(List<AwsByoaExecutionOutputSubnet> privateSubnets) {
    this.privateSubnets = privateSubnets;
  }


  public AwsByoaExecutionOutputSubnets publicSubnets(List<AwsByoaExecutionOutputSubnet> publicSubnets) {
    
    this.publicSubnets = publicSubnets;
    return this;
  }

  public AwsByoaExecutionOutputSubnets addPublicSubnetsItem(AwsByoaExecutionOutputSubnet publicSubnetsItem) {
    if (this.publicSubnets == null) {
      this.publicSubnets = new ArrayList<>();
    }
    this.publicSubnets.add(publicSubnetsItem);
    return this;
  }

   /**
   * Public subnets created as part of the cloud formation deployment
   * @return publicSubnets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Public subnets created as part of the cloud formation deployment")
  @JsonProperty(JSON_PROPERTY_PUBLIC_SUBNETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AwsByoaExecutionOutputSubnet> getPublicSubnets() {
    return publicSubnets;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_SUBNETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicSubnets(List<AwsByoaExecutionOutputSubnet> publicSubnets) {
    this.publicSubnets = publicSubnets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsByoaExecutionOutputSubnets awsByoaExecutionOutputSubnets = (AwsByoaExecutionOutputSubnets) o;
    return Objects.equals(this.privateSubnets, awsByoaExecutionOutputSubnets.privateSubnets) &&
        Objects.equals(this.publicSubnets, awsByoaExecutionOutputSubnets.publicSubnets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateSubnets, publicSubnets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsByoaExecutionOutputSubnets {\n");
    sb.append("    privateSubnets: ").append(toIndentedString(privateSubnets)).append("\n");
    sb.append("    publicSubnets: ").append(toIndentedString(publicSubnets)).append("\n");
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
