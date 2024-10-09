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
    'GetRemoteNetworkResult',
    'AwaitableGetRemoteNetworkResult',
    'get_remote_network',
    'get_remote_network_output',
]

@pulumi.output_type
class GetRemoteNetworkResult:
    """
    A collection of values returned by getRemoteNetwork.
    """
    def __init__(__self__, ecmp_load_balancing=None, ecmp_tunnels=None, folder=None, id=None, ipsec_tunnel=None, license_type=None, name=None, protocol=None, region=None, secondary_ipsec_tunnel=None, spn_name=None, subnets=None, tfid=None):
        if ecmp_load_balancing and not isinstance(ecmp_load_balancing, str):
            raise TypeError("Expected argument 'ecmp_load_balancing' to be a str")
        pulumi.set(__self__, "ecmp_load_balancing", ecmp_load_balancing)
        if ecmp_tunnels and not isinstance(ecmp_tunnels, list):
            raise TypeError("Expected argument 'ecmp_tunnels' to be a list")
        pulumi.set(__self__, "ecmp_tunnels", ecmp_tunnels)
        if folder and not isinstance(folder, str):
            raise TypeError("Expected argument 'folder' to be a str")
        pulumi.set(__self__, "folder", folder)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ipsec_tunnel and not isinstance(ipsec_tunnel, str):
            raise TypeError("Expected argument 'ipsec_tunnel' to be a str")
        pulumi.set(__self__, "ipsec_tunnel", ipsec_tunnel)
        if license_type and not isinstance(license_type, str):
            raise TypeError("Expected argument 'license_type' to be a str")
        pulumi.set(__self__, "license_type", license_type)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if protocol and not isinstance(protocol, dict):
            raise TypeError("Expected argument 'protocol' to be a dict")
        pulumi.set(__self__, "protocol", protocol)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if secondary_ipsec_tunnel and not isinstance(secondary_ipsec_tunnel, str):
            raise TypeError("Expected argument 'secondary_ipsec_tunnel' to be a str")
        pulumi.set(__self__, "secondary_ipsec_tunnel", secondary_ipsec_tunnel)
        if spn_name and not isinstance(spn_name, str):
            raise TypeError("Expected argument 'spn_name' to be a str")
        pulumi.set(__self__, "spn_name", spn_name)
        if subnets and not isinstance(subnets, list):
            raise TypeError("Expected argument 'subnets' to be a list")
        pulumi.set(__self__, "subnets", subnets)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)

    @property
    @pulumi.getter(name="ecmpLoadBalancing")
    def ecmp_load_balancing(self) -> str:
        """
        The EcmpLoadBalancing param. String must be one of these: `"enable"`, `"disable"`. Default: `"disable"`.
        """
        return pulumi.get(self, "ecmp_load_balancing")

    @property
    @pulumi.getter(name="ecmpTunnels")
    def ecmp_tunnels(self) -> Sequence['outputs.GetRemoteNetworkEcmpTunnelResult']:
        """
        ecmp*tunnels is required when ecmp*load*balancing is enable.
        """
        return pulumi.get(self, "ecmp_tunnels")

    @property
    @pulumi.getter
    def folder(self) -> str:
        """
        The Folder param. String can either be a specific string(`"Remote Networks"`) or match this regex: `^[\\s0-9a-zA-Z._-]{1,}$`. Default: `"Remote Networks"`.
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
        ipsec*tunnel is required when ecmp*load_balancing is disable.
        """
        return pulumi.get(self, "ipsec_tunnel")

    @property
    @pulumi.getter(name="licenseType")
    def license_type(self) -> str:
        """
        New customer will only be on aggregate bandwidth licensing. String length must exceed 1 characters. Default: `"FWAAS-AGGREGATE"`.
        """
        return pulumi.get(self, "license_type")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def protocol(self) -> 'outputs.GetRemoteNetworkProtocolResult':
        """
        setup the protocol when ecmp*load*balancing is disable.
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter
    def region(self) -> str:
        """
        The Region param. String length must exceed 1 characters.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="secondaryIpsecTunnel")
    def secondary_ipsec_tunnel(self) -> str:
        """
        specify secondary ipsec_tunnel if needed.
        """
        return pulumi.get(self, "secondary_ipsec_tunnel")

    @property
    @pulumi.getter(name="spnName")
    def spn_name(self) -> str:
        """
        spn-name is needed when license_type is FWAAS-AGGREGATE.
        """
        return pulumi.get(self, "spn_name")

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


class AwaitableGetRemoteNetworkResult(GetRemoteNetworkResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRemoteNetworkResult(
            ecmp_load_balancing=self.ecmp_load_balancing,
            ecmp_tunnels=self.ecmp_tunnels,
            folder=self.folder,
            id=self.id,
            ipsec_tunnel=self.ipsec_tunnel,
            license_type=self.license_type,
            name=self.name,
            protocol=self.protocol,
            region=self.region,
            secondary_ipsec_tunnel=self.secondary_ipsec_tunnel,
            spn_name=self.spn_name,
            subnets=self.subnets,
            tfid=self.tfid)


def get_remote_network(folder: Optional[str] = None,
                       id: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRemoteNetworkResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_remote_network(id="1234-56-789")
    ```


    :param str folder: The Folder param. String can either be a specific string(`"Remote Networks"`) or match this regex: `^[\\s0-9a-zA-Z._-]{1,}$`. Default: `"Remote Networks"`.
    :param str id: The Id param.
    """
    __args__ = dict()
    __args__['folder'] = folder
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getRemoteNetwork:getRemoteNetwork', __args__, opts=opts, typ=GetRemoteNetworkResult).value

    return AwaitableGetRemoteNetworkResult(
        ecmp_load_balancing=pulumi.get(__ret__, 'ecmp_load_balancing'),
        ecmp_tunnels=pulumi.get(__ret__, 'ecmp_tunnels'),
        folder=pulumi.get(__ret__, 'folder'),
        id=pulumi.get(__ret__, 'id'),
        ipsec_tunnel=pulumi.get(__ret__, 'ipsec_tunnel'),
        license_type=pulumi.get(__ret__, 'license_type'),
        name=pulumi.get(__ret__, 'name'),
        protocol=pulumi.get(__ret__, 'protocol'),
        region=pulumi.get(__ret__, 'region'),
        secondary_ipsec_tunnel=pulumi.get(__ret__, 'secondary_ipsec_tunnel'),
        spn_name=pulumi.get(__ret__, 'spn_name'),
        subnets=pulumi.get(__ret__, 'subnets'),
        tfid=pulumi.get(__ret__, 'tfid'))
def get_remote_network_output(folder: Optional[pulumi.Input[Optional[str]]] = None,
                              id: Optional[pulumi.Input[str]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetRemoteNetworkResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_remote_network(id="1234-56-789")
    ```


    :param str folder: The Folder param. String can either be a specific string(`"Remote Networks"`) or match this regex: `^[\\s0-9a-zA-Z._-]{1,}$`. Default: `"Remote Networks"`.
    :param str id: The Id param.
    """
    __args__ = dict()
    __args__['folder'] = folder
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('scm:index/getRemoteNetwork:getRemoteNetwork', __args__, opts=opts, typ=GetRemoteNetworkResult)
    return __ret__.apply(lambda __response__: GetRemoteNetworkResult(
        ecmp_load_balancing=pulumi.get(__response__, 'ecmp_load_balancing'),
        ecmp_tunnels=pulumi.get(__response__, 'ecmp_tunnels'),
        folder=pulumi.get(__response__, 'folder'),
        id=pulumi.get(__response__, 'id'),
        ipsec_tunnel=pulumi.get(__response__, 'ipsec_tunnel'),
        license_type=pulumi.get(__response__, 'license_type'),
        name=pulumi.get(__response__, 'name'),
        protocol=pulumi.get(__response__, 'protocol'),
        region=pulumi.get(__response__, 'region'),
        secondary_ipsec_tunnel=pulumi.get(__response__, 'secondary_ipsec_tunnel'),
        spn_name=pulumi.get(__response__, 'spn_name'),
        subnets=pulumi.get(__response__, 'subnets'),
        tfid=pulumi.get(__response__, 'tfid')))
