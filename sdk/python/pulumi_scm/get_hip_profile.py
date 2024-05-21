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
    'GetHipProfileResult',
    'AwaitableGetHipProfileResult',
    'get_hip_profile',
    'get_hip_profile_output',
]

@pulumi.output_type
class GetHipProfileResult:
    """
    A collection of values returned by getHipProfile.
    """
    def __init__(__self__, description=None, id=None, match=None, name=None, tfid=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if match and not isinstance(match, str):
            raise TypeError("Expected argument 'match' to be a str")
        pulumi.set(__self__, "match", match)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The Description param. String length must not exceed 255 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The Id param.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def match(self) -> str:
        """
        The Match param. String length must not exceed 2048 characters.
        """
        return pulumi.get(self, "match")

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


class AwaitableGetHipProfileResult(GetHipProfileResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetHipProfileResult(
            description=self.description,
            id=self.id,
            match=self.match,
            name=self.name,
            tfid=self.tfid)


def get_hip_profile(id: Optional[str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetHipProfileResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_hip_profile(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getHipProfile:getHipProfile', __args__, opts=opts, typ=GetHipProfileResult).value

    return AwaitableGetHipProfileResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        match=pulumi.get(__ret__, 'match'),
        name=pulumi.get(__ret__, 'name'),
        tfid=pulumi.get(__ret__, 'tfid'))


@_utilities.lift_output_func(get_hip_profile)
def get_hip_profile_output(id: Optional[pulumi.Input[str]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetHipProfileResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_hip_profile(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    ...
