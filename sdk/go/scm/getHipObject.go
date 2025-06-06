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
//			_, err := scm.LookupHipObject(ctx, &scm.LookupHipObjectArgs{
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
func LookupHipObject(ctx *pulumi.Context, args *LookupHipObjectArgs, opts ...pulumi.InvokeOption) (*LookupHipObjectResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupHipObjectResult
	err := ctx.Invoke("scm:index/getHipObject:getHipObject", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHipObject.
type LookupHipObjectArgs struct {
	// The Id param.
	Id string `pulumi:"id"`
}

// A collection of values returned by getHipObject.
type LookupHipObjectResult struct {
	// The AntiMalware param.
	AntiMalware GetHipObjectAntiMalware `pulumi:"antiMalware"`
	// The Certificate param.
	Certificate GetHipObjectCertificate `pulumi:"certificate"`
	// The CustomChecks param.
	CustomChecks GetHipObjectCustomChecks `pulumi:"customChecks"`
	// The DataLossPrevention param.
	DataLossPrevention GetHipObjectDataLossPrevention `pulumi:"dataLossPrevention"`
	// The Description param. String length must not exceed 255 characters.
	Description string `pulumi:"description"`
	// The DiskBackup param.
	DiskBackup GetHipObjectDiskBackup `pulumi:"diskBackup"`
	// The DiskEncryption param.
	DiskEncryption GetHipObjectDiskEncryption `pulumi:"diskEncryption"`
	// The Firewall param.
	Firewall GetHipObjectFirewall `pulumi:"firewall"`
	// The HostInfo param.
	HostInfo GetHipObjectHostInfo `pulumi:"hostInfo"`
	// The Id param.
	Id string `pulumi:"id"`
	// The MobileDevice param.
	MobileDevice GetHipObjectMobileDevice `pulumi:"mobileDevice"`
	// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
	Name string `pulumi:"name"`
	// The NetworkInfo param.
	NetworkInfo GetHipObjectNetworkInfo `pulumi:"networkInfo"`
	// The PatchManagement param.
	PatchManagement GetHipObjectPatchManagement `pulumi:"patchManagement"`
	Tfid            string                      `pulumi:"tfid"`
}

func LookupHipObjectOutput(ctx *pulumi.Context, args LookupHipObjectOutputArgs, opts ...pulumi.InvokeOption) LookupHipObjectResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupHipObjectResultOutput, error) {
			args := v.(LookupHipObjectArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("scm:index/getHipObject:getHipObject", args, LookupHipObjectResultOutput{}, options).(LookupHipObjectResultOutput), nil
		}).(LookupHipObjectResultOutput)
}

// A collection of arguments for invoking getHipObject.
type LookupHipObjectOutputArgs struct {
	// The Id param.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupHipObjectOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupHipObjectArgs)(nil)).Elem()
}

// A collection of values returned by getHipObject.
type LookupHipObjectResultOutput struct{ *pulumi.OutputState }

func (LookupHipObjectResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupHipObjectResult)(nil)).Elem()
}

func (o LookupHipObjectResultOutput) ToLookupHipObjectResultOutput() LookupHipObjectResultOutput {
	return o
}

func (o LookupHipObjectResultOutput) ToLookupHipObjectResultOutputWithContext(ctx context.Context) LookupHipObjectResultOutput {
	return o
}

// The AntiMalware param.
func (o LookupHipObjectResultOutput) AntiMalware() GetHipObjectAntiMalwareOutput {
	return o.ApplyT(func(v LookupHipObjectResult) GetHipObjectAntiMalware { return v.AntiMalware }).(GetHipObjectAntiMalwareOutput)
}

// The Certificate param.
func (o LookupHipObjectResultOutput) Certificate() GetHipObjectCertificateOutput {
	return o.ApplyT(func(v LookupHipObjectResult) GetHipObjectCertificate { return v.Certificate }).(GetHipObjectCertificateOutput)
}

// The CustomChecks param.
func (o LookupHipObjectResultOutput) CustomChecks() GetHipObjectCustomChecksOutput {
	return o.ApplyT(func(v LookupHipObjectResult) GetHipObjectCustomChecks { return v.CustomChecks }).(GetHipObjectCustomChecksOutput)
}

// The DataLossPrevention param.
func (o LookupHipObjectResultOutput) DataLossPrevention() GetHipObjectDataLossPreventionOutput {
	return o.ApplyT(func(v LookupHipObjectResult) GetHipObjectDataLossPrevention { return v.DataLossPrevention }).(GetHipObjectDataLossPreventionOutput)
}

// The Description param. String length must not exceed 255 characters.
func (o LookupHipObjectResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHipObjectResult) string { return v.Description }).(pulumi.StringOutput)
}

// The DiskBackup param.
func (o LookupHipObjectResultOutput) DiskBackup() GetHipObjectDiskBackupOutput {
	return o.ApplyT(func(v LookupHipObjectResult) GetHipObjectDiskBackup { return v.DiskBackup }).(GetHipObjectDiskBackupOutput)
}

// The DiskEncryption param.
func (o LookupHipObjectResultOutput) DiskEncryption() GetHipObjectDiskEncryptionOutput {
	return o.ApplyT(func(v LookupHipObjectResult) GetHipObjectDiskEncryption { return v.DiskEncryption }).(GetHipObjectDiskEncryptionOutput)
}

// The Firewall param.
func (o LookupHipObjectResultOutput) Firewall() GetHipObjectFirewallOutput {
	return o.ApplyT(func(v LookupHipObjectResult) GetHipObjectFirewall { return v.Firewall }).(GetHipObjectFirewallOutput)
}

// The HostInfo param.
func (o LookupHipObjectResultOutput) HostInfo() GetHipObjectHostInfoOutput {
	return o.ApplyT(func(v LookupHipObjectResult) GetHipObjectHostInfo { return v.HostInfo }).(GetHipObjectHostInfoOutput)
}

// The Id param.
func (o LookupHipObjectResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHipObjectResult) string { return v.Id }).(pulumi.StringOutput)
}

// The MobileDevice param.
func (o LookupHipObjectResultOutput) MobileDevice() GetHipObjectMobileDeviceOutput {
	return o.ApplyT(func(v LookupHipObjectResult) GetHipObjectMobileDevice { return v.MobileDevice }).(GetHipObjectMobileDeviceOutput)
}

// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
func (o LookupHipObjectResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHipObjectResult) string { return v.Name }).(pulumi.StringOutput)
}

// The NetworkInfo param.
func (o LookupHipObjectResultOutput) NetworkInfo() GetHipObjectNetworkInfoOutput {
	return o.ApplyT(func(v LookupHipObjectResult) GetHipObjectNetworkInfo { return v.NetworkInfo }).(GetHipObjectNetworkInfoOutput)
}

// The PatchManagement param.
func (o LookupHipObjectResultOutput) PatchManagement() GetHipObjectPatchManagementOutput {
	return o.ApplyT(func(v LookupHipObjectResult) GetHipObjectPatchManagement { return v.PatchManagement }).(GetHipObjectPatchManagementOutput)
}

func (o LookupHipObjectResultOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHipObjectResult) string { return v.Tfid }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupHipObjectResultOutput{})
}
