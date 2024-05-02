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
import com.tessell.database.system.client.model.AssociatedWithDbServiceInfoForLeaks;
import com.tessell.database.system.client.model.ComputeResourceStatusOps;
import com.tessell.database.system.client.model.ComputeResourceType;
import com.tessell.database.system.client.model.DatabaseEngineType;
import com.tessell.database.system.client.model.LeakStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * LeakEvaluationForCR
 */
@JsonPropertyOrder({
  LeakEvaluationForCR.JSON_PROPERTY_TENANT_ID,
  LeakEvaluationForCR.JSON_PROPERTY_TENANT_NAME,
  LeakEvaluationForCR.JSON_PROPERTY_COMPUTE_RESOURCE_ID,
  LeakEvaluationForCR.JSON_PROPERTY_IS_LEAK,
  LeakEvaluationForCR.JSON_PROPERTY_CLOUD_RESOURCE_ID,
  LeakEvaluationForCR.JSON_PROPERTY_NAME,
  LeakEvaluationForCR.JSON_PROPERTY_STATUS,
  LeakEvaluationForCR.JSON_PROPERTY_TYPE,
  LeakEvaluationForCR.JSON_PROPERTY_ENGINE_TYPE,
  LeakEvaluationForCR.JSON_PROPERTY_ASSOCIATED_WITH_DB_SERVICE
})
@JsonTypeName("LeakEvaluationForCR")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class LeakEvaluationForCR {
  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private UUID tenantId;

  public static final String JSON_PROPERTY_TENANT_NAME = "tenantName";
  private String tenantName;

  public static final String JSON_PROPERTY_COMPUTE_RESOURCE_ID = "computeResourceId";
  private UUID computeResourceId;

  public static final String JSON_PROPERTY_IS_LEAK = "isLeak";
  private LeakStatus isLeak;

  public static final String JSON_PROPERTY_CLOUD_RESOURCE_ID = "cloudResourceId";
  private String cloudResourceId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ComputeResourceStatusOps status;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ComputeResourceType type;

  public static final String JSON_PROPERTY_ENGINE_TYPE = "engineType";
  private DatabaseEngineType engineType;

  public static final String JSON_PROPERTY_ASSOCIATED_WITH_DB_SERVICE = "associatedWithDbService";
  private List<AssociatedWithDbServiceInfoForLeaks> associatedWithDbService = null;


  public LeakEvaluationForCR tenantId(UUID tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }


  public LeakEvaluationForCR tenantName(String tenantName) {
    
    this.tenantName = tenantName;
    return this;
  }

   /**
   * Get tenantName
   * @return tenantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TENANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenantName() {
    return tenantName;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }


  public LeakEvaluationForCR computeResourceId(UUID computeResourceId) {
    
    this.computeResourceId = computeResourceId;
    return this;
  }

   /**
   * Get computeResourceId
   * @return computeResourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPUTE_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getComputeResourceId() {
    return computeResourceId;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTE_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComputeResourceId(UUID computeResourceId) {
    this.computeResourceId = computeResourceId;
  }


  public LeakEvaluationForCR isLeak(LeakStatus isLeak) {
    
    this.isLeak = isLeak;
    return this;
  }

   /**
   * Get isLeak
   * @return isLeak
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_LEAK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LeakStatus getIsLeak() {
    return isLeak;
  }


  @JsonProperty(JSON_PROPERTY_IS_LEAK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsLeak(LeakStatus isLeak) {
    this.isLeak = isLeak;
  }


  public LeakEvaluationForCR cloudResourceId(String cloudResourceId) {
    
    this.cloudResourceId = cloudResourceId;
    return this;
  }

   /**
   * Cloud Resource Id of the storage
   * @return cloudResourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cloud Resource Id of the storage")
  @JsonProperty(JSON_PROPERTY_CLOUD_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudResourceId() {
    return cloudResourceId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudResourceId(String cloudResourceId) {
    this.cloudResourceId = cloudResourceId;
  }


  public LeakEvaluationForCR name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the Compute Resource
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Compute Resource")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public LeakEvaluationForCR status(ComputeResourceStatusOps status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ComputeResourceStatusOps getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(ComputeResourceStatusOps status) {
    this.status = status;
  }


  public LeakEvaluationForCR type(ComputeResourceType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ComputeResourceType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(ComputeResourceType type) {
    this.type = type;
  }


  public LeakEvaluationForCR engineType(DatabaseEngineType engineType) {
    
    this.engineType = engineType;
    return this;
  }

   /**
   * Get engineType
   * @return engineType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENGINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DatabaseEngineType getEngineType() {
    return engineType;
  }


  @JsonProperty(JSON_PROPERTY_ENGINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEngineType(DatabaseEngineType engineType) {
    this.engineType = engineType;
  }


  public LeakEvaluationForCR associatedWithDbService(List<AssociatedWithDbServiceInfoForLeaks> associatedWithDbService) {
    
    this.associatedWithDbService = associatedWithDbService;
    return this;
  }

  public LeakEvaluationForCR addAssociatedWithDbServiceItem(AssociatedWithDbServiceInfoForLeaks associatedWithDbServiceItem) {
    if (this.associatedWithDbService == null) {
      this.associatedWithDbService = new ArrayList<>();
    }
    this.associatedWithDbService.add(associatedWithDbServiceItem);
    return this;
  }

   /**
   * Get associatedWithDbService
   * @return associatedWithDbService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSOCIATED_WITH_DB_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AssociatedWithDbServiceInfoForLeaks> getAssociatedWithDbService() {
    return associatedWithDbService;
  }


  @JsonProperty(JSON_PROPERTY_ASSOCIATED_WITH_DB_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssociatedWithDbService(List<AssociatedWithDbServiceInfoForLeaks> associatedWithDbService) {
    this.associatedWithDbService = associatedWithDbService;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeakEvaluationForCR leakEvaluationForCR = (LeakEvaluationForCR) o;
    return Objects.equals(this.tenantId, leakEvaluationForCR.tenantId) &&
        Objects.equals(this.tenantName, leakEvaluationForCR.tenantName) &&
        Objects.equals(this.computeResourceId, leakEvaluationForCR.computeResourceId) &&
        Objects.equals(this.isLeak, leakEvaluationForCR.isLeak) &&
        Objects.equals(this.cloudResourceId, leakEvaluationForCR.cloudResourceId) &&
        Objects.equals(this.name, leakEvaluationForCR.name) &&
        Objects.equals(this.status, leakEvaluationForCR.status) &&
        Objects.equals(this.type, leakEvaluationForCR.type) &&
        Objects.equals(this.engineType, leakEvaluationForCR.engineType) &&
        Objects.equals(this.associatedWithDbService, leakEvaluationForCR.associatedWithDbService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, tenantName, computeResourceId, isLeak, cloudResourceId, name, status, type, engineType, associatedWithDbService);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeakEvaluationForCR {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    computeResourceId: ").append(toIndentedString(computeResourceId)).append("\n");
    sb.append("    isLeak: ").append(toIndentedString(isLeak)).append("\n");
    sb.append("    cloudResourceId: ").append(toIndentedString(cloudResourceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
    sb.append("    associatedWithDbService: ").append(toIndentedString(associatedWithDbService)).append("\n");
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

