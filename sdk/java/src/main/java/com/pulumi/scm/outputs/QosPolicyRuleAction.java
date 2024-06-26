// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QosPolicyRuleAction {
    /**
     * @return The Class param.
     * 
     */
    private @Nullable String class_;

    private QosPolicyRuleAction() {}
    /**
     * @return The Class param.
     * 
     */
    public Optional<String> class_() {
        return Optional.ofNullable(this.class_);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QosPolicyRuleAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String class_;
        public Builder() {}
        public Builder(QosPolicyRuleAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.class_ = defaults.class_;
        }

        @CustomType.Setter("class")
        public Builder class_(@Nullable String class_) {

            this.class_ = class_;
            return this;
        }
        public QosPolicyRuleAction build() {
            final var _resultValue = new QosPolicyRuleAction();
            _resultValue.class_ = class_;
            return _resultValue;
        }
    }
}
