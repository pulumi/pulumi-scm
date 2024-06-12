// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetNatRuleListDataDestinationTranslationDnsRewrite;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNatRuleListDataDestinationTranslation {
    /**
     * @return The DnsRewrite param.
     * 
     */
    private GetNatRuleListDataDestinationTranslationDnsRewrite dnsRewrite;
    /**
     * @return The ip address to be translated. String validation regex: `^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$|^(?:[A-Fa-f0-9]{1,4}:){7}[A-Fa-f0-9]{1,4}$`.
     * 
     */
    private String translatedAddressSingle;
    /**
     * @return The TranslatedPort param.
     * 
     */
    private Integer translatedPort;

    private GetNatRuleListDataDestinationTranslation() {}
    /**
     * @return The DnsRewrite param.
     * 
     */
    public GetNatRuleListDataDestinationTranslationDnsRewrite dnsRewrite() {
        return this.dnsRewrite;
    }
    /**
     * @return The ip address to be translated. String validation regex: `^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$|^(?:[A-Fa-f0-9]{1,4}:){7}[A-Fa-f0-9]{1,4}$`.
     * 
     */
    public String translatedAddressSingle() {
        return this.translatedAddressSingle;
    }
    /**
     * @return The TranslatedPort param.
     * 
     */
    public Integer translatedPort() {
        return this.translatedPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatRuleListDataDestinationTranslation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetNatRuleListDataDestinationTranslationDnsRewrite dnsRewrite;
        private String translatedAddressSingle;
        private Integer translatedPort;
        public Builder() {}
        public Builder(GetNatRuleListDataDestinationTranslation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsRewrite = defaults.dnsRewrite;
    	      this.translatedAddressSingle = defaults.translatedAddressSingle;
    	      this.translatedPort = defaults.translatedPort;
        }

        @CustomType.Setter
        public Builder dnsRewrite(GetNatRuleListDataDestinationTranslationDnsRewrite dnsRewrite) {
            if (dnsRewrite == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListDataDestinationTranslation", "dnsRewrite");
            }
            this.dnsRewrite = dnsRewrite;
            return this;
        }
        @CustomType.Setter
        public Builder translatedAddressSingle(String translatedAddressSingle) {
            if (translatedAddressSingle == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListDataDestinationTranslation", "translatedAddressSingle");
            }
            this.translatedAddressSingle = translatedAddressSingle;
            return this;
        }
        @CustomType.Setter
        public Builder translatedPort(Integer translatedPort) {
            if (translatedPort == null) {
              throw new MissingRequiredPropertyException("GetNatRuleListDataDestinationTranslation", "translatedPort");
            }
            this.translatedPort = translatedPort;
            return this;
        }
        public GetNatRuleListDataDestinationTranslation build() {
            final var _resultValue = new GetNatRuleListDataDestinationTranslation();
            _resultValue.dnsRewrite = dnsRewrite;
            _resultValue.translatedAddressSingle = translatedAddressSingle;
            _resultValue.translatedPort = translatedPort;
            return _resultValue;
        }
    }
}