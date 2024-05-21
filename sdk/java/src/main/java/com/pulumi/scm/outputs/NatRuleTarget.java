// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scm.outputs.NatRuleTargetDevice;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NatRuleTarget {
    /**
     * @return The Devices param.
     * 
     */
    private @Nullable List<NatRuleTargetDevice> devices;
    /**
     * @return The Negate param.
     * 
     */
    private @Nullable Boolean negate;
    /**
     * @return The Tags param.
     * 
     */
    private @Nullable List<String> tags;

    private NatRuleTarget() {}
    /**
     * @return The Devices param.
     * 
     */
    public List<NatRuleTargetDevice> devices() {
        return this.devices == null ? List.of() : this.devices;
    }
    /**
     * @return The Negate param.
     * 
     */
    public Optional<Boolean> negate() {
        return Optional.ofNullable(this.negate);
    }
    /**
     * @return The Tags param.
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NatRuleTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<NatRuleTargetDevice> devices;
        private @Nullable Boolean negate;
        private @Nullable List<String> tags;
        public Builder() {}
        public Builder(NatRuleTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devices = defaults.devices;
    	      this.negate = defaults.negate;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder devices(@Nullable List<NatRuleTargetDevice> devices) {

            this.devices = devices;
            return this;
        }
        public Builder devices(NatRuleTargetDevice... devices) {
            return devices(List.of(devices));
        }
        @CustomType.Setter
        public Builder negate(@Nullable Boolean negate) {

            this.negate = negate;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {

            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public NatRuleTarget build() {
            final var _resultValue = new NatRuleTarget();
            _resultValue.devices = devices;
            _resultValue.negate = negate;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
