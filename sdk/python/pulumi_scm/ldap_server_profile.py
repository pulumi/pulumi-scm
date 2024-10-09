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
from ._inputs import *

__all__ = ['LdapServerProfileArgs', 'LdapServerProfile']

@pulumi.input_type
class LdapServerProfileArgs:
    def __init__(__self__, *,
                 servers: pulumi.Input[Sequence[pulumi.Input['LdapServerProfileServerArgs']]],
                 base: Optional[pulumi.Input[str]] = None,
                 bind_dn: Optional[pulumi.Input[str]] = None,
                 bind_password: Optional[pulumi.Input[str]] = None,
                 bind_timelimit: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 ldap_type: Optional[pulumi.Input[str]] = None,
                 retry_interval: Optional[pulumi.Input[int]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 ssl: Optional[pulumi.Input[bool]] = None,
                 timelimit: Optional[pulumi.Input[int]] = None,
                 verify_server_certificate: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a LdapServerProfile resource.
        :param pulumi.Input[Sequence[pulumi.Input['LdapServerProfileServerArgs']]] servers: The Servers param.
        :param pulumi.Input[str] base: The Base param. String length must not exceed 255 characters.
        :param pulumi.Input[str] bind_dn: The BindDn param. String length must not exceed 255 characters.
        :param pulumi.Input[str] bind_password: The BindPassword param. String length must not exceed 121 characters.
        :param pulumi.Input[str] bind_timelimit: The BindTimelimit param.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[str] ldap_type: The LdapType param. String must be one of these: `"active-directory"`, `"e-directory"`, `"sun"`, `"other"`.
        :param pulumi.Input[int] retry_interval: The RetryInterval param.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[bool] ssl: The Ssl param.
        :param pulumi.Input[int] timelimit: The Timelimit param.
        :param pulumi.Input[bool] verify_server_certificate: The VerifyServerCertificate param.
        """
        pulumi.set(__self__, "servers", servers)
        if base is not None:
            pulumi.set(__self__, "base", base)
        if bind_dn is not None:
            pulumi.set(__self__, "bind_dn", bind_dn)
        if bind_password is not None:
            pulumi.set(__self__, "bind_password", bind_password)
        if bind_timelimit is not None:
            pulumi.set(__self__, "bind_timelimit", bind_timelimit)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if ldap_type is not None:
            pulumi.set(__self__, "ldap_type", ldap_type)
        if retry_interval is not None:
            pulumi.set(__self__, "retry_interval", retry_interval)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)
        if ssl is not None:
            pulumi.set(__self__, "ssl", ssl)
        if timelimit is not None:
            pulumi.set(__self__, "timelimit", timelimit)
        if verify_server_certificate is not None:
            pulumi.set(__self__, "verify_server_certificate", verify_server_certificate)

    @property
    @pulumi.getter
    def servers(self) -> pulumi.Input[Sequence[pulumi.Input['LdapServerProfileServerArgs']]]:
        """
        The Servers param.
        """
        return pulumi.get(self, "servers")

    @servers.setter
    def servers(self, value: pulumi.Input[Sequence[pulumi.Input['LdapServerProfileServerArgs']]]):
        pulumi.set(self, "servers", value)

    @property
    @pulumi.getter
    def base(self) -> Optional[pulumi.Input[str]]:
        """
        The Base param. String length must not exceed 255 characters.
        """
        return pulumi.get(self, "base")

    @base.setter
    def base(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "base", value)

    @property
    @pulumi.getter(name="bindDn")
    def bind_dn(self) -> Optional[pulumi.Input[str]]:
        """
        The BindDn param. String length must not exceed 255 characters.
        """
        return pulumi.get(self, "bind_dn")

    @bind_dn.setter
    def bind_dn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bind_dn", value)

    @property
    @pulumi.getter(name="bindPassword")
    def bind_password(self) -> Optional[pulumi.Input[str]]:
        """
        The BindPassword param. String length must not exceed 121 characters.
        """
        return pulumi.get(self, "bind_password")

    @bind_password.setter
    def bind_password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bind_password", value)

    @property
    @pulumi.getter(name="bindTimelimit")
    def bind_timelimit(self) -> Optional[pulumi.Input[str]]:
        """
        The BindTimelimit param.
        """
        return pulumi.get(self, "bind_timelimit")

    @bind_timelimit.setter
    def bind_timelimit(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bind_timelimit", value)

    @property
    @pulumi.getter
    def device(self) -> Optional[pulumi.Input[str]]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @device.setter
    def device(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device", value)

    @property
    @pulumi.getter
    def folder(self) -> Optional[pulumi.Input[str]]:
        """
        The Folder param.
        """
        return pulumi.get(self, "folder")

    @folder.setter
    def folder(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "folder", value)

    @property
    @pulumi.getter(name="ldapType")
    def ldap_type(self) -> Optional[pulumi.Input[str]]:
        """
        The LdapType param. String must be one of these: `"active-directory"`, `"e-directory"`, `"sun"`, `"other"`.
        """
        return pulumi.get(self, "ldap_type")

    @ldap_type.setter
    def ldap_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ldap_type", value)

    @property
    @pulumi.getter(name="retryInterval")
    def retry_interval(self) -> Optional[pulumi.Input[int]]:
        """
        The RetryInterval param.
        """
        return pulumi.get(self, "retry_interval")

    @retry_interval.setter
    def retry_interval(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retry_interval", value)

    @property
    @pulumi.getter
    def snippet(self) -> Optional[pulumi.Input[str]]:
        """
        The Snippet param.
        """
        return pulumi.get(self, "snippet")

    @snippet.setter
    def snippet(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snippet", value)

    @property
    @pulumi.getter
    def ssl(self) -> Optional[pulumi.Input[bool]]:
        """
        The Ssl param.
        """
        return pulumi.get(self, "ssl")

    @ssl.setter
    def ssl(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ssl", value)

    @property
    @pulumi.getter
    def timelimit(self) -> Optional[pulumi.Input[int]]:
        """
        The Timelimit param.
        """
        return pulumi.get(self, "timelimit")

    @timelimit.setter
    def timelimit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "timelimit", value)

    @property
    @pulumi.getter(name="verifyServerCertificate")
    def verify_server_certificate(self) -> Optional[pulumi.Input[bool]]:
        """
        The VerifyServerCertificate param.
        """
        return pulumi.get(self, "verify_server_certificate")

    @verify_server_certificate.setter
    def verify_server_certificate(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "verify_server_certificate", value)


@pulumi.input_type
class _LdapServerProfileState:
    def __init__(__self__, *,
                 base: Optional[pulumi.Input[str]] = None,
                 bind_dn: Optional[pulumi.Input[str]] = None,
                 bind_password: Optional[pulumi.Input[str]] = None,
                 bind_timelimit: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 ldap_type: Optional[pulumi.Input[str]] = None,
                 retry_interval: Optional[pulumi.Input[int]] = None,
                 servers: Optional[pulumi.Input[Sequence[pulumi.Input['LdapServerProfileServerArgs']]]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 ssl: Optional[pulumi.Input[bool]] = None,
                 tfid: Optional[pulumi.Input[str]] = None,
                 timelimit: Optional[pulumi.Input[int]] = None,
                 verify_server_certificate: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering LdapServerProfile resources.
        :param pulumi.Input[str] base: The Base param. String length must not exceed 255 characters.
        :param pulumi.Input[str] bind_dn: The BindDn param. String length must not exceed 255 characters.
        :param pulumi.Input[str] bind_password: The BindPassword param. String length must not exceed 121 characters.
        :param pulumi.Input[str] bind_timelimit: The BindTimelimit param.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[str] ldap_type: The LdapType param. String must be one of these: `"active-directory"`, `"e-directory"`, `"sun"`, `"other"`.
        :param pulumi.Input[int] retry_interval: The RetryInterval param.
        :param pulumi.Input[Sequence[pulumi.Input['LdapServerProfileServerArgs']]] servers: The Servers param.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[bool] ssl: The Ssl param.
        :param pulumi.Input[int] timelimit: The Timelimit param.
        :param pulumi.Input[bool] verify_server_certificate: The VerifyServerCertificate param.
        """
        if base is not None:
            pulumi.set(__self__, "base", base)
        if bind_dn is not None:
            pulumi.set(__self__, "bind_dn", bind_dn)
        if bind_password is not None:
            pulumi.set(__self__, "bind_password", bind_password)
        if bind_timelimit is not None:
            pulumi.set(__self__, "bind_timelimit", bind_timelimit)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if ldap_type is not None:
            pulumi.set(__self__, "ldap_type", ldap_type)
        if retry_interval is not None:
            pulumi.set(__self__, "retry_interval", retry_interval)
        if servers is not None:
            pulumi.set(__self__, "servers", servers)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)
        if ssl is not None:
            pulumi.set(__self__, "ssl", ssl)
        if tfid is not None:
            pulumi.set(__self__, "tfid", tfid)
        if timelimit is not None:
            pulumi.set(__self__, "timelimit", timelimit)
        if verify_server_certificate is not None:
            pulumi.set(__self__, "verify_server_certificate", verify_server_certificate)

    @property
    @pulumi.getter
    def base(self) -> Optional[pulumi.Input[str]]:
        """
        The Base param. String length must not exceed 255 characters.
        """
        return pulumi.get(self, "base")

    @base.setter
    def base(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "base", value)

    @property
    @pulumi.getter(name="bindDn")
    def bind_dn(self) -> Optional[pulumi.Input[str]]:
        """
        The BindDn param. String length must not exceed 255 characters.
        """
        return pulumi.get(self, "bind_dn")

    @bind_dn.setter
    def bind_dn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bind_dn", value)

    @property
    @pulumi.getter(name="bindPassword")
    def bind_password(self) -> Optional[pulumi.Input[str]]:
        """
        The BindPassword param. String length must not exceed 121 characters.
        """
        return pulumi.get(self, "bind_password")

    @bind_password.setter
    def bind_password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bind_password", value)

    @property
    @pulumi.getter(name="bindTimelimit")
    def bind_timelimit(self) -> Optional[pulumi.Input[str]]:
        """
        The BindTimelimit param.
        """
        return pulumi.get(self, "bind_timelimit")

    @bind_timelimit.setter
    def bind_timelimit(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bind_timelimit", value)

    @property
    @pulumi.getter
    def device(self) -> Optional[pulumi.Input[str]]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @device.setter
    def device(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "device", value)

    @property
    @pulumi.getter
    def folder(self) -> Optional[pulumi.Input[str]]:
        """
        The Folder param.
        """
        return pulumi.get(self, "folder")

    @folder.setter
    def folder(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "folder", value)

    @property
    @pulumi.getter(name="ldapType")
    def ldap_type(self) -> Optional[pulumi.Input[str]]:
        """
        The LdapType param. String must be one of these: `"active-directory"`, `"e-directory"`, `"sun"`, `"other"`.
        """
        return pulumi.get(self, "ldap_type")

    @ldap_type.setter
    def ldap_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ldap_type", value)

    @property
    @pulumi.getter(name="retryInterval")
    def retry_interval(self) -> Optional[pulumi.Input[int]]:
        """
        The RetryInterval param.
        """
        return pulumi.get(self, "retry_interval")

    @retry_interval.setter
    def retry_interval(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "retry_interval", value)

    @property
    @pulumi.getter
    def servers(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['LdapServerProfileServerArgs']]]]:
        """
        The Servers param.
        """
        return pulumi.get(self, "servers")

    @servers.setter
    def servers(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['LdapServerProfileServerArgs']]]]):
        pulumi.set(self, "servers", value)

    @property
    @pulumi.getter
    def snippet(self) -> Optional[pulumi.Input[str]]:
        """
        The Snippet param.
        """
        return pulumi.get(self, "snippet")

    @snippet.setter
    def snippet(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "snippet", value)

    @property
    @pulumi.getter
    def ssl(self) -> Optional[pulumi.Input[bool]]:
        """
        The Ssl param.
        """
        return pulumi.get(self, "ssl")

    @ssl.setter
    def ssl(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ssl", value)

    @property
    @pulumi.getter
    def tfid(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "tfid")

    @tfid.setter
    def tfid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tfid", value)

    @property
    @pulumi.getter
    def timelimit(self) -> Optional[pulumi.Input[int]]:
        """
        The Timelimit param.
        """
        return pulumi.get(self, "timelimit")

    @timelimit.setter
    def timelimit(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "timelimit", value)

    @property
    @pulumi.getter(name="verifyServerCertificate")
    def verify_server_certificate(self) -> Optional[pulumi.Input[bool]]:
        """
        The VerifyServerCertificate param.
        """
        return pulumi.get(self, "verify_server_certificate")

    @verify_server_certificate.setter
    def verify_server_certificate(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "verify_server_certificate", value)


class LdapServerProfile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 base: Optional[pulumi.Input[str]] = None,
                 bind_dn: Optional[pulumi.Input[str]] = None,
                 bind_password: Optional[pulumi.Input[str]] = None,
                 bind_timelimit: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 ldap_type: Optional[pulumi.Input[str]] = None,
                 retry_interval: Optional[pulumi.Input[int]] = None,
                 servers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['LdapServerProfileServerArgs', 'LdapServerProfileServerArgsDict']]]]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 ssl: Optional[pulumi.Input[bool]] = None,
                 timelimit: Optional[pulumi.Input[int]] = None,
                 verify_server_certificate: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.LdapServerProfile("example")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] base: The Base param. String length must not exceed 255 characters.
        :param pulumi.Input[str] bind_dn: The BindDn param. String length must not exceed 255 characters.
        :param pulumi.Input[str] bind_password: The BindPassword param. String length must not exceed 121 characters.
        :param pulumi.Input[str] bind_timelimit: The BindTimelimit param.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[str] ldap_type: The LdapType param. String must be one of these: `"active-directory"`, `"e-directory"`, `"sun"`, `"other"`.
        :param pulumi.Input[int] retry_interval: The RetryInterval param.
        :param pulumi.Input[Sequence[pulumi.Input[Union['LdapServerProfileServerArgs', 'LdapServerProfileServerArgsDict']]]] servers: The Servers param.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[bool] ssl: The Ssl param.
        :param pulumi.Input[int] timelimit: The Timelimit param.
        :param pulumi.Input[bool] verify_server_certificate: The VerifyServerCertificate param.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LdapServerProfileArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.LdapServerProfile("example")
        ```

        :param str resource_name: The name of the resource.
        :param LdapServerProfileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LdapServerProfileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 base: Optional[pulumi.Input[str]] = None,
                 bind_dn: Optional[pulumi.Input[str]] = None,
                 bind_password: Optional[pulumi.Input[str]] = None,
                 bind_timelimit: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 ldap_type: Optional[pulumi.Input[str]] = None,
                 retry_interval: Optional[pulumi.Input[int]] = None,
                 servers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['LdapServerProfileServerArgs', 'LdapServerProfileServerArgsDict']]]]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 ssl: Optional[pulumi.Input[bool]] = None,
                 timelimit: Optional[pulumi.Input[int]] = None,
                 verify_server_certificate: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LdapServerProfileArgs.__new__(LdapServerProfileArgs)

            __props__.__dict__["base"] = base
            __props__.__dict__["bind_dn"] = bind_dn
            __props__.__dict__["bind_password"] = None if bind_password is None else pulumi.Output.secret(bind_password)
            __props__.__dict__["bind_timelimit"] = bind_timelimit
            __props__.__dict__["device"] = device
            __props__.__dict__["folder"] = folder
            __props__.__dict__["ldap_type"] = ldap_type
            __props__.__dict__["retry_interval"] = retry_interval
            if servers is None and not opts.urn:
                raise TypeError("Missing required property 'servers'")
            __props__.__dict__["servers"] = servers
            __props__.__dict__["snippet"] = snippet
            __props__.__dict__["ssl"] = ssl
            __props__.__dict__["timelimit"] = timelimit
            __props__.__dict__["verify_server_certificate"] = verify_server_certificate
            __props__.__dict__["tfid"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["bindPassword"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(LdapServerProfile, __self__).__init__(
            'scm:index/ldapServerProfile:LdapServerProfile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            base: Optional[pulumi.Input[str]] = None,
            bind_dn: Optional[pulumi.Input[str]] = None,
            bind_password: Optional[pulumi.Input[str]] = None,
            bind_timelimit: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            folder: Optional[pulumi.Input[str]] = None,
            ldap_type: Optional[pulumi.Input[str]] = None,
            retry_interval: Optional[pulumi.Input[int]] = None,
            servers: Optional[pulumi.Input[Sequence[pulumi.Input[Union['LdapServerProfileServerArgs', 'LdapServerProfileServerArgsDict']]]]] = None,
            snippet: Optional[pulumi.Input[str]] = None,
            ssl: Optional[pulumi.Input[bool]] = None,
            tfid: Optional[pulumi.Input[str]] = None,
            timelimit: Optional[pulumi.Input[int]] = None,
            verify_server_certificate: Optional[pulumi.Input[bool]] = None) -> 'LdapServerProfile':
        """
        Get an existing LdapServerProfile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] base: The Base param. String length must not exceed 255 characters.
        :param pulumi.Input[str] bind_dn: The BindDn param. String length must not exceed 255 characters.
        :param pulumi.Input[str] bind_password: The BindPassword param. String length must not exceed 121 characters.
        :param pulumi.Input[str] bind_timelimit: The BindTimelimit param.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[str] ldap_type: The LdapType param. String must be one of these: `"active-directory"`, `"e-directory"`, `"sun"`, `"other"`.
        :param pulumi.Input[int] retry_interval: The RetryInterval param.
        :param pulumi.Input[Sequence[pulumi.Input[Union['LdapServerProfileServerArgs', 'LdapServerProfileServerArgsDict']]]] servers: The Servers param.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[bool] ssl: The Ssl param.
        :param pulumi.Input[int] timelimit: The Timelimit param.
        :param pulumi.Input[bool] verify_server_certificate: The VerifyServerCertificate param.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LdapServerProfileState.__new__(_LdapServerProfileState)

        __props__.__dict__["base"] = base
        __props__.__dict__["bind_dn"] = bind_dn
        __props__.__dict__["bind_password"] = bind_password
        __props__.__dict__["bind_timelimit"] = bind_timelimit
        __props__.__dict__["device"] = device
        __props__.__dict__["folder"] = folder
        __props__.__dict__["ldap_type"] = ldap_type
        __props__.__dict__["retry_interval"] = retry_interval
        __props__.__dict__["servers"] = servers
        __props__.__dict__["snippet"] = snippet
        __props__.__dict__["ssl"] = ssl
        __props__.__dict__["tfid"] = tfid
        __props__.__dict__["timelimit"] = timelimit
        __props__.__dict__["verify_server_certificate"] = verify_server_certificate
        return LdapServerProfile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def base(self) -> pulumi.Output[Optional[str]]:
        """
        The Base param. String length must not exceed 255 characters.
        """
        return pulumi.get(self, "base")

    @property
    @pulumi.getter(name="bindDn")
    def bind_dn(self) -> pulumi.Output[Optional[str]]:
        """
        The BindDn param. String length must not exceed 255 characters.
        """
        return pulumi.get(self, "bind_dn")

    @property
    @pulumi.getter(name="bindPassword")
    def bind_password(self) -> pulumi.Output[Optional[str]]:
        """
        The BindPassword param. String length must not exceed 121 characters.
        """
        return pulumi.get(self, "bind_password")

    @property
    @pulumi.getter(name="bindTimelimit")
    def bind_timelimit(self) -> pulumi.Output[Optional[str]]:
        """
        The BindTimelimit param.
        """
        return pulumi.get(self, "bind_timelimit")

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[str]]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def folder(self) -> pulumi.Output[Optional[str]]:
        """
        The Folder param.
        """
        return pulumi.get(self, "folder")

    @property
    @pulumi.getter(name="ldapType")
    def ldap_type(self) -> pulumi.Output[Optional[str]]:
        """
        The LdapType param. String must be one of these: `"active-directory"`, `"e-directory"`, `"sun"`, `"other"`.
        """
        return pulumi.get(self, "ldap_type")

    @property
    @pulumi.getter(name="retryInterval")
    def retry_interval(self) -> pulumi.Output[Optional[int]]:
        """
        The RetryInterval param.
        """
        return pulumi.get(self, "retry_interval")

    @property
    @pulumi.getter
    def servers(self) -> pulumi.Output[Sequence['outputs.LdapServerProfileServer']]:
        """
        The Servers param.
        """
        return pulumi.get(self, "servers")

    @property
    @pulumi.getter
    def snippet(self) -> pulumi.Output[Optional[str]]:
        """
        The Snippet param.
        """
        return pulumi.get(self, "snippet")

    @property
    @pulumi.getter
    def ssl(self) -> pulumi.Output[Optional[bool]]:
        """
        The Ssl param.
        """
        return pulumi.get(self, "ssl")

    @property
    @pulumi.getter
    def tfid(self) -> pulumi.Output[str]:
        return pulumi.get(self, "tfid")

    @property
    @pulumi.getter
    def timelimit(self) -> pulumi.Output[Optional[int]]:
        """
        The Timelimit param.
        """
        return pulumi.get(self, "timelimit")

    @property
    @pulumi.getter(name="verifyServerCertificate")
    def verify_server_certificate(self) -> pulumi.Output[Optional[bool]]:
        """
        The VerifyServerCertificate param.
        """
        return pulumi.get(self, "verify_server_certificate")

