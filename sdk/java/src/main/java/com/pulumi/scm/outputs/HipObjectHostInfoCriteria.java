// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scm.outputs.HipObjectHostInfoCriteriaClientVersion;
import com.pulumi.scm.outputs.HipObjectHostInfoCriteriaDomain;
import com.pulumi.scm.outputs.HipObjectHostInfoCriteriaHostId;
import com.pulumi.scm.outputs.HipObjectHostInfoCriteriaHostName;
import com.pulumi.scm.outputs.HipObjectHostInfoCriteriaOs;
import com.pulumi.scm.outputs.HipObjectHostInfoCriteriaSerialNumber;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HipObjectHostInfoCriteria {
    /**
     * @return The ClientVersion param.
     * 
     */
    private @Nullable HipObjectHostInfoCriteriaClientVersion clientVersion;
    /**
     * @return The Domain param.
     * 
     */
    private @Nullable HipObjectHostInfoCriteriaDomain domain;
    /**
     * @return The HostId param.
     * 
     */
    private @Nullable HipObjectHostInfoCriteriaHostId hostId;
    /**
     * @return The HostName param.
     * 
     */
    private @Nullable HipObjectHostInfoCriteriaHostName hostName;
    /**
     * @return If device is managed.
     * 
     */
    private @Nullable Boolean managed;
    /**
     * @return The Os param.
     * 
     */
    private @Nullable HipObjectHostInfoCriteriaOs os;
    /**
     * @return The SerialNumber param.
     * 
     */
    private @Nullable HipObjectHostInfoCriteriaSerialNumber serialNumber;

    private HipObjectHostInfoCriteria() {}
    /**
     * @return The ClientVersion param.
     * 
     */
    public Optional<HipObjectHostInfoCriteriaClientVersion> clientVersion() {
        return Optional.ofNullable(this.clientVersion);
    }
    /**
     * @return The Domain param.
     * 
     */
    public Optional<HipObjectHostInfoCriteriaDomain> domain() {
        return Optional.ofNullable(this.domain);
    }
    /**
     * @return The HostId param.
     * 
     */
    public Optional<HipObjectHostInfoCriteriaHostId> hostId() {
        return Optional.ofNullable(this.hostId);
    }
    /**
     * @return The HostName param.
     * 
     */
    public Optional<HipObjectHostInfoCriteriaHostName> hostName() {
        return Optional.ofNullable(this.hostName);
    }
    /**
     * @return If device is managed.
     * 
     */
    public Optional<Boolean> managed() {
        return Optional.ofNullable(this.managed);
    }
    /**
     * @return The Os param.
     * 
     */
    public Optional<HipObjectHostInfoCriteriaOs> os() {
        return Optional.ofNullable(this.os);
    }
    /**
     * @return The SerialNumber param.
     * 
     */
    public Optional<HipObjectHostInfoCriteriaSerialNumber> serialNumber() {
        return Optional.ofNullable(this.serialNumber);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HipObjectHostInfoCriteria defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable HipObjectHostInfoCriteriaClientVersion clientVersion;
        private @Nullable HipObjectHostInfoCriteriaDomain domain;
        private @Nullable HipObjectHostInfoCriteriaHostId hostId;
        private @Nullable HipObjectHostInfoCriteriaHostName hostName;
        private @Nullable Boolean managed;
        private @Nullable HipObjectHostInfoCriteriaOs os;
        private @Nullable HipObjectHostInfoCriteriaSerialNumber serialNumber;
        public Builder() {}
        public Builder(HipObjectHostInfoCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientVersion = defaults.clientVersion;
    	      this.domain = defaults.domain;
    	      this.hostId = defaults.hostId;
    	      this.hostName = defaults.hostName;
    	      this.managed = defaults.managed;
    	      this.os = defaults.os;
    	      this.serialNumber = defaults.serialNumber;
        }

        @CustomType.Setter
        public Builder clientVersion(@Nullable HipObjectHostInfoCriteriaClientVersion clientVersion) {

            this.clientVersion = clientVersion;
            return this;
        }
        @CustomType.Setter
        public Builder domain(@Nullable HipObjectHostInfoCriteriaDomain domain) {

            this.domain = domain;
            return this;
        }
        @CustomType.Setter
        public Builder hostId(@Nullable HipObjectHostInfoCriteriaHostId hostId) {

            this.hostId = hostId;
            return this;
        }
        @CustomType.Setter
        public Builder hostName(@Nullable HipObjectHostInfoCriteriaHostName hostName) {

            this.hostName = hostName;
            return this;
        }
        @CustomType.Setter
        public Builder managed(@Nullable Boolean managed) {

            this.managed = managed;
            return this;
        }
        @CustomType.Setter
        public Builder os(@Nullable HipObjectHostInfoCriteriaOs os) {

            this.os = os;
            return this;
        }
        @CustomType.Setter
        public Builder serialNumber(@Nullable HipObjectHostInfoCriteriaSerialNumber serialNumber) {

            this.serialNumber = serialNumber;
            return this;
        }
        public HipObjectHostInfoCriteria build() {
            final var _resultValue = new HipObjectHostInfoCriteria();
            _resultValue.clientVersion = clientVersion;
            _resultValue.domain = domain;
            _resultValue.hostId = hostId;
            _resultValue.hostName = hostName;
            _resultValue.managed = managed;
            _resultValue.os = os;
            _resultValue.serialNumber = serialNumber;
            return _resultValue;
        }
    }
}