// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetDnsSecurityProfileListDataBotnetDomainsListAction;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDnsSecurityProfileListDataBotnetDomainsList {
    /**
     * @return The Action param.
     * 
     */
    private GetDnsSecurityProfileListDataBotnetDomainsListAction action;
    /**
     * @return The Name param.
     * 
     */
    private String name;
    /**
     * @return The PacketCapture param. String must be one of these: `&#34;disable&#34;`, `&#34;single-packet&#34;`, `&#34;extended-capture&#34;`.
     * 
     */
    private String packetCapture;

    private GetDnsSecurityProfileListDataBotnetDomainsList() {}
    /**
     * @return The Action param.
     * 
     */
    public GetDnsSecurityProfileListDataBotnetDomainsListAction action() {
        return this.action;
    }
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The PacketCapture param. String must be one of these: `&#34;disable&#34;`, `&#34;single-packet&#34;`, `&#34;extended-capture&#34;`.
     * 
     */
    public String packetCapture() {
        return this.packetCapture;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDnsSecurityProfileListDataBotnetDomainsList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetDnsSecurityProfileListDataBotnetDomainsListAction action;
        private String name;
        private String packetCapture;
        public Builder() {}
        public Builder(GetDnsSecurityProfileListDataBotnetDomainsList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.name = defaults.name;
    	      this.packetCapture = defaults.packetCapture;
        }

        @CustomType.Setter
        public Builder action(GetDnsSecurityProfileListDataBotnetDomainsListAction action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("GetDnsSecurityProfileListDataBotnetDomainsList", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDnsSecurityProfileListDataBotnetDomainsList", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder packetCapture(String packetCapture) {
            if (packetCapture == null) {
              throw new MissingRequiredPropertyException("GetDnsSecurityProfileListDataBotnetDomainsList", "packetCapture");
            }
            this.packetCapture = packetCapture;
            return this;
        }
        public GetDnsSecurityProfileListDataBotnetDomainsList build() {
            final var _resultValue = new GetDnsSecurityProfileListDataBotnetDomainsList();
            _resultValue.action = action;
            _resultValue.name = name;
            _resultValue.packetCapture = packetCapture;
            return _resultValue;
        }
    }
}