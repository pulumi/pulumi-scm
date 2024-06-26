// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetIpsecCryptoProfileLifesize {
    /**
     * @return specify lifesize in gigabytes(GB). Value must be between 1 and 65535.
     * 
     */
    private Integer gb;
    /**
     * @return specify lifesize in kilobytes(KB). Value must be between 1 and 65535.
     * 
     */
    private Integer kb;
    /**
     * @return specify lifesize in megabytes(MB). Value must be between 1 and 65535.
     * 
     */
    private Integer mb;
    /**
     * @return specify lifesize in terabytes(TB). Value must be between 1 and 65535.
     * 
     */
    private Integer tb;

    private GetIpsecCryptoProfileLifesize() {}
    /**
     * @return specify lifesize in gigabytes(GB). Value must be between 1 and 65535.
     * 
     */
    public Integer gb() {
        return this.gb;
    }
    /**
     * @return specify lifesize in kilobytes(KB). Value must be between 1 and 65535.
     * 
     */
    public Integer kb() {
        return this.kb;
    }
    /**
     * @return specify lifesize in megabytes(MB). Value must be between 1 and 65535.
     * 
     */
    public Integer mb() {
        return this.mb;
    }
    /**
     * @return specify lifesize in terabytes(TB). Value must be between 1 and 65535.
     * 
     */
    public Integer tb() {
        return this.tb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpsecCryptoProfileLifesize defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer gb;
        private Integer kb;
        private Integer mb;
        private Integer tb;
        public Builder() {}
        public Builder(GetIpsecCryptoProfileLifesize defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gb = defaults.gb;
    	      this.kb = defaults.kb;
    	      this.mb = defaults.mb;
    	      this.tb = defaults.tb;
        }

        @CustomType.Setter
        public Builder gb(Integer gb) {
            if (gb == null) {
              throw new MissingRequiredPropertyException("GetIpsecCryptoProfileLifesize", "gb");
            }
            this.gb = gb;
            return this;
        }
        @CustomType.Setter
        public Builder kb(Integer kb) {
            if (kb == null) {
              throw new MissingRequiredPropertyException("GetIpsecCryptoProfileLifesize", "kb");
            }
            this.kb = kb;
            return this;
        }
        @CustomType.Setter
        public Builder mb(Integer mb) {
            if (mb == null) {
              throw new MissingRequiredPropertyException("GetIpsecCryptoProfileLifesize", "mb");
            }
            this.mb = mb;
            return this;
        }
        @CustomType.Setter
        public Builder tb(Integer tb) {
            if (tb == null) {
              throw new MissingRequiredPropertyException("GetIpsecCryptoProfileLifesize", "tb");
            }
            this.tb = tb;
            return this;
        }
        public GetIpsecCryptoProfileLifesize build() {
            final var _resultValue = new GetIpsecCryptoProfileLifesize();
            _resultValue.gb = gb;
            _resultValue.kb = kb;
            _resultValue.mb = mb;
            _resultValue.tb = tb;
            return _resultValue;
        }
    }
}
