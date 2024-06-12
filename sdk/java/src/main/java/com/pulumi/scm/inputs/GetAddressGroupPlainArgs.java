// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetAddressGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAddressGroupPlainArgs Empty = new GetAddressGroupPlainArgs();

    /**
     * The Id param.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The Id param.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetAddressGroupPlainArgs() {}

    private GetAddressGroupPlainArgs(GetAddressGroupPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAddressGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAddressGroupPlainArgs $;

        public Builder() {
            $ = new GetAddressGroupPlainArgs();
        }

        public Builder(GetAddressGroupPlainArgs defaults) {
            $ = new GetAddressGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The Id param.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetAddressGroupPlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetAddressGroupPlainArgs", "id");
            }
            return $;
        }
    }

}