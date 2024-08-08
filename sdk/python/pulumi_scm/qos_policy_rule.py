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
from ._inputs import *

__all__ = ['QosPolicyRuleArgs', 'QosPolicyRule']

@pulumi.input_type
class QosPolicyRuleArgs:
    def __init__(__self__, *,
                 action: pulumi.Input['QosPolicyRuleActionArgs'],
                 description: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 dscp_tos: Optional[pulumi.Input['QosPolicyRuleDscpTosArgs']] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 position: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 snippet: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a QosPolicyRule resource.
        :param pulumi.Input['QosPolicyRuleActionArgs'] action: The Action param.
        :param pulumi.Input[str] description: The Description param.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input['QosPolicyRuleDscpTosArgs'] dscp_tos: The DscpTos param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[str] name: The Name param.
        :param pulumi.Input[str] position: The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
        :param pulumi.Input[str] schedule: The Schedule param.
        :param pulumi.Input[str] snippet: The Snippet param.
        """
        pulumi.set(__self__, "action", action)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if dscp_tos is not None:
            pulumi.set(__self__, "dscp_tos", dscp_tos)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if position is not None:
            pulumi.set(__self__, "position", position)
        if schedule is not None:
            pulumi.set(__self__, "schedule", schedule)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Input['QosPolicyRuleActionArgs']:
        """
        The Action param.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: pulumi.Input['QosPolicyRuleActionArgs']):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The Description param.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

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
    @pulumi.getter(name="dscpTos")
    def dscp_tos(self) -> Optional[pulumi.Input['QosPolicyRuleDscpTosArgs']]:
        """
        The DscpTos param.
        """
        return pulumi.get(self, "dscp_tos")

    @dscp_tos.setter
    def dscp_tos(self, value: Optional[pulumi.Input['QosPolicyRuleDscpTosArgs']]):
        pulumi.set(self, "dscp_tos", value)

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
    @pulumi.getter
    def position(self) -> Optional[pulumi.Input[str]]:
        """
        The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
        """
        return pulumi.get(self, "position")

    @position.setter
    def position(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "position", value)

    @property
    @pulumi.getter
    def schedule(self) -> Optional[pulumi.Input[str]]:
        """
        The Schedule param.
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schedule", value)

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


@pulumi.input_type
class _QosPolicyRuleState:
    def __init__(__self__, *,
                 action: Optional[pulumi.Input['QosPolicyRuleActionArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 dscp_tos: Optional[pulumi.Input['QosPolicyRuleDscpTosArgs']] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 position: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 tfid: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering QosPolicyRule resources.
        :param pulumi.Input['QosPolicyRuleActionArgs'] action: The Action param.
        :param pulumi.Input[str] description: The Description param.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input['QosPolicyRuleDscpTosArgs'] dscp_tos: The DscpTos param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[str] name: The Name param.
        :param pulumi.Input[str] position: The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
        :param pulumi.Input[str] schedule: The Schedule param.
        :param pulumi.Input[str] snippet: The Snippet param.
        """
        if action is not None:
            pulumi.set(__self__, "action", action)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if dscp_tos is not None:
            pulumi.set(__self__, "dscp_tos", dscp_tos)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if position is not None:
            pulumi.set(__self__, "position", position)
        if schedule is not None:
            pulumi.set(__self__, "schedule", schedule)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)
        if tfid is not None:
            pulumi.set(__self__, "tfid", tfid)

    @property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input['QosPolicyRuleActionArgs']]:
        """
        The Action param.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input['QosPolicyRuleActionArgs']]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The Description param.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

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
    @pulumi.getter(name="dscpTos")
    def dscp_tos(self) -> Optional[pulumi.Input['QosPolicyRuleDscpTosArgs']]:
        """
        The DscpTos param.
        """
        return pulumi.get(self, "dscp_tos")

    @dscp_tos.setter
    def dscp_tos(self, value: Optional[pulumi.Input['QosPolicyRuleDscpTosArgs']]):
        pulumi.set(self, "dscp_tos", value)

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
    @pulumi.getter
    def position(self) -> Optional[pulumi.Input[str]]:
        """
        The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
        """
        return pulumi.get(self, "position")

    @position.setter
    def position(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "position", value)

    @property
    @pulumi.getter
    def schedule(self) -> Optional[pulumi.Input[str]]:
        """
        The Schedule param.
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schedule", value)

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


class QosPolicyRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[Union['QosPolicyRuleActionArgs', 'QosPolicyRuleActionArgsDict']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 dscp_tos: Optional[pulumi.Input[Union['QosPolicyRuleDscpTosArgs', 'QosPolicyRuleDscpTosArgsDict']]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 position: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.QosPolicyRule("example")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['QosPolicyRuleActionArgs', 'QosPolicyRuleActionArgsDict']] action: The Action param.
        :param pulumi.Input[str] description: The Description param.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[Union['QosPolicyRuleDscpTosArgs', 'QosPolicyRuleDscpTosArgsDict']] dscp_tos: The DscpTos param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[str] name: The Name param.
        :param pulumi.Input[str] position: The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
        :param pulumi.Input[str] schedule: The Schedule param.
        :param pulumi.Input[str] snippet: The Snippet param.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: QosPolicyRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.QosPolicyRule("example")
        ```

        :param str resource_name: The name of the resource.
        :param QosPolicyRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(QosPolicyRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[Union['QosPolicyRuleActionArgs', 'QosPolicyRuleActionArgsDict']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 device: Optional[pulumi.Input[str]] = None,
                 dscp_tos: Optional[pulumi.Input[Union['QosPolicyRuleDscpTosArgs', 'QosPolicyRuleDscpTosArgsDict']]] = None,
                 folder: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 position: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 snippet: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = QosPolicyRuleArgs.__new__(QosPolicyRuleArgs)

            if action is None and not opts.urn:
                raise TypeError("Missing required property 'action'")
            __props__.__dict__["action"] = action
            __props__.__dict__["description"] = description
            __props__.__dict__["device"] = device
            __props__.__dict__["dscp_tos"] = dscp_tos
            __props__.__dict__["folder"] = folder
            __props__.__dict__["name"] = name
            __props__.__dict__["position"] = position
            __props__.__dict__["schedule"] = schedule
            __props__.__dict__["snippet"] = snippet
            __props__.__dict__["tfid"] = None
        super(QosPolicyRule, __self__).__init__(
            'scm:index/qosPolicyRule:QosPolicyRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            action: Optional[pulumi.Input[Union['QosPolicyRuleActionArgs', 'QosPolicyRuleActionArgsDict']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            device: Optional[pulumi.Input[str]] = None,
            dscp_tos: Optional[pulumi.Input[Union['QosPolicyRuleDscpTosArgs', 'QosPolicyRuleDscpTosArgsDict']]] = None,
            folder: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            position: Optional[pulumi.Input[str]] = None,
            schedule: Optional[pulumi.Input[str]] = None,
            snippet: Optional[pulumi.Input[str]] = None,
            tfid: Optional[pulumi.Input[str]] = None) -> 'QosPolicyRule':
        """
        Get an existing QosPolicyRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['QosPolicyRuleActionArgs', 'QosPolicyRuleActionArgsDict']] action: The Action param.
        :param pulumi.Input[str] description: The Description param.
        :param pulumi.Input[str] device: The Device param.
        :param pulumi.Input[Union['QosPolicyRuleDscpTosArgs', 'QosPolicyRuleDscpTosArgsDict']] dscp_tos: The DscpTos param.
        :param pulumi.Input[str] folder: The Folder param.
        :param pulumi.Input[str] name: The Name param.
        :param pulumi.Input[str] position: The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
        :param pulumi.Input[str] schedule: The Schedule param.
        :param pulumi.Input[str] snippet: The Snippet param.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _QosPolicyRuleState.__new__(_QosPolicyRuleState)

        __props__.__dict__["action"] = action
        __props__.__dict__["description"] = description
        __props__.__dict__["device"] = device
        __props__.__dict__["dscp_tos"] = dscp_tos
        __props__.__dict__["folder"] = folder
        __props__.__dict__["name"] = name
        __props__.__dict__["position"] = position
        __props__.__dict__["schedule"] = schedule
        __props__.__dict__["snippet"] = snippet
        __props__.__dict__["tfid"] = tfid
        return QosPolicyRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Output['outputs.QosPolicyRuleAction']:
        """
        The Action param.
        """
        return pulumi.get(self, "action")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The Description param.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[str]]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter(name="dscpTos")
    def dscp_tos(self) -> pulumi.Output[Optional['outputs.QosPolicyRuleDscpTos']]:
        """
        The DscpTos param.
        """
        return pulumi.get(self, "dscp_tos")

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
    @pulumi.getter
    def position(self) -> pulumi.Output[str]:
        """
        The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
        """
        return pulumi.get(self, "position")

    @property
    @pulumi.getter
    def schedule(self) -> pulumi.Output[Optional[str]]:
        """
        The Schedule param.
        """
        return pulumi.get(self, "schedule")

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

