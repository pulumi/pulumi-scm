# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetUrlAccessProfileResult',
    'AwaitableGetUrlAccessProfileResult',
    'get_url_access_profile',
    'get_url_access_profile_output',
]

@pulumi.output_type
class GetUrlAccessProfileResult:
    """
    A collection of values returned by getUrlAccessProfile.
    """
    def __init__(__self__, alerts=None, allows=None, blocks=None, cloud_inline_cat=None, continues=None, credential_enforcement=None, description=None, id=None, local_inline_cat=None, log_container_page_only=None, log_http_hdr_referer=None, log_http_hdr_user_agent=None, log_http_hdr_xff=None, mlav_category_exceptions=None, name=None, safe_search_enforcement=None, tfid=None):
        if alerts and not isinstance(alerts, list):
            raise TypeError("Expected argument 'alerts' to be a list")
        pulumi.set(__self__, "alerts", alerts)
        if allows and not isinstance(allows, list):
            raise TypeError("Expected argument 'allows' to be a list")
        pulumi.set(__self__, "allows", allows)
        if blocks and not isinstance(blocks, list):
            raise TypeError("Expected argument 'blocks' to be a list")
        pulumi.set(__self__, "blocks", blocks)
        if cloud_inline_cat and not isinstance(cloud_inline_cat, bool):
            raise TypeError("Expected argument 'cloud_inline_cat' to be a bool")
        pulumi.set(__self__, "cloud_inline_cat", cloud_inline_cat)
        if continues and not isinstance(continues, list):
            raise TypeError("Expected argument 'continues' to be a list")
        pulumi.set(__self__, "continues", continues)
        if credential_enforcement and not isinstance(credential_enforcement, dict):
            raise TypeError("Expected argument 'credential_enforcement' to be a dict")
        pulumi.set(__self__, "credential_enforcement", credential_enforcement)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if local_inline_cat and not isinstance(local_inline_cat, bool):
            raise TypeError("Expected argument 'local_inline_cat' to be a bool")
        pulumi.set(__self__, "local_inline_cat", local_inline_cat)
        if log_container_page_only and not isinstance(log_container_page_only, bool):
            raise TypeError("Expected argument 'log_container_page_only' to be a bool")
        pulumi.set(__self__, "log_container_page_only", log_container_page_only)
        if log_http_hdr_referer and not isinstance(log_http_hdr_referer, bool):
            raise TypeError("Expected argument 'log_http_hdr_referer' to be a bool")
        pulumi.set(__self__, "log_http_hdr_referer", log_http_hdr_referer)
        if log_http_hdr_user_agent and not isinstance(log_http_hdr_user_agent, bool):
            raise TypeError("Expected argument 'log_http_hdr_user_agent' to be a bool")
        pulumi.set(__self__, "log_http_hdr_user_agent", log_http_hdr_user_agent)
        if log_http_hdr_xff and not isinstance(log_http_hdr_xff, bool):
            raise TypeError("Expected argument 'log_http_hdr_xff' to be a bool")
        pulumi.set(__self__, "log_http_hdr_xff", log_http_hdr_xff)
        if mlav_category_exceptions and not isinstance(mlav_category_exceptions, list):
            raise TypeError("Expected argument 'mlav_category_exceptions' to be a list")
        pulumi.set(__self__, "mlav_category_exceptions", mlav_category_exceptions)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if safe_search_enforcement and not isinstance(safe_search_enforcement, bool):
            raise TypeError("Expected argument 'safe_search_enforcement' to be a bool")
        pulumi.set(__self__, "safe_search_enforcement", safe_search_enforcement)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)

    @property
    @pulumi.getter
    def alerts(self) -> Sequence[str]:
        """
        The Alerts param.
        """
        return pulumi.get(self, "alerts")

    @property
    @pulumi.getter
    def allows(self) -> Sequence[str]:
        """
        The Allows param.
        """
        return pulumi.get(self, "allows")

    @property
    @pulumi.getter
    def blocks(self) -> Sequence[str]:
        """
        The Blocks param.
        """
        return pulumi.get(self, "blocks")

    @property
    @pulumi.getter(name="cloudInlineCat")
    def cloud_inline_cat(self) -> bool:
        """
        The CloudInlineCat param.
        """
        return pulumi.get(self, "cloud_inline_cat")

    @property
    @pulumi.getter
    def continues(self) -> Sequence[str]:
        """
        The Continues param.
        """
        return pulumi.get(self, "continues")

    @property
    @pulumi.getter(name="credentialEnforcement")
    def credential_enforcement(self) -> 'outputs.GetUrlAccessProfileCredentialEnforcementResult':
        """
        The CredentialEnforcement param.
        """
        return pulumi.get(self, "credential_enforcement")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The Description param. String length must not exceed 255 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The Id param.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="localInlineCat")
    def local_inline_cat(self) -> bool:
        """
        The LocalInlineCat param.
        """
        return pulumi.get(self, "local_inline_cat")

    @property
    @pulumi.getter(name="logContainerPageOnly")
    def log_container_page_only(self) -> bool:
        """
        The LogContainerPageOnly param. Default: `true`.
        """
        return pulumi.get(self, "log_container_page_only")

    @property
    @pulumi.getter(name="logHttpHdrReferer")
    def log_http_hdr_referer(self) -> bool:
        """
        The LogHttpHdrReferer param. Default: `false`.
        """
        return pulumi.get(self, "log_http_hdr_referer")

    @property
    @pulumi.getter(name="logHttpHdrUserAgent")
    def log_http_hdr_user_agent(self) -> bool:
        """
        The LogHttpHdrUserAgent param. Default: `false`.
        """
        return pulumi.get(self, "log_http_hdr_user_agent")

    @property
    @pulumi.getter(name="logHttpHdrXff")
    def log_http_hdr_xff(self) -> bool:
        """
        The LogHttpHdrXff param. Default: `false`.
        """
        return pulumi.get(self, "log_http_hdr_xff")

    @property
    @pulumi.getter(name="mlavCategoryExceptions")
    def mlav_category_exceptions(self) -> Sequence[str]:
        """
        The MlavCategoryExceptions param.
        """
        return pulumi.get(self, "mlav_category_exceptions")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The Name param.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="safeSearchEnforcement")
    def safe_search_enforcement(self) -> bool:
        """
        The SafeSearchEnforcement param. Default: `false`.
        """
        return pulumi.get(self, "safe_search_enforcement")

    @property
    @pulumi.getter
    def tfid(self) -> str:
        return pulumi.get(self, "tfid")


class AwaitableGetUrlAccessProfileResult(GetUrlAccessProfileResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUrlAccessProfileResult(
            alerts=self.alerts,
            allows=self.allows,
            blocks=self.blocks,
            cloud_inline_cat=self.cloud_inline_cat,
            continues=self.continues,
            credential_enforcement=self.credential_enforcement,
            description=self.description,
            id=self.id,
            local_inline_cat=self.local_inline_cat,
            log_container_page_only=self.log_container_page_only,
            log_http_hdr_referer=self.log_http_hdr_referer,
            log_http_hdr_user_agent=self.log_http_hdr_user_agent,
            log_http_hdr_xff=self.log_http_hdr_xff,
            mlav_category_exceptions=self.mlav_category_exceptions,
            name=self.name,
            safe_search_enforcement=self.safe_search_enforcement,
            tfid=self.tfid)


def get_url_access_profile(id: Optional[str] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUrlAccessProfileResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_url_access_profile(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getUrlAccessProfile:getUrlAccessProfile', __args__, opts=opts, typ=GetUrlAccessProfileResult).value

    return AwaitableGetUrlAccessProfileResult(
        alerts=pulumi.get(__ret__, 'alerts'),
        allows=pulumi.get(__ret__, 'allows'),
        blocks=pulumi.get(__ret__, 'blocks'),
        cloud_inline_cat=pulumi.get(__ret__, 'cloud_inline_cat'),
        continues=pulumi.get(__ret__, 'continues'),
        credential_enforcement=pulumi.get(__ret__, 'credential_enforcement'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        local_inline_cat=pulumi.get(__ret__, 'local_inline_cat'),
        log_container_page_only=pulumi.get(__ret__, 'log_container_page_only'),
        log_http_hdr_referer=pulumi.get(__ret__, 'log_http_hdr_referer'),
        log_http_hdr_user_agent=pulumi.get(__ret__, 'log_http_hdr_user_agent'),
        log_http_hdr_xff=pulumi.get(__ret__, 'log_http_hdr_xff'),
        mlav_category_exceptions=pulumi.get(__ret__, 'mlav_category_exceptions'),
        name=pulumi.get(__ret__, 'name'),
        safe_search_enforcement=pulumi.get(__ret__, 'safe_search_enforcement'),
        tfid=pulumi.get(__ret__, 'tfid'))


@_utilities.lift_output_func(get_url_access_profile)
def get_url_access_profile_output(id: Optional[pulumi.Input[str]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetUrlAccessProfileResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_url_access_profile(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    ...