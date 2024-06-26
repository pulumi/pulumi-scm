// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetAntiSpywareProfileRuleAction;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAntiSpywareProfileRule {
    /**
     * @return The Action param.
     * 
     */
    private GetAntiSpywareProfileRuleAction action;
    /**
     * @return The Category param. String must be one of these: `&#34;dns-proxy&#34;`, `&#34;backdoor&#34;`, `&#34;data-theft&#34;`, `&#34;autogen&#34;`, `&#34;spyware&#34;`, `&#34;dns-security&#34;`, `&#34;downloader&#34;`, `&#34;dns-phishing&#34;`, `&#34;phishing-kit&#34;`, `&#34;cryptominer&#34;`, `&#34;hacktool&#34;`, `&#34;dns-benign&#34;`, `&#34;dns-wildfire&#34;`, `&#34;botnet&#34;`, `&#34;dns-grayware&#34;`, `&#34;inline-cloud-c2&#34;`, `&#34;keylogger&#34;`, `&#34;p2p-communication&#34;`, `&#34;domain-edl&#34;`, `&#34;webshell&#34;`, `&#34;command-and-control&#34;`, `&#34;dns-ddns&#34;`, `&#34;net-worm&#34;`, `&#34;any&#34;`, `&#34;tls-fingerprint&#34;`, `&#34;dns-new-domain&#34;`, `&#34;dns&#34;`, `&#34;fraud&#34;`, `&#34;dns-c2&#34;`, `&#34;adware&#34;`, `&#34;post-exploitation&#34;`, `&#34;dns-malware&#34;`, `&#34;browser-hijack&#34;`, `&#34;dns-parked&#34;`.
     * 
     */
    private String category;
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
    /**
     * @return The Severities param.
     * 
     */
    private List<String> severities;
    /**
     * @return The ThreatName param. String length must exceed 4 characters.
     * 
     */
    private String threatName;

    private GetAntiSpywareProfileRule() {}
    /**
     * @return The Action param.
     * 
     */
    public GetAntiSpywareProfileRuleAction action() {
        return this.action;
    }
    /**
     * @return The Category param. String must be one of these: `&#34;dns-proxy&#34;`, `&#34;backdoor&#34;`, `&#34;data-theft&#34;`, `&#34;autogen&#34;`, `&#34;spyware&#34;`, `&#34;dns-security&#34;`, `&#34;downloader&#34;`, `&#34;dns-phishing&#34;`, `&#34;phishing-kit&#34;`, `&#34;cryptominer&#34;`, `&#34;hacktool&#34;`, `&#34;dns-benign&#34;`, `&#34;dns-wildfire&#34;`, `&#34;botnet&#34;`, `&#34;dns-grayware&#34;`, `&#34;inline-cloud-c2&#34;`, `&#34;keylogger&#34;`, `&#34;p2p-communication&#34;`, `&#34;domain-edl&#34;`, `&#34;webshell&#34;`, `&#34;command-and-control&#34;`, `&#34;dns-ddns&#34;`, `&#34;net-worm&#34;`, `&#34;any&#34;`, `&#34;tls-fingerprint&#34;`, `&#34;dns-new-domain&#34;`, `&#34;dns&#34;`, `&#34;fraud&#34;`, `&#34;dns-c2&#34;`, `&#34;adware&#34;`, `&#34;post-exploitation&#34;`, `&#34;dns-malware&#34;`, `&#34;browser-hijack&#34;`, `&#34;dns-parked&#34;`.
     * 
     */
    public String category() {
        return this.category;
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
    /**
     * @return The Severities param.
     * 
     */
    public List<String> severities() {
        return this.severities;
    }
    /**
     * @return The ThreatName param. String length must exceed 4 characters.
     * 
     */
    public String threatName() {
        return this.threatName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAntiSpywareProfileRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetAntiSpywareProfileRuleAction action;
        private String category;
        private String name;
        private String packetCapture;
        private List<String> severities;
        private String threatName;
        public Builder() {}
        public Builder(GetAntiSpywareProfileRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.category = defaults.category;
    	      this.name = defaults.name;
    	      this.packetCapture = defaults.packetCapture;
    	      this.severities = defaults.severities;
    	      this.threatName = defaults.threatName;
        }

        @CustomType.Setter
        public Builder action(GetAntiSpywareProfileRuleAction action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareProfileRule", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder category(String category) {
            if (category == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareProfileRule", "category");
            }
            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareProfileRule", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder packetCapture(String packetCapture) {
            if (packetCapture == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareProfileRule", "packetCapture");
            }
            this.packetCapture = packetCapture;
            return this;
        }
        @CustomType.Setter
        public Builder severities(List<String> severities) {
            if (severities == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareProfileRule", "severities");
            }
            this.severities = severities;
            return this;
        }
        public Builder severities(String... severities) {
            return severities(List.of(severities));
        }
        @CustomType.Setter
        public Builder threatName(String threatName) {
            if (threatName == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareProfileRule", "threatName");
            }
            this.threatName = threatName;
            return this;
        }
        public GetAntiSpywareProfileRule build() {
            final var _resultValue = new GetAntiSpywareProfileRule();
            _resultValue.action = action;
            _resultValue.category = category;
            _resultValue.name = name;
            _resultValue.packetCapture = packetCapture;
            _resultValue.severities = severities;
            _resultValue.threatName = threatName;
            return _resultValue;
        }
    }
}
