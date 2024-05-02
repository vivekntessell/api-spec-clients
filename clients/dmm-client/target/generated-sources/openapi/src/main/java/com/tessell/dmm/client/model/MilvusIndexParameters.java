/*
 * Tessell Availability Machine REST Web Services' API Documentation
 * Tessell Availability Machine REST Web Services' Api Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sagar.sontakke@tessell.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.dmm.client.model;

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
 * MilvusIndexParameters
 */
@JsonPropertyOrder({
  MilvusIndexParameters.JSON_PROPERTY_M,
  MilvusIndexParameters.JSON_PROPERTY_NLIST,
  MilvusIndexParameters.JSON_PROPERTY_EFCONSTRUCTIONS,
  MilvusIndexParameters.JSON_PROPERTY_NTREES
})
@JsonTypeName("MilvusIndexParameters")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MilvusIndexParameters {
  public static final String JSON_PROPERTY_M = "m";
  private Integer m;

  public static final String JSON_PROPERTY_NLIST = "nlist";
  private Integer nlist;

  public static final String JSON_PROPERTY_EFCONSTRUCTIONS = "efconstructions";
  private Integer efconstructions;

  public static final String JSON_PROPERTY_NTREES = "ntrees";
  private Integer ntrees;


  public MilvusIndexParameters m(Integer m) {
    
    this.m = m;
    return this;
  }

   /**
   * Get m
   * @return m
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getM() {
    return m;
  }


  @JsonProperty(JSON_PROPERTY_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setM(Integer m) {
    this.m = m;
  }


  public MilvusIndexParameters nlist(Integer nlist) {
    
    this.nlist = nlist;
    return this;
  }

   /**
   * Get nlist
   * @return nlist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NLIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNlist() {
    return nlist;
  }


  @JsonProperty(JSON_PROPERTY_NLIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNlist(Integer nlist) {
    this.nlist = nlist;
  }


  public MilvusIndexParameters efconstructions(Integer efconstructions) {
    
    this.efconstructions = efconstructions;
    return this;
  }

   /**
   * Get efconstructions
   * @return efconstructions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EFCONSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEfconstructions() {
    return efconstructions;
  }


  @JsonProperty(JSON_PROPERTY_EFCONSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEfconstructions(Integer efconstructions) {
    this.efconstructions = efconstructions;
  }


  public MilvusIndexParameters ntrees(Integer ntrees) {
    
    this.ntrees = ntrees;
    return this;
  }

   /**
   * Get ntrees
   * @return ntrees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NTREES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNtrees() {
    return ntrees;
  }


  @JsonProperty(JSON_PROPERTY_NTREES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNtrees(Integer ntrees) {
    this.ntrees = ntrees;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MilvusIndexParameters milvusIndexParameters = (MilvusIndexParameters) o;
    return Objects.equals(this.m, milvusIndexParameters.m) &&
        Objects.equals(this.nlist, milvusIndexParameters.nlist) &&
        Objects.equals(this.efconstructions, milvusIndexParameters.efconstructions) &&
        Objects.equals(this.ntrees, milvusIndexParameters.ntrees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(m, nlist, efconstructions, ntrees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MilvusIndexParameters {\n");
    sb.append("    m: ").append(toIndentedString(m)).append("\n");
    sb.append("    nlist: ").append(toIndentedString(nlist)).append("\n");
    sb.append("    efconstructions: ").append(toIndentedString(efconstructions)).append("\n");
    sb.append("    ntrees: ").append(toIndentedString(ntrees)).append("\n");
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

