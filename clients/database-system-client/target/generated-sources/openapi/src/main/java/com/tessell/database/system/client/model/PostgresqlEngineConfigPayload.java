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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * PostgresqlEngineConfigPayload
 */
@JsonPropertyOrder({
  PostgresqlEngineConfigPayload.JSON_PROPERTY_PARAMETER_PROFILE_ID,
  PostgresqlEngineConfigPayload.JSON_PROPERTY_AD_DOMAIN_ID,
  PostgresqlEngineConfigPayload.JSON_PROPERTY_PROXY_PORT
})
@JsonTypeName("PostgresqlEngineConfigPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostgresqlEngineConfigPayload {
  public static final String JSON_PROPERTY_PARAMETER_PROFILE_ID = "parameterProfileId";
  private UUID parameterProfileId;

  public static final String JSON_PROPERTY_AD_DOMAIN_ID = "adDomainId";
  private UUID adDomainId;

  public static final String JSON_PROPERTY_PROXY_PORT = "proxyPort";
  private Integer proxyPort;


  public PostgresqlEngineConfigPayload parameterProfileId(UUID parameterProfileId) {
    
    this.parameterProfileId = parameterProfileId;
    return this;
  }

   /**
   * The parameter profile id for the database
   * @return parameterProfileId
  **/
  @ApiModelProperty(required = true, value = "The parameter profile id for the database")
  @JsonProperty(JSON_PROPERTY_PARAMETER_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getParameterProfileId() {
    return parameterProfileId;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setParameterProfileId(UUID parameterProfileId) {
    this.parameterProfileId = parameterProfileId;
  }


  public PostgresqlEngineConfigPayload adDomainId(UUID adDomainId) {
    
    this.adDomainId = adDomainId;
    return this;
  }

   /**
   * Active Directory Domain id
   * @return adDomainId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Active Directory Domain id")
  @JsonProperty(JSON_PROPERTY_AD_DOMAIN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getAdDomainId() {
    return adDomainId;
  }


  @JsonProperty(JSON_PROPERTY_AD_DOMAIN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdDomainId(UUID adDomainId) {
    this.adDomainId = adDomainId;
  }


  public PostgresqlEngineConfigPayload proxyPort(Integer proxyPort) {
    
    this.proxyPort = proxyPort;
    return this;
  }

   /**
   * Get proxyPort
   * minimum: 0
   * @return proxyPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROXY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProxyPort() {
    return proxyPort;
  }


  @JsonProperty(JSON_PROPERTY_PROXY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProxyPort(Integer proxyPort) {
    this.proxyPort = proxyPort;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostgresqlEngineConfigPayload postgresqlEngineConfigPayload = (PostgresqlEngineConfigPayload) o;
    return Objects.equals(this.parameterProfileId, postgresqlEngineConfigPayload.parameterProfileId) &&
        Objects.equals(this.adDomainId, postgresqlEngineConfigPayload.adDomainId) &&
        Objects.equals(this.proxyPort, postgresqlEngineConfigPayload.proxyPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterProfileId, adDomainId, proxyPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostgresqlEngineConfigPayload {\n");
    sb.append("    parameterProfileId: ").append(toIndentedString(parameterProfileId)).append("\n");
    sb.append("    adDomainId: ").append(toIndentedString(adDomainId)).append("\n");
    sb.append("    proxyPort: ").append(toIndentedString(proxyPort)).append("\n");
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
