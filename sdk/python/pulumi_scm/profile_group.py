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

__all__ = ['ProfileGroupArgs', 'ProfileGroup']

@pulumi.input_type
class ProfileGroupArgs:
    def __init__(__self__, *,
                 device: Optional[pulumi.Input[str]] = None,
                 dns_securities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 file_blockings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 saas_securities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 spywares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 url_filterings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 virus_and_wildfire_analyses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 vulnerabilities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a ProfileGroup resource.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] dns_securities: The DnsSecurities param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] file_blockings: The FileBlockings param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[str] name: The Name param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] saas_securities: The SaasSecurities param.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] spywares: The Spywares param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] url_filterings: The UrlFilterings param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] virus_and_wildfire_analyses: The VirusAndWildfireAnalyses param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] vulnerabilities: The Vulnerabilities param.
        """
        if device is not None:
            pulumi.set(__self__, "device", device)
        if dns_securities is not None:
            pulumi.set(__self__, "dns_securities", dns_securities)
        if file_blockings is not None:
            pulumi.set(__self__, "file_blockings", file_blockings)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if saas_securities is not None:
            pulumi.set(__self__, "saas_securities", saas_securities)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)
        if spywares is not None:
            pulumi.set(__self__, "spywares", spywares)
        if url_filterings is not None:
            pulumi.set(__self__, "url_filterings", url_filterings)
        if virus_and_wildfire_analyses is not None:
            pulumi.set(__self__, "virus_and_wildfire_analyses", virus_and_wildfire_analyses)
        if vulnerabilities is not None:
            pulumi.set(__self__, "vulnerabilities", vulnerabilities)

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
    @pulumi.getter(name="dnsSecurities")
    def dns_securities(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The DnsSecurities param.
        """
        return pulumi.get(self, "dns_securities")

    @dns_securities.setter
    def dns_securities(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "dns_securities", value)

    @property
    @pulumi.getter(name="fileBlockings")
    def file_blockings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The FileBlockings param.
        """
        return pulumi.get(self, "file_blockings")

    @file_blockings.setter
    def file_blockings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "file_blockings", value)

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
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The Name param.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="saasSecurities")
    def saas_securities(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The SaasSecurities param.
        """
        return pulumi.get(self, "saas_securities")

    @saas_securities.setter
    def saas_securities(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "saas_securities", value)

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
    def spywares(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The Spywares param.
        """
        return pulumi.get(self, "spywares")

    @spywares.setter
    def spywares(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "spywares", value)

    @property
    @pulumi.getter(name="urlFilterings")
    def url_filterings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The UrlFilterings param.
        """
        return pulumi.get(self, "url_filterings")

    @url_filterings.setter
    def url_filterings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "url_filterings", value)

    @property
    @pulumi.getter(name="virusAndWildfireAnalyses")
    def virus_and_wildfire_analyses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The VirusAndWildfireAnalyses param.
        """
        return pulumi.get(self, "virus_and_wildfire_analyses")

    @virus_and_wildfire_analyses.setter
    def virus_and_wildfire_analyses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "virus_and_wildfire_analyses", value)

    @property
    @pulumi.getter
    def vulnerabilities(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The Vulnerabilities param.
        """
        return pulumi.get(self, "vulnerabilities")

    @vulnerabilities.setter
    def vulnerabilities(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "vulnerabilities", value)


@pulumi.input_type
class _ProfileGroupState:
    def __init__(__self__, *,
                 device: Optional[pulumi.Input[str]] = None,
                 dns_securities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 file_blockings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 saas_securities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 spywares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 tfid: Optional[pulumi.Input[str]] = None,
                 url_filterings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 virus_and_wildfire_analyses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 vulnerabilities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering ProfileGroup resources.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] dns_securities: The DnsSecurities param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] file_blockings: The FileBlockings param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[str] name: The Name param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] saas_securities: The SaasSecurities param.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] spywares: The Spywares param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] url_filterings: The UrlFilterings param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] virus_and_wildfire_analyses: The VirusAndWildfireAnalyses param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] vulnerabilities: The Vulnerabilities param.
        """
        if device is not None:
            pulumi.set(__self__, "device", device)
        if dns_securities is not None:
            pulumi.set(__self__, "dns_securities", dns_securities)
        if file_blockings is not None:
            pulumi.set(__self__, "file_blockings", file_blockings)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if saas_securities is not None:
            pulumi.set(__self__, "saas_securities", saas_securities)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)
        if spywares is not None:
            pulumi.set(__self__, "spywares", spywares)
        if tfid is not None:
            pulumi.set(__self__, "tfid", tfid)
        if url_filterings is not None:
            pulumi.set(__self__, "url_filterings", url_filterings)
        if virus_and_wildfire_analyses is not None:
            pulumi.set(__self__, "virus_and_wildfire_analyses", virus_and_wildfire_analyses)
        if vulnerabilities is not None:
            pulumi.set(__self__, "vulnerabilities", vulnerabilities)

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
    @pulumi.getter(name="dnsSecurities")
    def dns_securities(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The DnsSecurities param.
        """
        return pulumi.get(self, "dns_securities")

    @dns_securities.setter
    def dns_securities(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "dns_securities", value)

    @property
    @pulumi.getter(name="fileBlockings")
    def file_blockings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The FileBlockings param.
        """
        return pulumi.get(self, "file_blockings")

    @file_blockings.setter
    def file_blockings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "file_blockings", value)

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
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The Name param.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="saasSecurities")
    def saas_securities(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The SaasSecurities param.
        """
        return pulumi.get(self, "saas_securities")

    @saas_securities.setter
    def saas_securities(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "saas_securities", value)

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
    def spywares(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The Spywares param.
        """
        return pulumi.get(self, "spywares")

    @spywares.setter
    def spywares(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "spywares", value)

    @property
    @pulumi.getter
    def tfid(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "tfid")

    @tfid.setter
    def tfid(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tfid", value)

    @property
    @pulumi.getter(name="urlFilterings")
    def url_filterings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The UrlFilterings param.
        """
        return pulumi.get(self, "url_filterings")

    @url_filterings.setter
    def url_filterings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "url_filterings", value)

    @property
    @pulumi.getter(name="virusAndWildfireAnalyses")
    def virus_and_wildfire_analyses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The VirusAndWildfireAnalyses param.
        """
        return pulumi.get(self, "virus_and_wildfire_analyses")

    @virus_and_wildfire_analyses.setter
    def virus_and_wildfire_analyses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "virus_and_wildfire_analyses", value)

    @property
    @pulumi.getter
    def vulnerabilities(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The Vulnerabilities param.
        """
        return pulumi.get(self, "vulnerabilities")

    @vulnerabilities.setter
    def vulnerabilities(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "vulnerabilities", value)


class ProfileGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 dns_securities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 file_blockings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 saas_securities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 spywares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 url_filterings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 virus_and_wildfire_analyses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 vulnerabilities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.ProfileGroup("example")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] dns_securities: The DnsSecurities param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] file_blockings: The FileBlockings param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[str] name: The Name param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] saas_securities: The SaasSecurities param.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] spywares: The Spywares param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] url_filterings: The UrlFilterings param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] virus_and_wildfire_analyses: The VirusAndWildfireAnalyses param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] vulnerabilities: The Vulnerabilities param.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProfileGroupArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.ProfileGroup("example")
        ```

        :param str resource_name: The name of the resource.
        :param ProfileGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProfileGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 dns_securities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 file_blockings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 saas_securities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 spywares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 url_filterings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 virus_and_wildfire_analyses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 vulnerabilities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProfileGroupArgs.__new__(ProfileGroupArgs)

            __props__.__dict__["device"] = device
            __props__.__dict__["dns_securities"] = dns_securities
            __props__.__dict__["file_blockings"] = file_blockings
            __props__.__dict__["folder"] = folder
            __props__.__dict__["name"] = name
            __props__.__dict__["saas_securities"] = saas_securities
            __props__.__dict__["snippet"] = snippet
            __props__.__dict__["spywares"] = spywares
            __props__.__dict__["url_filterings"] = url_filterings
            __props__.__dict__["virus_and_wildfire_analyses"] = virus_and_wildfire_analyses
            __props__.__dict__["vulnerabilities"] = vulnerabilities
            __props__.__dict__["tfid"] = None
        super(ProfileGroup, __self__).__init__(
            'scm:index/profileGroup:ProfileGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            device: Optional[pulumi.Input[str]] = None,
            dns_securities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            file_blockings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            folder: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            saas_securities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            snippet: Optional[pulumi.Input[str]] = None,
            spywares: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            tfid: Optional[pulumi.Input[str]] = None,
            url_filterings: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            virus_and_wildfire_analyses: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            vulnerabilities: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'ProfileGroup':
        """
        Get an existing ProfileGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] dns_securities: The DnsSecurities param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] file_blockings: The FileBlockings param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[str] name: The Name param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] saas_securities: The SaasSecurities param.
        :param pulumi.Input[str] snippet: The Snippet param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] spywares: The Spywares param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] url_filterings: The UrlFilterings param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] virus_and_wildfire_analyses: The VirusAndWildfireAnalyses param.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] vulnerabilities: The Vulnerabilities param.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ProfileGroupState.__new__(_ProfileGroupState)

        __props__.__dict__["device"] = device
        __props__.__dict__["dns_securities"] = dns_securities
        __props__.__dict__["file_blockings"] = file_blockings
        __props__.__dict__["folder"] = folder
        __props__.__dict__["name"] = name
        __props__.__dict__["saas_securities"] = saas_securities
        __props__.__dict__["snippet"] = snippet
        __props__.__dict__["spywares"] = spywares
        __props__.__dict__["tfid"] = tfid
        __props__.__dict__["url_filterings"] = url_filterings
        __props__.__dict__["virus_and_wildfire_analyses"] = virus_and_wildfire_analyses
        __props__.__dict__["vulnerabilities"] = vulnerabilities
        return ProfileGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[str]]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter(name="dnsSecurities")
    def dns_securities(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The DnsSecurities param.
        """
        return pulumi.get(self, "dns_securities")

    @property
    @pulumi.getter(name="fileBlockings")
    def file_blockings(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The FileBlockings param.
        """
        return pulumi.get(self, "file_blockings")

    @property
    @pulumi.getter
    def folder(self) -> pulumi.Output[Optional[str]]:
        """
        The Folder param.
        """
        return pulumi.get(self, "folder")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The Name param.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="saasSecurities")
    def saas_securities(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The SaasSecurities param.
        """
        return pulumi.get(self, "saas_securities")

    @property
    @pulumi.getter
    def snippet(self) -> pulumi.Output[Optional[str]]:
        """
        The Snippet param.
        """
        return pulumi.get(self, "snippet")

    @property
    @pulumi.getter
    def spywares(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The Spywares param.
        """
        return pulumi.get(self, "spywares")

    @property
    @pulumi.getter
    def tfid(self) -> pulumi.Output[str]:
        return pulumi.get(self, "tfid")

    @property
    @pulumi.getter(name="urlFilterings")
    def url_filterings(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The UrlFilterings param.
        """
        return pulumi.get(self, "url_filterings")

    @property
    @pulumi.getter(name="virusAndWildfireAnalyses")
    def virus_and_wildfire_analyses(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The VirusAndWildfireAnalyses param.
        """
        return pulumi.get(self, "virus_and_wildfire_analyses")

    @property
    @pulumi.getter
    def vulnerabilities(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The Vulnerabilities param.
        """
        return pulumi.get(self, "vulnerabilities")

