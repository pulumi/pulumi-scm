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
//			_, err := scm.LookupServiceConnectionGroup(ctx, &scm.LookupServiceConnectionGroupArgs{
//				Id:     "1234-56-789",
//				Folder: pulumi.StringRef("Service Connections"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupServiceConnectionGroup(ctx *pulumi.Context, args *LookupServiceConnectionGroupArgs, opts ...pulumi.InvokeOption) (*LookupServiceConnectionGroupResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupServiceConnectionGroupResult
	err := ctx.Invoke("scm:index/getServiceConnectionGroup:getServiceConnectionGroup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceConnectionGroup.
type LookupServiceConnectionGroupArgs struct {
	// The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
	Folder *string `pulumi:"folder"`
	// The Id param.
	Id string `pulumi:"id"`
}

// A collection of values returned by getServiceConnectionGroup.
type LookupServiceConnectionGroupResult struct {
	// The DisableSnat param.
	DisableSnat bool `pulumi:"disableSnat"`
	// The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
	Folder string `pulumi:"folder"`
	// The Id param.
	Id string `pulumi:"id"`
	// The Name param.
	Name string `pulumi:"name"`
	// The PbfOnly param.
	PbfOnly bool `pulumi:"pbfOnly"`
	// The Targets param.
	Targets []string `pulumi:"targets"`
	Tfid    string   `pulumi:"tfid"`
}

func LookupServiceConnectionGroupOutput(ctx *pulumi.Context, args LookupServiceConnectionGroupOutputArgs, opts ...pulumi.InvokeOption) LookupServiceConnectionGroupResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupServiceConnectionGroupResultOutput, error) {
			args := v.(LookupServiceConnectionGroupArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupServiceConnectionGroupResult
			secret, err := ctx.InvokePackageRaw("scm:index/getServiceConnectionGroup:getServiceConnectionGroup", args, &rv, "", opts...)
			if err != nil {
				return LookupServiceConnectionGroupResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupServiceConnectionGroupResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupServiceConnectionGroupResultOutput), nil
			}
			return output, nil
		}).(LookupServiceConnectionGroupResultOutput)
}

// A collection of arguments for invoking getServiceConnectionGroup.
type LookupServiceConnectionGroupOutputArgs struct {
	// The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
	Folder pulumi.StringPtrInput `pulumi:"folder"`
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupServiceConnectionGroupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceConnectionGroupArgs)(nil)).Elem()
}

// A collection of values returned by getServiceConnectionGroup.
type LookupServiceConnectionGroupResultOutput struct{ *pulumi.OutputState }

func (LookupServiceConnectionGroupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceConnectionGroupResult)(nil)).Elem()
}

func (o LookupServiceConnectionGroupResultOutput) ToLookupServiceConnectionGroupResultOutput() LookupServiceConnectionGroupResultOutput {
	return o
}

func (o LookupServiceConnectionGroupResultOutput) ToLookupServiceConnectionGroupResultOutputWithContext(ctx context.Context) LookupServiceConnectionGroupResultOutput {
	return o
}

// The DisableSnat param.
func (o LookupServiceConnectionGroupResultOutput) DisableSnat() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServiceConnectionGroupResult) bool { return v.DisableSnat }).(pulumi.BoolOutput)
}

// The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
func (o LookupServiceConnectionGroupResultOutput) Folder() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceConnectionGroupResult) string { return v.Folder }).(pulumi.StringOutput)
}

// The Id param.
func (o LookupServiceConnectionGroupResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceConnectionGroupResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Name param.
func (o LookupServiceConnectionGroupResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceConnectionGroupResult) string { return v.Name }).(pulumi.StringOutput)
}

// The PbfOnly param.
func (o LookupServiceConnectionGroupResultOutput) PbfOnly() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupServiceConnectionGroupResult) bool { return v.PbfOnly }).(pulumi.BoolOutput)
}

// The Targets param.
func (o LookupServiceConnectionGroupResultOutput) Targets() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupServiceConnectionGroupResult) []string { return v.Targets }).(pulumi.StringArrayOutput)
}

func (o LookupServiceConnectionGroupResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceConnectionGroupResult) string { return v.Tfid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceConnectionGroupResultOutput{})
}
