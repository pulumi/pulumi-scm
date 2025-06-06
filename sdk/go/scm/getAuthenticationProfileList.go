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
//			_, err := scm.GetAuthenticationProfileList(ctx, &scm.GetAuthenticationProfileListArgs{
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
func GetAuthenticationProfileList(ctx *pulumi.Context, args *GetAuthenticationProfileListArgs, opts ...pulumi.InvokeOption) (*GetAuthenticationProfileListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAuthenticationProfileListResult
	err := ctx.Invoke("scm:index/getAuthenticationProfileList:getAuthenticationProfileList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAuthenticationProfileList.
type GetAuthenticationProfileListArgs struct {
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

// A collection of values returned by getAuthenticationProfileList.
type GetAuthenticationProfileListResult struct {
	// The Data param.
	Datas []GetAuthenticationProfileListData `pulumi:"datas"`
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

func GetAuthenticationProfileListOutput(ctx *pulumi.Context, args GetAuthenticationProfileListOutputArgs, opts ...pulumi.InvokeOption) GetAuthenticationProfileListResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetAuthenticationProfileListResultOutput, error) {
			args := v.(GetAuthenticationProfileListArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getAuthenticationProfileList:getAuthenticationProfileList", args, GetAuthenticationProfileListResultOutput{}, options).(GetAuthenticationProfileListResultOutput), nil
		}).(GetAuthenticationProfileListResultOutput)
}

// A collection of arguments for invoking getAuthenticationProfileList.
type GetAuthenticationProfileListOutputArgs struct {
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

func (GetAuthenticationProfileListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthenticationProfileListArgs)(nil)).Elem()
}

// A collection of values returned by getAuthenticationProfileList.
type GetAuthenticationProfileListResultOutput struct{ *pulumi.OutputState }

func (GetAuthenticationProfileListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthenticationProfileListResult)(nil)).Elem()
}

func (o GetAuthenticationProfileListResultOutput) ToGetAuthenticationProfileListResultOutput() GetAuthenticationProfileListResultOutput {
	return o
}

func (o GetAuthenticationProfileListResultOutput) ToGetAuthenticationProfileListResultOutputWithContext(ctx context.Context) GetAuthenticationProfileListResultOutput {
	return o
}

// The Data param.
func (o GetAuthenticationProfileListResultOutput) Datas() GetAuthenticationProfileListDataArrayOutput {
	return o.ApplyT(func(v GetAuthenticationProfileListResult) []GetAuthenticationProfileListData { return v.Datas }).(GetAuthenticationProfileListDataArrayOutput)
}

// The Device param.
func (o GetAuthenticationProfileListResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAuthenticationProfileListResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The Folder param.
func (o GetAuthenticationProfileListResultOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAuthenticationProfileListResult) *string { return v.Folder }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAuthenticationProfileListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthenticationProfileListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetAuthenticationProfileListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetAuthenticationProfileListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Name param.
func (o GetAuthenticationProfileListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAuthenticationProfileListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The Offset param. Default: `0`.
func (o GetAuthenticationProfileListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetAuthenticationProfileListResult) int { return v.Offset }).(pulumi.IntOutput)
}

// The Snippet param.
func (o GetAuthenticationProfileListResultOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAuthenticationProfileListResult) *string { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o GetAuthenticationProfileListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthenticationProfileListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetAuthenticationProfileListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetAuthenticationProfileListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAuthenticationProfileListResultOutput{})
}
