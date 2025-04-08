# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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

__all__ = [
    'GetServiceGroupResult',
    'AwaitableGetServiceGroupResult',
    'get_service_group',
    'get_service_group_output',
]

@pulumi.output_type
class GetServiceGroupResult:
    """
    A collection of values returned by getServiceGroup.
    """
    def __init__(__self__, id=None, members=None, name=None, tags=None, tfid=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if members and not isinstance(members, list):
            raise TypeError("Expected argument 'members' to be a list")
        pulumi.set(__self__, "members", members)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The Id param.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def members(self) -> Sequence[builtins.str]:
        """
        The Members param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "members")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[builtins.str]:
        """
        Tags for service group object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def tfid(self) -> builtins.str:
        return pulumi.get(self, "tfid")


class AwaitableGetServiceGroupResult(GetServiceGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceGroupResult(
            id=self.id,
            members=self.members,
            name=self.name,
            tags=self.tags,
            tfid=self.tfid)


def get_service_group(id: Optional[builtins.str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceGroupResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_service_group(id="1234-56-789")
    ```


    :param builtins.str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getServiceGroup:getServiceGroup', __args__, opts=opts, typ=GetServiceGroupResult).value

    return AwaitableGetServiceGroupResult(
        id=pulumi.get(__ret__, 'id'),
        members=pulumi.get(__ret__, 'members'),
        name=pulumi.get(__ret__, 'name'),
        tags=pulumi.get(__ret__, 'tags'),
        tfid=pulumi.get(__ret__, 'tfid'))
def get_service_group_output(id: Optional[pulumi.Input[builtins.str]] = None,
                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetServiceGroupResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_service_group(id="1234-56-789")
    ```


    :param builtins.str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('scm:index/getServiceGroup:getServiceGroup', __args__, opts=opts, typ=GetServiceGroupResult)
    return __ret__.apply(lambda __response__: GetServiceGroupResult(
        id=pulumi.get(__response__, 'id'),
        members=pulumi.get(__response__, 'members'),
        name=pulumi.get(__response__, 'name'),
        tags=pulumi.get(__response__, 'tags'),
        tfid=pulumi.get(__response__, 'tfid')))
