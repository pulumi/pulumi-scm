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
    'GetSharedInfrastructureSettingsListResult',
    'AwaitableGetSharedInfrastructureSettingsListResult',
    'get_shared_infrastructure_settings_list',
    'get_shared_infrastructure_settings_list_output',
]

@pulumi.output_type
class GetSharedInfrastructureSettingsListResult:
    """
    A collection of values returned by getSharedInfrastructureSettingsList.
    """
    def __init__(__self__, datas=None, id=None, limit=None, offset=None, tfid=None, total=None):
        if datas and not isinstance(datas, list):
            raise TypeError("Expected argument 'datas' to be a list")
        pulumi.set(__self__, "datas", datas)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if limit and not isinstance(limit, int):
            raise TypeError("Expected argument 'limit' to be a int")
        pulumi.set(__self__, "limit", limit)
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
    def datas(self) -> Sequence['outputs.GetSharedInfrastructureSettingsListDataResult']:
        """
        The Data param.
        """
        return pulumi.get(self, "datas")

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


class AwaitableGetSharedInfrastructureSettingsListResult(GetSharedInfrastructureSettingsListResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSharedInfrastructureSettingsListResult(
            datas=self.datas,
            id=self.id,
            limit=self.limit,
            offset=self.offset,
            tfid=self.tfid,
            total=self.total)


def get_shared_infrastructure_settings_list(limit: Optional[builtins.int] = None,
                                            offset: Optional[builtins.int] = None,
                                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSharedInfrastructureSettingsListResult:
    """
    Retrieves a listing of config items.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_shared_infrastructure_settings_list()
    ```


    :param builtins.int limit: The Limit param. A limit of -1 will return all configured items. Default: `200`.
    :param builtins.int offset: The Offset param. Default: `0`.
    """
    __args__ = dict()
    __args__['limit'] = limit
    __args__['offset'] = offset
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getSharedInfrastructureSettingsList:getSharedInfrastructureSettingsList', __args__, opts=opts, typ=GetSharedInfrastructureSettingsListResult).value

    return AwaitableGetSharedInfrastructureSettingsListResult(
        datas=pulumi.get(__ret__, 'datas'),
        id=pulumi.get(__ret__, 'id'),
        limit=pulumi.get(__ret__, 'limit'),
        offset=pulumi.get(__ret__, 'offset'),
        tfid=pulumi.get(__ret__, 'tfid'),
        total=pulumi.get(__ret__, 'total'))
def get_shared_infrastructure_settings_list_output(limit: Optional[pulumi.Input[Optional[builtins.int]]] = None,
                                                   offset: Optional[pulumi.Input[Optional[builtins.int]]] = None,
                                                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSharedInfrastructureSettingsListResult]:
    """
    Retrieves a listing of config items.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_shared_infrastructure_settings_list()
    ```


    :param builtins.int limit: The Limit param. A limit of -1 will return all configured items. Default: `200`.
    :param builtins.int offset: The Offset param. Default: `0`.
    """
    __args__ = dict()
    __args__['limit'] = limit
    __args__['offset'] = offset
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('scm:index/getSharedInfrastructureSettingsList:getSharedInfrastructureSettingsList', __args__, opts=opts, typ=GetSharedInfrastructureSettingsListResult)
    return __ret__.apply(lambda __response__: GetSharedInfrastructureSettingsListResult(
        datas=pulumi.get(__response__, 'datas'),
        id=pulumi.get(__response__, 'id'),
        limit=pulumi.get(__response__, 'limit'),
        offset=pulumi.get(__response__, 'offset'),
        tfid=pulumi.get(__response__, 'tfid'),
        total=pulumi.get(__response__, 'total')))
