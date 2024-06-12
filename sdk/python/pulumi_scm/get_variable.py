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
    'GetVariableResult',
    'AwaitableGetVariableResult',
    'get_variable',
    'get_variable_output',
]

@pulumi.output_type
class GetVariableResult:
    """
    A collection of values returned by getVariable.
    """
    def __init__(__self__, description=None, device=None, folder=None, id=None, name=None, overridden=None, snippet=None, tfid=None, type=None, value=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if folder and not isinstance(folder, str):
            raise TypeError("Expected argument 'folder' to be a str")
        pulumi.set(__self__, "folder", folder)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if overridden and not isinstance(overridden, bool):
            raise TypeError("Expected argument 'overridden' to be a bool")
        pulumi.set(__self__, "overridden", overridden)
        if snippet and not isinstance(snippet, str):
            raise TypeError("Expected argument 'snippet' to be a str")
        pulumi.set(__self__, "snippet", snippet)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if value and not isinstance(value, str):
            raise TypeError("Expected argument 'value' to be a str")
        pulumi.set(__self__, "value", value)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The Description param.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def folder(self) -> Optional[str]:
        """
        The Folder param.
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
    @pulumi.getter
    def name(self) -> str:
        """
        Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def overridden(self) -> bool:
        """
        The Overridden param.
        """
        return pulumi.get(self, "overridden")

    @property
    @pulumi.getter
    def snippet(self) -> Optional[str]:
        """
        The Snippet param.
        """
        return pulumi.get(self, "snippet")

    @property
    @pulumi.getter
    def tfid(self) -> str:
        return pulumi.get(self, "tfid")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The Type param. String must be one of these: `"percent"`, `"count"`, `"ip-netmask"`, `"zone"`, `"ip-range"`, `"ip-wildcard"`, `"device-priority"`, `"device-id"`, `"egress-max"`, `"as-number"`, `"fqdn"`, `"port"`, `"link-tag"`, `"group-id"`, `"rate"`, `"router-id"`, `"qos-profile"`, `"timer"`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def value(self) -> str:
        """
        value can accept either string or integer.
        """
        return pulumi.get(self, "value")


class AwaitableGetVariableResult(GetVariableResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetVariableResult(
            description=self.description,
            device=self.device,
            folder=self.folder,
            id=self.id,
            name=self.name,
            overridden=self.overridden,
            snippet=self.snippet,
            tfid=self.tfid,
            type=self.type,
            value=self.value)


def get_variable(device: Optional[str] = None,
                 folder: Optional[str] = None,
                 id: Optional[str] = None,
                 snippet: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetVariableResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_variable(id="1234-56-789")
    ```


    :param str device: The Device param.
    :param str folder: The Folder param.
    :param str id: The Id param.
    :param str snippet: The Snippet param.
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['folder'] = folder
    __args__['id'] = id
    __args__['snippet'] = snippet
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getVariable:getVariable', __args__, opts=opts, typ=GetVariableResult).value

    return AwaitableGetVariableResult(
        description=pulumi.get(__ret__, 'description'),
        device=pulumi.get(__ret__, 'device'),
        folder=pulumi.get(__ret__, 'folder'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        overridden=pulumi.get(__ret__, 'overridden'),
        snippet=pulumi.get(__ret__, 'snippet'),
        tfid=pulumi.get(__ret__, 'tfid'),
        type=pulumi.get(__ret__, 'type'),
        value=pulumi.get(__ret__, 'value'))


@_utilities.lift_output_func(get_variable)
def get_variable_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                        folder: Optional[pulumi.Input[Optional[str]]] = None,
                        id: Optional[pulumi.Input[str]] = None,
                        snippet: Optional[pulumi.Input[Optional[str]]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetVariableResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_variable(id="1234-56-789")
    ```


    :param str device: The Device param.
    :param str folder: The Folder param.
    :param str id: The Id param.
    :param str snippet: The Snippet param.
    """
    ...