// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetLdapServerProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLdapServerProfileArgs Empty = new GetLdapServerProfileArgs();

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

    private GetLdapServerProfileArgs() {}

    private GetLdapServerProfileArgs(GetLdapServerProfileArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLdapServerProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLdapServerProfileArgs $;

        public Builder() {
            $ = new GetLdapServerProfileArgs();
        }

        public Builder(GetLdapServerProfileArgs defaults) {
            $ = new GetLdapServerProfileArgs(Objects.requireNonNull(defaults));
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

        public GetLdapServerProfileArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetLdapServerProfileArgs", "id");
            }
            return $;
        }
    }

}