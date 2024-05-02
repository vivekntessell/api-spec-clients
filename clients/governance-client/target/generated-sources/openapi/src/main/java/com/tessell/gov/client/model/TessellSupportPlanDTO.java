/*
 * REST API Documentation
 * REST API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.gov.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.gov.client.model.TessellBaseEntityDTO;
import com.tessell.gov.client.model.TessellFeatureDTO;
import com.tessell.gov.client.model.TessellSupportPlan1DTO;
import com.tessell.gov.client.model.TessellSupportPlan1PricingDTO;
import com.tessell.gov.client.model.TessellSupportPlan1ResponseTimesDTO;
import com.tessell.gov.client.model.TessellSupportPlanStatusDTO;
import com.tessell.gov.client.model.TessellSupportServiceHourDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Support plan details
 */
@ApiModel(description = "Support plan details")
@JsonPropertyOrder({
  TessellSupportPlanDTO.JSON_PROPERTY_DATE_CREATED,
  TessellSupportPlanDTO.JSON_PROPERTY_DATE_MODIFIED,
  TessellSupportPlanDTO.JSON_PROPERTY_ID,
  TessellSupportPlanDTO.JSON_PROPERTY_NAME,
  TessellSupportPlanDTO.JSON_PROPERTY_DESCRIPTION,
  TessellSupportPlanDTO.JSON_PROPERTY_DISPLAY_NAME,
  TessellSupportPlanDTO.JSON_PROPERTY_STATUS,
  TessellSupportPlanDTO.JSON_PROPERTY_ORDER,
  TessellSupportPlanDTO.JSON_PROPERTY_PRICING,
  TessellSupportPlanDTO.JSON_PROPERTY_RESPONSE_TIMES,
  TessellSupportPlanDTO.JSON_PROPERTY_SUPPORT_SERVICE_HOURS,
  TessellSupportPlanDTO.JSON_PROPERTY_FEATURES
})
@JsonTypeName("SupportPlan")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.675868+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellSupportPlanDTO {
  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private Date dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private Date dateModified;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellSupportPlanStatusDTO status;

  public static final String JSON_PROPERTY_ORDER = "order";
  private Integer order;

  public static final String JSON_PROPERTY_PRICING = "pricing";
  private TessellSupportPlan1PricingDTO pricing;

  public static final String JSON_PROPERTY_RESPONSE_TIMES = "responseTimes";
  private TessellSupportPlan1ResponseTimesDTO responseTimes;

  public static final String JSON_PROPERTY_SUPPORT_SERVICE_HOURS = "supportServiceHours";
  private List<TessellSupportServiceHourDTO> supportServiceHours = null;

  public static final String JSON_PROPERTY_FEATURES = "features";
  private List<TessellFeatureDTO> features = null;


  public TessellSupportPlanDTO dateCreated(Date dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Timestamp when the entity was created
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the entity was created")
  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  public TessellSupportPlanDTO dateModified(Date dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Timestamp when the entity was last modified
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the entity was last modified")
  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDateModified() {
    return dateModified;
  }


  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  public TessellSupportPlanDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * generated UUID for the entity
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "generated UUID for the entity")
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


  public TessellSupportPlanDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public TessellSupportPlanDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public TessellSupportPlanDTO displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public TessellSupportPlanDTO status(TessellSupportPlanStatusDTO status) {
    
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

  public TessellSupportPlanStatusDTO getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TessellSupportPlanStatusDTO status) {
    this.status = status;
  }


  public TessellSupportPlanDTO order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrder(Integer order) {
    this.order = order;
  }


  public TessellSupportPlanDTO pricing(TessellSupportPlan1PricingDTO pricing) {
    
    this.pricing = pricing;
    return this;
  }

   /**
   * Get pricing
   * @return pricing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellSupportPlan1PricingDTO getPricing() {
    return pricing;
  }


  @JsonProperty(JSON_PROPERTY_PRICING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPricing(TessellSupportPlan1PricingDTO pricing) {
    this.pricing = pricing;
  }


  public TessellSupportPlanDTO responseTimes(TessellSupportPlan1ResponseTimesDTO responseTimes) {
    
    this.responseTimes = responseTimes;
    return this;
  }

   /**
   * Get responseTimes
   * @return responseTimes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESPONSE_TIMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellSupportPlan1ResponseTimesDTO getResponseTimes() {
    return responseTimes;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_TIMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseTimes(TessellSupportPlan1ResponseTimesDTO responseTimes) {
    this.responseTimes = responseTimes;
  }


  public TessellSupportPlanDTO supportServiceHours(List<TessellSupportServiceHourDTO> supportServiceHours) {
    
    this.supportServiceHours = supportServiceHours;
    return this;
  }

  public TessellSupportPlanDTO addSupportServiceHoursItem(TessellSupportServiceHourDTO supportServiceHoursItem) {
    if (this.supportServiceHours == null) {
      this.supportServiceHours = new ArrayList<>();
    }
    this.supportServiceHours.add(supportServiceHoursItem);
    return this;
  }

   /**
   * Get supportServiceHours
   * @return supportServiceHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUPPORT_SERVICE_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellSupportServiceHourDTO> getSupportServiceHours() {
    return supportServiceHours;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORT_SERVICE_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportServiceHours(List<TessellSupportServiceHourDTO> supportServiceHours) {
    this.supportServiceHours = supportServiceHours;
  }


  public TessellSupportPlanDTO features(List<TessellFeatureDTO> features) {
    
    this.features = features;
    return this;
  }

  public TessellSupportPlanDTO addFeaturesItem(TessellFeatureDTO featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellFeatureDTO> getFeatures() {
    return features;
  }


  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeatures(List<TessellFeatureDTO> features) {
    this.features = features;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellSupportPlanDTO supportPlan = (TessellSupportPlanDTO) o;
    return Objects.equals(this.dateCreated, supportPlan.dateCreated) &&
        Objects.equals(this.dateModified, supportPlan.dateModified) &&
        Objects.equals(this.id, supportPlan.id) &&
        Objects.equals(this.name, supportPlan.name) &&
        Objects.equals(this.description, supportPlan.description) &&
        Objects.equals(this.displayName, supportPlan.displayName) &&
        Objects.equals(this.status, supportPlan.status) &&
        Objects.equals(this.order, supportPlan.order) &&
        Objects.equals(this.pricing, supportPlan.pricing) &&
        Objects.equals(this.responseTimes, supportPlan.responseTimes) &&
        Objects.equals(this.supportServiceHours, supportPlan.supportServiceHours) &&
        Objects.equals(this.features, supportPlan.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCreated, dateModified, id, name, description, displayName, status, order, pricing, responseTimes, supportServiceHours, features);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellSupportPlanDTO {\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    responseTimes: ").append(toIndentedString(responseTimes)).append("\n");
    sb.append("    supportServiceHours: ").append(toIndentedString(supportServiceHours)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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
