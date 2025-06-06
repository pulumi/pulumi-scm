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
//			_, err := scm.LookupTlsServiceProfile(ctx, &scm.LookupTlsServiceProfileArgs{
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
func LookupTlsServiceProfile(ctx *pulumi.Context, args *LookupTlsServiceProfileArgs, opts ...pulumi.InvokeOption) (*LookupTlsServiceProfileResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTlsServiceProfileResult
	err := ctx.Invoke("scm:index/getTlsServiceProfile:getTlsServiceProfile", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTlsServiceProfile.
type LookupTlsServiceProfileArgs struct {
	// The Id param.
	Id string `pulumi:"id"`
}

// A collection of values returned by getTlsServiceProfile.
type LookupTlsServiceProfileResult struct {
	// SSL certificate file name. String length must not exceed 255 characters.
	Certificate string `pulumi:"certificate"`
	// The Id param.
	Id string `pulumi:"id"`
	// SSL TLS Service Profile name, value is muCustomDomainSSLProfile when it is used on mobile-agent infra settings. String length must not exceed 127 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
	Name string `pulumi:"name"`
	// The ProtocolSettings param.
	ProtocolSettings GetTlsServiceProfileProtocolSettings `pulumi:"protocolSettings"`
	Tfid             string                               `pulumi:"tfid"`
}

func LookupTlsServiceProfileOutput(ctx *pulumi.Context, args LookupTlsServiceProfileOutputArgs, opts ...pulumi.InvokeOption) LookupTlsServiceProfileResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupTlsServiceProfileResultOutput, error) {
			args := v.(LookupTlsServiceProfileArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getTlsServiceProfile:getTlsServiceProfile", args, LookupTlsServiceProfileResultOutput{}, options).(LookupTlsServiceProfileResultOutput), nil
		}).(LookupTlsServiceProfileResultOutput)
}

// A collection of arguments for invoking getTlsServiceProfile.
type LookupTlsServiceProfileOutputArgs struct {
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupTlsServiceProfileOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTlsServiceProfileArgs)(nil)).Elem()
}

// A collection of values returned by getTlsServiceProfile.
type LookupTlsServiceProfileResultOutput struct{ *pulumi.OutputState }

func (LookupTlsServiceProfileResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTlsServiceProfileResult)(nil)).Elem()
}

func (o LookupTlsServiceProfileResultOutput) ToLookupTlsServiceProfileResultOutput() LookupTlsServiceProfileResultOutput {
	return o
}

func (o LookupTlsServiceProfileResultOutput) ToLookupTlsServiceProfileResultOutputWithContext(ctx context.Context) LookupTlsServiceProfileResultOutput {
	return o
}

// SSL certificate file name. String length must not exceed 255 characters.
func (o LookupTlsServiceProfileResultOutput) Certificate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsServiceProfileResult) string { return v.Certificate }).(pulumi.StringOutput)
}

// The Id param.
func (o LookupTlsServiceProfileResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsServiceProfileResult) string { return v.Id }).(pulumi.StringOutput)
}

// SSL TLS Service Profile name, value is muCustomDomainSSLProfile when it is used on mobile-agent infra settings. String length must not exceed 127 characters. String validation regex: `^[a-zA-Z0-9._-]+$`.
func (o LookupTlsServiceProfileResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsServiceProfileResult) string { return v.Name }).(pulumi.StringOutput)
}

// The ProtocolSettings param.
func (o LookupTlsServiceProfileResultOutput) ProtocolSettings() GetTlsServiceProfileProtocolSettingsOutput {
	return o.ApplyT(func(v LookupTlsServiceProfileResult) GetTlsServiceProfileProtocolSettings { return v.ProtocolSettings }).(GetTlsServiceProfileProtocolSettingsOutput)
}

func (o LookupTlsServiceProfileResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTlsServiceProfileResult) string { return v.Tfid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTlsServiceProfileResultOutput{})
}
