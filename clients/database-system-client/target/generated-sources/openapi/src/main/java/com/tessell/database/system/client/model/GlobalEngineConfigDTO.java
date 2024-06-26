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
import com.tessell.database.system.client.model.GlobalEngineBackupConfigDTO;
import com.tessell.database.system.client.model.GlobalEngineDBDeleteConfigDTO;
import com.tessell.database.system.client.model.GlobalEngineDBStopConfigDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Global Engine Configuration DTO
 */
@ApiModel(description = "Global Engine Configuration DTO")
@JsonPropertyOrder({
  GlobalEngineConfigDTO.JSON_PROPERTY_ENGINE,
  GlobalEngineConfigDTO.JSON_PROPERTY_BACKUP_CONFIG,
  GlobalEngineConfigDTO.JSON_PROPERTY_BACKUP_CONFIG_T_S_M,
  GlobalEngineConfigDTO.JSON_PROPERTY_DB_STOP_CONFIG,
  GlobalEngineConfigDTO.JSON_PROPERTY_DB_STOP_CONFIG_T_S_M,
  GlobalEngineConfigDTO.JSON_PROPERTY_DB_DELETE_CONFIG,
  GlobalEngineConfigDTO.JSON_PROPERTY_DB_DELETE_CONFIG_T_S_M,
  GlobalEngineConfigDTO.JSON_PROPERTY_ENABLE_LICENSE_CHECK,
  GlobalEngineConfigDTO.JSON_PROPERTY_CONFIG,
  GlobalEngineConfigDTO.JSON_PROPERTY_CONFIG_T_S_M
})
@JsonTypeName("GlobalEngineConfigDTO")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GlobalEngineConfigDTO {
  public static final String JSON_PROPERTY_ENGINE = "engine";
  private DatabaseEngineType engine;

  public static final String JSON_PROPERTY_BACKUP_CONFIG = "backupConfig";
  private GlobalEngineBackupConfigDTO backupConfig;

  public static final String JSON_PROPERTY_BACKUP_CONFIG_T_S_M = "backupConfigTSM";
  private GlobalEngineBackupConfigDTO backupConfigTSM;

  public static final String JSON_PROPERTY_DB_STOP_CONFIG = "dbStopConfig";
  private GlobalEngineDBStopConfigDTO dbStopConfig;

  public static final String JSON_PROPERTY_DB_STOP_CONFIG_T_S_M = "dbStopConfigTSM";
  private GlobalEngineDBStopConfigDTO dbStopConfigTSM;

  public static final String JSON_PROPERTY_DB_DELETE_CONFIG = "dbDeleteConfig";
  private GlobalEngineDBDeleteConfigDTO dbDeleteConfig;

  public static final String JSON_PROPERTY_DB_DELETE_CONFIG_T_S_M = "dbDeleteConfigTSM";
  private GlobalEngineDBDeleteConfigDTO dbDeleteConfigTSM;

  public static final String JSON_PROPERTY_ENABLE_LICENSE_CHECK = "enableLicenseCheck";
  private Map<String, Map<String, Boolean>> enableLicenseCheck = null;

  public static final String JSON_PROPERTY_CONFIG = "config";
  private Object config;

  public static final String JSON_PROPERTY_CONFIG_T_S_M = "configTSM";
  private Object configTSM;


  public GlobalEngineConfigDTO engine(DatabaseEngineType engine) {
    
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


  public GlobalEngineConfigDTO backupConfig(GlobalEngineBackupConfigDTO backupConfig) {
    
    this.backupConfig = backupConfig;
    return this;
  }

   /**
   * Get backupConfig
   * @return backupConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BACKUP_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GlobalEngineBackupConfigDTO getBackupConfig() {
    return backupConfig;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupConfig(GlobalEngineBackupConfigDTO backupConfig) {
    this.backupConfig = backupConfig;
  }


  public GlobalEngineConfigDTO backupConfigTSM(GlobalEngineBackupConfigDTO backupConfigTSM) {
    
    this.backupConfigTSM = backupConfigTSM;
    return this;
  }

   /**
   * Get backupConfigTSM
   * @return backupConfigTSM
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BACKUP_CONFIG_T_S_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GlobalEngineBackupConfigDTO getBackupConfigTSM() {
    return backupConfigTSM;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_CONFIG_T_S_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupConfigTSM(GlobalEngineBackupConfigDTO backupConfigTSM) {
    this.backupConfigTSM = backupConfigTSM;
  }


  public GlobalEngineConfigDTO dbStopConfig(GlobalEngineDBStopConfigDTO dbStopConfig) {
    
    this.dbStopConfig = dbStopConfig;
    return this;
  }

   /**
   * Get dbStopConfig
   * @return dbStopConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DB_STOP_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GlobalEngineDBStopConfigDTO getDbStopConfig() {
    return dbStopConfig;
  }


  @JsonProperty(JSON_PROPERTY_DB_STOP_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbStopConfig(GlobalEngineDBStopConfigDTO dbStopConfig) {
    this.dbStopConfig = dbStopConfig;
  }


  public GlobalEngineConfigDTO dbStopConfigTSM(GlobalEngineDBStopConfigDTO dbStopConfigTSM) {
    
    this.dbStopConfigTSM = dbStopConfigTSM;
    return this;
  }

   /**
   * Get dbStopConfigTSM
   * @return dbStopConfigTSM
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DB_STOP_CONFIG_T_S_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GlobalEngineDBStopConfigDTO getDbStopConfigTSM() {
    return dbStopConfigTSM;
  }


  @JsonProperty(JSON_PROPERTY_DB_STOP_CONFIG_T_S_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbStopConfigTSM(GlobalEngineDBStopConfigDTO dbStopConfigTSM) {
    this.dbStopConfigTSM = dbStopConfigTSM;
  }


  public GlobalEngineConfigDTO dbDeleteConfig(GlobalEngineDBDeleteConfigDTO dbDeleteConfig) {
    
    this.dbDeleteConfig = dbDeleteConfig;
    return this;
  }

   /**
   * Get dbDeleteConfig
   * @return dbDeleteConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DB_DELETE_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GlobalEngineDBDeleteConfigDTO getDbDeleteConfig() {
    return dbDeleteConfig;
  }


  @JsonProperty(JSON_PROPERTY_DB_DELETE_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbDeleteConfig(GlobalEngineDBDeleteConfigDTO dbDeleteConfig) {
    this.dbDeleteConfig = dbDeleteConfig;
  }


  public GlobalEngineConfigDTO dbDeleteConfigTSM(GlobalEngineDBDeleteConfigDTO dbDeleteConfigTSM) {
    
    this.dbDeleteConfigTSM = dbDeleteConfigTSM;
    return this;
  }

   /**
   * Get dbDeleteConfigTSM
   * @return dbDeleteConfigTSM
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DB_DELETE_CONFIG_T_S_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GlobalEngineDBDeleteConfigDTO getDbDeleteConfigTSM() {
    return dbDeleteConfigTSM;
  }


  @JsonProperty(JSON_PROPERTY_DB_DELETE_CONFIG_T_S_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbDeleteConfigTSM(GlobalEngineDBDeleteConfigDTO dbDeleteConfigTSM) {
    this.dbDeleteConfigTSM = dbDeleteConfigTSM;
  }


  public GlobalEngineConfigDTO enableLicenseCheck(Map<String, Map<String, Boolean>> enableLicenseCheck) {
    
    this.enableLicenseCheck = enableLicenseCheck;
    return this;
  }

  public GlobalEngineConfigDTO putEnableLicenseCheckItem(String key, Map<String, Boolean> enableLicenseCheckItem) {
    if (this.enableLicenseCheck == null) {
      this.enableLicenseCheck = new HashMap<>();
    }
    this.enableLicenseCheck.put(key, enableLicenseCheckItem);
    return this;
  }

   /**
   * Get enableLicenseCheck
   * @return enableLicenseCheck
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENABLE_LICENSE_CHECK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Map<String, Boolean>> getEnableLicenseCheck() {
    return enableLicenseCheck;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE_LICENSE_CHECK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnableLicenseCheck(Map<String, Map<String, Boolean>> enableLicenseCheck) {
    this.enableLicenseCheck = enableLicenseCheck;
  }


  public GlobalEngineConfigDTO config(Object config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getConfig() {
    return config;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfig(Object config) {
    this.config = config;
  }


  public GlobalEngineConfigDTO configTSM(Object configTSM) {
    
    this.configTSM = configTSM;
    return this;
  }

   /**
   * Get configTSM
   * @return configTSM
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIG_T_S_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getConfigTSM() {
    return configTSM;
  }


  @JsonProperty(JSON_PROPERTY_CONFIG_T_S_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigTSM(Object configTSM) {
    this.configTSM = configTSM;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalEngineConfigDTO globalEngineConfigDTO = (GlobalEngineConfigDTO) o;
    return Objects.equals(this.engine, globalEngineConfigDTO.engine) &&
        Objects.equals(this.backupConfig, globalEngineConfigDTO.backupConfig) &&
        Objects.equals(this.backupConfigTSM, globalEngineConfigDTO.backupConfigTSM) &&
        Objects.equals(this.dbStopConfig, globalEngineConfigDTO.dbStopConfig) &&
        Objects.equals(this.dbStopConfigTSM, globalEngineConfigDTO.dbStopConfigTSM) &&
        Objects.equals(this.dbDeleteConfig, globalEngineConfigDTO.dbDeleteConfig) &&
        Objects.equals(this.dbDeleteConfigTSM, globalEngineConfigDTO.dbDeleteConfigTSM) &&
        Objects.equals(this.enableLicenseCheck, globalEngineConfigDTO.enableLicenseCheck) &&
        Objects.equals(this.config, globalEngineConfigDTO.config) &&
        Objects.equals(this.configTSM, globalEngineConfigDTO.configTSM);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engine, backupConfig, backupConfigTSM, dbStopConfig, dbStopConfigTSM, dbDeleteConfig, dbDeleteConfigTSM, enableLicenseCheck, config, configTSM);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalEngineConfigDTO {\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    backupConfig: ").append(toIndentedString(backupConfig)).append("\n");
    sb.append("    backupConfigTSM: ").append(toIndentedString(backupConfigTSM)).append("\n");
    sb.append("    dbStopConfig: ").append(toIndentedString(dbStopConfig)).append("\n");
    sb.append("    dbStopConfigTSM: ").append(toIndentedString(dbStopConfigTSM)).append("\n");
    sb.append("    dbDeleteConfig: ").append(toIndentedString(dbDeleteConfig)).append("\n");
    sb.append("    dbDeleteConfigTSM: ").append(toIndentedString(dbDeleteConfigTSM)).append("\n");
    sb.append("    enableLicenseCheck: ").append(toIndentedString(enableLicenseCheck)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    configTSM: ").append(toIndentedString(configTSM)).append("\n");
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

