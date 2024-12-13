// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
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
//			_, err := scm.GetDecryptionProfileList(ctx, &scm.GetDecryptionProfileListArgs{
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
func GetDecryptionProfileList(ctx *pulumi.Context, args *GetDecryptionProfileListArgs, opts ...pulumi.InvokeOption) (*GetDecryptionProfileListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDecryptionProfileListResult
	err := ctx.Invoke("scm:index/getDecryptionProfileList:getDecryptionProfileList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDecryptionProfileList.
type GetDecryptionProfileListArgs struct {
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

// A collection of values returned by getDecryptionProfileList.
type GetDecryptionProfileListResult struct {
	// The Data param.
	Datas []GetDecryptionProfileListData `pulumi:"datas"`
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

func GetDecryptionProfileListOutput(ctx *pulumi.Context, args GetDecryptionProfileListOutputArgs, opts ...pulumi.InvokeOption) GetDecryptionProfileListResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetDecryptionProfileListResultOutput, error) {
			args := v.(GetDecryptionProfileListArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getDecryptionProfileList:getDecryptionProfileList", args, GetDecryptionProfileListResultOutput{}, options).(GetDecryptionProfileListResultOutput), nil
		}).(GetDecryptionProfileListResultOutput)
}

// A collection of arguments for invoking getDecryptionProfileList.
type GetDecryptionProfileListOutputArgs struct {
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

func (GetDecryptionProfileListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDecryptionProfileListArgs)(nil)).Elem()
}

// A collection of values returned by getDecryptionProfileList.
type GetDecryptionProfileListResultOutput struct{ *pulumi.OutputState }

func (GetDecryptionProfileListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDecryptionProfileListResult)(nil)).Elem()
}

func (o GetDecryptionProfileListResultOutput) ToGetDecryptionProfileListResultOutput() GetDecryptionProfileListResultOutput {
	return o
}

func (o GetDecryptionProfileListResultOutput) ToGetDecryptionProfileListResultOutputWithContext(ctx context.Context) GetDecryptionProfileListResultOutput {
	return o
}

// The Data param.
func (o GetDecryptionProfileListResultOutput) Datas() GetDecryptionProfileListDataArrayOutput {
	return o.ApplyT(func(v GetDecryptionProfileListResult) []GetDecryptionProfileListData { return v.Datas }).(GetDecryptionProfileListDataArrayOutput)
}

// The Device param.
func (o GetDecryptionProfileListResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDecryptionProfileListResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The Folder param.
func (o GetDecryptionProfileListResultOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDecryptionProfileListResult) *string { return v.Folder }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDecryptionProfileListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDecryptionProfileListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetDecryptionProfileListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetDecryptionProfileListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Name param.
func (o GetDecryptionProfileListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDecryptionProfileListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The Offset param. Default: `0`.
func (o GetDecryptionProfileListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetDecryptionProfileListResult) int { return v.Offset }).(pulumi.IntOutput)
}

// The Snippet param.
func (o GetDecryptionProfileListResultOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDecryptionProfileListResult) *string { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o GetDecryptionProfileListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetDecryptionProfileListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetDecryptionProfileListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetDecryptionProfileListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDecryptionProfileListResultOutput{})
}
