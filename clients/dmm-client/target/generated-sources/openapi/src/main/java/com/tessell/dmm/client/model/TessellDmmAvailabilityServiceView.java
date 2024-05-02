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
import com.tessell.dmm.client.model.DBServiceTopology;
import com.tessell.dmm.client.model.ScheduleInfo;
import com.tessell.dmm.client.model.TamRetentionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell Availability Machine&#39;s sla and schedule details
 */
@ApiModel(description = "This is a definition for Tessell Availability Machine's sla and schedule details")
@JsonPropertyOrder({
  TessellDmmAvailabilityServiceView.JSON_PROPERTY_AVAILABILITY_MACHINE_ID,
  TessellDmmAvailabilityServiceView.JSON_PROPERTY_AVAILABILITY_MACHINE,
  TessellDmmAvailabilityServiceView.JSON_PROPERTY_TOPOLOGY,
  TessellDmmAvailabilityServiceView.JSON_PROPERTY_RPO_SLA_STATUS,
  TessellDmmAvailabilityServiceView.JSON_PROPERTY_SLA,
  TessellDmmAvailabilityServiceView.JSON_PROPERTY_SLA_RETENTION_INFO,
  TessellDmmAvailabilityServiceView.JSON_PROPERTY_SCHEDULE
})
@JsonTypeName("TessellDmmAvailabilityServiceView")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellDmmAvailabilityServiceView {
  public static final String JSON_PROPERTY_AVAILABILITY_MACHINE_ID = "availabilityMachineId";
  private UUID availabilityMachineId;

  public static final String JSON_PROPERTY_AVAILABILITY_MACHINE = "availabilityMachine";
  private String availabilityMachine;

  public static final String JSON_PROPERTY_TOPOLOGY = "topology";
  private List<DBServiceTopology> topology = null;

  public static final String JSON_PROPERTY_RPO_SLA_STATUS = "rpoSlaStatus";
  private String rpoSlaStatus;

  public static final String JSON_PROPERTY_SLA = "sla";
  private String sla;

  public static final String JSON_PROPERTY_SLA_RETENTION_INFO = "slaRetentionInfo";
  private TamRetentionInfo slaRetentionInfo;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private ScheduleInfo schedule;


  public TessellDmmAvailabilityServiceView availabilityMachineId(UUID availabilityMachineId) {
    
    this.availabilityMachineId = availabilityMachineId;
    return this;
  }

   /**
   * Get availabilityMachineId
   * @return availabilityMachineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_MACHINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getAvailabilityMachineId() {
    return availabilityMachineId;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_MACHINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityMachineId(UUID availabilityMachineId) {
    this.availabilityMachineId = availabilityMachineId;
  }


  public TessellDmmAvailabilityServiceView availabilityMachine(String availabilityMachine) {
    
    this.availabilityMachine = availabilityMachine;
    return this;
  }

   /**
   * Associated Availability Machine Name
   * @return availabilityMachine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Associated Availability Machine Name")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_MACHINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAvailabilityMachine() {
    return availabilityMachine;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_MACHINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityMachine(String availabilityMachine) {
    this.availabilityMachine = availabilityMachine;
  }


  public TessellDmmAvailabilityServiceView topology(List<DBServiceTopology> topology) {
    
    this.topology = topology;
    return this;
  }

  public TessellDmmAvailabilityServiceView addTopologyItem(DBServiceTopology topologyItem) {
    if (this.topology == null) {
      this.topology = new ArrayList<>();
    }
    this.topology.add(topologyItem);
    return this;
  }

   /**
   * The availability location details: cloudAccount to region
   * @return topology
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The availability location details: cloudAccount to region")
  @JsonProperty(JSON_PROPERTY_TOPOLOGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DBServiceTopology> getTopology() {
    return topology;
  }


  @JsonProperty(JSON_PROPERTY_TOPOLOGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopology(List<DBServiceTopology> topology) {
    this.topology = topology;
  }


  public TessellDmmAvailabilityServiceView rpoSlaStatus(String rpoSlaStatus) {
    
    this.rpoSlaStatus = rpoSlaStatus;
    return this;
  }

   /**
   * The availability status
   * @return rpoSlaStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The availability status")
  @JsonProperty(JSON_PROPERTY_RPO_SLA_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRpoSlaStatus() {
    return rpoSlaStatus;
  }


  @JsonProperty(JSON_PROPERTY_RPO_SLA_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRpoSlaStatus(String rpoSlaStatus) {
    this.rpoSlaStatus = rpoSlaStatus;
  }


  public TessellDmmAvailabilityServiceView sla(String sla) {
    
    this.sla = sla;
    return this;
  }

   /**
   * Associated SLA
   * @return sla
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Associated SLA")
  @JsonProperty(JSON_PROPERTY_SLA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSla() {
    return sla;
  }


  @JsonProperty(JSON_PROPERTY_SLA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSla(String sla) {
    this.sla = sla;
  }


  public TessellDmmAvailabilityServiceView slaRetentionInfo(TamRetentionInfo slaRetentionInfo) {
    
    this.slaRetentionInfo = slaRetentionInfo;
    return this;
  }

   /**
   * Get slaRetentionInfo
   * @return slaRetentionInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SLA_RETENTION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TamRetentionInfo getSlaRetentionInfo() {
    return slaRetentionInfo;
  }


  @JsonProperty(JSON_PROPERTY_SLA_RETENTION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSlaRetentionInfo(TamRetentionInfo slaRetentionInfo) {
    this.slaRetentionInfo = slaRetentionInfo;
  }


  public TessellDmmAvailabilityServiceView schedule(ScheduleInfo schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScheduleInfo getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedule(ScheduleInfo schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellDmmAvailabilityServiceView tessellDmmAvailabilityServiceView = (TessellDmmAvailabilityServiceView) o;
    return Objects.equals(this.availabilityMachineId, tessellDmmAvailabilityServiceView.availabilityMachineId) &&
        Objects.equals(this.availabilityMachine, tessellDmmAvailabilityServiceView.availabilityMachine) &&
        Objects.equals(this.topology, tessellDmmAvailabilityServiceView.topology) &&
        Objects.equals(this.rpoSlaStatus, tessellDmmAvailabilityServiceView.rpoSlaStatus) &&
        Objects.equals(this.sla, tessellDmmAvailabilityServiceView.sla) &&
        Objects.equals(this.slaRetentionInfo, tessellDmmAvailabilityServiceView.slaRetentionInfo) &&
        Objects.equals(this.schedule, tessellDmmAvailabilityServiceView.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityMachineId, availabilityMachine, topology, rpoSlaStatus, sla, slaRetentionInfo, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellDmmAvailabilityServiceView {\n");
    sb.append("    availabilityMachineId: ").append(toIndentedString(availabilityMachineId)).append("\n");
    sb.append("    availabilityMachine: ").append(toIndentedString(availabilityMachine)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
    sb.append("    rpoSlaStatus: ").append(toIndentedString(rpoSlaStatus)).append("\n");
    sb.append("    sla: ").append(toIndentedString(sla)).append("\n");
    sb.append("    slaRetentionInfo: ").append(toIndentedString(slaRetentionInfo)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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
