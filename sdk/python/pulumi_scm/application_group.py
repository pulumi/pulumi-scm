# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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

__all__ = ['ApplicationGroupArgs', 'ApplicationGroup']

@pulumi.input_type
class ApplicationGroupArgs:
    def __init__(__self__, *,
                 members: pulumi.Input[Sequence[pulumi.Input[builtins.str]]],
                 device: Optional[pulumi.Input[builtins.str]] = None,
                 folder: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 snippet: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a ApplicationGroup resource.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] members: The Members param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
        :param pulumi.Input[builtins.str] device: The Device param.
        :param pulumi.Input[builtins.str] folder: The Folder param.
        :param pulumi.Input[builtins.str] name: Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        :param pulumi.Input[builtins.str] snippet: The Snippet param.
        """
        pulumi.set(__self__, "members", members)
        if device is not None:
            pulumi.set(__self__, "device", device)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)

    @property
    @pulumi.getter
    def members(self) -> pulumi.Input[Sequence[pulumi.Input[builtins.str]]]:
        """
        The Members param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "members")

    @members.setter
    def members(self, value: pulumi.Input[Sequence[pulumi.Input[builtins.str]]]):
        pulumi.set(self, "members", value)

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
        Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

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


@pulumi.input_type
class _ApplicationGroupState:
    def __init__(__self__, *,
                 device: Optional[pulumi.Input[builtins.str]] = None,
                 folder: Optional[pulumi.Input[builtins.str]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 snippet: Optional[pulumi.Input[builtins.str]] = None,
                 tfid: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering ApplicationGroup resources.
        :param pulumi.Input[builtins.str] device: The Device param.
        :param pulumi.Input[builtins.str] folder: The Folder param.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] members: The Members param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
        :param pulumi.Input[builtins.str] name: Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        :param pulumi.Input[builtins.str] snippet: The Snippet param.
        """
        if device is not None:
            pulumi.set(__self__, "device", device)
        if folder is not None:
            pulumi.set(__self__, "folder", folder)
        if members is not None:
            pulumi.set(__self__, "members", members)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if snippet is not None:
            pulumi.set(__self__, "snippet", snippet)
        if tfid is not None:
            pulumi.set(__self__, "tfid", tfid)

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
    def members(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]:
        """
        The Members param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "members")

    @members.setter
    def members(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "members", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

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


class ApplicationGroup(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[builtins.str]] = None,
                 folder: Optional[pulumi.Input[builtins.str]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 snippet: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.ApplicationGroup("example")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] device: The Device param.
        :param pulumi.Input[builtins.str] folder: The Folder param.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] members: The Members param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
        :param pulumi.Input[builtins.str] name: Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        :param pulumi.Input[builtins.str] snippet: The Snippet param.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ApplicationGroupArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Retrieves a config item.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scm as scm

        example = scm.ApplicationGroup("example")
        ```

        :param str resource_name: The name of the resource.
        :param ApplicationGroupArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApplicationGroupArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 device: Optional[pulumi.Input[builtins.str]] = None,
                 folder: Optional[pulumi.Input[builtins.str]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 snippet: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApplicationGroupArgs.__new__(ApplicationGroupArgs)

            __props__.__dict__["device"] = device
            __props__.__dict__["folder"] = folder
            if members is None and not opts.urn:
                raise TypeError("Missing required property 'members'")
            __props__.__dict__["members"] = members
            __props__.__dict__["name"] = name
            __props__.__dict__["snippet"] = snippet
            __props__.__dict__["tfid"] = None
        super(ApplicationGroup, __self__).__init__(
            'scm:index/applicationGroup:ApplicationGroup',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            device: Optional[pulumi.Input[builtins.str]] = None,
            folder: Optional[pulumi.Input[builtins.str]] = None,
            members: Optional[pulumi.Input[Sequence[pulumi.Input[builtins.str]]]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            snippet: Optional[pulumi.Input[builtins.str]] = None,
            tfid: Optional[pulumi.Input[builtins.str]] = None) -> 'ApplicationGroup':
        """
        Get an existing ApplicationGroup resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] device: The Device param.
        :param pulumi.Input[builtins.str] folder: The Folder param.
        :param pulumi.Input[Sequence[pulumi.Input[builtins.str]]] members: The Members param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
        :param pulumi.Input[builtins.str] name: Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        :param pulumi.Input[builtins.str] snippet: The Snippet param.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApplicationGroupState.__new__(_ApplicationGroupState)

        __props__.__dict__["device"] = device
        __props__.__dict__["folder"] = folder
        __props__.__dict__["members"] = members
        __props__.__dict__["name"] = name
        __props__.__dict__["snippet"] = snippet
        __props__.__dict__["tfid"] = tfid
        return ApplicationGroup(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def device(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The Device param.
        """
        return pulumi.get(self, "device")

    @property
    @pulumi.getter
    def folder(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        The Folder param.
        """
        return pulumi.get(self, "folder")

    @property
    @pulumi.getter
    def members(self) -> pulumi.Output[Sequence[builtins.str]]:
        """
        The Members param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
        """
        return pulumi.get(self, "members")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
        """
        return pulumi.get(self, "name")

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

