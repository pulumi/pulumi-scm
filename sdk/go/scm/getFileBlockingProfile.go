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
//			_, err := scm.LookupFileBlockingProfile(ctx, &scm.LookupFileBlockingProfileArgs{
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
func LookupFileBlockingProfile(ctx *pulumi.Context, args *LookupFileBlockingProfileArgs, opts ...pulumi.InvokeOption) (*LookupFileBlockingProfileResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupFileBlockingProfileResult
	err := ctx.Invoke("scm:index/getFileBlockingProfile:getFileBlockingProfile", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFileBlockingProfile.
type LookupFileBlockingProfileArgs struct {
	// The Id param.
	Id string `pulumi:"id"`
}

// A collection of values returned by getFileBlockingProfile.
type LookupFileBlockingProfileResult struct {
	// The Description param.
	Description string `pulumi:"description"`
	// The Id param.
	Id string `pulumi:"id"`
	// The Name param.
	Name string `pulumi:"name"`
	// The Rules param.
	Rules []GetFileBlockingProfileRule `pulumi:"rules"`
	Tfid  string                       `pulumi:"tfid"`
}

func LookupFileBlockingProfileOutput(ctx *pulumi.Context, args LookupFileBlockingProfileOutputArgs, opts ...pulumi.InvokeOption) LookupFileBlockingProfileResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupFileBlockingProfileResultOutput, error) {
			args := v.(LookupFileBlockingProfileArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupFileBlockingProfileResult
			secret, err := ctx.InvokePackageRaw("scm:index/getFileBlockingProfile:getFileBlockingProfile", args, &rv, "", opts...)
			if err != nil {
				return LookupFileBlockingProfileResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupFileBlockingProfileResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupFileBlockingProfileResultOutput), nil
			}
			return output, nil
		}).(LookupFileBlockingProfileResultOutput)
}

// A collection of arguments for invoking getFileBlockingProfile.
type LookupFileBlockingProfileOutputArgs struct {
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupFileBlockingProfileOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFileBlockingProfileArgs)(nil)).Elem()
}

// A collection of values returned by getFileBlockingProfile.
type LookupFileBlockingProfileResultOutput struct{ *pulumi.OutputState }

func (LookupFileBlockingProfileResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFileBlockingProfileResult)(nil)).Elem()
}

func (o LookupFileBlockingProfileResultOutput) ToLookupFileBlockingProfileResultOutput() LookupFileBlockingProfileResultOutput {
	return o
}

func (o LookupFileBlockingProfileResultOutput) ToLookupFileBlockingProfileResultOutputWithContext(ctx context.Context) LookupFileBlockingProfileResultOutput {
	return o
}

// The Description param.
func (o LookupFileBlockingProfileResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileBlockingProfileResult) string { return v.Description }).(pulumi.StringOutput)
}

// The Id param.
func (o LookupFileBlockingProfileResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileBlockingProfileResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Name param.
func (o LookupFileBlockingProfileResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileBlockingProfileResult) string { return v.Name }).(pulumi.StringOutput)
}

// The Rules param.
func (o LookupFileBlockingProfileResultOutput) Rules() GetFileBlockingProfileRuleArrayOutput {
	return o.ApplyT(func(v LookupFileBlockingProfileResult) []GetFileBlockingProfileRule { return v.Rules }).(GetFileBlockingProfileRuleArrayOutput)
}

func (o LookupFileBlockingProfileResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFileBlockingProfileResult) string { return v.Tfid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFileBlockingProfileResultOutput{})
}
