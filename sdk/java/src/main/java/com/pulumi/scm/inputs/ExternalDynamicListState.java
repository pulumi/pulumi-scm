// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.ExternalDynamicListTypeArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExternalDynamicListState extends com.pulumi.resources.ResourceArgs {

    public static final ExternalDynamicListState Empty = new ExternalDynamicListState();

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
     * (Internal use) Encrypted values returned from the API.
     * 
     */
    @Import(name="encryptedValues")
    private @Nullable Output<Map<String,String>> encryptedValues;

    /**
     * @return (Internal use) Encrypted values returned from the API.
     * 
     */
    public Optional<Output<Map<String,String>>> encryptedValues() {
        return Optional.ofNullable(this.encryptedValues);
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
     * Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
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

    @Import(name="tfid")
    private @Nullable Output<String> tfid;

    public Optional<Output<String>> tfid() {
        return Optional.ofNullable(this.tfid);
    }

    /**
     * The Type param.
     * 
     */
    @Import(name="type")
    private @Nullable Output<ExternalDynamicListTypeArgs> type;

    /**
     * @return The Type param.
     * 
     */
    public Optional<Output<ExternalDynamicListTypeArgs>> type() {
        return Optional.ofNullable(this.type);
    }

    private ExternalDynamicListState() {}

    private ExternalDynamicListState(ExternalDynamicListState $) {
        this.device = $.device;
        this.encryptedValues = $.encryptedValues;
        this.folder = $.folder;
        this.name = $.name;
        this.snippet = $.snippet;
        this.tfid = $.tfid;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExternalDynamicListState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExternalDynamicListState $;

        public Builder() {
            $ = new ExternalDynamicListState();
        }

        public Builder(ExternalDynamicListState defaults) {
            $ = new ExternalDynamicListState(Objects.requireNonNull(defaults));
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
         * @param encryptedValues (Internal use) Encrypted values returned from the API.
         * 
         * @return builder
         * 
         */
        public Builder encryptedValues(@Nullable Output<Map<String,String>> encryptedValues) {
            $.encryptedValues = encryptedValues;
            return this;
        }

        /**
         * @param encryptedValues (Internal use) Encrypted values returned from the API.
         * 
         * @return builder
         * 
         */
        public Builder encryptedValues(Map<String,String> encryptedValues) {
            return encryptedValues(Output.of(encryptedValues));
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
         * @param name Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 63 characters.
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

        public Builder tfid(@Nullable Output<String> tfid) {
            $.tfid = tfid;
            return this;
        }

        public Builder tfid(String tfid) {
            return tfid(Output.of(tfid));
        }

        /**
         * @param type The Type param.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<ExternalDynamicListTypeArgs> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The Type param.
         * 
         * @return builder
         * 
         */
        public Builder type(ExternalDynamicListTypeArgs type) {
            return type(Output.of(type));
        }

        public ExternalDynamicListState build() {
            return $;
        }
    }

}