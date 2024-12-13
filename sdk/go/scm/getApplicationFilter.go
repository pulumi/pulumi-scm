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
//			_, err := scm.LookupApplicationFilter(ctx, &scm.LookupApplicationFilterArgs{
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
func LookupApplicationFilter(ctx *pulumi.Context, args *LookupApplicationFilterArgs, opts ...pulumi.InvokeOption) (*LookupApplicationFilterResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupApplicationFilterResult
	err := ctx.Invoke("scm:index/getApplicationFilter:getApplicationFilter", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApplicationFilter.
type LookupApplicationFilterArgs struct {
	// The Id param.
	Id string `pulumi:"id"`
}

// A collection of values returned by getApplicationFilter.
type LookupApplicationFilterResult struct {
	// The Categories param. Individual elements in this list are subject to additional validation. String length must not exceed 128 characters.
	Categories []string `pulumi:"categories"`
	// only True is a valid value.
	Evasive bool `pulumi:"evasive"`
	// only True is a valid value.
	ExcessiveBandwidthUse bool `pulumi:"excessiveBandwidthUse"`
	// The Excludes param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
	Excludes []string `pulumi:"excludes"`
	// only True is a valid value.
	HasKnownVulnerabilities bool `pulumi:"hasKnownVulnerabilities"`
	// The Id param.
	Id string `pulumi:"id"`
	// only True is a valid value.
	IsSaas bool `pulumi:"isSaas"`
	// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
	Name string `pulumi:"name"`
	// only True is a valid value.
	NewAppid bool `pulumi:"newAppid"`
	// only True is a valid value.
	Pervasive bool `pulumi:"pervasive"`
	// only True is a valid value.
	ProneToMisuse bool `pulumi:"proneToMisuse"`
	// The Risks param. Individual elements in this list are subject to additional validation. Value must be between 1 and 5.
	Risks []int `pulumi:"risks"`
	// The SaasCertifications param. Individual elements in this list are subject to additional validation. String length must not exceed 32 characters.
	SaasCertifications []string `pulumi:"saasCertifications"`
	// The SaasRisks param. Individual elements in this list are subject to additional validation. String length must not exceed 32 characters.
	SaasRisks []string `pulumi:"saasRisks"`
	// The Subcategories param. Individual elements in this list are subject to additional validation. String length must not exceed 128 characters.
	Subcategories []string `pulumi:"subcategories"`
	// The Tagging param.
	Tagging GetApplicationFilterTagging `pulumi:"tagging"`
	// The Technologies param. Individual elements in this list are subject to additional validation. String length must not exceed 128 characters.
	Technologies []string `pulumi:"technologies"`
	Tfid         string   `pulumi:"tfid"`
	// only True is a valid value.
	TransfersFiles bool `pulumi:"transfersFiles"`
	// only True is a valid value.
	TunnelsOtherApps bool `pulumi:"tunnelsOtherApps"`
	// only True is a valid value.
	UsedByMalware bool `pulumi:"usedByMalware"`
}

func LookupApplicationFilterOutput(ctx *pulumi.Context, args LookupApplicationFilterOutputArgs, opts ...pulumi.InvokeOption) LookupApplicationFilterResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupApplicationFilterResultOutput, error) {
			args := v.(LookupApplicationFilterArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getApplicationFilter:getApplicationFilter", args, LookupApplicationFilterResultOutput{}, options).(LookupApplicationFilterResultOutput), nil
		}).(LookupApplicationFilterResultOutput)
}

// A collection of arguments for invoking getApplicationFilter.
type LookupApplicationFilterOutputArgs struct {
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupApplicationFilterOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplicationFilterArgs)(nil)).Elem()
}

// A collection of values returned by getApplicationFilter.
type LookupApplicationFilterResultOutput struct{ *pulumi.OutputState }

func (LookupApplicationFilterResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupApplicationFilterResult)(nil)).Elem()
}

func (o LookupApplicationFilterResultOutput) ToLookupApplicationFilterResultOutput() LookupApplicationFilterResultOutput {
	return o
}

func (o LookupApplicationFilterResultOutput) ToLookupApplicationFilterResultOutputWithContext(ctx context.Context) LookupApplicationFilterResultOutput {
	return o
}

// The Categories param. Individual elements in this list are subject to additional validation. String length must not exceed 128 characters.
func (o LookupApplicationFilterResultOutput) Categories() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) []string { return v.Categories }).(pulumi.StringArrayOutput)
}

// only True is a valid value.
func (o LookupApplicationFilterResultOutput) Evasive() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) bool { return v.Evasive }).(pulumi.BoolOutput)
}

// only True is a valid value.
func (o LookupApplicationFilterResultOutput) ExcessiveBandwidthUse() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) bool { return v.ExcessiveBandwidthUse }).(pulumi.BoolOutput)
}

// The Excludes param. Individual elements in this list are subject to additional validation. String length must not exceed 63 characters.
func (o LookupApplicationFilterResultOutput) Excludes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) []string { return v.Excludes }).(pulumi.StringArrayOutput)
}

// only True is a valid value.
func (o LookupApplicationFilterResultOutput) HasKnownVulnerabilities() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) bool { return v.HasKnownVulnerabilities }).(pulumi.BoolOutput)
}

// The Id param.
func (o LookupApplicationFilterResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) string { return v.Id }).(pulumi.StringOutput)
}

// only True is a valid value.
func (o LookupApplicationFilterResultOutput) IsSaas() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) bool { return v.IsSaas }).(pulumi.BoolOutput)
}

// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
func (o LookupApplicationFilterResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) string { return v.Name }).(pulumi.StringOutput)
}

// only True is a valid value.
func (o LookupApplicationFilterResultOutput) NewAppid() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) bool { return v.NewAppid }).(pulumi.BoolOutput)
}

// only True is a valid value.
func (o LookupApplicationFilterResultOutput) Pervasive() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) bool { return v.Pervasive }).(pulumi.BoolOutput)
}

// only True is a valid value.
func (o LookupApplicationFilterResultOutput) ProneToMisuse() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) bool { return v.ProneToMisuse }).(pulumi.BoolOutput)
}

// The Risks param. Individual elements in this list are subject to additional validation. Value must be between 1 and 5.
func (o LookupApplicationFilterResultOutput) Risks() pulumi.IntArrayOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) []int { return v.Risks }).(pulumi.IntArrayOutput)
}

// The SaasCertifications param. Individual elements in this list are subject to additional validation. String length must not exceed 32 characters.
func (o LookupApplicationFilterResultOutput) SaasCertifications() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) []string { return v.SaasCertifications }).(pulumi.StringArrayOutput)
}

// The SaasRisks param. Individual elements in this list are subject to additional validation. String length must not exceed 32 characters.
func (o LookupApplicationFilterResultOutput) SaasRisks() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) []string { return v.SaasRisks }).(pulumi.StringArrayOutput)
}

// The Subcategories param. Individual elements in this list are subject to additional validation. String length must not exceed 128 characters.
func (o LookupApplicationFilterResultOutput) Subcategories() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) []string { return v.Subcategories }).(pulumi.StringArrayOutput)
}

// The Tagging param.
func (o LookupApplicationFilterResultOutput) Tagging() GetApplicationFilterTaggingOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) GetApplicationFilterTagging { return v.Tagging }).(GetApplicationFilterTaggingOutput)
}

// The Technologies param. Individual elements in this list are subject to additional validation. String length must not exceed 128 characters.
func (o LookupApplicationFilterResultOutput) Technologies() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) []string { return v.Technologies }).(pulumi.StringArrayOutput)
}

func (o LookupApplicationFilterResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// only True is a valid value.
func (o LookupApplicationFilterResultOutput) TransfersFiles() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) bool { return v.TransfersFiles }).(pulumi.BoolOutput)
}

// only True is a valid value.
func (o LookupApplicationFilterResultOutput) TunnelsOtherApps() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) bool { return v.TunnelsOtherApps }).(pulumi.BoolOutput)
}

// only True is a valid value.
func (o LookupApplicationFilterResultOutput) UsedByMalware() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupApplicationFilterResult) bool { return v.UsedByMalware }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupApplicationFilterResultOutput{})
}
