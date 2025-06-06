# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
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
    'GetTagResult',
    'AwaitableGetTagResult',
    'get_tag',
    'get_tag_output',
]

@pulumi.output_type
class GetTagResult:
    """
    A collection of values returned by getTag.
    """
    def __init__(__self__, color=None, comments=None, id=None, name=None, tfid=None):
        if color and not isinstance(color, str):
            raise TypeError("Expected argument 'color' to be a str")
        pulumi.set(__self__, "color", color)
        if comments and not isinstance(comments, str):
            raise TypeError("Expected argument 'comments' to be a str")
        pulumi.set(__self__, "comments", comments)
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
    @pulumi.getter
    def color(self) -> builtins.str:
        """
        The Color param. String must be one of these: `"Red"`, `"Green"`, `"Blue"`, `"Yellow"`, `"Copper"`, `"Orange"`, `"Purple"`, `"Gray"`, `"Light Green"`, `"Cyan"`, `"Light Gray"`, `"Blue Gray"`, `"Lime"`, `"Black"`, `"Gold"`, `"Brown"`, `"Olive"`, `"Maroon"`, `"Red-Orange"`, `"Yellow-Orange"`, `"Forest Green"`, `"Turquoise Blue"`, `"Azure Blue"`, `"Cerulean Blue"`, `"Midnight Blue"`, `"Medium Blue"`, `"Cobalt Blue"`, `"Violet Blue"`, `"Blue Violet"`, `"Medium Violet"`, `"Medium Rose"`, `"Lavender"`, `"Orchid"`, `"Thistle"`, `"Peach"`, `"Salmon"`, `"Magenta"`, `"Red Violet"`, `"Mahogany"`, `"Burnt Sienna"`, `"Chestnut"`.
        """
        return pulumi.get(self, "color")

    @property
    @pulumi.getter
    def comments(self) -> builtins.str:
        """
        The Comments param. String length must not exceed 1023 characters.
        """
        return pulumi.get(self, "comments")

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
        The Name param. String length must not exceed 127 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tfid(self) -> builtins.str:
        return pulumi.get(self, "tfid")


class AwaitableGetTagResult(GetTagResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTagResult(
            color=self.color,
            comments=self.comments,
            id=self.id,
            name=self.name,
            tfid=self.tfid)


def get_tag(id: Optional[builtins.str] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTagResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_tag(id="1234-56-789")
    ```


    :param builtins.str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getTag:getTag', __args__, opts=opts, typ=GetTagResult).value

    return AwaitableGetTagResult(
        color=pulumi.get(__ret__, 'color'),
        comments=pulumi.get(__ret__, 'comments'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        tfid=pulumi.get(__ret__, 'tfid'))
def get_tag_output(id: Optional[pulumi.Input[builtins.str]] = None,
                   opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetTagResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_tag(id="1234-56-789")
    ```


    :param builtins.str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('scm:index/getTag:getTag', __args__, opts=opts, typ=GetTagResult)
    return __ret__.apply(lambda __response__: GetTagResult(
        color=pulumi.get(__response__, 'color'),
        comments=pulumi.get(__response__, 'comments'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        tfid=pulumi.get(__response__, 'tfid')))
