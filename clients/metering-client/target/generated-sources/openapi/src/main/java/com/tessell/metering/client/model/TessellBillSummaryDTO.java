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
import com.tessell.metering.client.model.TessellCreditSummaryDTO;
import com.tessell.metering.client.model.TessellDiscountDTO;
import com.tessell.metering.client.model.TessellInvoiceConfigDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Billing configuration for tenant
 */
@ApiModel(description = "Billing configuration for tenant")
@JsonPropertyOrder({
  TessellBillSummaryDTO.JSON_PROPERTY_SERVICE_ENABLED,
  TessellBillSummaryDTO.JSON_PROPERTY_VALID_PAYMENT_METHOD,
  TessellBillSummaryDTO.JSON_PROPERTY_DISCOUNT,
  TessellBillSummaryDTO.JSON_PROPERTY_CREDIT,
  TessellBillSummaryDTO.JSON_PROPERTY_INVOICE
})
@JsonTypeName("TessellBillSummaryDTO")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:01.620011+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellBillSummaryDTO {
  public static final String JSON_PROPERTY_SERVICE_ENABLED = "serviceEnabled";
  private Boolean serviceEnabled;

  public static final String JSON_PROPERTY_VALID_PAYMENT_METHOD = "validPaymentMethod";
  private Boolean validPaymentMethod;

  public static final String JSON_PROPERTY_DISCOUNT = "discount";
  private TessellDiscountDTO discount;

  public static final String JSON_PROPERTY_CREDIT = "credit";
  private TessellCreditSummaryDTO credit;

  public static final String JSON_PROPERTY_INVOICE = "invoice";
  private TessellInvoiceConfigDTO invoice;


  public TessellBillSummaryDTO serviceEnabled(Boolean serviceEnabled) {
    
    this.serviceEnabled = serviceEnabled;
    return this;
  }

   /**
   * Indicates if Tessell service is enabled for this tenant
   * @return serviceEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if Tessell service is enabled for this tenant")
  @JsonProperty(JSON_PROPERTY_SERVICE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getServiceEnabled() {
    return serviceEnabled;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceEnabled(Boolean serviceEnabled) {
    this.serviceEnabled = serviceEnabled;
  }


  public TessellBillSummaryDTO validPaymentMethod(Boolean validPaymentMethod) {
    
    this.validPaymentMethod = validPaymentMethod;
    return this;
  }

   /**
   * Indicates weather the customer has configured a valid bill payment method with Tessell
   * @return validPaymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates weather the customer has configured a valid bill payment method with Tessell")
  @JsonProperty(JSON_PROPERTY_VALID_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getValidPaymentMethod() {
    return validPaymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_VALID_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidPaymentMethod(Boolean validPaymentMethod) {
    this.validPaymentMethod = validPaymentMethod;
  }


  public TessellBillSummaryDTO discount(TessellDiscountDTO discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellDiscountDTO getDiscount() {
    return discount;
  }


  @JsonProperty(JSON_PROPERTY_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscount(TessellDiscountDTO discount) {
    this.discount = discount;
  }


  public TessellBillSummaryDTO credit(TessellCreditSummaryDTO credit) {
    
    this.credit = credit;
    return this;
  }

   /**
   * Get credit
   * @return credit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellCreditSummaryDTO getCredit() {
    return credit;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredit(TessellCreditSummaryDTO credit) {
    this.credit = credit;
  }


  public TessellBillSummaryDTO invoice(TessellInvoiceConfigDTO invoice) {
    
    this.invoice = invoice;
    return this;
  }

   /**
   * Get invoice
   * @return invoice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellInvoiceConfigDTO getInvoice() {
    return invoice;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoice(TessellInvoiceConfigDTO invoice) {
    this.invoice = invoice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellBillSummaryDTO tessellBillSummaryDTO = (TessellBillSummaryDTO) o;
    return Objects.equals(this.serviceEnabled, tessellBillSummaryDTO.serviceEnabled) &&
        Objects.equals(this.validPaymentMethod, tessellBillSummaryDTO.validPaymentMethod) &&
        Objects.equals(this.discount, tessellBillSummaryDTO.discount) &&
        Objects.equals(this.credit, tessellBillSummaryDTO.credit) &&
        Objects.equals(this.invoice, tessellBillSummaryDTO.invoice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceEnabled, validPaymentMethod, discount, credit, invoice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellBillSummaryDTO {\n");
    sb.append("    serviceEnabled: ").append(toIndentedString(serviceEnabled)).append("\n");
    sb.append("    validPaymentMethod: ").append(toIndentedString(validPaymentMethod)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
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

