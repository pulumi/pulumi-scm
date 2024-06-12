// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.ScepProfileScepChallengeDynamicChallengeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScepProfileScepChallengeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScepProfileScepChallengeArgs Empty = new ScepProfileScepChallengeArgs();

    /**
     * The DynamicChallenge param. Ensure that only one of the following is specified: `dynamic`, `fixed`, `none`
     * 
     */
    @Import(name="dynamicChallenge")
    private @Nullable Output<ScepProfileScepChallengeDynamicChallengeArgs> dynamicChallenge;

    /**
     * @return The DynamicChallenge param. Ensure that only one of the following is specified: `dynamic`, `fixed`, `none`
     * 
     */
    public Optional<Output<ScepProfileScepChallengeDynamicChallengeArgs>> dynamicChallenge() {
        return Optional.ofNullable(this.dynamicChallenge);
    }

    /**
     * Challenge to use for SCEP server on mobile clients. String length must not exceed 1024 characters. Ensure that only one of the following is specified: `dynamic`, `fixed`, `none`
     * 
     */
    @Import(name="fixed")
    private @Nullable Output<String> fixed;

    /**
     * @return Challenge to use for SCEP server on mobile clients. String length must not exceed 1024 characters. Ensure that only one of the following is specified: `dynamic`, `fixed`, `none`
     * 
     */
    public Optional<Output<String>> fixed() {
        return Optional.ofNullable(this.fixed);
    }

    /**
     * The None param. String must be one of these: `&#34;&#34;`. Ensure that only one of the following is specified: `dynamic`, `fixed`, `none`
     * 
     */
    @Import(name="none")
    private @Nullable Output<String> none;

    /**
     * @return The None param. String must be one of these: `&#34;&#34;`. Ensure that only one of the following is specified: `dynamic`, `fixed`, `none`
     * 
     */
    public Optional<Output<String>> none() {
        return Optional.ofNullable(this.none);
    }

    private ScepProfileScepChallengeArgs() {}

    private ScepProfileScepChallengeArgs(ScepProfileScepChallengeArgs $) {
        this.dynamicChallenge = $.dynamicChallenge;
        this.fixed = $.fixed;
        this.none = $.none;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScepProfileScepChallengeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScepProfileScepChallengeArgs $;

        public Builder() {
            $ = new ScepProfileScepChallengeArgs();
        }

        public Builder(ScepProfileScepChallengeArgs defaults) {
            $ = new ScepProfileScepChallengeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dynamicChallenge The DynamicChallenge param. Ensure that only one of the following is specified: `dynamic`, `fixed`, `none`
         * 
         * @return builder
         * 
         */
        public Builder dynamicChallenge(@Nullable Output<ScepProfileScepChallengeDynamicChallengeArgs> dynamicChallenge) {
            $.dynamicChallenge = dynamicChallenge;
            return this;
        }

        /**
         * @param dynamicChallenge The DynamicChallenge param. Ensure that only one of the following is specified: `dynamic`, `fixed`, `none`
         * 
         * @return builder
         * 
         */
        public Builder dynamicChallenge(ScepProfileScepChallengeDynamicChallengeArgs dynamicChallenge) {
            return dynamicChallenge(Output.of(dynamicChallenge));
        }

        /**
         * @param fixed Challenge to use for SCEP server on mobile clients. String length must not exceed 1024 characters. Ensure that only one of the following is specified: `dynamic`, `fixed`, `none`
         * 
         * @return builder
         * 
         */
        public Builder fixed(@Nullable Output<String> fixed) {
            $.fixed = fixed;
            return this;
        }

        /**
         * @param fixed Challenge to use for SCEP server on mobile clients. String length must not exceed 1024 characters. Ensure that only one of the following is specified: `dynamic`, `fixed`, `none`
         * 
         * @return builder
         * 
         */
        public Builder fixed(String fixed) {
            return fixed(Output.of(fixed));
        }

        /**
         * @param none The None param. String must be one of these: `&#34;&#34;`. Ensure that only one of the following is specified: `dynamic`, `fixed`, `none`
         * 
         * @return builder
         * 
         */
        public Builder none(@Nullable Output<String> none) {
            $.none = none;
            return this;
        }

        /**
         * @param none The None param. String must be one of these: `&#34;&#34;`. Ensure that only one of the following is specified: `dynamic`, `fixed`, `none`
         * 
         * @return builder
         * 
         */
        public Builder none(String none) {
            return none(Output.of(none));
        }

        public ScepProfileScepChallengeArgs build() {
            return $;
        }
    }

}