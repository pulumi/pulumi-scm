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
//			_, err := scm.GetDecryptionRuleList(ctx, &scm.GetDecryptionRuleListArgs{
//				Folder:   pulumi.StringRef("Shared"),
//				Position: pulumi.StringRef("pre"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetDecryptionRuleList(ctx *pulumi.Context, args *GetDecryptionRuleListArgs, opts ...pulumi.InvokeOption) (*GetDecryptionRuleListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDecryptionRuleListResult
	err := ctx.Invoke("scm:index/getDecryptionRuleList:getDecryptionRuleList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDecryptionRuleList.
type GetDecryptionRuleListArgs struct {
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
	// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
	Position *string `pulumi:"position"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
}

// A collection of values returned by getDecryptionRuleList.
type GetDecryptionRuleListResult struct {
	// The Data param.
	Datas []GetDecryptionRuleListData `pulumi:"datas"`
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
	// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
	Position string `pulumi:"position"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
	Tfid    string  `pulumi:"tfid"`
	// The Total param.
	Total int `pulumi:"total"`
}

func GetDecryptionRuleListOutput(ctx *pulumi.Context, args GetDecryptionRuleListOutputArgs, opts ...pulumi.InvokeOption) GetDecryptionRuleListResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDecryptionRuleListResult, error) {
			args := v.(GetDecryptionRuleListArgs)
			r, err := GetDecryptionRuleList(ctx, &args, opts...)
			var s GetDecryptionRuleListResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDecryptionRuleListResultOutput)
}

// A collection of arguments for invoking getDecryptionRuleList.
type GetDecryptionRuleListOutputArgs struct {
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
	// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
	Position pulumi.StringPtrInput `pulumi:"position"`
	// The Snippet param.
	Snippet pulumi.StringPtrInput `pulumi:"snippet"`
}

func (GetDecryptionRuleListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDecryptionRuleListArgs)(nil)).Elem()
}

// A collection of values returned by getDecryptionRuleList.
type GetDecryptionRuleListResultOutput struct{ *pulumi.OutputState }

func (GetDecryptionRuleListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDecryptionRuleListResult)(nil)).Elem()
}

func (o GetDecryptionRuleListResultOutput) ToGetDecryptionRuleListResultOutput() GetDecryptionRuleListResultOutput {
	return o
}

func (o GetDecryptionRuleListResultOutput) ToGetDecryptionRuleListResultOutputWithContext(ctx context.Context) GetDecryptionRuleListResultOutput {
	return o
}

// The Data param.
func (o GetDecryptionRuleListResultOutput) Datas() GetDecryptionRuleListDataArrayOutput {
	return o.ApplyT(func(v GetDecryptionRuleListResult) []GetDecryptionRuleListData { return v.Datas }).(GetDecryptionRuleListDataArrayOutput)
}

// The Device param.
func (o GetDecryptionRuleListResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDecryptionRuleListResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The Folder param.
func (o GetDecryptionRuleListResultOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDecryptionRuleListResult) *string { return v.Folder }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetDecryptionRuleListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDecryptionRuleListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetDecryptionRuleListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetDecryptionRuleListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Name param.
func (o GetDecryptionRuleListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDecryptionRuleListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The Offset param. Default: `0`.
func (o GetDecryptionRuleListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetDecryptionRuleListResult) int { return v.Offset }).(pulumi.IntOutput)
}

// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
func (o GetDecryptionRuleListResultOutput) Position() pulumi.StringOutput {
	return o.ApplyT(func(v GetDecryptionRuleListResult) string { return v.Position }).(pulumi.StringOutput)
}

// The Snippet param.
func (o GetDecryptionRuleListResultOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetDecryptionRuleListResult) *string { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o GetDecryptionRuleListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetDecryptionRuleListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetDecryptionRuleListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetDecryptionRuleListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDecryptionRuleListResultOutput{})
}
