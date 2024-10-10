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

__all__ = ['AuthenticationPortalArgs', 'AuthenticationPortal']

@pulumi.input_type
class AuthenticationPortalArgs:
    def __init__(__self__, *,
                 authentication_profile: Optional[pulumi.Input[str]] = None,
                 certificate_profile: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 gp_udp_port: Optional[pulumi.Input[int]] = None,
                 idle_timer: Optional[pulumi.Input[int]] = None,
                 redirect_host: Optional[pulumi.Input[str]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 timer: Optional[pulumi.Input[int]] = None,
                 tls_service_profile: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AuthenticationPortal resource.
        :param pulumi.Input[str] authentication_profile: The AuthenticationProfile param.
        :param pulumi.Input[str] certificate_profile: The CertificateProfile param.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[int] gp_udp_port: The GpUdpPort param. Value must be between 1 and 65535.
        :param pulumi.Input[int] idle_timer: The IdleTimer param. Value must be between 1 and 1440.
        :param pulumi.Input[str] redirect_host: The RedirectHost param.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[int] timer: The Timer param. Value must be between 1 and 1440.
        :param pulumi.Input[str] tls_service_profile: The TlsServiceProfile param.
        """
        if authentication_profile is not None:
            pulumi.set(__self__, "authentication_profile", authentication_profile)
        if certificate_profile is not None:
            pulumi.set(__self__, "certificate_profile", certificate_profile)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if gp_udp_port is not None:
            pulumi.set(__self__, "gp_udp_port", gp_udp_port)
        if idle_timer is not None:
            pulumi.set(__self__, "idle_timer", idle_timer)
        if redirect_host is not None:
            pulumi.set(__self__, "redirect_host", redirect_host)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)
        if timer is not None:
            pulumi.set(__self__, "timer", timer)
        if tls_service_profile is not None:
            pulumi.set(__self__, "tls_service_profile", tls_service_profile)

    @property
    @pulumi.getter(name="authenticationProfile")
    def authentication_profile(self) -> Optional[pulumi.Input[str]]:
        """
        The AuthenticationProfile param.
        """
        return pulumi.get(self, "authentication_profile")

    @authentication_profile.setter
    def authentication_profile(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "authentication_profile", value)

    @property
    @pulumi.getter(name="certificateProfile")
    def certificate_profile(self) -> Optional[pulumi.Input[str]]:
        """
        The CertificateProfile param.
        """
        return pulumi.get(self, "certificate_profile")

    @certificate_profile.setter
    def certificate_profile(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_profile", value)

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
    @pulumi.getter(name="gpUdpPort")
    def gp_udp_port(self) -> Optional[pulumi.Input[int]]:
        """
        The GpUdpPort param. Value must be between 1 and 65535.
        """
        return pulumi.get(self, "gp_udp_port")

    @gp_udp_port.setter
    def gp_udp_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "gp_udp_port", value)

    @property
    @pulumi.getter(name="idleTimer")
    def idle_timer(self) -> Optional[pulumi.Input[int]]:
        """
        The IdleTimer param. Value must be between 1 and 1440.
        """
        return pulumi.get(self, "idle_timer")

    @idle_timer.setter
    def idle_timer(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "idle_timer", value)

    @property
    @pulumi.getter(name="redirectHost")
    def redirect_host(self) -> Optional[pulumi.Input[str]]:
        """
        The RedirectHost param.
        """
        return pulumi.get(self, "redirect_host")

    @redirect_host.setter
    def redirect_host(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "redirect_host", value)

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
    def timer(self) -> Optional[pulumi.Input[int]]:
        """
        The Timer param. Value must be between 1 and 1440.
        """
        return pulumi.get(self, "timer")

    @timer.setter
    def timer(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "timer", value)

    @property
    @pulumi.getter(name="tlsServiceProfile")
    def tls_service_profile(self) -> Optional[pulumi.Input[str]]:
        """
        The TlsServiceProfile param.
        """
        return pulumi.get(self, "tls_service_profile")

    @tls_service_profile.setter
    def tls_service_profile(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tls_service_profile", value)


@pulumi.input_type
class _AuthenticationPortalState:
    def __init__(__self__, *,
                 authentication_profile: Optional[pulumi.Input[str]] = None,
                 certificate_profile: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 gp_udp_port: Optional[pulumi.Input[int]] = None,
                 idle_timer: Optional[pulumi.Input[int]] = None,
                 redirect_host: Optional[pulumi.Input[str]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 tfid: Optional[pulumi.Input[str]] = None,
                 timer: Optional[pulumi.Input[int]] = None,
                 tls_service_profile: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AuthenticationPortal resources.
        :param pulumi.Input[str] authentication_profile: The AuthenticationProfile param.
        :param pulumi.Input[str] certificate_profile: The CertificateProfile param.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[int] gp_udp_port: The GpUdpPort param. Value must be between 1 and 65535.
        :param pulumi.Input[int] idle_timer: The IdleTimer param. Value must be between 1 and 1440.
        :param pulumi.Input[str] redirect_host: The RedirectHost param.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[int] timer: The Timer param. Value must be between 1 and 1440.
        :param pulumi.Input[str] tls_service_profile: The TlsServiceProfile param.
        """
        if authentication_profile is not None:
            pulumi.set(__self__, "authentication_profile", authentication_profile)
        if certificate_profile is not None:
            pulumi.set(__self__, "certificate_profile", certificate_profile)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if gp_udp_port is not None:
            pulumi.set(__self__, "gp_udp_port", gp_udp_port)
        if idle_timer is not None:
            pulumi.set(__self__, "idle_timer", idle_timer)
        if redirect_host is not None:
            pulumi.set(__self__, "redirect_host", redirect_host)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)
        if tfid is not None:
            pulumi.set(__self__, "tfid", tfid)
        if timer is not None:
            pulumi.set(__self__, "timer", timer)
        if tls_service_profile is not None:
            pulumi.set(__self__, "tls_service_profile", tls_service_profile)

    @property
    @pulumi.getter(name="authenticationProfile")
    def authentication_profile(self) -> Optional[pulumi.Input[str]]:
        """
        The AuthenticationProfile param.
        """
        return pulumi.get(self, "authentication_profile")

    @authentication_profile.setter
    def authentication_profile(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "authentication_profile", value)

    @property
    @pulumi.getter(name="certificateProfile")
    def certificate_profile(self) -> Optional[pulumi.Input[str]]:
        """
        The CertificateProfile param.
        """
        return pulumi.get(self, "certificate_profile")

    @certificate_profile.setter
    def certificate_profile(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_profile", value)

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
    @pulumi.getter(name="gpUdpPort")
    def gp_udp_port(self) -> Optional[pulumi.Input[int]]:
        """
        The GpUdpPort param. Value must be between 1 and 65535.
        """
        return pulumi.get(self, "gp_udp_port")

    @gp_udp_port.setter
    def gp_udp_port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "gp_udp_port", value)

    @property
    @pulumi.getter(name="idleTimer")
    def idle_timer(self) -> Optional[pulumi.Input[int]]:
        """
        The IdleTimer param. Value must be between 1 and 1440.
        """
        return pulumi.get(self, "idle_timer")

    @idle_timer.setter
    def idle_timer(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "idle_timer", value)

    @property
    @pulumi.getter(name="redirectHost")
    def redirect_host(self) -> Optional[pulumi.Input[str]]:
        """
        The RedirectHost param.
        """
        return pulumi.get(self, "redirect_host")

    @redirect_host.setter
    def redirect_host(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "redirect_host", value)

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
    def tfid(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "tfid")

    @tfid.setter
    def tfid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tfid", value)

    @property
    @pulumi.getter
    def timer(self) -> Optional[pulumi.Input[int]]:
        """
        The Timer param. Value must be between 1 and 1440.
        """
        return pulumi.get(self, "timer")

    @timer.setter
    def timer(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "timer", value)

    @property
    @pulumi.getter(name="tlsServiceProfile")
    def tls_service_profile(self) -> Optional[pulumi.Input[str]]:
        """
        The TlsServiceProfile param.
        """
        return pulumi.get(self, "tls_service_profile")

    @tls_service_profile.setter
    def tls_service_profile(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tls_service_profile", value)


class AuthenticationPortal(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authentication_profile: Optional[pulumi.Input[str]] = None,
                 certificate_profile: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 gp_udp_port: Optional[pulumi.Input[int]] = None,
                 idle_timer: Optional[pulumi.Input[int]] = None,
                 redirect_host: Optional[pulumi.Input[str]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 timer: Optional[pulumi.Input[int]] = None,
                 tls_service_profile: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.AuthenticationPortal("example")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] authentication_profile: The AuthenticationProfile param.
        :param pulumi.Input[str] certificate_profile: The CertificateProfile param.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[int] gp_udp_port: The GpUdpPort param. Value must be between 1 and 65535.
        :param pulumi.Input[int] idle_timer: The IdleTimer param. Value must be between 1 and 1440.
        :param pulumi.Input[str] redirect_host: The RedirectHost param.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[int] timer: The Timer param. Value must be between 1 and 1440.
        :param pulumi.Input[str] tls_service_profile: The TlsServiceProfile param.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[AuthenticationPortalArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.AuthenticationPortal("example")
        ```

        :param str resource_name: The name of the resource.
        :param AuthenticationPortalArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AuthenticationPortalArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 authentication_profile: Optional[pulumi.Input[str]] = None,
                 certificate_profile: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 gp_udp_port: Optional[pulumi.Input[int]] = None,
                 idle_timer: Optional[pulumi.Input[int]] = None,
                 redirect_host: Optional[pulumi.Input[str]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 timer: Optional[pulumi.Input[int]] = None,
                 tls_service_profile: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AuthenticationPortalArgs.__new__(AuthenticationPortalArgs)

            __props__.__dict__["authentication_profile"] = authentication_profile
            __props__.__dict__["certificate_profile"] = certificate_profile
            __props__.__dict__["device"] = device
            __props__.__dict__["folder"] = folder
            __props__.__dict__["gp_udp_port"] = gp_udp_port
            __props__.__dict__["idle_timer"] = idle_timer
            __props__.__dict__["redirect_host"] = redirect_host
            __props__.__dict__["snippet"] = snippet
            __props__.__dict__["timer"] = timer
            __props__.__dict__["tls_service_profile"] = tls_service_profile
            __props__.__dict__["tfid"] = None
        super(AuthenticationPortal, __self__).__init__(
            'scm:index/authenticationPortal:AuthenticationPortal',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            authentication_profile: Optional[pulumi.Input[str]] = None,
            certificate_profile: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            folder: Optional[pulumi.Input[str]] = None,
            gp_udp_port: Optional[pulumi.Input[int]] = None,
            idle_timer: Optional[pulumi.Input[int]] = None,
            redirect_host: Optional[pulumi.Input[str]] = None,
            snippet: Optional[pulumi.Input[str]] = None,
            tfid: Optional[pulumi.Input[str]] = None,
            timer: Optional[pulumi.Input[int]] = None,
            tls_service_profile: Optional[pulumi.Input[str]] = None) -> 'AuthenticationPortal':
        """
        Get an existing AuthenticationPortal resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] authentication_profile: The AuthenticationProfile param.
        :param pulumi.Input[str] certificate_profile: The CertificateProfile param.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[int] gp_udp_port: The GpUdpPort param. Value must be between 1 and 65535.
        :param pulumi.Input[int] idle_timer: The IdleTimer param. Value must be between 1 and 1440.
        :param pulumi.Input[str] redirect_host: The RedirectHost param.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[int] timer: The Timer param. Value must be between 1 and 1440.
        :param pulumi.Input[str] tls_service_profile: The TlsServiceProfile param.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AuthenticationPortalState.__new__(_AuthenticationPortalState)

        __props__.__dict__["authentication_profile"] = authentication_profile
        __props__.__dict__["certificate_profile"] = certificate_profile
        __props__.__dict__["device"] = device
        __props__.__dict__["folder"] = folder
        __props__.__dict__["gp_udp_port"] = gp_udp_port
        __props__.__dict__["idle_timer"] = idle_timer
        __props__.__dict__["redirect_host"] = redirect_host
        __props__.__dict__["snippet"] = snippet
        __props__.__dict__["tfid"] = tfid
        __props__.__dict__["timer"] = timer
        __props__.__dict__["tls_service_profile"] = tls_service_profile
        return AuthenticationPortal(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="authenticationProfile")
    def authentication_profile(self) -> pulumi.Output[Optional[str]]:
        """
        The AuthenticationProfile param.
        """
        return pulumi.get(self, "authentication_profile")

    @property
    @pulumi.getter(name="certificateProfile")
    def certificate_profile(self) -> pulumi.Output[Optional[str]]:
        """
        The CertificateProfile param.
        """
        return pulumi.get(self, "certificate_profile")

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
    @pulumi.getter(name="gpUdpPort")
    def gp_udp_port(self) -> pulumi.Output[Optional[int]]:
        """
        The GpUdpPort param. Value must be between 1 and 65535.
        """
        return pulumi.get(self, "gp_udp_port")

    @property
    @pulumi.getter(name="idleTimer")
    def idle_timer(self) -> pulumi.Output[Optional[int]]:
        """
        The IdleTimer param. Value must be between 1 and 1440.
        """
        return pulumi.get(self, "idle_timer")

    @property
    @pulumi.getter(name="redirectHost")
    def redirect_host(self) -> pulumi.Output[Optional[str]]:
        """
        The RedirectHost param.
        """
        return pulumi.get(self, "redirect_host")

    @property
    @pulumi.getter
    def snippet(self) -> pulumi.Output[Optional[str]]:
        """
        The Snippet param.
        """
        return pulumi.get(self, "snippet")

    @property
    @pulumi.getter
    def tfid(self) -> pulumi.Output[str]:
        return pulumi.get(self, "tfid")

    @property
    @pulumi.getter
    def timer(self) -> pulumi.Output[Optional[int]]:
        """
        The Timer param. Value must be between 1 and 1440.
        """
        return pulumi.get(self, "timer")

    @property
    @pulumi.getter(name="tlsServiceProfile")
    def tls_service_profile(self) -> pulumi.Output[Optional[str]]:
        """
        The TlsServiceProfile param.
        """
        return pulumi.get(self, "tls_service_profile")

