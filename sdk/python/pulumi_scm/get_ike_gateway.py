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
    'GetIkeGatewayResult',
    'AwaitableGetIkeGatewayResult',
    'get_ike_gateway',
    'get_ike_gateway_output',
]

@pulumi.output_type
class GetIkeGatewayResult:
    """
    A collection of values returned by getIkeGateway.
    """
    def __init__(__self__, authentication=None, device=None, folder=None, id=None, local_id=None, name=None, peer_address=None, peer_id=None, protocol=None, protocol_common=None, snippet=None, tfid=None):
        if authentication and not isinstance(authentication, dict):
            raise TypeError("Expected argument 'authentication' to be a dict")
        pulumi.set(__self__, "authentication", authentication)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if folder and not isinstance(folder, str):
            raise TypeError("Expected argument 'folder' to be a str")
        pulumi.set(__self__, "folder", folder)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if local_id and not isinstance(local_id, dict):
            raise TypeError("Expected argument 'local_id' to be a dict")
        pulumi.set(__self__, "local_id", local_id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if peer_address and not isinstance(peer_address, dict):
            raise TypeError("Expected argument 'peer_address' to be a dict")
        pulumi.set(__self__, "peer_address", peer_address)
        if peer_id and not isinstance(peer_id, dict):
            raise TypeError("Expected argument 'peer_id' to be a dict")
        pulumi.set(__self__, "peer_id", peer_id)
        if protocol and not isinstance(protocol, dict):
            raise TypeError("Expected argument 'protocol' to be a dict")
        pulumi.set(__self__, "protocol", protocol)
        if protocol_common and not isinstance(protocol_common, dict):
            raise TypeError("Expected argument 'protocol_common' to be a dict")
        pulumi.set(__self__, "protocol_common", protocol_common)
        if snippet and not isinstance(snippet, str):
            raise TypeError("Expected argument 'snippet' to be a str")
        pulumi.set(__self__, "snippet", snippet)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)

    @property
    @pulumi.getter
    def authentication(self) -> 'outputs.GetIkeGatewayAuthenticationResult':
        """
        The Authentication param.
        """
        return pulumi.get(self, "authentication")

    @property
    @pulumi.getter
    def device(self) -> Optional[builtins.str]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

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
    @pulumi.getter(name="localId")
    def local_id(self) -> 'outputs.GetIkeGatewayLocalIdResult':
        """
        The LocalId param.
        """
        return pulumi.get(self, "local_id")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="peerAddress")
    def peer_address(self) -> 'outputs.GetIkeGatewayPeerAddressResult':
        """
        The PeerAddress param.
        """
        return pulumi.get(self, "peer_address")

    @property
    @pulumi.getter(name="peerId")
    def peer_id(self) -> 'outputs.GetIkeGatewayPeerIdResult':
        """
        The PeerId param.
        """
        return pulumi.get(self, "peer_id")

    @property
    @pulumi.getter
    def protocol(self) -> 'outputs.GetIkeGatewayProtocolResult':
        """
        The Protocol param.
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter(name="protocolCommon")
    def protocol_common(self) -> 'outputs.GetIkeGatewayProtocolCommonResult':
        """
        The ProtocolCommon param.
        """
        return pulumi.get(self, "protocol_common")

    @property
    @pulumi.getter
    def snippet(self) -> Optional[builtins.str]:
        """
        The Snippet param.
        """
        return pulumi.get(self, "snippet")

    @property
    @pulumi.getter
    def tfid(self) -> builtins.str:
        return pulumi.get(self, "tfid")


class AwaitableGetIkeGatewayResult(GetIkeGatewayResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIkeGatewayResult(
            authentication=self.authentication,
            device=self.device,
            folder=self.folder,
            id=self.id,
            local_id=self.local_id,
            name=self.name,
            peer_address=self.peer_address,
            peer_id=self.peer_id,
            protocol=self.protocol,
            protocol_common=self.protocol_common,
            snippet=self.snippet,
            tfid=self.tfid)


def get_ike_gateway(device: Optional[builtins.str] = None,
                    folder: Optional[builtins.str] = None,
                    id: Optional[builtins.str] = None,
                    snippet: Optional[builtins.str] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIkeGatewayResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_ike_gateway(id="1234-56-789")
    ```


    :param builtins.str device: The Device param.
    :param builtins.str folder: The Folder param.
    :param builtins.str id: The Id param.
    :param builtins.str snippet: The Snippet param.
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['folder'] = folder
    __args__['id'] = id
    __args__['snippet'] = snippet
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getIkeGateway:getIkeGateway', __args__, opts=opts, typ=GetIkeGatewayResult).value

    return AwaitableGetIkeGatewayResult(
        authentication=pulumi.get(__ret__, 'authentication'),
        device=pulumi.get(__ret__, 'device'),
        folder=pulumi.get(__ret__, 'folder'),
        id=pulumi.get(__ret__, 'id'),
        local_id=pulumi.get(__ret__, 'local_id'),
        name=pulumi.get(__ret__, 'name'),
        peer_address=pulumi.get(__ret__, 'peer_address'),
        peer_id=pulumi.get(__ret__, 'peer_id'),
        protocol=pulumi.get(__ret__, 'protocol'),
        protocol_common=pulumi.get(__ret__, 'protocol_common'),
        snippet=pulumi.get(__ret__, 'snippet'),
        tfid=pulumi.get(__ret__, 'tfid'))
def get_ike_gateway_output(device: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                           folder: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                           id: Optional[pulumi.Input[builtins.str]] = None,
                           snippet: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                           opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetIkeGatewayResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_ike_gateway(id="1234-56-789")
    ```


    :param builtins.str device: The Device param.
    :param builtins.str folder: The Folder param.
    :param builtins.str id: The Id param.
    :param builtins.str snippet: The Snippet param.
    """
    __args__ = dict()
    __args__['device'] = device
    __args__['folder'] = folder
    __args__['id'] = id
    __args__['snippet'] = snippet
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('scm:index/getIkeGateway:getIkeGateway', __args__, opts=opts, typ=GetIkeGatewayResult)
    return __ret__.apply(lambda __response__: GetIkeGatewayResult(
        authentication=pulumi.get(__response__, 'authentication'),
        device=pulumi.get(__response__, 'device'),
        folder=pulumi.get(__response__, 'folder'),
        id=pulumi.get(__response__, 'id'),
        local_id=pulumi.get(__response__, 'local_id'),
        name=pulumi.get(__response__, 'name'),
        peer_address=pulumi.get(__response__, 'peer_address'),
        peer_id=pulumi.get(__response__, 'peer_id'),
        protocol=pulumi.get(__response__, 'protocol'),
        protocol_common=pulumi.get(__response__, 'protocol_common'),
        snippet=pulumi.get(__response__, 'snippet'),
        tfid=pulumi.get(__response__, 'tfid')))
