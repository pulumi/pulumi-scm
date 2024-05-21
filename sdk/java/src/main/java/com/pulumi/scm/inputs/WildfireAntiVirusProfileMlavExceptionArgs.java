// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WildfireAntiVirusProfileMlavExceptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WildfireAntiVirusProfileMlavExceptionArgs Empty = new WildfireAntiVirusProfileMlavExceptionArgs();

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
     * The Filename param.
     * 
     */
    @Import(name="filename")
    private @Nullable Output<String> filename;

    /**
     * @return The Filename param.
     * 
     */
    public Optional<Output<String>> filename() {
        return Optional.ofNullable(this.filename);
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

    private WildfireAntiVirusProfileMlavExceptionArgs() {}

    private WildfireAntiVirusProfileMlavExceptionArgs(WildfireAntiVirusProfileMlavExceptionArgs $) {
        this.description = $.description;
        this.filename = $.filename;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WildfireAntiVirusProfileMlavExceptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WildfireAntiVirusProfileMlavExceptionArgs $;

        public Builder() {
            $ = new WildfireAntiVirusProfileMlavExceptionArgs();
        }

        public Builder(WildfireAntiVirusProfileMlavExceptionArgs defaults) {
            $ = new WildfireAntiVirusProfileMlavExceptionArgs(Objects.requireNonNull(defaults));
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
         * @param filename The Filename param.
         * 
         * @return builder
         * 
         */
        public Builder filename(@Nullable Output<String> filename) {
            $.filename = filename;
            return this;
        }

        /**
         * @param filename The Filename param.
         * 
         * @return builder
         * 
         */
        public Builder filename(String filename) {
            return filename(Output.of(filename));
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

        public WildfireAntiVirusProfileMlavExceptionArgs build() {
            return $;
        }
    }

}
