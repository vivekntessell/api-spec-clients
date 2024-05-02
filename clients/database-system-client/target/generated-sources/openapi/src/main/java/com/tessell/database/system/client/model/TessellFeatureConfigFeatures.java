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
import com.tessell.database.system.client.model.TessellInstanceResizeFeatureConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellFeatureConfigFeatures
 */
@JsonPropertyOrder({
  TessellFeatureConfigFeatures.JSON_PROPERTY_INSTANCE_RESIZE
})
@JsonTypeName("TessellFeatureConfig_features")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellFeatureConfigFeatures {
  public static final String JSON_PROPERTY_INSTANCE_RESIZE = "instanceResize";
  private List<TessellInstanceResizeFeatureConfig> instanceResize = null;


  public TessellFeatureConfigFeatures instanceResize(List<TessellInstanceResizeFeatureConfig> instanceResize) {
    
    this.instanceResize = instanceResize;
    return this;
  }

  public TessellFeatureConfigFeatures addInstanceResizeItem(TessellInstanceResizeFeatureConfig instanceResizeItem) {
    if (this.instanceResize == null) {
      this.instanceResize = new ArrayList<>();
    }
    this.instanceResize.add(instanceResizeItem);
    return this;
  }

   /**
   * Get instanceResize
   * @return instanceResize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTANCE_RESIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellInstanceResizeFeatureConfig> getInstanceResize() {
    return instanceResize;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_RESIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstanceResize(List<TessellInstanceResizeFeatureConfig> instanceResize) {
    this.instanceResize = instanceResize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellFeatureConfigFeatures tessellFeatureConfigFeatures = (TessellFeatureConfigFeatures) o;
    return Objects.equals(this.instanceResize, tessellFeatureConfigFeatures.instanceResize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceResize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellFeatureConfigFeatures {\n");
    sb.append("    instanceResize: ").append(toIndentedString(instanceResize)).append("\n");
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

