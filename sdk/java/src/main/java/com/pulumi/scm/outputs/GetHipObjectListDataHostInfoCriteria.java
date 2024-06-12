// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetHipObjectListDataHostInfoCriteriaClientVersion;
import com.pulumi.scm.outputs.GetHipObjectListDataHostInfoCriteriaDomain;
import com.pulumi.scm.outputs.GetHipObjectListDataHostInfoCriteriaHostId;
import com.pulumi.scm.outputs.GetHipObjectListDataHostInfoCriteriaHostName;
import com.pulumi.scm.outputs.GetHipObjectListDataHostInfoCriteriaOs;
import com.pulumi.scm.outputs.GetHipObjectListDataHostInfoCriteriaSerialNumber;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetHipObjectListDataHostInfoCriteria {
    /**
     * @return The ClientVersion param.
     * 
     */
    private GetHipObjectListDataHostInfoCriteriaClientVersion clientVersion;
    /**
     * @return The Domain param.
     * 
     */
    private GetHipObjectListDataHostInfoCriteriaDomain domain;
    /**
     * @return The HostId param.
     * 
     */
    private GetHipObjectListDataHostInfoCriteriaHostId hostId;
    /**
     * @return The HostName param.
     * 
     */
    private GetHipObjectListDataHostInfoCriteriaHostName hostName;
    /**
     * @return If device is managed.
     * 
     */
    private Boolean managed;
    /**
     * @return The Os param.
     * 
     */
    private GetHipObjectListDataHostInfoCriteriaOs os;
    /**
     * @return The SerialNumber param.
     * 
     */
    private GetHipObjectListDataHostInfoCriteriaSerialNumber serialNumber;

    private GetHipObjectListDataHostInfoCriteria() {}
    /**
     * @return The ClientVersion param.
     * 
     */
    public GetHipObjectListDataHostInfoCriteriaClientVersion clientVersion() {
        return this.clientVersion;
    }
    /**
     * @return The Domain param.
     * 
     */
    public GetHipObjectListDataHostInfoCriteriaDomain domain() {
        return this.domain;
    }
    /**
     * @return The HostId param.
     * 
     */
    public GetHipObjectListDataHostInfoCriteriaHostId hostId() {
        return this.hostId;
    }
    /**
     * @return The HostName param.
     * 
     */
    public GetHipObjectListDataHostInfoCriteriaHostName hostName() {
        return this.hostName;
    }
    /**
     * @return If device is managed.
     * 
     */
    public Boolean managed() {
        return this.managed;
    }
    /**
     * @return The Os param.
     * 
     */
    public GetHipObjectListDataHostInfoCriteriaOs os() {
        return this.os;
    }
    /**
     * @return The SerialNumber param.
     * 
     */
    public GetHipObjectListDataHostInfoCriteriaSerialNumber serialNumber() {
        return this.serialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectListDataHostInfoCriteria defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetHipObjectListDataHostInfoCriteriaClientVersion clientVersion;
        private GetHipObjectListDataHostInfoCriteriaDomain domain;
        private GetHipObjectListDataHostInfoCriteriaHostId hostId;
        private GetHipObjectListDataHostInfoCriteriaHostName hostName;
        private Boolean managed;
        private GetHipObjectListDataHostInfoCriteriaOs os;
        private GetHipObjectListDataHostInfoCriteriaSerialNumber serialNumber;
        public Builder() {}
        public Builder(GetHipObjectListDataHostInfoCriteria defaults) {
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
        public Builder clientVersion(GetHipObjectListDataHostInfoCriteriaClientVersion clientVersion) {
            if (clientVersion == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataHostInfoCriteria", "clientVersion");
            }
            this.clientVersion = clientVersion;
            return this;
        }
        @CustomType.Setter
        public Builder domain(GetHipObjectListDataHostInfoCriteriaDomain domain) {
            if (domain == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataHostInfoCriteria", "domain");
            }
            this.domain = domain;
            return this;
        }
        @CustomType.Setter
        public Builder hostId(GetHipObjectListDataHostInfoCriteriaHostId hostId) {
            if (hostId == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataHostInfoCriteria", "hostId");
            }
            this.hostId = hostId;
            return this;
        }
        @CustomType.Setter
        public Builder hostName(GetHipObjectListDataHostInfoCriteriaHostName hostName) {
            if (hostName == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataHostInfoCriteria", "hostName");
            }
            this.hostName = hostName;
            return this;
        }
        @CustomType.Setter
        public Builder managed(Boolean managed) {
            if (managed == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataHostInfoCriteria", "managed");
            }
            this.managed = managed;
            return this;
        }
        @CustomType.Setter
        public Builder os(GetHipObjectListDataHostInfoCriteriaOs os) {
            if (os == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataHostInfoCriteria", "os");
            }
            this.os = os;
            return this;
        }
        @CustomType.Setter
        public Builder serialNumber(GetHipObjectListDataHostInfoCriteriaSerialNumber serialNumber) {
            if (serialNumber == null) {
              throw new MissingRequiredPropertyException("GetHipObjectListDataHostInfoCriteria", "serialNumber");
            }
            this.serialNumber = serialNumber;
            return this;
        }
        public GetHipObjectListDataHostInfoCriteria build() {
            final var _resultValue = new GetHipObjectListDataHostInfoCriteria();
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