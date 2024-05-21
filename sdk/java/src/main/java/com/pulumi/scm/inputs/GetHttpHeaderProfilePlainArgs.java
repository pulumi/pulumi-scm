// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetHttpHeaderProfilePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHttpHeaderProfilePlainArgs Empty = new GetHttpHeaderProfilePlainArgs();

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

    private GetHttpHeaderProfilePlainArgs() {}

    private GetHttpHeaderProfilePlainArgs(GetHttpHeaderProfilePlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHttpHeaderProfilePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHttpHeaderProfilePlainArgs $;

        public Builder() {
            $ = new GetHttpHeaderProfilePlainArgs();
        }

        public Builder(GetHttpHeaderProfilePlainArgs defaults) {
            $ = new GetHttpHeaderProfilePlainArgs(Objects.requireNonNull(defaults));
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

        public GetHttpHeaderProfilePlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetHttpHeaderProfilePlainArgs", "id");
            }
            return $;
        }
    }

}
