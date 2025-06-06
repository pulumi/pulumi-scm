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
//			_, err := scm.GetLdapServerProfileList(ctx, &scm.GetLdapServerProfileListArgs{
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
func GetLdapServerProfileList(ctx *pulumi.Context, args *GetLdapServerProfileListArgs, opts ...pulumi.InvokeOption) (*GetLdapServerProfileListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetLdapServerProfileListResult
	err := ctx.Invoke("scm:index/getLdapServerProfileList:getLdapServerProfileList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLdapServerProfileList.
type GetLdapServerProfileListArgs struct {
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

// A collection of values returned by getLdapServerProfileList.
type GetLdapServerProfileListResult struct {
	// The Data param.
	Datas []GetLdapServerProfileListData `pulumi:"datas"`
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

func GetLdapServerProfileListOutput(ctx *pulumi.Context, args GetLdapServerProfileListOutputArgs, opts ...pulumi.InvokeOption) GetLdapServerProfileListResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetLdapServerProfileListResultOutput, error) {
			args := v.(GetLdapServerProfileListArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getLdapServerProfileList:getLdapServerProfileList", args, GetLdapServerProfileListResultOutput{}, options).(GetLdapServerProfileListResultOutput), nil
		}).(GetLdapServerProfileListResultOutput)
}

// A collection of arguments for invoking getLdapServerProfileList.
type GetLdapServerProfileListOutputArgs struct {
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

func (GetLdapServerProfileListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLdapServerProfileListArgs)(nil)).Elem()
}

// A collection of values returned by getLdapServerProfileList.
type GetLdapServerProfileListResultOutput struct{ *pulumi.OutputState }

func (GetLdapServerProfileListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLdapServerProfileListResult)(nil)).Elem()
}

func (o GetLdapServerProfileListResultOutput) ToGetLdapServerProfileListResultOutput() GetLdapServerProfileListResultOutput {
	return o
}

func (o GetLdapServerProfileListResultOutput) ToGetLdapServerProfileListResultOutputWithContext(ctx context.Context) GetLdapServerProfileListResultOutput {
	return o
}

// The Data param.
func (o GetLdapServerProfileListResultOutput) Datas() GetLdapServerProfileListDataArrayOutput {
	return o.ApplyT(func(v GetLdapServerProfileListResult) []GetLdapServerProfileListData { return v.Datas }).(GetLdapServerProfileListDataArrayOutput)
}

// The Device param.
func (o GetLdapServerProfileListResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLdapServerProfileListResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The Folder param.
func (o GetLdapServerProfileListResultOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLdapServerProfileListResult) *string { return v.Folder }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetLdapServerProfileListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetLdapServerProfileListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetLdapServerProfileListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetLdapServerProfileListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Name param.
func (o GetLdapServerProfileListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLdapServerProfileListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The Offset param. Default: `0`.
func (o GetLdapServerProfileListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetLdapServerProfileListResult) int { return v.Offset }).(pulumi.IntOutput)
}

// The Snippet param.
func (o GetLdapServerProfileListResultOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLdapServerProfileListResult) *string { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o GetLdapServerProfileListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetLdapServerProfileListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetLdapServerProfileListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetLdapServerProfileListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLdapServerProfileListResultOutput{})
}
