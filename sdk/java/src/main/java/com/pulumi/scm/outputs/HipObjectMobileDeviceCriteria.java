// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scm.outputs.HipObjectMobileDeviceCriteriaApplications;
import com.pulumi.scm.outputs.HipObjectMobileDeviceCriteriaImei;
import com.pulumi.scm.outputs.HipObjectMobileDeviceCriteriaLastCheckinTime;
import com.pulumi.scm.outputs.HipObjectMobileDeviceCriteriaModel;
import com.pulumi.scm.outputs.HipObjectMobileDeviceCriteriaPhoneNumber;
import com.pulumi.scm.outputs.HipObjectMobileDeviceCriteriaTag;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HipObjectMobileDeviceCriteria {
    /**
     * @return The Applications param.
     * 
     */
    private @Nullable HipObjectMobileDeviceCriteriaApplications applications;
    /**
     * @return If device&#39;s disk is encrypted.
     * 
     */
    private @Nullable Boolean diskEncrypted;
    /**
     * @return The Imei param.
     * 
     */
    private @Nullable HipObjectMobileDeviceCriteriaImei imei;
    /**
     * @return If device is by rooted/jailbroken.
     * 
     */
    private @Nullable Boolean jailbroken;
    /**
     * @return The LastCheckinTime param.
     * 
     */
    private @Nullable HipObjectMobileDeviceCriteriaLastCheckinTime lastCheckinTime;
    /**
     * @return The Model param.
     * 
     */
    private @Nullable HipObjectMobileDeviceCriteriaModel model;
    /**
     * @return If device&#39;s passcode is present.
     * 
     */
    private @Nullable Boolean passcodeSet;
    /**
     * @return The PhoneNumber param.
     * 
     */
    private @Nullable HipObjectMobileDeviceCriteriaPhoneNumber phoneNumber;
    /**
     * @return The Tag param.
     * 
     */
    private @Nullable HipObjectMobileDeviceCriteriaTag tag;

    private HipObjectMobileDeviceCriteria() {}
    /**
     * @return The Applications param.
     * 
     */
    public Optional<HipObjectMobileDeviceCriteriaApplications> applications() {
        return Optional.ofNullable(this.applications);
    }
    /**
     * @return If device&#39;s disk is encrypted.
     * 
     */
    public Optional<Boolean> diskEncrypted() {
        return Optional.ofNullable(this.diskEncrypted);
    }
    /**
     * @return The Imei param.
     * 
     */
    public Optional<HipObjectMobileDeviceCriteriaImei> imei() {
        return Optional.ofNullable(this.imei);
    }
    /**
     * @return If device is by rooted/jailbroken.
     * 
     */
    public Optional<Boolean> jailbroken() {
        return Optional.ofNullable(this.jailbroken);
    }
    /**
     * @return The LastCheckinTime param.
     * 
     */
    public Optional<HipObjectMobileDeviceCriteriaLastCheckinTime> lastCheckinTime() {
        return Optional.ofNullable(this.lastCheckinTime);
    }
    /**
     * @return The Model param.
     * 
     */
    public Optional<HipObjectMobileDeviceCriteriaModel> model() {
        return Optional.ofNullable(this.model);
    }
    /**
     * @return If device&#39;s passcode is present.
     * 
     */
    public Optional<Boolean> passcodeSet() {
        return Optional.ofNullable(this.passcodeSet);
    }
    /**
     * @return The PhoneNumber param.
     * 
     */
    public Optional<HipObjectMobileDeviceCriteriaPhoneNumber> phoneNumber() {
        return Optional.ofNullable(this.phoneNumber);
    }
    /**
     * @return The Tag param.
     * 
     */
    public Optional<HipObjectMobileDeviceCriteriaTag> tag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HipObjectMobileDeviceCriteria defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable HipObjectMobileDeviceCriteriaApplications applications;
        private @Nullable Boolean diskEncrypted;
        private @Nullable HipObjectMobileDeviceCriteriaImei imei;
        private @Nullable Boolean jailbroken;
        private @Nullable HipObjectMobileDeviceCriteriaLastCheckinTime lastCheckinTime;
        private @Nullable HipObjectMobileDeviceCriteriaModel model;
        private @Nullable Boolean passcodeSet;
        private @Nullable HipObjectMobileDeviceCriteriaPhoneNumber phoneNumber;
        private @Nullable HipObjectMobileDeviceCriteriaTag tag;
        public Builder() {}
        public Builder(HipObjectMobileDeviceCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applications = defaults.applications;
    	      this.diskEncrypted = defaults.diskEncrypted;
    	      this.imei = defaults.imei;
    	      this.jailbroken = defaults.jailbroken;
    	      this.lastCheckinTime = defaults.lastCheckinTime;
    	      this.model = defaults.model;
    	      this.passcodeSet = defaults.passcodeSet;
    	      this.phoneNumber = defaults.phoneNumber;
    	      this.tag = defaults.tag;
        }

        @CustomType.Setter
        public Builder applications(@Nullable HipObjectMobileDeviceCriteriaApplications applications) {

            this.applications = applications;
            return this;
        }
        @CustomType.Setter
        public Builder diskEncrypted(@Nullable Boolean diskEncrypted) {

            this.diskEncrypted = diskEncrypted;
            return this;
        }
        @CustomType.Setter
        public Builder imei(@Nullable HipObjectMobileDeviceCriteriaImei imei) {

            this.imei = imei;
            return this;
        }
        @CustomType.Setter
        public Builder jailbroken(@Nullable Boolean jailbroken) {

            this.jailbroken = jailbroken;
            return this;
        }
        @CustomType.Setter
        public Builder lastCheckinTime(@Nullable HipObjectMobileDeviceCriteriaLastCheckinTime lastCheckinTime) {

            this.lastCheckinTime = lastCheckinTime;
            return this;
        }
        @CustomType.Setter
        public Builder model(@Nullable HipObjectMobileDeviceCriteriaModel model) {

            this.model = model;
            return this;
        }
        @CustomType.Setter
        public Builder passcodeSet(@Nullable Boolean passcodeSet) {

            this.passcodeSet = passcodeSet;
            return this;
        }
        @CustomType.Setter
        public Builder phoneNumber(@Nullable HipObjectMobileDeviceCriteriaPhoneNumber phoneNumber) {

            this.phoneNumber = phoneNumber;
            return this;
        }
        @CustomType.Setter
        public Builder tag(@Nullable HipObjectMobileDeviceCriteriaTag tag) {

            this.tag = tag;
            return this;
        }
        public HipObjectMobileDeviceCriteria build() {
            final var _resultValue = new HipObjectMobileDeviceCriteria();
            _resultValue.applications = applications;
            _resultValue.diskEncrypted = diskEncrypted;
            _resultValue.imei = imei;
            _resultValue.jailbroken = jailbroken;
            _resultValue.lastCheckinTime = lastCheckinTime;
            _resultValue.model = model;
            _resultValue.passcodeSet = passcodeSet;
            _resultValue.phoneNumber = phoneNumber;
            _resultValue.tag = tag;
            return _resultValue;
        }
    }
}