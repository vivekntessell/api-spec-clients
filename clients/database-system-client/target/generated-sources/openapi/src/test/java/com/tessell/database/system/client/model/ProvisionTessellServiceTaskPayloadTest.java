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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.database.system.client.model.ActionType;
import com.tessell.database.system.client.model.BackupSanitizationCloneOpsPayload;
import com.tessell.database.system.client.model.CloneTaskPayload;
import com.tessell.database.system.client.model.CloudLocationInfo;
import com.tessell.database.system.client.model.DatabaseEngineType;
import com.tessell.database.system.client.model.DbLicenseInfo;
import com.tessell.database.system.client.model.MachineType;
import com.tessell.database.system.client.model.MonitoringConfigTaskPayload;
import com.tessell.database.system.client.model.NativeBackupOpsPayload;
import com.tessell.database.system.client.model.ProvisionServiceWorkInfraPayload;
import com.tessell.database.system.client.model.TessellServiceConfigOps;
import com.tessell.database.system.client.model.TessellServiceConnectivityInfoPayload;
import com.tessell.database.system.client.model.TessellServiceCredsPayload;
import com.tessell.database.system.client.model.TessellServiceEngineInfoOps;
import com.tessell.database.system.client.model.TessellServiceIntegrationsPayload;
import com.tessell.database.system.client.model.TessellServiceTopology;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for ProvisionTessellServiceTaskPayload
 */
public class ProvisionTessellServiceTaskPayloadTest {
    private final ProvisionTessellServiceTaskPayload model = new ProvisionTessellServiceTaskPayload();

    /**
     * Model tests for ProvisionTessellServiceTaskPayload
     */
    @Test
    public void testProvisionTessellServiceTaskPayload() {
        // TODO: test ProvisionTessellServiceTaskPayload
    }

    /**
     * Test the property 'actionType'
     */
    @Test
    public void actionTypeTest() {
        // TODO: test actionType
    }

    /**
     * Test the property 'clone'
     */
    @Test
    public void cloneTest() {
        // TODO: test clone
    }

    /**
     * Test the property 'serviceName'
     */
    @Test
    public void serviceNameTest() {
        // TODO: test serviceName
    }

    /**
     * Test the property 'tessellServiceId'
     */
    @Test
    public void tessellServiceIdTest() {
        // TODO: test tessellServiceId
    }

    /**
     * Test the property 'dbserverSystemId'
     */
    @Test
    public void dbserverSystemIdTest() {
        // TODO: test dbserverSystemId
    }

    /**
     * Test the property 'availabilityMachineId'
     */
    @Test
    public void availabilityMachineIdTest() {
        // TODO: test availabilityMachineId
    }

    /**
     * Test the property 'databaseEngineType'
     */
    @Test
    public void databaseEngineTypeTest() {
        // TODO: test databaseEngineType
    }

    /**
     * Test the property 'topology'
     */
    @Test
    public void topologyTest() {
        // TODO: test topology
    }

    /**
     * Test the property 'numOfInstances'
     */
    @Test
    public void numOfInstancesTest() {
        // TODO: test numOfInstances
    }

    /**
     * Test the property 'computeResourceMachineType'
     */
    @Test
    public void computeResourceMachineTypeTest() {
        // TODO: test computeResourceMachineType
    }

    /**
     * Test the property 'monitoringConfig'
     */
    @Test
    public void monitoringConfigTest() {
        // TODO: test monitoringConfig
    }

    /**
     * Test the property 'ownerId'
     */
    @Test
    public void ownerIdTest() {
        // TODO: test ownerId
    }

    /**
     * Test the property 'subscriptionId'
     */
    @Test
    public void subscriptionIdTest() {
        // TODO: test subscriptionId
    }

    /**
     * Test the property 'tenantId'
     */
    @Test
    public void tenantIdTest() {
        // TODO: test tenantId
    }

    /**
     * Test the property 'cloudAccountId'
     */
    @Test
    public void cloudAccountIdTest() {
        // TODO: test cloudAccountId
    }

    /**
     * Test the property 'cloudLocation'
     */
    @Test
    public void cloudLocationTest() {
        // TODO: test cloudLocation
    }

    /**
     * Test the property 'creds'
     */
    @Test
    public void credsTest() {
        // TODO: test creds
    }

    /**
     * Test the property 'instanceGroupId'
     */
    @Test
    public void instanceGroupIdTest() {
        // TODO: test instanceGroupId
    }

    /**
     * Test the property 'connectivityConfig'
     */
    @Test
    public void connectivityConfigTest() {
        // TODO: test connectivityConfig
    }

    /**
     * Test the property 'infrastructureConfig'
     */
    @Test
    public void infrastructureConfigTest() {
        // TODO: test infrastructureConfig
    }

    /**
     * Test the property 'serviceConfiguration'
     */
    @Test
    public void serviceConfigurationTest() {
        // TODO: test serviceConfiguration
    }

    /**
     * Test the property 'engineConfig'
     */
    @Test
    public void engineConfigTest() {
        // TODO: test engineConfig
    }

    /**
     * Test the property 'integrations'
     */
    @Test
    public void integrationsTest() {
        // TODO: test integrations
    }

    /**
     * Test the property 'clonePayload'
     */
    @Test
    public void clonePayloadTest() {
        // TODO: test clonePayload
    }

    /**
     * Test the property 'sanitizationPayload'
     */
    @Test
    public void sanitizationPayloadTest() {
        // TODO: test sanitizationPayload
    }

    /**
     * Test the property 'dbLicenses'
     */
    @Test
    public void dbLicensesTest() {
        // TODO: test dbLicenses
    }

    /**
     * Test the property 'deleteInternalServiceCallbackUrl'
     */
    @Test
    public void deleteInternalServiceCallbackUrlTest() {
        // TODO: test deleteInternalServiceCallbackUrl
    }

    /**
     * Test the property 'nativeBackupPayload'
     */
    @Test
    public void nativeBackupPayloadTest() {
        // TODO: test nativeBackupPayload
    }

    /**
     * Test the property 'metadata'
     */
    @Test
    public void metadataTest() {
        // TODO: test metadata
    }

}