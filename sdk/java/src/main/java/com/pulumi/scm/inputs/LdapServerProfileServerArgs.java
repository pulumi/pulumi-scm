// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LdapServerProfileServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final LdapServerProfileServerArgs Empty = new LdapServerProfileServerArgs();

    /**
     * The Address param.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The Address param.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The Name param.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Name param.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Port param. Value must be between 1 and 65535.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The Port param. Value must be between 1 and 65535.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    private LdapServerProfileServerArgs() {}

    private LdapServerProfileServerArgs(LdapServerProfileServerArgs $) {
        this.address = $.address;
        this.name = $.name;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LdapServerProfileServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LdapServerProfileServerArgs $;

        public Builder() {
            $ = new LdapServerProfileServerArgs();
        }

        public Builder(LdapServerProfileServerArgs defaults) {
            $ = new LdapServerProfileServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The Address param.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The Address param.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param name The Name param.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name param.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param port The Port param. Value must be between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The Port param. Value must be between 1 and 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public LdapServerProfileServerArgs build() {
            return $;
        }
    }

}
