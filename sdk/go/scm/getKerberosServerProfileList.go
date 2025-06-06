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
//			_, err := scm.GetKerberosServerProfileList(ctx, &scm.GetKerberosServerProfileListArgs{
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
func GetKerberosServerProfileList(ctx *pulumi.Context, args *GetKerberosServerProfileListArgs, opts ...pulumi.InvokeOption) (*GetKerberosServerProfileListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetKerberosServerProfileListResult
	err := ctx.Invoke("scm:index/getKerberosServerProfileList:getKerberosServerProfileList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKerberosServerProfileList.
type GetKerberosServerProfileListArgs struct {
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

// A collection of values returned by getKerberosServerProfileList.
type GetKerberosServerProfileListResult struct {
	// The Data param.
	Datas []GetKerberosServerProfileListData `pulumi:"datas"`
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

func GetKerberosServerProfileListOutput(ctx *pulumi.Context, args GetKerberosServerProfileListOutputArgs, opts ...pulumi.InvokeOption) GetKerberosServerProfileListResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetKerberosServerProfileListResultOutput, error) {
			args := v.(GetKerberosServerProfileListArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getKerberosServerProfileList:getKerberosServerProfileList", args, GetKerberosServerProfileListResultOutput{}, options).(GetKerberosServerProfileListResultOutput), nil
		}).(GetKerberosServerProfileListResultOutput)
}

// A collection of arguments for invoking getKerberosServerProfileList.
type GetKerberosServerProfileListOutputArgs struct {
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

func (GetKerberosServerProfileListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKerberosServerProfileListArgs)(nil)).Elem()
}

// A collection of values returned by getKerberosServerProfileList.
type GetKerberosServerProfileListResultOutput struct{ *pulumi.OutputState }

func (GetKerberosServerProfileListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKerberosServerProfileListResult)(nil)).Elem()
}

func (o GetKerberosServerProfileListResultOutput) ToGetKerberosServerProfileListResultOutput() GetKerberosServerProfileListResultOutput {
	return o
}

func (o GetKerberosServerProfileListResultOutput) ToGetKerberosServerProfileListResultOutputWithContext(ctx context.Context) GetKerberosServerProfileListResultOutput {
	return o
}

// The Data param.
func (o GetKerberosServerProfileListResultOutput) Datas() GetKerberosServerProfileListDataArrayOutput {
	return o.ApplyT(func(v GetKerberosServerProfileListResult) []GetKerberosServerProfileListData { return v.Datas }).(GetKerberosServerProfileListDataArrayOutput)
}

// The Device param.
func (o GetKerberosServerProfileListResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetKerberosServerProfileListResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The Folder param.
func (o GetKerberosServerProfileListResultOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetKerberosServerProfileListResult) *string { return v.Folder }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetKerberosServerProfileListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetKerberosServerProfileListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetKerberosServerProfileListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetKerberosServerProfileListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Name param.
func (o GetKerberosServerProfileListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetKerberosServerProfileListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The Offset param. Default: `0`.
func (o GetKerberosServerProfileListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetKerberosServerProfileListResult) int { return v.Offset }).(pulumi.IntOutput)
}

// The Snippet param.
func (o GetKerberosServerProfileListResultOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetKerberosServerProfileListResult) *string { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o GetKerberosServerProfileListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetKerberosServerProfileListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetKerberosServerProfileListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetKerberosServerProfileListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetKerberosServerProfileListResultOutput{})
}
