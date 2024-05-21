// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetServiceConnectionListDataBgpPeer;
import com.pulumi.scm.outputs.GetServiceConnectionListDataProtocol;
import com.pulumi.scm.outputs.GetServiceConnectionListDataQos;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceConnectionListData {
    /**
     * @return The BackupSC param.
     * 
     */
    private String backupSC;
    /**
     * @return The BgpPeer param.
     * 
     */
    private GetServiceConnectionListDataBgpPeer bgpPeer;
    /**
     * @return UUID of the resource.
     * 
     */
    private String id;
    /**
     * @return The IpsecTunnel param.
     * 
     */
    private String ipsecTunnel;
    /**
     * @return The Name param.
     * 
     */
    private String name;
    /**
     * @return The NatPool param.
     * 
     */
    private String natPool;
    /**
     * @return The NoExportCommunity param. String must be one of these: `&#34;Disabled&#34;`, `&#34;Enabled-In&#34;`, `&#34;Enabled-Out&#34;`, `&#34;Enabled-Both&#34;`.
     * 
     */
    private String noExportCommunity;
    /**
     * @return The OnboardingType param. String must be one of these: `&#34;classic&#34;`. Default: `&#34;classic&#34;`.
     * 
     */
    private String onboardingType;
    /**
     * @return The Protocol param.
     * 
     */
    private GetServiceConnectionListDataProtocol protocol;
    /**
     * @return The Qos param.
     * 
     */
    private GetServiceConnectionListDataQos qos;
    /**
     * @return The Region param.
     * 
     */
    private String region;
    /**
     * @return The SecondaryIpsecTunnel param.
     * 
     */
    private String secondaryIpsecTunnel;
    /**
     * @return The SourceNat param.
     * 
     */
    private Boolean sourceNat;
    /**
     * @return The Subnets param.
     * 
     */
    private List<String> subnets;

    private GetServiceConnectionListData() {}
    /**
     * @return The BackupSC param.
     * 
     */
    public String backupSC() {
        return this.backupSC;
    }
    /**
     * @return The BgpPeer param.
     * 
     */
    public GetServiceConnectionListDataBgpPeer bgpPeer() {
        return this.bgpPeer;
    }
    /**
     * @return UUID of the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The IpsecTunnel param.
     * 
     */
    public String ipsecTunnel() {
        return this.ipsecTunnel;
    }
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The NatPool param.
     * 
     */
    public String natPool() {
        return this.natPool;
    }
    /**
     * @return The NoExportCommunity param. String must be one of these: `&#34;Disabled&#34;`, `&#34;Enabled-In&#34;`, `&#34;Enabled-Out&#34;`, `&#34;Enabled-Both&#34;`.
     * 
     */
    public String noExportCommunity() {
        return this.noExportCommunity;
    }
    /**
     * @return The OnboardingType param. String must be one of these: `&#34;classic&#34;`. Default: `&#34;classic&#34;`.
     * 
     */
    public String onboardingType() {
        return this.onboardingType;
    }
    /**
     * @return The Protocol param.
     * 
     */
    public GetServiceConnectionListDataProtocol protocol() {
        return this.protocol;
    }
    /**
     * @return The Qos param.
     * 
     */
    public GetServiceConnectionListDataQos qos() {
        return this.qos;
    }
    /**
     * @return The Region param.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The SecondaryIpsecTunnel param.
     * 
     */
    public String secondaryIpsecTunnel() {
        return this.secondaryIpsecTunnel;
    }
    /**
     * @return The SourceNat param.
     * 
     */
    public Boolean sourceNat() {
        return this.sourceNat;
    }
    /**
     * @return The Subnets param.
     * 
     */
    public List<String> subnets() {
        return this.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceConnectionListData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String backupSC;
        private GetServiceConnectionListDataBgpPeer bgpPeer;
        private String id;
        private String ipsecTunnel;
        private String name;
        private String natPool;
        private String noExportCommunity;
        private String onboardingType;
        private GetServiceConnectionListDataProtocol protocol;
        private GetServiceConnectionListDataQos qos;
        private String region;
        private String secondaryIpsecTunnel;
        private Boolean sourceNat;
        private List<String> subnets;
        public Builder() {}
        public Builder(GetServiceConnectionListData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupSC = defaults.backupSC;
    	      this.bgpPeer = defaults.bgpPeer;
    	      this.id = defaults.id;
    	      this.ipsecTunnel = defaults.ipsecTunnel;
    	      this.name = defaults.name;
    	      this.natPool = defaults.natPool;
    	      this.noExportCommunity = defaults.noExportCommunity;
    	      this.onboardingType = defaults.onboardingType;
    	      this.protocol = defaults.protocol;
    	      this.qos = defaults.qos;
    	      this.region = defaults.region;
    	      this.secondaryIpsecTunnel = defaults.secondaryIpsecTunnel;
    	      this.sourceNat = defaults.sourceNat;
    	      this.subnets = defaults.subnets;
        }

        @CustomType.Setter
        public Builder backupSC(String backupSC) {
            if (backupSC == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListData", "backupSC");
            }
            this.backupSC = backupSC;
            return this;
        }
        @CustomType.Setter
        public Builder bgpPeer(GetServiceConnectionListDataBgpPeer bgpPeer) {
            if (bgpPeer == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListData", "bgpPeer");
            }
            this.bgpPeer = bgpPeer;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListData", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipsecTunnel(String ipsecTunnel) {
            if (ipsecTunnel == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListData", "ipsecTunnel");
            }
            this.ipsecTunnel = ipsecTunnel;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListData", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder natPool(String natPool) {
            if (natPool == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListData", "natPool");
            }
            this.natPool = natPool;
            return this;
        }
        @CustomType.Setter
        public Builder noExportCommunity(String noExportCommunity) {
            if (noExportCommunity == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListData", "noExportCommunity");
            }
            this.noExportCommunity = noExportCommunity;
            return this;
        }
        @CustomType.Setter
        public Builder onboardingType(String onboardingType) {
            if (onboardingType == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListData", "onboardingType");
            }
            this.onboardingType = onboardingType;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(GetServiceConnectionListDataProtocol protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListData", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        @CustomType.Setter
        public Builder qos(GetServiceConnectionListDataQos qos) {
            if (qos == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListData", "qos");
            }
            this.qos = qos;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListData", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder secondaryIpsecTunnel(String secondaryIpsecTunnel) {
            if (secondaryIpsecTunnel == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListData", "secondaryIpsecTunnel");
            }
            this.secondaryIpsecTunnel = secondaryIpsecTunnel;
            return this;
        }
        @CustomType.Setter
        public Builder sourceNat(Boolean sourceNat) {
            if (sourceNat == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListData", "sourceNat");
            }
            this.sourceNat = sourceNat;
            return this;
        }
        @CustomType.Setter
        public Builder subnets(List<String> subnets) {
            if (subnets == null) {
              throw new MissingRequiredPropertyException("GetServiceConnectionListData", "subnets");
            }
            this.subnets = subnets;
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }
        public GetServiceConnectionListData build() {
            final var _resultValue = new GetServiceConnectionListData();
            _resultValue.backupSC = backupSC;
            _resultValue.bgpPeer = bgpPeer;
            _resultValue.id = id;
            _resultValue.ipsecTunnel = ipsecTunnel;
            _resultValue.name = name;
            _resultValue.natPool = natPool;
            _resultValue.noExportCommunity = noExportCommunity;
            _resultValue.onboardingType = onboardingType;
            _resultValue.protocol = protocol;
            _resultValue.qos = qos;
            _resultValue.region = region;
            _resultValue.secondaryIpsecTunnel = secondaryIpsecTunnel;
            _resultValue.sourceNat = sourceNat;
            _resultValue.subnets = subnets;
            return _resultValue;
        }
    }
}
