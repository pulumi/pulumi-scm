// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scm.outputs.IkeGatewayProtocolCommonFragmentation;
import com.pulumi.scm.outputs.IkeGatewayProtocolCommonNatTraversal;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IkeGatewayProtocolCommon {
    /**
     * @return The Fragmentation param.
     * 
     */
    private @Nullable IkeGatewayProtocolCommonFragmentation fragmentation;
    /**
     * @return The NatTraversal param.
     * 
     */
    private @Nullable IkeGatewayProtocolCommonNatTraversal natTraversal;
    /**
     * @return The PassiveMode param.
     * 
     */
    private @Nullable Boolean passiveMode;

    private IkeGatewayProtocolCommon() {}
    /**
     * @return The Fragmentation param.
     * 
     */
    public Optional<IkeGatewayProtocolCommonFragmentation> fragmentation() {
        return Optional.ofNullable(this.fragmentation);
    }
    /**
     * @return The NatTraversal param.
     * 
     */
    public Optional<IkeGatewayProtocolCommonNatTraversal> natTraversal() {
        return Optional.ofNullable(this.natTraversal);
    }
    /**
     * @return The PassiveMode param.
     * 
     */
    public Optional<Boolean> passiveMode() {
        return Optional.ofNullable(this.passiveMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IkeGatewayProtocolCommon defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable IkeGatewayProtocolCommonFragmentation fragmentation;
        private @Nullable IkeGatewayProtocolCommonNatTraversal natTraversal;
        private @Nullable Boolean passiveMode;
        public Builder() {}
        public Builder(IkeGatewayProtocolCommon defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fragmentation = defaults.fragmentation;
    	      this.natTraversal = defaults.natTraversal;
    	      this.passiveMode = defaults.passiveMode;
        }

        @CustomType.Setter
        public Builder fragmentation(@Nullable IkeGatewayProtocolCommonFragmentation fragmentation) {

            this.fragmentation = fragmentation;
            return this;
        }
        @CustomType.Setter
        public Builder natTraversal(@Nullable IkeGatewayProtocolCommonNatTraversal natTraversal) {

            this.natTraversal = natTraversal;
            return this;
        }
        @CustomType.Setter
        public Builder passiveMode(@Nullable Boolean passiveMode) {

            this.passiveMode = passiveMode;
            return this;
        }
        public IkeGatewayProtocolCommon build() {
            final var _resultValue = new IkeGatewayProtocolCommon();
            _resultValue.fragmentation = fragmentation;
            _resultValue.natTraversal = natTraversal;
            _resultValue.passiveMode = passiveMode;
            return _resultValue;
        }
    }
}