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
    'GetIpsecCryptoProfileResult',
    'AwaitableGetIpsecCryptoProfileResult',
    'get_ipsec_crypto_profile',
    'get_ipsec_crypto_profile_output',
]

@pulumi.output_type
class GetIpsecCryptoProfileResult:
    """
    A collection of values returned by getIpsecCryptoProfile.
    """
    def __init__(__self__, ah=None, device=None, dh_group=None, esp=None, folder=None, id=None, lifesize=None, lifetime=None, name=None, snippet=None, tfid=None):
        if ah and not isinstance(ah, dict):
            raise TypeError("Expected argument 'ah' to be a dict")
        pulumi.set(__self__, "ah", ah)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if dh_group and not isinstance(dh_group, str):
            raise TypeError("Expected argument 'dh_group' to be a str")
        pulumi.set(__self__, "dh_group", dh_group)
        if esp and not isinstance(esp, dict):
            raise TypeError("Expected argument 'esp' to be a dict")
        pulumi.set(__self__, "esp", esp)
        if folder and not isinstance(folder, str):
            raise TypeError("Expected argument 'folder' to be a str")
        pulumi.set(__self__, "folder", folder)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if lifesize and not isinstance(lifesize, dict):
            raise TypeError("Expected argument 'lifesize' to be a dict")
        pulumi.set(__self__, "lifesize", lifesize)
        if lifetime and not isinstance(lifetime, dict):
            raise TypeError("Expected argument 'lifetime' to be a dict")
        pulumi.set(__self__, "lifetime", lifetime)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if snippet and not isinstance(snippet, str):
            raise TypeError("Expected argument 'snippet' to be a str")
        pulumi.set(__self__, "snippet", snippet)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)

    @property
    @pulumi.getter
    def ah(self) -> 'outputs.GetIpsecCryptoProfileAhResult':
        """
        The Ah param.
        """
        return pulumi.get(self, "ah")

    @property
    @pulumi.getter
    def device(self) -> Optional[str]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter(name="dhGroup")
    def dh_group(self) -> str:
        """
        phase-2 DH group (PFS DH group). String must be one of these: `"no-pfs"`, `"group1"`, `"group2"`, `"group5"`, `"group14"`, `"group19"`, `"group20"`. Default: `"group2"`.
        """
        return pulumi.get(self, "dh_group")

    @property
    @pulumi.getter
    def esp(self) -> 'outputs.GetIpsecCryptoProfileEspResult':
        """
        The Esp param.
        """
        return pulumi.get(self, "esp")

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
    def lifesize(self) -> 'outputs.GetIpsecCryptoProfileLifesizeResult':
        """
        The Lifesize param.
        """
        return pulumi.get(self, "lifesize")

    @property
    @pulumi.getter
    def lifetime(self) -> 'outputs.GetIpsecCryptoProfileLifetimeResult':
        """
        The Lifetime param.
        """
        return pulumi.get(self, "lifetime")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
        """
        return pulumi.get(self, "name")

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


class AwaitableGetIpsecCryptoProfileResult(GetIpsecCryptoProfileResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIpsecCryptoProfileResult(
            ah=self.ah,
            device=self.device,
            dh_group=self.dh_group,
            esp=self.esp,
            folder=self.folder,
            id=self.id,
            lifesize=self.lifesize,
            lifetime=self.lifetime,
            name=self.name,
            snippet=self.snippet,
            tfid=self.tfid)


def get_ipsec_crypto_profile(device: Optional[str] = None,
                             folder: Optional[str] = None,
                             id: Optional[str] = None,
                             snippet: Optional[str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIpsecCryptoProfileResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_ipsec_crypto_profile(id="1234-56-789")
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
    __ret__ = pulumi.runtime.invoke('scm:index/getIpsecCryptoProfile:getIpsecCryptoProfile', __args__, opts=opts, typ=GetIpsecCryptoProfileResult).value

    return AwaitableGetIpsecCryptoProfileResult(
        ah=pulumi.get(__ret__, 'ah'),
        device=pulumi.get(__ret__, 'device'),
        dh_group=pulumi.get(__ret__, 'dh_group'),
        esp=pulumi.get(__ret__, 'esp'),
        folder=pulumi.get(__ret__, 'folder'),
        id=pulumi.get(__ret__, 'id'),
        lifesize=pulumi.get(__ret__, 'lifesize'),
        lifetime=pulumi.get(__ret__, 'lifetime'),
        name=pulumi.get(__ret__, 'name'),
        snippet=pulumi.get(__ret__, 'snippet'),
        tfid=pulumi.get(__ret__, 'tfid'))
def get_ipsec_crypto_profile_output(device: Optional[pulumi.Input[Optional[str]]] = None,
                                    folder: Optional[pulumi.Input[Optional[str]]] = None,
                                    id: Optional[pulumi.Input[str]] = None,
                                    snippet: Optional[pulumi.Input[Optional[str]]] = None,
                                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetIpsecCryptoProfileResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_ipsec_crypto_profile(id="1234-56-789")
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
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('scm:index/getIpsecCryptoProfile:getIpsecCryptoProfile', __args__, opts=opts, typ=GetIpsecCryptoProfileResult)
    return __ret__.apply(lambda __response__: GetIpsecCryptoProfileResult(
        ah=pulumi.get(__response__, 'ah'),
        device=pulumi.get(__response__, 'device'),
        dh_group=pulumi.get(__response__, 'dh_group'),
        esp=pulumi.get(__response__, 'esp'),
        folder=pulumi.get(__response__, 'folder'),
        id=pulumi.get(__response__, 'id'),
        lifesize=pulumi.get(__response__, 'lifesize'),
        lifetime=pulumi.get(__response__, 'lifetime'),
        name=pulumi.get(__response__, 'name'),
        snippet=pulumi.get(__response__, 'snippet'),
        tfid=pulumi.get(__response__, 'tfid')))
