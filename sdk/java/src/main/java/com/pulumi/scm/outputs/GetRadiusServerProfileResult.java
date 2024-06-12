// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetRadiusServerProfileProtocol;
import com.pulumi.scm.outputs.GetRadiusServerProfileServer;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRadiusServerProfileResult {
    /**
     * @return The Id param.
     * 
     */
    private String id;
    /**
     * @return The Protocol param.
     * 
     */
    private GetRadiusServerProfileProtocol protocol;
    /**
     * @return The Retries param. Value must be between 1 and 5.
     * 
     */
    private Integer retries;
    /**
     * @return The Servers param.
     * 
     */
    private List<GetRadiusServerProfileServer> servers;
    private String tfid;
    /**
     * @return The Timeout param. Value must be between 1 and 120.
     * 
     */
    private Integer timeout;

    private GetRadiusServerProfileResult() {}
    /**
     * @return The Id param.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Protocol param.
     * 
     */
    public GetRadiusServerProfileProtocol protocol() {
        return this.protocol;
    }
    /**
     * @return The Retries param. Value must be between 1 and 5.
     * 
     */
    public Integer retries() {
        return this.retries;
    }
    /**
     * @return The Servers param.
     * 
     */
    public List<GetRadiusServerProfileServer> servers() {
        return this.servers;
    }
    public String tfid() {
        return this.tfid;
    }
    /**
     * @return The Timeout param. Value must be between 1 and 120.
     * 
     */
    public Integer timeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRadiusServerProfileResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private GetRadiusServerProfileProtocol protocol;
        private Integer retries;
        private List<GetRadiusServerProfileServer> servers;
        private String tfid;
        private Integer timeout;
        public Builder() {}
        public Builder(GetRadiusServerProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.protocol = defaults.protocol;
    	      this.retries = defaults.retries;
    	      this.servers = defaults.servers;
    	      this.tfid = defaults.tfid;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRadiusServerProfileResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(GetRadiusServerProfileProtocol protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("GetRadiusServerProfileResult", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder retries(Integer retries) {
            if (retries == null) {
              throw new MissingRequiredPropertyException("GetRadiusServerProfileResult", "retries");
            }
            this.retries = retries;
            return this;
        }
        @CustomType.Setter
        public Builder servers(List<GetRadiusServerProfileServer> servers) {
            if (servers == null) {
              throw new MissingRequiredPropertyException("GetRadiusServerProfileResult", "servers");
            }
            this.servers = servers;
            return this;
        }
        public Builder servers(GetRadiusServerProfileServer... servers) {
            return servers(List.of(servers));
        }
        @CustomType.Setter
        public Builder tfid(String tfid) {
            if (tfid == null) {
              throw new MissingRequiredPropertyException("GetRadiusServerProfileResult", "tfid");
            }
            this.tfid = tfid;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(Integer timeout) {
            if (timeout == null) {
              throw new MissingRequiredPropertyException("GetRadiusServerProfileResult", "timeout");
            }
            this.timeout = timeout;
            return this;
        }
        public GetRadiusServerProfileResult build() {
            final var _resultValue = new GetRadiusServerProfileResult();
            _resultValue.id = id;
            _resultValue.protocol = protocol;
            _resultValue.retries = retries;
            _resultValue.servers = servers;
            _resultValue.tfid = tfid;
            _resultValue.timeout = timeout;
            return _resultValue;
        }
    }
}