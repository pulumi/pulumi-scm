// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetIkeGatewayProtocolCommonFragmentation {
    /**
     * @return The Enable param. Default: `false`.
     * 
     */
    private Boolean enable;

    private GetIkeGatewayProtocolCommonFragmentation() {}
    /**
     * @return The Enable param. Default: `false`.
     * 
     */
    public Boolean enable() {
        return this.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIkeGatewayProtocolCommonFragmentation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enable;
        public Builder() {}
        public Builder(GetIkeGatewayProtocolCommonFragmentation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
        }

        @CustomType.Setter
        public Builder enable(Boolean enable) {
            if (enable == null) {
              throw new MissingRequiredPropertyException("GetIkeGatewayProtocolCommonFragmentation", "enable");
            }
            this.enable = enable;
            return this;
        }
        public GetIkeGatewayProtocolCommonFragmentation build() {
            final var _resultValue = new GetIkeGatewayProtocolCommonFragmentation();
            _resultValue.enable = enable;
            return _resultValue;
        }
    }
}
