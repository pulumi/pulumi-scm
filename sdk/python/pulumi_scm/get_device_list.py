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
    'GetDeviceListResult',
    'AwaitableGetDeviceListResult',
    'get_device_list',
    'get_device_list_output',
]

@pulumi.output_type
class GetDeviceListResult:
    """
    A collection of values returned by getDeviceList.
    """
    def __init__(__self__, datas=None, id=None, limit=None, name=None, offset=None, tfid=None, total=None):
        if datas and not isinstance(datas, list):
            raise TypeError("Expected argument 'datas' to be a list")
        pulumi.set(__self__, "datas", datas)
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
    def datas(self) -> Sequence['outputs.GetDeviceListDataResult']:
        """
        The Data param.
        """
        return pulumi.get(self, "datas")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def limit(self) -> int:
        """
        The Limit param. A limit of -1 will return all configured items. Default: `200`.
        """
        return pulumi.get(self, "limit")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        The Name param.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def offset(self) -> int:
        """
        The Offset param. Default: `0`.
        """
        return pulumi.get(self, "offset")

    @property
    @pulumi.getter
    def tfid(self) -> str:
        return pulumi.get(self, "tfid")

    @property
    @pulumi.getter
    def total(self) -> int:
        """
        The Total param.
        """
        return pulumi.get(self, "total")


class AwaitableGetDeviceListResult(GetDeviceListResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDeviceListResult(
            datas=self.datas,
            id=self.id,
            limit=self.limit,
            name=self.name,
            offset=self.offset,
            tfid=self.tfid,
            total=self.total)


def get_device_list(limit: Optional[int] = None,
                    name: Optional[str] = None,
                    offset: Optional[int] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDeviceListResult:
    """
    Retrieves a listing of config items.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_device_list()
    ```


    :param int limit: The Limit param. A limit of -1 will return all configured items. Default: `200`.
    :param str name: The Name param.
    :param int offset: The Offset param. Default: `0`.
    """
    __args__ = dict()
    __args__['limit'] = limit
    __args__['name'] = name
    __args__['offset'] = offset
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getDeviceList:getDeviceList', __args__, opts=opts, typ=GetDeviceListResult).value

    return AwaitableGetDeviceListResult(
        datas=pulumi.get(__ret__, 'datas'),
        id=pulumi.get(__ret__, 'id'),
        limit=pulumi.get(__ret__, 'limit'),
        name=pulumi.get(__ret__, 'name'),
        offset=pulumi.get(__ret__, 'offset'),
        tfid=pulumi.get(__ret__, 'tfid'),
        total=pulumi.get(__ret__, 'total'))
def get_device_list_output(limit: Optional[pulumi.Input[Optional[int]]] = None,
                           name: Optional[pulumi.Input[Optional[str]]] = None,
                           offset: Optional[pulumi.Input[Optional[int]]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDeviceListResult]:
    """
    Retrieves a listing of config items.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_device_list()
    ```


    :param int limit: The Limit param. A limit of -1 will return all configured items. Default: `200`.
    :param str name: The Name param.
    :param int offset: The Offset param. Default: `0`.
    """
    __args__ = dict()
    __args__['limit'] = limit
    __args__['name'] = name
    __args__['offset'] = offset
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('scm:index/getDeviceList:getDeviceList', __args__, opts=opts, typ=GetDeviceListResult)
    return __ret__.apply(lambda __response__: GetDeviceListResult(
        datas=pulumi.get(__response__, 'datas'),
        id=pulumi.get(__response__, 'id'),
        limit=pulumi.get(__response__, 'limit'),
        name=pulumi.get(__response__, 'name'),
        offset=pulumi.get(__response__, 'offset'),
        tfid=pulumi.get(__response__, 'tfid'),
        total=pulumi.get(__response__, 'total')))
