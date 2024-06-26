// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class IpsecCryptoProfileAhArgs extends com.pulumi.resources.ResourceArgs {

    public static final IpsecCryptoProfileAhArgs Empty = new IpsecCryptoProfileAhArgs();

    /**
     * The Authentications param. Individual elements in this list are subject to additional validation. String must be one of these: `&#34;md5&#34;`, `&#34;sha1&#34;`, `&#34;sha256&#34;`, `&#34;sha384&#34;`, `&#34;sha512&#34;`.
     * 
     */
    @Import(name="authentications", required=true)
    private Output<List<String>> authentications;

    /**
     * @return The Authentications param. Individual elements in this list are subject to additional validation. String must be one of these: `&#34;md5&#34;`, `&#34;sha1&#34;`, `&#34;sha256&#34;`, `&#34;sha384&#34;`, `&#34;sha512&#34;`.
     * 
     */
    public Output<List<String>> authentications() {
        return this.authentications;
    }

    private IpsecCryptoProfileAhArgs() {}

    private IpsecCryptoProfileAhArgs(IpsecCryptoProfileAhArgs $) {
        this.authentications = $.authentications;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IpsecCryptoProfileAhArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IpsecCryptoProfileAhArgs $;

        public Builder() {
            $ = new IpsecCryptoProfileAhArgs();
        }

        public Builder(IpsecCryptoProfileAhArgs defaults) {
            $ = new IpsecCryptoProfileAhArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authentications The Authentications param. Individual elements in this list are subject to additional validation. String must be one of these: `&#34;md5&#34;`, `&#34;sha1&#34;`, `&#34;sha256&#34;`, `&#34;sha384&#34;`, `&#34;sha512&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder authentications(Output<List<String>> authentications) {
            $.authentications = authentications;
            return this;
        }

        /**
         * @param authentications The Authentications param. Individual elements in this list are subject to additional validation. String must be one of these: `&#34;md5&#34;`, `&#34;sha1&#34;`, `&#34;sha256&#34;`, `&#34;sha384&#34;`, `&#34;sha512&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder authentications(List<String> authentications) {
            return authentications(Output.of(authentications));
        }

        /**
         * @param authentications The Authentications param. Individual elements in this list are subject to additional validation. String must be one of these: `&#34;md5&#34;`, `&#34;sha1&#34;`, `&#34;sha256&#34;`, `&#34;sha384&#34;`, `&#34;sha512&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder authentications(String... authentications) {
            return authentications(List.of(authentications));
        }

        public IpsecCryptoProfileAhArgs build() {
            if ($.authentications == null) {
                throw new MissingRequiredPropertyException("IpsecCryptoProfileAhArgs", "authentications");
            }
            return $;
        }
    }

}
