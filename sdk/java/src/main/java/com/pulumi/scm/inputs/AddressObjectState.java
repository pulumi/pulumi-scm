// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AddressObjectState extends com.pulumi.resources.ResourceArgs {

    public static final AddressObjectState Empty = new AddressObjectState();

    /**
     * The Description param. String length must not exceed 1023 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The Description param. String length must not exceed 1023 characters.
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
     * The Fqdn param. String length must be between 1 and 255 characters. String validation regex: `^a-zA-Z0-9_+[a-zA-Z0-9]$`. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
     * 
     */
    @Import(name="fqdn")
    private @Nullable Output<String> fqdn;

    /**
     * @return The Fqdn param. String length must be between 1 and 255 characters. String validation regex: `^a-zA-Z0-9_+[a-zA-Z0-9]$`. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
     * 
     */
    public Optional<Output<String>> fqdn() {
        return Optional.ofNullable(this.fqdn);
    }

    /**
     * The IpNetmask param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
     * 
     */
    @Import(name="ipNetmask")
    private @Nullable Output<String> ipNetmask;

    /**
     * @return The IpNetmask param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
     * 
     */
    public Optional<Output<String>> ipNetmask() {
        return Optional.ofNullable(this.ipNetmask);
    }

    /**
     * The IpRange param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
     * 
     */
    @Import(name="ipRange")
    private @Nullable Output<String> ipRange;

    /**
     * @return The IpRange param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
     * 
     */
    public Optional<Output<String>> ipRange() {
        return Optional.ofNullable(this.ipRange);
    }

    /**
     * The IpWildcard param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
     * 
     */
    @Import(name="ipWildcard")
    private @Nullable Output<String> ipWildcard;

    /**
     * @return The IpWildcard param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
     * 
     */
    public Optional<Output<String>> ipWildcard() {
        return Optional.ofNullable(this.ipWildcard);
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

    /**
     * Tags for address object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags for address object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
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
    private @Nullable Output<String> type;

    /**
     * @return The Type param.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private AddressObjectState() {}

    private AddressObjectState(AddressObjectState $) {
        this.description = $.description;
        this.device = $.device;
        this.folder = $.folder;
        this.fqdn = $.fqdn;
        this.ipNetmask = $.ipNetmask;
        this.ipRange = $.ipRange;
        this.ipWildcard = $.ipWildcard;
        this.name = $.name;
        this.snippet = $.snippet;
        this.tags = $.tags;
        this.tfid = $.tfid;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AddressObjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddressObjectState $;

        public Builder() {
            $ = new AddressObjectState();
        }

        public Builder(AddressObjectState defaults) {
            $ = new AddressObjectState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The Description param. String length must not exceed 1023 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The Description param. String length must not exceed 1023 characters.
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
         * @param fqdn The Fqdn param. String length must be between 1 and 255 characters. String validation regex: `^a-zA-Z0-9_+[a-zA-Z0-9]$`. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
         * 
         * @return builder
         * 
         */
        public Builder fqdn(@Nullable Output<String> fqdn) {
            $.fqdn = fqdn;
            return this;
        }

        /**
         * @param fqdn The Fqdn param. String length must be between 1 and 255 characters. String validation regex: `^a-zA-Z0-9_+[a-zA-Z0-9]$`. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
         * 
         * @return builder
         * 
         */
        public Builder fqdn(String fqdn) {
            return fqdn(Output.of(fqdn));
        }

        /**
         * @param ipNetmask The IpNetmask param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
         * 
         * @return builder
         * 
         */
        public Builder ipNetmask(@Nullable Output<String> ipNetmask) {
            $.ipNetmask = ipNetmask;
            return this;
        }

        /**
         * @param ipNetmask The IpNetmask param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
         * 
         * @return builder
         * 
         */
        public Builder ipNetmask(String ipNetmask) {
            return ipNetmask(Output.of(ipNetmask));
        }

        /**
         * @param ipRange The IpRange param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
         * 
         * @return builder
         * 
         */
        public Builder ipRange(@Nullable Output<String> ipRange) {
            $.ipRange = ipRange;
            return this;
        }

        /**
         * @param ipRange The IpRange param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
         * 
         * @return builder
         * 
         */
        public Builder ipRange(String ipRange) {
            return ipRange(Output.of(ipRange));
        }

        /**
         * @param ipWildcard The IpWildcard param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
         * 
         * @return builder
         * 
         */
        public Builder ipWildcard(@Nullable Output<String> ipWildcard) {
            $.ipWildcard = ipWildcard;
            return this;
        }

        /**
         * @param ipWildcard The IpWildcard param. Ensure that only one of the following is specified: `fqdn`, `ip_netmask`, `ip_range`, `ip_wildcard`
         * 
         * @return builder
         * 
         */
        public Builder ipWildcard(String ipWildcard) {
            return ipWildcard(Output.of(ipWildcard));
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

        /**
         * @param tags Tags for address object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags for address object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags for address object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
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
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The Type param.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AddressObjectState build() {
            return $;
        }
    }

}
