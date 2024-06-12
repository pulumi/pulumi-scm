// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceProtocolTcpOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceProtocolTcpOverrideArgs Empty = new ServiceProtocolTcpOverrideArgs();

    /**
     * tcp session half-close timeout value (in second). Value must be between 1 and 604800. Default: `120`.
     * 
     */
    @Import(name="halfcloseTimeout")
    private @Nullable Output<Integer> halfcloseTimeout;

    /**
     * @return tcp session half-close timeout value (in second). Value must be between 1 and 604800. Default: `120`.
     * 
     */
    public Optional<Output<Integer>> halfcloseTimeout() {
        return Optional.ofNullable(this.halfcloseTimeout);
    }

    /**
     * tcp session timeout value (in second). Value must be between 1 and 604800. Default: `3600`.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return tcp session timeout value (in second). Value must be between 1 and 604800. Default: `3600`.
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * tcp session time-wait timeout value (in second). Value must be between 1 and 600. Default: `15`.
     * 
     */
    @Import(name="timewaitTimeout")
    private @Nullable Output<Integer> timewaitTimeout;

    /**
     * @return tcp session time-wait timeout value (in second). Value must be between 1 and 600. Default: `15`.
     * 
     */
    public Optional<Output<Integer>> timewaitTimeout() {
        return Optional.ofNullable(this.timewaitTimeout);
    }

    private ServiceProtocolTcpOverrideArgs() {}

    private ServiceProtocolTcpOverrideArgs(ServiceProtocolTcpOverrideArgs $) {
        this.halfcloseTimeout = $.halfcloseTimeout;
        this.timeout = $.timeout;
        this.timewaitTimeout = $.timewaitTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceProtocolTcpOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceProtocolTcpOverrideArgs $;

        public Builder() {
            $ = new ServiceProtocolTcpOverrideArgs();
        }

        public Builder(ServiceProtocolTcpOverrideArgs defaults) {
            $ = new ServiceProtocolTcpOverrideArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param halfcloseTimeout tcp session half-close timeout value (in second). Value must be between 1 and 604800. Default: `120`.
         * 
         * @return builder
         * 
         */
        public Builder halfcloseTimeout(@Nullable Output<Integer> halfcloseTimeout) {
            $.halfcloseTimeout = halfcloseTimeout;
            return this;
        }

        /**
         * @param halfcloseTimeout tcp session half-close timeout value (in second). Value must be between 1 and 604800. Default: `120`.
         * 
         * @return builder
         * 
         */
        public Builder halfcloseTimeout(Integer halfcloseTimeout) {
            return halfcloseTimeout(Output.of(halfcloseTimeout));
        }

        /**
         * @param timeout tcp session timeout value (in second). Value must be between 1 and 604800. Default: `3600`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout tcp session timeout value (in second). Value must be between 1 and 604800. Default: `3600`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param timewaitTimeout tcp session time-wait timeout value (in second). Value must be between 1 and 600. Default: `15`.
         * 
         * @return builder
         * 
         */
        public Builder timewaitTimeout(@Nullable Output<Integer> timewaitTimeout) {
            $.timewaitTimeout = timewaitTimeout;
            return this;
        }

        /**
         * @param timewaitTimeout tcp session time-wait timeout value (in second). Value must be between 1 and 600. Default: `15`.
         * 
         * @return builder
         * 
         */
        public Builder timewaitTimeout(Integer timewaitTimeout) {
            return timewaitTimeout(Output.of(timewaitTimeout));
        }

        public ServiceProtocolTcpOverrideArgs build() {
            return $;
        }
    }

}