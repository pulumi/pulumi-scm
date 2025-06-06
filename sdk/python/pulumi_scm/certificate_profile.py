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
from . import outputs
from ._inputs import *

__all__ = ['CertificateProfileArgs', 'CertificateProfile']

@pulumi.input_type
class CertificateProfileArgs:
    def __init__(__self__, *,
                 ca_certificates: pulumi.Input[Sequence[pulumi.Input['CertificateProfileCaCertificateArgs']]],
                 block_expired_cert: Optional[pulumi.Input[builtins.bool]] = None,
                 block_timeout_cert: Optional[pulumi.Input[builtins.bool]] = None,
                 block_unauthenticated_cert: Optional[pulumi.Input[builtins.bool]] = None,
                 block_unknown_cert: Optional[pulumi.Input[builtins.bool]] = None,
                 cert_status_timeout: Optional[pulumi.Input[builtins.str]] = None,
                 crl_receive_timeout: Optional[pulumi.Input[builtins.str]] = None,
                 device: Optional[pulumi.Input[builtins.str]] = None,
                 domain: Optional[pulumi.Input[builtins.str]] = None,
                 folder: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 ocsp_receive_timeout: Optional[pulumi.Input[builtins.str]] = None,
                 snippet: Optional[pulumi.Input[builtins.str]] = None,
                 use_crl: Optional[pulumi.Input[builtins.bool]] = None,
                 use_ocsp: Optional[pulumi.Input[builtins.bool]] = None,
                 username_field: Optional[pulumi.Input['CertificateProfileUsernameFieldArgs']] = None):
        """
        The set of arguments for constructing a CertificateProfile resource.
        :param pulumi.Input[Sequence[pulumi.Input['CertificateProfileCaCertificateArgs']]] ca_certificates: The CaCertificates param.
        :param pulumi.Input[builtins.bool] block_expired_cert: The BlockExpiredCert param.
        :param pulumi.Input[builtins.bool] block_timeout_cert: The BlockTimeoutCert param.
        :param pulumi.Input[builtins.bool] block_unauthenticated_cert: The BlockUnauthenticatedCert param.
        :param pulumi.Input[builtins.bool] block_unknown_cert: The BlockUnknownCert param.
        :param pulumi.Input[builtins.str] cert_status_timeout: The CertStatusTimeout param.
        :param pulumi.Input[builtins.str] crl_receive_timeout: The CrlReceiveTimeout param.
        :param pulumi.Input[builtins.str] device: The Device param.
        :param pulumi.Input[builtins.str] domain: The Domain param.
        :param pulumi.Input[builtins.str] folder: The Folder param.
        :param pulumi.Input[builtins.str] name: Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
        :param pulumi.Input[builtins.str] ocsp_receive_timeout: The OcspReceiveTimeout param.
        :param pulumi.Input[builtins.str] snippet: The Snippet param.
        :param pulumi.Input[builtins.bool] use_crl: The UseCrl param.
        :param pulumi.Input[builtins.bool] use_ocsp: The UseOcsp param.
        :param pulumi.Input['CertificateProfileUsernameFieldArgs'] username_field: The UsernameField param.
        """
        pulumi.set(__self__, "ca_certificates", ca_certificates)
        if block_expired_cert is not None:
            pulumi.set(__self__, "block_expired_cert", block_expired_cert)
        if block_timeout_cert is not None:
            pulumi.set(__self__, "block_timeout_cert", block_timeout_cert)
        if block_unauthenticated_cert is not None:
            pulumi.set(__self__, "block_unauthenticated_cert", block_unauthenticated_cert)
        if block_unknown_cert is not None:
            pulumi.set(__self__, "block_unknown_cert", block_unknown_cert)
        if cert_status_timeout is not None:
            pulumi.set(__self__, "cert_status_timeout", cert_status_timeout)
        if crl_receive_timeout is not None:
            pulumi.set(__self__, "crl_receive_timeout", crl_receive_timeout)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if ocsp_receive_timeout is not None:
            pulumi.set(__self__, "ocsp_receive_timeout", ocsp_receive_timeout)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)
        if use_crl is not None:
            pulumi.set(__self__, "use_crl", use_crl)
        if use_ocsp is not None:
            pulumi.set(__self__, "use_ocsp", use_ocsp)
        if username_field is not None:
            pulumi.set(__self__, "username_field", username_field)

    @property
    @pulumi.getter(name="caCertificates")
    def ca_certificates(self) -> pulumi.Input[Sequence[pulumi.Input['CertificateProfileCaCertificateArgs']]]:
        """
        The CaCertificates param.
        """
        return pulumi.get(self, "ca_certificates")

    @ca_certificates.setter
    def ca_certificates(self, value: pulumi.Input[Sequence[pulumi.Input['CertificateProfileCaCertificateArgs']]]):
        pulumi.set(self, "ca_certificates", value)

    @property
    @pulumi.getter(name="blockExpiredCert")
    def block_expired_cert(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        The BlockExpiredCert param.
        """
        return pulumi.get(self, "block_expired_cert")

    @block_expired_cert.setter
    def block_expired_cert(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "block_expired_cert", value)

    @property
    @pulumi.getter(name="blockTimeoutCert")
    def block_timeout_cert(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        The BlockTimeoutCert param.
        """
        return pulumi.get(self, "block_timeout_cert")

    @block_timeout_cert.setter
    def block_timeout_cert(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "block_timeout_cert", value)

    @property
    @pulumi.getter(name="blockUnauthenticatedCert")
    def block_unauthenticated_cert(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        The BlockUnauthenticatedCert param.
        """
        return pulumi.get(self, "block_unauthenticated_cert")

    @block_unauthenticated_cert.setter
    def block_unauthenticated_cert(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "block_unauthenticated_cert", value)

    @property
    @pulumi.getter(name="blockUnknownCert")
    def block_unknown_cert(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        The BlockUnknownCert param.
        """
        return pulumi.get(self, "block_unknown_cert")

    @block_unknown_cert.setter
    def block_unknown_cert(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "block_unknown_cert", value)

    @property
    @pulumi.getter(name="certStatusTimeout")
    def cert_status_timeout(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The CertStatusTimeout param.
        """
        return pulumi.get(self, "cert_status_timeout")

    @cert_status_timeout.setter
    def cert_status_timeout(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "cert_status_timeout", value)

    @property
    @pulumi.getter(name="crlReceiveTimeout")
    def crl_receive_timeout(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The CrlReceiveTimeout param.
        """
        return pulumi.get(self, "crl_receive_timeout")

    @crl_receive_timeout.setter
    def crl_receive_timeout(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "crl_receive_timeout", value)

    @property
    @pulumi.getter
    def device(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @device.setter
    def device(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "device", value)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The Domain param.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def folder(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The Folder param.
        """
        return pulumi.get(self, "folder")

    @folder.setter
    def folder(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "folder", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ocspReceiveTimeout")
    def ocsp_receive_timeout(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The OcspReceiveTimeout param.
        """
        return pulumi.get(self, "ocsp_receive_timeout")

    @ocsp_receive_timeout.setter
    def ocsp_receive_timeout(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "ocsp_receive_timeout", value)

    @property
    @pulumi.getter
    def snippet(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The Snippet param.
        """
        return pulumi.get(self, "snippet")

    @snippet.setter
    def snippet(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "snippet", value)

    @property
    @pulumi.getter(name="useCrl")
    def use_crl(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        The UseCrl param.
        """
        return pulumi.get(self, "use_crl")

    @use_crl.setter
    def use_crl(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "use_crl", value)

    @property
    @pulumi.getter(name="useOcsp")
    def use_ocsp(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        The UseOcsp param.
        """
        return pulumi.get(self, "use_ocsp")

    @use_ocsp.setter
    def use_ocsp(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "use_ocsp", value)

    @property
    @pulumi.getter(name="usernameField")
    def username_field(self) -> Optional[pulumi.Input['CertificateProfileUsernameFieldArgs']]:
        """
        The UsernameField param.
        """
        return pulumi.get(self, "username_field")

    @username_field.setter
    def username_field(self, value: Optional[pulumi.Input['CertificateProfileUsernameFieldArgs']]):
        pulumi.set(self, "username_field", value)


@pulumi.input_type
class _CertificateProfileState:
    def __init__(__self__, *,
                 block_expired_cert: Optional[pulumi.Input[builtins.bool]] = None,
                 block_timeout_cert: Optional[pulumi.Input[builtins.bool]] = None,
                 block_unauthenticated_cert: Optional[pulumi.Input[builtins.bool]] = None,
                 block_unknown_cert: Optional[pulumi.Input[builtins.bool]] = None,
                 ca_certificates: Optional[pulumi.Input[Sequence[pulumi.Input['CertificateProfileCaCertificateArgs']]]] = None,
                 cert_status_timeout: Optional[pulumi.Input[builtins.str]] = None,
                 crl_receive_timeout: Optional[pulumi.Input[builtins.str]] = None,
                 device: Optional[pulumi.Input[builtins.str]] = None,
                 domain: Optional[pulumi.Input[builtins.str]] = None,
                 folder: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 ocsp_receive_timeout: Optional[pulumi.Input[builtins.str]] = None,
                 snippet: Optional[pulumi.Input[builtins.str]] = None,
                 tfid: Optional[pulumi.Input[builtins.str]] = None,
                 use_crl: Optional[pulumi.Input[builtins.bool]] = None,
                 use_ocsp: Optional[pulumi.Input[builtins.bool]] = None,
                 username_field: Optional[pulumi.Input['CertificateProfileUsernameFieldArgs']] = None):
        """
        Input properties used for looking up and filtering CertificateProfile resources.
        :param pulumi.Input[builtins.bool] block_expired_cert: The BlockExpiredCert param.
        :param pulumi.Input[builtins.bool] block_timeout_cert: The BlockTimeoutCert param.
        :param pulumi.Input[builtins.bool] block_unauthenticated_cert: The BlockUnauthenticatedCert param.
        :param pulumi.Input[builtins.bool] block_unknown_cert: The BlockUnknownCert param.
        :param pulumi.Input[Sequence[pulumi.Input['CertificateProfileCaCertificateArgs']]] ca_certificates: The CaCertificates param.
        :param pulumi.Input[builtins.str] cert_status_timeout: The CertStatusTimeout param.
        :param pulumi.Input[builtins.str] crl_receive_timeout: The CrlReceiveTimeout param.
        :param pulumi.Input[builtins.str] device: The Device param.
        :param pulumi.Input[builtins.str] domain: The Domain param.
        :param pulumi.Input[builtins.str] folder: The Folder param.
        :param pulumi.Input[builtins.str] name: Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
        :param pulumi.Input[builtins.str] ocsp_receive_timeout: The OcspReceiveTimeout param.
        :param pulumi.Input[builtins.str] snippet: The Snippet param.
        :param pulumi.Input[builtins.bool] use_crl: The UseCrl param.
        :param pulumi.Input[builtins.bool] use_ocsp: The UseOcsp param.
        :param pulumi.Input['CertificateProfileUsernameFieldArgs'] username_field: The UsernameField param.
        """
        if block_expired_cert is not None:
            pulumi.set(__self__, "block_expired_cert", block_expired_cert)
        if block_timeout_cert is not None:
            pulumi.set(__self__, "block_timeout_cert", block_timeout_cert)
        if block_unauthenticated_cert is not None:
            pulumi.set(__self__, "block_unauthenticated_cert", block_unauthenticated_cert)
        if block_unknown_cert is not None:
            pulumi.set(__self__, "block_unknown_cert", block_unknown_cert)
        if ca_certificates is not None:
            pulumi.set(__self__, "ca_certificates", ca_certificates)
        if cert_status_timeout is not None:
            pulumi.set(__self__, "cert_status_timeout", cert_status_timeout)
        if crl_receive_timeout is not None:
            pulumi.set(__self__, "crl_receive_timeout", crl_receive_timeout)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if ocsp_receive_timeout is not None:
            pulumi.set(__self__, "ocsp_receive_timeout", ocsp_receive_timeout)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)
        if tfid is not None:
            pulumi.set(__self__, "tfid", tfid)
        if use_crl is not None:
            pulumi.set(__self__, "use_crl", use_crl)
        if use_ocsp is not None:
            pulumi.set(__self__, "use_ocsp", use_ocsp)
        if username_field is not None:
            pulumi.set(__self__, "username_field", username_field)

    @property
    @pulumi.getter(name="blockExpiredCert")
    def block_expired_cert(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        The BlockExpiredCert param.
        """
        return pulumi.get(self, "block_expired_cert")

    @block_expired_cert.setter
    def block_expired_cert(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "block_expired_cert", value)

    @property
    @pulumi.getter(name="blockTimeoutCert")
    def block_timeout_cert(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        The BlockTimeoutCert param.
        """
        return pulumi.get(self, "block_timeout_cert")

    @block_timeout_cert.setter
    def block_timeout_cert(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "block_timeout_cert", value)

    @property
    @pulumi.getter(name="blockUnauthenticatedCert")
    def block_unauthenticated_cert(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        The BlockUnauthenticatedCert param.
        """
        return pulumi.get(self, "block_unauthenticated_cert")

    @block_unauthenticated_cert.setter
    def block_unauthenticated_cert(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "block_unauthenticated_cert", value)

    @property
    @pulumi.getter(name="blockUnknownCert")
    def block_unknown_cert(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        The BlockUnknownCert param.
        """
        return pulumi.get(self, "block_unknown_cert")

    @block_unknown_cert.setter
    def block_unknown_cert(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "block_unknown_cert", value)

    @property
    @pulumi.getter(name="caCertificates")
    def ca_certificates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CertificateProfileCaCertificateArgs']]]]:
        """
        The CaCertificates param.
        """
        return pulumi.get(self, "ca_certificates")

    @ca_certificates.setter
    def ca_certificates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CertificateProfileCaCertificateArgs']]]]):
        pulumi.set(self, "ca_certificates", value)

    @property
    @pulumi.getter(name="certStatusTimeout")
    def cert_status_timeout(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The CertStatusTimeout param.
        """
        return pulumi.get(self, "cert_status_timeout")

    @cert_status_timeout.setter
    def cert_status_timeout(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "cert_status_timeout", value)

    @property
    @pulumi.getter(name="crlReceiveTimeout")
    def crl_receive_timeout(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The CrlReceiveTimeout param.
        """
        return pulumi.get(self, "crl_receive_timeout")

    @crl_receive_timeout.setter
    def crl_receive_timeout(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "crl_receive_timeout", value)

    @property
    @pulumi.getter
    def device(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @device.setter
    def device(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "device", value)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The Domain param.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def folder(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The Folder param.
        """
        return pulumi.get(self, "folder")

    @folder.setter
    def folder(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "folder", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ocspReceiveTimeout")
    def ocsp_receive_timeout(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The OcspReceiveTimeout param.
        """
        return pulumi.get(self, "ocsp_receive_timeout")

    @ocsp_receive_timeout.setter
    def ocsp_receive_timeout(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "ocsp_receive_timeout", value)

    @property
    @pulumi.getter
    def snippet(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The Snippet param.
        """
        return pulumi.get(self, "snippet")

    @snippet.setter
    def snippet(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "snippet", value)

    @property
    @pulumi.getter
    def tfid(self) -> Optional[pulumi.Input[builtins.str]]:
        return pulumi.get(self, "tfid")

    @tfid.setter
    def tfid(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "tfid", value)

    @property
    @pulumi.getter(name="useCrl")
    def use_crl(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        The UseCrl param.
        """
        return pulumi.get(self, "use_crl")

    @use_crl.setter
    def use_crl(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "use_crl", value)

    @property
    @pulumi.getter(name="useOcsp")
    def use_ocsp(self) -> Optional[pulumi.Input[builtins.bool]]:
        """
        The UseOcsp param.
        """
        return pulumi.get(self, "use_ocsp")

    @use_ocsp.setter
    def use_ocsp(self, value: Optional[pulumi.Input[builtins.bool]]):
        pulumi.set(self, "use_ocsp", value)

    @property
    @pulumi.getter(name="usernameField")
    def username_field(self) -> Optional[pulumi.Input['CertificateProfileUsernameFieldArgs']]:
        """
        The UsernameField param.
        """
        return pulumi.get(self, "username_field")

    @username_field.setter
    def username_field(self, value: Optional[pulumi.Input['CertificateProfileUsernameFieldArgs']]):
        pulumi.set(self, "username_field", value)


@pulumi.type_token("scm:index/certificateProfile:CertificateProfile")
class CertificateProfile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 block_expired_cert: Optional[pulumi.Input[builtins.bool]] = None,
                 block_timeout_cert: Optional[pulumi.Input[builtins.bool]] = None,
                 block_unauthenticated_cert: Optional[pulumi.Input[builtins.bool]] = None,
                 block_unknown_cert: Optional[pulumi.Input[builtins.bool]] = None,
                 ca_certificates: Optional[pulumi.Input[Sequence[pulumi.Input[Union['CertificateProfileCaCertificateArgs', 'CertificateProfileCaCertificateArgsDict']]]]] = None,
                 cert_status_timeout: Optional[pulumi.Input[builtins.str]] = None,
                 crl_receive_timeout: Optional[pulumi.Input[builtins.str]] = None,
                 device: Optional[pulumi.Input[builtins.str]] = None,
                 domain: Optional[pulumi.Input[builtins.str]] = None,
                 folder: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 ocsp_receive_timeout: Optional[pulumi.Input[builtins.str]] = None,
                 snippet: Optional[pulumi.Input[builtins.str]] = None,
                 use_crl: Optional[pulumi.Input[builtins.bool]] = None,
                 use_ocsp: Optional[pulumi.Input[builtins.bool]] = None,
                 username_field: Optional[pulumi.Input[Union['CertificateProfileUsernameFieldArgs', 'CertificateProfileUsernameFieldArgsDict']]] = None,
                 __props__=None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.CertificateProfile("example")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.bool] block_expired_cert: The BlockExpiredCert param.
        :param pulumi.Input[builtins.bool] block_timeout_cert: The BlockTimeoutCert param.
        :param pulumi.Input[builtins.bool] block_unauthenticated_cert: The BlockUnauthenticatedCert param.
        :param pulumi.Input[builtins.bool] block_unknown_cert: The BlockUnknownCert param.
        :param pulumi.Input[Sequence[pulumi.Input[Union['CertificateProfileCaCertificateArgs', 'CertificateProfileCaCertificateArgsDict']]]] ca_certificates: The CaCertificates param.
        :param pulumi.Input[builtins.str] cert_status_timeout: The CertStatusTimeout param.
        :param pulumi.Input[builtins.str] crl_receive_timeout: The CrlReceiveTimeout param.
        :param pulumi.Input[builtins.str] device: The Device param.
        :param pulumi.Input[builtins.str] domain: The Domain param.
        :param pulumi.Input[builtins.str] folder: The Folder param.
        :param pulumi.Input[builtins.str] name: Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
        :param pulumi.Input[builtins.str] ocsp_receive_timeout: The OcspReceiveTimeout param.
        :param pulumi.Input[builtins.str] snippet: The Snippet param.
        :param pulumi.Input[builtins.bool] use_crl: The UseCrl param.
        :param pulumi.Input[builtins.bool] use_ocsp: The UseOcsp param.
        :param pulumi.Input[Union['CertificateProfileUsernameFieldArgs', 'CertificateProfileUsernameFieldArgsDict']] username_field: The UsernameField param.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CertificateProfileArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.CertificateProfile("example")
        ```

        :param str resource_name: The name of the resource.
        :param CertificateProfileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CertificateProfileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 block_expired_cert: Optional[pulumi.Input[builtins.bool]] = None,
                 block_timeout_cert: Optional[pulumi.Input[builtins.bool]] = None,
                 block_unauthenticated_cert: Optional[pulumi.Input[builtins.bool]] = None,
                 block_unknown_cert: Optional[pulumi.Input[builtins.bool]] = None,
                 ca_certificates: Optional[pulumi.Input[Sequence[pulumi.Input[Union['CertificateProfileCaCertificateArgs', 'CertificateProfileCaCertificateArgsDict']]]]] = None,
                 cert_status_timeout: Optional[pulumi.Input[builtins.str]] = None,
                 crl_receive_timeout: Optional[pulumi.Input[builtins.str]] = None,
                 device: Optional[pulumi.Input[builtins.str]] = None,
                 domain: Optional[pulumi.Input[builtins.str]] = None,
                 folder: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 ocsp_receive_timeout: Optional[pulumi.Input[builtins.str]] = None,
                 snippet: Optional[pulumi.Input[builtins.str]] = None,
                 use_crl: Optional[pulumi.Input[builtins.bool]] = None,
                 use_ocsp: Optional[pulumi.Input[builtins.bool]] = None,
                 username_field: Optional[pulumi.Input[Union['CertificateProfileUsernameFieldArgs', 'CertificateProfileUsernameFieldArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CertificateProfileArgs.__new__(CertificateProfileArgs)

            __props__.__dict__["block_expired_cert"] = block_expired_cert
            __props__.__dict__["block_timeout_cert"] = block_timeout_cert
            __props__.__dict__["block_unauthenticated_cert"] = block_unauthenticated_cert
            __props__.__dict__["block_unknown_cert"] = block_unknown_cert
            if ca_certificates is None and not opts.urn:
                raise TypeError("Missing required property 'ca_certificates'")
            __props__.__dict__["ca_certificates"] = ca_certificates
            __props__.__dict__["cert_status_timeout"] = cert_status_timeout
            __props__.__dict__["crl_receive_timeout"] = crl_receive_timeout
            __props__.__dict__["device"] = device
            __props__.__dict__["domain"] = domain
            __props__.__dict__["folder"] = folder
            __props__.__dict__["name"] = name
            __props__.__dict__["ocsp_receive_timeout"] = ocsp_receive_timeout
            __props__.__dict__["snippet"] = snippet
            __props__.__dict__["use_crl"] = use_crl
            __props__.__dict__["use_ocsp"] = use_ocsp
            __props__.__dict__["username_field"] = username_field
            __props__.__dict__["tfid"] = None
        super(CertificateProfile, __self__).__init__(
            'scm:index/certificateProfile:CertificateProfile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            block_expired_cert: Optional[pulumi.Input[builtins.bool]] = None,
            block_timeout_cert: Optional[pulumi.Input[builtins.bool]] = None,
            block_unauthenticated_cert: Optional[pulumi.Input[builtins.bool]] = None,
            block_unknown_cert: Optional[pulumi.Input[builtins.bool]] = None,
            ca_certificates: Optional[pulumi.Input[Sequence[pulumi.Input[Union['CertificateProfileCaCertificateArgs', 'CertificateProfileCaCertificateArgsDict']]]]] = None,
            cert_status_timeout: Optional[pulumi.Input[builtins.str]] = None,
            crl_receive_timeout: Optional[pulumi.Input[builtins.str]] = None,
            device: Optional[pulumi.Input[builtins.str]] = None,
            domain: Optional[pulumi.Input[builtins.str]] = None,
            folder: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            ocsp_receive_timeout: Optional[pulumi.Input[builtins.str]] = None,
            snippet: Optional[pulumi.Input[builtins.str]] = None,
            tfid: Optional[pulumi.Input[builtins.str]] = None,
            use_crl: Optional[pulumi.Input[builtins.bool]] = None,
            use_ocsp: Optional[pulumi.Input[builtins.bool]] = None,
            username_field: Optional[pulumi.Input[Union['CertificateProfileUsernameFieldArgs', 'CertificateProfileUsernameFieldArgsDict']]] = None) -> 'CertificateProfile':
        """
        Get an existing CertificateProfile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.bool] block_expired_cert: The BlockExpiredCert param.
        :param pulumi.Input[builtins.bool] block_timeout_cert: The BlockTimeoutCert param.
        :param pulumi.Input[builtins.bool] block_unauthenticated_cert: The BlockUnauthenticatedCert param.
        :param pulumi.Input[builtins.bool] block_unknown_cert: The BlockUnknownCert param.
        :param pulumi.Input[Sequence[pulumi.Input[Union['CertificateProfileCaCertificateArgs', 'CertificateProfileCaCertificateArgsDict']]]] ca_certificates: The CaCertificates param.
        :param pulumi.Input[builtins.str] cert_status_timeout: The CertStatusTimeout param.
        :param pulumi.Input[builtins.str] crl_receive_timeout: The CrlReceiveTimeout param.
        :param pulumi.Input[builtins.str] device: The Device param.
        :param pulumi.Input[builtins.str] domain: The Domain param.
        :param pulumi.Input[builtins.str] folder: The Folder param.
        :param pulumi.Input[builtins.str] name: Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
        :param pulumi.Input[builtins.str] ocsp_receive_timeout: The OcspReceiveTimeout param.
        :param pulumi.Input[builtins.str] snippet: The Snippet param.
        :param pulumi.Input[builtins.bool] use_crl: The UseCrl param.
        :param pulumi.Input[builtins.bool] use_ocsp: The UseOcsp param.
        :param pulumi.Input[Union['CertificateProfileUsernameFieldArgs', 'CertificateProfileUsernameFieldArgsDict']] username_field: The UsernameField param.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CertificateProfileState.__new__(_CertificateProfileState)

        __props__.__dict__["block_expired_cert"] = block_expired_cert
        __props__.__dict__["block_timeout_cert"] = block_timeout_cert
        __props__.__dict__["block_unauthenticated_cert"] = block_unauthenticated_cert
        __props__.__dict__["block_unknown_cert"] = block_unknown_cert
        __props__.__dict__["ca_certificates"] = ca_certificates
        __props__.__dict__["cert_status_timeout"] = cert_status_timeout
        __props__.__dict__["crl_receive_timeout"] = crl_receive_timeout
        __props__.__dict__["device"] = device
        __props__.__dict__["domain"] = domain
        __props__.__dict__["folder"] = folder
        __props__.__dict__["name"] = name
        __props__.__dict__["ocsp_receive_timeout"] = ocsp_receive_timeout
        __props__.__dict__["snippet"] = snippet
        __props__.__dict__["tfid"] = tfid
        __props__.__dict__["use_crl"] = use_crl
        __props__.__dict__["use_ocsp"] = use_ocsp
        __props__.__dict__["username_field"] = username_field
        return CertificateProfile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="blockExpiredCert")
    def block_expired_cert(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        The BlockExpiredCert param.
        """
        return pulumi.get(self, "block_expired_cert")

    @property
    @pulumi.getter(name="blockTimeoutCert")
    def block_timeout_cert(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        The BlockTimeoutCert param.
        """
        return pulumi.get(self, "block_timeout_cert")

    @property
    @pulumi.getter(name="blockUnauthenticatedCert")
    def block_unauthenticated_cert(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        The BlockUnauthenticatedCert param.
        """
        return pulumi.get(self, "block_unauthenticated_cert")

    @property
    @pulumi.getter(name="blockUnknownCert")
    def block_unknown_cert(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        The BlockUnknownCert param.
        """
        return pulumi.get(self, "block_unknown_cert")

    @property
    @pulumi.getter(name="caCertificates")
    def ca_certificates(self) -> pulumi.Output[Sequence['outputs.CertificateProfileCaCertificate']]:
        """
        The CaCertificates param.
        """
        return pulumi.get(self, "ca_certificates")

    @property
    @pulumi.getter(name="certStatusTimeout")
    def cert_status_timeout(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The CertStatusTimeout param.
        """
        return pulumi.get(self, "cert_status_timeout")

    @property
    @pulumi.getter(name="crlReceiveTimeout")
    def crl_receive_timeout(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The CrlReceiveTimeout param.
        """
        return pulumi.get(self, "crl_receive_timeout")

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The Domain param.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def folder(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The Folder param.
        """
        return pulumi.get(self, "folder")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ocspReceiveTimeout")
    def ocsp_receive_timeout(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The OcspReceiveTimeout param.
        """
        return pulumi.get(self, "ocsp_receive_timeout")

    @property
    @pulumi.getter
    def snippet(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The Snippet param.
        """
        return pulumi.get(self, "snippet")

    @property
    @pulumi.getter
    def tfid(self) -> pulumi.Output[builtins.str]:
        return pulumi.get(self, "tfid")

    @property
    @pulumi.getter(name="useCrl")
    def use_crl(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        The UseCrl param.
        """
        return pulumi.get(self, "use_crl")

    @property
    @pulumi.getter(name="useOcsp")
    def use_ocsp(self) -> pulumi.Output[Optional[builtins.bool]]:
        """
        The UseOcsp param.
        """
        return pulumi.get(self, "use_ocsp")

    @property
    @pulumi.getter(name="usernameField")
    def username_field(self) -> pulumi.Output[Optional['outputs.CertificateProfileUsernameField']]:
        """
        The UsernameField param.
        """
        return pulumi.get(self, "username_field")

