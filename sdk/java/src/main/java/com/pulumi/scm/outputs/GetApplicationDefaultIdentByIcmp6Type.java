// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplicationDefaultIdentByIcmp6Type {
    /**
     * @return The Code param.
     * 
     */
    private String code;
    /**
     * @return The Type param.
     * 
     */
    private String type;

    private GetApplicationDefaultIdentByIcmp6Type() {}
    /**
     * @return The Code param.
     * 
     */
    public String code() {
        return this.code;
    }
    /**
     * @return The Type param.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationDefaultIdentByIcmp6Type defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String code;
        private String type;
        public Builder() {}
        public Builder(GetApplicationDefaultIdentByIcmp6Type defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder code(String code) {
            if (code == null) {
              throw new MissingRequiredPropertyException("GetApplicationDefaultIdentByIcmp6Type", "code");
            }
            this.code = code;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetApplicationDefaultIdentByIcmp6Type", "type");
            }
            this.type = type;
            return this;
        }
        public GetApplicationDefaultIdentByIcmp6Type build() {
            final var _resultValue = new GetApplicationDefaultIdentByIcmp6Type();
            _resultValue.code = code;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
