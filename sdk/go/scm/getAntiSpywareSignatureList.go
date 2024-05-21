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
//			_, err := scm.GetAntiSpywareSignatureList(ctx, &scm.GetAntiSpywareSignatureListArgs{
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
func GetAntiSpywareSignatureList(ctx *pulumi.Context, args *GetAntiSpywareSignatureListArgs, opts ...pulumi.InvokeOption) (*GetAntiSpywareSignatureListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAntiSpywareSignatureListResult
	err := ctx.Invoke("scm:index/getAntiSpywareSignatureList:getAntiSpywareSignatureList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAntiSpywareSignatureList.
type GetAntiSpywareSignatureListArgs struct {
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

// A collection of values returned by getAntiSpywareSignatureList.
type GetAntiSpywareSignatureListResult struct {
	// The Data param.
	Datas []GetAntiSpywareSignatureListData `pulumi:"datas"`
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

func GetAntiSpywareSignatureListOutput(ctx *pulumi.Context, args GetAntiSpywareSignatureListOutputArgs, opts ...pulumi.InvokeOption) GetAntiSpywareSignatureListResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAntiSpywareSignatureListResult, error) {
			args := v.(GetAntiSpywareSignatureListArgs)
			r, err := GetAntiSpywareSignatureList(ctx, &args, opts...)
			var s GetAntiSpywareSignatureListResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAntiSpywareSignatureListResultOutput)
}

// A collection of arguments for invoking getAntiSpywareSignatureList.
type GetAntiSpywareSignatureListOutputArgs struct {
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

func (GetAntiSpywareSignatureListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAntiSpywareSignatureListArgs)(nil)).Elem()
}

// A collection of values returned by getAntiSpywareSignatureList.
type GetAntiSpywareSignatureListResultOutput struct{ *pulumi.OutputState }

func (GetAntiSpywareSignatureListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAntiSpywareSignatureListResult)(nil)).Elem()
}

func (o GetAntiSpywareSignatureListResultOutput) ToGetAntiSpywareSignatureListResultOutput() GetAntiSpywareSignatureListResultOutput {
	return o
}

func (o GetAntiSpywareSignatureListResultOutput) ToGetAntiSpywareSignatureListResultOutputWithContext(ctx context.Context) GetAntiSpywareSignatureListResultOutput {
	return o
}

// The Data param.
func (o GetAntiSpywareSignatureListResultOutput) Datas() GetAntiSpywareSignatureListDataArrayOutput {
	return o.ApplyT(func(v GetAntiSpywareSignatureListResult) []GetAntiSpywareSignatureListData { return v.Datas }).(GetAntiSpywareSignatureListDataArrayOutput)
}

// The Device param.
func (o GetAntiSpywareSignatureListResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAntiSpywareSignatureListResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The Folder param.
func (o GetAntiSpywareSignatureListResultOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAntiSpywareSignatureListResult) *string { return v.Folder }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAntiSpywareSignatureListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAntiSpywareSignatureListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetAntiSpywareSignatureListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetAntiSpywareSignatureListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Name param.
func (o GetAntiSpywareSignatureListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAntiSpywareSignatureListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The Offset param. Default: `0`.
func (o GetAntiSpywareSignatureListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetAntiSpywareSignatureListResult) int { return v.Offset }).(pulumi.IntOutput)
}

// The Snippet param.
func (o GetAntiSpywareSignatureListResultOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAntiSpywareSignatureListResult) *string { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o GetAntiSpywareSignatureListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetAntiSpywareSignatureListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetAntiSpywareSignatureListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetAntiSpywareSignatureListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAntiSpywareSignatureListResultOutput{})
}
