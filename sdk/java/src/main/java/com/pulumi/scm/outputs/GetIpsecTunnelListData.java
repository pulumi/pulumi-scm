// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetIpsecTunnelListDataAutoKey;
import com.pulumi.scm.outputs.GetIpsecTunnelListDataTunnelMonitor;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIpsecTunnelListData {
    /**
     * @return Enable Anti-Replay check on this tunnel.
     * 
     */
    private Boolean antiReplay;
    /**
     * @return The AutoKey param.
     * 
     */
    private GetIpsecTunnelListDataAutoKey autoKey;
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
     * @return UUID of the resource.
     * 
     */
    private String id;
    /**
     * @return Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 63 characters.
     * 
     */
    private String name;
    /**
     * @return The TunnelMonitor param.
     * 
     */
    private GetIpsecTunnelListDataTunnelMonitor tunnelMonitor;

    private GetIpsecTunnelListData() {}
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
    public GetIpsecTunnelListDataAutoKey autoKey() {
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
     * @return UUID of the resource.
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
    /**
     * @return The TunnelMonitor param.
     * 
     */
    public GetIpsecTunnelListDataTunnelMonitor tunnelMonitor() {
        return this.tunnelMonitor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpsecTunnelListData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean antiReplay;
        private GetIpsecTunnelListDataAutoKey autoKey;
        private Boolean copyTos;
        private Boolean enableGreEncapsulation;
        private String id;
        private String name;
        private GetIpsecTunnelListDataTunnelMonitor tunnelMonitor;
        public Builder() {}
        public Builder(GetIpsecTunnelListData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.antiReplay = defaults.antiReplay;
    	      this.autoKey = defaults.autoKey;
    	      this.copyTos = defaults.copyTos;
    	      this.enableGreEncapsulation = defaults.enableGreEncapsulation;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.tunnelMonitor = defaults.tunnelMonitor;
        }

        @CustomType.Setter
        public Builder antiReplay(Boolean antiReplay) {
            if (antiReplay == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListData", "antiReplay");
            }
            this.antiReplay = antiReplay;
            return this;
        }
        @CustomType.Setter
        public Builder autoKey(GetIpsecTunnelListDataAutoKey autoKey) {
            if (autoKey == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListData", "autoKey");
            }
            this.autoKey = autoKey;
            return this;
        }
        @CustomType.Setter
        public Builder copyTos(Boolean copyTos) {
            if (copyTos == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListData", "copyTos");
            }
            this.copyTos = copyTos;
            return this;
        }
        @CustomType.Setter
        public Builder enableGreEncapsulation(Boolean enableGreEncapsulation) {
            if (enableGreEncapsulation == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListData", "enableGreEncapsulation");
            }
            this.enableGreEncapsulation = enableGreEncapsulation;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListData", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListData", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tunnelMonitor(GetIpsecTunnelListDataTunnelMonitor tunnelMonitor) {
            if (tunnelMonitor == null) {
              throw new MissingRequiredPropertyException("GetIpsecTunnelListData", "tunnelMonitor");
            }
            this.tunnelMonitor = tunnelMonitor;
            return this;
        }
        public GetIpsecTunnelListData build() {
            final var _resultValue = new GetIpsecTunnelListData();
            _resultValue.antiReplay = antiReplay;
            _resultValue.autoKey = autoKey;
            _resultValue.copyTos = copyTos;
            _resultValue.enableGreEncapsulation = enableGreEncapsulation;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.tunnelMonitor = tunnelMonitor;
            return _resultValue;
        }
    }
}
