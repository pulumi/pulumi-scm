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
//			_, err := scm.GetUrlFilteringCategoryList(ctx, &scm.GetUrlFilteringCategoryListArgs{
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
func GetUrlFilteringCategoryList(ctx *pulumi.Context, args *GetUrlFilteringCategoryListArgs, opts ...pulumi.InvokeOption) (*GetUrlFilteringCategoryListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetUrlFilteringCategoryListResult
	err := ctx.Invoke("scm:index/getUrlFilteringCategoryList:getUrlFilteringCategoryList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getUrlFilteringCategoryList.
type GetUrlFilteringCategoryListArgs struct {
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

// A collection of values returned by getUrlFilteringCategoryList.
type GetUrlFilteringCategoryListResult struct {
	// The Data param.
	Datas []GetUrlFilteringCategoryListData `pulumi:"datas"`
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

func GetUrlFilteringCategoryListOutput(ctx *pulumi.Context, args GetUrlFilteringCategoryListOutputArgs, opts ...pulumi.InvokeOption) GetUrlFilteringCategoryListResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetUrlFilteringCategoryListResultOutput, error) {
			args := v.(GetUrlFilteringCategoryListArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getUrlFilteringCategoryList:getUrlFilteringCategoryList", args, GetUrlFilteringCategoryListResultOutput{}, options).(GetUrlFilteringCategoryListResultOutput), nil
		}).(GetUrlFilteringCategoryListResultOutput)
}

// A collection of arguments for invoking getUrlFilteringCategoryList.
type GetUrlFilteringCategoryListOutputArgs struct {
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

func (GetUrlFilteringCategoryListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUrlFilteringCategoryListArgs)(nil)).Elem()
}

// A collection of values returned by getUrlFilteringCategoryList.
type GetUrlFilteringCategoryListResultOutput struct{ *pulumi.OutputState }

func (GetUrlFilteringCategoryListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetUrlFilteringCategoryListResult)(nil)).Elem()
}

func (o GetUrlFilteringCategoryListResultOutput) ToGetUrlFilteringCategoryListResultOutput() GetUrlFilteringCategoryListResultOutput {
	return o
}

func (o GetUrlFilteringCategoryListResultOutput) ToGetUrlFilteringCategoryListResultOutputWithContext(ctx context.Context) GetUrlFilteringCategoryListResultOutput {
	return o
}

// The Data param.
func (o GetUrlFilteringCategoryListResultOutput) Datas() GetUrlFilteringCategoryListDataArrayOutput {
	return o.ApplyT(func(v GetUrlFilteringCategoryListResult) []GetUrlFilteringCategoryListData { return v.Datas }).(GetUrlFilteringCategoryListDataArrayOutput)
}

// The Device param.
func (o GetUrlFilteringCategoryListResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetUrlFilteringCategoryListResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The Folder param.
func (o GetUrlFilteringCategoryListResultOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetUrlFilteringCategoryListResult) *string { return v.Folder }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetUrlFilteringCategoryListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetUrlFilteringCategoryListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetUrlFilteringCategoryListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetUrlFilteringCategoryListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Name param.
func (o GetUrlFilteringCategoryListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetUrlFilteringCategoryListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The Offset param. Default: `0`.
func (o GetUrlFilteringCategoryListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetUrlFilteringCategoryListResult) int { return v.Offset }).(pulumi.IntOutput)
}

// The Snippet param.
func (o GetUrlFilteringCategoryListResultOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetUrlFilteringCategoryListResult) *string { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o GetUrlFilteringCategoryListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetUrlFilteringCategoryListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetUrlFilteringCategoryListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetUrlFilteringCategoryListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetUrlFilteringCategoryListResultOutput{})
}
