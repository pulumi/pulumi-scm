// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ExternalDynamicListTypeIpIpAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExternalDynamicListTypeIpIpAuthArgs Empty = new ExternalDynamicListTypeIpIpAuthArgs();

    /**
     * The Password param. String length must not exceed 255 characters.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return The Password param. String length must not exceed 255 characters.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * The Username param. String length must be between 1 and 255 characters.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The Username param. String length must be between 1 and 255 characters.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private ExternalDynamicListTypeIpIpAuthArgs() {}

    private ExternalDynamicListTypeIpIpAuthArgs(ExternalDynamicListTypeIpIpAuthArgs $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalDynamicListTypeIpIpAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalDynamicListTypeIpIpAuthArgs $;

        public Builder() {
            $ = new ExternalDynamicListTypeIpIpAuthArgs();
        }

        public Builder(ExternalDynamicListTypeIpIpAuthArgs defaults) {
            $ = new ExternalDynamicListTypeIpIpAuthArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The Password param. String length must not exceed 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The Password param. String length must not exceed 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username The Username param. String length must be between 1 and 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The Username param. String length must be between 1 and 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ExternalDynamicListTypeIpIpAuthArgs build() {
            if ($.password == null) {
                throw new MissingRequiredPropertyException("ExternalDynamicListTypeIpIpAuthArgs", "password");
            }
            if ($.username == null) {
                throw new MissingRequiredPropertyException("ExternalDynamicListTypeIpIpAuthArgs", "username");
            }
            return $;
        }
    }

}
