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
func GetJobsList(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetJobsListResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetJobsListResult
	err := ctx.Invoke("scm:index/getJobsList:getJobsList", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getJobsList.
type GetJobsListResult struct {
	// The Data param.
	Datas []GetJobsListData `pulumi:"datas"`
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

func GetJobsListOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetJobsListResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetJobsListResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("scm:index/getJobsList:getJobsList", nil, GetJobsListResultOutput{}, options).(GetJobsListResultOutput), nil
	}).(GetJobsListResultOutput)
}

// A collection of values returned by getJobsList.
type GetJobsListResultOutput struct{ *pulumi.OutputState }

func (GetJobsListResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetJobsListResult)(nil)).Elem()
}

func (o GetJobsListResultOutput) ToGetJobsListResultOutput() GetJobsListResultOutput {
	return o
}

func (o GetJobsListResultOutput) ToGetJobsListResultOutputWithContext(ctx context.Context) GetJobsListResultOutput {
	return o
}

// The Data param.
func (o GetJobsListResultOutput) Datas() GetJobsListDataArrayOutput {
	return o.ApplyT(func(v GetJobsListResult) []GetJobsListData { return v.Datas }).(GetJobsListDataArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetJobsListResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetJobsListResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Limit param. A limit of -1 will return all configured items. Default: `200`.
func (o GetJobsListResultOutput) Limit() pulumi.IntOutput {
	return o.ApplyT(func(v GetJobsListResult) int { return v.Limit }).(pulumi.IntOutput)
}

// The Offset param. Default: `0`.
func (o GetJobsListResultOutput) Offset() pulumi.IntOutput {
	return o.ApplyT(func(v GetJobsListResult) int { return v.Offset }).(pulumi.IntOutput)
}

func (o GetJobsListResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v GetJobsListResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Total param.
func (o GetJobsListResultOutput) Total() pulumi.IntOutput {
	return o.ApplyT(func(v GetJobsListResult) int { return v.Total }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetJobsListResultOutput{})
}
