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
    'GetAntiSpywareSignatureResult',
    'AwaitableGetAntiSpywareSignatureResult',
    'get_anti_spyware_signature',
    'get_anti_spyware_signature_output',
]

@pulumi.output_type
class GetAntiSpywareSignatureResult:
    """
    A collection of values returned by getAntiSpywareSignature.
    """
    def __init__(__self__, bugtraqs=None, comment=None, cves=None, default_action=None, direction=None, id=None, references=None, severity=None, signature=None, tfid=None, threat_id=None, threatname=None, vendors=None):
        if bugtraqs and not isinstance(bugtraqs, list):
            raise TypeError("Expected argument 'bugtraqs' to be a list")
        pulumi.set(__self__, "bugtraqs", bugtraqs)
        if comment and not isinstance(comment, str):
            raise TypeError("Expected argument 'comment' to be a str")
        pulumi.set(__self__, "comment", comment)
        if cves and not isinstance(cves, list):
            raise TypeError("Expected argument 'cves' to be a list")
        pulumi.set(__self__, "cves", cves)
        if default_action and not isinstance(default_action, dict):
            raise TypeError("Expected argument 'default_action' to be a dict")
        pulumi.set(__self__, "default_action", default_action)
        if direction and not isinstance(direction, str):
            raise TypeError("Expected argument 'direction' to be a str")
        pulumi.set(__self__, "direction", direction)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if references and not isinstance(references, list):
            raise TypeError("Expected argument 'references' to be a list")
        pulumi.set(__self__, "references", references)
        if severity and not isinstance(severity, str):
            raise TypeError("Expected argument 'severity' to be a str")
        pulumi.set(__self__, "severity", severity)
        if signature and not isinstance(signature, dict):
            raise TypeError("Expected argument 'signature' to be a dict")
        pulumi.set(__self__, "signature", signature)
        if tfid and not isinstance(tfid, str):
            raise TypeError("Expected argument 'tfid' to be a str")
        pulumi.set(__self__, "tfid", tfid)
        if threat_id and not isinstance(threat_id, int):
            raise TypeError("Expected argument 'threat_id' to be a int")
        pulumi.set(__self__, "threat_id", threat_id)
        if threatname and not isinstance(threatname, str):
            raise TypeError("Expected argument 'threatname' to be a str")
        pulumi.set(__self__, "threatname", threatname)
        if vendors and not isinstance(vendors, list):
            raise TypeError("Expected argument 'vendors' to be a list")
        pulumi.set(__self__, "vendors", vendors)

    @property
    @pulumi.getter
    def bugtraqs(self) -> Sequence[str]:
        """
        The Bugtraqs param.
        """
        return pulumi.get(self, "bugtraqs")

    @property
    @pulumi.getter
    def comment(self) -> str:
        """
        The Comment param. String length must not exceed 256 characters.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def cves(self) -> Sequence[str]:
        """
        The Cves param.
        """
        return pulumi.get(self, "cves")

    @property
    @pulumi.getter(name="defaultAction")
    def default_action(self) -> 'outputs.GetAntiSpywareSignatureDefaultActionResult':
        """
        The DefaultAction param.
        """
        return pulumi.get(self, "default_action")

    @property
    @pulumi.getter
    def direction(self) -> str:
        """
        The Direction param. String must be one of these: `"client2server"`, `"server2client"`, `"both"`.
        """
        return pulumi.get(self, "direction")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The Id param.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def references(self) -> Sequence[str]:
        """
        The References param.
        """
        return pulumi.get(self, "references")

    @property
    @pulumi.getter
    def severity(self) -> str:
        """
        The Severity param. String must be one of these: `"critical"`, `"low"`, `"high"`, `"medium"`, `"informational"`.
        """
        return pulumi.get(self, "severity")

    @property
    @pulumi.getter
    def signature(self) -> 'outputs.GetAntiSpywareSignatureSignatureResult':
        """
        The Signature param.
        """
        return pulumi.get(self, "signature")

    @property
    @pulumi.getter
    def tfid(self) -> str:
        return pulumi.get(self, "tfid")

    @property
    @pulumi.getter(name="threatId")
    def threat_id(self) -> int:
        """
        threat id range \\n\\n and \\n\\n. Value must be between 15000 and 70000000.
        """
        return pulumi.get(self, "threat_id")

    @property
    @pulumi.getter
    def threatname(self) -> str:
        """
        The Threatname param. String length must not exceed 1024 characters.
        """
        return pulumi.get(self, "threatname")

    @property
    @pulumi.getter
    def vendors(self) -> Sequence[str]:
        """
        The Vendors param.
        """
        return pulumi.get(self, "vendors")


class AwaitableGetAntiSpywareSignatureResult(GetAntiSpywareSignatureResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAntiSpywareSignatureResult(
            bugtraqs=self.bugtraqs,
            comment=self.comment,
            cves=self.cves,
            default_action=self.default_action,
            direction=self.direction,
            id=self.id,
            references=self.references,
            severity=self.severity,
            signature=self.signature,
            tfid=self.tfid,
            threat_id=self.threat_id,
            threatname=self.threatname,
            vendors=self.vendors)


def get_anti_spyware_signature(id: Optional[str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAntiSpywareSignatureResult:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_anti_spyware_signature(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('scm:index/getAntiSpywareSignature:getAntiSpywareSignature', __args__, opts=opts, typ=GetAntiSpywareSignatureResult).value

    return AwaitableGetAntiSpywareSignatureResult(
        bugtraqs=pulumi.get(__ret__, 'bugtraqs'),
        comment=pulumi.get(__ret__, 'comment'),
        cves=pulumi.get(__ret__, 'cves'),
        default_action=pulumi.get(__ret__, 'default_action'),
        direction=pulumi.get(__ret__, 'direction'),
        id=pulumi.get(__ret__, 'id'),
        references=pulumi.get(__ret__, 'references'),
        severity=pulumi.get(__ret__, 'severity'),
        signature=pulumi.get(__ret__, 'signature'),
        tfid=pulumi.get(__ret__, 'tfid'),
        threat_id=pulumi.get(__ret__, 'threat_id'),
        threatname=pulumi.get(__ret__, 'threatname'),
        vendors=pulumi.get(__ret__, 'vendors'))


@_utilities.lift_output_func(get_anti_spyware_signature)
def get_anti_spyware_signature_output(id: Optional[pulumi.Input[str]] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAntiSpywareSignatureResult]:
    """
    Retrieves a config item.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_scm as scm

    example = scm.get_anti_spyware_signature(id="1234-56-789")
    ```


    :param str id: The Id param.
    """
    ...
