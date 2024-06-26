// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.AuthenticationProfileLockoutArgs;
import com.pulumi.scm.inputs.AuthenticationProfileMethodArgs;
import com.pulumi.scm.inputs.AuthenticationProfileMultiFactorAuthArgs;
import com.pulumi.scm.inputs.AuthenticationProfileSingleSignOnArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthenticationProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthenticationProfileArgs Empty = new AuthenticationProfileArgs();

    /**
     * The AllowList param.
     * 
     */
    @Import(name="allowLists")
    private @Nullable Output<List<String>> allowLists;

    /**
     * @return The AllowList param.
     * 
     */
    public Optional<Output<List<String>>> allowLists() {
        return Optional.ofNullable(this.allowLists);
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
     * The Lockout param.
     * 
     */
    @Import(name="lockout")
    private @Nullable Output<AuthenticationProfileLockoutArgs> lockout;

    /**
     * @return The Lockout param.
     * 
     */
    public Optional<Output<AuthenticationProfileLockoutArgs>> lockout() {
        return Optional.ofNullable(this.lockout);
    }

    /**
     * The Method param.
     * 
     */
    @Import(name="method")
    private @Nullable Output<AuthenticationProfileMethodArgs> method;

    /**
     * @return The Method param.
     * 
     */
    public Optional<Output<AuthenticationProfileMethodArgs>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * The MultiFactorAuth param.
     * 
     */
    @Import(name="multiFactorAuth")
    private @Nullable Output<AuthenticationProfileMultiFactorAuthArgs> multiFactorAuth;

    /**
     * @return The MultiFactorAuth param.
     * 
     */
    public Optional<Output<AuthenticationProfileMultiFactorAuthArgs>> multiFactorAuth() {
        return Optional.ofNullable(this.multiFactorAuth);
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
     * The SingleSignOn param.
     * 
     */
    @Import(name="singleSignOn")
    private @Nullable Output<AuthenticationProfileSingleSignOnArgs> singleSignOn;

    /**
     * @return The SingleSignOn param.
     * 
     */
    public Optional<Output<AuthenticationProfileSingleSignOnArgs>> singleSignOn() {
        return Optional.ofNullable(this.singleSignOn);
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

    /**
     * The UserDomain param. String length must not exceed 63 characters.
     * 
     */
    @Import(name="userDomain")
    private @Nullable Output<String> userDomain;

    /**
     * @return The UserDomain param. String length must not exceed 63 characters.
     * 
     */
    public Optional<Output<String>> userDomain() {
        return Optional.ofNullable(this.userDomain);
    }

    /**
     * The UsernameModifier param. String must be one of these: `&#34;%USERINPUT%&#34;`, `&#34;%USERINPUT%{@literal @}%USERDOMAIN%&#34;`, `&#34;%USERDOMAIN%\\%USERINPUT%&#34;`.
     * 
     */
    @Import(name="usernameModifier")
    private @Nullable Output<String> usernameModifier;

    /**
     * @return The UsernameModifier param. String must be one of these: `&#34;%USERINPUT%&#34;`, `&#34;%USERINPUT%{@literal @}%USERDOMAIN%&#34;`, `&#34;%USERDOMAIN%\\%USERINPUT%&#34;`.
     * 
     */
    public Optional<Output<String>> usernameModifier() {
        return Optional.ofNullable(this.usernameModifier);
    }

    private AuthenticationProfileArgs() {}

    private AuthenticationProfileArgs(AuthenticationProfileArgs $) {
        this.allowLists = $.allowLists;
        this.device = $.device;
        this.folder = $.folder;
        this.lockout = $.lockout;
        this.method = $.method;
        this.multiFactorAuth = $.multiFactorAuth;
        this.name = $.name;
        this.singleSignOn = $.singleSignOn;
        this.snippet = $.snippet;
        this.userDomain = $.userDomain;
        this.usernameModifier = $.usernameModifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthenticationProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticationProfileArgs $;

        public Builder() {
            $ = new AuthenticationProfileArgs();
        }

        public Builder(AuthenticationProfileArgs defaults) {
            $ = new AuthenticationProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowLists The AllowList param.
         * 
         * @return builder
         * 
         */
        public Builder allowLists(@Nullable Output<List<String>> allowLists) {
            $.allowLists = allowLists;
            return this;
        }

        /**
         * @param allowLists The AllowList param.
         * 
         * @return builder
         * 
         */
        public Builder allowLists(List<String> allowLists) {
            return allowLists(Output.of(allowLists));
        }

        /**
         * @param allowLists The AllowList param.
         * 
         * @return builder
         * 
         */
        public Builder allowLists(String... allowLists) {
            return allowLists(List.of(allowLists));
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
         * @param lockout The Lockout param.
         * 
         * @return builder
         * 
         */
        public Builder lockout(@Nullable Output<AuthenticationProfileLockoutArgs> lockout) {
            $.lockout = lockout;
            return this;
        }

        /**
         * @param lockout The Lockout param.
         * 
         * @return builder
         * 
         */
        public Builder lockout(AuthenticationProfileLockoutArgs lockout) {
            return lockout(Output.of(lockout));
        }

        /**
         * @param method The Method param.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<AuthenticationProfileMethodArgs> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method The Method param.
         * 
         * @return builder
         * 
         */
        public Builder method(AuthenticationProfileMethodArgs method) {
            return method(Output.of(method));
        }

        /**
         * @param multiFactorAuth The MultiFactorAuth param.
         * 
         * @return builder
         * 
         */
        public Builder multiFactorAuth(@Nullable Output<AuthenticationProfileMultiFactorAuthArgs> multiFactorAuth) {
            $.multiFactorAuth = multiFactorAuth;
            return this;
        }

        /**
         * @param multiFactorAuth The MultiFactorAuth param.
         * 
         * @return builder
         * 
         */
        public Builder multiFactorAuth(AuthenticationProfileMultiFactorAuthArgs multiFactorAuth) {
            return multiFactorAuth(Output.of(multiFactorAuth));
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
         * @param singleSignOn The SingleSignOn param.
         * 
         * @return builder
         * 
         */
        public Builder singleSignOn(@Nullable Output<AuthenticationProfileSingleSignOnArgs> singleSignOn) {
            $.singleSignOn = singleSignOn;
            return this;
        }

        /**
         * @param singleSignOn The SingleSignOn param.
         * 
         * @return builder
         * 
         */
        public Builder singleSignOn(AuthenticationProfileSingleSignOnArgs singleSignOn) {
            return singleSignOn(Output.of(singleSignOn));
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

        /**
         * @param userDomain The UserDomain param. String length must not exceed 63 characters.
         * 
         * @return builder
         * 
         */
        public Builder userDomain(@Nullable Output<String> userDomain) {
            $.userDomain = userDomain;
            return this;
        }

        /**
         * @param userDomain The UserDomain param. String length must not exceed 63 characters.
         * 
         * @return builder
         * 
         */
        public Builder userDomain(String userDomain) {
            return userDomain(Output.of(userDomain));
        }

        /**
         * @param usernameModifier The UsernameModifier param. String must be one of these: `&#34;%USERINPUT%&#34;`, `&#34;%USERINPUT%{@literal @}%USERDOMAIN%&#34;`, `&#34;%USERDOMAIN%\\%USERINPUT%&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder usernameModifier(@Nullable Output<String> usernameModifier) {
            $.usernameModifier = usernameModifier;
            return this;
        }

        /**
         * @param usernameModifier The UsernameModifier param. String must be one of these: `&#34;%USERINPUT%&#34;`, `&#34;%USERINPUT%{@literal @}%USERDOMAIN%&#34;`, `&#34;%USERDOMAIN%\\%USERINPUT%&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder usernameModifier(String usernameModifier) {
            return usernameModifier(Output.of(usernameModifier));
        }

        public AuthenticationProfileArgs build() {
            return $;
        }
    }

}
