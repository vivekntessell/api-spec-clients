/*
 * Tessell Metering Service API
 * Metering API
 *
 * The version of the OpenAPI document: v1beta
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.metering.client.model;

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
 * This is a definition for customer address in billing profile
 */
@ApiModel(description = "This is a definition for customer address in billing profile")
@JsonPropertyOrder({
  TessellCustomerBillingProfileAddress.JSON_PROPERTY_CITY,
  TessellCustomerBillingProfileAddress.JSON_PROPERTY_COUNTRY,
  TessellCustomerBillingProfileAddress.JSON_PROPERTY_STATE,
  TessellCustomerBillingProfileAddress.JSON_PROPERTY_ADDRESS_LINE1,
  TessellCustomerBillingProfileAddress.JSON_PROPERTY_ADDRESS_LINE2,
  TessellCustomerBillingProfileAddress.JSON_PROPERTY_ZIP_CODE
})
@JsonTypeName("TessellCustomerBillingProfileAddress")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:01.620011+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellCustomerBillingProfileAddress {
  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_ADDRESS_LINE1 = "addressLine1";
  private String addressLine1;

  public static final String JSON_PROPERTY_ADDRESS_LINE2 = "addressLine2";
  private String addressLine2;

  public static final String JSON_PROPERTY_ZIP_CODE = "zipCode";
  private String zipCode;


  public TessellCustomerBillingProfileAddress city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * city of customer
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "city of customer")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public TessellCustomerBillingProfileAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * country of customer
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "country of customer")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


  public TessellCustomerBillingProfileAddress state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * state of customer
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "state of customer")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public TessellCustomerBillingProfileAddress addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * addressLine1 of customer
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "addressLine1 of customer")
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressLine1() {
    return addressLine1;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public TessellCustomerBillingProfileAddress addressLine2(String addressLine2) {
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * addressLine2 of customer
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "addressLine2 of customer")
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressLine2() {
    return addressLine2;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public TessellCustomerBillingProfileAddress zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * zipCode of customer
   * @return zipCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "zipCode of customer")
  @JsonProperty(JSON_PROPERTY_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZipCode() {
    return zipCode;
  }


  @JsonProperty(JSON_PROPERTY_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellCustomerBillingProfileAddress tessellCustomerBillingProfileAddress = (TessellCustomerBillingProfileAddress) o;
    return Objects.equals(this.city, tessellCustomerBillingProfileAddress.city) &&
        Objects.equals(this.country, tessellCustomerBillingProfileAddress.country) &&
        Objects.equals(this.state, tessellCustomerBillingProfileAddress.state) &&
        Objects.equals(this.addressLine1, tessellCustomerBillingProfileAddress.addressLine1) &&
        Objects.equals(this.addressLine2, tessellCustomerBillingProfileAddress.addressLine2) &&
        Objects.equals(this.zipCode, tessellCustomerBillingProfileAddress.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, state, addressLine1, addressLine2, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellCustomerBillingProfileAddress {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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

