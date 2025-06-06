// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scm

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-scm/sdk/go/scm/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves a listing of config items.
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
//			_, err := scm.GetLabelList(ctx, &scm.GetLabelListArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetLabelList(ctx *pulumi.Context, args *GetLabelListArgs, opts ...pulumi.InvokeOption) (*GetLabelListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetLabelListResult
	err := ctx.Invoke("scm:index/getLabelList:getLabelList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLabelList.
type GetLabelListArgs struct {
	// The Limit param. A limit of -1 will return all configured items. Default: `200`.
	Limit *int `pulumi:"limit"`
	// The Name param.
	Name *string `pulumi:"name"`
	// The Offset param. Default: `0`.
	Offset *int `pulumi:"offset"`
}

// A collection of values returned by getLabelList.
type GetLabelListResult struct {
	// The Data param.
	Datas []GetLabelListData `pulumi:"datas"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The Limit param. A limit of -1 will return all configured items. Default: `200`.
	Limit int `pulumi:"limit"`
	// The Name param.
	Name *string `pulumi:"name"`
	// The Offset param. Default: `0`.
	Offset int    `pulumi:"offset"`
	Tfid   string `pulumi:"tfid"`
	// The Total param.
	Total int `pulumi:"total"`
}

func GetLabelListOutput(ctx *pulumi.Context, args GetLabelListOutputArgs, opts ...pulumi.InvokeOption) GetLabelListResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetLabelListResultOutput, error) {
			args := v.(GetLabelListArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getLabelList:getLabelList", args, GetLabelListResultOutput{}, options).(GetLabelListResultOutput), nil
		}).(GetLabelListResultOutput)
}

// A collection of arguments for invoking getLabelList.
type GetLabelListOutputArgs struct {
	// The Limit param. A limit of -1 will return all configured items. Default: `200`.
	Limit pulumi.IntPtrInput `pulumi:"limit"`
	// The Name param.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The Offset param. Default: `0`.
	Offset pulumi.IntPtrInput `pulumi:"offset"`
}

func (GetLabelListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLabelListArgs)(nil)).Elem()
}

// A collection of values returned by getLabelList.
type GetLabelListResultOutput struct{ *pulumi.OutputState }

func (GetLabelListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLabelListResult)(nil)).Elem()
}

func (o GetLabelListResultOutput) ToGetLabelListResultOutput() GetLabelListResultOutput {
	return o
}

func (o GetLabelListResultOutput) ToGetLabelListResultOutputWithContext(ctx context.Context) GetLabelListResultOutput {
	return o
}

// The Data param.
func (o GetLabelListResultOutput) Datas() GetLabelListDataArrayOutput {
	return o.ApplyT(func(v GetLabelListResult) []GetLabelListData { return v.Datas }).(GetLabelListDataArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetLabelListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetLabelListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetLabelListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetLabelListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Name param.
func (o GetLabelListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLabelListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The Offset param. Default: `0`.
func (o GetLabelListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetLabelListResult) int { return v.Offset }).(pulumi.IntOutput)
}

func (o GetLabelListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetLabelListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetLabelListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetLabelListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLabelListResultOutput{})
}
