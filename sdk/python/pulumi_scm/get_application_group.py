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
    'GetApplicationGroupResult',
    'AwaitableGetApplicationGroupResult',
    'get_application_group',
    'get_application_group_output',
]

@pulumi.output_type
class GetApplicationGroupResult:
    """
    A collection of values returned by getApplicationGroup.
    """
    def __init__(__self__, id=None, members=None, name=None, tfid=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if members and not isinstance(members, list):
            raise TypeError("Expected argument 'members' to be a list")
        pulumi.set(__self__, "members", members)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The Id param.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def members(self) -> Sequence[str]:
        """
        The Members param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "members")

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


class AwaitableGetApplicationGroupResult(GetApplicationGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetApplicationGroupResult(
            id=self.id,
            members=self.members,
            name=self.name,
            tfid=self.tfid)


def get_application_group(id: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetApplicationGroupResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_application_group(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getApplicationGroup:getApplicationGroup', __args__, opts=opts, typ=GetApplicationGroupResult).value

    return AwaitableGetApplicationGroupResult(
        id=pulumi.get(__ret__, 'id'),
        members=pulumi.get(__ret__, 'members'),
        name=pulumi.get(__ret__, 'name'),
        tfid=pulumi.get(__ret__, 'tfid'))


@_utilities.lift_output_func(get_application_group)
def get_application_group_output(id: Optional[pulumi.Input[str]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetApplicationGroupResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_application_group(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    ...
