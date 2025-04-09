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
    'GetServiceConnectionGroupListResult',
    'AwaitableGetServiceConnectionGroupListResult',
    'get_service_connection_group_list',
    'get_service_connection_group_list_output',
]

@pulumi.output_type
class GetServiceConnectionGroupListResult:
    """
    A collection of values returned by getServiceConnectionGroupList.
    """
    def __init__(__self__, datas=None, folder=None, id=None, limit=None, name=None, offset=None, tfid=None, total=None):
        if datas and not isinstance(datas, list):
            raise TypeError("Expected argument 'datas' to be a list")
        pulumi.set(__self__, "datas", datas)
        if folder and not isinstance(folder, str):
            raise TypeError("Expected argument 'folder' to be a str")
        pulumi.set(__self__, "folder", folder)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if limit and not isinstance(limit, int):
            raise TypeError("Expected argument 'limit' to be a int")
        pulumi.set(__self__, "limit", limit)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if offset and not isinstance(offset, int):
            raise TypeError("Expected argument 'offset' to be a int")
        pulumi.set(__self__, "offset", offset)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)
        if total and not isinstance(total, int):
            raise TypeError("Expected argument 'total' to be a int")
        pulumi.set(__self__, "total", total)

    @property
    @pulumi.getter
    def datas(self) -> Sequence['outputs.GetServiceConnectionGroupListDataResult']:
        """
        The Data param.
        """
        return pulumi.get(self, "datas")

    @property
    @pulumi.getter
    def folder(self) -> builtins.str:
        """
        The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\\s-]{1,}$`. Default: `"Service Connections"`.
        """
        return pulumi.get(self, "folder")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def limit(self) -> builtins.int:
        """
        The Limit param. A limit of -1 will return all configured items. Default: `200`.
        """
        return pulumi.get(self, "limit")

    @property
    @pulumi.getter
    def name(self) -> Optional[builtins.str]:
        """
        The Name param.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def offset(self) -> builtins.int:
        """
        The Offset param. Default: `0`.
        """
        return pulumi.get(self, "offset")

    @property
    @pulumi.getter
    def tfid(self) -> builtins.str:
        return pulumi.get(self, "tfid")

    @property
    @pulumi.getter
    def total(self) -> builtins.int:
        """
        The Total param.
        """
        return pulumi.get(self, "total")


class AwaitableGetServiceConnectionGroupListResult(GetServiceConnectionGroupListResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceConnectionGroupListResult(
            datas=self.datas,
            folder=self.folder,
            id=self.id,
            limit=self.limit,
            name=self.name,
            offset=self.offset,
            tfid=self.tfid,
            total=self.total)


def get_service_connection_group_list(folder: Optional[builtins.str] = None,
                                      limit: Optional[builtins.int] = None,
                                      name: Optional[builtins.str] = None,
                                      offset: Optional[builtins.int] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceConnectionGroupListResult:
    """
    Retrieves a listing of config items.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_service_connection_group_list(folder="Service Connections")
    ```


    :param builtins.str folder: The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\\s-]{1,}$`. Default: `"Service Connections"`.
    :param builtins.int limit: The Limit param. A limit of -1 will return all configured items. Default: `200`.
    :param builtins.str name: The Name param.
    :param builtins.int offset: The Offset param. Default: `0`.
    """
    __args__ = dict()
    __args__['folder'] = folder
    __args__['limit'] = limit
    __args__['name'] = name
    __args__['offset'] = offset
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getServiceConnectionGroupList:getServiceConnectionGroupList', __args__, opts=opts, typ=GetServiceConnectionGroupListResult).value

    return AwaitableGetServiceConnectionGroupListResult(
        datas=pulumi.get(__ret__, 'datas'),
        folder=pulumi.get(__ret__, 'folder'),
        id=pulumi.get(__ret__, 'id'),
        limit=pulumi.get(__ret__, 'limit'),
        name=pulumi.get(__ret__, 'name'),
        offset=pulumi.get(__ret__, 'offset'),
        tfid=pulumi.get(__ret__, 'tfid'),
        total=pulumi.get(__ret__, 'total'))
def get_service_connection_group_list_output(folder: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                             limit: Optional[pulumi.Input[Optional[builtins.int]]] = None,
                                             name: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                                             offset: Optional[pulumi.Input[Optional[builtins.int]]] = None,
                                             opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetServiceConnectionGroupListResult]:
    """
    Retrieves a listing of config items.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_service_connection_group_list(folder="Service Connections")
    ```


    :param builtins.str folder: The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\\s-]{1,}$`. Default: `"Service Connections"`.
    :param builtins.int limit: The Limit param. A limit of -1 will return all configured items. Default: `200`.
    :param builtins.str name: The Name param.
    :param builtins.int offset: The Offset param. Default: `0`.
    """
    __args__ = dict()
    __args__['folder'] = folder
    __args__['limit'] = limit
    __args__['name'] = name
    __args__['offset'] = offset
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('scm:index/getServiceConnectionGroupList:getServiceConnectionGroupList', __args__, opts=opts, typ=GetServiceConnectionGroupListResult)
    return __ret__.apply(lambda __response__: GetServiceConnectionGroupListResult(
        datas=pulumi.get(__response__, 'datas'),
        folder=pulumi.get(__response__, 'folder'),
        id=pulumi.get(__response__, 'id'),
        limit=pulumi.get(__response__, 'limit'),
        name=pulumi.get(__response__, 'name'),
        offset=pulumi.get(__response__, 'offset'),
        tfid=pulumi.get(__response__, 'tfid'),
        total=pulumi.get(__response__, 'total')))
