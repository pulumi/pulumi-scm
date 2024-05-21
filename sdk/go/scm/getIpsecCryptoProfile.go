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
//			_, err := scm.LookupIpsecCryptoProfile(ctx, &scm.LookupIpsecCryptoProfileArgs{
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
func LookupIpsecCryptoProfile(ctx *pulumi.Context, args *LookupIpsecCryptoProfileArgs, opts ...pulumi.InvokeOption) (*LookupIpsecCryptoProfileResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupIpsecCryptoProfileResult
	err := ctx.Invoke("scm:index/getIpsecCryptoProfile:getIpsecCryptoProfile", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIpsecCryptoProfile.
type LookupIpsecCryptoProfileArgs struct {
	// The Device param.
	Device *string `pulumi:"device"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The Id param.
	Id string `pulumi:"id"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
}

// A collection of values returned by getIpsecCryptoProfile.
type LookupIpsecCryptoProfileResult struct {
	// The Ah param.
	Ah GetIpsecCryptoProfileAh `pulumi:"ah"`
	// The Device param.
	Device *string `pulumi:"device"`
	// phase-2 DH group (PFS DH group). String must be one of these: `"no-pfs"`, `"group1"`, `"group2"`, `"group5"`, `"group14"`, `"group19"`, `"group20"`. Default: `"group2"`.
	DhGroup string `pulumi:"dhGroup"`
	// The Esp param.
	Esp GetIpsecCryptoProfileEsp `pulumi:"esp"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The Id param.
	Id string `pulumi:"id"`
	// The Lifesize param.
	Lifesize GetIpsecCryptoProfileLifesize `pulumi:"lifesize"`
	// The Lifetime param.
	Lifetime GetIpsecCryptoProfileLifetime `pulumi:"lifetime"`
	// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
	Name string `pulumi:"name"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
	Tfid    string  `pulumi:"tfid"`
}

func LookupIpsecCryptoProfileOutput(ctx *pulumi.Context, args LookupIpsecCryptoProfileOutputArgs, opts ...pulumi.InvokeOption) LookupIpsecCryptoProfileResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupIpsecCryptoProfileResult, error) {
			args := v.(LookupIpsecCryptoProfileArgs)
			r, err := LookupIpsecCryptoProfile(ctx, &args, opts...)
			var s LookupIpsecCryptoProfileResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupIpsecCryptoProfileResultOutput)
}

// A collection of arguments for invoking getIpsecCryptoProfile.
type LookupIpsecCryptoProfileOutputArgs struct {
	// The Device param.
	Device pulumi.StringPtrInput `pulumi:"device"`
	// The Folder param.
	Folder pulumi.StringPtrInput `pulumi:"folder"`
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
	// The Snippet param.
	Snippet pulumi.StringPtrInput `pulumi:"snippet"`
}

func (LookupIpsecCryptoProfileOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupIpsecCryptoProfileArgs)(nil)).Elem()
}

// A collection of values returned by getIpsecCryptoProfile.
type LookupIpsecCryptoProfileResultOutput struct{ *pulumi.OutputState }

func (LookupIpsecCryptoProfileResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupIpsecCryptoProfileResult)(nil)).Elem()
}

func (o LookupIpsecCryptoProfileResultOutput) ToLookupIpsecCryptoProfileResultOutput() LookupIpsecCryptoProfileResultOutput {
	return o
}

func (o LookupIpsecCryptoProfileResultOutput) ToLookupIpsecCryptoProfileResultOutputWithContext(ctx context.Context) LookupIpsecCryptoProfileResultOutput {
	return o
}

// The Ah param.
func (o LookupIpsecCryptoProfileResultOutput) Ah() GetIpsecCryptoProfileAhOutput {
	return o.ApplyT(func(v LookupIpsecCryptoProfileResult) GetIpsecCryptoProfileAh { return v.Ah }).(GetIpsecCryptoProfileAhOutput)
}

// The Device param.
func (o LookupIpsecCryptoProfileResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupIpsecCryptoProfileResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// phase-2 DH group (PFS DH group). String must be one of these: `"no-pfs"`, `"group1"`, `"group2"`, `"group5"`, `"group14"`, `"group19"`, `"group20"`. Default: `"group2"`.
func (o LookupIpsecCryptoProfileResultOutput) DhGroup() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIpsecCryptoProfileResult) string { return v.DhGroup }).(pulumi.StringOutput)
}

// The Esp param.
func (o LookupIpsecCryptoProfileResultOutput) Esp() GetIpsecCryptoProfileEspOutput {
	return o.ApplyT(func(v LookupIpsecCryptoProfileResult) GetIpsecCryptoProfileEsp { return v.Esp }).(GetIpsecCryptoProfileEspOutput)
}

// The Folder param.
func (o LookupIpsecCryptoProfileResultOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupIpsecCryptoProfileResult) *string { return v.Folder }).(pulumi.StringPtrOutput)
}

// The Id param.
func (o LookupIpsecCryptoProfileResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIpsecCryptoProfileResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Lifesize param.
func (o LookupIpsecCryptoProfileResultOutput) Lifesize() GetIpsecCryptoProfileLifesizeOutput {
	return o.ApplyT(func(v LookupIpsecCryptoProfileResult) GetIpsecCryptoProfileLifesize { return v.Lifesize }).(GetIpsecCryptoProfileLifesizeOutput)
}

// The Lifetime param.
func (o LookupIpsecCryptoProfileResultOutput) Lifetime() GetIpsecCryptoProfileLifetimeOutput {
	return o.ApplyT(func(v LookupIpsecCryptoProfileResult) GetIpsecCryptoProfileLifetime { return v.Lifetime }).(GetIpsecCryptoProfileLifetimeOutput)
}

// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
func (o LookupIpsecCryptoProfileResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIpsecCryptoProfileResult) string { return v.Name }).(pulumi.StringOutput)
}

// The Snippet param.
func (o LookupIpsecCryptoProfileResultOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupIpsecCryptoProfileResult) *string { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o LookupIpsecCryptoProfileResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIpsecCryptoProfileResult) string { return v.Tfid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupIpsecCryptoProfileResultOutput{})
}
