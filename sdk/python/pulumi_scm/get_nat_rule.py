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
    'GetNatRuleResult',
    'AwaitableGetNatRuleResult',
    'get_nat_rule',
    'get_nat_rule_output',
]

@pulumi.output_type
class GetNatRuleResult:
    """
    A collection of values returned by getNatRule.
    """
    def __init__(__self__, active_active_device_binding=None, description=None, destination_translation=None, destinations=None, device=None, disabled=None, dynamic_destination_translation=None, folder=None, froms=None, group_tag=None, id=None, name=None, nat_type=None, service=None, snippet=None, source_translation=None, sources=None, tags=None, target=None, tfid=None, to_interface=None, tos=None):
        if active_active_device_binding and not isinstance(active_active_device_binding, str):
            raise TypeError("Expected argument 'active_active_device_binding' to be a str")
        pulumi.set(__self__, "active_active_device_binding", active_active_device_binding)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if destination_translation and not isinstance(destination_translation, dict):
            raise TypeError("Expected argument 'destination_translation' to be a dict")
        pulumi.set(__self__, "destination_translation", destination_translation)
        if destinations and not isinstance(destinations, list):
            raise TypeError("Expected argument 'destinations' to be a list")
        pulumi.set(__self__, "destinations", destinations)
        if device and not isinstance(device, str):
            raise TypeError("Expected argument 'device' to be a str")
        pulumi.set(__self__, "device", device)
        if disabled and not isinstance(disabled, bool):
            raise TypeError("Expected argument 'disabled' to be a bool")
        pulumi.set(__self__, "disabled", disabled)
        if dynamic_destination_translation and not isinstance(dynamic_destination_translation, dict):
            raise TypeError("Expected argument 'dynamic_destination_translation' to be a dict")
        pulumi.set(__self__, "dynamic_destination_translation", dynamic_destination_translation)
        if folder and not isinstance(folder, str):
            raise TypeError("Expected argument 'folder' to be a str")
        pulumi.set(__self__, "folder", folder)
        if froms and not isinstance(froms, list):
            raise TypeError("Expected argument 'froms' to be a list")
        pulumi.set(__self__, "froms", froms)
        if group_tag and not isinstance(group_tag, str):
            raise TypeError("Expected argument 'group_tag' to be a str")
        pulumi.set(__self__, "group_tag", group_tag)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if nat_type and not isinstance(nat_type, str):
            raise TypeError("Expected argument 'nat_type' to be a str")
        pulumi.set(__self__, "nat_type", nat_type)
        if service and not isinstance(service, str):
            raise TypeError("Expected argument 'service' to be a str")
        pulumi.set(__self__, "service", service)
        if snippet and not isinstance(snippet, str):
            raise TypeError("Expected argument 'snippet' to be a str")
        pulumi.set(__self__, "snippet", snippet)
        if source_translation and not isinstance(source_translation, dict):
            raise TypeError("Expected argument 'source_translation' to be a dict")
        pulumi.set(__self__, "source_translation", source_translation)
        if sources and not isinstance(sources, list):
            raise TypeError("Expected argument 'sources' to be a list")
        pulumi.set(__self__, "sources", sources)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if target and not isinstance(target, dict):
            raise TypeError("Expected argument 'target' to be a dict")
        pulumi.set(__self__, "target", target)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)
        if to_interface and not isinstance(to_interface, str):
            raise TypeError("Expected argument 'to_interface' to be a str")
        pulumi.set(__self__, "to_interface", to_interface)
        if tos and not isinstance(tos, list):
            raise TypeError("Expected argument 'tos' to be a list")
        pulumi.set(__self__, "tos", tos)

    @property
    @pulumi.getter(name="activeActiveDeviceBinding")
    def active_active_device_binding(self) -> str:
        """
        The ActiveActiveDeviceBinding param. String must be one of these: `"primary"`, `"both"`, `"0"`, `"1"`.
        """
        return pulumi.get(self, "active_active_device_binding")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The Description param.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="destinationTranslation")
    def destination_translation(self) -> 'outputs.GetNatRuleDestinationTranslationResult':
        """
        Static destination translation parameter.
        """
        return pulumi.get(self, "destination_translation")

    @property
    @pulumi.getter
    def destinations(self) -> Sequence[str]:
        """
        The destination address(es). Individual elements in this list are subject to additional validation. String must be one of these: `"any"`.
        """
        return pulumi.get(self, "destinations")

    @property
    @pulumi.getter
    def device(self) -> str:
        """
        The device in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\\d-_\\. ]+$`.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def disabled(self) -> bool:
        """
        The Disabled param.
        """
        return pulumi.get(self, "disabled")

    @property
    @pulumi.getter(name="dynamicDestinationTranslation")
    def dynamic_destination_translation(self) -> 'outputs.GetNatRuleDynamicDestinationTranslationResult':
        """
        Dynamic destination translation parameter.
        """
        return pulumi.get(self, "dynamic_destination_translation")

    @property
    @pulumi.getter
    def folder(self) -> str:
        """
        The folder in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\\d-_\\. ]+$`.
        """
        return pulumi.get(self, "folder")

    @property
    @pulumi.getter
    def froms(self) -> Sequence[str]:
        """
        The source security zone(s). Individual elements in this list are subject to additional validation. String must be one of these: `"any"`.
        """
        return pulumi.get(self, "froms")

    @property
    @pulumi.getter(name="groupTag")
    def group_tag(self) -> str:
        """
        The GroupTag param.
        """
        return pulumi.get(self, "group_tag")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The Id param.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The Name param.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="natType")
    def nat_type(self) -> str:
        """
        The NatType param. String must be one of these: `"ipv4"`, `"nat64"`, `"nptv6"`.
        """
        return pulumi.get(self, "nat_type")

    @property
    @pulumi.getter
    def service(self) -> str:
        """
        The Service param.
        """
        return pulumi.get(self, "service")

    @property
    @pulumi.getter
    def snippet(self) -> str:
        """
        The snippet in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\\d-_\\. ]+$`.
        """
        return pulumi.get(self, "snippet")

    @property
    @pulumi.getter(name="sourceTranslation")
    def source_translation(self) -> 'outputs.GetNatRuleSourceTranslationResult':
        """
        The SourceTranslation param.
        """
        return pulumi.get(self, "source_translation")

    @property
    @pulumi.getter
    def sources(self) -> Sequence[str]:
        """
        The source address(es). Individual elements in this list are subject to additional validation. String must be one of these: `"any"`.
        """
        return pulumi.get(self, "sources")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        The Tags param.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def target(self) -> 'outputs.GetNatRuleTargetResult':
        """
        The Target param.
        """
        return pulumi.get(self, "target")

    @property
    @pulumi.getter
    def tfid(self) -> str:
        return pulumi.get(self, "tfid")

    @property
    @pulumi.getter(name="toInterface")
    def to_interface(self) -> str:
        """
        The ToInterface param. String must be one of these: `"any"`.
        """
        return pulumi.get(self, "to_interface")

    @property
    @pulumi.getter
    def tos(self) -> Sequence[str]:
        """
        The destination security zone(s).
        """
        return pulumi.get(self, "tos")


class AwaitableGetNatRuleResult(GetNatRuleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetNatRuleResult(
            active_active_device_binding=self.active_active_device_binding,
            description=self.description,
            destination_translation=self.destination_translation,
            destinations=self.destinations,
            device=self.device,
            disabled=self.disabled,
            dynamic_destination_translation=self.dynamic_destination_translation,
            folder=self.folder,
            froms=self.froms,
            group_tag=self.group_tag,
            id=self.id,
            name=self.name,
            nat_type=self.nat_type,
            service=self.service,
            snippet=self.snippet,
            source_translation=self.source_translation,
            sources=self.sources,
            tags=self.tags,
            target=self.target,
            tfid=self.tfid,
            to_interface=self.to_interface,
            tos=self.tos)


def get_nat_rule(id: Optional[str] = None,
                 opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetNatRuleResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_nat_rule(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getNatRule:getNatRule', __args__, opts=opts, typ=GetNatRuleResult).value

    return AwaitableGetNatRuleResult(
        active_active_device_binding=pulumi.get(__ret__, 'active_active_device_binding'),
        description=pulumi.get(__ret__, 'description'),
        destination_translation=pulumi.get(__ret__, 'destination_translation'),
        destinations=pulumi.get(__ret__, 'destinations'),
        device=pulumi.get(__ret__, 'device'),
        disabled=pulumi.get(__ret__, 'disabled'),
        dynamic_destination_translation=pulumi.get(__ret__, 'dynamic_destination_translation'),
        folder=pulumi.get(__ret__, 'folder'),
        froms=pulumi.get(__ret__, 'froms'),
        group_tag=pulumi.get(__ret__, 'group_tag'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        nat_type=pulumi.get(__ret__, 'nat_type'),
        service=pulumi.get(__ret__, 'service'),
        snippet=pulumi.get(__ret__, 'snippet'),
        source_translation=pulumi.get(__ret__, 'source_translation'),
        sources=pulumi.get(__ret__, 'sources'),
        tags=pulumi.get(__ret__, 'tags'),
        target=pulumi.get(__ret__, 'target'),
        tfid=pulumi.get(__ret__, 'tfid'),
        to_interface=pulumi.get(__ret__, 'to_interface'),
        tos=pulumi.get(__ret__, 'tos'))
def get_nat_rule_output(id: Optional[pulumi.Input[str]] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetNatRuleResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_nat_rule(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('scm:index/getNatRule:getNatRule', __args__, opts=opts, typ=GetNatRuleResult)
    return __ret__.apply(lambda __response__: GetNatRuleResult(
        active_active_device_binding=pulumi.get(__response__, 'active_active_device_binding'),
        description=pulumi.get(__response__, 'description'),
        destination_translation=pulumi.get(__response__, 'destination_translation'),
        destinations=pulumi.get(__response__, 'destinations'),
        device=pulumi.get(__response__, 'device'),
        disabled=pulumi.get(__response__, 'disabled'),
        dynamic_destination_translation=pulumi.get(__response__, 'dynamic_destination_translation'),
        folder=pulumi.get(__response__, 'folder'),
        froms=pulumi.get(__response__, 'froms'),
        group_tag=pulumi.get(__response__, 'group_tag'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        nat_type=pulumi.get(__response__, 'nat_type'),
        service=pulumi.get(__response__, 'service'),
        snippet=pulumi.get(__response__, 'snippet'),
        source_translation=pulumi.get(__response__, 'source_translation'),
        sources=pulumi.get(__response__, 'sources'),
        tags=pulumi.get(__response__, 'tags'),
        target=pulumi.get(__response__, 'target'),
        tfid=pulumi.get(__response__, 'tfid'),
        to_interface=pulumi.get(__response__, 'to_interface'),
        tos=pulumi.get(__response__, 'tos')))
