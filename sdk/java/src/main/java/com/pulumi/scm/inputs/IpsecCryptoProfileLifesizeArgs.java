// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IpsecCryptoProfileLifesizeArgs extends com.pulumi.resources.ResourceArgs {

    public static final IpsecCryptoProfileLifesizeArgs Empty = new IpsecCryptoProfileLifesizeArgs();

    /**
     * specify lifesize in gigabytes(GB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
     * 
     */
    @Import(name="gb")
    private @Nullable Output<Integer> gb;

    /**
     * @return specify lifesize in gigabytes(GB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
     * 
     */
    public Optional<Output<Integer>> gb() {
        return Optional.ofNullable(this.gb);
    }

    /**
     * specify lifesize in kilobytes(KB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
     * 
     */
    @Import(name="kb")
    private @Nullable Output<Integer> kb;

    /**
     * @return specify lifesize in kilobytes(KB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
     * 
     */
    public Optional<Output<Integer>> kb() {
        return Optional.ofNullable(this.kb);
    }

    /**
     * specify lifesize in megabytes(MB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
     * 
     */
    @Import(name="mb")
    private @Nullable Output<Integer> mb;

    /**
     * @return specify lifesize in megabytes(MB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
     * 
     */
    public Optional<Output<Integer>> mb() {
        return Optional.ofNullable(this.mb);
    }

    /**
     * specify lifesize in terabytes(TB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
     * 
     */
    @Import(name="tb")
    private @Nullable Output<Integer> tb;

    /**
     * @return specify lifesize in terabytes(TB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
     * 
     */
    public Optional<Output<Integer>> tb() {
        return Optional.ofNullable(this.tb);
    }

    private IpsecCryptoProfileLifesizeArgs() {}

    private IpsecCryptoProfileLifesizeArgs(IpsecCryptoProfileLifesizeArgs $) {
        this.gb = $.gb;
        this.kb = $.kb;
        this.mb = $.mb;
        this.tb = $.tb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpsecCryptoProfileLifesizeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpsecCryptoProfileLifesizeArgs $;

        public Builder() {
            $ = new IpsecCryptoProfileLifesizeArgs();
        }

        public Builder(IpsecCryptoProfileLifesizeArgs defaults) {
            $ = new IpsecCryptoProfileLifesizeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gb specify lifesize in gigabytes(GB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
         * 
         * @return builder
         * 
         */
        public Builder gb(@Nullable Output<Integer> gb) {
            $.gb = gb;
            return this;
        }

        /**
         * @param gb specify lifesize in gigabytes(GB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
         * 
         * @return builder
         * 
         */
        public Builder gb(Integer gb) {
            return gb(Output.of(gb));
        }

        /**
         * @param kb specify lifesize in kilobytes(KB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
         * 
         * @return builder
         * 
         */
        public Builder kb(@Nullable Output<Integer> kb) {
            $.kb = kb;
            return this;
        }

        /**
         * @param kb specify lifesize in kilobytes(KB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
         * 
         * @return builder
         * 
         */
        public Builder kb(Integer kb) {
            return kb(Output.of(kb));
        }

        /**
         * @param mb specify lifesize in megabytes(MB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
         * 
         * @return builder
         * 
         */
        public Builder mb(@Nullable Output<Integer> mb) {
            $.mb = mb;
            return this;
        }

        /**
         * @param mb specify lifesize in megabytes(MB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
         * 
         * @return builder
         * 
         */
        public Builder mb(Integer mb) {
            return mb(Output.of(mb));
        }

        /**
         * @param tb specify lifesize in terabytes(TB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
         * 
         * @return builder
         * 
         */
        public Builder tb(@Nullable Output<Integer> tb) {
            $.tb = tb;
            return this;
        }

        /**
         * @param tb specify lifesize in terabytes(TB). Value must be between 1 and 65535. Ensure that only one of the following is specified: `gb`, `kb`, `mb`, `tb`
         * 
         * @return builder
         * 
         */
        public Builder tb(Integer tb) {
            return tb(Output.of(tb));
        }

        public IpsecCryptoProfileLifesizeArgs build() {
            return $;
        }
    }

}
