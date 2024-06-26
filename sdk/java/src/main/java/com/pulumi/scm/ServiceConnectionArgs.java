// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.inputs.ServiceConnectionBgpPeerArgs;
import com.pulumi.scm.inputs.ServiceConnectionProtocolArgs;
import com.pulumi.scm.inputs.ServiceConnectionQosArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceConnectionArgs Empty = new ServiceConnectionArgs();

    /**
     * The BackupSC param.
     * 
     */
    @Import(name="backupSC")
    private @Nullable Output<String> backupSC;

    /**
     * @return The BackupSC param.
     * 
     */
    public Optional<Output<String>> backupSC() {
        return Optional.ofNullable(this.backupSC);
    }

    /**
     * The BgpPeer param.
     * 
     */
    @Import(name="bgpPeer")
    private @Nullable Output<ServiceConnectionBgpPeerArgs> bgpPeer;

    /**
     * @return The BgpPeer param.
     * 
     */
    public Optional<Output<ServiceConnectionBgpPeerArgs>> bgpPeer() {
        return Optional.ofNullable(this.bgpPeer);
    }

    /**
     * The Folder param. String can either be a specific string(`&#34;Service Connections&#34;`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `&#34;Service Connections&#34;`.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return The Folder param. String can either be a specific string(`&#34;Service Connections&#34;`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `&#34;Service Connections&#34;`.
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * The IpsecTunnel param.
     * 
     */
    @Import(name="ipsecTunnel", required=true)
    private Output<String> ipsecTunnel;

    /**
     * @return The IpsecTunnel param.
     * 
     */
    public Output<String> ipsecTunnel() {
        return this.ipsecTunnel;
    }

    /**
     * The Name param.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Name param.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The NatPool param.
     * 
     */
    @Import(name="natPool")
    private @Nullable Output<String> natPool;

    /**
     * @return The NatPool param.
     * 
     */
    public Optional<Output<String>> natPool() {
        return Optional.ofNullable(this.natPool);
    }

    /**
     * The NoExportCommunity param. String must be one of these: `&#34;Disabled&#34;`, `&#34;Enabled-In&#34;`, `&#34;Enabled-Out&#34;`, `&#34;Enabled-Both&#34;`.
     * 
     */
    @Import(name="noExportCommunity")
    private @Nullable Output<String> noExportCommunity;

    /**
     * @return The NoExportCommunity param. String must be one of these: `&#34;Disabled&#34;`, `&#34;Enabled-In&#34;`, `&#34;Enabled-Out&#34;`, `&#34;Enabled-Both&#34;`.
     * 
     */
    public Optional<Output<String>> noExportCommunity() {
        return Optional.ofNullable(this.noExportCommunity);
    }

    /**
     * The OnboardingType param. String must be one of these: `&#34;classic&#34;`. Default: `&#34;classic&#34;`.
     * 
     */
    @Import(name="onboardingType")
    private @Nullable Output<String> onboardingType;

    /**
     * @return The OnboardingType param. String must be one of these: `&#34;classic&#34;`. Default: `&#34;classic&#34;`.
     * 
     */
    public Optional<Output<String>> onboardingType() {
        return Optional.ofNullable(this.onboardingType);
    }

    /**
     * The Protocol param.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<ServiceConnectionProtocolArgs> protocol;

    /**
     * @return The Protocol param.
     * 
     */
    public Optional<Output<ServiceConnectionProtocolArgs>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * The Qos param.
     * 
     */
    @Import(name="qos")
    private @Nullable Output<ServiceConnectionQosArgs> qos;

    /**
     * @return The Qos param.
     * 
     */
    public Optional<Output<ServiceConnectionQosArgs>> qos() {
        return Optional.ofNullable(this.qos);
    }

    /**
     * The Region param.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The Region param.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     * The SecondaryIpsecTunnel param.
     * 
     */
    @Import(name="secondaryIpsecTunnel")
    private @Nullable Output<String> secondaryIpsecTunnel;

    /**
     * @return The SecondaryIpsecTunnel param.
     * 
     */
    public Optional<Output<String>> secondaryIpsecTunnel() {
        return Optional.ofNullable(this.secondaryIpsecTunnel);
    }

    /**
     * The SourceNat param.
     * 
     */
    @Import(name="sourceNat")
    private @Nullable Output<Boolean> sourceNat;

    /**
     * @return The SourceNat param.
     * 
     */
    public Optional<Output<Boolean>> sourceNat() {
        return Optional.ofNullable(this.sourceNat);
    }

    /**
     * The Subnets param.
     * 
     */
    @Import(name="subnets")
    private @Nullable Output<List<String>> subnets;

    /**
     * @return The Subnets param.
     * 
     */
    public Optional<Output<List<String>>> subnets() {
        return Optional.ofNullable(this.subnets);
    }

    private ServiceConnectionArgs() {}

    private ServiceConnectionArgs(ServiceConnectionArgs $) {
        this.backupSC = $.backupSC;
        this.bgpPeer = $.bgpPeer;
        this.folder = $.folder;
        this.ipsecTunnel = $.ipsecTunnel;
        this.name = $.name;
        this.natPool = $.natPool;
        this.noExportCommunity = $.noExportCommunity;
        this.onboardingType = $.onboardingType;
        this.protocol = $.protocol;
        this.qos = $.qos;
        this.region = $.region;
        this.secondaryIpsecTunnel = $.secondaryIpsecTunnel;
        this.sourceNat = $.sourceNat;
        this.subnets = $.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceConnectionArgs $;

        public Builder() {
            $ = new ServiceConnectionArgs();
        }

        public Builder(ServiceConnectionArgs defaults) {
            $ = new ServiceConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupSC The BackupSC param.
         * 
         * @return builder
         * 
         */
        public Builder backupSC(@Nullable Output<String> backupSC) {
            $.backupSC = backupSC;
            return this;
        }

        /**
         * @param backupSC The BackupSC param.
         * 
         * @return builder
         * 
         */
        public Builder backupSC(String backupSC) {
            return backupSC(Output.of(backupSC));
        }

        /**
         * @param bgpPeer The BgpPeer param.
         * 
         * @return builder
         * 
         */
        public Builder bgpPeer(@Nullable Output<ServiceConnectionBgpPeerArgs> bgpPeer) {
            $.bgpPeer = bgpPeer;
            return this;
        }

        /**
         * @param bgpPeer The BgpPeer param.
         * 
         * @return builder
         * 
         */
        public Builder bgpPeer(ServiceConnectionBgpPeerArgs bgpPeer) {
            return bgpPeer(Output.of(bgpPeer));
        }

        /**
         * @param folder The Folder param. String can either be a specific string(`&#34;Service Connections&#34;`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `&#34;Service Connections&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The Folder param. String can either be a specific string(`&#34;Service Connections&#34;`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `&#34;Service Connections&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param ipsecTunnel The IpsecTunnel param.
         * 
         * @return builder
         * 
         */
        public Builder ipsecTunnel(Output<String> ipsecTunnel) {
            $.ipsecTunnel = ipsecTunnel;
            return this;
        }

        /**
         * @param ipsecTunnel The IpsecTunnel param.
         * 
         * @return builder
         * 
         */
        public Builder ipsecTunnel(String ipsecTunnel) {
            return ipsecTunnel(Output.of(ipsecTunnel));
        }

        /**
         * @param name The Name param.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name param.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param natPool The NatPool param.
         * 
         * @return builder
         * 
         */
        public Builder natPool(@Nullable Output<String> natPool) {
            $.natPool = natPool;
            return this;
        }

        /**
         * @param natPool The NatPool param.
         * 
         * @return builder
         * 
         */
        public Builder natPool(String natPool) {
            return natPool(Output.of(natPool));
        }

        /**
         * @param noExportCommunity The NoExportCommunity param. String must be one of these: `&#34;Disabled&#34;`, `&#34;Enabled-In&#34;`, `&#34;Enabled-Out&#34;`, `&#34;Enabled-Both&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder noExportCommunity(@Nullable Output<String> noExportCommunity) {
            $.noExportCommunity = noExportCommunity;
            return this;
        }

        /**
         * @param noExportCommunity The NoExportCommunity param. String must be one of these: `&#34;Disabled&#34;`, `&#34;Enabled-In&#34;`, `&#34;Enabled-Out&#34;`, `&#34;Enabled-Both&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder noExportCommunity(String noExportCommunity) {
            return noExportCommunity(Output.of(noExportCommunity));
        }

        /**
         * @param onboardingType The OnboardingType param. String must be one of these: `&#34;classic&#34;`. Default: `&#34;classic&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder onboardingType(@Nullable Output<String> onboardingType) {
            $.onboardingType = onboardingType;
            return this;
        }

        /**
         * @param onboardingType The OnboardingType param. String must be one of these: `&#34;classic&#34;`. Default: `&#34;classic&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder onboardingType(String onboardingType) {
            return onboardingType(Output.of(onboardingType));
        }

        /**
         * @param protocol The Protocol param.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<ServiceConnectionProtocolArgs> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The Protocol param.
         * 
         * @return builder
         * 
         */
        public Builder protocol(ServiceConnectionProtocolArgs protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param qos The Qos param.
         * 
         * @return builder
         * 
         */
        public Builder qos(@Nullable Output<ServiceConnectionQosArgs> qos) {
            $.qos = qos;
            return this;
        }

        /**
         * @param qos The Qos param.
         * 
         * @return builder
         * 
         */
        public Builder qos(ServiceConnectionQosArgs qos) {
            return qos(Output.of(qos));
        }

        /**
         * @param region The Region param.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The Region param.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param secondaryIpsecTunnel The SecondaryIpsecTunnel param.
         * 
         * @return builder
         * 
         */
        public Builder secondaryIpsecTunnel(@Nullable Output<String> secondaryIpsecTunnel) {
            $.secondaryIpsecTunnel = secondaryIpsecTunnel;
            return this;
        }

        /**
         * @param secondaryIpsecTunnel The SecondaryIpsecTunnel param.
         * 
         * @return builder
         * 
         */
        public Builder secondaryIpsecTunnel(String secondaryIpsecTunnel) {
            return secondaryIpsecTunnel(Output.of(secondaryIpsecTunnel));
        }

        /**
         * @param sourceNat The SourceNat param.
         * 
         * @return builder
         * 
         */
        public Builder sourceNat(@Nullable Output<Boolean> sourceNat) {
            $.sourceNat = sourceNat;
            return this;
        }

        /**
         * @param sourceNat The SourceNat param.
         * 
         * @return builder
         * 
         */
        public Builder sourceNat(Boolean sourceNat) {
            return sourceNat(Output.of(sourceNat));
        }

        /**
         * @param subnets The Subnets param.
         * 
         * @return builder
         * 
         */
        public Builder subnets(@Nullable Output<List<String>> subnets) {
            $.subnets = subnets;
            return this;
        }

        /**
         * @param subnets The Subnets param.
         * 
         * @return builder
         * 
         */
        public Builder subnets(List<String> subnets) {
            return subnets(Output.of(subnets));
        }

        /**
         * @param subnets The Subnets param.
         * 
         * @return builder
         * 
         */
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }

        public ServiceConnectionArgs build() {
            if ($.ipsecTunnel == null) {
                throw new MissingRequiredPropertyException("ServiceConnectionArgs", "ipsecTunnel");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("ServiceConnectionArgs", "region");
            }
            return $;
        }
    }

}
