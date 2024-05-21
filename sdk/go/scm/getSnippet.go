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
//			_, err := scm.LookupSnippet(ctx, &scm.LookupSnippetArgs{
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
func LookupSnippet(ctx *pulumi.Context, args *LookupSnippetArgs, opts ...pulumi.InvokeOption) (*LookupSnippetResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSnippetResult
	err := ctx.Invoke("scm:index/getSnippet:getSnippet", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSnippet.
type LookupSnippetArgs struct {
	// The Id param.
	Id string `pulumi:"id"`
}

// A collection of values returned by getSnippet.
type LookupSnippetResult struct {
	// The CreatedIn param.
	CreatedIn string `pulumi:"createdIn"`
	// The Description param.
	Description string `pulumi:"description"`
	// The DisplayName param.
	DisplayName string `pulumi:"displayName"`
	// The Folders param.
	Folders []GetSnippetFolder `pulumi:"folders"`
	// The Id param.
	Id string `pulumi:"id"`
	// The Labels param.
	Labels []string `pulumi:"labels"`
	// The LastUpdate param.
	LastUpdate string `pulumi:"lastUpdate"`
	// The Name param.
	Name string `pulumi:"name"`
	// The SharedIn param.
	SharedIn string `pulumi:"sharedIn"`
	Tfid     string `pulumi:"tfid"`
	// The Type param. String must be one of these: `"predefined"`.
	Type string `pulumi:"type"`
}

func LookupSnippetOutput(ctx *pulumi.Context, args LookupSnippetOutputArgs, opts ...pulumi.InvokeOption) LookupSnippetResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSnippetResult, error) {
			args := v.(LookupSnippetArgs)
			r, err := LookupSnippet(ctx, &args, opts...)
			var s LookupSnippetResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSnippetResultOutput)
}

// A collection of arguments for invoking getSnippet.
type LookupSnippetOutputArgs struct {
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupSnippetOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSnippetArgs)(nil)).Elem()
}

// A collection of values returned by getSnippet.
type LookupSnippetResultOutput struct{ *pulumi.OutputState }

func (LookupSnippetResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSnippetResult)(nil)).Elem()
}

func (o LookupSnippetResultOutput) ToLookupSnippetResultOutput() LookupSnippetResultOutput {
	return o
}

func (o LookupSnippetResultOutput) ToLookupSnippetResultOutputWithContext(ctx context.Context) LookupSnippetResultOutput {
	return o
}

// The CreatedIn param.
func (o LookupSnippetResultOutput) CreatedIn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnippetResult) string { return v.CreatedIn }).(pulumi.StringOutput)
}

// The Description param.
func (o LookupSnippetResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnippetResult) string { return v.Description }).(pulumi.StringOutput)
}

// The DisplayName param.
func (o LookupSnippetResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnippetResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// The Folders param.
func (o LookupSnippetResultOutput) Folders() GetSnippetFolderArrayOutput {
	return o.ApplyT(func(v LookupSnippetResult) []GetSnippetFolder { return v.Folders }).(GetSnippetFolderArrayOutput)
}

// The Id param.
func (o LookupSnippetResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnippetResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Labels param.
func (o LookupSnippetResultOutput) Labels() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupSnippetResult) []string { return v.Labels }).(pulumi.StringArrayOutput)
}

// The LastUpdate param.
func (o LookupSnippetResultOutput) LastUpdate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnippetResult) string { return v.LastUpdate }).(pulumi.StringOutput)
}

// The Name param.
func (o LookupSnippetResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnippetResult) string { return v.Name }).(pulumi.StringOutput)
}

// The SharedIn param.
func (o LookupSnippetResultOutput) SharedIn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnippetResult) string { return v.SharedIn }).(pulumi.StringOutput)
}

func (o LookupSnippetResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnippetResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Type param. String must be one of these: `"predefined"`.
func (o LookupSnippetResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSnippetResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSnippetResultOutput{})
}
