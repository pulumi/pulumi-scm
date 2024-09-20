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
//			_, err := scm.GetAuthenticationRuleList(ctx, &scm.GetAuthenticationRuleListArgs{
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
func GetAuthenticationRuleList(ctx *pulumi.Context, args *GetAuthenticationRuleListArgs, opts ...pulumi.InvokeOption) (*GetAuthenticationRuleListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAuthenticationRuleListResult
	err := ctx.Invoke("scm:index/getAuthenticationRuleList:getAuthenticationRuleList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAuthenticationRuleList.
type GetAuthenticationRuleListArgs struct {
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

// A collection of values returned by getAuthenticationRuleList.
type GetAuthenticationRuleListResult struct {
	// The Data param.
	Datas []GetAuthenticationRuleListData `pulumi:"datas"`
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

func GetAuthenticationRuleListOutput(ctx *pulumi.Context, args GetAuthenticationRuleListOutputArgs, opts ...pulumi.InvokeOption) GetAuthenticationRuleListResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAuthenticationRuleListResultOutput, error) {
			args := v.(GetAuthenticationRuleListArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetAuthenticationRuleListResult
			secret, err := ctx.InvokePackageRaw("scm:index/getAuthenticationRuleList:getAuthenticationRuleList", args, &rv, "", opts...)
			if err != nil {
				return GetAuthenticationRuleListResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetAuthenticationRuleListResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetAuthenticationRuleListResultOutput), nil
			}
			return output, nil
		}).(GetAuthenticationRuleListResultOutput)
}

// A collection of arguments for invoking getAuthenticationRuleList.
type GetAuthenticationRuleListOutputArgs struct {
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

func (GetAuthenticationRuleListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthenticationRuleListArgs)(nil)).Elem()
}

// A collection of values returned by getAuthenticationRuleList.
type GetAuthenticationRuleListResultOutput struct{ *pulumi.OutputState }

func (GetAuthenticationRuleListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAuthenticationRuleListResult)(nil)).Elem()
}

func (o GetAuthenticationRuleListResultOutput) ToGetAuthenticationRuleListResultOutput() GetAuthenticationRuleListResultOutput {
	return o
}

func (o GetAuthenticationRuleListResultOutput) ToGetAuthenticationRuleListResultOutputWithContext(ctx context.Context) GetAuthenticationRuleListResultOutput {
	return o
}

// The Data param.
func (o GetAuthenticationRuleListResultOutput) Datas() GetAuthenticationRuleListDataArrayOutput {
	return o.ApplyT(func(v GetAuthenticationRuleListResult) []GetAuthenticationRuleListData { return v.Datas }).(GetAuthenticationRuleListDataArrayOutput)
}

// The Device param.
func (o GetAuthenticationRuleListResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAuthenticationRuleListResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The Folder param.
func (o GetAuthenticationRuleListResultOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAuthenticationRuleListResult) *string { return v.Folder }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAuthenticationRuleListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthenticationRuleListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetAuthenticationRuleListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetAuthenticationRuleListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Name param.
func (o GetAuthenticationRuleListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAuthenticationRuleListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The Offset param. Default: `0`.
func (o GetAuthenticationRuleListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetAuthenticationRuleListResult) int { return v.Offset }).(pulumi.IntOutput)
}

// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
func (o GetAuthenticationRuleListResultOutput) Position() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthenticationRuleListResult) string { return v.Position }).(pulumi.StringOutput)
}

// The Snippet param.
func (o GetAuthenticationRuleListResultOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAuthenticationRuleListResult) *string { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o GetAuthenticationRuleListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetAuthenticationRuleListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetAuthenticationRuleListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetAuthenticationRuleListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAuthenticationRuleListResultOutput{})
}
