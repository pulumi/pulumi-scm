// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HipObjectDataLossPreventionVendorArgs extends com.pulumi.resources.ResourceArgs {

    public static final HipObjectDataLossPreventionVendorArgs Empty = new HipObjectDataLossPreventionVendorArgs();

    /**
     * The Name param. String length must not exceed 103 characters.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The Name param. String length must not exceed 103 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Product name. Individual elements in this list are subject to additional validation. String length must not exceed 1023 characters. String validation regex: `.*`.
     * 
     */
    @Import(name="products")
    private @Nullable Output<List<String>> products;

    /**
     * @return Product name. Individual elements in this list are subject to additional validation. String length must not exceed 1023 characters. String validation regex: `.*`.
     * 
     */
    public Optional<Output<List<String>>> products() {
        return Optional.ofNullable(this.products);
    }

    private HipObjectDataLossPreventionVendorArgs() {}

    private HipObjectDataLossPreventionVendorArgs(HipObjectDataLossPreventionVendorArgs $) {
        this.name = $.name;
        this.products = $.products;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HipObjectDataLossPreventionVendorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HipObjectDataLossPreventionVendorArgs $;

        public Builder() {
            $ = new HipObjectDataLossPreventionVendorArgs();
        }

        public Builder(HipObjectDataLossPreventionVendorArgs defaults) {
            $ = new HipObjectDataLossPreventionVendorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The Name param. String length must not exceed 103 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name param. String length must not exceed 103 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param products Product name. Individual elements in this list are subject to additional validation. String length must not exceed 1023 characters. String validation regex: `.*`.
         * 
         * @return builder
         * 
         */
        public Builder products(@Nullable Output<List<String>> products) {
            $.products = products;
            return this;
        }

        /**
         * @param products Product name. Individual elements in this list are subject to additional validation. String length must not exceed 1023 characters. String validation regex: `.*`.
         * 
         * @return builder
         * 
         */
        public Builder products(List<String> products) {
            return products(Output.of(products));
        }

        /**
         * @param products Product name. Individual elements in this list are subject to additional validation. String length must not exceed 1023 characters. String validation regex: `.*`.
         * 
         * @return builder
         * 
         */
        public Builder products(String... products) {
            return products(List.of(products));
        }

        public HipObjectDataLossPreventionVendorArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("HipObjectDataLossPreventionVendorArgs", "name");
            }
            return $;
        }
    }

}
