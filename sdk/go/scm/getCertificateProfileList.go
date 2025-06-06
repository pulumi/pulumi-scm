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
//			_, err := scm.GetCertificateProfileList(ctx, &scm.GetCertificateProfileListArgs{
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
func GetCertificateProfileList(ctx *pulumi.Context, args *GetCertificateProfileListArgs, opts ...pulumi.InvokeOption) (*GetCertificateProfileListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetCertificateProfileListResult
	err := ctx.Invoke("scm:index/getCertificateProfileList:getCertificateProfileList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCertificateProfileList.
type GetCertificateProfileListArgs struct {
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

// A collection of values returned by getCertificateProfileList.
type GetCertificateProfileListResult struct {
	// The Data param.
	Datas []GetCertificateProfileListData `pulumi:"datas"`
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

func GetCertificateProfileListOutput(ctx *pulumi.Context, args GetCertificateProfileListOutputArgs, opts ...pulumi.InvokeOption) GetCertificateProfileListResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetCertificateProfileListResultOutput, error) {
			args := v.(GetCertificateProfileListArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getCertificateProfileList:getCertificateProfileList", args, GetCertificateProfileListResultOutput{}, options).(GetCertificateProfileListResultOutput), nil
		}).(GetCertificateProfileListResultOutput)
}

// A collection of arguments for invoking getCertificateProfileList.
type GetCertificateProfileListOutputArgs struct {
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

func (GetCertificateProfileListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCertificateProfileListArgs)(nil)).Elem()
}

// A collection of values returned by getCertificateProfileList.
type GetCertificateProfileListResultOutput struct{ *pulumi.OutputState }

func (GetCertificateProfileListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCertificateProfileListResult)(nil)).Elem()
}

func (o GetCertificateProfileListResultOutput) ToGetCertificateProfileListResultOutput() GetCertificateProfileListResultOutput {
	return o
}

func (o GetCertificateProfileListResultOutput) ToGetCertificateProfileListResultOutputWithContext(ctx context.Context) GetCertificateProfileListResultOutput {
	return o
}

// The Data param.
func (o GetCertificateProfileListResultOutput) Datas() GetCertificateProfileListDataArrayOutput {
	return o.ApplyT(func(v GetCertificateProfileListResult) []GetCertificateProfileListData { return v.Datas }).(GetCertificateProfileListDataArrayOutput)
}

// The Device param.
func (o GetCertificateProfileListResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCertificateProfileListResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The Folder param.
func (o GetCertificateProfileListResultOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCertificateProfileListResult) *string { return v.Folder }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetCertificateProfileListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCertificateProfileListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetCertificateProfileListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetCertificateProfileListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Name param.
func (o GetCertificateProfileListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCertificateProfileListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The Offset param. Default: `0`.
func (o GetCertificateProfileListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetCertificateProfileListResult) int { return v.Offset }).(pulumi.IntOutput)
}

// The Snippet param.
func (o GetCertificateProfileListResultOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCertificateProfileListResult) *string { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o GetCertificateProfileListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetCertificateProfileListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetCertificateProfileListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetCertificateProfileListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCertificateProfileListResultOutput{})
}
