// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWildfireAntiVirusProfileThreatException {
    /**
     * @return The Name param.
     * 
     */
    private String name;
    /**
     * @return The Notes param.
     * 
     */
    private String notes;

    private GetWildfireAntiVirusProfileThreatException() {}
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Notes param.
     * 
     */
    public String notes() {
        return this.notes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWildfireAntiVirusProfileThreatException defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String notes;
        public Builder() {}
        public Builder(GetWildfireAntiVirusProfileThreatException defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.notes = defaults.notes;
        }

        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetWildfireAntiVirusProfileThreatException", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder notes(String notes) {
            if (notes == null) {
              throw new MissingRequiredPropertyException("GetWildfireAntiVirusProfileThreatException", "notes");
            }
            this.notes = notes;
            return this;
        }
        public GetWildfireAntiVirusProfileThreatException build() {
            final var _resultValue = new GetWildfireAntiVirusProfileThreatException();
            _resultValue.name = name;
            _resultValue.notes = notes;
            return _resultValue;
        }
    }
}
