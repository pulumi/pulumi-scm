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
//			_, err := scm.LookupDecryptionRule(ctx, &scm.LookupDecryptionRuleArgs{
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
func LookupDecryptionRule(ctx *pulumi.Context, args *LookupDecryptionRuleArgs, opts ...pulumi.InvokeOption) (*LookupDecryptionRuleResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDecryptionRuleResult
	err := ctx.Invoke("scm:index/getDecryptionRule:getDecryptionRule", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDecryptionRule.
type LookupDecryptionRuleArgs struct {
	// The Id param.
	Id string `pulumi:"id"`
}

// A collection of values returned by getDecryptionRule.
type LookupDecryptionRuleResult struct {
	// The Action param. String must be one of these: `"decrypt"`, `"no-decrypt"`.
	Action string `pulumi:"action"`
	// The Categories param.
	Categories []string `pulumi:"categories"`
	// The Description param.
	Description string `pulumi:"description"`
	// The DestinationHips param.
	DestinationHips []string `pulumi:"destinationHips"`
	// The Destinations param.
	Destinations []string `pulumi:"destinations"`
	// The Disabled param.
	Disabled bool `pulumi:"disabled"`
	// The Froms param.
	Froms []string `pulumi:"froms"`
	// The Id param.
	Id string `pulumi:"id"`
	// The LogFail param.
	LogFail bool `pulumi:"logFail"`
	// The LogSetting param.
	LogSetting string `pulumi:"logSetting"`
	// The LogSuccess param.
	LogSuccess bool `pulumi:"logSuccess"`
	// The Name param.
	Name string `pulumi:"name"`
	// The NegateDestination param.
	NegateDestination bool `pulumi:"negateDestination"`
	// The NegateSource param.
	NegateSource bool `pulumi:"negateSource"`
	// The Profile param.
	Profile string `pulumi:"profile"`
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
	// The Tos param.
	Tos []string `pulumi:"tos"`
	// The Type param.
	Type GetDecryptionRuleType `pulumi:"type"`
}

func LookupDecryptionRuleOutput(ctx *pulumi.Context, args LookupDecryptionRuleOutputArgs, opts ...pulumi.InvokeOption) LookupDecryptionRuleResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupDecryptionRuleResultOutput, error) {
			args := v.(LookupDecryptionRuleArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getDecryptionRule:getDecryptionRule", args, LookupDecryptionRuleResultOutput{}, options).(LookupDecryptionRuleResultOutput), nil
		}).(LookupDecryptionRuleResultOutput)
}

// A collection of arguments for invoking getDecryptionRule.
type LookupDecryptionRuleOutputArgs struct {
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupDecryptionRuleOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDecryptionRuleArgs)(nil)).Elem()
}

// A collection of values returned by getDecryptionRule.
type LookupDecryptionRuleResultOutput struct{ *pulumi.OutputState }

func (LookupDecryptionRuleResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDecryptionRuleResult)(nil)).Elem()
}

func (o LookupDecryptionRuleResultOutput) ToLookupDecryptionRuleResultOutput() LookupDecryptionRuleResultOutput {
	return o
}

func (o LookupDecryptionRuleResultOutput) ToLookupDecryptionRuleResultOutputWithContext(ctx context.Context) LookupDecryptionRuleResultOutput {
	return o
}

// The Action param. String must be one of these: `"decrypt"`, `"no-decrypt"`.
func (o LookupDecryptionRuleResultOutput) Action() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) string { return v.Action }).(pulumi.StringOutput)
}

// The Categories param.
func (o LookupDecryptionRuleResultOutput) Categories() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) []string { return v.Categories }).(pulumi.StringArrayOutput)
}

// The Description param.
func (o LookupDecryptionRuleResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) string { return v.Description }).(pulumi.StringOutput)
}

// The DestinationHips param.
func (o LookupDecryptionRuleResultOutput) DestinationHips() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) []string { return v.DestinationHips }).(pulumi.StringArrayOutput)
}

// The Destinations param.
func (o LookupDecryptionRuleResultOutput) Destinations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) []string { return v.Destinations }).(pulumi.StringArrayOutput)
}

// The Disabled param.
func (o LookupDecryptionRuleResultOutput) Disabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) bool { return v.Disabled }).(pulumi.BoolOutput)
}

// The Froms param.
func (o LookupDecryptionRuleResultOutput) Froms() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) []string { return v.Froms }).(pulumi.StringArrayOutput)
}

// The Id param.
func (o LookupDecryptionRuleResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) string { return v.Id }).(pulumi.StringOutput)
}

// The LogFail param.
func (o LookupDecryptionRuleResultOutput) LogFail() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) bool { return v.LogFail }).(pulumi.BoolOutput)
}

// The LogSetting param.
func (o LookupDecryptionRuleResultOutput) LogSetting() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) string { return v.LogSetting }).(pulumi.StringOutput)
}

// The LogSuccess param.
func (o LookupDecryptionRuleResultOutput) LogSuccess() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) bool { return v.LogSuccess }).(pulumi.BoolOutput)
}

// The Name param.
func (o LookupDecryptionRuleResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) string { return v.Name }).(pulumi.StringOutput)
}

// The NegateDestination param.
func (o LookupDecryptionRuleResultOutput) NegateDestination() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) bool { return v.NegateDestination }).(pulumi.BoolOutput)
}

// The NegateSource param.
func (o LookupDecryptionRuleResultOutput) NegateSource() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) bool { return v.NegateSource }).(pulumi.BoolOutput)
}

// The Profile param.
func (o LookupDecryptionRuleResultOutput) Profile() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) string { return v.Profile }).(pulumi.StringOutput)
}

// The Services param.
func (o LookupDecryptionRuleResultOutput) Services() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) []string { return v.Services }).(pulumi.StringArrayOutput)
}

// The SourceHips param.
func (o LookupDecryptionRuleResultOutput) SourceHips() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) []string { return v.SourceHips }).(pulumi.StringArrayOutput)
}

// The SourceUsers param.
func (o LookupDecryptionRuleResultOutput) SourceUsers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) []string { return v.SourceUsers }).(pulumi.StringArrayOutput)
}

// The Sources param.
func (o LookupDecryptionRuleResultOutput) Sources() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) []string { return v.Sources }).(pulumi.StringArrayOutput)
}

// The Tags param.
func (o LookupDecryptionRuleResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func (o LookupDecryptionRuleResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Tos param.
func (o LookupDecryptionRuleResultOutput) Tos() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) []string { return v.Tos }).(pulumi.StringArrayOutput)
}

// The Type param.
func (o LookupDecryptionRuleResultOutput) Type() GetDecryptionRuleTypeOutput {
	return o.ApplyT(func(v LookupDecryptionRuleResult) GetDecryptionRuleType { return v.Type }).(GetDecryptionRuleTypeOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDecryptionRuleResultOutput{})
}
