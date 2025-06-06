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
//			_, err := scm.GetExternalDynamicListList(ctx, &scm.GetExternalDynamicListListArgs{
//				Folder: pulumi.StringRef("Shared"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetExternalDynamicListList(ctx *pulumi.Context, args *GetExternalDynamicListListArgs, opts ...pulumi.InvokeOption) (*GetExternalDynamicListListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetExternalDynamicListListResult
	err := ctx.Invoke("scm:index/getExternalDynamicListList:getExternalDynamicListList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getExternalDynamicListList.
type GetExternalDynamicListListArgs struct {
	// The Device param.
	Device *string `pulumi:"device"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The Limit param. A limit of -1 will return all configured items. Default: `200`.
	Limit *int `pulumi:"limit"`
	// The Name param.
	Name *string `pulumi:"name"`
	// The Offset param. Default: `0`.
	Offset *int `pulumi:"offset"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
}

// A collection of values returned by getExternalDynamicListList.
type GetExternalDynamicListListResult struct {
	// The Data param.
	Datas []GetExternalDynamicListListData `pulumi:"datas"`
	// The Device param.
	Device *string `pulumi:"device"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The Limit param. A limit of -1 will return all configured items. Default: `200`.
	Limit int `pulumi:"limit"`
	// The Name param.
	Name *string `pulumi:"name"`
	// The Offset param. Default: `0`.
	Offset int `pulumi:"offset"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
	Tfid    string  `pulumi:"tfid"`
	// The Total param.
	Total int `pulumi:"total"`
}

func GetExternalDynamicListListOutput(ctx *pulumi.Context, args GetExternalDynamicListListOutputArgs, opts ...pulumi.InvokeOption) GetExternalDynamicListListResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetExternalDynamicListListResultOutput, error) {
			args := v.(GetExternalDynamicListListArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getExternalDynamicListList:getExternalDynamicListList", args, GetExternalDynamicListListResultOutput{}, options).(GetExternalDynamicListListResultOutput), nil
		}).(GetExternalDynamicListListResultOutput)
}

// A collection of arguments for invoking getExternalDynamicListList.
type GetExternalDynamicListListOutputArgs struct {
	// The Device param.
	Device pulumi.StringPtrInput `pulumi:"device"`
	// The Folder param.
	Folder pulumi.StringPtrInput `pulumi:"folder"`
	// The Limit param. A limit of -1 will return all configured items. Default: `200`.
	Limit pulumi.IntPtrInput `pulumi:"limit"`
	// The Name param.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The Offset param. Default: `0`.
	Offset pulumi.IntPtrInput `pulumi:"offset"`
	// The Snippet param.
	Snippet pulumi.StringPtrInput `pulumi:"snippet"`
}

func (GetExternalDynamicListListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetExternalDynamicListListArgs)(nil)).Elem()
}

// A collection of values returned by getExternalDynamicListList.
type GetExternalDynamicListListResultOutput struct{ *pulumi.OutputState }

func (GetExternalDynamicListListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetExternalDynamicListListResult)(nil)).Elem()
}

func (o GetExternalDynamicListListResultOutput) ToGetExternalDynamicListListResultOutput() GetExternalDynamicListListResultOutput {
	return o
}

func (o GetExternalDynamicListListResultOutput) ToGetExternalDynamicListListResultOutputWithContext(ctx context.Context) GetExternalDynamicListListResultOutput {
	return o
}

// The Data param.
func (o GetExternalDynamicListListResultOutput) Datas() GetExternalDynamicListListDataArrayOutput {
	return o.ApplyT(func(v GetExternalDynamicListListResult) []GetExternalDynamicListListData { return v.Datas }).(GetExternalDynamicListListDataArrayOutput)
}

// The Device param.
func (o GetExternalDynamicListListResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetExternalDynamicListListResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The Folder param.
func (o GetExternalDynamicListListResultOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetExternalDynamicListListResult) *string { return v.Folder }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetExternalDynamicListListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetExternalDynamicListListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetExternalDynamicListListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetExternalDynamicListListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Name param.
func (o GetExternalDynamicListListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetExternalDynamicListListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The Offset param. Default: `0`.
func (o GetExternalDynamicListListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetExternalDynamicListListResult) int { return v.Offset }).(pulumi.IntOutput)
}

// The Snippet param.
func (o GetExternalDynamicListListResultOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetExternalDynamicListListResult) *string { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o GetExternalDynamicListListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetExternalDynamicListListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetExternalDynamicListListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetExternalDynamicListListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetExternalDynamicListListResultOutput{})
}
