// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HipObjectPatchManagementCriteriaMissingPatchesSeverity {
    /**
     * @return The GreaterEqual param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    private @Nullable Integer greaterEqual;
    /**
     * @return The GreaterThan param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    private @Nullable Integer greaterThan;
    /**
     * @return The Is param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    private @Nullable Integer is;
    /**
     * @return The IsNot param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    private @Nullable Integer isNot;
    /**
     * @return The LessEqual param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    private @Nullable Integer lessEqual;
    /**
     * @return The LessThan param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    private @Nullable Integer lessThan;

    private HipObjectPatchManagementCriteriaMissingPatchesSeverity() {}
    /**
     * @return The GreaterEqual param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    public Optional<Integer> greaterEqual() {
        return Optional.ofNullable(this.greaterEqual);
    }
    /**
     * @return The GreaterThan param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    public Optional<Integer> greaterThan() {
        return Optional.ofNullable(this.greaterThan);
    }
    /**
     * @return The Is param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    public Optional<Integer> is() {
        return Optional.ofNullable(this.is);
    }
    /**
     * @return The IsNot param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    public Optional<Integer> isNot() {
        return Optional.ofNullable(this.isNot);
    }
    /**
     * @return The LessEqual param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    public Optional<Integer> lessEqual() {
        return Optional.ofNullable(this.lessEqual);
    }
    /**
     * @return The LessThan param. Value must be between 0 and 100000. Ensure that only one of the following is specified: `greater_equal`, `greater_than`, `is`, `is_not`, `less_equal`, `less_than`
     * 
     */
    public Optional<Integer> lessThan() {
        return Optional.ofNullable(this.lessThan);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HipObjectPatchManagementCriteriaMissingPatchesSeverity defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer greaterEqual;
        private @Nullable Integer greaterThan;
        private @Nullable Integer is;
        private @Nullable Integer isNot;
        private @Nullable Integer lessEqual;
        private @Nullable Integer lessThan;
        public Builder() {}
        public Builder(HipObjectPatchManagementCriteriaMissingPatchesSeverity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.greaterEqual = defaults.greaterEqual;
    	      this.greaterThan = defaults.greaterThan;
    	      this.is = defaults.is;
    	      this.isNot = defaults.isNot;
    	      this.lessEqual = defaults.lessEqual;
    	      this.lessThan = defaults.lessThan;
        }

        @CustomType.Setter
        public Builder greaterEqual(@Nullable Integer greaterEqual) {

            this.greaterEqual = greaterEqual;
            return this;
        }
        @CustomType.Setter
        public Builder greaterThan(@Nullable Integer greaterThan) {

            this.greaterThan = greaterThan;
            return this;
        }
        @CustomType.Setter
        public Builder is(@Nullable Integer is) {

            this.is = is;
            return this;
        }
        @CustomType.Setter
        public Builder isNot(@Nullable Integer isNot) {

            this.isNot = isNot;
            return this;
        }
        @CustomType.Setter
        public Builder lessEqual(@Nullable Integer lessEqual) {

            this.lessEqual = lessEqual;
            return this;
        }
        @CustomType.Setter
        public Builder lessThan(@Nullable Integer lessThan) {

            this.lessThan = lessThan;
            return this;
        }
        public HipObjectPatchManagementCriteriaMissingPatchesSeverity build() {
            final var _resultValue = new HipObjectPatchManagementCriteriaMissingPatchesSeverity();
            _resultValue.greaterEqual = greaterEqual;
            _resultValue.greaterThan = greaterThan;
            _resultValue.is = is;
            _resultValue.isNot = isNot;
            _resultValue.lessEqual = lessEqual;
            _resultValue.lessThan = lessThan;
            return _resultValue;
        }
    }
}
