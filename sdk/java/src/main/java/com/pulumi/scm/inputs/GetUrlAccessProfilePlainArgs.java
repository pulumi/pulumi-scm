// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetUrlAccessProfilePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUrlAccessProfilePlainArgs Empty = new GetUrlAccessProfilePlainArgs();

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

    private GetUrlAccessProfilePlainArgs() {}

    private GetUrlAccessProfilePlainArgs(GetUrlAccessProfilePlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUrlAccessProfilePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUrlAccessProfilePlainArgs $;

        public Builder() {
            $ = new GetUrlAccessProfilePlainArgs();
        }

        public Builder(GetUrlAccessProfilePlainArgs defaults) {
            $ = new GetUrlAccessProfilePlainArgs(Objects.requireNonNull(defaults));
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

        public GetUrlAccessProfilePlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetUrlAccessProfilePlainArgs", "id");
            }
            return $;
        }
    }

}
