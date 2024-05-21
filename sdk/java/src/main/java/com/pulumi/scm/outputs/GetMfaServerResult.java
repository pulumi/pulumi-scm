// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetMfaServerMfaVendorType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMfaServerResult {
    /**
     * @return The Id param.
     * 
     */
    private String id;
    /**
     * @return The MfaCertProfile param.
     * 
     */
    private String mfaCertProfile;
    /**
     * @return The MfaVendorType param.
     * 
     */
    private GetMfaServerMfaVendorType mfaVendorType;
    /**
     * @return The Name param.
     * 
     */
    private String name;
    private String tfid;

    private GetMfaServerResult() {}
    /**
     * @return The Id param.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The MfaCertProfile param.
     * 
     */
    public String mfaCertProfile() {
        return this.mfaCertProfile;
    }
    /**
     * @return The MfaVendorType param.
     * 
     */
    public GetMfaServerMfaVendorType mfaVendorType() {
        return this.mfaVendorType;
    }
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }
    public String tfid() {
        return this.tfid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMfaServerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String mfaCertProfile;
        private GetMfaServerMfaVendorType mfaVendorType;
        private String name;
        private String tfid;
        public Builder() {}
        public Builder(GetMfaServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.mfaCertProfile = defaults.mfaCertProfile;
    	      this.mfaVendorType = defaults.mfaVendorType;
    	      this.name = defaults.name;
    	      this.tfid = defaults.tfid;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetMfaServerResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mfaCertProfile(String mfaCertProfile) {
            if (mfaCertProfile == null) {
              throw new MissingRequiredPropertyException("GetMfaServerResult", "mfaCertProfile");
            }
            this.mfaCertProfile = mfaCertProfile;
            return this;
        }
        @CustomType.Setter
        public Builder mfaVendorType(GetMfaServerMfaVendorType mfaVendorType) {
            if (mfaVendorType == null) {
              throw new MissingRequiredPropertyException("GetMfaServerResult", "mfaVendorType");
            }
            this.mfaVendorType = mfaVendorType;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetMfaServerResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tfid(String tfid) {
            if (tfid == null) {
              throw new MissingRequiredPropertyException("GetMfaServerResult", "tfid");
            }
            this.tfid = tfid;
            return this;
        }
        public GetMfaServerResult build() {
            final var _resultValue = new GetMfaServerResult();
            _resultValue.id = id;
            _resultValue.mfaCertProfile = mfaCertProfile;
            _resultValue.mfaVendorType = mfaVendorType;
            _resultValue.name = name;
            _resultValue.tfid = tfid;
            return _resultValue;
        }
    }
}
