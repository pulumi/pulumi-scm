// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNatRuleListDataSourceTranslationFallback {
    /**
     * @return The Interface param.
     * 
     */
    private String interface_;

    private GetNatRuleListDataSourceTranslationFallback() {}
    /**
     * @return The Interface param.
     * 
     */
    public String interface_() {
        return this.interface_;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatRuleListDataSourceTranslationFallback defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String interface_;
        public Builder() {}
        public Builder(GetNatRuleListDataSourceTranslationFallback defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interface_ = defaults.interface_;
        }

        @CustomType.Setter("interface")
        public Builder interface_(String interface_) {
            if (interface_ == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListDataSourceTranslationFallback", "interface_");
            }
            this.interface_ = interface_;
            return this;
        }
        public GetNatRuleListDataSourceTranslationFallback build() {
            final var _resultValue = new GetNatRuleListDataSourceTranslationFallback();
            _resultValue.interface_ = interface_;
            return _resultValue;
        }
    }
}