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
from . import outputs

__all__ = [
    'GetQosProfileResult',
    'AwaitableGetQosProfileResult',
    'get_qos_profile',
    'get_qos_profile_output',
]

@pulumi.output_type
class GetQosProfileResult:
    """
    A collection of values returned by getQosProfile.
    """
    def __init__(__self__, aggregate_bandwidth=None, class_bandwidth_type=None, folder=None, id=None, name=None, tfid=None):
        if aggregate_bandwidth and not isinstance(aggregate_bandwidth, dict):
            raise TypeError("Expected argument 'aggregate_bandwidth' to be a dict")
        pulumi.set(__self__, "aggregate_bandwidth", aggregate_bandwidth)
        if class_bandwidth_type and not isinstance(class_bandwidth_type, dict):
            raise TypeError("Expected argument 'class_bandwidth_type' to be a dict")
        pulumi.set(__self__, "class_bandwidth_type", class_bandwidth_type)
        if folder and not isinstance(folder, str):
            raise TypeError("Expected argument 'folder' to be a str")
        pulumi.set(__self__, "folder", folder)
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
    @pulumi.getter(name="aggregateBandwidth")
    def aggregate_bandwidth(self) -> 'outputs.GetQosProfileAggregateBandwidthResult':
        """
        The AggregateBandwidth param.
        """
        return pulumi.get(self, "aggregate_bandwidth")

    @property
    @pulumi.getter(name="classBandwidthType")
    def class_bandwidth_type(self) -> 'outputs.GetQosProfileClassBandwidthTypeResult':
        """
        The ClassBandwidthType param.
        """
        return pulumi.get(self, "class_bandwidth_type")

    @property
    @pulumi.getter
    def folder(self) -> Optional[builtins.str]:
        """
        The Folder param.
        """
        return pulumi.get(self, "folder")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The Id param.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tfid(self) -> builtins.str:
        return pulumi.get(self, "tfid")


class AwaitableGetQosProfileResult(GetQosProfileResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetQosProfileResult(
            aggregate_bandwidth=self.aggregate_bandwidth,
            class_bandwidth_type=self.class_bandwidth_type,
            folder=self.folder,
            id=self.id,
            name=self.name,
            tfid=self.tfid)


def get_qos_profile(folder: Optional[builtins.str] = None,
                    id: Optional[builtins.str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetQosProfileResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_qos_profile(id="1234-56-789")
    ```


    :param builtins.str folder: The Folder param.
    :param builtins.str id: The Id param.
    """
    __args__ = dict()
    __args__['folder'] = folder
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getQosProfile:getQosProfile', __args__, opts=opts, typ=GetQosProfileResult).value

    return AwaitableGetQosProfileResult(
        aggregate_bandwidth=pulumi.get(__ret__, 'aggregate_bandwidth'),
        class_bandwidth_type=pulumi.get(__ret__, 'class_bandwidth_type'),
        folder=pulumi.get(__ret__, 'folder'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        tfid=pulumi.get(__ret__, 'tfid'))
def get_qos_profile_output(folder: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                           id: Optional[pulumi.Input[builtins.str]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetQosProfileResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_qos_profile(id="1234-56-789")
    ```


    :param builtins.str folder: The Folder param.
    :param builtins.str id: The Id param.
    """
    __args__ = dict()
    __args__['folder'] = folder
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('scm:index/getQosProfile:getQosProfile', __args__, opts=opts, typ=GetQosProfileResult)
    return __ret__.apply(lambda __response__: GetQosProfileResult(
        aggregate_bandwidth=pulumi.get(__response__, 'aggregate_bandwidth'),
        class_bandwidth_type=pulumi.get(__response__, 'class_bandwidth_type'),
        folder=pulumi.get(__response__, 'folder'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        tfid=pulumi.get(__response__, 'tfid')))
