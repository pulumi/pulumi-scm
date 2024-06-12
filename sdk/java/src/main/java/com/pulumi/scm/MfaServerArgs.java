// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.inputs.MfaServerMfaVendorTypeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MfaServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final MfaServerArgs Empty = new MfaServerArgs();

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
     * The MfaCertProfile param.
     * 
     */
    @Import(name="mfaCertProfile", required=true)
    private Output<String> mfaCertProfile;

    /**
     * @return The MfaCertProfile param.
     * 
     */
    public Output<String> mfaCertProfile() {
        return this.mfaCertProfile;
    }

    /**
     * The MfaVendorType param.
     * 
     */
    @Import(name="mfaVendorType")
    private @Nullable Output<MfaServerMfaVendorTypeArgs> mfaVendorType;

    /**
     * @return The MfaVendorType param.
     * 
     */
    public Optional<Output<MfaServerMfaVendorTypeArgs>> mfaVendorType() {
        return Optional.ofNullable(this.mfaVendorType);
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

    private MfaServerArgs() {}

    private MfaServerArgs(MfaServerArgs $) {
        this.device = $.device;
        this.folder = $.folder;
        this.mfaCertProfile = $.mfaCertProfile;
        this.mfaVendorType = $.mfaVendorType;
        this.name = $.name;
        this.snippet = $.snippet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MfaServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MfaServerArgs $;

        public Builder() {
            $ = new MfaServerArgs();
        }

        public Builder(MfaServerArgs defaults) {
            $ = new MfaServerArgs(Objects.requireNonNull(defaults));
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
         * @param mfaCertProfile The MfaCertProfile param.
         * 
         * @return builder
         * 
         */
        public Builder mfaCertProfile(Output<String> mfaCertProfile) {
            $.mfaCertProfile = mfaCertProfile;
            return this;
        }

        /**
         * @param mfaCertProfile The MfaCertProfile param.
         * 
         * @return builder
         * 
         */
        public Builder mfaCertProfile(String mfaCertProfile) {
            return mfaCertProfile(Output.of(mfaCertProfile));
        }

        /**
         * @param mfaVendorType The MfaVendorType param.
         * 
         * @return builder
         * 
         */
        public Builder mfaVendorType(@Nullable Output<MfaServerMfaVendorTypeArgs> mfaVendorType) {
            $.mfaVendorType = mfaVendorType;
            return this;
        }

        /**
         * @param mfaVendorType The MfaVendorType param.
         * 
         * @return builder
         * 
         */
        public Builder mfaVendorType(MfaServerMfaVendorTypeArgs mfaVendorType) {
            return mfaVendorType(Output.of(mfaVendorType));
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

        public MfaServerArgs build() {
            if ($.mfaCertProfile == null) {
                throw new MissingRequiredPropertyException("MfaServerArgs", "mfaCertProfile");
            }
            return $;
        }
    }

}