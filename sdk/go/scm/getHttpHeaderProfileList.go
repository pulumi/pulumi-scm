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
//			_, err := scm.GetHttpHeaderProfileList(ctx, &scm.GetHttpHeaderProfileListArgs{
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
func GetHttpHeaderProfileList(ctx *pulumi.Context, args *GetHttpHeaderProfileListArgs, opts ...pulumi.InvokeOption) (*GetHttpHeaderProfileListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetHttpHeaderProfileListResult
	err := ctx.Invoke("scm:index/getHttpHeaderProfileList:getHttpHeaderProfileList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHttpHeaderProfileList.
type GetHttpHeaderProfileListArgs struct {
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

// A collection of values returned by getHttpHeaderProfileList.
type GetHttpHeaderProfileListResult struct {
	// The Data param.
	Datas []GetHttpHeaderProfileListData `pulumi:"datas"`
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

func GetHttpHeaderProfileListOutput(ctx *pulumi.Context, args GetHttpHeaderProfileListOutputArgs, opts ...pulumi.InvokeOption) GetHttpHeaderProfileListResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetHttpHeaderProfileListResultOutput, error) {
			args := v.(GetHttpHeaderProfileListArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getHttpHeaderProfileList:getHttpHeaderProfileList", args, GetHttpHeaderProfileListResultOutput{}, options).(GetHttpHeaderProfileListResultOutput), nil
		}).(GetHttpHeaderProfileListResultOutput)
}

// A collection of arguments for invoking getHttpHeaderProfileList.
type GetHttpHeaderProfileListOutputArgs struct {
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

func (GetHttpHeaderProfileListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHttpHeaderProfileListArgs)(nil)).Elem()
}

// A collection of values returned by getHttpHeaderProfileList.
type GetHttpHeaderProfileListResultOutput struct{ *pulumi.OutputState }

func (GetHttpHeaderProfileListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetHttpHeaderProfileListResult)(nil)).Elem()
}

func (o GetHttpHeaderProfileListResultOutput) ToGetHttpHeaderProfileListResultOutput() GetHttpHeaderProfileListResultOutput {
	return o
}

func (o GetHttpHeaderProfileListResultOutput) ToGetHttpHeaderProfileListResultOutputWithContext(ctx context.Context) GetHttpHeaderProfileListResultOutput {
	return o
}

// The Data param.
func (o GetHttpHeaderProfileListResultOutput) Datas() GetHttpHeaderProfileListDataArrayOutput {
	return o.ApplyT(func(v GetHttpHeaderProfileListResult) []GetHttpHeaderProfileListData { return v.Datas }).(GetHttpHeaderProfileListDataArrayOutput)
}

// The Device param.
func (o GetHttpHeaderProfileListResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHttpHeaderProfileListResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The Folder param.
func (o GetHttpHeaderProfileListResultOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHttpHeaderProfileListResult) *string { return v.Folder }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetHttpHeaderProfileListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetHttpHeaderProfileListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetHttpHeaderProfileListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetHttpHeaderProfileListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Name param.
func (o GetHttpHeaderProfileListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHttpHeaderProfileListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The Offset param. Default: `0`.
func (o GetHttpHeaderProfileListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetHttpHeaderProfileListResult) int { return v.Offset }).(pulumi.IntOutput)
}

// The Snippet param.
func (o GetHttpHeaderProfileListResultOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetHttpHeaderProfileListResult) *string { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o GetHttpHeaderProfileListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetHttpHeaderProfileListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetHttpHeaderProfileListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetHttpHeaderProfileListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetHttpHeaderProfileListResultOutput{})
}
