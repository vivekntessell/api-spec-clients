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
import com.tessell.database.system.client.model.DatabaseEngineType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * EngineReservedKeywordsDTO
 */
@JsonPropertyOrder({
  EngineReservedKeywordsDTO.JSON_PROPERTY_ENGINE,
  EngineReservedKeywordsDTO.JSON_PROPERTY_RESERVED_KEYWORDS
})
@JsonTypeName("EngineReservedKeywordsDTO")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class EngineReservedKeywordsDTO {
  public static final String JSON_PROPERTY_ENGINE = "engine";
  private DatabaseEngineType engine;

  public static final String JSON_PROPERTY_RESERVED_KEYWORDS = "reservedKeywords";
  private List<String> reservedKeywords = null;


  public EngineReservedKeywordsDTO engine(DatabaseEngineType engine) {
    
    this.engine = engine;
    return this;
  }

   /**
   * Get engine
   * @return engine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENGINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DatabaseEngineType getEngine() {
    return engine;
  }


  @JsonProperty(JSON_PROPERTY_ENGINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEngine(DatabaseEngineType engine) {
    this.engine = engine;
  }


  public EngineReservedKeywordsDTO reservedKeywords(List<String> reservedKeywords) {
    
    this.reservedKeywords = reservedKeywords;
    return this;
  }

  public EngineReservedKeywordsDTO addReservedKeywordsItem(String reservedKeywordsItem) {
    if (this.reservedKeywords == null) {
      this.reservedKeywords = new ArrayList<>();
    }
    this.reservedKeywords.add(reservedKeywordsItem);
    return this;
  }

   /**
   * Get reservedKeywords
   * @return reservedKeywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESERVED_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getReservedKeywords() {
    return reservedKeywords;
  }


  @JsonProperty(JSON_PROPERTY_RESERVED_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReservedKeywords(List<String> reservedKeywords) {
    this.reservedKeywords = reservedKeywords;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EngineReservedKeywordsDTO engineReservedKeywordsDTO = (EngineReservedKeywordsDTO) o;
    return Objects.equals(this.engine, engineReservedKeywordsDTO.engine) &&
        Objects.equals(this.reservedKeywords, engineReservedKeywordsDTO.reservedKeywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engine, reservedKeywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EngineReservedKeywordsDTO {\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    reservedKeywords: ").append(toIndentedString(reservedKeywords)).append("\n");
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

