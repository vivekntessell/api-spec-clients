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
import com.tessell.database.system.client.model.ProvisionDatabasebBackupWindow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * ProvisionDatabaseBackupConfigurationPayload
 */
@JsonPropertyOrder({
  ProvisionDatabaseBackupConfigurationPayload.JSON_PROPERTY_AUTO_SNAPSHOT,
  ProvisionDatabaseBackupConfigurationPayload.JSON_PROPERTY_SLA,
  ProvisionDatabaseBackupConfigurationPayload.JSON_PROPERTY_SNAPSHOT_WINDOW
})
@JsonTypeName("ProvisionDatabaseBackupConfigurationPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProvisionDatabaseBackupConfigurationPayload {
  public static final String JSON_PROPERTY_AUTO_SNAPSHOT = "autoSnapshot";
  private Boolean autoSnapshot;

  public static final String JSON_PROPERTY_SLA = "sla";
  private String sla;

  public static final String JSON_PROPERTY_SNAPSHOT_WINDOW = "snapshotWindow";
  private ProvisionDatabasebBackupWindow snapshotWindow;


  public ProvisionDatabaseBackupConfigurationPayload autoSnapshot(Boolean autoSnapshot) {
    
    this.autoSnapshot = autoSnapshot;
    return this;
  }

   /**
   * Get autoSnapshot
   * @return autoSnapshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTO_SNAPSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoSnapshot() {
    return autoSnapshot;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_SNAPSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoSnapshot(Boolean autoSnapshot) {
    this.autoSnapshot = autoSnapshot;
  }


  public ProvisionDatabaseBackupConfigurationPayload sla(String sla) {
    
    this.sla = sla;
    return this;
  }

   /**
   * If not specified, a default SLA would be associated with the DB Service
   * @return sla
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If not specified, a default SLA would be associated with the DB Service")
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


  public ProvisionDatabaseBackupConfigurationPayload snapshotWindow(ProvisionDatabasebBackupWindow snapshotWindow) {
    
    this.snapshotWindow = snapshotWindow;
    return this;
  }

   /**
   * Get snapshotWindow
   * @return snapshotWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProvisionDatabasebBackupWindow getSnapshotWindow() {
    return snapshotWindow;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT_WINDOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshotWindow(ProvisionDatabasebBackupWindow snapshotWindow) {
    this.snapshotWindow = snapshotWindow;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionDatabaseBackupConfigurationPayload provisionDatabaseBackupConfigurationPayload = (ProvisionDatabaseBackupConfigurationPayload) o;
    return Objects.equals(this.autoSnapshot, provisionDatabaseBackupConfigurationPayload.autoSnapshot) &&
        Objects.equals(this.sla, provisionDatabaseBackupConfigurationPayload.sla) &&
        Objects.equals(this.snapshotWindow, provisionDatabaseBackupConfigurationPayload.snapshotWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoSnapshot, sla, snapshotWindow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionDatabaseBackupConfigurationPayload {\n");
    sb.append("    autoSnapshot: ").append(toIndentedString(autoSnapshot)).append("\n");
    sb.append("    sla: ").append(toIndentedString(sla)).append("\n");
    sb.append("    snapshotWindow: ").append(toIndentedString(snapshotWindow)).append("\n");
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
