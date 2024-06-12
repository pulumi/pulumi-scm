// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IpsecCryptoProfileLifesize {
    /**
     * @return specify lifesize in gigabytes(GB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
     * 
     */
    private @Nullable Integer gb;
    /**
     * @return specify lifesize in kilobytes(KB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
     * 
     */
    private @Nullable Integer kb;
    /**
     * @return specify lifesize in megabytes(MB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
     * 
     */
    private @Nullable Integer mb;
    /**
     * @return specify lifesize in terabytes(TB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
     * 
     */
    private @Nullable Integer tb;

    private IpsecCryptoProfileLifesize() {}
    /**
     * @return specify lifesize in gigabytes(GB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
     * 
     */
    public Optional<Integer> gb() {
        return Optional.ofNullable(this.gb);
    }
    /**
     * @return specify lifesize in kilobytes(KB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
     * 
     */
    public Optional<Integer> kb() {
        return Optional.ofNullable(this.kb);
    }
    /**
     * @return specify lifesize in megabytes(MB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
     * 
     */
    public Optional<Integer> mb() {
        return Optional.ofNullable(this.mb);
    }
    /**
     * @return specify lifesize in terabytes(TB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
     * 
     */
    public Optional<Integer> tb() {
        return Optional.ofNullable(this.tb);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpsecCryptoProfileLifesize defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer gb;
        private @Nullable Integer kb;
        private @Nullable Integer mb;
        private @Nullable Integer tb;
        public Builder() {}
        public Builder(IpsecCryptoProfileLifesize defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gb = defaults.gb;
    	      this.kb = defaults.kb;
    	      this.mb = defaults.mb;
    	      this.tb = defaults.tb;
        }

        @CustomType.Setter
        public Builder gb(@Nullable Integer gb) {

            this.gb = gb;
            return this;
        }
        @CustomType.Setter
        public Builder kb(@Nullable Integer kb) {

            this.kb = kb;
            return this;
        }
        @CustomType.Setter
        public Builder mb(@Nullable Integer mb) {

            this.mb = mb;
            return this;
        }
        @CustomType.Setter
        public Builder tb(@Nullable Integer tb) {

            this.tb = tb;
            return this;
        }
        public IpsecCryptoProfileLifesize build() {
            final var _resultValue = new IpsecCryptoProfileLifesize();
            _resultValue.gb = gb;
            _resultValue.kb = kb;
            _resultValue.mb = mb;
            _resultValue.tb = tb;
            return _resultValue;
        }
    }
}