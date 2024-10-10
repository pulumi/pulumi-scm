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
    'GetDecryptionRuleResult',
    'AwaitableGetDecryptionRuleResult',
    'get_decryption_rule',
    'get_decryption_rule_output',
]

@pulumi.output_type
class GetDecryptionRuleResult:
    """
    A collection of values returned by getDecryptionRule.
    """
    def __init__(__self__, action=None, categories=None, description=None, destination_hips=None, destinations=None, disabled=None, froms=None, id=None, log_fail=None, log_setting=None, log_success=None, name=None, negate_destination=None, negate_source=None, profile=None, services=None, source_hips=None, source_users=None, sources=None, tags=None, tfid=None, tos=None, type=None):
        if action and not isinstance(action, str):
            raise TypeError("Expected argument 'action' to be a str")
        pulumi.set(__self__, "action", action)
        if categories and not isinstance(categories, list):
            raise TypeError("Expected argument 'categories' to be a list")
        pulumi.set(__self__, "categories", categories)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if destination_hips and not isinstance(destination_hips, list):
            raise TypeError("Expected argument 'destination_hips' to be a list")
        pulumi.set(__self__, "destination_hips", destination_hips)
        if destinations and not isinstance(destinations, list):
            raise TypeError("Expected argument 'destinations' to be a list")
        pulumi.set(__self__, "destinations", destinations)
        if disabled and not isinstance(disabled, bool):
            raise TypeError("Expected argument 'disabled' to be a bool")
        pulumi.set(__self__, "disabled", disabled)
        if froms and not isinstance(froms, list):
            raise TypeError("Expected argument 'froms' to be a list")
        pulumi.set(__self__, "froms", froms)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if log_fail and not isinstance(log_fail, bool):
            raise TypeError("Expected argument 'log_fail' to be a bool")
        pulumi.set(__self__, "log_fail", log_fail)
        if log_setting and not isinstance(log_setting, str):
            raise TypeError("Expected argument 'log_setting' to be a str")
        pulumi.set(__self__, "log_setting", log_setting)
        if log_success and not isinstance(log_success, bool):
            raise TypeError("Expected argument 'log_success' to be a bool")
        pulumi.set(__self__, "log_success", log_success)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if negate_destination and not isinstance(negate_destination, bool):
            raise TypeError("Expected argument 'negate_destination' to be a bool")
        pulumi.set(__self__, "negate_destination", negate_destination)
        if negate_source and not isinstance(negate_source, bool):
            raise TypeError("Expected argument 'negate_source' to be a bool")
        pulumi.set(__self__, "negate_source", negate_source)
        if profile and not isinstance(profile, str):
            raise TypeError("Expected argument 'profile' to be a str")
        pulumi.set(__self__, "profile", profile)
        if services and not isinstance(services, list):
            raise TypeError("Expected argument 'services' to be a list")
        pulumi.set(__self__, "services", services)
        if source_hips and not isinstance(source_hips, list):
            raise TypeError("Expected argument 'source_hips' to be a list")
        pulumi.set(__self__, "source_hips", source_hips)
        if source_users and not isinstance(source_users, list):
            raise TypeError("Expected argument 'source_users' to be a list")
        pulumi.set(__self__, "source_users", source_users)
        if sources and not isinstance(sources, list):
            raise TypeError("Expected argument 'sources' to be a list")
        pulumi.set(__self__, "sources", sources)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)
        if tos and not isinstance(tos, list):
            raise TypeError("Expected argument 'tos' to be a list")
        pulumi.set(__self__, "tos", tos)
        if type and not isinstance(type, dict):
            raise TypeError("Expected argument 'type' to be a dict")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def action(self) -> str:
        """
        The Action param. String must be one of these: `"decrypt"`, `"no-decrypt"`.
        """
        return pulumi.get(self, "action")

    @property
    @pulumi.getter
    def categories(self) -> Sequence[str]:
        """
        The Categories param.
        """
        return pulumi.get(self, "categories")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The Description param.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="destinationHips")
    def destination_hips(self) -> Sequence[str]:
        """
        The DestinationHips param.
        """
        return pulumi.get(self, "destination_hips")

    @property
    @pulumi.getter
    def destinations(self) -> Sequence[str]:
        """
        The Destinations param.
        """
        return pulumi.get(self, "destinations")

    @property
    @pulumi.getter
    def disabled(self) -> bool:
        """
        The Disabled param.
        """
        return pulumi.get(self, "disabled")

    @property
    @pulumi.getter
    def froms(self) -> Sequence[str]:
        """
        The Froms param.
        """
        return pulumi.get(self, "froms")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The Id param.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="logFail")
    def log_fail(self) -> bool:
        """
        The LogFail param.
        """
        return pulumi.get(self, "log_fail")

    @property
    @pulumi.getter(name="logSetting")
    def log_setting(self) -> str:
        """
        The LogSetting param.
        """
        return pulumi.get(self, "log_setting")

    @property
    @pulumi.getter(name="logSuccess")
    def log_success(self) -> bool:
        """
        The LogSuccess param.
        """
        return pulumi.get(self, "log_success")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The Name param.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="negateDestination")
    def negate_destination(self) -> bool:
        """
        The NegateDestination param.
        """
        return pulumi.get(self, "negate_destination")

    @property
    @pulumi.getter(name="negateSource")
    def negate_source(self) -> bool:
        """
        The NegateSource param.
        """
        return pulumi.get(self, "negate_source")

    @property
    @pulumi.getter
    def profile(self) -> str:
        """
        The Profile param.
        """
        return pulumi.get(self, "profile")

    @property
    @pulumi.getter
    def services(self) -> Sequence[str]:
        """
        The Services param.
        """
        return pulumi.get(self, "services")

    @property
    @pulumi.getter(name="sourceHips")
    def source_hips(self) -> Sequence[str]:
        """
        The SourceHips param.
        """
        return pulumi.get(self, "source_hips")

    @property
    @pulumi.getter(name="sourceUsers")
    def source_users(self) -> Sequence[str]:
        """
        The SourceUsers param.
        """
        return pulumi.get(self, "source_users")

    @property
    @pulumi.getter
    def sources(self) -> Sequence[str]:
        """
        The Sources param.
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
    def tfid(self) -> str:
        return pulumi.get(self, "tfid")

    @property
    @pulumi.getter
    def tos(self) -> Sequence[str]:
        """
        The Tos param.
        """
        return pulumi.get(self, "tos")

    @property
    @pulumi.getter
    def type(self) -> 'outputs.GetDecryptionRuleTypeResult':
        """
        The Type param.
        """
        return pulumi.get(self, "type")


class AwaitableGetDecryptionRuleResult(GetDecryptionRuleResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDecryptionRuleResult(
            action=self.action,
            categories=self.categories,
            description=self.description,
            destination_hips=self.destination_hips,
            destinations=self.destinations,
            disabled=self.disabled,
            froms=self.froms,
            id=self.id,
            log_fail=self.log_fail,
            log_setting=self.log_setting,
            log_success=self.log_success,
            name=self.name,
            negate_destination=self.negate_destination,
            negate_source=self.negate_source,
            profile=self.profile,
            services=self.services,
            source_hips=self.source_hips,
            source_users=self.source_users,
            sources=self.sources,
            tags=self.tags,
            tfid=self.tfid,
            tos=self.tos,
            type=self.type)


def get_decryption_rule(id: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDecryptionRuleResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_decryption_rule(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getDecryptionRule:getDecryptionRule', __args__, opts=opts, typ=GetDecryptionRuleResult).value

    return AwaitableGetDecryptionRuleResult(
        action=pulumi.get(__ret__, 'action'),
        categories=pulumi.get(__ret__, 'categories'),
        description=pulumi.get(__ret__, 'description'),
        destination_hips=pulumi.get(__ret__, 'destination_hips'),
        destinations=pulumi.get(__ret__, 'destinations'),
        disabled=pulumi.get(__ret__, 'disabled'),
        froms=pulumi.get(__ret__, 'froms'),
        id=pulumi.get(__ret__, 'id'),
        log_fail=pulumi.get(__ret__, 'log_fail'),
        log_setting=pulumi.get(__ret__, 'log_setting'),
        log_success=pulumi.get(__ret__, 'log_success'),
        name=pulumi.get(__ret__, 'name'),
        negate_destination=pulumi.get(__ret__, 'negate_destination'),
        negate_source=pulumi.get(__ret__, 'negate_source'),
        profile=pulumi.get(__ret__, 'profile'),
        services=pulumi.get(__ret__, 'services'),
        source_hips=pulumi.get(__ret__, 'source_hips'),
        source_users=pulumi.get(__ret__, 'source_users'),
        sources=pulumi.get(__ret__, 'sources'),
        tags=pulumi.get(__ret__, 'tags'),
        tfid=pulumi.get(__ret__, 'tfid'),
        tos=pulumi.get(__ret__, 'tos'),
        type=pulumi.get(__ret__, 'type'))
def get_decryption_rule_output(id: Optional[pulumi.Input[str]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDecryptionRuleResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_decryption_rule(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('scm:index/getDecryptionRule:getDecryptionRule', __args__, opts=opts, typ=GetDecryptionRuleResult)
    return __ret__.apply(lambda __response__: GetDecryptionRuleResult(
        action=pulumi.get(__response__, 'action'),
        categories=pulumi.get(__response__, 'categories'),
        description=pulumi.get(__response__, 'description'),
        destination_hips=pulumi.get(__response__, 'destination_hips'),
        destinations=pulumi.get(__response__, 'destinations'),
        disabled=pulumi.get(__response__, 'disabled'),
        froms=pulumi.get(__response__, 'froms'),
        id=pulumi.get(__response__, 'id'),
        log_fail=pulumi.get(__response__, 'log_fail'),
        log_setting=pulumi.get(__response__, 'log_setting'),
        log_success=pulumi.get(__response__, 'log_success'),
        name=pulumi.get(__response__, 'name'),
        negate_destination=pulumi.get(__response__, 'negate_destination'),
        negate_source=pulumi.get(__response__, 'negate_source'),
        profile=pulumi.get(__response__, 'profile'),
        services=pulumi.get(__response__, 'services'),
        source_hips=pulumi.get(__response__, 'source_hips'),
        source_users=pulumi.get(__response__, 'source_users'),
        sources=pulumi.get(__response__, 'sources'),
        tags=pulumi.get(__response__, 'tags'),
        tfid=pulumi.get(__response__, 'tfid'),
        tos=pulumi.get(__response__, 'tos'),
        type=pulumi.get(__response__, 'type')))
