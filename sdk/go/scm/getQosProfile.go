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
//			_, err := scm.LookupQosProfile(ctx, &scm.LookupQosProfileArgs{
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
func LookupQosProfile(ctx *pulumi.Context, args *LookupQosProfileArgs, opts ...pulumi.InvokeOption) (*LookupQosProfileResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupQosProfileResult
	err := ctx.Invoke("scm:index/getQosProfile:getQosProfile", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getQosProfile.
type LookupQosProfileArgs struct {
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The Id param.
	Id string `pulumi:"id"`
}

// A collection of values returned by getQosProfile.
type LookupQosProfileResult struct {
	// The AggregateBandwidth param.
	AggregateBandwidth GetQosProfileAggregateBandwidth `pulumi:"aggregateBandwidth"`
	// The ClassBandwidthType param.
	ClassBandwidthType GetQosProfileClassBandwidthType `pulumi:"classBandwidthType"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The Id param.
	Id string `pulumi:"id"`
	// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
	Name string `pulumi:"name"`
	Tfid string `pulumi:"tfid"`
}

func LookupQosProfileOutput(ctx *pulumi.Context, args LookupQosProfileOutputArgs, opts ...pulumi.InvokeOption) LookupQosProfileResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupQosProfileResult, error) {
			args := v.(LookupQosProfileArgs)
			r, err := LookupQosProfile(ctx, &args, opts...)
			var s LookupQosProfileResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupQosProfileResultOutput)
}

// A collection of arguments for invoking getQosProfile.
type LookupQosProfileOutputArgs struct {
	// The Folder param.
	Folder pulumi.StringPtrInput `pulumi:"folder"`
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupQosProfileOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupQosProfileArgs)(nil)).Elem()
}

// A collection of values returned by getQosProfile.
type LookupQosProfileResultOutput struct{ *pulumi.OutputState }

func (LookupQosProfileResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupQosProfileResult)(nil)).Elem()
}

func (o LookupQosProfileResultOutput) ToLookupQosProfileResultOutput() LookupQosProfileResultOutput {
	return o
}

func (o LookupQosProfileResultOutput) ToLookupQosProfileResultOutputWithContext(ctx context.Context) LookupQosProfileResultOutput {
	return o
}

// The AggregateBandwidth param.
func (o LookupQosProfileResultOutput) AggregateBandwidth() GetQosProfileAggregateBandwidthOutput {
	return o.ApplyT(func(v LookupQosProfileResult) GetQosProfileAggregateBandwidth { return v.AggregateBandwidth }).(GetQosProfileAggregateBandwidthOutput)
}

// The ClassBandwidthType param.
func (o LookupQosProfileResultOutput) ClassBandwidthType() GetQosProfileClassBandwidthTypeOutput {
	return o.ApplyT(func(v LookupQosProfileResult) GetQosProfileClassBandwidthType { return v.ClassBandwidthType }).(GetQosProfileClassBandwidthTypeOutput)
}

// The Folder param.
func (o LookupQosProfileResultOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupQosProfileResult) *string { return v.Folder }).(pulumi.StringPtrOutput)
}

// The Id param.
func (o LookupQosProfileResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupQosProfileResult) string { return v.Id }).(pulumi.StringOutput)
}

// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
func (o LookupQosProfileResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupQosProfileResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupQosProfileResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupQosProfileResult) string { return v.Tfid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupQosProfileResultOutput{})
}
