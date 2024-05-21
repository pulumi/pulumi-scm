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
//			_, err := scm.LookupAuthenticationRule(ctx, &scm.LookupAuthenticationRuleArgs{
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
func LookupAuthenticationRule(ctx *pulumi.Context, args *LookupAuthenticationRuleArgs, opts ...pulumi.InvokeOption) (*LookupAuthenticationRuleResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAuthenticationRuleResult
	err := ctx.Invoke("scm:index/getAuthenticationRule:getAuthenticationRule", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAuthenticationRule.
type LookupAuthenticationRuleArgs struct {
	// The Id param.
	Id string `pulumi:"id"`
}

// A collection of values returned by getAuthenticationRule.
type LookupAuthenticationRuleResult struct {
	// the authentication profile name to apply to authentication rule.
	AuthenticationEnforcement string `pulumi:"authenticationEnforcement"`
	// The Categories param.
	Categories []string `pulumi:"categories"`
	// The Description param.
	Description string `pulumi:"description"`
	// The DestinationHips param.
	DestinationHips []string `pulumi:"destinationHips"`
	// The Destinations param.
	Destinations []string `pulumi:"destinations"`
	// The Disabled param. Default: `false`.
	Disabled bool `pulumi:"disabled"`
	// The Froms param.
	Froms []string `pulumi:"froms"`
	// The GroupTag param.
	GroupTag string `pulumi:"groupTag"`
	// The HipProfiles param.
	HipProfiles []string `pulumi:"hipProfiles"`
	// The Id param.
	Id string `pulumi:"id"`
	// The LogAuthenticationTimeout param. Default: `false`.
	LogAuthenticationTimeout bool `pulumi:"logAuthenticationTimeout"`
	// The LogSetting param.
	LogSetting string `pulumi:"logSetting"`
	// The Name param.
	Name string `pulumi:"name"`
	// The NegateDestination param. Default: `false`.
	NegateDestination bool `pulumi:"negateDestination"`
	// The NegateSource param. Default: `false`.
	NegateSource bool `pulumi:"negateSource"`
	// The Services param.
	Services []string `pulumi:"services"`
	// The SourceHips param.
	SourceHips []string `pulumi:"sourceHips"`
	// The SourceUsers param.
	SourceUsers []string `pulumi:"sourceUsers"`
	// The Sources param.
	Sources []string `pulumi:"sources"`
	// The Tags param.
	Tags []string `pulumi:"tags"`
	Tfid string   `pulumi:"tfid"`
	// The Timeout param. Value must be between 1 and 1440.
	Timeout int `pulumi:"timeout"`
	// The Tos param.
	Tos []string `pulumi:"tos"`
}

func LookupAuthenticationRuleOutput(ctx *pulumi.Context, args LookupAuthenticationRuleOutputArgs, opts ...pulumi.InvokeOption) LookupAuthenticationRuleResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAuthenticationRuleResult, error) {
			args := v.(LookupAuthenticationRuleArgs)
			r, err := LookupAuthenticationRule(ctx, &args, opts...)
			var s LookupAuthenticationRuleResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAuthenticationRuleResultOutput)
}

// A collection of arguments for invoking getAuthenticationRule.
type LookupAuthenticationRuleOutputArgs struct {
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupAuthenticationRuleOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAuthenticationRuleArgs)(nil)).Elem()
}

// A collection of values returned by getAuthenticationRule.
type LookupAuthenticationRuleResultOutput struct{ *pulumi.OutputState }

func (LookupAuthenticationRuleResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAuthenticationRuleResult)(nil)).Elem()
}

func (o LookupAuthenticationRuleResultOutput) ToLookupAuthenticationRuleResultOutput() LookupAuthenticationRuleResultOutput {
	return o
}

func (o LookupAuthenticationRuleResultOutput) ToLookupAuthenticationRuleResultOutputWithContext(ctx context.Context) LookupAuthenticationRuleResultOutput {
	return o
}

// the authentication profile name to apply to authentication rule.
func (o LookupAuthenticationRuleResultOutput) AuthenticationEnforcement() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) string { return v.AuthenticationEnforcement }).(pulumi.StringOutput)
}

// The Categories param.
func (o LookupAuthenticationRuleResultOutput) Categories() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) []string { return v.Categories }).(pulumi.StringArrayOutput)
}

// The Description param.
func (o LookupAuthenticationRuleResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) string { return v.Description }).(pulumi.StringOutput)
}

// The DestinationHips param.
func (o LookupAuthenticationRuleResultOutput) DestinationHips() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) []string { return v.DestinationHips }).(pulumi.StringArrayOutput)
}

// The Destinations param.
func (o LookupAuthenticationRuleResultOutput) Destinations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) []string { return v.Destinations }).(pulumi.StringArrayOutput)
}

// The Disabled param. Default: `false`.
func (o LookupAuthenticationRuleResultOutput) Disabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) bool { return v.Disabled }).(pulumi.BoolOutput)
}

// The Froms param.
func (o LookupAuthenticationRuleResultOutput) Froms() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) []string { return v.Froms }).(pulumi.StringArrayOutput)
}

// The GroupTag param.
func (o LookupAuthenticationRuleResultOutput) GroupTag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) string { return v.GroupTag }).(pulumi.StringOutput)
}

// The HipProfiles param.
func (o LookupAuthenticationRuleResultOutput) HipProfiles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) []string { return v.HipProfiles }).(pulumi.StringArrayOutput)
}

// The Id param.
func (o LookupAuthenticationRuleResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) string { return v.Id }).(pulumi.StringOutput)
}

// The LogAuthenticationTimeout param. Default: `false`.
func (o LookupAuthenticationRuleResultOutput) LogAuthenticationTimeout() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) bool { return v.LogAuthenticationTimeout }).(pulumi.BoolOutput)
}

// The LogSetting param.
func (o LookupAuthenticationRuleResultOutput) LogSetting() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) string { return v.LogSetting }).(pulumi.StringOutput)
}

// The Name param.
func (o LookupAuthenticationRuleResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) string { return v.Name }).(pulumi.StringOutput)
}

// The NegateDestination param. Default: `false`.
func (o LookupAuthenticationRuleResultOutput) NegateDestination() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) bool { return v.NegateDestination }).(pulumi.BoolOutput)
}

// The NegateSource param. Default: `false`.
func (o LookupAuthenticationRuleResultOutput) NegateSource() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) bool { return v.NegateSource }).(pulumi.BoolOutput)
}

// The Services param.
func (o LookupAuthenticationRuleResultOutput) Services() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) []string { return v.Services }).(pulumi.StringArrayOutput)
}

// The SourceHips param.
func (o LookupAuthenticationRuleResultOutput) SourceHips() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) []string { return v.SourceHips }).(pulumi.StringArrayOutput)
}

// The SourceUsers param.
func (o LookupAuthenticationRuleResultOutput) SourceUsers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) []string { return v.SourceUsers }).(pulumi.StringArrayOutput)
}

// The Sources param.
func (o LookupAuthenticationRuleResultOutput) Sources() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) []string { return v.Sources }).(pulumi.StringArrayOutput)
}

// The Tags param.
func (o LookupAuthenticationRuleResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func (o LookupAuthenticationRuleResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Timeout param. Value must be between 1 and 1440.
func (o LookupAuthenticationRuleResultOutput) Timeout() pulumi.IntOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) int { return v.Timeout }).(pulumi.IntOutput)
}

// The Tos param.
func (o LookupAuthenticationRuleResultOutput) Tos() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAuthenticationRuleResult) []string { return v.Tos }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAuthenticationRuleResultOutput{})
}
