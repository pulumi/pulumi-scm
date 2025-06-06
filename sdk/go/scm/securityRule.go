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
//			_, err := scm.NewSecurityRule(ctx, "example", nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type SecurityRule struct {
	pulumi.CustomResourceState

	// The action to be taken when the rule is matched. String must be one of these: `"allow"`, `"deny"`, `"drop"`, `"reset-client"`, `"reset-server"`, `"reset-both"`.
	Action pulumi.StringOutput `pulumi:"action"`
	// The application(s) being accessed.
	Applications pulumi.StringArrayOutput `pulumi:"applications"`
	// The URL categories being accessed.
	Categories pulumi.StringArrayOutput `pulumi:"categories"`
	// The description of the security rule.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The destination Host Integrity Profile(s).
	DestinationHips pulumi.StringArrayOutput `pulumi:"destinationHips"`
	// The destination address(es).
	Destinations pulumi.StringArrayOutput `pulumi:"destinations"`
	// The Device param.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// The state of the security rule. Default: `false`.
	Disabled pulumi.BoolOutput `pulumi:"disabled"`
	// The Folder param.
	Folder pulumi.StringPtrOutput `pulumi:"folder"`
	// The source security zone(s).
	Froms pulumi.StringArrayOutput `pulumi:"froms"`
	// The external log forwarding profile.
	LogSetting pulumi.StringPtrOutput `pulumi:"logSetting"`
	// The name of the security rule.
	Name pulumi.StringOutput `pulumi:"name"`
	// Negate the destination addresses(es). Default: `false`.
	NegateDestination pulumi.BoolOutput `pulumi:"negateDestination"`
	// Negate the source address(es). Default: `false`.
	NegateSource pulumi.BoolOutput `pulumi:"negateSource"`
	// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
	Position pulumi.StringOutput `pulumi:"position"`
	// The security profile object.
	ProfileSetting SecurityRuleProfileSettingPtrOutput `pulumi:"profileSetting"`
	// The service(s) being accessed.
	Services pulumi.StringArrayOutput `pulumi:"services"`
	// The Snippet param.
	Snippet pulumi.StringPtrOutput `pulumi:"snippet"`
	// The source Host Integrity Profile(s).
	SourceHips pulumi.StringArrayOutput `pulumi:"sourceHips"`
	// The source user(s) or group(s).
	SourceUsers pulumi.StringArrayOutput `pulumi:"sourceUsers"`
	// The source address(es).
	Sources pulumi.StringArrayOutput `pulumi:"sources"`
	// The tags associated with the security rule.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	Tfid pulumi.StringOutput      `pulumi:"tfid"`
	// The destination security zone(s).
	Tos pulumi.StringArrayOutput `pulumi:"tos"`
}

// NewSecurityRule registers a new resource with the given unique name, arguments, and options.
func NewSecurityRule(ctx *pulumi.Context,
	name string, args *SecurityRuleArgs, opts ...pulumi.ResourceOption) (*SecurityRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Action == nil {
		return nil, errors.New("invalid value for required argument 'Action'")
	}
	if args.Applications == nil {
		return nil, errors.New("invalid value for required argument 'Applications'")
	}
	if args.Categories == nil {
		return nil, errors.New("invalid value for required argument 'Categories'")
	}
	if args.Destinations == nil {
		return nil, errors.New("invalid value for required argument 'Destinations'")
	}
	if args.Froms == nil {
		return nil, errors.New("invalid value for required argument 'Froms'")
	}
	if args.Services == nil {
		return nil, errors.New("invalid value for required argument 'Services'")
	}
	if args.SourceUsers == nil {
		return nil, errors.New("invalid value for required argument 'SourceUsers'")
	}
	if args.Sources == nil {
		return nil, errors.New("invalid value for required argument 'Sources'")
	}
	if args.Tos == nil {
		return nil, errors.New("invalid value for required argument 'Tos'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SecurityRule
	err := ctx.RegisterResource("scm:index/securityRule:SecurityRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecurityRule gets an existing SecurityRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecurityRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecurityRuleState, opts ...pulumi.ResourceOption) (*SecurityRule, error) {
	var resource SecurityRule
	err := ctx.ReadResource("scm:index/securityRule:SecurityRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecurityRule resources.
type securityRuleState struct {
	// The action to be taken when the rule is matched. String must be one of these: `"allow"`, `"deny"`, `"drop"`, `"reset-client"`, `"reset-server"`, `"reset-both"`.
	Action *string `pulumi:"action"`
	// The application(s) being accessed.
	Applications []string `pulumi:"applications"`
	// The URL categories being accessed.
	Categories []string `pulumi:"categories"`
	// The description of the security rule.
	Description *string `pulumi:"description"`
	// The destination Host Integrity Profile(s).
	DestinationHips []string `pulumi:"destinationHips"`
	// The destination address(es).
	Destinations []string `pulumi:"destinations"`
	// The Device param.
	Device *string `pulumi:"device"`
	// The state of the security rule. Default: `false`.
	Disabled *bool `pulumi:"disabled"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The source security zone(s).
	Froms []string `pulumi:"froms"`
	// The external log forwarding profile.
	LogSetting *string `pulumi:"logSetting"`
	// The name of the security rule.
	Name *string `pulumi:"name"`
	// Negate the destination addresses(es). Default: `false`.
	NegateDestination *bool `pulumi:"negateDestination"`
	// Negate the source address(es). Default: `false`.
	NegateSource *bool `pulumi:"negateSource"`
	// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
	Position *string `pulumi:"position"`
	// The security profile object.
	ProfileSetting *SecurityRuleProfileSetting `pulumi:"profileSetting"`
	// The service(s) being accessed.
	Services []string `pulumi:"services"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
	// The source Host Integrity Profile(s).
	SourceHips []string `pulumi:"sourceHips"`
	// The source user(s) or group(s).
	SourceUsers []string `pulumi:"sourceUsers"`
	// The source address(es).
	Sources []string `pulumi:"sources"`
	// The tags associated with the security rule.
	Tags []string `pulumi:"tags"`
	Tfid *string  `pulumi:"tfid"`
	// The destination security zone(s).
	Tos []string `pulumi:"tos"`
}

type SecurityRuleState struct {
	// The action to be taken when the rule is matched. String must be one of these: `"allow"`, `"deny"`, `"drop"`, `"reset-client"`, `"reset-server"`, `"reset-both"`.
	Action pulumi.StringPtrInput
	// The application(s) being accessed.
	Applications pulumi.StringArrayInput
	// The URL categories being accessed.
	Categories pulumi.StringArrayInput
	// The description of the security rule.
	Description pulumi.StringPtrInput
	// The destination Host Integrity Profile(s).
	DestinationHips pulumi.StringArrayInput
	// The destination address(es).
	Destinations pulumi.StringArrayInput
	// The Device param.
	Device pulumi.StringPtrInput
	// The state of the security rule. Default: `false`.
	Disabled pulumi.BoolPtrInput
	// The Folder param.
	Folder pulumi.StringPtrInput
	// The source security zone(s).
	Froms pulumi.StringArrayInput
	// The external log forwarding profile.
	LogSetting pulumi.StringPtrInput
	// The name of the security rule.
	Name pulumi.StringPtrInput
	// Negate the destination addresses(es). Default: `false`.
	NegateDestination pulumi.BoolPtrInput
	// Negate the source address(es). Default: `false`.
	NegateSource pulumi.BoolPtrInput
	// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
	Position pulumi.StringPtrInput
	// The security profile object.
	ProfileSetting SecurityRuleProfileSettingPtrInput
	// The service(s) being accessed.
	Services pulumi.StringArrayInput
	// The Snippet param.
	Snippet pulumi.StringPtrInput
	// The source Host Integrity Profile(s).
	SourceHips pulumi.StringArrayInput
	// The source user(s) or group(s).
	SourceUsers pulumi.StringArrayInput
	// The source address(es).
	Sources pulumi.StringArrayInput
	// The tags associated with the security rule.
	Tags pulumi.StringArrayInput
	Tfid pulumi.StringPtrInput
	// The destination security zone(s).
	Tos pulumi.StringArrayInput
}

func (SecurityRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*securityRuleState)(nil)).Elem()
}

type securityRuleArgs struct {
	// The action to be taken when the rule is matched. String must be one of these: `"allow"`, `"deny"`, `"drop"`, `"reset-client"`, `"reset-server"`, `"reset-both"`.
	Action string `pulumi:"action"`
	// The application(s) being accessed.
	Applications []string `pulumi:"applications"`
	// The URL categories being accessed.
	Categories []string `pulumi:"categories"`
	// The description of the security rule.
	Description *string `pulumi:"description"`
	// The destination Host Integrity Profile(s).
	DestinationHips []string `pulumi:"destinationHips"`
	// The destination address(es).
	Destinations []string `pulumi:"destinations"`
	// The Device param.
	Device *string `pulumi:"device"`
	// The state of the security rule. Default: `false`.
	Disabled *bool `pulumi:"disabled"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The source security zone(s).
	Froms []string `pulumi:"froms"`
	// The external log forwarding profile.
	LogSetting *string `pulumi:"logSetting"`
	// The name of the security rule.
	Name *string `pulumi:"name"`
	// Negate the destination addresses(es). Default: `false`.
	NegateDestination *bool `pulumi:"negateDestination"`
	// Negate the source address(es). Default: `false`.
	NegateSource *bool `pulumi:"negateSource"`
	// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
	Position *string `pulumi:"position"`
	// The security profile object.
	ProfileSetting *SecurityRuleProfileSetting `pulumi:"profileSetting"`
	// The service(s) being accessed.
	Services []string `pulumi:"services"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
	// The source Host Integrity Profile(s).
	SourceHips []string `pulumi:"sourceHips"`
	// The source user(s) or group(s).
	SourceUsers []string `pulumi:"sourceUsers"`
	// The source address(es).
	Sources []string `pulumi:"sources"`
	// The tags associated with the security rule.
	Tags []string `pulumi:"tags"`
	// The destination security zone(s).
	Tos []string `pulumi:"tos"`
}

// The set of arguments for constructing a SecurityRule resource.
type SecurityRuleArgs struct {
	// The action to be taken when the rule is matched. String must be one of these: `"allow"`, `"deny"`, `"drop"`, `"reset-client"`, `"reset-server"`, `"reset-both"`.
	Action pulumi.StringInput
	// The application(s) being accessed.
	Applications pulumi.StringArrayInput
	// The URL categories being accessed.
	Categories pulumi.StringArrayInput
	// The description of the security rule.
	Description pulumi.StringPtrInput
	// The destination Host Integrity Profile(s).
	DestinationHips pulumi.StringArrayInput
	// The destination address(es).
	Destinations pulumi.StringArrayInput
	// The Device param.
	Device pulumi.StringPtrInput
	// The state of the security rule. Default: `false`.
	Disabled pulumi.BoolPtrInput
	// The Folder param.
	Folder pulumi.StringPtrInput
	// The source security zone(s).
	Froms pulumi.StringArrayInput
	// The external log forwarding profile.
	LogSetting pulumi.StringPtrInput
	// The name of the security rule.
	Name pulumi.StringPtrInput
	// Negate the destination addresses(es). Default: `false`.
	NegateDestination pulumi.BoolPtrInput
	// Negate the source address(es). Default: `false`.
	NegateSource pulumi.BoolPtrInput
	// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
	Position pulumi.StringPtrInput
	// The security profile object.
	ProfileSetting SecurityRuleProfileSettingPtrInput
	// The service(s) being accessed.
	Services pulumi.StringArrayInput
	// The Snippet param.
	Snippet pulumi.StringPtrInput
	// The source Host Integrity Profile(s).
	SourceHips pulumi.StringArrayInput
	// The source user(s) or group(s).
	SourceUsers pulumi.StringArrayInput
	// The source address(es).
	Sources pulumi.StringArrayInput
	// The tags associated with the security rule.
	Tags pulumi.StringArrayInput
	// The destination security zone(s).
	Tos pulumi.StringArrayInput
}

func (SecurityRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*securityRuleArgs)(nil)).Elem()
}

type SecurityRuleInput interface {
	pulumi.Input

	ToSecurityRuleOutput() SecurityRuleOutput
	ToSecurityRuleOutputWithContext(ctx context.Context) SecurityRuleOutput
}

func (*SecurityRule) ElementType() reflect.Type {
	return reflect.TypeOf((**SecurityRule)(nil)).Elem()
}

func (i *SecurityRule) ToSecurityRuleOutput() SecurityRuleOutput {
	return i.ToSecurityRuleOutputWithContext(context.Background())
}

func (i *SecurityRule) ToSecurityRuleOutputWithContext(ctx context.Context) SecurityRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityRuleOutput)
}

// SecurityRuleArrayInput is an input type that accepts SecurityRuleArray and SecurityRuleArrayOutput values.
// You can construct a concrete instance of `SecurityRuleArrayInput` via:
//
//	SecurityRuleArray{ SecurityRuleArgs{...} }
type SecurityRuleArrayInput interface {
	pulumi.Input

	ToSecurityRuleArrayOutput() SecurityRuleArrayOutput
	ToSecurityRuleArrayOutputWithContext(context.Context) SecurityRuleArrayOutput
}

type SecurityRuleArray []SecurityRuleInput

func (SecurityRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecurityRule)(nil)).Elem()
}

func (i SecurityRuleArray) ToSecurityRuleArrayOutput() SecurityRuleArrayOutput {
	return i.ToSecurityRuleArrayOutputWithContext(context.Background())
}

func (i SecurityRuleArray) ToSecurityRuleArrayOutputWithContext(ctx context.Context) SecurityRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityRuleArrayOutput)
}

// SecurityRuleMapInput is an input type that accepts SecurityRuleMap and SecurityRuleMapOutput values.
// You can construct a concrete instance of `SecurityRuleMapInput` via:
//
//	SecurityRuleMap{ "key": SecurityRuleArgs{...} }
type SecurityRuleMapInput interface {
	pulumi.Input

	ToSecurityRuleMapOutput() SecurityRuleMapOutput
	ToSecurityRuleMapOutputWithContext(context.Context) SecurityRuleMapOutput
}

type SecurityRuleMap map[string]SecurityRuleInput

func (SecurityRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecurityRule)(nil)).Elem()
}

func (i SecurityRuleMap) ToSecurityRuleMapOutput() SecurityRuleMapOutput {
	return i.ToSecurityRuleMapOutputWithContext(context.Background())
}

func (i SecurityRuleMap) ToSecurityRuleMapOutputWithContext(ctx context.Context) SecurityRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecurityRuleMapOutput)
}

type SecurityRuleOutput struct{ *pulumi.OutputState }

func (SecurityRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecurityRule)(nil)).Elem()
}

func (o SecurityRuleOutput) ToSecurityRuleOutput() SecurityRuleOutput {
	return o
}

func (o SecurityRuleOutput) ToSecurityRuleOutputWithContext(ctx context.Context) SecurityRuleOutput {
	return o
}

// The action to be taken when the rule is matched. String must be one of these: `"allow"`, `"deny"`, `"drop"`, `"reset-client"`, `"reset-server"`, `"reset-both"`.
func (o SecurityRuleOutput) Action() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringOutput { return v.Action }).(pulumi.StringOutput)
}

// The application(s) being accessed.
func (o SecurityRuleOutput) Applications() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringArrayOutput { return v.Applications }).(pulumi.StringArrayOutput)
}

// The URL categories being accessed.
func (o SecurityRuleOutput) Categories() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringArrayOutput { return v.Categories }).(pulumi.StringArrayOutput)
}

// The description of the security rule.
func (o SecurityRuleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The destination Host Integrity Profile(s).
func (o SecurityRuleOutput) DestinationHips() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringArrayOutput { return v.DestinationHips }).(pulumi.StringArrayOutput)
}

// The destination address(es).
func (o SecurityRuleOutput) Destinations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringArrayOutput { return v.Destinations }).(pulumi.StringArrayOutput)
}

// The Device param.
func (o SecurityRuleOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// The state of the security rule. Default: `false`.
func (o SecurityRuleOutput) Disabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.BoolOutput { return v.Disabled }).(pulumi.BoolOutput)
}

// The Folder param.
func (o SecurityRuleOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringPtrOutput { return v.Folder }).(pulumi.StringPtrOutput)
}

// The source security zone(s).
func (o SecurityRuleOutput) Froms() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringArrayOutput { return v.Froms }).(pulumi.StringArrayOutput)
}

// The external log forwarding profile.
func (o SecurityRuleOutput) LogSetting() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringPtrOutput { return v.LogSetting }).(pulumi.StringPtrOutput)
}

// The name of the security rule.
func (o SecurityRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Negate the destination addresses(es). Default: `false`.
func (o SecurityRuleOutput) NegateDestination() pulumi.BoolOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.BoolOutput { return v.NegateDestination }).(pulumi.BoolOutput)
}

// Negate the source address(es). Default: `false`.
func (o SecurityRuleOutput) NegateSource() pulumi.BoolOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.BoolOutput { return v.NegateSource }).(pulumi.BoolOutput)
}

// The Position param. String must be one of these: `"pre"`, `"post"`. Default: `"pre"`.
func (o SecurityRuleOutput) Position() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringOutput { return v.Position }).(pulumi.StringOutput)
}

// The security profile object.
func (o SecurityRuleOutput) ProfileSetting() SecurityRuleProfileSettingPtrOutput {
	return o.ApplyT(func(v *SecurityRule) SecurityRuleProfileSettingPtrOutput { return v.ProfileSetting }).(SecurityRuleProfileSettingPtrOutput)
}

// The service(s) being accessed.
func (o SecurityRuleOutput) Services() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringArrayOutput { return v.Services }).(pulumi.StringArrayOutput)
}

// The Snippet param.
func (o SecurityRuleOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringPtrOutput { return v.Snippet }).(pulumi.StringPtrOutput)
}

// The source Host Integrity Profile(s).
func (o SecurityRuleOutput) SourceHips() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringArrayOutput { return v.SourceHips }).(pulumi.StringArrayOutput)
}

// The source user(s) or group(s).
func (o SecurityRuleOutput) SourceUsers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringArrayOutput { return v.SourceUsers }).(pulumi.StringArrayOutput)
}

// The source address(es).
func (o SecurityRuleOutput) Sources() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringArrayOutput { return v.Sources }).(pulumi.StringArrayOutput)
}

// The tags associated with the security rule.
func (o SecurityRuleOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

func (o SecurityRuleOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringOutput { return v.Tfid }).(pulumi.StringOutput)
}

// The destination security zone(s).
func (o SecurityRuleOutput) Tos() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecurityRule) pulumi.StringArrayOutput { return v.Tos }).(pulumi.StringArrayOutput)
}

type SecurityRuleArrayOutput struct{ *pulumi.OutputState }

func (SecurityRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecurityRule)(nil)).Elem()
}

func (o SecurityRuleArrayOutput) ToSecurityRuleArrayOutput() SecurityRuleArrayOutput {
	return o
}

func (o SecurityRuleArrayOutput) ToSecurityRuleArrayOutputWithContext(ctx context.Context) SecurityRuleArrayOutput {
	return o
}

func (o SecurityRuleArrayOutput) Index(i pulumi.IntInput) SecurityRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SecurityRule {
		return vs[0].([]*SecurityRule)[vs[1].(int)]
	}).(SecurityRuleOutput)
}

type SecurityRuleMapOutput struct{ *pulumi.OutputState }

func (SecurityRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecurityRule)(nil)).Elem()
}

func (o SecurityRuleMapOutput) ToSecurityRuleMapOutput() SecurityRuleMapOutput {
	return o
}

func (o SecurityRuleMapOutput) ToSecurityRuleMapOutputWithContext(ctx context.Context) SecurityRuleMapOutput {
	return o
}

func (o SecurityRuleMapOutput) MapIndex(k pulumi.StringInput) SecurityRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SecurityRule {
		return vs[0].(map[string]*SecurityRule)[vs[1].(string)]
	}).(SecurityRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityRuleInput)(nil)).Elem(), &SecurityRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityRuleArrayInput)(nil)).Elem(), SecurityRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecurityRuleMapInput)(nil)).Elem(), SecurityRuleMap{})
	pulumi.RegisterOutputType(SecurityRuleOutput{})
	pulumi.RegisterOutputType(SecurityRuleArrayOutput{})
	pulumi.RegisterOutputType(SecurityRuleMapOutput{})
}
