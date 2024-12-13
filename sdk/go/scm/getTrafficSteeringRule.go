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
func LookupTrafficSteeringRule(ctx *pulumi.Context, args *LookupTrafficSteeringRuleArgs, opts ...pulumi.InvokeOption) (*LookupTrafficSteeringRuleResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTrafficSteeringRuleResult
	err := ctx.Invoke("scm:index/getTrafficSteeringRule:getTrafficSteeringRule", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTrafficSteeringRule.
type LookupTrafficSteeringRuleArgs struct {
	// The Id param.
	Id string `pulumi:"id"`
}

// A collection of values returned by getTrafficSteeringRule.
type LookupTrafficSteeringRuleResult struct {
	// The Action param.
	Action GetTrafficSteeringRuleAction `pulumi:"action"`
	// The Category param.
	Categories []string `pulumi:"categories"`
	// The Destination param.
	Destinations []string `pulumi:"destinations"`
	// The Id param.
	Id string `pulumi:"id"`
	// The Name param.
	Name string `pulumi:"name"`
	// The Service param.
	Services []string `pulumi:"services"`
	// The SourceUser param.
	SourceUsers []string `pulumi:"sourceUsers"`
	// The Source param.
	Sources []string `pulumi:"sources"`
	Tfid    string   `pulumi:"tfid"`
}

func LookupTrafficSteeringRuleOutput(ctx *pulumi.Context, args LookupTrafficSteeringRuleOutputArgs, opts ...pulumi.InvokeOption) LookupTrafficSteeringRuleResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupTrafficSteeringRuleResultOutput, error) {
			args := v.(LookupTrafficSteeringRuleArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getTrafficSteeringRule:getTrafficSteeringRule", args, LookupTrafficSteeringRuleResultOutput{}, options).(LookupTrafficSteeringRuleResultOutput), nil
		}).(LookupTrafficSteeringRuleResultOutput)
}

// A collection of arguments for invoking getTrafficSteeringRule.
type LookupTrafficSteeringRuleOutputArgs struct {
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupTrafficSteeringRuleOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTrafficSteeringRuleArgs)(nil)).Elem()
}

// A collection of values returned by getTrafficSteeringRule.
type LookupTrafficSteeringRuleResultOutput struct{ *pulumi.OutputState }

func (LookupTrafficSteeringRuleResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTrafficSteeringRuleResult)(nil)).Elem()
}

func (o LookupTrafficSteeringRuleResultOutput) ToLookupTrafficSteeringRuleResultOutput() LookupTrafficSteeringRuleResultOutput {
	return o
}

func (o LookupTrafficSteeringRuleResultOutput) ToLookupTrafficSteeringRuleResultOutputWithContext(ctx context.Context) LookupTrafficSteeringRuleResultOutput {
	return o
}

// The Action param.
func (o LookupTrafficSteeringRuleResultOutput) Action() GetTrafficSteeringRuleActionOutput {
	return o.ApplyT(func(v LookupTrafficSteeringRuleResult) GetTrafficSteeringRuleAction { return v.Action }).(GetTrafficSteeringRuleActionOutput)
}

// The Category param.
func (o LookupTrafficSteeringRuleResultOutput) Categories() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupTrafficSteeringRuleResult) []string { return v.Categories }).(pulumi.StringArrayOutput)
}

// The Destination param.
func (o LookupTrafficSteeringRuleResultOutput) Destinations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupTrafficSteeringRuleResult) []string { return v.Destinations }).(pulumi.StringArrayOutput)
}

// The Id param.
func (o LookupTrafficSteeringRuleResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTrafficSteeringRuleResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Name param.
func (o LookupTrafficSteeringRuleResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTrafficSteeringRuleResult) string { return v.Name }).(pulumi.StringOutput)
}

// The Service param.
func (o LookupTrafficSteeringRuleResultOutput) Services() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupTrafficSteeringRuleResult) []string { return v.Services }).(pulumi.StringArrayOutput)
}

// The SourceUser param.
func (o LookupTrafficSteeringRuleResultOutput) SourceUsers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupTrafficSteeringRuleResult) []string { return v.SourceUsers }).(pulumi.StringArrayOutput)
}

// The Source param.
func (o LookupTrafficSteeringRuleResultOutput) Sources() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupTrafficSteeringRuleResult) []string { return v.Sources }).(pulumi.StringArrayOutput)
}

func (o LookupTrafficSteeringRuleResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTrafficSteeringRuleResult) string { return v.Tfid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTrafficSteeringRuleResultOutput{})
}
