# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAddressObjectResult',
    'AwaitableGetAddressObjectResult',
    'get_address_object',
    'get_address_object_output',
]

@pulumi.output_type
class GetAddressObjectResult:
    """
    A collection of values returned by getAddressObject.
    """
    def __init__(__self__, description=None, fqdn=None, id=None, ip_netmask=None, ip_range=None, ip_wildcard=None, name=None, tags=None, tfid=None, type=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if fqdn and not isinstance(fqdn, str):
            raise TypeError("Expected argument 'fqdn' to be a str")
        pulumi.set(__self__, "fqdn", fqdn)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if ip_netmask and not isinstance(ip_netmask, str):
            raise TypeError("Expected argument 'ip_netmask' to be a str")
        pulumi.set(__self__, "ip_netmask", ip_netmask)
        if ip_range and not isinstance(ip_range, str):
            raise TypeError("Expected argument 'ip_range' to be a str")
        pulumi.set(__self__, "ip_range", ip_range)
        if ip_wildcard and not isinstance(ip_wildcard, str):
            raise TypeError("Expected argument 'ip_wildcard' to be a str")
        pulumi.set(__self__, "ip_wildcard", ip_wildcard)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The Description param. String length must not exceed 1023 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def fqdn(self) -> str:
        """
        The Fqdn param. String length must be between 1 and 255 characters. String validation regex: `^a-zA-Z0-9_+[a-zA-Z0-9]$`.
        """
        return pulumi.get(self, "fqdn")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The Id param.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="ipNetmask")
    def ip_netmask(self) -> str:
        """
        The IpNetmask param.
        """
        return pulumi.get(self, "ip_netmask")

    @property
    @pulumi.getter(name="ipRange")
    def ip_range(self) -> str:
        """
        The IpRange param.
        """
        return pulumi.get(self, "ip_range")

    @property
    @pulumi.getter(name="ipWildcard")
    def ip_wildcard(self) -> str:
        """
        The IpWildcard param.
        """
        return pulumi.get(self, "ip_wildcard")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        Tags for address object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def tfid(self) -> str:
        return pulumi.get(self, "tfid")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The Type param.
        """
        return pulumi.get(self, "type")


class AwaitableGetAddressObjectResult(GetAddressObjectResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAddressObjectResult(
            description=self.description,
            fqdn=self.fqdn,
            id=self.id,
            ip_netmask=self.ip_netmask,
            ip_range=self.ip_range,
            ip_wildcard=self.ip_wildcard,
            name=self.name,
            tags=self.tags,
            tfid=self.tfid,
            type=self.type)


def get_address_object(id: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAddressObjectResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_address_object(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getAddressObject:getAddressObject', __args__, opts=opts, typ=GetAddressObjectResult).value

    return AwaitableGetAddressObjectResult(
        description=pulumi.get(__ret__, 'description'),
        fqdn=pulumi.get(__ret__, 'fqdn'),
        id=pulumi.get(__ret__, 'id'),
        ip_netmask=pulumi.get(__ret__, 'ip_netmask'),
        ip_range=pulumi.get(__ret__, 'ip_range'),
        ip_wildcard=pulumi.get(__ret__, 'ip_wildcard'),
        name=pulumi.get(__ret__, 'name'),
        tags=pulumi.get(__ret__, 'tags'),
        tfid=pulumi.get(__ret__, 'tfid'),
        type=pulumi.get(__ret__, 'type'))


@_utilities.lift_output_func(get_address_object)
def get_address_object_output(id: Optional[pulumi.Input[str]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAddressObjectResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_address_object(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    ...
