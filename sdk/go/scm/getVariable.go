// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scm

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-scm/sdk/go/scm/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieves a config item.
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
//			_, err := scm.LookupVariable(ctx, &scm.LookupVariableArgs{
//				Id: "1234-56-789",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupVariable(ctx *pulumi.Context, args *LookupVariableArgs, opts ...pulumi.InvokeOption) (*LookupVariableResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupVariableResult
	err := ctx.Invoke("scm:index/getVariable:getVariable", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVariable.
type LookupVariableArgs struct {
	// The Device param.
	Device *string `pulumi:"device"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The Id param.
	Id string `pulumi:"id"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
}

// A collection of values returned by getVariable.
type LookupVariableResult struct {
	// The Description param.
	Description string `pulumi:"description"`
	// The Device param.
	Device *string `pulumi:"device"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The Id param.
	Id string `pulumi:"id"`
	// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
	Name string `pulumi:"name"`
	// The Overridden param.
	Overridden bool `pulumi:"overridden"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
	Tfid    string  `pulumi:"tfid"`
	// The Type param. String must be one of these: `"percent"`, `"count"`, `"ip-netmask"`, `"zone"`, `"ip-range"`, `"ip-wildcard"`, `"device-priority"`, `"device-id"`, `"egress-max"`, `"as-number"`, `"fqdn"`, `"port"`, `"link-tag"`, `"group-id"`, `"rate"`, `"router-id"`, `"qos-profile"`, `"timer"`.
	Type string `pulumi:"type"`
	// value can accept either string or integer.
	Value string `pulumi:"value"`
}

func LookupVariableOutput(ctx *pulumi.Context, args LookupVariableOutputArgs, opts ...pulumi.InvokeOption) LookupVariableResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupVariableResultOutput, error) {
			args := v.(LookupVariableArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getVariable:getVariable", args, LookupVariableResultOutput{}, options).(LookupVariableResultOutput), nil
		}).(LookupVariableResultOutput)
}

// A collection of arguments for invoking getVariable.
type LookupVariableOutputArgs struct {
	// The Device param.
	Device pulumi.StringPtrInput `pulumi:"device"`
	// The Folder param.
	Folder pulumi.StringPtrInput `pulumi:"folder"`
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
	// The Snippet param.
	Snippet pulumi.StringPtrInput `pulumi:"snippet"`
}

func (LookupVariableOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVariableArgs)(nil)).Elem()
}

// A collection of values returned by getVariable.
type LookupVariableResultOutput struct{ *pulumi.OutputState }

func (LookupVariableResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVariableResult)(nil)).Elem()
}

func (o LookupVariableResultOutput) ToLookupVariableResultOutput() LookupVariableResultOutput {
	return o
}

func (o LookupVariableResultOutput) ToLookupVariableResultOutputWithContext(ctx context.Context) LookupVariableResultOutput {
	return o
}

// The Description param.
func (o LookupVariableResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVariableResult) string { return v.Description }).(pulumi.StringOutput)
}

// The Device param.
func (o LookupVariableResultOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupVariableResult) *string { return v.Device }).(pulumi.StringPtrOutput)
}

// The Folder param.
func (o LookupVariableResultOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupVariableResult) *string { return v.Folder }).(pulumi.StringPtrOutput)
}

// The Id param.
func (o LookupVariableResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVariableResult) string { return v.Id }).(pulumi.StringOutput)
}

// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
func (o LookupVariableResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVariableResult) string { return v.Name }).(pulumi.StringOutput)
}

// The Overridden param.
func (o LookupVariableResultOutput) Overridden() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupVariableResult) bool { return v.Overridden }).(pulumi.BoolOutput)
}

// The Snippet param.
func (o LookupVariableResultOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupVariableResult) *string { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o LookupVariableResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVariableResult) string { return v.Tfid }).(pulumi.StringOutput)
}

// The Type param. String must be one of these: `"percent"`, `"count"`, `"ip-netmask"`, `"zone"`, `"ip-range"`, `"ip-wildcard"`, `"device-priority"`, `"device-id"`, `"egress-max"`, `"as-number"`, `"fqdn"`, `"port"`, `"link-tag"`, `"group-id"`, `"rate"`, `"router-id"`, `"qos-profile"`, `"timer"`.
func (o LookupVariableResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVariableResult) string { return v.Type }).(pulumi.StringOutput)
}

// value can accept either string or integer.
func (o LookupVariableResultOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVariableResult) string { return v.Value }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupVariableResultOutput{})
}
