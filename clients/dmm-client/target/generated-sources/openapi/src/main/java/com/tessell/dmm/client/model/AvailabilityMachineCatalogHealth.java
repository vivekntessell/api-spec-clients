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
import com.tessell.dmm.client.model.DbLogHealth;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * AvailabilityMachineCatalogHealth
 */
@JsonPropertyOrder({
  AvailabilityMachineCatalogHealth.JSON_PROPERTY_AM_ID,
  AvailabilityMachineCatalogHealth.JSON_PROPERTY_AM_NAME,
  AvailabilityMachineCatalogHealth.JSON_PROPERTY_TSM,
  AvailabilityMachineCatalogHealth.JSON_PROPERTY_HEALTHY,
  AvailabilityMachineCatalogHealth.JSON_PROPERTY_MESSAGE,
  AvailabilityMachineCatalogHealth.JSON_PROPERTY_HEALTH_COMPUTED_AT,
  AvailabilityMachineCatalogHealth.JSON_PROPERTY_AM_ACTIVE,
  AvailabilityMachineCatalogHealth.JSON_PROPERTY_AMLAST_STARTED_AT,
  AvailabilityMachineCatalogHealth.JSON_PROPERTY_AM_ACTIVE_FOR_MINS,
  AvailabilityMachineCatalogHealth.JSON_PROPERTY_AM_BOOTUP_TIMED_OUT,
  AvailabilityMachineCatalogHealth.JSON_PROPERTY_AM_BOOTUP_TIMEOUT_MINS,
  AvailabilityMachineCatalogHealth.JSON_PROPERTY_DB_LOG_HEALTH
})
@JsonTypeName("AvailabilityMachineCatalogHealth")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AvailabilityMachineCatalogHealth {
  public static final String JSON_PROPERTY_AM_ID = "amId";
  private UUID amId;

  public static final String JSON_PROPERTY_AM_NAME = "amName";
  private String amName;

  public static final String JSON_PROPERTY_TSM = "tsm";
  private Boolean tsm = false;

  public static final String JSON_PROPERTY_HEALTHY = "healthy";
  private Boolean healthy = true;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_HEALTH_COMPUTED_AT = "healthComputedAt";
  private Date healthComputedAt;

  public static final String JSON_PROPERTY_AM_ACTIVE = "amActive";
  private Boolean amActive = true;

  public static final String JSON_PROPERTY_AMLAST_STARTED_AT = "amlastStartedAt";
  private Date amlastStartedAt;

  public static final String JSON_PROPERTY_AM_ACTIVE_FOR_MINS = "amActiveForMins";
  private Long amActiveForMins;

  public static final String JSON_PROPERTY_AM_BOOTUP_TIMED_OUT = "amBootupTimedOut";
  private Boolean amBootupTimedOut = true;

  public static final String JSON_PROPERTY_AM_BOOTUP_TIMEOUT_MINS = "amBootupTimeoutMins";
  private Long amBootupTimeoutMins;

  public static final String JSON_PROPERTY_DB_LOG_HEALTH = "dbLogHealth";
  private DbLogHealth dbLogHealth;


  public AvailabilityMachineCatalogHealth amId(UUID amId) {
    
    this.amId = amId;
    return this;
  }

   /**
   * Get amId
   * @return amId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getAmId() {
    return amId;
  }


  @JsonProperty(JSON_PROPERTY_AM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmId(UUID amId) {
    this.amId = amId;
  }


  public AvailabilityMachineCatalogHealth amName(String amName) {
    
    this.amName = amName;
    return this;
  }

   /**
   * Get amName
   * @return amName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmName() {
    return amName;
  }


  @JsonProperty(JSON_PROPERTY_AM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmName(String amName) {
    this.amName = amName;
  }


  public AvailabilityMachineCatalogHealth tsm(Boolean tsm) {
    
    this.tsm = tsm;
    return this;
  }

   /**
   * Get tsm
   * @return tsm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TSM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTsm() {
    return tsm;
  }


  @JsonProperty(JSON_PROPERTY_TSM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTsm(Boolean tsm) {
    this.tsm = tsm;
  }


  public AvailabilityMachineCatalogHealth healthy(Boolean healthy) {
    
    this.healthy = healthy;
    return this;
  }

   /**
   * Get healthy
   * @return healthy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEALTHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHealthy() {
    return healthy;
  }


  @JsonProperty(JSON_PROPERTY_HEALTHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHealthy(Boolean healthy) {
    this.healthy = healthy;
  }


  public AvailabilityMachineCatalogHealth message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public AvailabilityMachineCatalogHealth healthComputedAt(Date healthComputedAt) {
    
    this.healthComputedAt = healthComputedAt;
    return this;
  }

   /**
   * Get healthComputedAt
   * @return healthComputedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEALTH_COMPUTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getHealthComputedAt() {
    return healthComputedAt;
  }


  @JsonProperty(JSON_PROPERTY_HEALTH_COMPUTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHealthComputedAt(Date healthComputedAt) {
    this.healthComputedAt = healthComputedAt;
  }


  public AvailabilityMachineCatalogHealth amActive(Boolean amActive) {
    
    this.amActive = amActive;
    return this;
  }

   /**
   * Get amActive
   * @return amActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AM_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAmActive() {
    return amActive;
  }


  @JsonProperty(JSON_PROPERTY_AM_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmActive(Boolean amActive) {
    this.amActive = amActive;
  }


  public AvailabilityMachineCatalogHealth amlastStartedAt(Date amlastStartedAt) {
    
    this.amlastStartedAt = amlastStartedAt;
    return this;
  }

   /**
   * Get amlastStartedAt
   * @return amlastStartedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMLAST_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getAmlastStartedAt() {
    return amlastStartedAt;
  }


  @JsonProperty(JSON_PROPERTY_AMLAST_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmlastStartedAt(Date amlastStartedAt) {
    this.amlastStartedAt = amlastStartedAt;
  }


  public AvailabilityMachineCatalogHealth amActiveForMins(Long amActiveForMins) {
    
    this.amActiveForMins = amActiveForMins;
    return this;
  }

   /**
   * Get amActiveForMins
   * @return amActiveForMins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AM_ACTIVE_FOR_MINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAmActiveForMins() {
    return amActiveForMins;
  }


  @JsonProperty(JSON_PROPERTY_AM_ACTIVE_FOR_MINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmActiveForMins(Long amActiveForMins) {
    this.amActiveForMins = amActiveForMins;
  }


  public AvailabilityMachineCatalogHealth amBootupTimedOut(Boolean amBootupTimedOut) {
    
    this.amBootupTimedOut = amBootupTimedOut;
    return this;
  }

   /**
   * Get amBootupTimedOut
   * @return amBootupTimedOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AM_BOOTUP_TIMED_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAmBootupTimedOut() {
    return amBootupTimedOut;
  }


  @JsonProperty(JSON_PROPERTY_AM_BOOTUP_TIMED_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmBootupTimedOut(Boolean amBootupTimedOut) {
    this.amBootupTimedOut = amBootupTimedOut;
  }


  public AvailabilityMachineCatalogHealth amBootupTimeoutMins(Long amBootupTimeoutMins) {
    
    this.amBootupTimeoutMins = amBootupTimeoutMins;
    return this;
  }

   /**
   * Get amBootupTimeoutMins
   * @return amBootupTimeoutMins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AM_BOOTUP_TIMEOUT_MINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAmBootupTimeoutMins() {
    return amBootupTimeoutMins;
  }


  @JsonProperty(JSON_PROPERTY_AM_BOOTUP_TIMEOUT_MINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmBootupTimeoutMins(Long amBootupTimeoutMins) {
    this.amBootupTimeoutMins = amBootupTimeoutMins;
  }


  public AvailabilityMachineCatalogHealth dbLogHealth(DbLogHealth dbLogHealth) {
    
    this.dbLogHealth = dbLogHealth;
    return this;
  }

   /**
   * Get dbLogHealth
   * @return dbLogHealth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DB_LOG_HEALTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbLogHealth getDbLogHealth() {
    return dbLogHealth;
  }


  @JsonProperty(JSON_PROPERTY_DB_LOG_HEALTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbLogHealth(DbLogHealth dbLogHealth) {
    this.dbLogHealth = dbLogHealth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailabilityMachineCatalogHealth availabilityMachineCatalogHealth = (AvailabilityMachineCatalogHealth) o;
    return Objects.equals(this.amId, availabilityMachineCatalogHealth.amId) &&
        Objects.equals(this.amName, availabilityMachineCatalogHealth.amName) &&
        Objects.equals(this.tsm, availabilityMachineCatalogHealth.tsm) &&
        Objects.equals(this.healthy, availabilityMachineCatalogHealth.healthy) &&
        Objects.equals(this.message, availabilityMachineCatalogHealth.message) &&
        Objects.equals(this.healthComputedAt, availabilityMachineCatalogHealth.healthComputedAt) &&
        Objects.equals(this.amActive, availabilityMachineCatalogHealth.amActive) &&
        Objects.equals(this.amlastStartedAt, availabilityMachineCatalogHealth.amlastStartedAt) &&
        Objects.equals(this.amActiveForMins, availabilityMachineCatalogHealth.amActiveForMins) &&
        Objects.equals(this.amBootupTimedOut, availabilityMachineCatalogHealth.amBootupTimedOut) &&
        Objects.equals(this.amBootupTimeoutMins, availabilityMachineCatalogHealth.amBootupTimeoutMins) &&
        Objects.equals(this.dbLogHealth, availabilityMachineCatalogHealth.dbLogHealth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amId, amName, tsm, healthy, message, healthComputedAt, amActive, amlastStartedAt, amActiveForMins, amBootupTimedOut, amBootupTimeoutMins, dbLogHealth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityMachineCatalogHealth {\n");
    sb.append("    amId: ").append(toIndentedString(amId)).append("\n");
    sb.append("    amName: ").append(toIndentedString(amName)).append("\n");
    sb.append("    tsm: ").append(toIndentedString(tsm)).append("\n");
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    healthComputedAt: ").append(toIndentedString(healthComputedAt)).append("\n");
    sb.append("    amActive: ").append(toIndentedString(amActive)).append("\n");
    sb.append("    amlastStartedAt: ").append(toIndentedString(amlastStartedAt)).append("\n");
    sb.append("    amActiveForMins: ").append(toIndentedString(amActiveForMins)).append("\n");
    sb.append("    amBootupTimedOut: ").append(toIndentedString(amBootupTimedOut)).append("\n");
    sb.append("    amBootupTimeoutMins: ").append(toIndentedString(amBootupTimeoutMins)).append("\n");
    sb.append("    dbLogHealth: ").append(toIndentedString(dbLogHealth)).append("\n");
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

