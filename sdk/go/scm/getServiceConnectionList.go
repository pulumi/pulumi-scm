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
//			_, err := scm.GetServiceConnectionList(ctx, &scm.GetServiceConnectionListArgs{
//				Folder: pulumi.StringRef("Service Connections"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetServiceConnectionList(ctx *pulumi.Context, args *GetServiceConnectionListArgs, opts ...pulumi.InvokeOption) (*GetServiceConnectionListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetServiceConnectionListResult
	err := ctx.Invoke("scm:index/getServiceConnectionList:getServiceConnectionList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServiceConnectionList.
type GetServiceConnectionListArgs struct {
	// The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
	Folder *string `pulumi:"folder"`
	// The Limit param. A limit of -1 will return all configured items. Default: `200`.
	Limit *int `pulumi:"limit"`
	// The Name param.
	Name *string `pulumi:"name"`
	// The Offset param. Default: `0`.
	Offset *int `pulumi:"offset"`
}

// A collection of values returned by getServiceConnectionList.
type GetServiceConnectionListResult struct {
	// The Data param.
	Datas []GetServiceConnectionListData `pulumi:"datas"`
	// The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
	Folder string `pulumi:"folder"`
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

func GetServiceConnectionListOutput(ctx *pulumi.Context, args GetServiceConnectionListOutputArgs, opts ...pulumi.InvokeOption) GetServiceConnectionListResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServiceConnectionListResultOutput, error) {
			args := v.(GetServiceConnectionListArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetServiceConnectionListResult
			secret, err := ctx.InvokePackageRaw("scm:index/getServiceConnectionList:getServiceConnectionList", args, &rv, "", opts...)
			if err != nil {
				return GetServiceConnectionListResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetServiceConnectionListResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetServiceConnectionListResultOutput), nil
			}
			return output, nil
		}).(GetServiceConnectionListResultOutput)
}

// A collection of arguments for invoking getServiceConnectionList.
type GetServiceConnectionListOutputArgs struct {
	// The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
	Folder pulumi.StringPtrInput `pulumi:"folder"`
	// The Limit param. A limit of -1 will return all configured items. Default: `200`.
	Limit pulumi.IntPtrInput `pulumi:"limit"`
	// The Name param.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The Offset param. Default: `0`.
	Offset pulumi.IntPtrInput `pulumi:"offset"`
}

func (GetServiceConnectionListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceConnectionListArgs)(nil)).Elem()
}

// A collection of values returned by getServiceConnectionList.
type GetServiceConnectionListResultOutput struct{ *pulumi.OutputState }

func (GetServiceConnectionListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServiceConnectionListResult)(nil)).Elem()
}

func (o GetServiceConnectionListResultOutput) ToGetServiceConnectionListResultOutput() GetServiceConnectionListResultOutput {
	return o
}

func (o GetServiceConnectionListResultOutput) ToGetServiceConnectionListResultOutputWithContext(ctx context.Context) GetServiceConnectionListResultOutput {
	return o
}

// The Data param.
func (o GetServiceConnectionListResultOutput) Datas() GetServiceConnectionListDataArrayOutput {
	return o.ApplyT(func(v GetServiceConnectionListResult) []GetServiceConnectionListData { return v.Datas }).(GetServiceConnectionListDataArrayOutput)
}

// The Folder param. String can either be a specific string(`"Service Connections"`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `"Service Connections"`.
func (o GetServiceConnectionListResultOutput) Folder() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceConnectionListResult) string { return v.Folder }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetServiceConnectionListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceConnectionListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetServiceConnectionListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetServiceConnectionListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Name param.
func (o GetServiceConnectionListResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetServiceConnectionListResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The Offset param. Default: `0`.
func (o GetServiceConnectionListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetServiceConnectionListResult) int { return v.Offset }).(pulumi.IntOutput)
}

func (o GetServiceConnectionListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetServiceConnectionListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetServiceConnectionListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetServiceConnectionListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServiceConnectionListResultOutput{})
}
