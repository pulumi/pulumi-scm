// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVariablePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVariablePlainArgs Empty = new GetVariablePlainArgs();

    /**
     * The Device param.
     * 
     */
    @Import(name="device")
    private @Nullable String device;

    /**
     * @return The Device param.
     * 
     */
    public Optional<String> device() {
        return Optional.ofNullable(this.device);
    }

    /**
     * The Folder param.
     * 
     */
    @Import(name="folder")
    private @Nullable String folder;

    /**
     * @return The Folder param.
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

    /**
     * The Snippet param.
     * 
     */
    @Import(name="snippet")
    private @Nullable String snippet;

    /**
     * @return The Snippet param.
     * 
     */
    public Optional<String> snippet() {
        return Optional.ofNullable(this.snippet);
    }

    private GetVariablePlainArgs() {}

    private GetVariablePlainArgs(GetVariablePlainArgs $) {
        this.device = $.device;
        this.folder = $.folder;
        this.id = $.id;
        this.snippet = $.snippet;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVariablePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVariablePlainArgs $;

        public Builder() {
            $ = new GetVariablePlainArgs();
        }

        public Builder(GetVariablePlainArgs defaults) {
            $ = new GetVariablePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param device The Device param.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable String device) {
            $.device = device;
            return this;
        }

        /**
         * @param folder The Folder param.
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

        /**
         * @param snippet The Snippet param.
         * 
         * @return builder
         * 
         */
        public Builder snippet(@Nullable String snippet) {
            $.snippet = snippet;
            return this;
        }

        public GetVariablePlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetVariablePlainArgs", "id");
            }
            return $;
        }
    }

}
