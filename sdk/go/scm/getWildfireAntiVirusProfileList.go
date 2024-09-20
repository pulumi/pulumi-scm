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
//			_, err := scm.GetWildfireAntiVirusProfileList(ctx, &scm.GetWildfireAntiVirusProfileListArgs{
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
func GetWildfireAntiVirusProfileList(ctx *pulumi.Context, args *GetWildfireAntiVirusProfileListArgs, opts ...pulumi.InvokeOption) (*GetWildfireAntiVirusProfileListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetWildfireAntiVirusProfileListResult
	err := ctx.Invoke("scm:index/getWildfireAntiVirusProfileList:getWildfireAntiVirusProfileList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWildfireAntiVirusProfileList.
type GetWildfireAntiVirusProfileListArgs struct {
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

// A collection of values returned by getWildfireAntiVirusProfileList.
type GetWildfireAntiVirusProfileListResult struct {
	// The Data param.
	Datas []GetWildfireAntiVirusProfileListData `pulumi:"datas"`
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

func GetWildfireAntiVirusProfileListOutput(ctx *pulumi.Context, args GetWildfireAntiVirusProfileListOutputArgs, opts ...pulumi.InvokeOption) GetWildfireAntiVirusProfileListResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetWildfireAntiVirusProfileListResultOutput, error) {
			args := v.(GetWildfireAntiVirusProfileListArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetWildfireAntiVirusProfileListResult
			secret, err := ctx.InvokePackageRaw("scm:index/getWildfireAntiVirusProfileList:getWildfireAntiVirusProfileList", args, &rv, "", opts...)
			if err != nil {
				return GetWildfireAntiVirusProfileListResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetWildfireAntiVirusProfileListResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetWildfireAntiVirusProfileListResultOutput), nil
			}
			return output, nil
		}).(GetWildfireAntiVirusProfileListResultOutput)
}

// A collection of arguments for invoking getWildfireAntiVirusProfileList.
type GetWildfireAntiVirusProfileListOutputArgs struct {
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

func (GetWildfireAntiVirusProfileListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWildfireAntiVirusProfileListArgs)(nil)).Elem()
}

// A collection of values returned by getWildfireAntiVirusProfileList.
type GetWildfireAntiVirusProfileListResultOutput struct{ *pulumi.OutputState }

func (GetWildfireAntiVirusProfileListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWildfireAntiVirusProfileListResult)(nil)).Elem()
}

func (o GetWildfireAntiVirusProfileListResultOutput) ToGetWildfireAntiVirusProfileListResultOutput() GetWildfireAntiVirusProfileListResultOutput {
	return o
}

func (o GetWildfireAntiVirusProfileListResultOutput) ToGetWildfireAntiVirusProfileListResultOutputWithContext(ctx context.Context) GetWildfireAntiVirusProfileListResultOutput {
	return o
}

// The Data param.
func (o GetWildfireAntiVirusProfileListResultOutput) Datas() GetWildfireAntiVirusProfileListDataArrayOutput {
	return o.ApplyT(func(v GetWildfireAntiVirusProfileListResult) []GetWildfireAntiVirusProfileListData { return v.Datas }).(GetWildfireAntiVirusProfileListDataArrayOutput)
}

// The Device param.
func (o GetWildfireAntiVirusProfileListResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWildfireAntiVirusProfileListResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The Folder param.
func (o GetWildfireAntiVirusProfileListResultOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWildfireAntiVirusProfileListResult) *string { return v.Folder }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetWildfireAntiVirusProfileListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWildfireAntiVirusProfileListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetWildfireAntiVirusProfileListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetWildfireAntiVirusProfileListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Name param.
func (o GetWildfireAntiVirusProfileListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWildfireAntiVirusProfileListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The Offset param. Default: `0`.
func (o GetWildfireAntiVirusProfileListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetWildfireAntiVirusProfileListResult) int { return v.Offset }).(pulumi.IntOutput)
}

// The Snippet param.
func (o GetWildfireAntiVirusProfileListResultOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWildfireAntiVirusProfileListResult) *string { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o GetWildfireAntiVirusProfileListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetWildfireAntiVirusProfileListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetWildfireAntiVirusProfileListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetWildfireAntiVirusProfileListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWildfireAntiVirusProfileListResultOutput{})
}
