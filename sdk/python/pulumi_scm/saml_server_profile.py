# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['SamlServerProfileArgs', 'SamlServerProfile']

@pulumi.input_type
class SamlServerProfileArgs:
    def __init__(__self__, *,
                 certificate: pulumi.Input[str],
                 device: Optional[pulumi.Input[str]] = None,
                 entity_id: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 max_clock_skew: Optional[pulumi.Input[int]] = None,
                 slo_bindings: Optional[pulumi.Input[str]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 sso_bindings: Optional[pulumi.Input[str]] = None,
                 sso_url: Optional[pulumi.Input[str]] = None,
                 validate_idp_certificate: Optional[pulumi.Input[bool]] = None,
                 want_auth_requests_signed: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a SamlServerProfile resource.
        :param pulumi.Input[str] certificate: The Certificate param. String length must not exceed 63 characters.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] entity_id: The EntityId param. String length must be between 1 and 1024 characters.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[int] max_clock_skew: The MaxClockSkew param. Value must be between 1 and 900.
        :param pulumi.Input[str] slo_bindings: The SloBindings param. String must be one of these: `"post"`, `"redirect"`.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[str] sso_bindings: The SsoBindings param. String must be one of these: `"post"`, `"redirect"`.
        :param pulumi.Input[str] sso_url: The SsoUrl param. String length must be between 1 and 255 characters.
        :param pulumi.Input[bool] validate_idp_certificate: The ValidateIdpCertificate param.
        :param pulumi.Input[bool] want_auth_requests_signed: The WantAuthRequestsSigned param.
        """
        pulumi.set(__self__, "certificate", certificate)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if entity_id is not None:
            pulumi.set(__self__, "entity_id", entity_id)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if max_clock_skew is not None:
            pulumi.set(__self__, "max_clock_skew", max_clock_skew)
        if slo_bindings is not None:
            pulumi.set(__self__, "slo_bindings", slo_bindings)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)
        if sso_bindings is not None:
            pulumi.set(__self__, "sso_bindings", sso_bindings)
        if sso_url is not None:
            pulumi.set(__self__, "sso_url", sso_url)
        if validate_idp_certificate is not None:
            pulumi.set(__self__, "validate_idp_certificate", validate_idp_certificate)
        if want_auth_requests_signed is not None:
            pulumi.set(__self__, "want_auth_requests_signed", want_auth_requests_signed)

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Input[str]:
        """
        The Certificate param. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: pulumi.Input[str]):
        pulumi.set(self, "certificate", value)

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
    @pulumi.getter(name="entityId")
    def entity_id(self) -> Optional[pulumi.Input[str]]:
        """
        The EntityId param. String length must be between 1 and 1024 characters.
        """
        return pulumi.get(self, "entity_id")

    @entity_id.setter
    def entity_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "entity_id", value)

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
    @pulumi.getter(name="maxClockSkew")
    def max_clock_skew(self) -> Optional[pulumi.Input[int]]:
        """
        The MaxClockSkew param. Value must be between 1 and 900.
        """
        return pulumi.get(self, "max_clock_skew")

    @max_clock_skew.setter
    def max_clock_skew(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_clock_skew", value)

    @property
    @pulumi.getter(name="sloBindings")
    def slo_bindings(self) -> Optional[pulumi.Input[str]]:
        """
        The SloBindings param. String must be one of these: `"post"`, `"redirect"`.
        """
        return pulumi.get(self, "slo_bindings")

    @slo_bindings.setter
    def slo_bindings(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slo_bindings", value)

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
    @pulumi.getter(name="ssoBindings")
    def sso_bindings(self) -> Optional[pulumi.Input[str]]:
        """
        The SsoBindings param. String must be one of these: `"post"`, `"redirect"`.
        """
        return pulumi.get(self, "sso_bindings")

    @sso_bindings.setter
    def sso_bindings(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sso_bindings", value)

    @property
    @pulumi.getter(name="ssoUrl")
    def sso_url(self) -> Optional[pulumi.Input[str]]:
        """
        The SsoUrl param. String length must be between 1 and 255 characters.
        """
        return pulumi.get(self, "sso_url")

    @sso_url.setter
    def sso_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sso_url", value)

    @property
    @pulumi.getter(name="validateIdpCertificate")
    def validate_idp_certificate(self) -> Optional[pulumi.Input[bool]]:
        """
        The ValidateIdpCertificate param.
        """
        return pulumi.get(self, "validate_idp_certificate")

    @validate_idp_certificate.setter
    def validate_idp_certificate(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "validate_idp_certificate", value)

    @property
    @pulumi.getter(name="wantAuthRequestsSigned")
    def want_auth_requests_signed(self) -> Optional[pulumi.Input[bool]]:
        """
        The WantAuthRequestsSigned param.
        """
        return pulumi.get(self, "want_auth_requests_signed")

    @want_auth_requests_signed.setter
    def want_auth_requests_signed(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "want_auth_requests_signed", value)


@pulumi.input_type
class _SamlServerProfileState:
    def __init__(__self__, *,
                 certificate: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 entity_id: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 max_clock_skew: Optional[pulumi.Input[int]] = None,
                 slo_bindings: Optional[pulumi.Input[str]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 sso_bindings: Optional[pulumi.Input[str]] = None,
                 sso_url: Optional[pulumi.Input[str]] = None,
                 tfid: Optional[pulumi.Input[str]] = None,
                 validate_idp_certificate: Optional[pulumi.Input[bool]] = None,
                 want_auth_requests_signed: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering SamlServerProfile resources.
        :param pulumi.Input[str] certificate: The Certificate param. String length must not exceed 63 characters.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] entity_id: The EntityId param. String length must be between 1 and 1024 characters.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[int] max_clock_skew: The MaxClockSkew param. Value must be between 1 and 900.
        :param pulumi.Input[str] slo_bindings: The SloBindings param. String must be one of these: `"post"`, `"redirect"`.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[str] sso_bindings: The SsoBindings param. String must be one of these: `"post"`, `"redirect"`.
        :param pulumi.Input[str] sso_url: The SsoUrl param. String length must be between 1 and 255 characters.
        :param pulumi.Input[bool] validate_idp_certificate: The ValidateIdpCertificate param.
        :param pulumi.Input[bool] want_auth_requests_signed: The WantAuthRequestsSigned param.
        """
        if certificate is not None:
            pulumi.set(__self__, "certificate", certificate)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if entity_id is not None:
            pulumi.set(__self__, "entity_id", entity_id)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if max_clock_skew is not None:
            pulumi.set(__self__, "max_clock_skew", max_clock_skew)
        if slo_bindings is not None:
            pulumi.set(__self__, "slo_bindings", slo_bindings)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)
        if sso_bindings is not None:
            pulumi.set(__self__, "sso_bindings", sso_bindings)
        if sso_url is not None:
            pulumi.set(__self__, "sso_url", sso_url)
        if tfid is not None:
            pulumi.set(__self__, "tfid", tfid)
        if validate_idp_certificate is not None:
            pulumi.set(__self__, "validate_idp_certificate", validate_idp_certificate)
        if want_auth_requests_signed is not None:
            pulumi.set(__self__, "want_auth_requests_signed", want_auth_requests_signed)

    @property
    @pulumi.getter
    def certificate(self) -> Optional[pulumi.Input[str]]:
        """
        The Certificate param. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate", value)

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
    @pulumi.getter(name="entityId")
    def entity_id(self) -> Optional[pulumi.Input[str]]:
        """
        The EntityId param. String length must be between 1 and 1024 characters.
        """
        return pulumi.get(self, "entity_id")

    @entity_id.setter
    def entity_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "entity_id", value)

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
    @pulumi.getter(name="maxClockSkew")
    def max_clock_skew(self) -> Optional[pulumi.Input[int]]:
        """
        The MaxClockSkew param. Value must be between 1 and 900.
        """
        return pulumi.get(self, "max_clock_skew")

    @max_clock_skew.setter
    def max_clock_skew(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_clock_skew", value)

    @property
    @pulumi.getter(name="sloBindings")
    def slo_bindings(self) -> Optional[pulumi.Input[str]]:
        """
        The SloBindings param. String must be one of these: `"post"`, `"redirect"`.
        """
        return pulumi.get(self, "slo_bindings")

    @slo_bindings.setter
    def slo_bindings(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slo_bindings", value)

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
    @pulumi.getter(name="ssoBindings")
    def sso_bindings(self) -> Optional[pulumi.Input[str]]:
        """
        The SsoBindings param. String must be one of these: `"post"`, `"redirect"`.
        """
        return pulumi.get(self, "sso_bindings")

    @sso_bindings.setter
    def sso_bindings(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sso_bindings", value)

    @property
    @pulumi.getter(name="ssoUrl")
    def sso_url(self) -> Optional[pulumi.Input[str]]:
        """
        The SsoUrl param. String length must be between 1 and 255 characters.
        """
        return pulumi.get(self, "sso_url")

    @sso_url.setter
    def sso_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sso_url", value)

    @property
    @pulumi.getter
    def tfid(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "tfid")

    @tfid.setter
    def tfid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tfid", value)

    @property
    @pulumi.getter(name="validateIdpCertificate")
    def validate_idp_certificate(self) -> Optional[pulumi.Input[bool]]:
        """
        The ValidateIdpCertificate param.
        """
        return pulumi.get(self, "validate_idp_certificate")

    @validate_idp_certificate.setter
    def validate_idp_certificate(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "validate_idp_certificate", value)

    @property
    @pulumi.getter(name="wantAuthRequestsSigned")
    def want_auth_requests_signed(self) -> Optional[pulumi.Input[bool]]:
        """
        The WantAuthRequestsSigned param.
        """
        return pulumi.get(self, "want_auth_requests_signed")

    @want_auth_requests_signed.setter
    def want_auth_requests_signed(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "want_auth_requests_signed", value)


class SamlServerProfile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 entity_id: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 max_clock_skew: Optional[pulumi.Input[int]] = None,
                 slo_bindings: Optional[pulumi.Input[str]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 sso_bindings: Optional[pulumi.Input[str]] = None,
                 sso_url: Optional[pulumi.Input[str]] = None,
                 validate_idp_certificate: Optional[pulumi.Input[bool]] = None,
                 want_auth_requests_signed: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.SamlServerProfile("example")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate: The Certificate param. String length must not exceed 63 characters.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] entity_id: The EntityId param. String length must be between 1 and 1024 characters.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[int] max_clock_skew: The MaxClockSkew param. Value must be between 1 and 900.
        :param pulumi.Input[str] slo_bindings: The SloBindings param. String must be one of these: `"post"`, `"redirect"`.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[str] sso_bindings: The SsoBindings param. String must be one of these: `"post"`, `"redirect"`.
        :param pulumi.Input[str] sso_url: The SsoUrl param. String length must be between 1 and 255 characters.
        :param pulumi.Input[bool] validate_idp_certificate: The ValidateIdpCertificate param.
        :param pulumi.Input[bool] want_auth_requests_signed: The WantAuthRequestsSigned param.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SamlServerProfileArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.SamlServerProfile("example")
        ```

        :param str resource_name: The name of the resource.
        :param SamlServerProfileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SamlServerProfileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 entity_id: Optional[pulumi.Input[str]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 max_clock_skew: Optional[pulumi.Input[int]] = None,
                 slo_bindings: Optional[pulumi.Input[str]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 sso_bindings: Optional[pulumi.Input[str]] = None,
                 sso_url: Optional[pulumi.Input[str]] = None,
                 validate_idp_certificate: Optional[pulumi.Input[bool]] = None,
                 want_auth_requests_signed: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SamlServerProfileArgs.__new__(SamlServerProfileArgs)

            if certificate is None and not opts.urn:
                raise TypeError("Missing required property 'certificate'")
            __props__.__dict__["certificate"] = certificate
            __props__.__dict__["device"] = device
            __props__.__dict__["entity_id"] = entity_id
            __props__.__dict__["folder"] = folder
            __props__.__dict__["max_clock_skew"] = max_clock_skew
            __props__.__dict__["slo_bindings"] = slo_bindings
            __props__.__dict__["snippet"] = snippet
            __props__.__dict__["sso_bindings"] = sso_bindings
            __props__.__dict__["sso_url"] = sso_url
            __props__.__dict__["validate_idp_certificate"] = validate_idp_certificate
            __props__.__dict__["want_auth_requests_signed"] = want_auth_requests_signed
            __props__.__dict__["tfid"] = None
        super(SamlServerProfile, __self__).__init__(
            'scm:index/samlServerProfile:SamlServerProfile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificate: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            entity_id: Optional[pulumi.Input[str]] = None,
            folder: Optional[pulumi.Input[str]] = None,
            max_clock_skew: Optional[pulumi.Input[int]] = None,
            slo_bindings: Optional[pulumi.Input[str]] = None,
            snippet: Optional[pulumi.Input[str]] = None,
            sso_bindings: Optional[pulumi.Input[str]] = None,
            sso_url: Optional[pulumi.Input[str]] = None,
            tfid: Optional[pulumi.Input[str]] = None,
            validate_idp_certificate: Optional[pulumi.Input[bool]] = None,
            want_auth_requests_signed: Optional[pulumi.Input[bool]] = None) -> 'SamlServerProfile':
        """
        Get an existing SamlServerProfile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate: The Certificate param. String length must not exceed 63 characters.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[str] entity_id: The EntityId param. String length must be between 1 and 1024 characters.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[int] max_clock_skew: The MaxClockSkew param. Value must be between 1 and 900.
        :param pulumi.Input[str] slo_bindings: The SloBindings param. String must be one of these: `"post"`, `"redirect"`.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[str] sso_bindings: The SsoBindings param. String must be one of these: `"post"`, `"redirect"`.
        :param pulumi.Input[str] sso_url: The SsoUrl param. String length must be between 1 and 255 characters.
        :param pulumi.Input[bool] validate_idp_certificate: The ValidateIdpCertificate param.
        :param pulumi.Input[bool] want_auth_requests_signed: The WantAuthRequestsSigned param.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SamlServerProfileState.__new__(_SamlServerProfileState)

        __props__.__dict__["certificate"] = certificate
        __props__.__dict__["device"] = device
        __props__.__dict__["entity_id"] = entity_id
        __props__.__dict__["folder"] = folder
        __props__.__dict__["max_clock_skew"] = max_clock_skew
        __props__.__dict__["slo_bindings"] = slo_bindings
        __props__.__dict__["snippet"] = snippet
        __props__.__dict__["sso_bindings"] = sso_bindings
        __props__.__dict__["sso_url"] = sso_url
        __props__.__dict__["tfid"] = tfid
        __props__.__dict__["validate_idp_certificate"] = validate_idp_certificate
        __props__.__dict__["want_auth_requests_signed"] = want_auth_requests_signed
        return SamlServerProfile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Output[str]:
        """
        The Certificate param. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[str]]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter(name="entityId")
    def entity_id(self) -> pulumi.Output[Optional[str]]:
        """
        The EntityId param. String length must be between 1 and 1024 characters.
        """
        return pulumi.get(self, "entity_id")

    @property
    @pulumi.getter
    def folder(self) -> pulumi.Output[Optional[str]]:
        """
        The Folder param.
        """
        return pulumi.get(self, "folder")

    @property
    @pulumi.getter(name="maxClockSkew")
    def max_clock_skew(self) -> pulumi.Output[Optional[int]]:
        """
        The MaxClockSkew param. Value must be between 1 and 900.
        """
        return pulumi.get(self, "max_clock_skew")

    @property
    @pulumi.getter(name="sloBindings")
    def slo_bindings(self) -> pulumi.Output[Optional[str]]:
        """
        The SloBindings param. String must be one of these: `"post"`, `"redirect"`.
        """
        return pulumi.get(self, "slo_bindings")

    @property
    @pulumi.getter
    def snippet(self) -> pulumi.Output[Optional[str]]:
        """
        The Snippet param.
        """
        return pulumi.get(self, "snippet")

    @property
    @pulumi.getter(name="ssoBindings")
    def sso_bindings(self) -> pulumi.Output[Optional[str]]:
        """
        The SsoBindings param. String must be one of these: `"post"`, `"redirect"`.
        """
        return pulumi.get(self, "sso_bindings")

    @property
    @pulumi.getter(name="ssoUrl")
    def sso_url(self) -> pulumi.Output[Optional[str]]:
        """
        The SsoUrl param. String length must be between 1 and 255 characters.
        """
        return pulumi.get(self, "sso_url")

    @property
    @pulumi.getter
    def tfid(self) -> pulumi.Output[str]:
        return pulumi.get(self, "tfid")

    @property
    @pulumi.getter(name="validateIdpCertificate")
    def validate_idp_certificate(self) -> pulumi.Output[Optional[bool]]:
        """
        The ValidateIdpCertificate param.
        """
        return pulumi.get(self, "validate_idp_certificate")

    @property
    @pulumi.getter(name="wantAuthRequestsSigned")
    def want_auth_requests_signed(self) -> pulumi.Output[Optional[bool]]:
        """
        The WantAuthRequestsSigned param.
        """
        return pulumi.get(self, "want_auth_requests_signed")
