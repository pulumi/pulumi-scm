// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scm

import (
	"context"
	"reflect"

	"errors"
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
//			_, err := scm.NewCertificateProfile(ctx, "example", nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type CertificateProfile struct {
	pulumi.CustomResourceState

	// The BlockExpiredCert param.
	BlockExpiredCert pulumi.BoolPtrOutput `pulumi:"blockExpiredCert"`
	// The BlockTimeoutCert param.
	BlockTimeoutCert pulumi.BoolPtrOutput `pulumi:"blockTimeoutCert"`
	// The BlockUnauthenticatedCert param.
	BlockUnauthenticatedCert pulumi.BoolPtrOutput `pulumi:"blockUnauthenticatedCert"`
	// The BlockUnknownCert param.
	BlockUnknownCert pulumi.BoolPtrOutput `pulumi:"blockUnknownCert"`
	// The CaCertificates param.
	CaCertificates CertificateProfileCaCertificateArrayOutput `pulumi:"caCertificates"`
	// The CertStatusTimeout param.
	CertStatusTimeout pulumi.StringPtrOutput `pulumi:"certStatusTimeout"`
	// The CrlReceiveTimeout param.
	CrlReceiveTimeout pulumi.StringPtrOutput `pulumi:"crlReceiveTimeout"`
	// The Device param.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// The Domain param.
	Domain pulumi.StringPtrOutput `pulumi:"domain"`
	// The Folder param.
	Folder pulumi.StringPtrOutput `pulumi:"folder"`
	// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
	Name pulumi.StringOutput `pulumi:"name"`
	// The OcspReceiveTimeout param.
	OcspReceiveTimeout pulumi.StringPtrOutput `pulumi:"ocspReceiveTimeout"`
	// The Snippet param.
	Snippet pulumi.StringPtrOutput `pulumi:"snippet"`
	Tfid    pulumi.StringOutput    `pulumi:"tfid"`
	// The UseCrl param.
	UseCrl pulumi.BoolPtrOutput `pulumi:"useCrl"`
	// The UseOcsp param.
	UseOcsp pulumi.BoolPtrOutput `pulumi:"useOcsp"`
	// The UsernameField param.
	UsernameField CertificateProfileUsernameFieldPtrOutput `pulumi:"usernameField"`
}

// NewCertificateProfile registers a new resource with the given unique name, arguments, and options.
func NewCertificateProfile(ctx *pulumi.Context,
	name string, args *CertificateProfileArgs, opts ...pulumi.ResourceOption) (*CertificateProfile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CaCertificates == nil {
		return nil, errors.New("invalid value for required argument 'CaCertificates'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource CertificateProfile
	err := ctx.RegisterResource("scm:index/certificateProfile:CertificateProfile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCertificateProfile gets an existing CertificateProfile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCertificateProfile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CertificateProfileState, opts ...pulumi.ResourceOption) (*CertificateProfile, error) {
	var resource CertificateProfile
	err := ctx.ReadResource("scm:index/certificateProfile:CertificateProfile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CertificateProfile resources.
type certificateProfileState struct {
	// The BlockExpiredCert param.
	BlockExpiredCert *bool `pulumi:"blockExpiredCert"`
	// The BlockTimeoutCert param.
	BlockTimeoutCert *bool `pulumi:"blockTimeoutCert"`
	// The BlockUnauthenticatedCert param.
	BlockUnauthenticatedCert *bool `pulumi:"blockUnauthenticatedCert"`
	// The BlockUnknownCert param.
	BlockUnknownCert *bool `pulumi:"blockUnknownCert"`
	// The CaCertificates param.
	CaCertificates []CertificateProfileCaCertificate `pulumi:"caCertificates"`
	// The CertStatusTimeout param.
	CertStatusTimeout *string `pulumi:"certStatusTimeout"`
	// The CrlReceiveTimeout param.
	CrlReceiveTimeout *string `pulumi:"crlReceiveTimeout"`
	// The Device param.
	Device *string `pulumi:"device"`
	// The Domain param.
	Domain *string `pulumi:"domain"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
	Name *string `pulumi:"name"`
	// The OcspReceiveTimeout param.
	OcspReceiveTimeout *string `pulumi:"ocspReceiveTimeout"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
	Tfid    *string `pulumi:"tfid"`
	// The UseCrl param.
	UseCrl *bool `pulumi:"useCrl"`
	// The UseOcsp param.
	UseOcsp *bool `pulumi:"useOcsp"`
	// The UsernameField param.
	UsernameField *CertificateProfileUsernameField `pulumi:"usernameField"`
}

type CertificateProfileState struct {
	// The BlockExpiredCert param.
	BlockExpiredCert pulumi.BoolPtrInput
	// The BlockTimeoutCert param.
	BlockTimeoutCert pulumi.BoolPtrInput
	// The BlockUnauthenticatedCert param.
	BlockUnauthenticatedCert pulumi.BoolPtrInput
	// The BlockUnknownCert param.
	BlockUnknownCert pulumi.BoolPtrInput
	// The CaCertificates param.
	CaCertificates CertificateProfileCaCertificateArrayInput
	// The CertStatusTimeout param.
	CertStatusTimeout pulumi.StringPtrInput
	// The CrlReceiveTimeout param.
	CrlReceiveTimeout pulumi.StringPtrInput
	// The Device param.
	Device pulumi.StringPtrInput
	// The Domain param.
	Domain pulumi.StringPtrInput
	// The Folder param.
	Folder pulumi.StringPtrInput
	// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
	Name pulumi.StringPtrInput
	// The OcspReceiveTimeout param.
	OcspReceiveTimeout pulumi.StringPtrInput
	// The Snippet param.
	Snippet pulumi.StringPtrInput
	Tfid    pulumi.StringPtrInput
	// The UseCrl param.
	UseCrl pulumi.BoolPtrInput
	// The UseOcsp param.
	UseOcsp pulumi.BoolPtrInput
	// The UsernameField param.
	UsernameField CertificateProfileUsernameFieldPtrInput
}

func (CertificateProfileState) ElementType() reflect.Type {
	return reflect.TypeOf((*certificateProfileState)(nil)).Elem()
}

type certificateProfileArgs struct {
	// The BlockExpiredCert param.
	BlockExpiredCert *bool `pulumi:"blockExpiredCert"`
	// The BlockTimeoutCert param.
	BlockTimeoutCert *bool `pulumi:"blockTimeoutCert"`
	// The BlockUnauthenticatedCert param.
	BlockUnauthenticatedCert *bool `pulumi:"blockUnauthenticatedCert"`
	// The BlockUnknownCert param.
	BlockUnknownCert *bool `pulumi:"blockUnknownCert"`
	// The CaCertificates param.
	CaCertificates []CertificateProfileCaCertificate `pulumi:"caCertificates"`
	// The CertStatusTimeout param.
	CertStatusTimeout *string `pulumi:"certStatusTimeout"`
	// The CrlReceiveTimeout param.
	CrlReceiveTimeout *string `pulumi:"crlReceiveTimeout"`
	// The Device param.
	Device *string `pulumi:"device"`
	// The Domain param.
	Domain *string `pulumi:"domain"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
	Name *string `pulumi:"name"`
	// The OcspReceiveTimeout param.
	OcspReceiveTimeout *string `pulumi:"ocspReceiveTimeout"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
	// The UseCrl param.
	UseCrl *bool `pulumi:"useCrl"`
	// The UseOcsp param.
	UseOcsp *bool `pulumi:"useOcsp"`
	// The UsernameField param.
	UsernameField *CertificateProfileUsernameField `pulumi:"usernameField"`
}

// The set of arguments for constructing a CertificateProfile resource.
type CertificateProfileArgs struct {
	// The BlockExpiredCert param.
	BlockExpiredCert pulumi.BoolPtrInput
	// The BlockTimeoutCert param.
	BlockTimeoutCert pulumi.BoolPtrInput
	// The BlockUnauthenticatedCert param.
	BlockUnauthenticatedCert pulumi.BoolPtrInput
	// The BlockUnknownCert param.
	BlockUnknownCert pulumi.BoolPtrInput
	// The CaCertificates param.
	CaCertificates CertificateProfileCaCertificateArrayInput
	// The CertStatusTimeout param.
	CertStatusTimeout pulumi.StringPtrInput
	// The CrlReceiveTimeout param.
	CrlReceiveTimeout pulumi.StringPtrInput
	// The Device param.
	Device pulumi.StringPtrInput
	// The Domain param.
	Domain pulumi.StringPtrInput
	// The Folder param.
	Folder pulumi.StringPtrInput
	// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
	Name pulumi.StringPtrInput
	// The OcspReceiveTimeout param.
	OcspReceiveTimeout pulumi.StringPtrInput
	// The Snippet param.
	Snippet pulumi.StringPtrInput
	// The UseCrl param.
	UseCrl pulumi.BoolPtrInput
	// The UseOcsp param.
	UseOcsp pulumi.BoolPtrInput
	// The UsernameField param.
	UsernameField CertificateProfileUsernameFieldPtrInput
}

func (CertificateProfileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*certificateProfileArgs)(nil)).Elem()
}

type CertificateProfileInput interface {
	pulumi.Input

	ToCertificateProfileOutput() CertificateProfileOutput
	ToCertificateProfileOutputWithContext(ctx context.Context) CertificateProfileOutput
}

func (*CertificateProfile) ElementType() reflect.Type {
	return reflect.TypeOf((**CertificateProfile)(nil)).Elem()
}

func (i *CertificateProfile) ToCertificateProfileOutput() CertificateProfileOutput {
	return i.ToCertificateProfileOutputWithContext(context.Background())
}

func (i *CertificateProfile) ToCertificateProfileOutputWithContext(ctx context.Context) CertificateProfileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateProfileOutput)
}

// CertificateProfileArrayInput is an input type that accepts CertificateProfileArray and CertificateProfileArrayOutput values.
// You can construct a concrete instance of `CertificateProfileArrayInput` via:
//
//	CertificateProfileArray{ CertificateProfileArgs{...} }
type CertificateProfileArrayInput interface {
	pulumi.Input

	ToCertificateProfileArrayOutput() CertificateProfileArrayOutput
	ToCertificateProfileArrayOutputWithContext(context.Context) CertificateProfileArrayOutput
}

type CertificateProfileArray []CertificateProfileInput

func (CertificateProfileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CertificateProfile)(nil)).Elem()
}

func (i CertificateProfileArray) ToCertificateProfileArrayOutput() CertificateProfileArrayOutput {
	return i.ToCertificateProfileArrayOutputWithContext(context.Background())
}

func (i CertificateProfileArray) ToCertificateProfileArrayOutputWithContext(ctx context.Context) CertificateProfileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateProfileArrayOutput)
}

// CertificateProfileMapInput is an input type that accepts CertificateProfileMap and CertificateProfileMapOutput values.
// You can construct a concrete instance of `CertificateProfileMapInput` via:
//
//	CertificateProfileMap{ "key": CertificateProfileArgs{...} }
type CertificateProfileMapInput interface {
	pulumi.Input

	ToCertificateProfileMapOutput() CertificateProfileMapOutput
	ToCertificateProfileMapOutputWithContext(context.Context) CertificateProfileMapOutput
}

type CertificateProfileMap map[string]CertificateProfileInput

func (CertificateProfileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CertificateProfile)(nil)).Elem()
}

func (i CertificateProfileMap) ToCertificateProfileMapOutput() CertificateProfileMapOutput {
	return i.ToCertificateProfileMapOutputWithContext(context.Background())
}

func (i CertificateProfileMap) ToCertificateProfileMapOutputWithContext(ctx context.Context) CertificateProfileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertificateProfileMapOutput)
}

type CertificateProfileOutput struct{ *pulumi.OutputState }

func (CertificateProfileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CertificateProfile)(nil)).Elem()
}

func (o CertificateProfileOutput) ToCertificateProfileOutput() CertificateProfileOutput {
	return o
}

func (o CertificateProfileOutput) ToCertificateProfileOutputWithContext(ctx context.Context) CertificateProfileOutput {
	return o
}

// The BlockExpiredCert param.
func (o CertificateProfileOutput) BlockExpiredCert() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CertificateProfile) pulumi.BoolPtrOutput { return v.BlockExpiredCert }).(pulumi.BoolPtrOutput)
}

// The BlockTimeoutCert param.
func (o CertificateProfileOutput) BlockTimeoutCert() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CertificateProfile) pulumi.BoolPtrOutput { return v.BlockTimeoutCert }).(pulumi.BoolPtrOutput)
}

// The BlockUnauthenticatedCert param.
func (o CertificateProfileOutput) BlockUnauthenticatedCert() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CertificateProfile) pulumi.BoolPtrOutput { return v.BlockUnauthenticatedCert }).(pulumi.BoolPtrOutput)
}

// The BlockUnknownCert param.
func (o CertificateProfileOutput) BlockUnknownCert() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CertificateProfile) pulumi.BoolPtrOutput { return v.BlockUnknownCert }).(pulumi.BoolPtrOutput)
}

// The CaCertificates param.
func (o CertificateProfileOutput) CaCertificates() CertificateProfileCaCertificateArrayOutput {
	return o.ApplyT(func(v *CertificateProfile) CertificateProfileCaCertificateArrayOutput { return v.CaCertificates }).(CertificateProfileCaCertificateArrayOutput)
}

// The CertStatusTimeout param.
func (o CertificateProfileOutput) CertStatusTimeout() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CertificateProfile) pulumi.StringPtrOutput { return v.CertStatusTimeout }).(pulumi.StringPtrOutput)
}

// The CrlReceiveTimeout param.
func (o CertificateProfileOutput) CrlReceiveTimeout() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CertificateProfile) pulumi.StringPtrOutput { return v.CrlReceiveTimeout }).(pulumi.StringPtrOutput)
}

// The Device param.
func (o CertificateProfileOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CertificateProfile) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// The Domain param.
func (o CertificateProfileOutput) Domain() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CertificateProfile) pulumi.StringPtrOutput { return v.Domain }).(pulumi.StringPtrOutput)
}

// The Folder param.
func (o CertificateProfileOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CertificateProfile) pulumi.StringPtrOutput { return v.Folder }).(pulumi.StringPtrOutput)
}

// Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
func (o CertificateProfileOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CertificateProfile) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The OcspReceiveTimeout param.
func (o CertificateProfileOutput) OcspReceiveTimeout() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CertificateProfile) pulumi.StringPtrOutput { return v.OcspReceiveTimeout }).(pulumi.StringPtrOutput)
}

// The Snippet param.
func (o CertificateProfileOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CertificateProfile) pulumi.StringPtrOutput { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o CertificateProfileOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v *CertificateProfile) pulumi.StringOutput { return v.Tfid }).(pulumi.StringOutput)
}

// The UseCrl param.
func (o CertificateProfileOutput) UseCrl() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CertificateProfile) pulumi.BoolPtrOutput { return v.UseCrl }).(pulumi.BoolPtrOutput)
}

// The UseOcsp param.
func (o CertificateProfileOutput) UseOcsp() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *CertificateProfile) pulumi.BoolPtrOutput { return v.UseOcsp }).(pulumi.BoolPtrOutput)
}

// The UsernameField param.
func (o CertificateProfileOutput) UsernameField() CertificateProfileUsernameFieldPtrOutput {
	return o.ApplyT(func(v *CertificateProfile) CertificateProfileUsernameFieldPtrOutput { return v.UsernameField }).(CertificateProfileUsernameFieldPtrOutput)
}

type CertificateProfileArrayOutput struct{ *pulumi.OutputState }

func (CertificateProfileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CertificateProfile)(nil)).Elem()
}

func (o CertificateProfileArrayOutput) ToCertificateProfileArrayOutput() CertificateProfileArrayOutput {
	return o
}

func (o CertificateProfileArrayOutput) ToCertificateProfileArrayOutputWithContext(ctx context.Context) CertificateProfileArrayOutput {
	return o
}

func (o CertificateProfileArrayOutput) Index(i pulumi.IntInput) CertificateProfileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CertificateProfile {
		return vs[0].([]*CertificateProfile)[vs[1].(int)]
	}).(CertificateProfileOutput)
}

type CertificateProfileMapOutput struct{ *pulumi.OutputState }

func (CertificateProfileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CertificateProfile)(nil)).Elem()
}

func (o CertificateProfileMapOutput) ToCertificateProfileMapOutput() CertificateProfileMapOutput {
	return o
}

func (o CertificateProfileMapOutput) ToCertificateProfileMapOutputWithContext(ctx context.Context) CertificateProfileMapOutput {
	return o
}

func (o CertificateProfileMapOutput) MapIndex(k pulumi.StringInput) CertificateProfileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CertificateProfile {
		return vs[0].(map[string]*CertificateProfile)[vs[1].(string)]
	}).(CertificateProfileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CertificateProfileInput)(nil)).Elem(), &CertificateProfile{})
	pulumi.RegisterInputType(reflect.TypeOf((*CertificateProfileArrayInput)(nil)).Elem(), CertificateProfileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CertificateProfileMapInput)(nil)).Elem(), CertificateProfileMap{})
	pulumi.RegisterOutputType(CertificateProfileOutput{})
	pulumi.RegisterOutputType(CertificateProfileArrayOutput{})
	pulumi.RegisterOutputType(CertificateProfileMapOutput{})
}
