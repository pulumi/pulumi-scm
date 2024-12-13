// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scm

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-scm/sdk/go/scm/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves a config item.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-scm/sdk/go/scm"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := scm.LookupNatRule(ctx, &scm.LookupNatRuleArgs{
//				Id: "1234-56-789",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupNatRule(ctx *pulumi.Context, args *LookupNatRuleArgs, opts ...pulumi.InvokeOption) (*LookupNatRuleResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNatRuleResult
	err := ctx.Invoke("scm:index/getNatRule:getNatRule", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNatRule.
type LookupNatRuleArgs struct {
	// The Id param.
	Id string `pulumi:"id"`
}

// A collection of values returned by getNatRule.
type LookupNatRuleResult struct {
	// The ActiveActiveDeviceBinding param. String must be one of these: `"primary"`, `"both"`, `"0"`, `"1"`.
	ActiveActiveDeviceBinding string `pulumi:"activeActiveDeviceBinding"`
	// The Description param.
	Description string `pulumi:"description"`
	// Static destination translation parameter.
	DestinationTranslation GetNatRuleDestinationTranslation `pulumi:"destinationTranslation"`
	// The destination address(es). Individual elements in this list are subject to additional validation. String must be one of these: `"any"`.
	Destinations []string `pulumi:"destinations"`
	// The device in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
	Device string `pulumi:"device"`
	// The Disabled param.
	Disabled bool `pulumi:"disabled"`
	// Dynamic destination translation parameter.
	DynamicDestinationTranslation GetNatRuleDynamicDestinationTranslation `pulumi:"dynamicDestinationTranslation"`
	// The folder in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
	Folder string `pulumi:"folder"`
	// The source security zone(s). Individual elements in this list are subject to additional validation. String must be one of these: `"any"`.
	Froms []string `pulumi:"froms"`
	// The GroupTag param.
	GroupTag string `pulumi:"groupTag"`
	// The Id param.
	Id string `pulumi:"id"`
	// The Name param.
	Name string `pulumi:"name"`
	// The NatType param. String must be one of these: `"ipv4"`, `"nat64"`, `"nptv6"`.
	NatType string `pulumi:"natType"`
	// The Service param.
	Service string `pulumi:"service"`
	// The snippet in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
	Snippet string `pulumi:"snippet"`
	// The SourceTranslation param.
	SourceTranslation GetNatRuleSourceTranslation `pulumi:"sourceTranslation"`
	// The source address(es). Individual elements in this list are subject to additional validation. String must be one of these: `"any"`.
	Sources []string `pulumi:"sources"`
	// The Tags param.
	Tags []string `pulumi:"tags"`
	// The Target param.
	Target GetNatRuleTarget `pulumi:"target"`
	Tfid   string           `pulumi:"tfid"`
	// The ToInterface param. String must be one of these: `"any"`.
	ToInterface string `pulumi:"toInterface"`
	// The destination security zone(s).
	Tos []string `pulumi:"tos"`
}

func LookupNatRuleOutput(ctx *pulumi.Context, args LookupNatRuleOutputArgs, opts ...pulumi.InvokeOption) LookupNatRuleResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupNatRuleResultOutput, error) {
			args := v.(LookupNatRuleArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getNatRule:getNatRule", args, LookupNatRuleResultOutput{}, options).(LookupNatRuleResultOutput), nil
		}).(LookupNatRuleResultOutput)
}

// A collection of arguments for invoking getNatRule.
type LookupNatRuleOutputArgs struct {
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupNatRuleOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNatRuleArgs)(nil)).Elem()
}

// A collection of values returned by getNatRule.
type LookupNatRuleResultOutput struct{ *pulumi.OutputState }

func (LookupNatRuleResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNatRuleResult)(nil)).Elem()
}

func (o LookupNatRuleResultOutput) ToLookupNatRuleResultOutput() LookupNatRuleResultOutput {
	return o
}

func (o LookupNatRuleResultOutput) ToLookupNatRuleResultOutputWithContext(ctx context.Context) LookupNatRuleResultOutput {
	return o
}

// The ActiveActiveDeviceBinding param. String must be one of these: `"primary"`, `"both"`, `"0"`, `"1"`.
func (o LookupNatRuleResultOutput) ActiveActiveDeviceBinding() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNatRuleResult) string { return v.ActiveActiveDeviceBinding }).(pulumi.StringOutput)
}

// The Description param.
func (o LookupNatRuleResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNatRuleResult) string { return v.Description }).(pulumi.StringOutput)
}

// Static destination translation parameter.
func (o LookupNatRuleResultOutput) DestinationTranslation() GetNatRuleDestinationTranslationOutput {
	return o.ApplyT(func(v LookupNatRuleResult) GetNatRuleDestinationTranslation { return v.DestinationTranslation }).(GetNatRuleDestinationTranslationOutput)
}

// The destination address(es). Individual elements in this list are subject to additional validation. String must be one of these: `"any"`.
func (o LookupNatRuleResultOutput) Destinations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNatRuleResult) []string { return v.Destinations }).(pulumi.StringArrayOutput)
}

// The device in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
func (o LookupNatRuleResultOutput) Device() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNatRuleResult) string { return v.Device }).(pulumi.StringOutput)
}

// The Disabled param.
func (o LookupNatRuleResultOutput) Disabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupNatRuleResult) bool { return v.Disabled }).(pulumi.BoolOutput)
}

// Dynamic destination translation parameter.
func (o LookupNatRuleResultOutput) DynamicDestinationTranslation() GetNatRuleDynamicDestinationTranslationOutput {
	return o.ApplyT(func(v LookupNatRuleResult) GetNatRuleDynamicDestinationTranslation {
		return v.DynamicDestinationTranslation
	}).(GetNatRuleDynamicDestinationTranslationOutput)
}

// The folder in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
func (o LookupNatRuleResultOutput) Folder() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNatRuleResult) string { return v.Folder }).(pulumi.StringOutput)
}

// The source security zone(s). Individual elements in this list are subject to additional validation. String must be one of these: `"any"`.
func (o LookupNatRuleResultOutput) Froms() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNatRuleResult) []string { return v.Froms }).(pulumi.StringArrayOutput)
}

// The GroupTag param.
func (o LookupNatRuleResultOutput) GroupTag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNatRuleResult) string { return v.GroupTag }).(pulumi.StringOutput)
}

// The Id param.
func (o LookupNatRuleResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNatRuleResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Name param.
func (o LookupNatRuleResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNatRuleResult) string { return v.Name }).(pulumi.StringOutput)
}

// The NatType param. String must be one of these: `"ipv4"`, `"nat64"`, `"nptv6"`.
func (o LookupNatRuleResultOutput) NatType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNatRuleResult) string { return v.NatType }).(pulumi.StringOutput)
}

// The Service param.
func (o LookupNatRuleResultOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNatRuleResult) string { return v.Service }).(pulumi.StringOutput)
}

// The snippet in which the resource is defined. String length must not exceed 64 characters. String validation regex: `^[a-zA-Z\d-_\. ]+$`.
func (o LookupNatRuleResultOutput) Snippet() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNatRuleResult) string { return v.Snippet }).(pulumi.StringOutput)
}

// The SourceTranslation param.
func (o LookupNatRuleResultOutput) SourceTranslation() GetNatRuleSourceTranslationOutput {
	return o.ApplyT(func(v LookupNatRuleResult) GetNatRuleSourceTranslation { return v.SourceTranslation }).(GetNatRuleSourceTranslationOutput)
}

// The source address(es). Individual elements in this list are subject to additional validation. String must be one of these: `"any"`.
func (o LookupNatRuleResultOutput) Sources() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNatRuleResult) []string { return v.Sources }).(pulumi.StringArrayOutput)
}

// The Tags param.
func (o LookupNatRuleResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNatRuleResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// The Target param.
func (o LookupNatRuleResultOutput) Target() GetNatRuleTargetOutput {
	return o.ApplyT(func(v LookupNatRuleResult) GetNatRuleTarget { return v.Target }).(GetNatRuleTargetOutput)
}

func (o LookupNatRuleResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNatRuleResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The ToInterface param. String must be one of these: `"any"`.
func (o LookupNatRuleResultOutput) ToInterface() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNatRuleResult) string { return v.ToInterface }).(pulumi.StringOutput)
}

// The destination security zone(s).
func (o LookupNatRuleResultOutput) Tos() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNatRuleResult) []string { return v.Tos }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNatRuleResultOutput{})
}
