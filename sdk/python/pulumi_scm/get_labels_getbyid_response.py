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

__all__ = [
    'GetLabelsGetbyidResponseResult',
    'AwaitableGetLabelsGetbyidResponseResult',
    'get_labels_getbyid_response',
    'get_labels_getbyid_response_output',
]

@pulumi.output_type
class GetLabelsGetbyidResponseResult:
    """
    A collection of values returned by getLabelsGetbyidResponse.
    """
    def __init__(__self__, description=None, folders=None, id=None, name=None, snippets=None, tfid=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if folders and not isinstance(folders, list):
            raise TypeError("Expected argument 'folders' to be a list")
        pulumi.set(__self__, "folders", folders)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if snippets and not isinstance(snippets, list):
            raise TypeError("Expected argument 'snippets' to be a list")
        pulumi.set(__self__, "snippets", snippets)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The Description param.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def folders(self) -> Sequence[str]:
        """
        The Folders param.
        """
        return pulumi.get(self, "folders")

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
        The Name param.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def snippets(self) -> Sequence[str]:
        """
        The Snippets param.
        """
        return pulumi.get(self, "snippets")

    @property
    @pulumi.getter
    def tfid(self) -> str:
        return pulumi.get(self, "tfid")


class AwaitableGetLabelsGetbyidResponseResult(GetLabelsGetbyidResponseResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetLabelsGetbyidResponseResult(
            description=self.description,
            folders=self.folders,
            id=self.id,
            name=self.name,
            snippets=self.snippets,
            tfid=self.tfid)


def get_labels_getbyid_response(id: Optional[str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetLabelsGetbyidResponseResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_labels_getbyid_response(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getLabelsGetbyidResponse:getLabelsGetbyidResponse', __args__, opts=opts, typ=GetLabelsGetbyidResponseResult).value

    return AwaitableGetLabelsGetbyidResponseResult(
        description=pulumi.get(__ret__, 'description'),
        folders=pulumi.get(__ret__, 'folders'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        snippets=pulumi.get(__ret__, 'snippets'),
        tfid=pulumi.get(__ret__, 'tfid'))
def get_labels_getbyid_response_output(id: Optional[pulumi.Input[str]] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetLabelsGetbyidResponseResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_labels_getbyid_response(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('scm:index/getLabelsGetbyidResponse:getLabelsGetbyidResponse', __args__, opts=opts, typ=GetLabelsGetbyidResponseResult)
    return __ret__.apply(lambda __response__: GetLabelsGetbyidResponseResult(
        description=pulumi.get(__response__, 'description'),
        folders=pulumi.get(__response__, 'folders'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        snippets=pulumi.get(__response__, 'snippets'),
        tfid=pulumi.get(__response__, 'tfid')))
