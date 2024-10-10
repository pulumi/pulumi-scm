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
//			_, err := scm.GetInternalDnsServerList(ctx, &scm.GetInternalDnsServerListArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetInternalDnsServerList(ctx *pulumi.Context, args *GetInternalDnsServerListArgs, opts ...pulumi.InvokeOption) (*GetInternalDnsServerListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetInternalDnsServerListResult
	err := ctx.Invoke("scm:index/getInternalDnsServerList:getInternalDnsServerList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInternalDnsServerList.
type GetInternalDnsServerListArgs struct {
	// The Limit param. A limit of -1 will return all configured items. Default: `200`.
	Limit *int `pulumi:"limit"`
	// The Name param.
	Name *string `pulumi:"name"`
	// The Offset param. Default: `0`.
	Offset *int `pulumi:"offset"`
}

// A collection of values returned by getInternalDnsServerList.
type GetInternalDnsServerListResult struct {
	// The Data param.
	Datas []GetInternalDnsServerListData `pulumi:"datas"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The Limit param. A limit of -1 will return all configured items. Default: `200`.
	Limit int `pulumi:"limit"`
	// The Name param.
	Name *string `pulumi:"name"`
	// The Offset param. Default: `0`.
	Offset int    `pulumi:"offset"`
	Tfid   string `pulumi:"tfid"`
	// The Total param.
	Total int `pulumi:"total"`
}

func GetInternalDnsServerListOutput(ctx *pulumi.Context, args GetInternalDnsServerListOutputArgs, opts ...pulumi.InvokeOption) GetInternalDnsServerListResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetInternalDnsServerListResultOutput, error) {
			args := v.(GetInternalDnsServerListArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetInternalDnsServerListResult
			secret, err := ctx.InvokePackageRaw("scm:index/getInternalDnsServerList:getInternalDnsServerList", args, &rv, "", opts...)
			if err != nil {
				return GetInternalDnsServerListResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetInternalDnsServerListResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetInternalDnsServerListResultOutput), nil
			}
			return output, nil
		}).(GetInternalDnsServerListResultOutput)
}

// A collection of arguments for invoking getInternalDnsServerList.
type GetInternalDnsServerListOutputArgs struct {
	// The Limit param. A limit of -1 will return all configured items. Default: `200`.
	Limit pulumi.IntPtrInput `pulumi:"limit"`
	// The Name param.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The Offset param. Default: `0`.
	Offset pulumi.IntPtrInput `pulumi:"offset"`
}

func (GetInternalDnsServerListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInternalDnsServerListArgs)(nil)).Elem()
}

// A collection of values returned by getInternalDnsServerList.
type GetInternalDnsServerListResultOutput struct{ *pulumi.OutputState }

func (GetInternalDnsServerListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInternalDnsServerListResult)(nil)).Elem()
}

func (o GetInternalDnsServerListResultOutput) ToGetInternalDnsServerListResultOutput() GetInternalDnsServerListResultOutput {
	return o
}

func (o GetInternalDnsServerListResultOutput) ToGetInternalDnsServerListResultOutputWithContext(ctx context.Context) GetInternalDnsServerListResultOutput {
	return o
}

// The Data param.
func (o GetInternalDnsServerListResultOutput) Datas() GetInternalDnsServerListDataArrayOutput {
	return o.ApplyT(func(v GetInternalDnsServerListResult) []GetInternalDnsServerListData { return v.Datas }).(GetInternalDnsServerListDataArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetInternalDnsServerListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInternalDnsServerListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetInternalDnsServerListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetInternalDnsServerListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Name param.
func (o GetInternalDnsServerListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInternalDnsServerListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The Offset param. Default: `0`.
func (o GetInternalDnsServerListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetInternalDnsServerListResult) int { return v.Offset }).(pulumi.IntOutput)
}

func (o GetInternalDnsServerListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetInternalDnsServerListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetInternalDnsServerListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetInternalDnsServerListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInternalDnsServerListResultOutput{})
}
