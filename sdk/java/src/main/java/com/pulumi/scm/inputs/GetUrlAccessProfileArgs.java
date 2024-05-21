// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetUrlAccessProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUrlAccessProfileArgs Empty = new GetUrlAccessProfileArgs();

    /**
     * The Id param.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The Id param.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetUrlAccessProfileArgs() {}

    private GetUrlAccessProfileArgs(GetUrlAccessProfileArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUrlAccessProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUrlAccessProfileArgs $;

        public Builder() {
            $ = new GetUrlAccessProfileArgs();
        }

        public Builder(GetUrlAccessProfileArgs defaults) {
            $ = new GetUrlAccessProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The Id param.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The Id param.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetUrlAccessProfileArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetUrlAccessProfileArgs", "id");
            }
            return $;
        }
    }

}
