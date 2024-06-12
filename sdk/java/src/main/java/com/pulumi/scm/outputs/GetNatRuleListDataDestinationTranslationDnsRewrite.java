// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNatRuleListDataDestinationTranslationDnsRewrite {
    /**
     * @return The Direction param. String must be one of these: `&#34;reverse&#34;`, `&#34;forward&#34;`. Default: `&#34;reverse&#34;`.
     * 
     */
    private String direction;

    private GetNatRuleListDataDestinationTranslationDnsRewrite() {}
    /**
     * @return The Direction param. String must be one of these: `&#34;reverse&#34;`, `&#34;forward&#34;`. Default: `&#34;reverse&#34;`.
     * 
     */
    public String direction() {
        return this.direction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatRuleListDataDestinationTranslationDnsRewrite defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String direction;
        public Builder() {}
        public Builder(GetNatRuleListDataDestinationTranslationDnsRewrite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
        }

        @CustomType.Setter
        public Builder direction(String direction) {
            if (direction == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListDataDestinationTranslationDnsRewrite", "direction");
            }
            this.direction = direction;
            return this;
        }
        public GetNatRuleListDataDestinationTranslationDnsRewrite build() {
            final var _resultValue = new GetNatRuleListDataDestinationTranslationDnsRewrite();
            _resultValue.direction = direction;
            return _resultValue;
        }
    }
}