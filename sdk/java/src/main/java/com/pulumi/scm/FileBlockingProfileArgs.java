// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.FileBlockingProfileRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileBlockingProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileBlockingProfileArgs Empty = new FileBlockingProfileArgs();

    /**
     * The Description param.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The Description param.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
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
     * The Rules param.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<FileBlockingProfileRuleArgs>> rules;

    /**
     * @return The Rules param.
     * 
     */
    public Optional<Output<List<FileBlockingProfileRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
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

    private FileBlockingProfileArgs() {}

    private FileBlockingProfileArgs(FileBlockingProfileArgs $) {
        this.description = $.description;
        this.device = $.device;
        this.folder = $.folder;
        this.name = $.name;
        this.rules = $.rules;
        this.snippet = $.snippet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileBlockingProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileBlockingProfileArgs $;

        public Builder() {
            $ = new FileBlockingProfileArgs();
        }

        public Builder(FileBlockingProfileArgs defaults) {
            $ = new FileBlockingProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The Description param.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The Description param.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
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
         * @param rules The Rules param.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<FileBlockingProfileRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules The Rules param.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<FileBlockingProfileRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules The Rules param.
         * 
         * @return builder
         * 
         */
        public Builder rules(FileBlockingProfileRuleArgs... rules) {
            return rules(List.of(rules));
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

        public FileBlockingProfileArgs build() {
            return $;
        }
    }

}
