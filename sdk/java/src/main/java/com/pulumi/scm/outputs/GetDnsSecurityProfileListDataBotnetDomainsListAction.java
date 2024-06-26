// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetDnsSecurityProfileListDataBotnetDomainsListAction {
    /**
     * @return The Alert param.
     * 
     */
    private Boolean alert;
    /**
     * @return The Allow param.
     * 
     */
    private Boolean allow;
    /**
     * @return The Block param.
     * 
     */
    private Boolean block;
    /**
     * @return The Sinkhole param.
     * 
     */
    private Boolean sinkhole;

    private GetDnsSecurityProfileListDataBotnetDomainsListAction() {}
    /**
     * @return The Alert param.
     * 
     */
    public Boolean alert() {
        return this.alert;
    }
    /**
     * @return The Allow param.
     * 
     */
    public Boolean allow() {
        return this.allow;
    }
    /**
     * @return The Block param.
     * 
     */
    public Boolean block() {
        return this.block;
    }
    /**
     * @return The Sinkhole param.
     * 
     */
    public Boolean sinkhole() {
        return this.sinkhole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDnsSecurityProfileListDataBotnetDomainsListAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean alert;
        private Boolean allow;
        private Boolean block;
        private Boolean sinkhole;
        public Builder() {}
        public Builder(GetDnsSecurityProfileListDataBotnetDomainsListAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alert = defaults.alert;
    	      this.allow = defaults.allow;
    	      this.block = defaults.block;
    	      this.sinkhole = defaults.sinkhole;
        }

        @CustomType.Setter
        public Builder alert(Boolean alert) {
            if (alert == null) {
              throw new MissingRequiredPropertyException("GetDnsSecurityProfileListDataBotnetDomainsListAction", "alert");
            }
            this.alert = alert;
            return this;
        }
        @CustomType.Setter
        public Builder allow(Boolean allow) {
            if (allow == null) {
              throw new MissingRequiredPropertyException("GetDnsSecurityProfileListDataBotnetDomainsListAction", "allow");
            }
            this.allow = allow;
            return this;
        }
        @CustomType.Setter
        public Builder block(Boolean block) {
            if (block == null) {
              throw new MissingRequiredPropertyException("GetDnsSecurityProfileListDataBotnetDomainsListAction", "block");
            }
            this.block = block;
            return this;
        }
        @CustomType.Setter
        public Builder sinkhole(Boolean sinkhole) {
            if (sinkhole == null) {
              throw new MissingRequiredPropertyException("GetDnsSecurityProfileListDataBotnetDomainsListAction", "sinkhole");
            }
            this.sinkhole = sinkhole;
            return this;
        }
        public GetDnsSecurityProfileListDataBotnetDomainsListAction build() {
            final var _resultValue = new GetDnsSecurityProfileListDataBotnetDomainsListAction();
            _resultValue.alert = alert;
            _resultValue.allow = allow;
            _resultValue.block = block;
            _resultValue.sinkhole = sinkhole;
            return _resultValue;
        }
    }
}
