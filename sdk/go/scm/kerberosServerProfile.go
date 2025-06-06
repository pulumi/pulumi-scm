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
//			_, err := scm.NewKerberosServerProfile(ctx, "example", nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type KerberosServerProfile struct {
	pulumi.CustomResourceState

	// The Device param.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// The Folder param.
	Folder pulumi.StringPtrOutput `pulumi:"folder"`
	// The Servers param.
	Servers KerberosServerProfileServerArrayOutput `pulumi:"servers"`
	// The Snippet param.
	Snippet pulumi.StringPtrOutput `pulumi:"snippet"`
	Tfid    pulumi.StringOutput    `pulumi:"tfid"`
}

// NewKerberosServerProfile registers a new resource with the given unique name, arguments, and options.
func NewKerberosServerProfile(ctx *pulumi.Context,
	name string, args *KerberosServerProfileArgs, opts ...pulumi.ResourceOption) (*KerberosServerProfile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Servers == nil {
		return nil, errors.New("invalid value for required argument 'Servers'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource KerberosServerProfile
	err := ctx.RegisterResource("scm:index/kerberosServerProfile:KerberosServerProfile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKerberosServerProfile gets an existing KerberosServerProfile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKerberosServerProfile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KerberosServerProfileState, opts ...pulumi.ResourceOption) (*KerberosServerProfile, error) {
	var resource KerberosServerProfile
	err := ctx.ReadResource("scm:index/kerberosServerProfile:KerberosServerProfile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KerberosServerProfile resources.
type kerberosServerProfileState struct {
	// The Device param.
	Device *string `pulumi:"device"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The Servers param.
	Servers []KerberosServerProfileServer `pulumi:"servers"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
	Tfid    *string `pulumi:"tfid"`
}

type KerberosServerProfileState struct {
	// The Device param.
	Device pulumi.StringPtrInput
	// The Folder param.
	Folder pulumi.StringPtrInput
	// The Servers param.
	Servers KerberosServerProfileServerArrayInput
	// The Snippet param.
	Snippet pulumi.StringPtrInput
	Tfid    pulumi.StringPtrInput
}

func (KerberosServerProfileState) ElementType() reflect.Type {
	return reflect.TypeOf((*kerberosServerProfileState)(nil)).Elem()
}

type kerberosServerProfileArgs struct {
	// The Device param.
	Device *string `pulumi:"device"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The Servers param.
	Servers []KerberosServerProfileServer `pulumi:"servers"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
}

// The set of arguments for constructing a KerberosServerProfile resource.
type KerberosServerProfileArgs struct {
	// The Device param.
	Device pulumi.StringPtrInput
	// The Folder param.
	Folder pulumi.StringPtrInput
	// The Servers param.
	Servers KerberosServerProfileServerArrayInput
	// The Snippet param.
	Snippet pulumi.StringPtrInput
}

func (KerberosServerProfileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kerberosServerProfileArgs)(nil)).Elem()
}

type KerberosServerProfileInput interface {
	pulumi.Input

	ToKerberosServerProfileOutput() KerberosServerProfileOutput
	ToKerberosServerProfileOutputWithContext(ctx context.Context) KerberosServerProfileOutput
}

func (*KerberosServerProfile) ElementType() reflect.Type {
	return reflect.TypeOf((**KerberosServerProfile)(nil)).Elem()
}

func (i *KerberosServerProfile) ToKerberosServerProfileOutput() KerberosServerProfileOutput {
	return i.ToKerberosServerProfileOutputWithContext(context.Background())
}

func (i *KerberosServerProfile) ToKerberosServerProfileOutputWithContext(ctx context.Context) KerberosServerProfileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KerberosServerProfileOutput)
}

// KerberosServerProfileArrayInput is an input type that accepts KerberosServerProfileArray and KerberosServerProfileArrayOutput values.
// You can construct a concrete instance of `KerberosServerProfileArrayInput` via:
//
//	KerberosServerProfileArray{ KerberosServerProfileArgs{...} }
type KerberosServerProfileArrayInput interface {
	pulumi.Input

	ToKerberosServerProfileArrayOutput() KerberosServerProfileArrayOutput
	ToKerberosServerProfileArrayOutputWithContext(context.Context) KerberosServerProfileArrayOutput
}

type KerberosServerProfileArray []KerberosServerProfileInput

func (KerberosServerProfileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KerberosServerProfile)(nil)).Elem()
}

func (i KerberosServerProfileArray) ToKerberosServerProfileArrayOutput() KerberosServerProfileArrayOutput {
	return i.ToKerberosServerProfileArrayOutputWithContext(context.Background())
}

func (i KerberosServerProfileArray) ToKerberosServerProfileArrayOutputWithContext(ctx context.Context) KerberosServerProfileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KerberosServerProfileArrayOutput)
}

// KerberosServerProfileMapInput is an input type that accepts KerberosServerProfileMap and KerberosServerProfileMapOutput values.
// You can construct a concrete instance of `KerberosServerProfileMapInput` via:
//
//	KerberosServerProfileMap{ "key": KerberosServerProfileArgs{...} }
type KerberosServerProfileMapInput interface {
	pulumi.Input

	ToKerberosServerProfileMapOutput() KerberosServerProfileMapOutput
	ToKerberosServerProfileMapOutputWithContext(context.Context) KerberosServerProfileMapOutput
}

type KerberosServerProfileMap map[string]KerberosServerProfileInput

func (KerberosServerProfileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KerberosServerProfile)(nil)).Elem()
}

func (i KerberosServerProfileMap) ToKerberosServerProfileMapOutput() KerberosServerProfileMapOutput {
	return i.ToKerberosServerProfileMapOutputWithContext(context.Background())
}

func (i KerberosServerProfileMap) ToKerberosServerProfileMapOutputWithContext(ctx context.Context) KerberosServerProfileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KerberosServerProfileMapOutput)
}

type KerberosServerProfileOutput struct{ *pulumi.OutputState }

func (KerberosServerProfileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**KerberosServerProfile)(nil)).Elem()
}

func (o KerberosServerProfileOutput) ToKerberosServerProfileOutput() KerberosServerProfileOutput {
	return o
}

func (o KerberosServerProfileOutput) ToKerberosServerProfileOutputWithContext(ctx context.Context) KerberosServerProfileOutput {
	return o
}

// The Device param.
func (o KerberosServerProfileOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KerberosServerProfile) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// The Folder param.
func (o KerberosServerProfileOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KerberosServerProfile) pulumi.StringPtrOutput { return v.Folder }).(pulumi.StringPtrOutput)
}

// The Servers param.
func (o KerberosServerProfileOutput) Servers() KerberosServerProfileServerArrayOutput {
	return o.ApplyT(func(v *KerberosServerProfile) KerberosServerProfileServerArrayOutput { return v.Servers }).(KerberosServerProfileServerArrayOutput)
}

// The Snippet param.
func (o KerberosServerProfileOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KerberosServerProfile) pulumi.StringPtrOutput { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o KerberosServerProfileOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v *KerberosServerProfile) pulumi.StringOutput { return v.Tfid }).(pulumi.StringOutput)
}

type KerberosServerProfileArrayOutput struct{ *pulumi.OutputState }

func (KerberosServerProfileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KerberosServerProfile)(nil)).Elem()
}

func (o KerberosServerProfileArrayOutput) ToKerberosServerProfileArrayOutput() KerberosServerProfileArrayOutput {
	return o
}

func (o KerberosServerProfileArrayOutput) ToKerberosServerProfileArrayOutputWithContext(ctx context.Context) KerberosServerProfileArrayOutput {
	return o
}

func (o KerberosServerProfileArrayOutput) Index(i pulumi.IntInput) KerberosServerProfileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *KerberosServerProfile {
		return vs[0].([]*KerberosServerProfile)[vs[1].(int)]
	}).(KerberosServerProfileOutput)
}

type KerberosServerProfileMapOutput struct{ *pulumi.OutputState }

func (KerberosServerProfileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KerberosServerProfile)(nil)).Elem()
}

func (o KerberosServerProfileMapOutput) ToKerberosServerProfileMapOutput() KerberosServerProfileMapOutput {
	return o
}

func (o KerberosServerProfileMapOutput) ToKerberosServerProfileMapOutputWithContext(ctx context.Context) KerberosServerProfileMapOutput {
	return o
}

func (o KerberosServerProfileMapOutput) MapIndex(k pulumi.StringInput) KerberosServerProfileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *KerberosServerProfile {
		return vs[0].(map[string]*KerberosServerProfile)[vs[1].(string)]
	}).(KerberosServerProfileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*KerberosServerProfileInput)(nil)).Elem(), &KerberosServerProfile{})
	pulumi.RegisterInputType(reflect.TypeOf((*KerberosServerProfileArrayInput)(nil)).Elem(), KerberosServerProfileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*KerberosServerProfileMapInput)(nil)).Elem(), KerberosServerProfileMap{})
	pulumi.RegisterOutputType(KerberosServerProfileOutput{})
	pulumi.RegisterOutputType(KerberosServerProfileArrayOutput{})
	pulumi.RegisterOutputType(KerberosServerProfileMapOutput{})
}
