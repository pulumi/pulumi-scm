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
    'GetRegionResult',
    'AwaitableGetRegionResult',
    'get_region',
    'get_region_output',
]

@pulumi.output_type
class GetRegionResult:
    """
    A collection of values returned by getRegion.
    """
    def __init__(__self__, addresses=None, geo_location=None, id=None, name=None, tfid=None):
        if addresses and not isinstance(addresses, list):
            raise TypeError("Expected argument 'addresses' to be a list")
        pulumi.set(__self__, "addresses", addresses)
        if geo_location and not isinstance(geo_location, dict):
            raise TypeError("Expected argument 'geo_location' to be a dict")
        pulumi.set(__self__, "geo_location", geo_location)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)

    @property
    @pulumi.getter
    def addresses(self) -> Sequence[str]:
        """
        The Addresses param.
        """
        return pulumi.get(self, "addresses")

    @property
    @pulumi.getter(name="geoLocation")
    def geo_location(self) -> 'outputs.GetRegionGeoLocationResult':
        """
        The GeoLocation param.
        """
        return pulumi.get(self, "geo_location")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The Id param.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tfid(self) -> str:
        return pulumi.get(self, "tfid")


class AwaitableGetRegionResult(GetRegionResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRegionResult(
            addresses=self.addresses,
            geo_location=self.geo_location,
            id=self.id,
            name=self.name,
            tfid=self.tfid)


def get_region(id: Optional[str] = None,
               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRegionResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_region(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getRegion:getRegion', __args__, opts=opts, typ=GetRegionResult).value

    return AwaitableGetRegionResult(
        addresses=pulumi.get(__ret__, 'addresses'),
        geo_location=pulumi.get(__ret__, 'geo_location'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        tfid=pulumi.get(__ret__, 'tfid'))
def get_region_output(id: Optional[pulumi.Input[str]] = None,
                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetRegionResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_region(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('scm:index/getRegion:getRegion', __args__, opts=opts, typ=GetRegionResult)
    return __ret__.apply(lambda __response__: GetRegionResult(
        addresses=pulumi.get(__response__, 'addresses'),
        geo_location=pulumi.get(__response__, 'geo_location'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        tfid=pulumi.get(__response__, 'tfid')))
