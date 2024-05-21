# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetKerberosServerProfileListResult',
    'AwaitableGetKerberosServerProfileListResult',
    'get_kerberos_server_profile_list',
    'get_kerberos_server_profile_list_output',
]

@pulumi.output_type
class GetKerberosServerProfileListResult:
    """
    A collection of values returned by getKerberosServerProfileList.
    """
    def __init__(__self__, datas=None, device=None, folder=None, id=None, limit=None, name=None, offset=None, snippet=None, tfid=None, total=None):
        if datas and not isinstance(datas, list):
            raise TypeError("Expected argument 'datas' to be a list")
        pulumi.set(__self__, "datas", datas)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
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
        if snippet and not isinstance(snippet, str):
            raise TypeError("Expected argument 'snippet' to be a str")
        pulumi.set(__self__, "snippet", snippet)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)
        if total and not isinstance(total, int):
            raise TypeError("Expected argument 'total' to be a int")
        pulumi.set(__self__, "total", total)

    @property
    @pulumi.getter
    def datas(self) -> Sequence['outputs.GetKerberosServerProfileListDataResult']:
        """
        The Data param.
        """
        return pulumi.get(self, "datas")

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
    def total(self) -> int:
        """
        The Total param.
        """
        return pulumi.get(self, "total")


class AwaitableGetKerberosServerProfileListResult(GetKerberosServerProfileListResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetKerberosServerProfileListResult(
            datas=self.datas,
            device=self.device,
            folder=self.folder,
            id=self.id,
            limit=self.limit,
            name=self.name,
            offset=self.offset,
            snippet=self.snippet,
            tfid=self.tfid,
            total=self.total)


def get_kerberos_server_profile_list(device: Optional[str] = None,
                                     folder: Optional[str] = None,
                                     limit: Optional[int] = None,
                                     name: Optional[str] = None,
                                     offset: Optional[int] = None,
                                     snippet: Optional[str] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetKerberosServerProfileListResult:
    """
    Retrieves a listing of config items.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_kerberos_server_profile_list(folder="Shared")
    ```


    :param str device: The Device param.
    :param str folder: The Folder param.
    :param int limit: The Limit param. A limit of -1 will return all configured items. Default: `200`.
    :param str name: The Name param.
    :param int offset: The Offset param. Default: `0`.
    :param str snippet: The Snippet param.
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['folder'] = folder
    __args__['limit'] = limit
    __args__['name'] = name
    __args__['offset'] = offset
    __args__['snippet'] = snippet
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getKerberosServerProfileList:getKerberosServerProfileList', __args__, opts=opts, typ=GetKerberosServerProfileListResult).value

    return AwaitableGetKerberosServerProfileListResult(
        datas=pulumi.get(__ret__, 'datas'),
        device=pulumi.get(__ret__, 'device'),
        folder=pulumi.get(__ret__, 'folder'),
        id=pulumi.get(__ret__, 'id'),
        limit=pulumi.get(__ret__, 'limit'),
        name=pulumi.get(__ret__, 'name'),
        offset=pulumi.get(__ret__, 'offset'),
        snippet=pulumi.get(__ret__, 'snippet'),
        tfid=pulumi.get(__ret__, 'tfid'),
        total=pulumi.get(__ret__, 'total'))


@_utilities.lift_output_func(get_kerberos_server_profile_list)
def get_kerberos_server_profile_list_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                                            folder: Optional[pulumi.Input[Optional[str]]] = None,
                                            limit: Optional[pulumi.Input[Optional[int]]] = None,
                                            name: Optional[pulumi.Input[Optional[str]]] = None,
                                            offset: Optional[pulumi.Input[Optional[int]]] = None,
                                            snippet: Optional[pulumi.Input[Optional[str]]] = None,
                                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetKerberosServerProfileListResult]:
    """
    Retrieves a listing of config items.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_kerberos_server_profile_list(folder="Shared")
    ```


    :param str device: The Device param.
    :param str folder: The Folder param.
    :param int limit: The Limit param. A limit of -1 will return all configured items. Default: `200`.
    :param str name: The Name param.
    :param int offset: The Offset param. Default: `0`.
    :param str snippet: The Snippet param.
    """
    ...
