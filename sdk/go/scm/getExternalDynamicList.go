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
//			_, err := scm.LookupExternalDynamicList(ctx, &scm.LookupExternalDynamicListArgs{
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
func LookupExternalDynamicList(ctx *pulumi.Context, args *LookupExternalDynamicListArgs, opts ...pulumi.InvokeOption) (*LookupExternalDynamicListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupExternalDynamicListResult
	err := ctx.Invoke("scm:index/getExternalDynamicList:getExternalDynamicList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getExternalDynamicList.
type LookupExternalDynamicListArgs struct {
	// The Id param.
	Id string `pulumi:"id"`
}

// A collection of values returned by getExternalDynamicList.
type LookupExternalDynamicListResult struct {
	// The Id param.
	Id string `pulumi:"id"`
	// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
	Name string `pulumi:"name"`
	Tfid string `pulumi:"tfid"`
	// The Type param.
	Type GetExternalDynamicListType `pulumi:"type"`
}

func LookupExternalDynamicListOutput(ctx *pulumi.Context, args LookupExternalDynamicListOutputArgs, opts ...pulumi.InvokeOption) LookupExternalDynamicListResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupExternalDynamicListResultOutput, error) {
			args := v.(LookupExternalDynamicListArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getExternalDynamicList:getExternalDynamicList", args, LookupExternalDynamicListResultOutput{}, options).(LookupExternalDynamicListResultOutput), nil
		}).(LookupExternalDynamicListResultOutput)
}

// A collection of arguments for invoking getExternalDynamicList.
type LookupExternalDynamicListOutputArgs struct {
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupExternalDynamicListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupExternalDynamicListArgs)(nil)).Elem()
}

// A collection of values returned by getExternalDynamicList.
type LookupExternalDynamicListResultOutput struct{ *pulumi.OutputState }

func (LookupExternalDynamicListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupExternalDynamicListResult)(nil)).Elem()
}

func (o LookupExternalDynamicListResultOutput) ToLookupExternalDynamicListResultOutput() LookupExternalDynamicListResultOutput {
	return o
}

func (o LookupExternalDynamicListResultOutput) ToLookupExternalDynamicListResultOutputWithContext(ctx context.Context) LookupExternalDynamicListResultOutput {
	return o
}

// The Id param.
func (o LookupExternalDynamicListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupExternalDynamicListResult) string { return v.Id }).(pulumi.StringOutput)
}

// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
func (o LookupExternalDynamicListResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupExternalDynamicListResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupExternalDynamicListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupExternalDynamicListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Type param.
func (o LookupExternalDynamicListResultOutput) Type() GetExternalDynamicListTypeOutput {
	return o.ApplyT(func(v LookupExternalDynamicListResult) GetExternalDynamicListType { return v.Type }).(GetExternalDynamicListTypeOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupExternalDynamicListResultOutput{})
}
