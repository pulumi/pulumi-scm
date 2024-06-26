// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.inputs.IpsecTunnelAutoKeyArgs;
import com.pulumi.scm.inputs.IpsecTunnelTunnelMonitorArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IpsecTunnelArgs extends com.pulumi.resources.ResourceArgs {

    public static final IpsecTunnelArgs Empty = new IpsecTunnelArgs();

    /**
     * Enable Anti-Replay check on this tunnel.
     * 
     */
    @Import(name="antiReplay")
    private @Nullable Output<Boolean> antiReplay;

    /**
     * @return Enable Anti-Replay check on this tunnel.
     * 
     */
    public Optional<Output<Boolean>> antiReplay() {
        return Optional.ofNullable(this.antiReplay);
    }

    /**
     * The AutoKey param.
     * 
     */
    @Import(name="autoKey", required=true)
    private Output<IpsecTunnelAutoKeyArgs> autoKey;

    /**
     * @return The AutoKey param.
     * 
     */
    public Output<IpsecTunnelAutoKeyArgs> autoKey() {
        return this.autoKey;
    }

    /**
     * Copy IP TOS bits from inner packet to IPSec packet (not recommended). Default: `false`.
     * 
     */
    @Import(name="copyTos")
    private @Nullable Output<Boolean> copyTos;

    /**
     * @return Copy IP TOS bits from inner packet to IPSec packet (not recommended). Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> copyTos() {
        return Optional.ofNullable(this.copyTos);
    }

    /**
     * The Device param.
     * 
     */
    @Import(name="device")
    private @Nullable Output<String> device;

    /**
     * @return The Device param.
     * 
     */
    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    /**
     * allow GRE over IPSec. Default: `false`.
     * 
     */
    @Import(name="enableGreEncapsulation")
    private @Nullable Output<Boolean> enableGreEncapsulation;

    /**
     * @return allow GRE over IPSec. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> enableGreEncapsulation() {
        return Optional.ofNullable(this.enableGreEncapsulation);
    }

    /**
     * The Folder param.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return The Folder param.
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
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
     * The Snippet param.
     * 
     */
    @Import(name="snippet")
    private @Nullable Output<String> snippet;

    /**
     * @return The Snippet param.
     * 
     */
    public Optional<Output<String>> snippet() {
        return Optional.ofNullable(this.snippet);
    }

    /**
     * The TunnelMonitor param.
     * 
     */
    @Import(name="tunnelMonitor")
    private @Nullable Output<IpsecTunnelTunnelMonitorArgs> tunnelMonitor;

    /**
     * @return The TunnelMonitor param.
     * 
     */
    public Optional<Output<IpsecTunnelTunnelMonitorArgs>> tunnelMonitor() {
        return Optional.ofNullable(this.tunnelMonitor);
    }

    private IpsecTunnelArgs() {}

    private IpsecTunnelArgs(IpsecTunnelArgs $) {
        this.antiReplay = $.antiReplay;
        this.autoKey = $.autoKey;
        this.copyTos = $.copyTos;
        this.device = $.device;
        this.enableGreEncapsulation = $.enableGreEncapsulation;
        this.folder = $.folder;
        this.name = $.name;
        this.snippet = $.snippet;
        this.tunnelMonitor = $.tunnelMonitor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpsecTunnelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpsecTunnelArgs $;

        public Builder() {
            $ = new IpsecTunnelArgs();
        }

        public Builder(IpsecTunnelArgs defaults) {
            $ = new IpsecTunnelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param antiReplay Enable Anti-Replay check on this tunnel.
         * 
         * @return builder
         * 
         */
        public Builder antiReplay(@Nullable Output<Boolean> antiReplay) {
            $.antiReplay = antiReplay;
            return this;
        }

        /**
         * @param antiReplay Enable Anti-Replay check on this tunnel.
         * 
         * @return builder
         * 
         */
        public Builder antiReplay(Boolean antiReplay) {
            return antiReplay(Output.of(antiReplay));
        }

        /**
         * @param autoKey The AutoKey param.
         * 
         * @return builder
         * 
         */
        public Builder autoKey(Output<IpsecTunnelAutoKeyArgs> autoKey) {
            $.autoKey = autoKey;
            return this;
        }

        /**
         * @param autoKey The AutoKey param.
         * 
         * @return builder
         * 
         */
        public Builder autoKey(IpsecTunnelAutoKeyArgs autoKey) {
            return autoKey(Output.of(autoKey));
        }

        /**
         * @param copyTos Copy IP TOS bits from inner packet to IPSec packet (not recommended). Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder copyTos(@Nullable Output<Boolean> copyTos) {
            $.copyTos = copyTos;
            return this;
        }

        /**
         * @param copyTos Copy IP TOS bits from inner packet to IPSec packet (not recommended). Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder copyTos(Boolean copyTos) {
            return copyTos(Output.of(copyTos));
        }

        /**
         * @param device The Device param.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        /**
         * @param device The Device param.
         * 
         * @return builder
         * 
         */
        public Builder device(String device) {
            return device(Output.of(device));
        }

        /**
         * @param enableGreEncapsulation allow GRE over IPSec. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableGreEncapsulation(@Nullable Output<Boolean> enableGreEncapsulation) {
            $.enableGreEncapsulation = enableGreEncapsulation;
            return this;
        }

        /**
         * @param enableGreEncapsulation allow GRE over IPSec. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableGreEncapsulation(Boolean enableGreEncapsulation) {
            return enableGreEncapsulation(Output.of(enableGreEncapsulation));
        }

        /**
         * @param folder The Folder param.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The Folder param.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
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
         * @param snippet The Snippet param.
         * 
         * @return builder
         * 
         */
        public Builder snippet(@Nullable Output<String> snippet) {
            $.snippet = snippet;
            return this;
        }

        /**
         * @param snippet The Snippet param.
         * 
         * @return builder
         * 
         */
        public Builder snippet(String snippet) {
            return snippet(Output.of(snippet));
        }

        /**
         * @param tunnelMonitor The TunnelMonitor param.
         * 
         * @return builder
         * 
         */
        public Builder tunnelMonitor(@Nullable Output<IpsecTunnelTunnelMonitorArgs> tunnelMonitor) {
            $.tunnelMonitor = tunnelMonitor;
            return this;
        }

        /**
         * @param tunnelMonitor The TunnelMonitor param.
         * 
         * @return builder
         * 
         */
        public Builder tunnelMonitor(IpsecTunnelTunnelMonitorArgs tunnelMonitor) {
            return tunnelMonitor(Output.of(tunnelMonitor));
        }

        public IpsecTunnelArgs build() {
            if ($.autoKey == null) {
                throw new MissingRequiredPropertyException("IpsecTunnelArgs", "autoKey");
            }
            return $;
        }
    }

}
