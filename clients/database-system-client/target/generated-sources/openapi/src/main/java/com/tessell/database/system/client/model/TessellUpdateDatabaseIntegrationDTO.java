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
import com.tessell.database.system.client.model.TessellIntegrationRequestType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellUpdateDatabaseIntegrationDTO
 */
@JsonPropertyOrder({
  TessellUpdateDatabaseIntegrationDTO.JSON_PROPERTY_REQUEST,
  TessellUpdateDatabaseIntegrationDTO.JSON_PROPERTY_ID,
  TessellUpdateDatabaseIntegrationDTO.JSON_PROPERTY_TENANT_ID
})
@JsonTypeName("TessellUpdateDatabaseIntegrationDTO")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellUpdateDatabaseIntegrationDTO {
  public static final String JSON_PROPERTY_REQUEST = "request";
  private TessellIntegrationRequestType request;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private String tenantId;


  public TessellUpdateDatabaseIntegrationDTO request(TessellIntegrationRequestType request) {
    
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellIntegrationRequestType getRequest() {
    return request;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequest(TessellIntegrationRequestType request) {
    this.request = request;
  }


  public TessellUpdateDatabaseIntegrationDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the integration to add/remove/update from database
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the integration to add/remove/update from database")
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


  public TessellUpdateDatabaseIntegrationDTO tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Tenant ID of the integration to add/remove/update from database
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tenant ID of the integration to add/remove/update from database")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellUpdateDatabaseIntegrationDTO tessellUpdateDatabaseIntegrationDTO = (TessellUpdateDatabaseIntegrationDTO) o;
    return Objects.equals(this.request, tessellUpdateDatabaseIntegrationDTO.request) &&
        Objects.equals(this.id, tessellUpdateDatabaseIntegrationDTO.id) &&
        Objects.equals(this.tenantId, tessellUpdateDatabaseIntegrationDTO.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, id, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellUpdateDatabaseIntegrationDTO {\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

