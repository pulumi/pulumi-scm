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
type HipObject struct {
	pulumi.CustomResourceState

	// The AntiMalware param.
	AntiMalware HipObjectAntiMalwarePtrOutput `pulumi:"antiMalware"`
	// The Certificate param.
	Certificate HipObjectCertificatePtrOutput `pulumi:"certificate"`
	// The CustomChecks param.
	CustomChecks HipObjectCustomChecksPtrOutput `pulumi:"customChecks"`
	// The DataLossPrevention param.
	DataLossPrevention HipObjectDataLossPreventionPtrOutput `pulumi:"dataLossPrevention"`
	// The Description param. String length must not exceed 255 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The Device param.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// The DiskBackup param.
	DiskBackup HipObjectDiskBackupPtrOutput `pulumi:"diskBackup"`
	// The DiskEncryption param.
	DiskEncryption HipObjectDiskEncryptionPtrOutput `pulumi:"diskEncryption"`
	// The Firewall param.
	Firewall HipObjectFirewallPtrOutput `pulumi:"firewall"`
	// The Folder param.
	Folder pulumi.StringPtrOutput `pulumi:"folder"`
	// The HostInfo param.
	HostInfo HipObjectHostInfoPtrOutput `pulumi:"hostInfo"`
	// The MobileDevice param.
	MobileDevice HipObjectMobileDevicePtrOutput `pulumi:"mobileDevice"`
	// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
	Name pulumi.StringOutput `pulumi:"name"`
	// The NetworkInfo param.
	NetworkInfo HipObjectNetworkInfoPtrOutput `pulumi:"networkInfo"`
	// The PatchManagement param.
	PatchManagement HipObjectPatchManagementPtrOutput `pulumi:"patchManagement"`
	// The Snippet param.
	Snippet pulumi.StringPtrOutput `pulumi:"snippet"`
	Tfid    pulumi.StringOutput    `pulumi:"tfid"`
}

// NewHipObject registers a new resource with the given unique name, arguments, and options.
func NewHipObject(ctx *pulumi.Context,
	name string, args *HipObjectArgs, opts ...pulumi.ResourceOption) (*HipObject, error) {
	if args == nil {
		args = &HipObjectArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HipObject
	err := ctx.RegisterResource("scm:index/hipObject:HipObject", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHipObject gets an existing HipObject resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHipObject(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HipObjectState, opts ...pulumi.ResourceOption) (*HipObject, error) {
	var resource HipObject
	err := ctx.ReadResource("scm:index/hipObject:HipObject", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HipObject resources.
type hipObjectState struct {
	// The AntiMalware param.
	AntiMalware *HipObjectAntiMalware `pulumi:"antiMalware"`
	// The Certificate param.
	Certificate *HipObjectCertificate `pulumi:"certificate"`
	// The CustomChecks param.
	CustomChecks *HipObjectCustomChecks `pulumi:"customChecks"`
	// The DataLossPrevention param.
	DataLossPrevention *HipObjectDataLossPrevention `pulumi:"dataLossPrevention"`
	// The Description param. String length must not exceed 255 characters.
	Description *string `pulumi:"description"`
	// The Device param.
	Device *string `pulumi:"device"`
	// The DiskBackup param.
	DiskBackup *HipObjectDiskBackup `pulumi:"diskBackup"`
	// The DiskEncryption param.
	DiskEncryption *HipObjectDiskEncryption `pulumi:"diskEncryption"`
	// The Firewall param.
	Firewall *HipObjectFirewall `pulumi:"firewall"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The HostInfo param.
	HostInfo *HipObjectHostInfo `pulumi:"hostInfo"`
	// The MobileDevice param.
	MobileDevice *HipObjectMobileDevice `pulumi:"mobileDevice"`
	// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
	Name *string `pulumi:"name"`
	// The NetworkInfo param.
	NetworkInfo *HipObjectNetworkInfo `pulumi:"networkInfo"`
	// The PatchManagement param.
	PatchManagement *HipObjectPatchManagement `pulumi:"patchManagement"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
	Tfid    *string `pulumi:"tfid"`
}

type HipObjectState struct {
	// The AntiMalware param.
	AntiMalware HipObjectAntiMalwarePtrInput
	// The Certificate param.
	Certificate HipObjectCertificatePtrInput
	// The CustomChecks param.
	CustomChecks HipObjectCustomChecksPtrInput
	// The DataLossPrevention param.
	DataLossPrevention HipObjectDataLossPreventionPtrInput
	// The Description param. String length must not exceed 255 characters.
	Description pulumi.StringPtrInput
	// The Device param.
	Device pulumi.StringPtrInput
	// The DiskBackup param.
	DiskBackup HipObjectDiskBackupPtrInput
	// The DiskEncryption param.
	DiskEncryption HipObjectDiskEncryptionPtrInput
	// The Firewall param.
	Firewall HipObjectFirewallPtrInput
	// The Folder param.
	Folder pulumi.StringPtrInput
	// The HostInfo param.
	HostInfo HipObjectHostInfoPtrInput
	// The MobileDevice param.
	MobileDevice HipObjectMobileDevicePtrInput
	// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
	Name pulumi.StringPtrInput
	// The NetworkInfo param.
	NetworkInfo HipObjectNetworkInfoPtrInput
	// The PatchManagement param.
	PatchManagement HipObjectPatchManagementPtrInput
	// The Snippet param.
	Snippet pulumi.StringPtrInput
	Tfid    pulumi.StringPtrInput
}

func (HipObjectState) ElementType() reflect.Type {
	return reflect.TypeOf((*hipObjectState)(nil)).Elem()
}

type hipObjectArgs struct {
	// The AntiMalware param.
	AntiMalware *HipObjectAntiMalware `pulumi:"antiMalware"`
	// The Certificate param.
	Certificate *HipObjectCertificate `pulumi:"certificate"`
	// The CustomChecks param.
	CustomChecks *HipObjectCustomChecks `pulumi:"customChecks"`
	// The DataLossPrevention param.
	DataLossPrevention *HipObjectDataLossPrevention `pulumi:"dataLossPrevention"`
	// The Description param. String length must not exceed 255 characters.
	Description *string `pulumi:"description"`
	// The Device param.
	Device *string `pulumi:"device"`
	// The DiskBackup param.
	DiskBackup *HipObjectDiskBackup `pulumi:"diskBackup"`
	// The DiskEncryption param.
	DiskEncryption *HipObjectDiskEncryption `pulumi:"diskEncryption"`
	// The Firewall param.
	Firewall *HipObjectFirewall `pulumi:"firewall"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The HostInfo param.
	HostInfo *HipObjectHostInfo `pulumi:"hostInfo"`
	// The MobileDevice param.
	MobileDevice *HipObjectMobileDevice `pulumi:"mobileDevice"`
	// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
	Name *string `pulumi:"name"`
	// The NetworkInfo param.
	NetworkInfo *HipObjectNetworkInfo `pulumi:"networkInfo"`
	// The PatchManagement param.
	PatchManagement *HipObjectPatchManagement `pulumi:"patchManagement"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
}

// The set of arguments for constructing a HipObject resource.
type HipObjectArgs struct {
	// The AntiMalware param.
	AntiMalware HipObjectAntiMalwarePtrInput
	// The Certificate param.
	Certificate HipObjectCertificatePtrInput
	// The CustomChecks param.
	CustomChecks HipObjectCustomChecksPtrInput
	// The DataLossPrevention param.
	DataLossPrevention HipObjectDataLossPreventionPtrInput
	// The Description param. String length must not exceed 255 characters.
	Description pulumi.StringPtrInput
	// The Device param.
	Device pulumi.StringPtrInput
	// The DiskBackup param.
	DiskBackup HipObjectDiskBackupPtrInput
	// The DiskEncryption param.
	DiskEncryption HipObjectDiskEncryptionPtrInput
	// The Firewall param.
	Firewall HipObjectFirewallPtrInput
	// The Folder param.
	Folder pulumi.StringPtrInput
	// The HostInfo param.
	HostInfo HipObjectHostInfoPtrInput
	// The MobileDevice param.
	MobileDevice HipObjectMobileDevicePtrInput
	// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
	Name pulumi.StringPtrInput
	// The NetworkInfo param.
	NetworkInfo HipObjectNetworkInfoPtrInput
	// The PatchManagement param.
	PatchManagement HipObjectPatchManagementPtrInput
	// The Snippet param.
	Snippet pulumi.StringPtrInput
}

func (HipObjectArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hipObjectArgs)(nil)).Elem()
}

type HipObjectInput interface {
	pulumi.Input

	ToHipObjectOutput() HipObjectOutput
	ToHipObjectOutputWithContext(ctx context.Context) HipObjectOutput
}

func (*HipObject) ElementType() reflect.Type {
	return reflect.TypeOf((**HipObject)(nil)).Elem()
}

func (i *HipObject) ToHipObjectOutput() HipObjectOutput {
	return i.ToHipObjectOutputWithContext(context.Background())
}

func (i *HipObject) ToHipObjectOutputWithContext(ctx context.Context) HipObjectOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HipObjectOutput)
}

// HipObjectArrayInput is an input type that accepts HipObjectArray and HipObjectArrayOutput values.
// You can construct a concrete instance of `HipObjectArrayInput` via:
//
//	HipObjectArray{ HipObjectArgs{...} }
type HipObjectArrayInput interface {
	pulumi.Input

	ToHipObjectArrayOutput() HipObjectArrayOutput
	ToHipObjectArrayOutputWithContext(context.Context) HipObjectArrayOutput
}

type HipObjectArray []HipObjectInput

func (HipObjectArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HipObject)(nil)).Elem()
}

func (i HipObjectArray) ToHipObjectArrayOutput() HipObjectArrayOutput {
	return i.ToHipObjectArrayOutputWithContext(context.Background())
}

func (i HipObjectArray) ToHipObjectArrayOutputWithContext(ctx context.Context) HipObjectArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HipObjectArrayOutput)
}

// HipObjectMapInput is an input type that accepts HipObjectMap and HipObjectMapOutput values.
// You can construct a concrete instance of `HipObjectMapInput` via:
//
//	HipObjectMap{ "key": HipObjectArgs{...} }
type HipObjectMapInput interface {
	pulumi.Input

	ToHipObjectMapOutput() HipObjectMapOutput
	ToHipObjectMapOutputWithContext(context.Context) HipObjectMapOutput
}

type HipObjectMap map[string]HipObjectInput

func (HipObjectMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HipObject)(nil)).Elem()
}

func (i HipObjectMap) ToHipObjectMapOutput() HipObjectMapOutput {
	return i.ToHipObjectMapOutputWithContext(context.Background())
}

func (i HipObjectMap) ToHipObjectMapOutputWithContext(ctx context.Context) HipObjectMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HipObjectMapOutput)
}

type HipObjectOutput struct{ *pulumi.OutputState }

func (HipObjectOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HipObject)(nil)).Elem()
}

func (o HipObjectOutput) ToHipObjectOutput() HipObjectOutput {
	return o
}

func (o HipObjectOutput) ToHipObjectOutputWithContext(ctx context.Context) HipObjectOutput {
	return o
}

// The AntiMalware param.
func (o HipObjectOutput) AntiMalware() HipObjectAntiMalwarePtrOutput {
	return o.ApplyT(func(v *HipObject) HipObjectAntiMalwarePtrOutput { return v.AntiMalware }).(HipObjectAntiMalwarePtrOutput)
}

// The Certificate param.
func (o HipObjectOutput) Certificate() HipObjectCertificatePtrOutput {
	return o.ApplyT(func(v *HipObject) HipObjectCertificatePtrOutput { return v.Certificate }).(HipObjectCertificatePtrOutput)
}

// The CustomChecks param.
func (o HipObjectOutput) CustomChecks() HipObjectCustomChecksPtrOutput {
	return o.ApplyT(func(v *HipObject) HipObjectCustomChecksPtrOutput { return v.CustomChecks }).(HipObjectCustomChecksPtrOutput)
}

// The DataLossPrevention param.
func (o HipObjectOutput) DataLossPrevention() HipObjectDataLossPreventionPtrOutput {
	return o.ApplyT(func(v *HipObject) HipObjectDataLossPreventionPtrOutput { return v.DataLossPrevention }).(HipObjectDataLossPreventionPtrOutput)
}

// The Description param. String length must not exceed 255 characters.
func (o HipObjectOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HipObject) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The Device param.
func (o HipObjectOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HipObject) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// The DiskBackup param.
func (o HipObjectOutput) DiskBackup() HipObjectDiskBackupPtrOutput {
	return o.ApplyT(func(v *HipObject) HipObjectDiskBackupPtrOutput { return v.DiskBackup }).(HipObjectDiskBackupPtrOutput)
}

// The DiskEncryption param.
func (o HipObjectOutput) DiskEncryption() HipObjectDiskEncryptionPtrOutput {
	return o.ApplyT(func(v *HipObject) HipObjectDiskEncryptionPtrOutput { return v.DiskEncryption }).(HipObjectDiskEncryptionPtrOutput)
}

// The Firewall param.
func (o HipObjectOutput) Firewall() HipObjectFirewallPtrOutput {
	return o.ApplyT(func(v *HipObject) HipObjectFirewallPtrOutput { return v.Firewall }).(HipObjectFirewallPtrOutput)
}

// The Folder param.
func (o HipObjectOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HipObject) pulumi.StringPtrOutput { return v.Folder }).(pulumi.StringPtrOutput)
}

// The HostInfo param.
func (o HipObjectOutput) HostInfo() HipObjectHostInfoPtrOutput {
	return o.ApplyT(func(v *HipObject) HipObjectHostInfoPtrOutput { return v.HostInfo }).(HipObjectHostInfoPtrOutput)
}

// The MobileDevice param.
func (o HipObjectOutput) MobileDevice() HipObjectMobileDevicePtrOutput {
	return o.ApplyT(func(v *HipObject) HipObjectMobileDevicePtrOutput { return v.MobileDevice }).(HipObjectMobileDevicePtrOutput)
}

// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
func (o HipObjectOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *HipObject) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The NetworkInfo param.
func (o HipObjectOutput) NetworkInfo() HipObjectNetworkInfoPtrOutput {
	return o.ApplyT(func(v *HipObject) HipObjectNetworkInfoPtrOutput { return v.NetworkInfo }).(HipObjectNetworkInfoPtrOutput)
}

// The PatchManagement param.
func (o HipObjectOutput) PatchManagement() HipObjectPatchManagementPtrOutput {
	return o.ApplyT(func(v *HipObject) HipObjectPatchManagementPtrOutput { return v.PatchManagement }).(HipObjectPatchManagementPtrOutput)
}

// The Snippet param.
func (o HipObjectOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *HipObject) pulumi.StringPtrOutput { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o HipObjectOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v *HipObject) pulumi.StringOutput { return v.Tfid }).(pulumi.StringOutput)
}

type HipObjectArrayOutput struct{ *pulumi.OutputState }

func (HipObjectArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HipObject)(nil)).Elem()
}

func (o HipObjectArrayOutput) ToHipObjectArrayOutput() HipObjectArrayOutput {
	return o
}

func (o HipObjectArrayOutput) ToHipObjectArrayOutputWithContext(ctx context.Context) HipObjectArrayOutput {
	return o
}

func (o HipObjectArrayOutput) Index(i pulumi.IntInput) HipObjectOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HipObject {
		return vs[0].([]*HipObject)[vs[1].(int)]
	}).(HipObjectOutput)
}

type HipObjectMapOutput struct{ *pulumi.OutputState }

func (HipObjectMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HipObject)(nil)).Elem()
}

func (o HipObjectMapOutput) ToHipObjectMapOutput() HipObjectMapOutput {
	return o
}

func (o HipObjectMapOutput) ToHipObjectMapOutputWithContext(ctx context.Context) HipObjectMapOutput {
	return o
}

func (o HipObjectMapOutput) MapIndex(k pulumi.StringInput) HipObjectOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HipObject {
		return vs[0].(map[string]*HipObject)[vs[1].(string)]
	}).(HipObjectOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HipObjectInput)(nil)).Elem(), &HipObject{})
	pulumi.RegisterInputType(reflect.TypeOf((*HipObjectArrayInput)(nil)).Elem(), HipObjectArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HipObjectMapInput)(nil)).Elem(), HipObjectMap{})
	pulumi.RegisterOutputType(HipObjectOutput{})
	pulumi.RegisterOutputType(HipObjectArrayOutput{})
	pulumi.RegisterOutputType(HipObjectMapOutput{})
}
