// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLdapServerProfileListDataServer {
    /**
     * @return The Address param.
     * 
     */
    private String address;
    /**
     * @return The Name param.
     * 
     */
    private String name;
    /**
     * @return The Port param. Value must be between 1 and 65535.
     * 
     */
    private Integer port;

    private GetLdapServerProfileListDataServer() {}
    /**
     * @return The Address param.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Port param. Value must be between 1 and 65535.
     * 
     */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLdapServerProfileListDataServer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String name;
        private Integer port;
        public Builder() {}
        public Builder(GetLdapServerProfileListDataServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetLdapServerProfileListDataServer", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetLdapServerProfileListDataServer", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetLdapServerProfileListDataServer", "port");
            }
            this.port = port;
            return this;
        }
        public GetLdapServerProfileListDataServer build() {
            final var _resultValue = new GetLdapServerProfileListDataServer();
            _resultValue.address = address;
            _resultValue.name = name;
            _resultValue.port = port;
            return _resultValue;
        }
    }
}
