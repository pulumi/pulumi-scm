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
//			_, err := scm.LookupAuthenticationSequence(ctx, &scm.LookupAuthenticationSequenceArgs{
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
func LookupAuthenticationSequence(ctx *pulumi.Context, args *LookupAuthenticationSequenceArgs, opts ...pulumi.InvokeOption) (*LookupAuthenticationSequenceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAuthenticationSequenceResult
	err := ctx.Invoke("scm:index/getAuthenticationSequence:getAuthenticationSequence", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAuthenticationSequence.
type LookupAuthenticationSequenceArgs struct {
	// The Id param.
	Id string `pulumi:"id"`
}

// A collection of values returned by getAuthenticationSequence.
type LookupAuthenticationSequenceResult struct {
	// The AuthenticationProfiles param.
	AuthenticationProfiles []string `pulumi:"authenticationProfiles"`
	// The Id param.
	Id string `pulumi:"id"`
	// The Name param.
	Name string `pulumi:"name"`
	Tfid string `pulumi:"tfid"`
	// The UseDomainFindProfile param. Default: `true`.
	UseDomainFindProfile bool `pulumi:"useDomainFindProfile"`
}

func LookupAuthenticationSequenceOutput(ctx *pulumi.Context, args LookupAuthenticationSequenceOutputArgs, opts ...pulumi.InvokeOption) LookupAuthenticationSequenceResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAuthenticationSequenceResultOutput, error) {
			args := v.(LookupAuthenticationSequenceArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getAuthenticationSequence:getAuthenticationSequence", args, LookupAuthenticationSequenceResultOutput{}, options).(LookupAuthenticationSequenceResultOutput), nil
		}).(LookupAuthenticationSequenceResultOutput)
}

// A collection of arguments for invoking getAuthenticationSequence.
type LookupAuthenticationSequenceOutputArgs struct {
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupAuthenticationSequenceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAuthenticationSequenceArgs)(nil)).Elem()
}

// A collection of values returned by getAuthenticationSequence.
type LookupAuthenticationSequenceResultOutput struct{ *pulumi.OutputState }

func (LookupAuthenticationSequenceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAuthenticationSequenceResult)(nil)).Elem()
}

func (o LookupAuthenticationSequenceResultOutput) ToLookupAuthenticationSequenceResultOutput() LookupAuthenticationSequenceResultOutput {
	return o
}

func (o LookupAuthenticationSequenceResultOutput) ToLookupAuthenticationSequenceResultOutputWithContext(ctx context.Context) LookupAuthenticationSequenceResultOutput {
	return o
}

// The AuthenticationProfiles param.
func (o LookupAuthenticationSequenceResultOutput) AuthenticationProfiles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAuthenticationSequenceResult) []string { return v.AuthenticationProfiles }).(pulumi.StringArrayOutput)
}

// The Id param.
func (o LookupAuthenticationSequenceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthenticationSequenceResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Name param.
func (o LookupAuthenticationSequenceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthenticationSequenceResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupAuthenticationSequenceResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAuthenticationSequenceResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The UseDomainFindProfile param. Default: `true`.
func (o LookupAuthenticationSequenceResultOutput) UseDomainFindProfile() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupAuthenticationSequenceResult) bool { return v.UseDomainFindProfile }).(pulumi.BoolOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAuthenticationSequenceResultOutput{})
}
