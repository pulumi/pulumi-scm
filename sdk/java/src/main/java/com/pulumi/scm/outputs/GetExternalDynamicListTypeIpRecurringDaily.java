// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetExternalDynamicListTypeIpRecurringDaily {
    /**
     * @return Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `&#34;00&#34;`.
     * 
     */
    private String at;

    private GetExternalDynamicListTypeIpRecurringDaily() {}
    /**
     * @return Time specification hh (e.g. 20). String length must be between 2 and 2 characters. String validation regex: `([01][0-9]|[2][0-3])`. Default: `&#34;00&#34;`.
     * 
     */
    public String at() {
        return this.at;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExternalDynamicListTypeIpRecurringDaily defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String at;
        public Builder() {}
        public Builder(GetExternalDynamicListTypeIpRecurringDaily defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.at = defaults.at;
        }

        @CustomType.Setter
        public Builder at(String at) {
            if (at == null) {
              throw new MissingRequiredPropertyException("GetExternalDynamicListTypeIpRecurringDaily", "at");
            }
            this.at = at;
            return this;
        }
        public GetExternalDynamicListTypeIpRecurringDaily build() {
            final var _resultValue = new GetExternalDynamicListTypeIpRecurringDaily();
            _resultValue.at = at;
            return _resultValue;
        }
    }
}
