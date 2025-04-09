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

__all__ = [
    'GetAuthenticationSequenceResult',
    'AwaitableGetAuthenticationSequenceResult',
    'get_authentication_sequence',
    'get_authentication_sequence_output',
]

@pulumi.output_type
class GetAuthenticationSequenceResult:
    """
    A collection of values returned by getAuthenticationSequence.
    """
    def __init__(__self__, authentication_profiles=None, id=None, name=None, tfid=None, use_domain_find_profile=None):
        if authentication_profiles and not isinstance(authentication_profiles, list):
            raise TypeError("Expected argument 'authentication_profiles' to be a list")
        pulumi.set(__self__, "authentication_profiles", authentication_profiles)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)
        if use_domain_find_profile and not isinstance(use_domain_find_profile, bool):
            raise TypeError("Expected argument 'use_domain_find_profile' to be a bool")
        pulumi.set(__self__, "use_domain_find_profile", use_domain_find_profile)

    @property
    @pulumi.getter(name="authenticationProfiles")
    def authentication_profiles(self) -> Sequence[builtins.str]:
        """
        The AuthenticationProfiles param.
        """
        return pulumi.get(self, "authentication_profiles")

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
        The Name param.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def tfid(self) -> builtins.str:
        return pulumi.get(self, "tfid")

    @property
    @pulumi.getter(name="useDomainFindProfile")
    def use_domain_find_profile(self) -> builtins.bool:
        """
        The UseDomainFindProfile param. Default: `true`.
        """
        return pulumi.get(self, "use_domain_find_profile")


class AwaitableGetAuthenticationSequenceResult(GetAuthenticationSequenceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAuthenticationSequenceResult(
            authentication_profiles=self.authentication_profiles,
            id=self.id,
            name=self.name,
            tfid=self.tfid,
            use_domain_find_profile=self.use_domain_find_profile)


def get_authentication_sequence(id: Optional[builtins.str] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAuthenticationSequenceResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_authentication_sequence(id="1234-56-789")
    ```


    :param builtins.str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getAuthenticationSequence:getAuthenticationSequence', __args__, opts=opts, typ=GetAuthenticationSequenceResult).value

    return AwaitableGetAuthenticationSequenceResult(
        authentication_profiles=pulumi.get(__ret__, 'authentication_profiles'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        tfid=pulumi.get(__ret__, 'tfid'),
        use_domain_find_profile=pulumi.get(__ret__, 'use_domain_find_profile'))
def get_authentication_sequence_output(id: Optional[pulumi.Input[builtins.str]] = None,
                                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetAuthenticationSequenceResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_authentication_sequence(id="1234-56-789")
    ```


    :param builtins.str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('scm:index/getAuthenticationSequence:getAuthenticationSequence', __args__, opts=opts, typ=GetAuthenticationSequenceResult)
    return __ret__.apply(lambda __response__: GetAuthenticationSequenceResult(
        authentication_profiles=pulumi.get(__response__, 'authentication_profiles'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        tfid=pulumi.get(__response__, 'tfid'),
        use_domain_find_profile=pulumi.get(__response__, 'use_domain_find_profile')))
