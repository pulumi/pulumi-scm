# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['HipObjectArgs', 'HipObject']

@pulumi.input_type
class HipObjectArgs:
    def __init__(__self__, *,
                 anti_malware: Optional[pulumi.Input['HipObjectAntiMalwareArgs']] = None,
                 certificate: Optional[pulumi.Input['HipObjectCertificateArgs']] = None,
                 custom_checks: Optional[pulumi.Input['HipObjectCustomChecksArgs']] = None,
                 data_loss_prevention: Optional[pulumi.Input['HipObjectDataLossPreventionArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 disk_backup: Optional[pulumi.Input['HipObjectDiskBackupArgs']] = None,
                 disk_encryption: Optional[pulumi.Input['HipObjectDiskEncryptionArgs']] = None,
                 firewall: Optional[pulumi.Input['HipObjectFirewallArgs']] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 host_info: Optional[pulumi.Input['HipObjectHostInfoArgs']] = None,
                 mobile_device: Optional[pulumi.Input['HipObjectMobileDeviceArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network_info: Optional[pulumi.Input['HipObjectNetworkInfoArgs']] = None,
                 patch_management: Optional[pulumi.Input['HipObjectPatchManagementArgs']] = None,
                 snippet: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a HipObject resource.
        :param pulumi.Input['HipObjectAntiMalwareArgs'] anti_malware: The AntiMalware param.
        :param pulumi.Input['HipObjectCertificateArgs'] certificate: The Certificate param.
        :param pulumi.Input['HipObjectCustomChecksArgs'] custom_checks: The CustomChecks param.
        :param pulumi.Input['HipObjectDataLossPreventionArgs'] data_loss_prevention: The DataLossPrevention param.
        :param pulumi.Input[str] description: The Description param. String length must not exceed 255 characters.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input['HipObjectDiskBackupArgs'] disk_backup: The DiskBackup param.
        :param pulumi.Input['HipObjectDiskEncryptionArgs'] disk_encryption: The DiskEncryption param.
        :param pulumi.Input['HipObjectFirewallArgs'] firewall: The Firewall param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input['HipObjectHostInfoArgs'] host_info: The HostInfo param.
        :param pulumi.Input['HipObjectMobileDeviceArgs'] mobile_device: The MobileDevice param.
        :param pulumi.Input[str] name: Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        :param pulumi.Input['HipObjectNetworkInfoArgs'] network_info: The NetworkInfo param.
        :param pulumi.Input['HipObjectPatchManagementArgs'] patch_management: The PatchManagement param.
        :param pulumi.Input[str] snippet: The Snippet param.
        """
        if anti_malware is not None:
            pulumi.set(__self__, "anti_malware", anti_malware)
        if certificate is not None:
            pulumi.set(__self__, "certificate", certificate)
        if custom_checks is not None:
            pulumi.set(__self__, "custom_checks", custom_checks)
        if data_loss_prevention is not None:
            pulumi.set(__self__, "data_loss_prevention", data_loss_prevention)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if disk_backup is not None:
            pulumi.set(__self__, "disk_backup", disk_backup)
        if disk_encryption is not None:
            pulumi.set(__self__, "disk_encryption", disk_encryption)
        if firewall is not None:
            pulumi.set(__self__, "firewall", firewall)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if host_info is not None:
            pulumi.set(__self__, "host_info", host_info)
        if mobile_device is not None:
            pulumi.set(__self__, "mobile_device", mobile_device)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network_info is not None:
            pulumi.set(__self__, "network_info", network_info)
        if patch_management is not None:
            pulumi.set(__self__, "patch_management", patch_management)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)

    @property
    @pulumi.getter(name="antiMalware")
    def anti_malware(self) -> Optional[pulumi.Input['HipObjectAntiMalwareArgs']]:
        """
        The AntiMalware param.
        """
        return pulumi.get(self, "anti_malware")

    @anti_malware.setter
    def anti_malware(self, value: Optional[pulumi.Input['HipObjectAntiMalwareArgs']]):
        pulumi.set(self, "anti_malware", value)

    @property
    @pulumi.getter
    def certificate(self) -> Optional[pulumi.Input['HipObjectCertificateArgs']]:
        """
        The Certificate param.
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: Optional[pulumi.Input['HipObjectCertificateArgs']]):
        pulumi.set(self, "certificate", value)

    @property
    @pulumi.getter(name="customChecks")
    def custom_checks(self) -> Optional[pulumi.Input['HipObjectCustomChecksArgs']]:
        """
        The CustomChecks param.
        """
        return pulumi.get(self, "custom_checks")

    @custom_checks.setter
    def custom_checks(self, value: Optional[pulumi.Input['HipObjectCustomChecksArgs']]):
        pulumi.set(self, "custom_checks", value)

    @property
    @pulumi.getter(name="dataLossPrevention")
    def data_loss_prevention(self) -> Optional[pulumi.Input['HipObjectDataLossPreventionArgs']]:
        """
        The DataLossPrevention param.
        """
        return pulumi.get(self, "data_loss_prevention")

    @data_loss_prevention.setter
    def data_loss_prevention(self, value: Optional[pulumi.Input['HipObjectDataLossPreventionArgs']]):
        pulumi.set(self, "data_loss_prevention", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The Description param. String length must not exceed 255 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def device(self) -> Optional[pulumi.Input[str]]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @device.setter
    def device(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device", value)

    @property
    @pulumi.getter(name="diskBackup")
    def disk_backup(self) -> Optional[pulumi.Input['HipObjectDiskBackupArgs']]:
        """
        The DiskBackup param.
        """
        return pulumi.get(self, "disk_backup")

    @disk_backup.setter
    def disk_backup(self, value: Optional[pulumi.Input['HipObjectDiskBackupArgs']]):
        pulumi.set(self, "disk_backup", value)

    @property
    @pulumi.getter(name="diskEncryption")
    def disk_encryption(self) -> Optional[pulumi.Input['HipObjectDiskEncryptionArgs']]:
        """
        The DiskEncryption param.
        """
        return pulumi.get(self, "disk_encryption")

    @disk_encryption.setter
    def disk_encryption(self, value: Optional[pulumi.Input['HipObjectDiskEncryptionArgs']]):
        pulumi.set(self, "disk_encryption", value)

    @property
    @pulumi.getter
    def firewall(self) -> Optional[pulumi.Input['HipObjectFirewallArgs']]:
        """
        The Firewall param.
        """
        return pulumi.get(self, "firewall")

    @firewall.setter
    def firewall(self, value: Optional[pulumi.Input['HipObjectFirewallArgs']]):
        pulumi.set(self, "firewall", value)

    @property
    @pulumi.getter
    def folder(self) -> Optional[pulumi.Input[str]]:
        """
        The Folder param.
        """
        return pulumi.get(self, "folder")

    @folder.setter
    def folder(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "folder", value)

    @property
    @pulumi.getter(name="hostInfo")
    def host_info(self) -> Optional[pulumi.Input['HipObjectHostInfoArgs']]:
        """
        The HostInfo param.
        """
        return pulumi.get(self, "host_info")

    @host_info.setter
    def host_info(self, value: Optional[pulumi.Input['HipObjectHostInfoArgs']]):
        pulumi.set(self, "host_info", value)

    @property
    @pulumi.getter(name="mobileDevice")
    def mobile_device(self) -> Optional[pulumi.Input['HipObjectMobileDeviceArgs']]:
        """
        The MobileDevice param.
        """
        return pulumi.get(self, "mobile_device")

    @mobile_device.setter
    def mobile_device(self, value: Optional[pulumi.Input['HipObjectMobileDeviceArgs']]):
        pulumi.set(self, "mobile_device", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="networkInfo")
    def network_info(self) -> Optional[pulumi.Input['HipObjectNetworkInfoArgs']]:
        """
        The NetworkInfo param.
        """
        return pulumi.get(self, "network_info")

    @network_info.setter
    def network_info(self, value: Optional[pulumi.Input['HipObjectNetworkInfoArgs']]):
        pulumi.set(self, "network_info", value)

    @property
    @pulumi.getter(name="patchManagement")
    def patch_management(self) -> Optional[pulumi.Input['HipObjectPatchManagementArgs']]:
        """
        The PatchManagement param.
        """
        return pulumi.get(self, "patch_management")

    @patch_management.setter
    def patch_management(self, value: Optional[pulumi.Input['HipObjectPatchManagementArgs']]):
        pulumi.set(self, "patch_management", value)

    @property
    @pulumi.getter
    def snippet(self) -> Optional[pulumi.Input[str]]:
        """
        The Snippet param.
        """
        return pulumi.get(self, "snippet")

    @snippet.setter
    def snippet(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snippet", value)


@pulumi.input_type
class _HipObjectState:
    def __init__(__self__, *,
                 anti_malware: Optional[pulumi.Input['HipObjectAntiMalwareArgs']] = None,
                 certificate: Optional[pulumi.Input['HipObjectCertificateArgs']] = None,
                 custom_checks: Optional[pulumi.Input['HipObjectCustomChecksArgs']] = None,
                 data_loss_prevention: Optional[pulumi.Input['HipObjectDataLossPreventionArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 disk_backup: Optional[pulumi.Input['HipObjectDiskBackupArgs']] = None,
                 disk_encryption: Optional[pulumi.Input['HipObjectDiskEncryptionArgs']] = None,
                 firewall: Optional[pulumi.Input['HipObjectFirewallArgs']] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 host_info: Optional[pulumi.Input['HipObjectHostInfoArgs']] = None,
                 mobile_device: Optional[pulumi.Input['HipObjectMobileDeviceArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network_info: Optional[pulumi.Input['HipObjectNetworkInfoArgs']] = None,
                 patch_management: Optional[pulumi.Input['HipObjectPatchManagementArgs']] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 tfid: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering HipObject resources.
        :param pulumi.Input['HipObjectAntiMalwareArgs'] anti_malware: The AntiMalware param.
        :param pulumi.Input['HipObjectCertificateArgs'] certificate: The Certificate param.
        :param pulumi.Input['HipObjectCustomChecksArgs'] custom_checks: The CustomChecks param.
        :param pulumi.Input['HipObjectDataLossPreventionArgs'] data_loss_prevention: The DataLossPrevention param.
        :param pulumi.Input[str] description: The Description param. String length must not exceed 255 characters.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input['HipObjectDiskBackupArgs'] disk_backup: The DiskBackup param.
        :param pulumi.Input['HipObjectDiskEncryptionArgs'] disk_encryption: The DiskEncryption param.
        :param pulumi.Input['HipObjectFirewallArgs'] firewall: The Firewall param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input['HipObjectHostInfoArgs'] host_info: The HostInfo param.
        :param pulumi.Input['HipObjectMobileDeviceArgs'] mobile_device: The MobileDevice param.
        :param pulumi.Input[str] name: Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        :param pulumi.Input['HipObjectNetworkInfoArgs'] network_info: The NetworkInfo param.
        :param pulumi.Input['HipObjectPatchManagementArgs'] patch_management: The PatchManagement param.
        :param pulumi.Input[str] snippet: The Snippet param.
        """
        if anti_malware is not None:
            pulumi.set(__self__, "anti_malware", anti_malware)
        if certificate is not None:
            pulumi.set(__self__, "certificate", certificate)
        if custom_checks is not None:
            pulumi.set(__self__, "custom_checks", custom_checks)
        if data_loss_prevention is not None:
            pulumi.set(__self__, "data_loss_prevention", data_loss_prevention)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if disk_backup is not None:
            pulumi.set(__self__, "disk_backup", disk_backup)
        if disk_encryption is not None:
            pulumi.set(__self__, "disk_encryption", disk_encryption)
        if firewall is not None:
            pulumi.set(__self__, "firewall", firewall)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if host_info is not None:
            pulumi.set(__self__, "host_info", host_info)
        if mobile_device is not None:
            pulumi.set(__self__, "mobile_device", mobile_device)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if network_info is not None:
            pulumi.set(__self__, "network_info", network_info)
        if patch_management is not None:
            pulumi.set(__self__, "patch_management", patch_management)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)
        if tfid is not None:
            pulumi.set(__self__, "tfid", tfid)

    @property
    @pulumi.getter(name="antiMalware")
    def anti_malware(self) -> Optional[pulumi.Input['HipObjectAntiMalwareArgs']]:
        """
        The AntiMalware param.
        """
        return pulumi.get(self, "anti_malware")

    @anti_malware.setter
    def anti_malware(self, value: Optional[pulumi.Input['HipObjectAntiMalwareArgs']]):
        pulumi.set(self, "anti_malware", value)

    @property
    @pulumi.getter
    def certificate(self) -> Optional[pulumi.Input['HipObjectCertificateArgs']]:
        """
        The Certificate param.
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: Optional[pulumi.Input['HipObjectCertificateArgs']]):
        pulumi.set(self, "certificate", value)

    @property
    @pulumi.getter(name="customChecks")
    def custom_checks(self) -> Optional[pulumi.Input['HipObjectCustomChecksArgs']]:
        """
        The CustomChecks param.
        """
        return pulumi.get(self, "custom_checks")

    @custom_checks.setter
    def custom_checks(self, value: Optional[pulumi.Input['HipObjectCustomChecksArgs']]):
        pulumi.set(self, "custom_checks", value)

    @property
    @pulumi.getter(name="dataLossPrevention")
    def data_loss_prevention(self) -> Optional[pulumi.Input['HipObjectDataLossPreventionArgs']]:
        """
        The DataLossPrevention param.
        """
        return pulumi.get(self, "data_loss_prevention")

    @data_loss_prevention.setter
    def data_loss_prevention(self, value: Optional[pulumi.Input['HipObjectDataLossPreventionArgs']]):
        pulumi.set(self, "data_loss_prevention", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The Description param. String length must not exceed 255 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def device(self) -> Optional[pulumi.Input[str]]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @device.setter
    def device(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device", value)

    @property
    @pulumi.getter(name="diskBackup")
    def disk_backup(self) -> Optional[pulumi.Input['HipObjectDiskBackupArgs']]:
        """
        The DiskBackup param.
        """
        return pulumi.get(self, "disk_backup")

    @disk_backup.setter
    def disk_backup(self, value: Optional[pulumi.Input['HipObjectDiskBackupArgs']]):
        pulumi.set(self, "disk_backup", value)

    @property
    @pulumi.getter(name="diskEncryption")
    def disk_encryption(self) -> Optional[pulumi.Input['HipObjectDiskEncryptionArgs']]:
        """
        The DiskEncryption param.
        """
        return pulumi.get(self, "disk_encryption")

    @disk_encryption.setter
    def disk_encryption(self, value: Optional[pulumi.Input['HipObjectDiskEncryptionArgs']]):
        pulumi.set(self, "disk_encryption", value)

    @property
    @pulumi.getter
    def firewall(self) -> Optional[pulumi.Input['HipObjectFirewallArgs']]:
        """
        The Firewall param.
        """
        return pulumi.get(self, "firewall")

    @firewall.setter
    def firewall(self, value: Optional[pulumi.Input['HipObjectFirewallArgs']]):
        pulumi.set(self, "firewall", value)

    @property
    @pulumi.getter
    def folder(self) -> Optional[pulumi.Input[str]]:
        """
        The Folder param.
        """
        return pulumi.get(self, "folder")

    @folder.setter
    def folder(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "folder", value)

    @property
    @pulumi.getter(name="hostInfo")
    def host_info(self) -> Optional[pulumi.Input['HipObjectHostInfoArgs']]:
        """
        The HostInfo param.
        """
        return pulumi.get(self, "host_info")

    @host_info.setter
    def host_info(self, value: Optional[pulumi.Input['HipObjectHostInfoArgs']]):
        pulumi.set(self, "host_info", value)

    @property
    @pulumi.getter(name="mobileDevice")
    def mobile_device(self) -> Optional[pulumi.Input['HipObjectMobileDeviceArgs']]:
        """
        The MobileDevice param.
        """
        return pulumi.get(self, "mobile_device")

    @mobile_device.setter
    def mobile_device(self, value: Optional[pulumi.Input['HipObjectMobileDeviceArgs']]):
        pulumi.set(self, "mobile_device", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="networkInfo")
    def network_info(self) -> Optional[pulumi.Input['HipObjectNetworkInfoArgs']]:
        """
        The NetworkInfo param.
        """
        return pulumi.get(self, "network_info")

    @network_info.setter
    def network_info(self, value: Optional[pulumi.Input['HipObjectNetworkInfoArgs']]):
        pulumi.set(self, "network_info", value)

    @property
    @pulumi.getter(name="patchManagement")
    def patch_management(self) -> Optional[pulumi.Input['HipObjectPatchManagementArgs']]:
        """
        The PatchManagement param.
        """
        return pulumi.get(self, "patch_management")

    @patch_management.setter
    def patch_management(self, value: Optional[pulumi.Input['HipObjectPatchManagementArgs']]):
        pulumi.set(self, "patch_management", value)

    @property
    @pulumi.getter
    def snippet(self) -> Optional[pulumi.Input[str]]:
        """
        The Snippet param.
        """
        return pulumi.get(self, "snippet")

    @snippet.setter
    def snippet(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snippet", value)

    @property
    @pulumi.getter
    def tfid(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "tfid")

    @tfid.setter
    def tfid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tfid", value)


class HipObject(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 anti_malware: Optional[pulumi.Input[pulumi.InputType['HipObjectAntiMalwareArgs']]] = None,
                 certificate: Optional[pulumi.Input[pulumi.InputType['HipObjectCertificateArgs']]] = None,
                 custom_checks: Optional[pulumi.Input[pulumi.InputType['HipObjectCustomChecksArgs']]] = None,
                 data_loss_prevention: Optional[pulumi.Input[pulumi.InputType['HipObjectDataLossPreventionArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 disk_backup: Optional[pulumi.Input[pulumi.InputType['HipObjectDiskBackupArgs']]] = None,
                 disk_encryption: Optional[pulumi.Input[pulumi.InputType['HipObjectDiskEncryptionArgs']]] = None,
                 firewall: Optional[pulumi.Input[pulumi.InputType['HipObjectFirewallArgs']]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 host_info: Optional[pulumi.Input[pulumi.InputType['HipObjectHostInfoArgs']]] = None,
                 mobile_device: Optional[pulumi.Input[pulumi.InputType['HipObjectMobileDeviceArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network_info: Optional[pulumi.Input[pulumi.InputType['HipObjectNetworkInfoArgs']]] = None,
                 patch_management: Optional[pulumi.Input[pulumi.InputType['HipObjectPatchManagementArgs']]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Retrieves a config item.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['HipObjectAntiMalwareArgs']] anti_malware: The AntiMalware param.
        :param pulumi.Input[pulumi.InputType['HipObjectCertificateArgs']] certificate: The Certificate param.
        :param pulumi.Input[pulumi.InputType['HipObjectCustomChecksArgs']] custom_checks: The CustomChecks param.
        :param pulumi.Input[pulumi.InputType['HipObjectDataLossPreventionArgs']] data_loss_prevention: The DataLossPrevention param.
        :param pulumi.Input[str] description: The Description param. String length must not exceed 255 characters.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[pulumi.InputType['HipObjectDiskBackupArgs']] disk_backup: The DiskBackup param.
        :param pulumi.Input[pulumi.InputType['HipObjectDiskEncryptionArgs']] disk_encryption: The DiskEncryption param.
        :param pulumi.Input[pulumi.InputType['HipObjectFirewallArgs']] firewall: The Firewall param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[pulumi.InputType['HipObjectHostInfoArgs']] host_info: The HostInfo param.
        :param pulumi.Input[pulumi.InputType['HipObjectMobileDeviceArgs']] mobile_device: The MobileDevice param.
        :param pulumi.Input[str] name: Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        :param pulumi.Input[pulumi.InputType['HipObjectNetworkInfoArgs']] network_info: The NetworkInfo param.
        :param pulumi.Input[pulumi.InputType['HipObjectPatchManagementArgs']] patch_management: The PatchManagement param.
        :param pulumi.Input[str] snippet: The Snippet param.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[HipObjectArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Retrieves a config item.

        :param str resource_name: The name of the resource.
        :param HipObjectArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HipObjectArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 anti_malware: Optional[pulumi.Input[pulumi.InputType['HipObjectAntiMalwareArgs']]] = None,
                 certificate: Optional[pulumi.Input[pulumi.InputType['HipObjectCertificateArgs']]] = None,
                 custom_checks: Optional[pulumi.Input[pulumi.InputType['HipObjectCustomChecksArgs']]] = None,
                 data_loss_prevention: Optional[pulumi.Input[pulumi.InputType['HipObjectDataLossPreventionArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 disk_backup: Optional[pulumi.Input[pulumi.InputType['HipObjectDiskBackupArgs']]] = None,
                 disk_encryption: Optional[pulumi.Input[pulumi.InputType['HipObjectDiskEncryptionArgs']]] = None,
                 firewall: Optional[pulumi.Input[pulumi.InputType['HipObjectFirewallArgs']]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 host_info: Optional[pulumi.Input[pulumi.InputType['HipObjectHostInfoArgs']]] = None,
                 mobile_device: Optional[pulumi.Input[pulumi.InputType['HipObjectMobileDeviceArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 network_info: Optional[pulumi.Input[pulumi.InputType['HipObjectNetworkInfoArgs']]] = None,
                 patch_management: Optional[pulumi.Input[pulumi.InputType['HipObjectPatchManagementArgs']]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HipObjectArgs.__new__(HipObjectArgs)

            __props__.__dict__["anti_malware"] = anti_malware
            __props__.__dict__["certificate"] = certificate
            __props__.__dict__["custom_checks"] = custom_checks
            __props__.__dict__["data_loss_prevention"] = data_loss_prevention
            __props__.__dict__["description"] = description
            __props__.__dict__["device"] = device
            __props__.__dict__["disk_backup"] = disk_backup
            __props__.__dict__["disk_encryption"] = disk_encryption
            __props__.__dict__["firewall"] = firewall
            __props__.__dict__["folder"] = folder
            __props__.__dict__["host_info"] = host_info
            __props__.__dict__["mobile_device"] = mobile_device
            __props__.__dict__["name"] = name
            __props__.__dict__["network_info"] = network_info
            __props__.__dict__["patch_management"] = patch_management
            __props__.__dict__["snippet"] = snippet
            __props__.__dict__["tfid"] = None
        super(HipObject, __self__).__init__(
            'scm:index/hipObject:HipObject',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            anti_malware: Optional[pulumi.Input[pulumi.InputType['HipObjectAntiMalwareArgs']]] = None,
            certificate: Optional[pulumi.Input[pulumi.InputType['HipObjectCertificateArgs']]] = None,
            custom_checks: Optional[pulumi.Input[pulumi.InputType['HipObjectCustomChecksArgs']]] = None,
            data_loss_prevention: Optional[pulumi.Input[pulumi.InputType['HipObjectDataLossPreventionArgs']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            disk_backup: Optional[pulumi.Input[pulumi.InputType['HipObjectDiskBackupArgs']]] = None,
            disk_encryption: Optional[pulumi.Input[pulumi.InputType['HipObjectDiskEncryptionArgs']]] = None,
            firewall: Optional[pulumi.Input[pulumi.InputType['HipObjectFirewallArgs']]] = None,
            folder: Optional[pulumi.Input[str]] = None,
            host_info: Optional[pulumi.Input[pulumi.InputType['HipObjectHostInfoArgs']]] = None,
            mobile_device: Optional[pulumi.Input[pulumi.InputType['HipObjectMobileDeviceArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            network_info: Optional[pulumi.Input[pulumi.InputType['HipObjectNetworkInfoArgs']]] = None,
            patch_management: Optional[pulumi.Input[pulumi.InputType['HipObjectPatchManagementArgs']]] = None,
            snippet: Optional[pulumi.Input[str]] = None,
            tfid: Optional[pulumi.Input[str]] = None) -> 'HipObject':
        """
        Get an existing HipObject resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['HipObjectAntiMalwareArgs']] anti_malware: The AntiMalware param.
        :param pulumi.Input[pulumi.InputType['HipObjectCertificateArgs']] certificate: The Certificate param.
        :param pulumi.Input[pulumi.InputType['HipObjectCustomChecksArgs']] custom_checks: The CustomChecks param.
        :param pulumi.Input[pulumi.InputType['HipObjectDataLossPreventionArgs']] data_loss_prevention: The DataLossPrevention param.
        :param pulumi.Input[str] description: The Description param. String length must not exceed 255 characters.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[pulumi.InputType['HipObjectDiskBackupArgs']] disk_backup: The DiskBackup param.
        :param pulumi.Input[pulumi.InputType['HipObjectDiskEncryptionArgs']] disk_encryption: The DiskEncryption param.
        :param pulumi.Input[pulumi.InputType['HipObjectFirewallArgs']] firewall: The Firewall param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[pulumi.InputType['HipObjectHostInfoArgs']] host_info: The HostInfo param.
        :param pulumi.Input[pulumi.InputType['HipObjectMobileDeviceArgs']] mobile_device: The MobileDevice param.
        :param pulumi.Input[str] name: Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        :param pulumi.Input[pulumi.InputType['HipObjectNetworkInfoArgs']] network_info: The NetworkInfo param.
        :param pulumi.Input[pulumi.InputType['HipObjectPatchManagementArgs']] patch_management: The PatchManagement param.
        :param pulumi.Input[str] snippet: The Snippet param.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HipObjectState.__new__(_HipObjectState)

        __props__.__dict__["anti_malware"] = anti_malware
        __props__.__dict__["certificate"] = certificate
        __props__.__dict__["custom_checks"] = custom_checks
        __props__.__dict__["data_loss_prevention"] = data_loss_prevention
        __props__.__dict__["description"] = description
        __props__.__dict__["device"] = device
        __props__.__dict__["disk_backup"] = disk_backup
        __props__.__dict__["disk_encryption"] = disk_encryption
        __props__.__dict__["firewall"] = firewall
        __props__.__dict__["folder"] = folder
        __props__.__dict__["host_info"] = host_info
        __props__.__dict__["mobile_device"] = mobile_device
        __props__.__dict__["name"] = name
        __props__.__dict__["network_info"] = network_info
        __props__.__dict__["patch_management"] = patch_management
        __props__.__dict__["snippet"] = snippet
        __props__.__dict__["tfid"] = tfid
        return HipObject(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="antiMalware")
    def anti_malware(self) -> pulumi.Output[Optional['outputs.HipObjectAntiMalware']]:
        """
        The AntiMalware param.
        """
        return pulumi.get(self, "anti_malware")

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Output[Optional['outputs.HipObjectCertificate']]:
        """
        The Certificate param.
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter(name="customChecks")
    def custom_checks(self) -> pulumi.Output[Optional['outputs.HipObjectCustomChecks']]:
        """
        The CustomChecks param.
        """
        return pulumi.get(self, "custom_checks")

    @property
    @pulumi.getter(name="dataLossPrevention")
    def data_loss_prevention(self) -> pulumi.Output[Optional['outputs.HipObjectDataLossPrevention']]:
        """
        The DataLossPrevention param.
        """
        return pulumi.get(self, "data_loss_prevention")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The Description param. String length must not exceed 255 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[str]]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter(name="diskBackup")
    def disk_backup(self) -> pulumi.Output[Optional['outputs.HipObjectDiskBackup']]:
        """
        The DiskBackup param.
        """
        return pulumi.get(self, "disk_backup")

    @property
    @pulumi.getter(name="diskEncryption")
    def disk_encryption(self) -> pulumi.Output[Optional['outputs.HipObjectDiskEncryption']]:
        """
        The DiskEncryption param.
        """
        return pulumi.get(self, "disk_encryption")

    @property
    @pulumi.getter
    def firewall(self) -> pulumi.Output[Optional['outputs.HipObjectFirewall']]:
        """
        The Firewall param.
        """
        return pulumi.get(self, "firewall")

    @property
    @pulumi.getter
    def folder(self) -> pulumi.Output[Optional[str]]:
        """
        The Folder param.
        """
        return pulumi.get(self, "folder")

    @property
    @pulumi.getter(name="hostInfo")
    def host_info(self) -> pulumi.Output[Optional['outputs.HipObjectHostInfo']]:
        """
        The HostInfo param.
        """
        return pulumi.get(self, "host_info")

    @property
    @pulumi.getter(name="mobileDevice")
    def mobile_device(self) -> pulumi.Output[Optional['outputs.HipObjectMobileDevice']]:
        """
        The MobileDevice param.
        """
        return pulumi.get(self, "mobile_device")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="networkInfo")
    def network_info(self) -> pulumi.Output[Optional['outputs.HipObjectNetworkInfo']]:
        """
        The NetworkInfo param.
        """
        return pulumi.get(self, "network_info")

    @property
    @pulumi.getter(name="patchManagement")
    def patch_management(self) -> pulumi.Output[Optional['outputs.HipObjectPatchManagement']]:
        """
        The PatchManagement param.
        """
        return pulumi.get(self, "patch_management")

    @property
    @pulumi.getter
    def snippet(self) -> pulumi.Output[Optional[str]]:
        """
        The Snippet param.
        """
        return pulumi.get(self, "snippet")

    @property
    @pulumi.getter
    def tfid(self) -> pulumi.Output[str]:
        return pulumi.get(self, "tfid")

