

# TessellComputeProfileInfoDTO

Compute Profile Metadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**readIops** | **Integer** | Read IOPS throughput supported by an instance |  [optional]
**writeIops** | **Integer** | Write IOPS throughput supported by an instance |  [optional]
**memoryGB** | **Float** | Amount of memory (GB) in this compute |  [optional]
**maxNoOfDisks** | **Integer** | No of disks attached to a compute instance |  [optional]
**minStorageGB** | **Integer** | Amount of min storage (GB) supported by this compute shape (Only for Standard) |  [optional]
**maxStorageGB** | **Integer** | Amount of max storage (GB) supported by this compute shape (Only for Standard) |  [optional]
**storageGB** | **Integer** | Amount of storage (GB) supported by this compute shape (Only for High Performance) |  [optional]
**vcpus** | **Integer** | Number of VCPUs in this compute |  [optional]
**allowedVcpuValues** | **List&lt;Integer&gt;** | Allowed Values of Vcpu in the shape |  [optional]
**io2BlockExpressEnabled** | **Boolean** | Shape Supports io2 Block Express volume |  [optional]
**workloadType** | **String** | Type of compute |  [optional]
**architecture** | **TessellComputeArchitectureDTO** |  |  [optional]
**maxThroughputMBps** | **Integer** | Maximum Throughput supported by underlying disks (in MB/s) |  [optional]
**maxIops** | **Integer** | Maximum IOPS supported by underlying disks |  [optional]



