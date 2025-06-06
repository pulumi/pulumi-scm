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
//			_, err := scm.GetDynamicUserGroupList(ctx, &scm.GetDynamicUserGroupListArgs{
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
func GetDynamicUserGroupList(ctx *pulumi.Context, args *GetDynamicUserGroupListArgs, opts ...pulumi.InvokeOption) (*GetDynamicUserGroupListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDynamicUserGroupListResult
	err := ctx.Invoke("scm:index/getDynamicUserGroupList:getDynamicUserGroupList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDynamicUserGroupList.
type GetDynamicUserGroupListArgs struct {
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

// A collection of values returned by getDynamicUserGroupList.
type GetDynamicUserGroupListResult struct {
	// The Data param.
	Datas []GetDynamicUserGroupListData `pulumi:"datas"`
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

func GetDynamicUserGroupListOutput(ctx *pulumi.Context, args GetDynamicUserGroupListOutputArgs, opts ...pulumi.InvokeOption) GetDynamicUserGroupListResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetDynamicUserGroupListResultOutput, error) {
			args := v.(GetDynamicUserGroupListArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getDynamicUserGroupList:getDynamicUserGroupList", args, GetDynamicUserGroupListResultOutput{}, options).(GetDynamicUserGroupListResultOutput), nil
		}).(GetDynamicUserGroupListResultOutput)
}

// A collection of arguments for invoking getDynamicUserGroupList.
type GetDynamicUserGroupListOutputArgs struct {
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

func (GetDynamicUserGroupListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDynamicUserGroupListArgs)(nil)).Elem()
}

// A collection of values returned by getDynamicUserGroupList.
type GetDynamicUserGroupListResultOutput struct{ *pulumi.OutputState }

func (GetDynamicUserGroupListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDynamicUserGroupListResult)(nil)).Elem()
}

func (o GetDynamicUserGroupListResultOutput) ToGetDynamicUserGroupListResultOutput() GetDynamicUserGroupListResultOutput {
	return o
}

func (o GetDynamicUserGroupListResultOutput) ToGetDynamicUserGroupListResultOutputWithContext(ctx context.Context) GetDynamicUserGroupListResultOutput {
	return o
}

// The Data param.
func (o GetDynamicUserGroupListResultOutput) Datas() GetDynamicUserGroupListDataArrayOutput {
	return o.ApplyT(func(v GetDynamicUserGroupListResult) []GetDynamicUserGroupListData { return v.Datas }).(GetDynamicUserGroupListDataArrayOutput)
}

// The Device param.
func (o GetDynamicUserGroupListResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDynamicUserGroupListResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The Folder param.
func (o GetDynamicUserGroupListResultOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDynamicUserGroupListResult) *string { return v.Folder }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDynamicUserGroupListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDynamicUserGroupListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetDynamicUserGroupListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetDynamicUserGroupListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Name param.
func (o GetDynamicUserGroupListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDynamicUserGroupListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The Offset param. Default: `0`.
func (o GetDynamicUserGroupListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetDynamicUserGroupListResult) int { return v.Offset }).(pulumi.IntOutput)
}

// The Snippet param.
func (o GetDynamicUserGroupListResultOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDynamicUserGroupListResult) *string { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o GetDynamicUserGroupListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetDynamicUserGroupListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetDynamicUserGroupListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetDynamicUserGroupListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDynamicUserGroupListResultOutput{})
}
