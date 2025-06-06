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
//			_, err := scm.GetSharedInfrastructureSettingsList(ctx, &scm.GetSharedInfrastructureSettingsListArgs{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetSharedInfrastructureSettingsList(ctx *pulumi.Context, args *GetSharedInfrastructureSettingsListArgs, opts ...pulumi.InvokeOption) (*GetSharedInfrastructureSettingsListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetSharedInfrastructureSettingsListResult
	err := ctx.Invoke("scm:index/getSharedInfrastructureSettingsList:getSharedInfrastructureSettingsList", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSharedInfrastructureSettingsList.
type GetSharedInfrastructureSettingsListArgs struct {
	// The Limit param. A limit of -1 will return all configured items. Default: `200`.
	Limit *int `pulumi:"limit"`
	// The Offset param. Default: `0`.
	Offset *int `pulumi:"offset"`
}

// A collection of values returned by getSharedInfrastructureSettingsList.
type GetSharedInfrastructureSettingsListResult struct {
	// The Data param.
	Datas []GetSharedInfrastructureSettingsListData `pulumi:"datas"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The Limit param. A limit of -1 will return all configured items. Default: `200`.
	Limit int `pulumi:"limit"`
	// The Offset param. Default: `0`.
	Offset int    `pulumi:"offset"`
	Tfid   string `pulumi:"tfid"`
	// The Total param.
	Total int `pulumi:"total"`
}

func GetSharedInfrastructureSettingsListOutput(ctx *pulumi.Context, args GetSharedInfrastructureSettingsListOutputArgs, opts ...pulumi.InvokeOption) GetSharedInfrastructureSettingsListResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetSharedInfrastructureSettingsListResultOutput, error) {
			args := v.(GetSharedInfrastructureSettingsListArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getSharedInfrastructureSettingsList:getSharedInfrastructureSettingsList", args, GetSharedInfrastructureSettingsListResultOutput{}, options).(GetSharedInfrastructureSettingsListResultOutput), nil
		}).(GetSharedInfrastructureSettingsListResultOutput)
}

// A collection of arguments for invoking getSharedInfrastructureSettingsList.
type GetSharedInfrastructureSettingsListOutputArgs struct {
	// The Limit param. A limit of -1 will return all configured items. Default: `200`.
	Limit pulumi.IntPtrInput `pulumi:"limit"`
	// The Offset param. Default: `0`.
	Offset pulumi.IntPtrInput `pulumi:"offset"`
}

func (GetSharedInfrastructureSettingsListOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSharedInfrastructureSettingsListArgs)(nil)).Elem()
}

// A collection of values returned by getSharedInfrastructureSettingsList.
type GetSharedInfrastructureSettingsListResultOutput struct{ *pulumi.OutputState }

func (GetSharedInfrastructureSettingsListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSharedInfrastructureSettingsListResult)(nil)).Elem()
}

func (o GetSharedInfrastructureSettingsListResultOutput) ToGetSharedInfrastructureSettingsListResultOutput() GetSharedInfrastructureSettingsListResultOutput {
	return o
}

func (o GetSharedInfrastructureSettingsListResultOutput) ToGetSharedInfrastructureSettingsListResultOutputWithContext(ctx context.Context) GetSharedInfrastructureSettingsListResultOutput {
	return o
}

// The Data param.
func (o GetSharedInfrastructureSettingsListResultOutput) Datas() GetSharedInfrastructureSettingsListDataArrayOutput {
	return o.ApplyT(func(v GetSharedInfrastructureSettingsListResult) []GetSharedInfrastructureSettingsListData {
		return v.Datas
	}).(GetSharedInfrastructureSettingsListDataArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetSharedInfrastructureSettingsListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSharedInfrastructureSettingsListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetSharedInfrastructureSettingsListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetSharedInfrastructureSettingsListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Offset param. Default: `0`.
func (o GetSharedInfrastructureSettingsListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetSharedInfrastructureSettingsListResult) int { return v.Offset }).(pulumi.IntOutput)
}

func (o GetSharedInfrastructureSettingsListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetSharedInfrastructureSettingsListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetSharedInfrastructureSettingsListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetSharedInfrastructureSettingsListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetSharedInfrastructureSettingsListResultOutput{})
}
