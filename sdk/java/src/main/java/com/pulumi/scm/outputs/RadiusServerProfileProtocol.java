// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scm.outputs.RadiusServerProfileProtocolEapTtlsWithPap;
import com.pulumi.scm.outputs.RadiusServerProfileProtocolPeapMschapV2;
import com.pulumi.scm.outputs.RadiusServerProfileProtocolPeapWithGtc;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RadiusServerProfileProtocol {
    /**
     * @return The Chap param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
     * 
     */
    private @Nullable Boolean chap;
    /**
     * @return The EapTtlsWithPap param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
     * 
     */
    private @Nullable RadiusServerProfileProtocolEapTtlsWithPap eapTtlsWithPap;
    /**
     * @return The Pap param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
     * 
     */
    private @Nullable Boolean pap;
    /**
     * @return The PeapMschapV2 param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
     * 
     */
    private @Nullable RadiusServerProfileProtocolPeapMschapV2 peapMschapV2;
    /**
     * @return The PeapWithGtc param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
     * 
     */
    private @Nullable RadiusServerProfileProtocolPeapWithGtc peapWithGtc;

    private RadiusServerProfileProtocol() {}
    /**
     * @return The Chap param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
     * 
     */
    public Optional<Boolean> chap() {
        return Optional.ofNullable(this.chap);
    }
    /**
     * @return The EapTtlsWithPap param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
     * 
     */
    public Optional<RadiusServerProfileProtocolEapTtlsWithPap> eapTtlsWithPap() {
        return Optional.ofNullable(this.eapTtlsWithPap);
    }
    /**
     * @return The Pap param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
     * 
     */
    public Optional<Boolean> pap() {
        return Optional.ofNullable(this.pap);
    }
    /**
     * @return The PeapMschapV2 param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
     * 
     */
    public Optional<RadiusServerProfileProtocolPeapMschapV2> peapMschapV2() {
        return Optional.ofNullable(this.peapMschapV2);
    }
    /**
     * @return The PeapWithGtc param. Ensure that only one of the following is specified: `CHAP`, `EAP_TTLS_with_PAP`, `PAP`, `PEAP_MSCHAPv2`, `PEAP_with_GTC`
     * 
     */
    public Optional<RadiusServerProfileProtocolPeapWithGtc> peapWithGtc() {
        return Optional.ofNullable(this.peapWithGtc);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RadiusServerProfileProtocol defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean chap;
        private @Nullable RadiusServerProfileProtocolEapTtlsWithPap eapTtlsWithPap;
        private @Nullable Boolean pap;
        private @Nullable RadiusServerProfileProtocolPeapMschapV2 peapMschapV2;
        private @Nullable RadiusServerProfileProtocolPeapWithGtc peapWithGtc;
        public Builder() {}
        public Builder(RadiusServerProfileProtocol defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chap = defaults.chap;
    	      this.eapTtlsWithPap = defaults.eapTtlsWithPap;
    	      this.pap = defaults.pap;
    	      this.peapMschapV2 = defaults.peapMschapV2;
    	      this.peapWithGtc = defaults.peapWithGtc;
        }

        @CustomType.Setter
        public Builder chap(@Nullable Boolean chap) {

            this.chap = chap;
            return this;
        }
        @CustomType.Setter
        public Builder eapTtlsWithPap(@Nullable RadiusServerProfileProtocolEapTtlsWithPap eapTtlsWithPap) {

            this.eapTtlsWithPap = eapTtlsWithPap;
            return this;
        }
        @CustomType.Setter
        public Builder pap(@Nullable Boolean pap) {

            this.pap = pap;
            return this;
        }
        @CustomType.Setter
        public Builder peapMschapV2(@Nullable RadiusServerProfileProtocolPeapMschapV2 peapMschapV2) {

            this.peapMschapV2 = peapMschapV2;
            return this;
        }
        @CustomType.Setter
        public Builder peapWithGtc(@Nullable RadiusServerProfileProtocolPeapWithGtc peapWithGtc) {

            this.peapWithGtc = peapWithGtc;
            return this;
        }
        public RadiusServerProfileProtocol build() {
            final var _resultValue = new RadiusServerProfileProtocol();
            _resultValue.chap = chap;
            _resultValue.eapTtlsWithPap = eapTtlsWithPap;
            _resultValue.pap = pap;
            _resultValue.peapMschapV2 = peapMschapV2;
            _resultValue.peapWithGtc = peapWithGtc;
            return _resultValue;
        }
    }
}
