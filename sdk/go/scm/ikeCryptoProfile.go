// Code generated by pulumi-language-go DO NOT EDIT.
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
//			_, err := scm.NewIkeCryptoProfile(ctx, "example", nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type IkeCryptoProfile struct {
	pulumi.CustomResourceState

	// IKEv2 SA reauthentication interval equals authetication-multiple * rekey-lifetime; 0 means reauthentication disabled. Value must be less than or equal to 50. Default: `0`.
	AuthenticationMultiple pulumi.IntOutput `pulumi:"authenticationMultiple"`
	// The Device param.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// The DhGroups param. Individual elements in this list are subject to additional validation. String must be one of these: `"group1"`, `"group2"`, `"group5"`, `"group14"`, `"group19"`, `"group20"`.
	DhGroups pulumi.StringArrayOutput `pulumi:"dhGroups"`
	// Encryption algorithm. Individual elements in this list are subject to additional validation. String must be one of these: `"des"`, `"3des"`, `"aes-128-cbc"`, `"aes-192-cbc"`, `"aes-256-cbc"`, `"aes-128-gcm"`, `"aes-256-gcm"`.
	Encryptions pulumi.StringArrayOutput `pulumi:"encryptions"`
	// The Folder param.
	Folder pulumi.StringPtrOutput `pulumi:"folder"`
	// The Hashes param. Individual elements in this list are subject to additional validation. String must be one of these: `"md5"`, `"sha1"`, `"sha256"`, `"sha384"`, `"sha512"`.
	Hashes pulumi.StringArrayOutput `pulumi:"hashes"`
	// The Lifetime param.
	Lifetime IkeCryptoProfileLifetimePtrOutput `pulumi:"lifetime"`
	// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
	Name pulumi.StringOutput `pulumi:"name"`
	// The Snippet param.
	Snippet pulumi.StringPtrOutput `pulumi:"snippet"`
	Tfid    pulumi.StringOutput    `pulumi:"tfid"`
}

// NewIkeCryptoProfile registers a new resource with the given unique name, arguments, and options.
func NewIkeCryptoProfile(ctx *pulumi.Context,
	name string, args *IkeCryptoProfileArgs, opts ...pulumi.ResourceOption) (*IkeCryptoProfile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DhGroups == nil {
		return nil, errors.New("invalid value for required argument 'DhGroups'")
	}
	if args.Encryptions == nil {
		return nil, errors.New("invalid value for required argument 'Encryptions'")
	}
	if args.Hashes == nil {
		return nil, errors.New("invalid value for required argument 'Hashes'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IkeCryptoProfile
	err := ctx.RegisterResource("scm:index/ikeCryptoProfile:IkeCryptoProfile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIkeCryptoProfile gets an existing IkeCryptoProfile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIkeCryptoProfile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IkeCryptoProfileState, opts ...pulumi.ResourceOption) (*IkeCryptoProfile, error) {
	var resource IkeCryptoProfile
	err := ctx.ReadResource("scm:index/ikeCryptoProfile:IkeCryptoProfile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IkeCryptoProfile resources.
type ikeCryptoProfileState struct {
	// IKEv2 SA reauthentication interval equals authetication-multiple * rekey-lifetime; 0 means reauthentication disabled. Value must be less than or equal to 50. Default: `0`.
	AuthenticationMultiple *int `pulumi:"authenticationMultiple"`
	// The Device param.
	Device *string `pulumi:"device"`
	// The DhGroups param. Individual elements in this list are subject to additional validation. String must be one of these: `"group1"`, `"group2"`, `"group5"`, `"group14"`, `"group19"`, `"group20"`.
	DhGroups []string `pulumi:"dhGroups"`
	// Encryption algorithm. Individual elements in this list are subject to additional validation. String must be one of these: `"des"`, `"3des"`, `"aes-128-cbc"`, `"aes-192-cbc"`, `"aes-256-cbc"`, `"aes-128-gcm"`, `"aes-256-gcm"`.
	Encryptions []string `pulumi:"encryptions"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The Hashes param. Individual elements in this list are subject to additional validation. String must be one of these: `"md5"`, `"sha1"`, `"sha256"`, `"sha384"`, `"sha512"`.
	Hashes []string `pulumi:"hashes"`
	// The Lifetime param.
	Lifetime *IkeCryptoProfileLifetime `pulumi:"lifetime"`
	// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
	Name *string `pulumi:"name"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
	Tfid    *string `pulumi:"tfid"`
}

type IkeCryptoProfileState struct {
	// IKEv2 SA reauthentication interval equals authetication-multiple * rekey-lifetime; 0 means reauthentication disabled. Value must be less than or equal to 50. Default: `0`.
	AuthenticationMultiple pulumi.IntPtrInput
	// The Device param.
	Device pulumi.StringPtrInput
	// The DhGroups param. Individual elements in this list are subject to additional validation. String must be one of these: `"group1"`, `"group2"`, `"group5"`, `"group14"`, `"group19"`, `"group20"`.
	DhGroups pulumi.StringArrayInput
	// Encryption algorithm. Individual elements in this list are subject to additional validation. String must be one of these: `"des"`, `"3des"`, `"aes-128-cbc"`, `"aes-192-cbc"`, `"aes-256-cbc"`, `"aes-128-gcm"`, `"aes-256-gcm"`.
	Encryptions pulumi.StringArrayInput
	// The Folder param.
	Folder pulumi.StringPtrInput
	// The Hashes param. Individual elements in this list are subject to additional validation. String must be one of these: `"md5"`, `"sha1"`, `"sha256"`, `"sha384"`, `"sha512"`.
	Hashes pulumi.StringArrayInput
	// The Lifetime param.
	Lifetime IkeCryptoProfileLifetimePtrInput
	// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
	Name pulumi.StringPtrInput
	// The Snippet param.
	Snippet pulumi.StringPtrInput
	Tfid    pulumi.StringPtrInput
}

func (IkeCryptoProfileState) ElementType() reflect.Type {
	return reflect.TypeOf((*ikeCryptoProfileState)(nil)).Elem()
}

type ikeCryptoProfileArgs struct {
	// IKEv2 SA reauthentication interval equals authetication-multiple * rekey-lifetime; 0 means reauthentication disabled. Value must be less than or equal to 50. Default: `0`.
	AuthenticationMultiple *int `pulumi:"authenticationMultiple"`
	// The Device param.
	Device *string `pulumi:"device"`
	// The DhGroups param. Individual elements in this list are subject to additional validation. String must be one of these: `"group1"`, `"group2"`, `"group5"`, `"group14"`, `"group19"`, `"group20"`.
	DhGroups []string `pulumi:"dhGroups"`
	// Encryption algorithm. Individual elements in this list are subject to additional validation. String must be one of these: `"des"`, `"3des"`, `"aes-128-cbc"`, `"aes-192-cbc"`, `"aes-256-cbc"`, `"aes-128-gcm"`, `"aes-256-gcm"`.
	Encryptions []string `pulumi:"encryptions"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The Hashes param. Individual elements in this list are subject to additional validation. String must be one of these: `"md5"`, `"sha1"`, `"sha256"`, `"sha384"`, `"sha512"`.
	Hashes []string `pulumi:"hashes"`
	// The Lifetime param.
	Lifetime *IkeCryptoProfileLifetime `pulumi:"lifetime"`
	// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
	Name *string `pulumi:"name"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
}

// The set of arguments for constructing a IkeCryptoProfile resource.
type IkeCryptoProfileArgs struct {
	// IKEv2 SA reauthentication interval equals authetication-multiple * rekey-lifetime; 0 means reauthentication disabled. Value must be less than or equal to 50. Default: `0`.
	AuthenticationMultiple pulumi.IntPtrInput
	// The Device param.
	Device pulumi.StringPtrInput
	// The DhGroups param. Individual elements in this list are subject to additional validation. String must be one of these: `"group1"`, `"group2"`, `"group5"`, `"group14"`, `"group19"`, `"group20"`.
	DhGroups pulumi.StringArrayInput
	// Encryption algorithm. Individual elements in this list are subject to additional validation. String must be one of these: `"des"`, `"3des"`, `"aes-128-cbc"`, `"aes-192-cbc"`, `"aes-256-cbc"`, `"aes-128-gcm"`, `"aes-256-gcm"`.
	Encryptions pulumi.StringArrayInput
	// The Folder param.
	Folder pulumi.StringPtrInput
	// The Hashes param. Individual elements in this list are subject to additional validation. String must be one of these: `"md5"`, `"sha1"`, `"sha256"`, `"sha384"`, `"sha512"`.
	Hashes pulumi.StringArrayInput
	// The Lifetime param.
	Lifetime IkeCryptoProfileLifetimePtrInput
	// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
	Name pulumi.StringPtrInput
	// The Snippet param.
	Snippet pulumi.StringPtrInput
}

func (IkeCryptoProfileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ikeCryptoProfileArgs)(nil)).Elem()
}

type IkeCryptoProfileInput interface {
	pulumi.Input

	ToIkeCryptoProfileOutput() IkeCryptoProfileOutput
	ToIkeCryptoProfileOutputWithContext(ctx context.Context) IkeCryptoProfileOutput
}

func (*IkeCryptoProfile) ElementType() reflect.Type {
	return reflect.TypeOf((**IkeCryptoProfile)(nil)).Elem()
}

func (i *IkeCryptoProfile) ToIkeCryptoProfileOutput() IkeCryptoProfileOutput {
	return i.ToIkeCryptoProfileOutputWithContext(context.Background())
}

func (i *IkeCryptoProfile) ToIkeCryptoProfileOutputWithContext(ctx context.Context) IkeCryptoProfileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IkeCryptoProfileOutput)
}

// IkeCryptoProfileArrayInput is an input type that accepts IkeCryptoProfileArray and IkeCryptoProfileArrayOutput values.
// You can construct a concrete instance of `IkeCryptoProfileArrayInput` via:
//
//	IkeCryptoProfileArray{ IkeCryptoProfileArgs{...} }
type IkeCryptoProfileArrayInput interface {
	pulumi.Input

	ToIkeCryptoProfileArrayOutput() IkeCryptoProfileArrayOutput
	ToIkeCryptoProfileArrayOutputWithContext(context.Context) IkeCryptoProfileArrayOutput
}

type IkeCryptoProfileArray []IkeCryptoProfileInput

func (IkeCryptoProfileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IkeCryptoProfile)(nil)).Elem()
}

func (i IkeCryptoProfileArray) ToIkeCryptoProfileArrayOutput() IkeCryptoProfileArrayOutput {
	return i.ToIkeCryptoProfileArrayOutputWithContext(context.Background())
}

func (i IkeCryptoProfileArray) ToIkeCryptoProfileArrayOutputWithContext(ctx context.Context) IkeCryptoProfileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IkeCryptoProfileArrayOutput)
}

// IkeCryptoProfileMapInput is an input type that accepts IkeCryptoProfileMap and IkeCryptoProfileMapOutput values.
// You can construct a concrete instance of `IkeCryptoProfileMapInput` via:
//
//	IkeCryptoProfileMap{ "key": IkeCryptoProfileArgs{...} }
type IkeCryptoProfileMapInput interface {
	pulumi.Input

	ToIkeCryptoProfileMapOutput() IkeCryptoProfileMapOutput
	ToIkeCryptoProfileMapOutputWithContext(context.Context) IkeCryptoProfileMapOutput
}

type IkeCryptoProfileMap map[string]IkeCryptoProfileInput

func (IkeCryptoProfileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IkeCryptoProfile)(nil)).Elem()
}

func (i IkeCryptoProfileMap) ToIkeCryptoProfileMapOutput() IkeCryptoProfileMapOutput {
	return i.ToIkeCryptoProfileMapOutputWithContext(context.Background())
}

func (i IkeCryptoProfileMap) ToIkeCryptoProfileMapOutputWithContext(ctx context.Context) IkeCryptoProfileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IkeCryptoProfileMapOutput)
}

type IkeCryptoProfileOutput struct{ *pulumi.OutputState }

func (IkeCryptoProfileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IkeCryptoProfile)(nil)).Elem()
}

func (o IkeCryptoProfileOutput) ToIkeCryptoProfileOutput() IkeCryptoProfileOutput {
	return o
}

func (o IkeCryptoProfileOutput) ToIkeCryptoProfileOutputWithContext(ctx context.Context) IkeCryptoProfileOutput {
	return o
}

// IKEv2 SA reauthentication interval equals authetication-multiple * rekey-lifetime; 0 means reauthentication disabled. Value must be less than or equal to 50. Default: `0`.
func (o IkeCryptoProfileOutput) AuthenticationMultiple() pulumi.IntOutput {
	return o.ApplyT(func(v *IkeCryptoProfile) pulumi.IntOutput { return v.AuthenticationMultiple }).(pulumi.IntOutput)
}

// The Device param.
func (o IkeCryptoProfileOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IkeCryptoProfile) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// The DhGroups param. Individual elements in this list are subject to additional validation. String must be one of these: `"group1"`, `"group2"`, `"group5"`, `"group14"`, `"group19"`, `"group20"`.
func (o IkeCryptoProfileOutput) DhGroups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *IkeCryptoProfile) pulumi.StringArrayOutput { return v.DhGroups }).(pulumi.StringArrayOutput)
}

// Encryption algorithm. Individual elements in this list are subject to additional validation. String must be one of these: `"des"`, `"3des"`, `"aes-128-cbc"`, `"aes-192-cbc"`, `"aes-256-cbc"`, `"aes-128-gcm"`, `"aes-256-gcm"`.
func (o IkeCryptoProfileOutput) Encryptions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *IkeCryptoProfile) pulumi.StringArrayOutput { return v.Encryptions }).(pulumi.StringArrayOutput)
}

// The Folder param.
func (o IkeCryptoProfileOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IkeCryptoProfile) pulumi.StringPtrOutput { return v.Folder }).(pulumi.StringPtrOutput)
}

// The Hashes param. Individual elements in this list are subject to additional validation. String must be one of these: `"md5"`, `"sha1"`, `"sha256"`, `"sha384"`, `"sha512"`.
func (o IkeCryptoProfileOutput) Hashes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *IkeCryptoProfile) pulumi.StringArrayOutput { return v.Hashes }).(pulumi.StringArrayOutput)
}

// The Lifetime param.
func (o IkeCryptoProfileOutput) Lifetime() IkeCryptoProfileLifetimePtrOutput {
	return o.ApplyT(func(v *IkeCryptoProfile) IkeCryptoProfileLifetimePtrOutput { return v.Lifetime }).(IkeCryptoProfileLifetimePtrOutput)
}

// Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
func (o IkeCryptoProfileOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *IkeCryptoProfile) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The Snippet param.
func (o IkeCryptoProfileOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IkeCryptoProfile) pulumi.StringPtrOutput { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o IkeCryptoProfileOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v *IkeCryptoProfile) pulumi.StringOutput { return v.Tfid }).(pulumi.StringOutput)
}

type IkeCryptoProfileArrayOutput struct{ *pulumi.OutputState }

func (IkeCryptoProfileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IkeCryptoProfile)(nil)).Elem()
}

func (o IkeCryptoProfileArrayOutput) ToIkeCryptoProfileArrayOutput() IkeCryptoProfileArrayOutput {
	return o
}

func (o IkeCryptoProfileArrayOutput) ToIkeCryptoProfileArrayOutputWithContext(ctx context.Context) IkeCryptoProfileArrayOutput {
	return o
}

func (o IkeCryptoProfileArrayOutput) Index(i pulumi.IntInput) IkeCryptoProfileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IkeCryptoProfile {
		return vs[0].([]*IkeCryptoProfile)[vs[1].(int)]
	}).(IkeCryptoProfileOutput)
}

type IkeCryptoProfileMapOutput struct{ *pulumi.OutputState }

func (IkeCryptoProfileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IkeCryptoProfile)(nil)).Elem()
}

func (o IkeCryptoProfileMapOutput) ToIkeCryptoProfileMapOutput() IkeCryptoProfileMapOutput {
	return o
}

func (o IkeCryptoProfileMapOutput) ToIkeCryptoProfileMapOutputWithContext(ctx context.Context) IkeCryptoProfileMapOutput {
	return o
}

func (o IkeCryptoProfileMapOutput) MapIndex(k pulumi.StringInput) IkeCryptoProfileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IkeCryptoProfile {
		return vs[0].(map[string]*IkeCryptoProfile)[vs[1].(string)]
	}).(IkeCryptoProfileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IkeCryptoProfileInput)(nil)).Elem(), &IkeCryptoProfile{})
	pulumi.RegisterInputType(reflect.TypeOf((*IkeCryptoProfileArrayInput)(nil)).Elem(), IkeCryptoProfileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IkeCryptoProfileMapInput)(nil)).Elem(), IkeCryptoProfileMap{})
	pulumi.RegisterOutputType(IkeCryptoProfileOutput{})
	pulumi.RegisterOutputType(IkeCryptoProfileArrayOutput{})
	pulumi.RegisterOutputType(IkeCryptoProfileMapOutput{})
}
