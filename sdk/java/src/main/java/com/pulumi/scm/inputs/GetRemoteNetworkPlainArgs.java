// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRemoteNetworkPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRemoteNetworkPlainArgs Empty = new GetRemoteNetworkPlainArgs();

    /**
     * The Folder param. String can either be a specific string(`&#34;Remote Networks&#34;`) or match this regex: `^[\s0-9a-zA-Z._-]{1,}$`. Default: `&#34;Remote Networks&#34;`.
     * 
     */
    @Import(name="folder")
    private @Nullable String folder;

    /**
     * @return The Folder param. String can either be a specific string(`&#34;Remote Networks&#34;`) or match this regex: `^[\s0-9a-zA-Z._-]{1,}$`. Default: `&#34;Remote Networks&#34;`.
     * 
     */
    public Optional<String> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * The Id param.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The Id param.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetRemoteNetworkPlainArgs() {}

    private GetRemoteNetworkPlainArgs(GetRemoteNetworkPlainArgs $) {
        this.folder = $.folder;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRemoteNetworkPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRemoteNetworkPlainArgs $;

        public Builder() {
            $ = new GetRemoteNetworkPlainArgs();
        }

        public Builder(GetRemoteNetworkPlainArgs defaults) {
            $ = new GetRemoteNetworkPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param folder The Folder param. String can either be a specific string(`&#34;Remote Networks&#34;`) or match this regex: `^[\s0-9a-zA-Z._-]{1,}$`. Default: `&#34;Remote Networks&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable String folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param id The Id param.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetRemoteNetworkPlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetRemoteNetworkPlainArgs", "id");
            }
            return $;
        }
    }

}
