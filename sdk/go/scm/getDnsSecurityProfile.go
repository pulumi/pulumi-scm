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
//			_, err := scm.LookupDnsSecurityProfile(ctx, &scm.LookupDnsSecurityProfileArgs{
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
func LookupDnsSecurityProfile(ctx *pulumi.Context, args *LookupDnsSecurityProfileArgs, opts ...pulumi.InvokeOption) (*LookupDnsSecurityProfileResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDnsSecurityProfileResult
	err := ctx.Invoke("scm:index/getDnsSecurityProfile:getDnsSecurityProfile", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDnsSecurityProfile.
type LookupDnsSecurityProfileArgs struct {
	// The Id param.
	Id string `pulumi:"id"`
}

// A collection of values returned by getDnsSecurityProfile.
type LookupDnsSecurityProfileResult struct {
	// The BotnetDomains param.
	BotnetDomains GetDnsSecurityProfileBotnetDomains `pulumi:"botnetDomains"`
	// The Description param.
	Description string `pulumi:"description"`
	// The Id param.
	Id string `pulumi:"id"`
	// The Name param.
	Name string `pulumi:"name"`
	Tfid string `pulumi:"tfid"`
}

func LookupDnsSecurityProfileOutput(ctx *pulumi.Context, args LookupDnsSecurityProfileOutputArgs, opts ...pulumi.InvokeOption) LookupDnsSecurityProfileResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupDnsSecurityProfileResultOutput, error) {
			args := v.(LookupDnsSecurityProfileArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getDnsSecurityProfile:getDnsSecurityProfile", args, LookupDnsSecurityProfileResultOutput{}, options).(LookupDnsSecurityProfileResultOutput), nil
		}).(LookupDnsSecurityProfileResultOutput)
}

// A collection of arguments for invoking getDnsSecurityProfile.
type LookupDnsSecurityProfileOutputArgs struct {
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupDnsSecurityProfileOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDnsSecurityProfileArgs)(nil)).Elem()
}

// A collection of values returned by getDnsSecurityProfile.
type LookupDnsSecurityProfileResultOutput struct{ *pulumi.OutputState }

func (LookupDnsSecurityProfileResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDnsSecurityProfileResult)(nil)).Elem()
}

func (o LookupDnsSecurityProfileResultOutput) ToLookupDnsSecurityProfileResultOutput() LookupDnsSecurityProfileResultOutput {
	return o
}

func (o LookupDnsSecurityProfileResultOutput) ToLookupDnsSecurityProfileResultOutputWithContext(ctx context.Context) LookupDnsSecurityProfileResultOutput {
	return o
}

// The BotnetDomains param.
func (o LookupDnsSecurityProfileResultOutput) BotnetDomains() GetDnsSecurityProfileBotnetDomainsOutput {
	return o.ApplyT(func(v LookupDnsSecurityProfileResult) GetDnsSecurityProfileBotnetDomains { return v.BotnetDomains }).(GetDnsSecurityProfileBotnetDomainsOutput)
}

// The Description param.
func (o LookupDnsSecurityProfileResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDnsSecurityProfileResult) string { return v.Description }).(pulumi.StringOutput)
}

// The Id param.
func (o LookupDnsSecurityProfileResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDnsSecurityProfileResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Name param.
func (o LookupDnsSecurityProfileResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDnsSecurityProfileResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupDnsSecurityProfileResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDnsSecurityProfileResult) string { return v.Tfid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDnsSecurityProfileResultOutput{})
}
