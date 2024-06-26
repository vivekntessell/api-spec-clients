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
import com.tessell.database.system.client.model.BackupReplicationInfo;
import com.tessell.database.system.client.model.BackupType;
import com.tessell.database.system.client.model.DatabaseBackupOpsSubscriptionInfo;
import com.tessell.database.system.client.model.DbBackupDriverInfo;
import com.tessell.database.system.client.model.DbBackupLockingInfo;
import com.tessell.database.system.client.model.DbBackupMetadata;
import com.tessell.database.system.client.model.DbBackupRetentionType;
import com.tessell.database.system.client.model.DbBackupSizeInfo;
import com.tessell.database.system.client.model.DbBackupStatInfo;
import com.tessell.database.system.client.model.DbBackupStatus;
import com.tessell.database.system.client.model.DbBackupType;
import com.tessell.database.system.client.model.DbStorageTier;
import com.tessell.database.system.client.model.StorageSnapshotOps;
import com.tessell.database.system.client.model.TessellServiceInstanceRole;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for DatabaseBackupOps
 */
public class DatabaseBackupOpsTest {
    private final DatabaseBackupOps model = new DatabaseBackupOps();

    /**
     * Model tests for DatabaseBackupOps
     */
    @Test
    public void testDatabaseBackupOps() {
        // TODO: test DatabaseBackupOps
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'description'
     */
    @Test
    public void descriptionTest() {
        // TODO: test description
    }

    /**
     * Test the property 'dmmId'
     */
    @Test
    public void dmmIdTest() {
        // TODO: test dmmId
    }

    /**
     * Test the property 'isAppConsistent'
     */
    @Test
    public void isAppConsistentTest() {
        // TODO: test isAppConsistent
    }

    /**
     * Test the property 'dapId'
     */
    @Test
    public void dapIdTest() {
        // TODO: test dapId
    }

    /**
     * Test the property 'type'
     */
    @Test
    public void typeTest() {
        // TODO: test type
    }

    /**
     * Test the property 'derivedFromBackupId'
     */
    @Test
    public void derivedFromBackupIdTest() {
        // TODO: test derivedFromBackupId
    }

    /**
     * Test the property 'backupIdentifier'
     */
    @Test
    public void backupIdentifierTest() {
        // TODO: test backupIdentifier
    }

    /**
     * Test the property 'sanitizedFromBackupId'
     */
    @Test
    public void sanitizedFromBackupIdTest() {
        // TODO: test sanitizedFromBackupId
    }

    /**
     * Test the property 'dapBased'
     */
    @Test
    public void dapBasedTest() {
        // TODO: test dapBased
    }

    /**
     * Test the property 'scriptId'
     */
    @Test
    public void scriptIdTest() {
        // TODO: test scriptId
    }

    /**
     * Test the property 'sanitizationScheduleId'
     */
    @Test
    public void sanitizationScheduleIdTest() {
        // TODO: test sanitizationScheduleId
    }

    /**
     * Test the property 'subscriptions'
     */
    @Test
    public void subscriptionsTest() {
        // TODO: test subscriptions
    }

    /**
     * Test the property 'subscriptionInfo'
     */
    @Test
    public void subscriptionInfoTest() {
        // TODO: test subscriptionInfo
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'manual'
     */
    @Test
    public void manualTest() {
        // TODO: test manual
    }

    /**
     * Test the property 'internal'
     */
    @Test
    public void internalTest() {
        // TODO: test internal
    }

    /**
     * Test the property 'incremental'
     */
    @Test
    public void incrementalTest() {
        // TODO: test incremental
    }

    /**
     * Test the property 'backupTime'
     */
    @Test
    public void backupTimeTest() {
        // TODO: test backupTime
    }

    /**
     * Test the property 'expiryTime'
     */
    @Test
    public void expiryTimeTest() {
        // TODO: test expiryTime
    }

    /**
     * Test the property 'deletedForUserTime'
     */
    @Test
    public void deletedForUserTimeTest() {
        // TODO: test deletedForUserTime
    }

    /**
     * Test the property 'retentionType'
     */
    @Test
    public void retentionTypeTest() {
        // TODO: test retentionType
    }

    /**
     * Test the property 'cloudType'
     */
    @Test
    public void cloudTypeTest() {
        // TODO: test cloudType
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
     * Test the property 'userId'
     */
    @Test
    public void userIdTest() {
        // TODO: test userId
    }

    /**
     * Test the property 'owner'
     */
    @Test
    public void ownerTest() {
        // TODO: test owner
    }

    /**
     * Test the property 'backupType'
     */
    @Test
    public void backupTypeTest() {
        // TODO: test backupType
    }

    /**
     * Test the property 'storageTier'
     */
    @Test
    public void storageTierTest() {
        // TODO: test storageTier
    }

    /**
     * Test the property 'cloudResourceId'
     */
    @Test
    public void cloudResourceIdTest() {
        // TODO: test cloudResourceId
    }

    /**
     * Test the property 'computeResourceId'
     */
    @Test
    public void computeResourceIdTest() {
        // TODO: test computeResourceId
    }

    /**
     * Test the property 'instanceRole'
     */
    @Test
    public void instanceRoleTest() {
        // TODO: test instanceRole
    }

    /**
     * Test the property 'triggerId'
     */
    @Test
    public void triggerIdTest() {
        // TODO: test triggerId
    }

    /**
     * Test the property 'logicalSequenceNumber'
     */
    @Test
    public void logicalSequenceNumberTest() {
        // TODO: test logicalSequenceNumber
    }

    /**
     * Test the property 'parentSecondaryBackupId'
     */
    @Test
    public void parentSecondaryBackupIdTest() {
        // TODO: test parentSecondaryBackupId
    }

    /**
     * Test the property 'replicatedFromSecondaryBackupId'
     */
    @Test
    public void replicatedFromSecondaryBackupIdTest() {
        // TODO: test replicatedFromSecondaryBackupId
    }

    /**
     * Test the property 'dateCreated'
     */
    @Test
    public void dateCreatedTest() {
        // TODO: test dateCreated
    }

    /**
     * Test the property 'dateModified'
     */
    @Test
    public void dateModifiedTest() {
        // TODO: test dateModified
    }

    /**
     * Test the property 'databaseStats'
     */
    @Test
    public void databaseStatsTest() {
        // TODO: test databaseStats
    }

    /**
     * Test the property 'metadata'
     */
    @Test
    public void metadataTest() {
        // TODO: test metadata
    }

    /**
     * Test the property 'driverInfo'
     */
    @Test
    public void driverInfoTest() {
        // TODO: test driverInfo
    }

    /**
     * Test the property 'sizeInfo'
     */
    @Test
    public void sizeInfoTest() {
        // TODO: test sizeInfo
    }

    /**
     * Test the property 'replicationInfo'
     */
    @Test
    public void replicationInfoTest() {
        // TODO: test replicationInfo
    }

    /**
     * Test the property 'lockingInfo'
     */
    @Test
    public void lockingInfoTest() {
        // TODO: test lockingInfo
    }

    /**
     * Test the property 'storageSnapshots'
     */
    @Test
    public void storageSnapshotsTest() {
        // TODO: test storageSnapshots
    }

}
