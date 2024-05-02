

# GenieResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Request Id |  [optional]
**genieType** | [**GenieType**](GenieType.md) | Genie Type, Customer or Internal |  [optional]
**status** | [**GenieStatus**](GenieStatus.md) | Current status of the genie request |  [optional]
**entityId** | **String** | entityId |  [optional]
**tenantId** | **String** | Tenant ID |  [optional]
**metadata** | [**GenieRequestEntityMetadata**](GenieRequestEntityMetadata.md) | Genie Request Metadata |  [optional]
**computeResourceMetadata** | **List&lt;String&gt;** | List of computes associated with the Genie request |  [optional]
**requestedBy** | **String** | username |  [optional]
**description** | **String** | Genie request description |  [optional]
**ticketId** | **String** | Jira or freshdesk ticket filed to request Genie |  [optional]
**initialisationMethod** | [**InitialisationMethod**](InitialisationMethod.md) | Initialisation method of the Genie, Ops portal or for customer |  [optional]
**authenticationMethod** | [**AuthenticationMethod**](AuthenticationMethod.md) | Authentication method of the Genie, Ops portal or for customer |  [optional]
**dateCreated** | **OffsetDateTime** | entry creation timestamp |  [optional]
**expiryInMinutes** | **Integer** | Time in minutes for which Genie access is valid |  [optional]
**dateModified** | **OffsetDateTime** | entry modification timestamp |  [optional]
**entities** | [**List&lt;GenieEntity&gt;**](GenieEntity.md) | List of computes associated with the Genie request |  [optional]



