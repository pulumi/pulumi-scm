# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs

__all__ = [
    'GetServiceConnectionResult',
    'AwaitableGetServiceConnectionResult',
    'get_service_connection',
    'get_service_connection_output',
]

@pulumi.output_type
class GetServiceConnectionResult:
    """
    A collection of values returned by getServiceConnection.
    """
    def __init__(__self__, backup_sc=None, bgp_peer=None, folder=None, id=None, ipsec_tunnel=None, name=None, nat_pool=None, no_export_community=None, onboarding_type=None, protocol=None, qos=None, region=None, secondary_ipsec_tunnel=None, source_nat=None, subnets=None, tfid=None):
        if backup_sc and not isinstance(backup_sc, str):
            raise TypeError("Expected argument 'backup_sc' to be a str")
        pulumi.set(__self__, "backup_sc", backup_sc)
        if bgp_peer and not isinstance(bgp_peer, dict):
            raise TypeError("Expected argument 'bgp_peer' to be a dict")
        pulumi.set(__self__, "bgp_peer", bgp_peer)
        if folder and not isinstance(folder, str):
            raise TypeError("Expected argument 'folder' to be a str")
        pulumi.set(__self__, "folder", folder)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ipsec_tunnel and not isinstance(ipsec_tunnel, str):
            raise TypeError("Expected argument 'ipsec_tunnel' to be a str")
        pulumi.set(__self__, "ipsec_tunnel", ipsec_tunnel)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if nat_pool and not isinstance(nat_pool, str):
            raise TypeError("Expected argument 'nat_pool' to be a str")
        pulumi.set(__self__, "nat_pool", nat_pool)
        if no_export_community and not isinstance(no_export_community, str):
            raise TypeError("Expected argument 'no_export_community' to be a str")
        pulumi.set(__self__, "no_export_community", no_export_community)
        if onboarding_type and not isinstance(onboarding_type, str):
            raise TypeError("Expected argument 'onboarding_type' to be a str")
        pulumi.set(__self__, "onboarding_type", onboarding_type)
        if protocol and not isinstance(protocol, dict):
            raise TypeError("Expected argument 'protocol' to be a dict")
        pulumi.set(__self__, "protocol", protocol)
        if qos and not isinstance(qos, dict):
            raise TypeError("Expected argument 'qos' to be a dict")
        pulumi.set(__self__, "qos", qos)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if secondary_ipsec_tunnel and not isinstance(secondary_ipsec_tunnel, str):
            raise TypeError("Expected argument 'secondary_ipsec_tunnel' to be a str")
        pulumi.set(__self__, "secondary_ipsec_tunnel", secondary_ipsec_tunnel)
        if source_nat and not isinstance(source_nat, bool):
            raise TypeError("Expected argument 'source_nat' to be a bool")
        pulumi.set(__self__, "source_nat", source_nat)
        if subnets and not isinstance(subnets, list):
            raise TypeError("Expected argument 'subnets' to be a list")
        pulumi.set(__self__, "subnets", subnets)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)

    @property
    @pulumi.getter(name="backupSC")
    def backup_sc(self) -> str:
        """
        The BackupSC param.
        """
        return pulumi.get(self, "backup_sc")

    @property
    @pulumi.getter(name="bgpPeer")
    def bgp_peer(self) -> 'outputs.GetServiceConnectionBgpPeerResult':
        """
        The BgpPeer param.
        """
        return pulumi.get(self, "bgp_peer")

    @property
    @pulumi.getter
    def folder(self) -> str:
        """
        The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\\s-]{1,}$`. Default: `"Service Connections"`.
        """
        return pulumi.get(self, "folder")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The Id param.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipsecTunnel")
    def ipsec_tunnel(self) -> str:
        """
        The IpsecTunnel param.
        """
        return pulumi.get(self, "ipsec_tunnel")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The Name param.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="natPool")
    def nat_pool(self) -> str:
        """
        The NatPool param.
        """
        return pulumi.get(self, "nat_pool")

    @property
    @pulumi.getter(name="noExportCommunity")
    def no_export_community(self) -> str:
        """
        The NoExportCommunity param. String must be one of these: `"Disabled"`, `"Enabled-In"`, `"Enabled-Out"`, `"Enabled-Both"`.
        """
        return pulumi.get(self, "no_export_community")

    @property
    @pulumi.getter(name="onboardingType")
    def onboarding_type(self) -> str:
        """
        The OnboardingType param. String must be one of these: `"classic"`. Default: `"classic"`.
        """
        return pulumi.get(self, "onboarding_type")

    @property
    @pulumi.getter
    def protocol(self) -> 'outputs.GetServiceConnectionProtocolResult':
        """
        The Protocol param.
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter
    def qos(self) -> 'outputs.GetServiceConnectionQosResult':
        """
        The Qos param.
        """
        return pulumi.get(self, "qos")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        The Region param.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="secondaryIpsecTunnel")
    def secondary_ipsec_tunnel(self) -> str:
        """
        The SecondaryIpsecTunnel param.
        """
        return pulumi.get(self, "secondary_ipsec_tunnel")

    @property
    @pulumi.getter(name="sourceNat")
    def source_nat(self) -> bool:
        """
        The SourceNat param.
        """
        return pulumi.get(self, "source_nat")

    @property
    @pulumi.getter
    def subnets(self) -> Sequence[str]:
        """
        The Subnets param.
        """
        return pulumi.get(self, "subnets")

    @property
    @pulumi.getter
    def tfid(self) -> str:
        return pulumi.get(self, "tfid")


class AwaitableGetServiceConnectionResult(GetServiceConnectionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceConnectionResult(
            backup_sc=self.backup_sc,
            bgp_peer=self.bgp_peer,
            folder=self.folder,
            id=self.id,
            ipsec_tunnel=self.ipsec_tunnel,
            name=self.name,
            nat_pool=self.nat_pool,
            no_export_community=self.no_export_community,
            onboarding_type=self.onboarding_type,
            protocol=self.protocol,
            qos=self.qos,
            region=self.region,
            secondary_ipsec_tunnel=self.secondary_ipsec_tunnel,
            source_nat=self.source_nat,
            subnets=self.subnets,
            tfid=self.tfid)


def get_service_connection(folder: Optional[str] = None,
                           id: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceConnectionResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_service_connection(id="1234-56-789",
        folder="Service Connections")
    ```


    :param str folder: The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\\s-]{1,}$`. Default: `"Service Connections"`.
    :param str id: The Id param.
    """
    __args__ = dict()
    __args__['folder'] = folder
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getServiceConnection:getServiceConnection', __args__, opts=opts, typ=GetServiceConnectionResult).value

    return AwaitableGetServiceConnectionResult(
        backup_sc=pulumi.get(__ret__, 'backup_sc'),
        bgp_peer=pulumi.get(__ret__, 'bgp_peer'),
        folder=pulumi.get(__ret__, 'folder'),
        id=pulumi.get(__ret__, 'id'),
        ipsec_tunnel=pulumi.get(__ret__, 'ipsec_tunnel'),
        name=pulumi.get(__ret__, 'name'),
        nat_pool=pulumi.get(__ret__, 'nat_pool'),
        no_export_community=pulumi.get(__ret__, 'no_export_community'),
        onboarding_type=pulumi.get(__ret__, 'onboarding_type'),
        protocol=pulumi.get(__ret__, 'protocol'),
        qos=pulumi.get(__ret__, 'qos'),
        region=pulumi.get(__ret__, 'region'),
        secondary_ipsec_tunnel=pulumi.get(__ret__, 'secondary_ipsec_tunnel'),
        source_nat=pulumi.get(__ret__, 'source_nat'),
        subnets=pulumi.get(__ret__, 'subnets'),
        tfid=pulumi.get(__ret__, 'tfid'))
def get_service_connection_output(folder: Optional[pulumi.Input[Optional[str]]] = None,
                                  id: Optional[pulumi.Input[str]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServiceConnectionResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_service_connection(id="1234-56-789",
        folder="Service Connections")
    ```


    :param str folder: The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\\s-]{1,}$`. Default: `"Service Connections"`.
    :param str id: The Id param.
    """
    __args__ = dict()
    __args__['folder'] = folder
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('scm:index/getServiceConnection:getServiceConnection', __args__, opts=opts, typ=GetServiceConnectionResult)
    return __ret__.apply(lambda __response__: GetServiceConnectionResult(
        backup_sc=pulumi.get(__response__, 'backup_sc'),
        bgp_peer=pulumi.get(__response__, 'bgp_peer'),
        folder=pulumi.get(__response__, 'folder'),
        id=pulumi.get(__response__, 'id'),
        ipsec_tunnel=pulumi.get(__response__, 'ipsec_tunnel'),
        name=pulumi.get(__response__, 'name'),
        nat_pool=pulumi.get(__response__, 'nat_pool'),
        no_export_community=pulumi.get(__response__, 'no_export_community'),
        onboarding_type=pulumi.get(__response__, 'onboarding_type'),
        protocol=pulumi.get(__response__, 'protocol'),
        qos=pulumi.get(__response__, 'qos'),
        region=pulumi.get(__response__, 'region'),
        secondary_ipsec_tunnel=pulumi.get(__response__, 'secondary_ipsec_tunnel'),
        source_nat=pulumi.get(__response__, 'source_nat'),
        subnets=pulumi.get(__response__, 'subnets'),
        tfid=pulumi.get(__response__, 'tfid')))
