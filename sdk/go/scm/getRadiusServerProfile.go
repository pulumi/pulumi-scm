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
//			_, err := scm.LookupRadiusServerProfile(ctx, &scm.LookupRadiusServerProfileArgs{
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
func LookupRadiusServerProfile(ctx *pulumi.Context, args *LookupRadiusServerProfileArgs, opts ...pulumi.InvokeOption) (*LookupRadiusServerProfileResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupRadiusServerProfileResult
	err := ctx.Invoke("scm:index/getRadiusServerProfile:getRadiusServerProfile", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRadiusServerProfile.
type LookupRadiusServerProfileArgs struct {
	// The Id param.
	Id string `pulumi:"id"`
}

// A collection of values returned by getRadiusServerProfile.
type LookupRadiusServerProfileResult struct {
	// The Id param.
	Id string `pulumi:"id"`
	// The Protocol param.
	Protocol GetRadiusServerProfileProtocol `pulumi:"protocol"`
	// The Retries param. Value must be between 1 and 5.
	Retries int `pulumi:"retries"`
	// The Servers param.
	Servers []GetRadiusServerProfileServer `pulumi:"servers"`
	Tfid    string                         `pulumi:"tfid"`
	// The Timeout param. Value must be between 1 and 120.
	Timeout int `pulumi:"timeout"`
}

func LookupRadiusServerProfileOutput(ctx *pulumi.Context, args LookupRadiusServerProfileOutputArgs, opts ...pulumi.InvokeOption) LookupRadiusServerProfileResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupRadiusServerProfileResultOutput, error) {
			args := v.(LookupRadiusServerProfileArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupRadiusServerProfileResult
			secret, err := ctx.InvokePackageRaw("scm:index/getRadiusServerProfile:getRadiusServerProfile", args, &rv, "", opts...)
			if err != nil {
				return LookupRadiusServerProfileResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupRadiusServerProfileResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupRadiusServerProfileResultOutput), nil
			}
			return output, nil
		}).(LookupRadiusServerProfileResultOutput)
}

// A collection of arguments for invoking getRadiusServerProfile.
type LookupRadiusServerProfileOutputArgs struct {
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupRadiusServerProfileOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRadiusServerProfileArgs)(nil)).Elem()
}

// A collection of values returned by getRadiusServerProfile.
type LookupRadiusServerProfileResultOutput struct{ *pulumi.OutputState }

func (LookupRadiusServerProfileResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRadiusServerProfileResult)(nil)).Elem()
}

func (o LookupRadiusServerProfileResultOutput) ToLookupRadiusServerProfileResultOutput() LookupRadiusServerProfileResultOutput {
	return o
}

func (o LookupRadiusServerProfileResultOutput) ToLookupRadiusServerProfileResultOutputWithContext(ctx context.Context) LookupRadiusServerProfileResultOutput {
	return o
}

// The Id param.
func (o LookupRadiusServerProfileResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRadiusServerProfileResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Protocol param.
func (o LookupRadiusServerProfileResultOutput) Protocol() GetRadiusServerProfileProtocolOutput {
	return o.ApplyT(func(v LookupRadiusServerProfileResult) GetRadiusServerProfileProtocol { return v.Protocol }).(GetRadiusServerProfileProtocolOutput)
}

// The Retries param. Value must be between 1 and 5.
func (o LookupRadiusServerProfileResultOutput) Retries() pulumi.IntOutput {
	return o.ApplyT(func(v LookupRadiusServerProfileResult) int { return v.Retries }).(pulumi.IntOutput)
}

// The Servers param.
func (o LookupRadiusServerProfileResultOutput) Servers() GetRadiusServerProfileServerArrayOutput {
	return o.ApplyT(func(v LookupRadiusServerProfileResult) []GetRadiusServerProfileServer { return v.Servers }).(GetRadiusServerProfileServerArrayOutput)
}

func (o LookupRadiusServerProfileResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRadiusServerProfileResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Timeout param. Value must be between 1 and 120.
func (o LookupRadiusServerProfileResultOutput) Timeout() pulumi.IntOutput {
	return o.ApplyT(func(v LookupRadiusServerProfileResult) int { return v.Timeout }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRadiusServerProfileResultOutput{})
}
