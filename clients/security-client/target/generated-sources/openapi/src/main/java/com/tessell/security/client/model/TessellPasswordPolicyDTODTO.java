/*
 * Tessell REST API Documentation
 * Tessell REST API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.security.client.model;

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
 * TessellPasswordPolicyDTODTO
 */
@JsonPropertyOrder({
  TessellPasswordPolicyDTODTO.JSON_PROPERTY_EXPIRY_TIME_IN_DAYS,
  TessellPasswordPolicyDTODTO.JSON_PROPERTY_MIN_LENGTH,
  TessellPasswordPolicyDTODTO.JSON_PROPERTY_NO_INVALID_ATTEMPTS,
  TessellPasswordPolicyDTODTO.JSON_PROPERTY_IS_UPPER_CASE,
  TessellPasswordPolicyDTODTO.JSON_PROPERTY_IS_LOWER_CASE,
  TessellPasswordPolicyDTODTO.JSON_PROPERTY_IS_NUMBER,
  TessellPasswordPolicyDTODTO.JSON_PROPERTY_IS_SPECIAL_CHARACTER
})
@JsonTypeName("PasswordPolicyDTO")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellPasswordPolicyDTODTO {
  public static final String JSON_PROPERTY_EXPIRY_TIME_IN_DAYS = "expiryTimeInDays";
  private Integer expiryTimeInDays;

  public static final String JSON_PROPERTY_MIN_LENGTH = "minLength";
  private Integer minLength;

  public static final String JSON_PROPERTY_NO_INVALID_ATTEMPTS = "noInvalidAttempts";
  private Integer noInvalidAttempts;

  public static final String JSON_PROPERTY_IS_UPPER_CASE = "isUpperCase";
  private Boolean isUpperCase;

  public static final String JSON_PROPERTY_IS_LOWER_CASE = "isLowerCase";
  private Boolean isLowerCase;

  public static final String JSON_PROPERTY_IS_NUMBER = "isNumber";
  private Boolean isNumber;

  public static final String JSON_PROPERTY_IS_SPECIAL_CHARACTER = "isSpecialCharacter";
  private Boolean isSpecialCharacter;


  public TessellPasswordPolicyDTODTO expiryTimeInDays(Integer expiryTimeInDays) {
    
    this.expiryTimeInDays = expiryTimeInDays;
    return this;
  }

   /**
   * Get expiryTimeInDays
   * @return expiryTimeInDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPIRY_TIME_IN_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExpiryTimeInDays() {
    return expiryTimeInDays;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY_TIME_IN_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryTimeInDays(Integer expiryTimeInDays) {
    this.expiryTimeInDays = expiryTimeInDays;
  }


  public TessellPasswordPolicyDTODTO minLength(Integer minLength) {
    
    this.minLength = minLength;
    return this;
  }

   /**
   * Get minLength
   * @return minLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MIN_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinLength() {
    return minLength;
  }


  @JsonProperty(JSON_PROPERTY_MIN_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }


  public TessellPasswordPolicyDTODTO noInvalidAttempts(Integer noInvalidAttempts) {
    
    this.noInvalidAttempts = noInvalidAttempts;
    return this;
  }

   /**
   * Get noInvalidAttempts
   * @return noInvalidAttempts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NO_INVALID_ATTEMPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNoInvalidAttempts() {
    return noInvalidAttempts;
  }


  @JsonProperty(JSON_PROPERTY_NO_INVALID_ATTEMPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoInvalidAttempts(Integer noInvalidAttempts) {
    this.noInvalidAttempts = noInvalidAttempts;
  }


  public TessellPasswordPolicyDTODTO isUpperCase(Boolean isUpperCase) {
    
    this.isUpperCase = isUpperCase;
    return this;
  }

   /**
   * Get isUpperCase
   * @return isUpperCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_UPPER_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsUpperCase() {
    return isUpperCase;
  }


  @JsonProperty(JSON_PROPERTY_IS_UPPER_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsUpperCase(Boolean isUpperCase) {
    this.isUpperCase = isUpperCase;
  }


  public TessellPasswordPolicyDTODTO isLowerCase(Boolean isLowerCase) {
    
    this.isLowerCase = isLowerCase;
    return this;
  }

   /**
   * Get isLowerCase
   * @return isLowerCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_LOWER_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsLowerCase() {
    return isLowerCase;
  }


  @JsonProperty(JSON_PROPERTY_IS_LOWER_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsLowerCase(Boolean isLowerCase) {
    this.isLowerCase = isLowerCase;
  }


  public TessellPasswordPolicyDTODTO isNumber(Boolean isNumber) {
    
    this.isNumber = isNumber;
    return this;
  }

   /**
   * Should password contain a Number
   * @return isNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Should password contain a Number")
  @JsonProperty(JSON_PROPERTY_IS_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsNumber() {
    return isNumber;
  }


  @JsonProperty(JSON_PROPERTY_IS_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsNumber(Boolean isNumber) {
    this.isNumber = isNumber;
  }


  public TessellPasswordPolicyDTODTO isSpecialCharacter(Boolean isSpecialCharacter) {
    
    this.isSpecialCharacter = isSpecialCharacter;
    return this;
  }

   /**
   * Should password contain an Special character
   * @return isSpecialCharacter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Should password contain an Special character")
  @JsonProperty(JSON_PROPERTY_IS_SPECIAL_CHARACTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsSpecialCharacter() {
    return isSpecialCharacter;
  }


  @JsonProperty(JSON_PROPERTY_IS_SPECIAL_CHARACTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsSpecialCharacter(Boolean isSpecialCharacter) {
    this.isSpecialCharacter = isSpecialCharacter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellPasswordPolicyDTODTO passwordPolicyDTO = (TessellPasswordPolicyDTODTO) o;
    return Objects.equals(this.expiryTimeInDays, passwordPolicyDTO.expiryTimeInDays) &&
        Objects.equals(this.minLength, passwordPolicyDTO.minLength) &&
        Objects.equals(this.noInvalidAttempts, passwordPolicyDTO.noInvalidAttempts) &&
        Objects.equals(this.isUpperCase, passwordPolicyDTO.isUpperCase) &&
        Objects.equals(this.isLowerCase, passwordPolicyDTO.isLowerCase) &&
        Objects.equals(this.isNumber, passwordPolicyDTO.isNumber) &&
        Objects.equals(this.isSpecialCharacter, passwordPolicyDTO.isSpecialCharacter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiryTimeInDays, minLength, noInvalidAttempts, isUpperCase, isLowerCase, isNumber, isSpecialCharacter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellPasswordPolicyDTODTO {\n");
    sb.append("    expiryTimeInDays: ").append(toIndentedString(expiryTimeInDays)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    noInvalidAttempts: ").append(toIndentedString(noInvalidAttempts)).append("\n");
    sb.append("    isUpperCase: ").append(toIndentedString(isUpperCase)).append("\n");
    sb.append("    isLowerCase: ").append(toIndentedString(isLowerCase)).append("\n");
    sb.append("    isNumber: ").append(toIndentedString(isNumber)).append("\n");
    sb.append("    isSpecialCharacter: ").append(toIndentedString(isSpecialCharacter)).append("\n");
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

