

# TessellComputeProfileEntityDTO

Compute Profile entity that will be stored in Metadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**readIops** | **Integer** | Read IOPS throughput supported by an instance |  [optional]
**writeIops** | **Integer** | Write IOPS throughput supported by an instance |  [optional]
**memoryGB** | **Float** | Amount of memory (GB) in this compute |  [optional]
**noOfDisks** | **Integer** | No of disks attached to a compute instance |  [optional]
**maxNoOfDisks** | **Integer** | No of disks attached to a compute instance |  [optional]
**minStorageGB** | **Integer** | Amount of min storage (GiB) supported by this compute shape |  [optional]
**maxStorageGB** | **Integer** | Amount of max storage (GiB) supported by this compute shape |  [optional]
**vcpus** | **Integer** | Number of VCPUs in this compute |  [optional]
**allowedVcpuValues** | **List&lt;Integer&gt;** | Allowed Values of Vcpu in the shape |  [optional]
**io2BlockExpressEnabled** | **Boolean** | Shape Supports io2 Block Express volume |  [optional]
**cpuConfig** | [**TessellCpuConfigDTO**](TessellCpuConfigDTO.md) |  |  [optional]
**hyperThreading** | **String** | Hyperthreading status |  [optional]
**workloadType** | **String** | Type of compute |  [optional]
**usableStorageGB** | **Integer** | Amount of usable storage (GiB) supported by this compute shape |  [optional]
**tsm** | **Boolean** | Is TSM Shape |  [optional]
**tsmMetaSize** | **Integer** | Storage Required for TSM |  [optional]
**architecture** | **TessellComputeArchitectureDTO** |  |  [optional]
**maxThroughputMBps** | **Integer** | Maximum Throughput supported by underlying disks (in MB/s) |  [optional]
**maxIops** | **Integer** | Maximum IOPS supported by underlying disks |  [optional]



