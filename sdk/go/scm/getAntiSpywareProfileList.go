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
//			_, err := scm.GetAntiSpywareProfileList(ctx, &scm.GetAntiSpywareProfileListArgs{
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
func GetAntiSpywareProfileList(ctx *pulumi.Context, args *GetAntiSpywareProfileListArgs, opts ...pulumi.InvokeOption) (*GetAntiSpywareProfileListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAntiSpywareProfileListResult
	err := ctx.Invoke("scm:index/getAntiSpywareProfileList:getAntiSpywareProfileList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAntiSpywareProfileList.
type GetAntiSpywareProfileListArgs struct {
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

// A collection of values returned by getAntiSpywareProfileList.
type GetAntiSpywareProfileListResult struct {
	// The Data param.
	Datas []GetAntiSpywareProfileListData `pulumi:"datas"`
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

func GetAntiSpywareProfileListOutput(ctx *pulumi.Context, args GetAntiSpywareProfileListOutputArgs, opts ...pulumi.InvokeOption) GetAntiSpywareProfileListResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAntiSpywareProfileListResult, error) {
			args := v.(GetAntiSpywareProfileListArgs)
			r, err := GetAntiSpywareProfileList(ctx, &args, opts...)
			var s GetAntiSpywareProfileListResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAntiSpywareProfileListResultOutput)
}

// A collection of arguments for invoking getAntiSpywareProfileList.
type GetAntiSpywareProfileListOutputArgs struct {
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

func (GetAntiSpywareProfileListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAntiSpywareProfileListArgs)(nil)).Elem()
}

// A collection of values returned by getAntiSpywareProfileList.
type GetAntiSpywareProfileListResultOutput struct{ *pulumi.OutputState }

func (GetAntiSpywareProfileListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAntiSpywareProfileListResult)(nil)).Elem()
}

func (o GetAntiSpywareProfileListResultOutput) ToGetAntiSpywareProfileListResultOutput() GetAntiSpywareProfileListResultOutput {
	return o
}

func (o GetAntiSpywareProfileListResultOutput) ToGetAntiSpywareProfileListResultOutputWithContext(ctx context.Context) GetAntiSpywareProfileListResultOutput {
	return o
}

// The Data param.
func (o GetAntiSpywareProfileListResultOutput) Datas() GetAntiSpywareProfileListDataArrayOutput {
	return o.ApplyT(func(v GetAntiSpywareProfileListResult) []GetAntiSpywareProfileListData { return v.Datas }).(GetAntiSpywareProfileListDataArrayOutput)
}

// The Device param.
func (o GetAntiSpywareProfileListResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAntiSpywareProfileListResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The Folder param.
func (o GetAntiSpywareProfileListResultOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAntiSpywareProfileListResult) *string { return v.Folder }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAntiSpywareProfileListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAntiSpywareProfileListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetAntiSpywareProfileListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetAntiSpywareProfileListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Name param.
func (o GetAntiSpywareProfileListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAntiSpywareProfileListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The Offset param. Default: `0`.
func (o GetAntiSpywareProfileListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetAntiSpywareProfileListResult) int { return v.Offset }).(pulumi.IntOutput)
}

// The Snippet param.
func (o GetAntiSpywareProfileListResultOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAntiSpywareProfileListResult) *string { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o GetAntiSpywareProfileListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetAntiSpywareProfileListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetAntiSpywareProfileListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetAntiSpywareProfileListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAntiSpywareProfileListResultOutput{})
}
