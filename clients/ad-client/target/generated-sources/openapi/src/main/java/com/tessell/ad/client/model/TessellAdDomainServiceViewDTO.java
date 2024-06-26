/*
 * AD Domain Governance API Documentation
 * AD Domain Governance API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.ad.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * AD Domain Service View
 */
@ApiModel(description = "AD Domain Service View")
@JsonPropertyOrder({
  TessellAdDomainServiceViewDTO.JSON_PROPERTY_ID,
  TessellAdDomainServiceViewDTO.JSON_PROPERTY_TESSELL_NAME,
  TessellAdDomainServiceViewDTO.JSON_PROPERTY_DOMAIN_NAME,
  TessellAdDomainServiceViewDTO.JSON_PROPERTY_NET_B_I_O_SOR_O_U
})
@JsonTypeName("AdDomainServiceView")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:10.647596+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellAdDomainServiceViewDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_TESSELL_NAME = "tessellName";
  private String tessellName;

  public static final String JSON_PROPERTY_DOMAIN_NAME = "domainName";
  private String domainName;

  public static final String JSON_PROPERTY_NET_B_I_O_SOR_O_U = "netBIOSorOU";
  private String netBIOSorOU;


  public TessellAdDomainServiceViewDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public TessellAdDomainServiceViewDTO tessellName(String tessellName) {
    
    this.tessellName = tessellName;
    return this;
  }

   /**
   * Tessell Name for Ad Domain
   * @return tessellName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tessell Name for Ad Domain")
  @JsonProperty(JSON_PROPERTY_TESSELL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTessellName() {
    return tessellName;
  }


  @JsonProperty(JSON_PROPERTY_TESSELL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTessellName(String tessellName) {
    this.tessellName = tessellName;
  }


  public TessellAdDomainServiceViewDTO domainName(String domainName) {
    
    this.domainName = domainName;
    return this;
  }

   /**
   * Domain Name
   * @return domainName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Domain Name")
  @JsonProperty(JSON_PROPERTY_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomainName() {
    return domainName;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }


  public TessellAdDomainServiceViewDTO netBIOSorOU(String netBIOSorOU) {
    
    this.netBIOSorOU = netBIOSorOU;
    return this;
  }

   /**
   * NetBIOS name or OU
   * @return netBIOSorOU
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NetBIOS name or OU")
  @JsonProperty(JSON_PROPERTY_NET_B_I_O_SOR_O_U)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetBIOSorOU() {
    return netBIOSorOU;
  }


  @JsonProperty(JSON_PROPERTY_NET_B_I_O_SOR_O_U)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetBIOSorOU(String netBIOSorOU) {
    this.netBIOSorOU = netBIOSorOU;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellAdDomainServiceViewDTO adDomainServiceView = (TessellAdDomainServiceViewDTO) o;
    return Objects.equals(this.id, adDomainServiceView.id) &&
        Objects.equals(this.tessellName, adDomainServiceView.tessellName) &&
        Objects.equals(this.domainName, adDomainServiceView.domainName) &&
        Objects.equals(this.netBIOSorOU, adDomainServiceView.netBIOSorOU);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tessellName, domainName, netBIOSorOU);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellAdDomainServiceViewDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tessellName: ").append(toIndentedString(tessellName)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    netBIOSorOU: ").append(toIndentedString(netBIOSorOU)).append("\n");
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

