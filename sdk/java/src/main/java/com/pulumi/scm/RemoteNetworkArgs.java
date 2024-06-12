// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.inputs.RemoteNetworkEcmpTunnelArgs;
import com.pulumi.scm.inputs.RemoteNetworkProtocolArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RemoteNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final RemoteNetworkArgs Empty = new RemoteNetworkArgs();

    /**
     * The EcmpLoadBalancing param. String must be one of these: `&#34;enable&#34;`, `&#34;disable&#34;`. Default: `&#34;disable&#34;`.
     * 
     */
    @Import(name="ecmpLoadBalancing")
    private @Nullable Output<String> ecmpLoadBalancing;

    /**
     * @return The EcmpLoadBalancing param. String must be one of these: `&#34;enable&#34;`, `&#34;disable&#34;`. Default: `&#34;disable&#34;`.
     * 
     */
    public Optional<Output<String>> ecmpLoadBalancing() {
        return Optional.ofNullable(this.ecmpLoadBalancing);
    }

    /**
     * ecmp*tunnels is required when ecmp*load*balancing is enable.
     * 
     */
    @Import(name="ecmpTunnels")
    private @Nullable Output<List<RemoteNetworkEcmpTunnelArgs>> ecmpTunnels;

    /**
     * @return ecmp*tunnels is required when ecmp*load*balancing is enable.
     * 
     */
    public Optional<Output<List<RemoteNetworkEcmpTunnelArgs>>> ecmpTunnels() {
        return Optional.ofNullable(this.ecmpTunnels);
    }

    /**
     * The Folder param. String can either be a specific string(`&#34;Remote Networks&#34;`) or match this regex: `^[\s0-9a-zA-Z._-]{1,}$`. Default: `&#34;Remote Networks&#34;`.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return The Folder param. String can either be a specific string(`&#34;Remote Networks&#34;`) or match this regex: `^[\s0-9a-zA-Z._-]{1,}$`. Default: `&#34;Remote Networks&#34;`.
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * ipsec*tunnel is required when ecmp*load_balancing is disable.
     * 
     */
    @Import(name="ipsecTunnel")
    private @Nullable Output<String> ipsecTunnel;

    /**
     * @return ipsec*tunnel is required when ecmp*load_balancing is disable.
     * 
     */
    public Optional<Output<String>> ipsecTunnel() {
        return Optional.ofNullable(this.ipsecTunnel);
    }

    /**
     * New customer will only be on aggregate bandwidth licensing. String length must exceed 1 characters. Default: `&#34;FWAAS-AGGREGATE&#34;`.
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<String> licenseType;

    /**
     * @return New customer will only be on aggregate bandwidth licensing. String length must exceed 1 characters. Default: `&#34;FWAAS-AGGREGATE&#34;`.
     * 
     */
    public Optional<Output<String>> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    /**
     * Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * setup the protocol when ecmp*load*balancing is disable.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<RemoteNetworkProtocolArgs> protocol;

    /**
     * @return setup the protocol when ecmp*load*balancing is disable.
     * 
     */
    public Optional<Output<RemoteNetworkProtocolArgs>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * The Region param. String length must exceed 1 characters.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The Region param. String length must exceed 1 characters.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     * specify secondary ipsec_tunnel if needed.
     * 
     */
    @Import(name="secondaryIpsecTunnel")
    private @Nullable Output<String> secondaryIpsecTunnel;

    /**
     * @return specify secondary ipsec_tunnel if needed.
     * 
     */
    public Optional<Output<String>> secondaryIpsecTunnel() {
        return Optional.ofNullable(this.secondaryIpsecTunnel);
    }

    /**
     * spn-name is needed when license_type is FWAAS-AGGREGATE.
     * 
     */
    @Import(name="spnName")
    private @Nullable Output<String> spnName;

    /**
     * @return spn-name is needed when license_type is FWAAS-AGGREGATE.
     * 
     */
    public Optional<Output<String>> spnName() {
        return Optional.ofNullable(this.spnName);
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

    private RemoteNetworkArgs() {}

    private RemoteNetworkArgs(RemoteNetworkArgs $) {
        this.ecmpLoadBalancing = $.ecmpLoadBalancing;
        this.ecmpTunnels = $.ecmpTunnels;
        this.folder = $.folder;
        this.ipsecTunnel = $.ipsecTunnel;
        this.licenseType = $.licenseType;
        this.name = $.name;
        this.protocol = $.protocol;
        this.region = $.region;
        this.secondaryIpsecTunnel = $.secondaryIpsecTunnel;
        this.spnName = $.spnName;
        this.subnets = $.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RemoteNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RemoteNetworkArgs $;

        public Builder() {
            $ = new RemoteNetworkArgs();
        }

        public Builder(RemoteNetworkArgs defaults) {
            $ = new RemoteNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ecmpLoadBalancing The EcmpLoadBalancing param. String must be one of these: `&#34;enable&#34;`, `&#34;disable&#34;`. Default: `&#34;disable&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder ecmpLoadBalancing(@Nullable Output<String> ecmpLoadBalancing) {
            $.ecmpLoadBalancing = ecmpLoadBalancing;
            return this;
        }

        /**
         * @param ecmpLoadBalancing The EcmpLoadBalancing param. String must be one of these: `&#34;enable&#34;`, `&#34;disable&#34;`. Default: `&#34;disable&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder ecmpLoadBalancing(String ecmpLoadBalancing) {
            return ecmpLoadBalancing(Output.of(ecmpLoadBalancing));
        }

        /**
         * @param ecmpTunnels ecmp*tunnels is required when ecmp*load*balancing is enable.
         * 
         * @return builder
         * 
         */
        public Builder ecmpTunnels(@Nullable Output<List<RemoteNetworkEcmpTunnelArgs>> ecmpTunnels) {
            $.ecmpTunnels = ecmpTunnels;
            return this;
        }

        /**
         * @param ecmpTunnels ecmp*tunnels is required when ecmp*load*balancing is enable.
         * 
         * @return builder
         * 
         */
        public Builder ecmpTunnels(List<RemoteNetworkEcmpTunnelArgs> ecmpTunnels) {
            return ecmpTunnels(Output.of(ecmpTunnels));
        }

        /**
         * @param ecmpTunnels ecmp*tunnels is required when ecmp*load*balancing is enable.
         * 
         * @return builder
         * 
         */
        public Builder ecmpTunnels(RemoteNetworkEcmpTunnelArgs... ecmpTunnels) {
            return ecmpTunnels(List.of(ecmpTunnels));
        }

        /**
         * @param folder The Folder param. String can either be a specific string(`&#34;Remote Networks&#34;`) or match this regex: `^[\s0-9a-zA-Z._-]{1,}$`. Default: `&#34;Remote Networks&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The Folder param. String can either be a specific string(`&#34;Remote Networks&#34;`) or match this regex: `^[\s0-9a-zA-Z._-]{1,}$`. Default: `&#34;Remote Networks&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param ipsecTunnel ipsec*tunnel is required when ecmp*load_balancing is disable.
         * 
         * @return builder
         * 
         */
        public Builder ipsecTunnel(@Nullable Output<String> ipsecTunnel) {
            $.ipsecTunnel = ipsecTunnel;
            return this;
        }

        /**
         * @param ipsecTunnel ipsec*tunnel is required when ecmp*load_balancing is disable.
         * 
         * @return builder
         * 
         */
        public Builder ipsecTunnel(String ipsecTunnel) {
            return ipsecTunnel(Output.of(ipsecTunnel));
        }

        /**
         * @param licenseType New customer will only be on aggregate bandwidth licensing. String length must exceed 1 characters. Default: `&#34;FWAAS-AGGREGATE&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(@Nullable Output<String> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        /**
         * @param licenseType New customer will only be on aggregate bandwidth licensing. String length must exceed 1 characters. Default: `&#34;FWAAS-AGGREGATE&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder licenseType(String licenseType) {
            return licenseType(Output.of(licenseType));
        }

        /**
         * @param name Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protocol setup the protocol when ecmp*load*balancing is disable.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<RemoteNetworkProtocolArgs> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol setup the protocol when ecmp*load*balancing is disable.
         * 
         * @return builder
         * 
         */
        public Builder protocol(RemoteNetworkProtocolArgs protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param region The Region param. String length must exceed 1 characters.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The Region param. String length must exceed 1 characters.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param secondaryIpsecTunnel specify secondary ipsec_tunnel if needed.
         * 
         * @return builder
         * 
         */
        public Builder secondaryIpsecTunnel(@Nullable Output<String> secondaryIpsecTunnel) {
            $.secondaryIpsecTunnel = secondaryIpsecTunnel;
            return this;
        }

        /**
         * @param secondaryIpsecTunnel specify secondary ipsec_tunnel if needed.
         * 
         * @return builder
         * 
         */
        public Builder secondaryIpsecTunnel(String secondaryIpsecTunnel) {
            return secondaryIpsecTunnel(Output.of(secondaryIpsecTunnel));
        }

        /**
         * @param spnName spn-name is needed when license_type is FWAAS-AGGREGATE.
         * 
         * @return builder
         * 
         */
        public Builder spnName(@Nullable Output<String> spnName) {
            $.spnName = spnName;
            return this;
        }

        /**
         * @param spnName spn-name is needed when license_type is FWAAS-AGGREGATE.
         * 
         * @return builder
         * 
         */
        public Builder spnName(String spnName) {
            return spnName(Output.of(spnName));
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

        public RemoteNetworkArgs build() {
            if ($.region == null) {
                throw new MissingRequiredPropertyException("RemoteNetworkArgs", "region");
            }
            return $;
        }
    }

}