// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
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
//			_, err := scm.NewTag(ctx, "example", &scm.TagArgs{
//				Folder:   pulumi.String("Shared"),
//				Name:     pulumi.String("myColor"),
//				Color:    pulumi.String("Green"),
//				Comments: pulumi.String("Made by Pulumi"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type Tag struct {
	pulumi.CustomResourceState

	// The Color param. String must be one of these: `"Red"`, `"Green"`, `"Blue"`, `"Yellow"`, `"Copper"`, `"Orange"`, `"Purple"`, `"Gray"`, `"Light Green"`, `"Cyan"`, `"Light Gray"`, `"Blue Gray"`, `"Lime"`, `"Black"`, `"Gold"`, `"Brown"`, `"Olive"`, `"Maroon"`, `"Red-Orange"`, `"Yellow-Orange"`, `"Forest Green"`, `"Turquoise Blue"`, `"Azure Blue"`, `"Cerulean Blue"`, `"Midnight Blue"`, `"Medium Blue"`, `"Cobalt Blue"`, `"Violet Blue"`, `"Blue Violet"`, `"Medium Violet"`, `"Medium Rose"`, `"Lavender"`, `"Orchid"`, `"Thistle"`, `"Peach"`, `"Salmon"`, `"Magenta"`, `"Red Violet"`, `"Mahogany"`, `"Burnt Sienna"`, `"Chestnut"`.
	Color pulumi.StringPtrOutput `pulumi:"color"`
	// The Comments param. String length must not exceed 1023 characters.
	Comments pulumi.StringPtrOutput `pulumi:"comments"`
	// The Device param.
	Device pulumi.StringPtrOutput `pulumi:"device"`
	// The Folder param.
	Folder pulumi.StringPtrOutput `pulumi:"folder"`
	// The Name param. String length must not exceed 127 characters.
	Name pulumi.StringOutput `pulumi:"name"`
	// The Snippet param.
	Snippet pulumi.StringPtrOutput `pulumi:"snippet"`
	Tfid    pulumi.StringOutput    `pulumi:"tfid"`
}

// NewTag registers a new resource with the given unique name, arguments, and options.
func NewTag(ctx *pulumi.Context,
	name string, args *TagArgs, opts ...pulumi.ResourceOption) (*Tag, error) {
	if args == nil {
		args = &TagArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Tag
	err := ctx.RegisterResource("scm:index/tag:Tag", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTag gets an existing Tag resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTag(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TagState, opts ...pulumi.ResourceOption) (*Tag, error) {
	var resource Tag
	err := ctx.ReadResource("scm:index/tag:Tag", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Tag resources.
type tagState struct {
	// The Color param. String must be one of these: `"Red"`, `"Green"`, `"Blue"`, `"Yellow"`, `"Copper"`, `"Orange"`, `"Purple"`, `"Gray"`, `"Light Green"`, `"Cyan"`, `"Light Gray"`, `"Blue Gray"`, `"Lime"`, `"Black"`, `"Gold"`, `"Brown"`, `"Olive"`, `"Maroon"`, `"Red-Orange"`, `"Yellow-Orange"`, `"Forest Green"`, `"Turquoise Blue"`, `"Azure Blue"`, `"Cerulean Blue"`, `"Midnight Blue"`, `"Medium Blue"`, `"Cobalt Blue"`, `"Violet Blue"`, `"Blue Violet"`, `"Medium Violet"`, `"Medium Rose"`, `"Lavender"`, `"Orchid"`, `"Thistle"`, `"Peach"`, `"Salmon"`, `"Magenta"`, `"Red Violet"`, `"Mahogany"`, `"Burnt Sienna"`, `"Chestnut"`.
	Color *string `pulumi:"color"`
	// The Comments param. String length must not exceed 1023 characters.
	Comments *string `pulumi:"comments"`
	// The Device param.
	Device *string `pulumi:"device"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The Name param. String length must not exceed 127 characters.
	Name *string `pulumi:"name"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
	Tfid    *string `pulumi:"tfid"`
}

type TagState struct {
	// The Color param. String must be one of these: `"Red"`, `"Green"`, `"Blue"`, `"Yellow"`, `"Copper"`, `"Orange"`, `"Purple"`, `"Gray"`, `"Light Green"`, `"Cyan"`, `"Light Gray"`, `"Blue Gray"`, `"Lime"`, `"Black"`, `"Gold"`, `"Brown"`, `"Olive"`, `"Maroon"`, `"Red-Orange"`, `"Yellow-Orange"`, `"Forest Green"`, `"Turquoise Blue"`, `"Azure Blue"`, `"Cerulean Blue"`, `"Midnight Blue"`, `"Medium Blue"`, `"Cobalt Blue"`, `"Violet Blue"`, `"Blue Violet"`, `"Medium Violet"`, `"Medium Rose"`, `"Lavender"`, `"Orchid"`, `"Thistle"`, `"Peach"`, `"Salmon"`, `"Magenta"`, `"Red Violet"`, `"Mahogany"`, `"Burnt Sienna"`, `"Chestnut"`.
	Color pulumi.StringPtrInput
	// The Comments param. String length must not exceed 1023 characters.
	Comments pulumi.StringPtrInput
	// The Device param.
	Device pulumi.StringPtrInput
	// The Folder param.
	Folder pulumi.StringPtrInput
	// The Name param. String length must not exceed 127 characters.
	Name pulumi.StringPtrInput
	// The Snippet param.
	Snippet pulumi.StringPtrInput
	Tfid    pulumi.StringPtrInput
}

func (TagState) ElementType() reflect.Type {
	return reflect.TypeOf((*tagState)(nil)).Elem()
}

type tagArgs struct {
	// The Color param. String must be one of these: `"Red"`, `"Green"`, `"Blue"`, `"Yellow"`, `"Copper"`, `"Orange"`, `"Purple"`, `"Gray"`, `"Light Green"`, `"Cyan"`, `"Light Gray"`, `"Blue Gray"`, `"Lime"`, `"Black"`, `"Gold"`, `"Brown"`, `"Olive"`, `"Maroon"`, `"Red-Orange"`, `"Yellow-Orange"`, `"Forest Green"`, `"Turquoise Blue"`, `"Azure Blue"`, `"Cerulean Blue"`, `"Midnight Blue"`, `"Medium Blue"`, `"Cobalt Blue"`, `"Violet Blue"`, `"Blue Violet"`, `"Medium Violet"`, `"Medium Rose"`, `"Lavender"`, `"Orchid"`, `"Thistle"`, `"Peach"`, `"Salmon"`, `"Magenta"`, `"Red Violet"`, `"Mahogany"`, `"Burnt Sienna"`, `"Chestnut"`.
	Color *string `pulumi:"color"`
	// The Comments param. String length must not exceed 1023 characters.
	Comments *string `pulumi:"comments"`
	// The Device param.
	Device *string `pulumi:"device"`
	// The Folder param.
	Folder *string `pulumi:"folder"`
	// The Name param. String length must not exceed 127 characters.
	Name *string `pulumi:"name"`
	// The Snippet param.
	Snippet *string `pulumi:"snippet"`
}

// The set of arguments for constructing a Tag resource.
type TagArgs struct {
	// The Color param. String must be one of these: `"Red"`, `"Green"`, `"Blue"`, `"Yellow"`, `"Copper"`, `"Orange"`, `"Purple"`, `"Gray"`, `"Light Green"`, `"Cyan"`, `"Light Gray"`, `"Blue Gray"`, `"Lime"`, `"Black"`, `"Gold"`, `"Brown"`, `"Olive"`, `"Maroon"`, `"Red-Orange"`, `"Yellow-Orange"`, `"Forest Green"`, `"Turquoise Blue"`, `"Azure Blue"`, `"Cerulean Blue"`, `"Midnight Blue"`, `"Medium Blue"`, `"Cobalt Blue"`, `"Violet Blue"`, `"Blue Violet"`, `"Medium Violet"`, `"Medium Rose"`, `"Lavender"`, `"Orchid"`, `"Thistle"`, `"Peach"`, `"Salmon"`, `"Magenta"`, `"Red Violet"`, `"Mahogany"`, `"Burnt Sienna"`, `"Chestnut"`.
	Color pulumi.StringPtrInput
	// The Comments param. String length must not exceed 1023 characters.
	Comments pulumi.StringPtrInput
	// The Device param.
	Device pulumi.StringPtrInput
	// The Folder param.
	Folder pulumi.StringPtrInput
	// The Name param. String length must not exceed 127 characters.
	Name pulumi.StringPtrInput
	// The Snippet param.
	Snippet pulumi.StringPtrInput
}

func (TagArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tagArgs)(nil)).Elem()
}

type TagInput interface {
	pulumi.Input

	ToTagOutput() TagOutput
	ToTagOutputWithContext(ctx context.Context) TagOutput
}

func (*Tag) ElementType() reflect.Type {
	return reflect.TypeOf((**Tag)(nil)).Elem()
}

func (i *Tag) ToTagOutput() TagOutput {
	return i.ToTagOutputWithContext(context.Background())
}

func (i *Tag) ToTagOutputWithContext(ctx context.Context) TagOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagOutput)
}

// TagArrayInput is an input type that accepts TagArray and TagArrayOutput values.
// You can construct a concrete instance of `TagArrayInput` via:
//
//	TagArray{ TagArgs{...} }
type TagArrayInput interface {
	pulumi.Input

	ToTagArrayOutput() TagArrayOutput
	ToTagArrayOutputWithContext(context.Context) TagArrayOutput
}

type TagArray []TagInput

func (TagArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Tag)(nil)).Elem()
}

func (i TagArray) ToTagArrayOutput() TagArrayOutput {
	return i.ToTagArrayOutputWithContext(context.Background())
}

func (i TagArray) ToTagArrayOutputWithContext(ctx context.Context) TagArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagArrayOutput)
}

// TagMapInput is an input type that accepts TagMap and TagMapOutput values.
// You can construct a concrete instance of `TagMapInput` via:
//
//	TagMap{ "key": TagArgs{...} }
type TagMapInput interface {
	pulumi.Input

	ToTagMapOutput() TagMapOutput
	ToTagMapOutputWithContext(context.Context) TagMapOutput
}

type TagMap map[string]TagInput

func (TagMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Tag)(nil)).Elem()
}

func (i TagMap) ToTagMapOutput() TagMapOutput {
	return i.ToTagMapOutputWithContext(context.Background())
}

func (i TagMap) ToTagMapOutputWithContext(ctx context.Context) TagMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TagMapOutput)
}

type TagOutput struct{ *pulumi.OutputState }

func (TagOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Tag)(nil)).Elem()
}

func (o TagOutput) ToTagOutput() TagOutput {
	return o
}

func (o TagOutput) ToTagOutputWithContext(ctx context.Context) TagOutput {
	return o
}

// The Color param. String must be one of these: `"Red"`, `"Green"`, `"Blue"`, `"Yellow"`, `"Copper"`, `"Orange"`, `"Purple"`, `"Gray"`, `"Light Green"`, `"Cyan"`, `"Light Gray"`, `"Blue Gray"`, `"Lime"`, `"Black"`, `"Gold"`, `"Brown"`, `"Olive"`, `"Maroon"`, `"Red-Orange"`, `"Yellow-Orange"`, `"Forest Green"`, `"Turquoise Blue"`, `"Azure Blue"`, `"Cerulean Blue"`, `"Midnight Blue"`, `"Medium Blue"`, `"Cobalt Blue"`, `"Violet Blue"`, `"Blue Violet"`, `"Medium Violet"`, `"Medium Rose"`, `"Lavender"`, `"Orchid"`, `"Thistle"`, `"Peach"`, `"Salmon"`, `"Magenta"`, `"Red Violet"`, `"Mahogany"`, `"Burnt Sienna"`, `"Chestnut"`.
func (o TagOutput) Color() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringPtrOutput { return v.Color }).(pulumi.StringPtrOutput)
}

// The Comments param. String length must not exceed 1023 characters.
func (o TagOutput) Comments() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringPtrOutput { return v.Comments }).(pulumi.StringPtrOutput)
}

// The Device param.
func (o TagOutput) Device() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringPtrOutput { return v.Device }).(pulumi.StringPtrOutput)
}

// The Folder param.
func (o TagOutput) Folder() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringPtrOutput { return v.Folder }).(pulumi.StringPtrOutput)
}

// The Name param. String length must not exceed 127 characters.
func (o TagOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The Snippet param.
func (o TagOutput) Snippet() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringPtrOutput { return v.Snippet }).(pulumi.StringPtrOutput)
}

func (o TagOutput) Tfid() pulumi.StringOutput {
	return o.ApplyT(func(v *Tag) pulumi.StringOutput { return v.Tfid }).(pulumi.StringOutput)
}

type TagArrayOutput struct{ *pulumi.OutputState }

func (TagArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Tag)(nil)).Elem()
}

func (o TagArrayOutput) ToTagArrayOutput() TagArrayOutput {
	return o
}

func (o TagArrayOutput) ToTagArrayOutputWithContext(ctx context.Context) TagArrayOutput {
	return o
}

func (o TagArrayOutput) Index(i pulumi.IntInput) TagOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Tag {
		return vs[0].([]*Tag)[vs[1].(int)]
	}).(TagOutput)
}

type TagMapOutput struct{ *pulumi.OutputState }

func (TagMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Tag)(nil)).Elem()
}

func (o TagMapOutput) ToTagMapOutput() TagMapOutput {
	return o
}

func (o TagMapOutput) ToTagMapOutputWithContext(ctx context.Context) TagMapOutput {
	return o
}

func (o TagMapOutput) MapIndex(k pulumi.StringInput) TagOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Tag {
		return vs[0].(map[string]*Tag)[vs[1].(string)]
	}).(TagOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TagInput)(nil)).Elem(), &Tag{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagArrayInput)(nil)).Elem(), TagArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TagMapInput)(nil)).Elem(), TagMap{})
	pulumi.RegisterOutputType(TagOutput{})
	pulumi.RegisterOutputType(TagArrayOutput{})
	pulumi.RegisterOutputType(TagMapOutput{})
}
