// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetIpsecTunnelAutoKey;
import com.pulumi.scm.outputs.GetIpsecTunnelTunnelMonitor;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIpsecTunnelResult {
    /**
     * @return Enable Anti-Replay check on this tunnel.
     * 
     */
    private Boolean antiReplay;
    /**
     * @return The AutoKey param.
     * 
     */
    private GetIpsecTunnelAutoKey autoKey;
    /**
     * @return Copy IP TOS bits from inner packet to IPSec packet (not recommended). Default: `false`.
     * 
     */
    private Boolean copyTos;
    /**
     * @return allow GRE over IPSec. Default: `false`.
     * 
     */
    private Boolean enableGreEncapsulation;
    /**
     * @return The Folder param.
     * 
     */
    private @Nullable String folder;
    /**
     * @return The Id param.
     * 
     */
    private String id;
    /**
     * @return Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
     * 
     */
    private String name;
    private String tfid;
    /**
     * @return The TunnelMonitor param.
     * 
     */
    private GetIpsecTunnelTunnelMonitor tunnelMonitor;

    private GetIpsecTunnelResult() {}
    /**
     * @return Enable Anti-Replay check on this tunnel.
     * 
     */
    public Boolean antiReplay() {
        return this.antiReplay;
    }
    /**
     * @return The AutoKey param.
     * 
     */
    public GetIpsecTunnelAutoKey autoKey() {
        return this.autoKey;
    }
    /**
     * @return Copy IP TOS bits from inner packet to IPSec packet (not recommended). Default: `false`.
     * 
     */
    public Boolean copyTos() {
        return this.copyTos;
    }
    /**
     * @return allow GRE over IPSec. Default: `false`.
     * 
     */
    public Boolean enableGreEncapsulation() {
        return this.enableGreEncapsulation;
    }
    /**
     * @return The Folder param.
     * 
     */
    public Optional<String> folder() {
        return Optional.ofNullable(this.folder);
    }
    /**
     * @return The Id param.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    public String tfid() {
        return this.tfid;
    }
    /**
     * @return The TunnelMonitor param.
     * 
     */
    public GetIpsecTunnelTunnelMonitor tunnelMonitor() {
        return this.tunnelMonitor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpsecTunnelResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean antiReplay;
        private GetIpsecTunnelAutoKey autoKey;
        private Boolean copyTos;
        private Boolean enableGreEncapsulation;
        private @Nullable String folder;
        private String id;
        private String name;
        private String tfid;
        private GetIpsecTunnelTunnelMonitor tunnelMonitor;
        public Builder() {}
        public Builder(GetIpsecTunnelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.antiReplay = defaults.antiReplay;
    	      this.autoKey = defaults.autoKey;
    	      this.copyTos = defaults.copyTos;
    	      this.enableGreEncapsulation = defaults.enableGreEncapsulation;
    	      this.folder = defaults.folder;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.tfid = defaults.tfid;
    	      this.tunnelMonitor = defaults.tunnelMonitor;
        }

        @CustomType.Setter
        public Builder antiReplay(Boolean antiReplay) {
            if (antiReplay == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelResult", "antiReplay");
            }
            this.antiReplay = antiReplay;
            return this;
        }
        @CustomType.Setter
        public Builder autoKey(GetIpsecTunnelAutoKey autoKey) {
            if (autoKey == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelResult", "autoKey");
            }
            this.autoKey = autoKey;
            return this;
        }
        @CustomType.Setter
        public Builder copyTos(Boolean copyTos) {
            if (copyTos == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelResult", "copyTos");
            }
            this.copyTos = copyTos;
            return this;
        }
        @CustomType.Setter
        public Builder enableGreEncapsulation(Boolean enableGreEncapsulation) {
            if (enableGreEncapsulation == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelResult", "enableGreEncapsulation");
            }
            this.enableGreEncapsulation = enableGreEncapsulation;
            return this;
        }
        @CustomType.Setter
        public Builder folder(@Nullable String folder) {

            this.folder = folder;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tfid(String tfid) {
            if (tfid == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelResult", "tfid");
            }
            this.tfid = tfid;
            return this;
        }
        @CustomType.Setter
        public Builder tunnelMonitor(GetIpsecTunnelTunnelMonitor tunnelMonitor) {
            if (tunnelMonitor == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelResult", "tunnelMonitor");
            }
            this.tunnelMonitor = tunnelMonitor;
            return this;
        }
        public GetIpsecTunnelResult build() {
            final var _resultValue = new GetIpsecTunnelResult();
            _resultValue.antiReplay = antiReplay;
            _resultValue.autoKey = autoKey;
            _resultValue.copyTos = copyTos;
            _resultValue.enableGreEncapsulation = enableGreEncapsulation;
            _resultValue.folder = folder;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.tfid = tfid;
            _resultValue.tunnelMonitor = tunnelMonitor;
            return _resultValue;
        }
    }
}