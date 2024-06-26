// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetServiceListDataProtocolUdpOverride {
    /**
     * @return udp session timeout value (in second). Value must be between 1 and 604800. Default: `30`.
     * 
     */
    private Integer timeout;

    private GetServiceListDataProtocolUdpOverride() {}
    /**
     * @return udp session timeout value (in second). Value must be between 1 and 604800. Default: `30`.
     * 
     */
    public Integer timeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceListDataProtocolUdpOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer timeout;
        public Builder() {}
        public Builder(GetServiceListDataProtocolUdpOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder timeout(Integer timeout) {
            if (timeout == null) {
              throw new MissingRequiredPropertyException("GetServiceListDataProtocolUdpOverride", "timeout");
            }
            this.timeout = timeout;
            return this;
        }
        public GetServiceListDataProtocolUdpOverride build() {
            final var _resultValue = new GetServiceListDataProtocolUdpOverride();
            _resultValue.timeout = timeout;
            return _resultValue;
        }
    }
}
