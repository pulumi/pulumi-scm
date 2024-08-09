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

__all__ = ['RemoteNetworkArgs', 'RemoteNetwork']

@pulumi.input_type
class RemoteNetworkArgs:
    def __init__(__self__, *,
                 region: pulumi.Input[str],
                 ecmp_load_balancing: Optional[pulumi.Input[str]] = None,
                 ecmp_tunnels: Optional[pulumi.Input[Sequence[pulumi.Input['RemoteNetworkEcmpTunnelArgs']]]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 ipsec_tunnel: Optional[pulumi.Input[str]] = None,
                 license_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 protocol: Optional[pulumi.Input['RemoteNetworkProtocolArgs']] = None,
                 secondary_ipsec_tunnel: Optional[pulumi.Input[str]] = None,
                 spn_name: Optional[pulumi.Input[str]] = None,
                 subnets: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a RemoteNetwork resource.
        :param pulumi.Input[str] region: The Region param. String length must exceed 1 characters.
        :param pulumi.Input[str] ecmp_load_balancing: The EcmpLoadBalancing param. String must be one of these: `"enable"`, `"disable"`. Default: `"disable"`.
        :param pulumi.Input[Sequence[pulumi.Input['RemoteNetworkEcmpTunnelArgs']]] ecmp_tunnels: ecmp*tunnels is required when ecmp*load*balancing is enable.
        :param pulumi.Input[str] folder: The Folder param. String can either be a specific string(`"Remote Networks"`) or match this regex: `^[\\s0-9a-zA-Z._-]{1,}$`. Default: `"Remote Networks"`.
        :param pulumi.Input[str] ipsec_tunnel: ipsec*tunnel is required when ecmp*load_balancing is disable.
        :param pulumi.Input[str] license_type: New customer will only be on aggregate bandwidth licensing. String length must exceed 1 characters. Default: `"FWAAS-AGGREGATE"`.
        :param pulumi.Input[str] name: Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
        :param pulumi.Input['RemoteNetworkProtocolArgs'] protocol: setup the protocol when ecmp*load*balancing is disable.
        :param pulumi.Input[str] secondary_ipsec_tunnel: specify secondary ipsec_tunnel if needed.
        :param pulumi.Input[str] spn_name: spn-name is needed when license_type is FWAAS-AGGREGATE.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnets: The Subnets param.
        """
        pulumi.set(__self__, "region", region)
        if ecmp_load_balancing is not None:
            pulumi.set(__self__, "ecmp_load_balancing", ecmp_load_balancing)
        if ecmp_tunnels is not None:
            pulumi.set(__self__, "ecmp_tunnels", ecmp_tunnels)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if ipsec_tunnel is not None:
            pulumi.set(__self__, "ipsec_tunnel", ipsec_tunnel)
        if license_type is not None:
            pulumi.set(__self__, "license_type", license_type)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if protocol is not None:
            pulumi.set(__self__, "protocol", protocol)
        if secondary_ipsec_tunnel is not None:
            pulumi.set(__self__, "secondary_ipsec_tunnel", secondary_ipsec_tunnel)
        if spn_name is not None:
            pulumi.set(__self__, "spn_name", spn_name)
        if subnets is not None:
            pulumi.set(__self__, "subnets", subnets)

    @property
    @pulumi.getter
    def region(self) -> pulumi.Input[str]:
        """
        The Region param. String length must exceed 1 characters.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: pulumi.Input[str]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="ecmpLoadBalancing")
    def ecmp_load_balancing(self) -> Optional[pulumi.Input[str]]:
        """
        The EcmpLoadBalancing param. String must be one of these: `"enable"`, `"disable"`. Default: `"disable"`.
        """
        return pulumi.get(self, "ecmp_load_balancing")

    @ecmp_load_balancing.setter
    def ecmp_load_balancing(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ecmp_load_balancing", value)

    @property
    @pulumi.getter(name="ecmpTunnels")
    def ecmp_tunnels(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RemoteNetworkEcmpTunnelArgs']]]]:
        """
        ecmp*tunnels is required when ecmp*load*balancing is enable.
        """
        return pulumi.get(self, "ecmp_tunnels")

    @ecmp_tunnels.setter
    def ecmp_tunnels(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RemoteNetworkEcmpTunnelArgs']]]]):
        pulumi.set(self, "ecmp_tunnels", value)

    @property
    @pulumi.getter
    def folder(self) -> Optional[pulumi.Input[str]]:
        """
        The Folder param. String can either be a specific string(`"Remote Networks"`) or match this regex: `^[\\s0-9a-zA-Z._-]{1,}$`. Default: `"Remote Networks"`.
        """
        return pulumi.get(self, "folder")

    @folder.setter
    def folder(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "folder", value)

    @property
    @pulumi.getter(name="ipsecTunnel")
    def ipsec_tunnel(self) -> Optional[pulumi.Input[str]]:
        """
        ipsec*tunnel is required when ecmp*load_balancing is disable.
        """
        return pulumi.get(self, "ipsec_tunnel")

    @ipsec_tunnel.setter
    def ipsec_tunnel(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipsec_tunnel", value)

    @property
    @pulumi.getter(name="licenseType")
    def license_type(self) -> Optional[pulumi.Input[str]]:
        """
        New customer will only be on aggregate bandwidth licensing. String length must exceed 1 characters. Default: `"FWAAS-AGGREGATE"`.
        """
        return pulumi.get(self, "license_type")

    @license_type.setter
    def license_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "license_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def protocol(self) -> Optional[pulumi.Input['RemoteNetworkProtocolArgs']]:
        """
        setup the protocol when ecmp*load*balancing is disable.
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: Optional[pulumi.Input['RemoteNetworkProtocolArgs']]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter(name="secondaryIpsecTunnel")
    def secondary_ipsec_tunnel(self) -> Optional[pulumi.Input[str]]:
        """
        specify secondary ipsec_tunnel if needed.
        """
        return pulumi.get(self, "secondary_ipsec_tunnel")

    @secondary_ipsec_tunnel.setter
    def secondary_ipsec_tunnel(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secondary_ipsec_tunnel", value)

    @property
    @pulumi.getter(name="spnName")
    def spn_name(self) -> Optional[pulumi.Input[str]]:
        """
        spn-name is needed when license_type is FWAAS-AGGREGATE.
        """
        return pulumi.get(self, "spn_name")

    @spn_name.setter
    def spn_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "spn_name", value)

    @property
    @pulumi.getter
    def subnets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The Subnets param.
        """
        return pulumi.get(self, "subnets")

    @subnets.setter
    def subnets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subnets", value)


@pulumi.input_type
class _RemoteNetworkState:
    def __init__(__self__, *,
                 ecmp_load_balancing: Optional[pulumi.Input[str]] = None,
                 ecmp_tunnels: Optional[pulumi.Input[Sequence[pulumi.Input['RemoteNetworkEcmpTunnelArgs']]]] = None,
                 encrypted_values: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 ipsec_tunnel: Optional[pulumi.Input[str]] = None,
                 license_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 protocol: Optional[pulumi.Input['RemoteNetworkProtocolArgs']] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 secondary_ipsec_tunnel: Optional[pulumi.Input[str]] = None,
                 spn_name: Optional[pulumi.Input[str]] = None,
                 subnets: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tfid: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering RemoteNetwork resources.
        :param pulumi.Input[str] ecmp_load_balancing: The EcmpLoadBalancing param. String must be one of these: `"enable"`, `"disable"`. Default: `"disable"`.
        :param pulumi.Input[Sequence[pulumi.Input['RemoteNetworkEcmpTunnelArgs']]] ecmp_tunnels: ecmp*tunnels is required when ecmp*load*balancing is enable.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] encrypted_values: (Internal use) Encrypted values returned from the API.
        :param pulumi.Input[str] folder: The Folder param. String can either be a specific string(`"Remote Networks"`) or match this regex: `^[\\s0-9a-zA-Z._-]{1,}$`. Default: `"Remote Networks"`.
        :param pulumi.Input[str] ipsec_tunnel: ipsec*tunnel is required when ecmp*load_balancing is disable.
        :param pulumi.Input[str] license_type: New customer will only be on aggregate bandwidth licensing. String length must exceed 1 characters. Default: `"FWAAS-AGGREGATE"`.
        :param pulumi.Input[str] name: Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
        :param pulumi.Input['RemoteNetworkProtocolArgs'] protocol: setup the protocol when ecmp*load*balancing is disable.
        :param pulumi.Input[str] region: The Region param. String length must exceed 1 characters.
        :param pulumi.Input[str] secondary_ipsec_tunnel: specify secondary ipsec_tunnel if needed.
        :param pulumi.Input[str] spn_name: spn-name is needed when license_type is FWAAS-AGGREGATE.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnets: The Subnets param.
        """
        if ecmp_load_balancing is not None:
            pulumi.set(__self__, "ecmp_load_balancing", ecmp_load_balancing)
        if ecmp_tunnels is not None:
            pulumi.set(__self__, "ecmp_tunnels", ecmp_tunnels)
        if encrypted_values is not None:
            pulumi.set(__self__, "encrypted_values", encrypted_values)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if ipsec_tunnel is not None:
            pulumi.set(__self__, "ipsec_tunnel", ipsec_tunnel)
        if license_type is not None:
            pulumi.set(__self__, "license_type", license_type)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if protocol is not None:
            pulumi.set(__self__, "protocol", protocol)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if secondary_ipsec_tunnel is not None:
            pulumi.set(__self__, "secondary_ipsec_tunnel", secondary_ipsec_tunnel)
        if spn_name is not None:
            pulumi.set(__self__, "spn_name", spn_name)
        if subnets is not None:
            pulumi.set(__self__, "subnets", subnets)
        if tfid is not None:
            pulumi.set(__self__, "tfid", tfid)

    @property
    @pulumi.getter(name="ecmpLoadBalancing")
    def ecmp_load_balancing(self) -> Optional[pulumi.Input[str]]:
        """
        The EcmpLoadBalancing param. String must be one of these: `"enable"`, `"disable"`. Default: `"disable"`.
        """
        return pulumi.get(self, "ecmp_load_balancing")

    @ecmp_load_balancing.setter
    def ecmp_load_balancing(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ecmp_load_balancing", value)

    @property
    @pulumi.getter(name="ecmpTunnels")
    def ecmp_tunnels(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['RemoteNetworkEcmpTunnelArgs']]]]:
        """
        ecmp*tunnels is required when ecmp*load*balancing is enable.
        """
        return pulumi.get(self, "ecmp_tunnels")

    @ecmp_tunnels.setter
    def ecmp_tunnels(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['RemoteNetworkEcmpTunnelArgs']]]]):
        pulumi.set(self, "ecmp_tunnels", value)

    @property
    @pulumi.getter(name="encryptedValues")
    def encrypted_values(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        (Internal use) Encrypted values returned from the API.
        """
        return pulumi.get(self, "encrypted_values")

    @encrypted_values.setter
    def encrypted_values(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "encrypted_values", value)

    @property
    @pulumi.getter
    def folder(self) -> Optional[pulumi.Input[str]]:
        """
        The Folder param. String can either be a specific string(`"Remote Networks"`) or match this regex: `^[\\s0-9a-zA-Z._-]{1,}$`. Default: `"Remote Networks"`.
        """
        return pulumi.get(self, "folder")

    @folder.setter
    def folder(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "folder", value)

    @property
    @pulumi.getter(name="ipsecTunnel")
    def ipsec_tunnel(self) -> Optional[pulumi.Input[str]]:
        """
        ipsec*tunnel is required when ecmp*load_balancing is disable.
        """
        return pulumi.get(self, "ipsec_tunnel")

    @ipsec_tunnel.setter
    def ipsec_tunnel(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ipsec_tunnel", value)

    @property
    @pulumi.getter(name="licenseType")
    def license_type(self) -> Optional[pulumi.Input[str]]:
        """
        New customer will only be on aggregate bandwidth licensing. String length must exceed 1 characters. Default: `"FWAAS-AGGREGATE"`.
        """
        return pulumi.get(self, "license_type")

    @license_type.setter
    def license_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "license_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def protocol(self) -> Optional[pulumi.Input['RemoteNetworkProtocolArgs']]:
        """
        setup the protocol when ecmp*load*balancing is disable.
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: Optional[pulumi.Input['RemoteNetworkProtocolArgs']]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The Region param. String length must exceed 1 characters.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="secondaryIpsecTunnel")
    def secondary_ipsec_tunnel(self) -> Optional[pulumi.Input[str]]:
        """
        specify secondary ipsec_tunnel if needed.
        """
        return pulumi.get(self, "secondary_ipsec_tunnel")

    @secondary_ipsec_tunnel.setter
    def secondary_ipsec_tunnel(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secondary_ipsec_tunnel", value)

    @property
    @pulumi.getter(name="spnName")
    def spn_name(self) -> Optional[pulumi.Input[str]]:
        """
        spn-name is needed when license_type is FWAAS-AGGREGATE.
        """
        return pulumi.get(self, "spn_name")

    @spn_name.setter
    def spn_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "spn_name", value)

    @property
    @pulumi.getter
    def subnets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The Subnets param.
        """
        return pulumi.get(self, "subnets")

    @subnets.setter
    def subnets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "subnets", value)

    @property
    @pulumi.getter
    def tfid(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "tfid")

    @tfid.setter
    def tfid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tfid", value)


class RemoteNetwork(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ecmp_load_balancing: Optional[pulumi.Input[str]] = None,
                 ecmp_tunnels: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RemoteNetworkEcmpTunnelArgs', 'RemoteNetworkEcmpTunnelArgsDict']]]]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 ipsec_tunnel: Optional[pulumi.Input[str]] = None,
                 license_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 protocol: Optional[pulumi.Input[Union['RemoteNetworkProtocolArgs', 'RemoteNetworkProtocolArgsDict']]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 secondary_ipsec_tunnel: Optional[pulumi.Input[str]] = None,
                 spn_name: Optional[pulumi.Input[str]] = None,
                 subnets: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.RemoteNetwork("example")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ecmp_load_balancing: The EcmpLoadBalancing param. String must be one of these: `"enable"`, `"disable"`. Default: `"disable"`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['RemoteNetworkEcmpTunnelArgs', 'RemoteNetworkEcmpTunnelArgsDict']]]] ecmp_tunnels: ecmp*tunnels is required when ecmp*load*balancing is enable.
        :param pulumi.Input[str] folder: The Folder param. String can either be a specific string(`"Remote Networks"`) or match this regex: `^[\\s0-9a-zA-Z._-]{1,}$`. Default: `"Remote Networks"`.
        :param pulumi.Input[str] ipsec_tunnel: ipsec*tunnel is required when ecmp*load_balancing is disable.
        :param pulumi.Input[str] license_type: New customer will only be on aggregate bandwidth licensing. String length must exceed 1 characters. Default: `"FWAAS-AGGREGATE"`.
        :param pulumi.Input[str] name: Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
        :param pulumi.Input[Union['RemoteNetworkProtocolArgs', 'RemoteNetworkProtocolArgsDict']] protocol: setup the protocol when ecmp*load*balancing is disable.
        :param pulumi.Input[str] region: The Region param. String length must exceed 1 characters.
        :param pulumi.Input[str] secondary_ipsec_tunnel: specify secondary ipsec_tunnel if needed.
        :param pulumi.Input[str] spn_name: spn-name is needed when license_type is FWAAS-AGGREGATE.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnets: The Subnets param.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RemoteNetworkArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.RemoteNetwork("example")
        ```

        :param str resource_name: The name of the resource.
        :param RemoteNetworkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RemoteNetworkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ecmp_load_balancing: Optional[pulumi.Input[str]] = None,
                 ecmp_tunnels: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RemoteNetworkEcmpTunnelArgs', 'RemoteNetworkEcmpTunnelArgsDict']]]]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 ipsec_tunnel: Optional[pulumi.Input[str]] = None,
                 license_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 protocol: Optional[pulumi.Input[Union['RemoteNetworkProtocolArgs', 'RemoteNetworkProtocolArgsDict']]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 secondary_ipsec_tunnel: Optional[pulumi.Input[str]] = None,
                 spn_name: Optional[pulumi.Input[str]] = None,
                 subnets: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RemoteNetworkArgs.__new__(RemoteNetworkArgs)

            __props__.__dict__["ecmp_load_balancing"] = ecmp_load_balancing
            __props__.__dict__["ecmp_tunnels"] = ecmp_tunnels
            __props__.__dict__["folder"] = folder
            __props__.__dict__["ipsec_tunnel"] = ipsec_tunnel
            __props__.__dict__["license_type"] = license_type
            __props__.__dict__["name"] = name
            __props__.__dict__["protocol"] = protocol
            if region is None and not opts.urn:
                raise TypeError("Missing required property 'region'")
            __props__.__dict__["region"] = region
            __props__.__dict__["secondary_ipsec_tunnel"] = secondary_ipsec_tunnel
            __props__.__dict__["spn_name"] = spn_name
            __props__.__dict__["subnets"] = subnets
            __props__.__dict__["encrypted_values"] = None
            __props__.__dict__["tfid"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["encryptedValues"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(RemoteNetwork, __self__).__init__(
            'scm:index/remoteNetwork:RemoteNetwork',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            ecmp_load_balancing: Optional[pulumi.Input[str]] = None,
            ecmp_tunnels: Optional[pulumi.Input[Sequence[pulumi.Input[Union['RemoteNetworkEcmpTunnelArgs', 'RemoteNetworkEcmpTunnelArgsDict']]]]] = None,
            encrypted_values: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            folder: Optional[pulumi.Input[str]] = None,
            ipsec_tunnel: Optional[pulumi.Input[str]] = None,
            license_type: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            protocol: Optional[pulumi.Input[Union['RemoteNetworkProtocolArgs', 'RemoteNetworkProtocolArgsDict']]] = None,
            region: Optional[pulumi.Input[str]] = None,
            secondary_ipsec_tunnel: Optional[pulumi.Input[str]] = None,
            spn_name: Optional[pulumi.Input[str]] = None,
            subnets: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tfid: Optional[pulumi.Input[str]] = None) -> 'RemoteNetwork':
        """
        Get an existing RemoteNetwork resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ecmp_load_balancing: The EcmpLoadBalancing param. String must be one of these: `"enable"`, `"disable"`. Default: `"disable"`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['RemoteNetworkEcmpTunnelArgs', 'RemoteNetworkEcmpTunnelArgsDict']]]] ecmp_tunnels: ecmp*tunnels is required when ecmp*load*balancing is enable.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] encrypted_values: (Internal use) Encrypted values returned from the API.
        :param pulumi.Input[str] folder: The Folder param. String can either be a specific string(`"Remote Networks"`) or match this regex: `^[\\s0-9a-zA-Z._-]{1,}$`. Default: `"Remote Networks"`.
        :param pulumi.Input[str] ipsec_tunnel: ipsec*tunnel is required when ecmp*load_balancing is disable.
        :param pulumi.Input[str] license_type: New customer will only be on aggregate bandwidth licensing. String length must exceed 1 characters. Default: `"FWAAS-AGGREGATE"`.
        :param pulumi.Input[str] name: Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
        :param pulumi.Input[Union['RemoteNetworkProtocolArgs', 'RemoteNetworkProtocolArgsDict']] protocol: setup the protocol when ecmp*load*balancing is disable.
        :param pulumi.Input[str] region: The Region param. String length must exceed 1 characters.
        :param pulumi.Input[str] secondary_ipsec_tunnel: specify secondary ipsec_tunnel if needed.
        :param pulumi.Input[str] spn_name: spn-name is needed when license_type is FWAAS-AGGREGATE.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] subnets: The Subnets param.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RemoteNetworkState.__new__(_RemoteNetworkState)

        __props__.__dict__["ecmp_load_balancing"] = ecmp_load_balancing
        __props__.__dict__["ecmp_tunnels"] = ecmp_tunnels
        __props__.__dict__["encrypted_values"] = encrypted_values
        __props__.__dict__["folder"] = folder
        __props__.__dict__["ipsec_tunnel"] = ipsec_tunnel
        __props__.__dict__["license_type"] = license_type
        __props__.__dict__["name"] = name
        __props__.__dict__["protocol"] = protocol
        __props__.__dict__["region"] = region
        __props__.__dict__["secondary_ipsec_tunnel"] = secondary_ipsec_tunnel
        __props__.__dict__["spn_name"] = spn_name
        __props__.__dict__["subnets"] = subnets
        __props__.__dict__["tfid"] = tfid
        return RemoteNetwork(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="ecmpLoadBalancing")
    def ecmp_load_balancing(self) -> pulumi.Output[str]:
        """
        The EcmpLoadBalancing param. String must be one of these: `"enable"`, `"disable"`. Default: `"disable"`.
        """
        return pulumi.get(self, "ecmp_load_balancing")

    @property
    @pulumi.getter(name="ecmpTunnels")
    def ecmp_tunnels(self) -> pulumi.Output[Optional[Sequence['outputs.RemoteNetworkEcmpTunnel']]]:
        """
        ecmp*tunnels is required when ecmp*load*balancing is enable.
        """
        return pulumi.get(self, "ecmp_tunnels")

    @property
    @pulumi.getter(name="encryptedValues")
    def encrypted_values(self) -> pulumi.Output[Mapping[str, str]]:
        """
        (Internal use) Encrypted values returned from the API.
        """
        return pulumi.get(self, "encrypted_values")

    @property
    @pulumi.getter
    def folder(self) -> pulumi.Output[str]:
        """
        The Folder param. String can either be a specific string(`"Remote Networks"`) or match this regex: `^[\\s0-9a-zA-Z._-]{1,}$`. Default: `"Remote Networks"`.
        """
        return pulumi.get(self, "folder")

    @property
    @pulumi.getter(name="ipsecTunnel")
    def ipsec_tunnel(self) -> pulumi.Output[Optional[str]]:
        """
        ipsec*tunnel is required when ecmp*load_balancing is disable.
        """
        return pulumi.get(self, "ipsec_tunnel")

    @property
    @pulumi.getter(name="licenseType")
    def license_type(self) -> pulumi.Output[str]:
        """
        New customer will only be on aggregate bandwidth licensing. String length must exceed 1 characters. Default: `"FWAAS-AGGREGATE"`.
        """
        return pulumi.get(self, "license_type")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Output[Optional['outputs.RemoteNetworkProtocol']]:
        """
        setup the protocol when ecmp*load*balancing is disable.
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The Region param. String length must exceed 1 characters.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="secondaryIpsecTunnel")
    def secondary_ipsec_tunnel(self) -> pulumi.Output[Optional[str]]:
        """
        specify secondary ipsec_tunnel if needed.
        """
        return pulumi.get(self, "secondary_ipsec_tunnel")

    @property
    @pulumi.getter(name="spnName")
    def spn_name(self) -> pulumi.Output[Optional[str]]:
        """
        spn-name is needed when license_type is FWAAS-AGGREGATE.
        """
        return pulumi.get(self, "spn_name")

    @property
    @pulumi.getter
    def subnets(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The Subnets param.
        """
        return pulumi.get(self, "subnets")

    @property
    @pulumi.getter
    def tfid(self) -> pulumi.Output[str]:
        return pulumi.get(self, "tfid")

