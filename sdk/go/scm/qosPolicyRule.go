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
//			_, err := scm.NewQosPolicyRule(ctx, "example", nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type QosPolicyRule struct {
	pulumi.CustomResourceState

	// The Action param.
	Action QosPolicyRuleActionOutput `pulumi:"action"`
	// The Description param.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The Device param.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// The DscpTos param.
	DscpTos QosPolicyRuleDscpTosPtrOutput `pulumi:"dscpTos"`
	// The Folder param.
	Folder pulumi.StringPtrOutput `pulumi:"folder"`
	// The Name param.
	Name pulumi.StringOutput `pulumi:"name"`
	// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
	Position pulumi.StringOutput `pulumi:"position"`
	// The Schedule param.
	Schedule pulumi.StringPtrOutput `pulumi:"schedule"`
	// The Snippet param.
	Snippet pulumi.StringPtrOutput `pulumi:"snippet"`
	Tfid    pulumi.StringOutput    `pulumi:"tfid"`
}

// NewQosPolicyRule registers a new resource with the given unique name, arguments, and options.
func NewQosPolicyRule(ctx *pulumi.Context,
	name string, args *QosPolicyRuleArgs, opts ...pulumi.ResourceOption) (*QosPolicyRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Action == nil {
		return nil, errors.New("invalid value for required argument 'Action'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource QosPolicyRule
	err := ctx.RegisterResource("scm:index/qosPolicyRule:QosPolicyRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetQosPolicyRule gets an existing QosPolicyRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetQosPolicyRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *QosPolicyRuleState, opts ...pulumi.ResourceOption) (*QosPolicyRule, error) {
	var resource QosPolicyRule
	err := ctx.ReadResource("scm:index/qosPolicyRule:QosPolicyRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering QosPolicyRule resources.
type qosPolicyRuleState struct {
	// The Action param.
	Action *QosPolicyRuleAction `pulumi:"action"`
	// The Description param.
	Description *string `pulumi:"description"`
	// The Device param.
	Device *string `pulumi:"device"`
	// The DscpTos param.
	DscpTos *QosPolicyRuleDscpTos `pulumi:"dscpTos"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The Name param.
	Name *string `pulumi:"name"`
	// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
	Position *string `pulumi:"position"`
	// The Schedule param.
	Schedule *string `pulumi:"schedule"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
	Tfid    *string `pulumi:"tfid"`
}

type QosPolicyRuleState struct {
	// The Action param.
	Action QosPolicyRuleActionPtrInput
	// The Description param.
	Description pulumi.StringPtrInput
	// The Device param.
	Device pulumi.StringPtrInput
	// The DscpTos param.
	DscpTos QosPolicyRuleDscpTosPtrInput
	// The Folder param.
	Folder pulumi.StringPtrInput
	// The Name param.
	Name pulumi.StringPtrInput
	// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
	Position pulumi.StringPtrInput
	// The Schedule param.
	Schedule pulumi.StringPtrInput
	// The Snippet param.
	Snippet pulumi.StringPtrInput
	Tfid    pulumi.StringPtrInput
}

func (QosPolicyRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*qosPolicyRuleState)(nil)).Elem()
}

type qosPolicyRuleArgs struct {
	// The Action param.
	Action QosPolicyRuleAction `pulumi:"action"`
	// The Description param.
	Description *string `pulumi:"description"`
	// The Device param.
	Device *string `pulumi:"device"`
	// The DscpTos param.
	DscpTos *QosPolicyRuleDscpTos `pulumi:"dscpTos"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The Name param.
	Name *string `pulumi:"name"`
	// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
	Position *string `pulumi:"position"`
	// The Schedule param.
	Schedule *string `pulumi:"schedule"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
}

// The set of arguments for constructing a QosPolicyRule resource.
type QosPolicyRuleArgs struct {
	// The Action param.
	Action QosPolicyRuleActionInput
	// The Description param.
	Description pulumi.StringPtrInput
	// The Device param.
	Device pulumi.StringPtrInput
	// The DscpTos param.
	DscpTos QosPolicyRuleDscpTosPtrInput
	// The Folder param.
	Folder pulumi.StringPtrInput
	// The Name param.
	Name pulumi.StringPtrInput
	// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
	Position pulumi.StringPtrInput
	// The Schedule param.
	Schedule pulumi.StringPtrInput
	// The Snippet param.
	Snippet pulumi.StringPtrInput
}

func (QosPolicyRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*qosPolicyRuleArgs)(nil)).Elem()
}

type QosPolicyRuleInput interface {
	pulumi.Input

	ToQosPolicyRuleOutput() QosPolicyRuleOutput
	ToQosPolicyRuleOutputWithContext(ctx context.Context) QosPolicyRuleOutput
}

func (*QosPolicyRule) ElementType() reflect.Type {
	return reflect.TypeOf((**QosPolicyRule)(nil)).Elem()
}

func (i *QosPolicyRule) ToQosPolicyRuleOutput() QosPolicyRuleOutput {
	return i.ToQosPolicyRuleOutputWithContext(context.Background())
}

func (i *QosPolicyRule) ToQosPolicyRuleOutputWithContext(ctx context.Context) QosPolicyRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(QosPolicyRuleOutput)
}

// QosPolicyRuleArrayInput is an input type that accepts QosPolicyRuleArray and QosPolicyRuleArrayOutput values.
// You can construct a concrete instance of `QosPolicyRuleArrayInput` via:
//
//	QosPolicyRuleArray{ QosPolicyRuleArgs{...} }
type QosPolicyRuleArrayInput interface {
	pulumi.Input

	ToQosPolicyRuleArrayOutput() QosPolicyRuleArrayOutput
	ToQosPolicyRuleArrayOutputWithContext(context.Context) QosPolicyRuleArrayOutput
}

type QosPolicyRuleArray []QosPolicyRuleInput

func (QosPolicyRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*QosPolicyRule)(nil)).Elem()
}

func (i QosPolicyRuleArray) ToQosPolicyRuleArrayOutput() QosPolicyRuleArrayOutput {
	return i.ToQosPolicyRuleArrayOutputWithContext(context.Background())
}

func (i QosPolicyRuleArray) ToQosPolicyRuleArrayOutputWithContext(ctx context.Context) QosPolicyRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(QosPolicyRuleArrayOutput)
}

// QosPolicyRuleMapInput is an input type that accepts QosPolicyRuleMap and QosPolicyRuleMapOutput values.
// You can construct a concrete instance of `QosPolicyRuleMapInput` via:
//
//	QosPolicyRuleMap{ "key": QosPolicyRuleArgs{...} }
type QosPolicyRuleMapInput interface {
	pulumi.Input

	ToQosPolicyRuleMapOutput() QosPolicyRuleMapOutput
	ToQosPolicyRuleMapOutputWithContext(context.Context) QosPolicyRuleMapOutput
}

type QosPolicyRuleMap map[string]QosPolicyRuleInput

func (QosPolicyRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*QosPolicyRule)(nil)).Elem()
}

func (i QosPolicyRuleMap) ToQosPolicyRuleMapOutput() QosPolicyRuleMapOutput {
	return i.ToQosPolicyRuleMapOutputWithContext(context.Background())
}

func (i QosPolicyRuleMap) ToQosPolicyRuleMapOutputWithContext(ctx context.Context) QosPolicyRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(QosPolicyRuleMapOutput)
}

type QosPolicyRuleOutput struct{ *pulumi.OutputState }

func (QosPolicyRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**QosPolicyRule)(nil)).Elem()
}

func (o QosPolicyRuleOutput) ToQosPolicyRuleOutput() QosPolicyRuleOutput {
	return o
}

func (o QosPolicyRuleOutput) ToQosPolicyRuleOutputWithContext(ctx context.Context) QosPolicyRuleOutput {
	return o
}

// The Action param.
func (o QosPolicyRuleOutput) Action() QosPolicyRuleActionOutput {
	return o.ApplyT(func(v *QosPolicyRule) QosPolicyRuleActionOutput { return v.Action }).(QosPolicyRuleActionOutput)
}

// The Description param.
func (o QosPolicyRuleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *QosPolicyRule) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The Device param.
func (o QosPolicyRuleOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *QosPolicyRule) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// The DscpTos param.
func (o QosPolicyRuleOutput) DscpTos() QosPolicyRuleDscpTosPtrOutput {
	return o.ApplyT(func(v *QosPolicyRule) QosPolicyRuleDscpTosPtrOutput { return v.DscpTos }).(QosPolicyRuleDscpTosPtrOutput)
}

// The Folder param.
func (o QosPolicyRuleOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *QosPolicyRule) pulumi.StringPtrOutput { return v.Folder }).(pulumi.StringPtrOutput)
}

// The Name param.
func (o QosPolicyRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *QosPolicyRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
func (o QosPolicyRuleOutput) Position() pulumi.StringOutput {
	return o.ApplyT(func(v *QosPolicyRule) pulumi.StringOutput { return v.Position }).(pulumi.StringOutput)
}

// The Schedule param.
func (o QosPolicyRuleOutput) Schedule() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *QosPolicyRule) pulumi.StringPtrOutput { return v.Schedule }).(pulumi.StringPtrOutput)
}

// The Snippet param.
func (o QosPolicyRuleOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *QosPolicyRule) pulumi.StringPtrOutput { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o QosPolicyRuleOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v *QosPolicyRule) pulumi.StringOutput { return v.Tfid }).(pulumi.StringOutput)
}

type QosPolicyRuleArrayOutput struct{ *pulumi.OutputState }

func (QosPolicyRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*QosPolicyRule)(nil)).Elem()
}

func (o QosPolicyRuleArrayOutput) ToQosPolicyRuleArrayOutput() QosPolicyRuleArrayOutput {
	return o
}

func (o QosPolicyRuleArrayOutput) ToQosPolicyRuleArrayOutputWithContext(ctx context.Context) QosPolicyRuleArrayOutput {
	return o
}

func (o QosPolicyRuleArrayOutput) Index(i pulumi.IntInput) QosPolicyRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *QosPolicyRule {
		return vs[0].([]*QosPolicyRule)[vs[1].(int)]
	}).(QosPolicyRuleOutput)
}

type QosPolicyRuleMapOutput struct{ *pulumi.OutputState }

func (QosPolicyRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*QosPolicyRule)(nil)).Elem()
}

func (o QosPolicyRuleMapOutput) ToQosPolicyRuleMapOutput() QosPolicyRuleMapOutput {
	return o
}

func (o QosPolicyRuleMapOutput) ToQosPolicyRuleMapOutputWithContext(ctx context.Context) QosPolicyRuleMapOutput {
	return o
}

func (o QosPolicyRuleMapOutput) MapIndex(k pulumi.StringInput) QosPolicyRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *QosPolicyRule {
		return vs[0].(map[string]*QosPolicyRule)[vs[1].(string)]
	}).(QosPolicyRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*QosPolicyRuleInput)(nil)).Elem(), &QosPolicyRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*QosPolicyRuleArrayInput)(nil)).Elem(), QosPolicyRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*QosPolicyRuleMapInput)(nil)).Elem(), QosPolicyRuleMap{})
	pulumi.RegisterOutputType(QosPolicyRuleOutput{})
	pulumi.RegisterOutputType(QosPolicyRuleArrayOutput{})
	pulumi.RegisterOutputType(QosPolicyRuleMapOutput{})
}
