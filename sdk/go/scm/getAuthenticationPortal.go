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
//			_, err := scm.LookupAuthenticationPortal(ctx, &scm.LookupAuthenticationPortalArgs{
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
func LookupAuthenticationPortal(ctx *pulumi.Context, args *LookupAuthenticationPortalArgs, opts ...pulumi.InvokeOption) (*LookupAuthenticationPortalResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAuthenticationPortalResult
	err := ctx.Invoke("scm:index/getAuthenticationPortal:getAuthenticationPortal", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAuthenticationPortal.
type LookupAuthenticationPortalArgs struct {
	// The Id param.
	Id string `pulumi:"id"`
}

// A collection of values returned by getAuthenticationPortal.
type LookupAuthenticationPortalResult struct {
	// The AuthenticationProfile param.
	AuthenticationProfile string `pulumi:"authenticationProfile"`
	// The CertificateProfile param.
	CertificateProfile string `pulumi:"certificateProfile"`
	// The GpUdpPort param. Value must be between 1 and 65535.
	GpUdpPort int `pulumi:"gpUdpPort"`
	// The Id param.
	Id string `pulumi:"id"`
	// The IdleTimer param. Value must be between 1 and 1440.
	IdleTimer int `pulumi:"idleTimer"`
	// The RedirectHost param.
	RedirectHost string `pulumi:"redirectHost"`
	Tfid         string `pulumi:"tfid"`
	// The Timer param. Value must be between 1 and 1440.
	Timer int `pulumi:"timer"`
	// The TlsServiceProfile param.
	TlsServiceProfile string `pulumi:"tlsServiceProfile"`
}

func LookupAuthenticationPortalOutput(ctx *pulumi.Context, args LookupAuthenticationPortalOutputArgs, opts ...pulumi.InvokeOption) LookupAuthenticationPortalResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAuthenticationPortalResultOutput, error) {
			args := v.(LookupAuthenticationPortalArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupAuthenticationPortalResult
			secret, err := ctx.InvokePackageRaw("scm:index/getAuthenticationPortal:getAuthenticationPortal", args, &rv, "", opts...)
			if err != nil {
				return LookupAuthenticationPortalResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupAuthenticationPortalResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupAuthenticationPortalResultOutput), nil
			}
			return output, nil
		}).(LookupAuthenticationPortalResultOutput)
}

// A collection of arguments for invoking getAuthenticationPortal.
type LookupAuthenticationPortalOutputArgs struct {
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupAuthenticationPortalOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAuthenticationPortalArgs)(nil)).Elem()
}

// A collection of values returned by getAuthenticationPortal.
type LookupAuthenticationPortalResultOutput struct{ *pulumi.OutputState }

func (LookupAuthenticationPortalResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAuthenticationPortalResult)(nil)).Elem()
}

func (o LookupAuthenticationPortalResultOutput) ToLookupAuthenticationPortalResultOutput() LookupAuthenticationPortalResultOutput {
	return o
}

func (o LookupAuthenticationPortalResultOutput) ToLookupAuthenticationPortalResultOutputWithContext(ctx context.Context) LookupAuthenticationPortalResultOutput {
	return o
}

// The AuthenticationProfile param.
func (o LookupAuthenticationPortalResultOutput) AuthenticationProfile() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthenticationPortalResult) string { return v.AuthenticationProfile }).(pulumi.StringOutput)
}

// The CertificateProfile param.
func (o LookupAuthenticationPortalResultOutput) CertificateProfile() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthenticationPortalResult) string { return v.CertificateProfile }).(pulumi.StringOutput)
}

// The GpUdpPort param. Value must be between 1 and 65535.
func (o LookupAuthenticationPortalResultOutput) GpUdpPort() pulumi.IntOutput {
	return o.ApplyT(func(v LookupAuthenticationPortalResult) int { return v.GpUdpPort }).(pulumi.IntOutput)
}

// The Id param.
func (o LookupAuthenticationPortalResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthenticationPortalResult) string { return v.Id }).(pulumi.StringOutput)
}

// The IdleTimer param. Value must be between 1 and 1440.
func (o LookupAuthenticationPortalResultOutput) IdleTimer() pulumi.IntOutput {
	return o.ApplyT(func(v LookupAuthenticationPortalResult) int { return v.IdleTimer }).(pulumi.IntOutput)
}

// The RedirectHost param.
func (o LookupAuthenticationPortalResultOutput) RedirectHost() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthenticationPortalResult) string { return v.RedirectHost }).(pulumi.StringOutput)
}

func (o LookupAuthenticationPortalResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthenticationPortalResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Timer param. Value must be between 1 and 1440.
func (o LookupAuthenticationPortalResultOutput) Timer() pulumi.IntOutput {
	return o.ApplyT(func(v LookupAuthenticationPortalResult) int { return v.Timer }).(pulumi.IntOutput)
}

// The TlsServiceProfile param.
func (o LookupAuthenticationPortalResultOutput) TlsServiceProfile() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthenticationPortalResult) string { return v.TlsServiceProfile }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAuthenticationPortalResultOutput{})
}
