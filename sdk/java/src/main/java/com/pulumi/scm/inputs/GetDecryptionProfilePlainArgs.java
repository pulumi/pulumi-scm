// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetDecryptionProfilePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDecryptionProfilePlainArgs Empty = new GetDecryptionProfilePlainArgs();

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

    private GetDecryptionProfilePlainArgs() {}

    private GetDecryptionProfilePlainArgs(GetDecryptionProfilePlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDecryptionProfilePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDecryptionProfilePlainArgs $;

        public Builder() {
            $ = new GetDecryptionProfilePlainArgs();
        }

        public Builder(GetDecryptionProfilePlainArgs defaults) {
            $ = new GetDecryptionProfilePlainArgs(Objects.requireNonNull(defaults));
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

        public GetDecryptionProfilePlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetDecryptionProfilePlainArgs", "id");
            }
            return $;
        }
    }

}
