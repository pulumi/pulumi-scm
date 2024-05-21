// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.IpsecCryptoProfileAhArgs;
import com.pulumi.scm.inputs.IpsecCryptoProfileEspArgs;
import com.pulumi.scm.inputs.IpsecCryptoProfileLifesizeArgs;
import com.pulumi.scm.inputs.IpsecCryptoProfileLifetimeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IpsecCryptoProfileState extends com.pulumi.resources.ResourceArgs {

    public static final IpsecCryptoProfileState Empty = new IpsecCryptoProfileState();

    /**
     * The Ah param. Ensure that only one of the following is specified: `ah`, `esp`
     * 
     */
    @Import(name="ah")
    private @Nullable Output<IpsecCryptoProfileAhArgs> ah;

    /**
     * @return The Ah param. Ensure that only one of the following is specified: `ah`, `esp`
     * 
     */
    public Optional<Output<IpsecCryptoProfileAhArgs>> ah() {
        return Optional.ofNullable(this.ah);
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
     * phase-2 DH group (PFS DH group). String must be one of these: `&#34;no-pfs&#34;`, `&#34;group1&#34;`, `&#34;group2&#34;`, `&#34;group5&#34;`, `&#34;group14&#34;`, `&#34;group19&#34;`, `&#34;group20&#34;`. Default: `&#34;group2&#34;`.
     * 
     */
    @Import(name="dhGroup")
    private @Nullable Output<String> dhGroup;

    /**
     * @return phase-2 DH group (PFS DH group). String must be one of these: `&#34;no-pfs&#34;`, `&#34;group1&#34;`, `&#34;group2&#34;`, `&#34;group5&#34;`, `&#34;group14&#34;`, `&#34;group19&#34;`, `&#34;group20&#34;`. Default: `&#34;group2&#34;`.
     * 
     */
    public Optional<Output<String>> dhGroup() {
        return Optional.ofNullable(this.dhGroup);
    }

    /**
     * The Esp param. Ensure that only one of the following is specified: `ah`, `esp`
     * 
     */
    @Import(name="esp")
    private @Nullable Output<IpsecCryptoProfileEspArgs> esp;

    /**
     * @return The Esp param. Ensure that only one of the following is specified: `ah`, `esp`
     * 
     */
    public Optional<Output<IpsecCryptoProfileEspArgs>> esp() {
        return Optional.ofNullable(this.esp);
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
     * The Lifesize param.
     * 
     */
    @Import(name="lifesize")
    private @Nullable Output<IpsecCryptoProfileLifesizeArgs> lifesize;

    /**
     * @return The Lifesize param.
     * 
     */
    public Optional<Output<IpsecCryptoProfileLifesizeArgs>> lifesize() {
        return Optional.ofNullable(this.lifesize);
    }

    /**
     * The Lifetime param.
     * 
     */
    @Import(name="lifetime")
    private @Nullable Output<IpsecCryptoProfileLifetimeArgs> lifetime;

    /**
     * @return The Lifetime param.
     * 
     */
    public Optional<Output<IpsecCryptoProfileLifetimeArgs>> lifetime() {
        return Optional.ofNullable(this.lifetime);
    }

    /**
     * Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
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

    private IpsecCryptoProfileState() {}

    private IpsecCryptoProfileState(IpsecCryptoProfileState $) {
        this.ah = $.ah;
        this.device = $.device;
        this.dhGroup = $.dhGroup;
        this.esp = $.esp;
        this.folder = $.folder;
        this.lifesize = $.lifesize;
        this.lifetime = $.lifetime;
        this.name = $.name;
        this.snippet = $.snippet;
        this.tfid = $.tfid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpsecCryptoProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpsecCryptoProfileState $;

        public Builder() {
            $ = new IpsecCryptoProfileState();
        }

        public Builder(IpsecCryptoProfileState defaults) {
            $ = new IpsecCryptoProfileState(Objects.requireNonNull(defaults));
        }

        /**
         * @param ah The Ah param. Ensure that only one of the following is specified: `ah`, `esp`
         * 
         * @return builder
         * 
         */
        public Builder ah(@Nullable Output<IpsecCryptoProfileAhArgs> ah) {
            $.ah = ah;
            return this;
        }

        /**
         * @param ah The Ah param. Ensure that only one of the following is specified: `ah`, `esp`
         * 
         * @return builder
         * 
         */
        public Builder ah(IpsecCryptoProfileAhArgs ah) {
            return ah(Output.of(ah));
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
         * @param dhGroup phase-2 DH group (PFS DH group). String must be one of these: `&#34;no-pfs&#34;`, `&#34;group1&#34;`, `&#34;group2&#34;`, `&#34;group5&#34;`, `&#34;group14&#34;`, `&#34;group19&#34;`, `&#34;group20&#34;`. Default: `&#34;group2&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder dhGroup(@Nullable Output<String> dhGroup) {
            $.dhGroup = dhGroup;
            return this;
        }

        /**
         * @param dhGroup phase-2 DH group (PFS DH group). String must be one of these: `&#34;no-pfs&#34;`, `&#34;group1&#34;`, `&#34;group2&#34;`, `&#34;group5&#34;`, `&#34;group14&#34;`, `&#34;group19&#34;`, `&#34;group20&#34;`. Default: `&#34;group2&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder dhGroup(String dhGroup) {
            return dhGroup(Output.of(dhGroup));
        }

        /**
         * @param esp The Esp param. Ensure that only one of the following is specified: `ah`, `esp`
         * 
         * @return builder
         * 
         */
        public Builder esp(@Nullable Output<IpsecCryptoProfileEspArgs> esp) {
            $.esp = esp;
            return this;
        }

        /**
         * @param esp The Esp param. Ensure that only one of the following is specified: `ah`, `esp`
         * 
         * @return builder
         * 
         */
        public Builder esp(IpsecCryptoProfileEspArgs esp) {
            return esp(Output.of(esp));
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
         * @param lifesize The Lifesize param.
         * 
         * @return builder
         * 
         */
        public Builder lifesize(@Nullable Output<IpsecCryptoProfileLifesizeArgs> lifesize) {
            $.lifesize = lifesize;
            return this;
        }

        /**
         * @param lifesize The Lifesize param.
         * 
         * @return builder
         * 
         */
        public Builder lifesize(IpsecCryptoProfileLifesizeArgs lifesize) {
            return lifesize(Output.of(lifesize));
        }

        /**
         * @param lifetime The Lifetime param.
         * 
         * @return builder
         * 
         */
        public Builder lifetime(@Nullable Output<IpsecCryptoProfileLifetimeArgs> lifetime) {
            $.lifetime = lifetime;
            return this;
        }

        /**
         * @param lifetime The Lifetime param.
         * 
         * @return builder
         * 
         */
        public Builder lifetime(IpsecCryptoProfileLifetimeArgs lifetime) {
            return lifetime(Output.of(lifetime));
        }

        /**
         * @param name Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
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

        public IpsecCryptoProfileState build() {
            return $;
        }
    }

}
