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
import com.tessell.tenant.client.model.MilvusDBPluginImagesVersionInfoByCloud;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DBPluginImagesVersionInfo
 */
@JsonPropertyOrder({
  DBPluginImagesVersionInfo.JSON_PROPERTY_MILVUS
})
@JsonTypeName("DBPluginImagesVersionInfo")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DBPluginImagesVersionInfo {
  public static final String JSON_PROPERTY_MILVUS = "milvus";
  private MilvusDBPluginImagesVersionInfoByCloud milvus;


  public DBPluginImagesVersionInfo milvus(MilvusDBPluginImagesVersionInfoByCloud milvus) {
    
    this.milvus = milvus;
    return this;
  }

   /**
   * Get milvus
   * @return milvus
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MILVUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MilvusDBPluginImagesVersionInfoByCloud getMilvus() {
    return milvus;
  }


  @JsonProperty(JSON_PROPERTY_MILVUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMilvus(MilvusDBPluginImagesVersionInfoByCloud milvus) {
    this.milvus = milvus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DBPluginImagesVersionInfo dbPluginImagesVersionInfo = (DBPluginImagesVersionInfo) o;
    return Objects.equals(this.milvus, dbPluginImagesVersionInfo.milvus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(milvus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBPluginImagesVersionInfo {\n");
    sb.append("    milvus: ").append(toIndentedString(milvus)).append("\n");
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

