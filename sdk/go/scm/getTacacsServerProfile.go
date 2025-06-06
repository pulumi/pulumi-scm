// Code generated by pulumi-language-go DO NOT EDIT.
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
//			_, err := scm.LookupTacacsServerProfile(ctx, &scm.LookupTacacsServerProfileArgs{
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
func LookupTacacsServerProfile(ctx *pulumi.Context, args *LookupTacacsServerProfileArgs, opts ...pulumi.InvokeOption) (*LookupTacacsServerProfileResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTacacsServerProfileResult
	err := ctx.Invoke("scm:index/getTacacsServerProfile:getTacacsServerProfile", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTacacsServerProfile.
type LookupTacacsServerProfileArgs struct {
	// The Id param.
	Id string `pulumi:"id"`
}

// A collection of values returned by getTacacsServerProfile.
type LookupTacacsServerProfileResult struct {
	// The Id param.
	Id string `pulumi:"id"`
	// The Protocol param. String must be one of these: `"CHAP"`, `"PAP"`.
	Protocol string `pulumi:"protocol"`
	// The Servers param.
	Servers []GetTacacsServerProfileServer `pulumi:"servers"`
	Tfid    string                         `pulumi:"tfid"`
	// The Timeout param. Value must be between 1 and 30.
	Timeout int `pulumi:"timeout"`
	// The UseSingleConnection param.
	UseSingleConnection bool `pulumi:"useSingleConnection"`
}

func LookupTacacsServerProfileOutput(ctx *pulumi.Context, args LookupTacacsServerProfileOutputArgs, opts ...pulumi.InvokeOption) LookupTacacsServerProfileResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupTacacsServerProfileResultOutput, error) {
			args := v.(LookupTacacsServerProfileArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getTacacsServerProfile:getTacacsServerProfile", args, LookupTacacsServerProfileResultOutput{}, options).(LookupTacacsServerProfileResultOutput), nil
		}).(LookupTacacsServerProfileResultOutput)
}

// A collection of arguments for invoking getTacacsServerProfile.
type LookupTacacsServerProfileOutputArgs struct {
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupTacacsServerProfileOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTacacsServerProfileArgs)(nil)).Elem()
}

// A collection of values returned by getTacacsServerProfile.
type LookupTacacsServerProfileResultOutput struct{ *pulumi.OutputState }

func (LookupTacacsServerProfileResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTacacsServerProfileResult)(nil)).Elem()
}

func (o LookupTacacsServerProfileResultOutput) ToLookupTacacsServerProfileResultOutput() LookupTacacsServerProfileResultOutput {
	return o
}

func (o LookupTacacsServerProfileResultOutput) ToLookupTacacsServerProfileResultOutputWithContext(ctx context.Context) LookupTacacsServerProfileResultOutput {
	return o
}

// The Id param.
func (o LookupTacacsServerProfileResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTacacsServerProfileResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Protocol param. String must be one of these: `"CHAP"`, `"PAP"`.
func (o LookupTacacsServerProfileResultOutput) Protocol() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTacacsServerProfileResult) string { return v.Protocol }).(pulumi.StringOutput)
}

// The Servers param.
func (o LookupTacacsServerProfileResultOutput) Servers() GetTacacsServerProfileServerArrayOutput {
	return o.ApplyT(func(v LookupTacacsServerProfileResult) []GetTacacsServerProfileServer { return v.Servers }).(GetTacacsServerProfileServerArrayOutput)
}

func (o LookupTacacsServerProfileResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTacacsServerProfileResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Timeout param. Value must be between 1 and 30.
func (o LookupTacacsServerProfileResultOutput) Timeout() pulumi.IntOutput {
	return o.ApplyT(func(v LookupTacacsServerProfileResult) int { return v.Timeout }).(pulumi.IntOutput)
}

// The UseSingleConnection param.
func (o LookupTacacsServerProfileResultOutput) UseSingleConnection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupTacacsServerProfileResult) bool { return v.UseSingleConnection }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTacacsServerProfileResultOutput{})
}
