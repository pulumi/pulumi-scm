// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetServiceGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceGroupArgs Empty = new GetServiceGroupArgs();

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

    private GetServiceGroupArgs() {}

    private GetServiceGroupArgs(GetServiceGroupArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceGroupArgs $;

        public Builder() {
            $ = new GetServiceGroupArgs();
        }

        public Builder(GetServiceGroupArgs defaults) {
            $ = new GetServiceGroupArgs(Objects.requireNonNull(defaults));
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

        public GetServiceGroupArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetServiceGroupArgs", "id");
            }
            return $;
        }
    }

}
