// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetIpsecTunnelListDataAutoKeyProxyIdV6Protocol;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIpsecTunnelListDataAutoKeyProxyIdV6 {
    /**
     * @return The Local param.
     * 
     */
    private String local;
    /**
     * @return The Name param.
     * 
     */
    private String name;
    /**
     * @return The Protocol param.
     * 
     */
    private GetIpsecTunnelListDataAutoKeyProxyIdV6Protocol protocol;
    /**
     * @return The Remote param.
     * 
     */
    private String remote;

    private GetIpsecTunnelListDataAutoKeyProxyIdV6() {}
    /**
     * @return The Local param.
     * 
     */
    public String local() {
        return this.local;
    }
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Protocol param.
     * 
     */
    public GetIpsecTunnelListDataAutoKeyProxyIdV6Protocol protocol() {
        return this.protocol;
    }
    /**
     * @return The Remote param.
     * 
     */
    public String remote() {
        return this.remote;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpsecTunnelListDataAutoKeyProxyIdV6 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String local;
        private String name;
        private GetIpsecTunnelListDataAutoKeyProxyIdV6Protocol protocol;
        private String remote;
        public Builder() {}
        public Builder(GetIpsecTunnelListDataAutoKeyProxyIdV6 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.local = defaults.local;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
    	      this.remote = defaults.remote;
        }

        @CustomType.Setter
        public Builder local(String local) {
            if (local == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListDataAutoKeyProxyIdV6", "local");
            }
            this.local = local;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListDataAutoKeyProxyIdV6", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(GetIpsecTunnelListDataAutoKeyProxyIdV6Protocol protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListDataAutoKeyProxyIdV6", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder remote(String remote) {
            if (remote == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListDataAutoKeyProxyIdV6", "remote");
            }
            this.remote = remote;
            return this;
        }
        public GetIpsecTunnelListDataAutoKeyProxyIdV6 build() {
            final var _resultValue = new GetIpsecTunnelListDataAutoKeyProxyIdV6();
            _resultValue.local = local;
            _resultValue.name = name;
            _resultValue.protocol = protocol;
            _resultValue.remote = remote;
            return _resultValue;
        }
    }
}