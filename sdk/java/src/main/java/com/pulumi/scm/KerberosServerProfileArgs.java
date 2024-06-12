// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.inputs.KerberosServerProfileServerArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KerberosServerProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final KerberosServerProfileArgs Empty = new KerberosServerProfileArgs();

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
     * The Servers param.
     * 
     */
    @Import(name="servers", required=true)
    private Output<List<KerberosServerProfileServerArgs>> servers;

    /**
     * @return The Servers param.
     * 
     */
    public Output<List<KerberosServerProfileServerArgs>> servers() {
        return this.servers;
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

    private KerberosServerProfileArgs() {}

    private KerberosServerProfileArgs(KerberosServerProfileArgs $) {
        this.device = $.device;
        this.folder = $.folder;
        this.servers = $.servers;
        this.snippet = $.snippet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KerberosServerProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KerberosServerProfileArgs $;

        public Builder() {
            $ = new KerberosServerProfileArgs();
        }

        public Builder(KerberosServerProfileArgs defaults) {
            $ = new KerberosServerProfileArgs(Objects.requireNonNull(defaults));
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
         * @param servers The Servers param.
         * 
         * @return builder
         * 
         */
        public Builder servers(Output<List<KerberosServerProfileServerArgs>> servers) {
            $.servers = servers;
            return this;
        }

        /**
         * @param servers The Servers param.
         * 
         * @return builder
         * 
         */
        public Builder servers(List<KerberosServerProfileServerArgs> servers) {
            return servers(Output.of(servers));
        }

        /**
         * @param servers The Servers param.
         * 
         * @return builder
         * 
         */
        public Builder servers(KerberosServerProfileServerArgs... servers) {
            return servers(List.of(servers));
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

        public KerberosServerProfileArgs build() {
            if ($.servers == null) {
                throw new MissingRequiredPropertyException("KerberosServerProfileArgs", "servers");
            }
            return $;
        }
    }

}