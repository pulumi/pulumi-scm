// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetIkeCryptoProfileListDataLifetime;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIkeCryptoProfileListData {
    /**
     * @return IKEv2 SA reauthentication interval equals authetication-multiple * rekey-lifetime; 0 means reauthentication disabled. Value must be less than or equal to 50. Default: `0`.
     * 
     */
    private Integer authenticationMultiple;
    /**
     * @return The DhGroups param. Individual elements in this list are subject to additional validation. String must be one of these: `&#34;group1&#34;`, `&#34;group2&#34;`, `&#34;group5&#34;`, `&#34;group14&#34;`, `&#34;group19&#34;`, `&#34;group20&#34;`.
     * 
     */
    private List<String> dhGroups;
    /**
     * @return Encryption algorithm. Individual elements in this list are subject to additional validation. String must be one of these: `&#34;des&#34;`, `&#34;3des&#34;`, `&#34;aes-128-cbc&#34;`, `&#34;aes-192-cbc&#34;`, `&#34;aes-256-cbc&#34;`, `&#34;aes-128-gcm&#34;`, `&#34;aes-256-gcm&#34;`.
     * 
     */
    private List<String> encryptions;
    /**
     * @return The Hashes param. Individual elements in this list are subject to additional validation. String must be one of these: `&#34;md5&#34;`, `&#34;sha1&#34;`, `&#34;sha256&#34;`, `&#34;sha384&#34;`, `&#34;sha512&#34;`.
     * 
     */
    private List<String> hashes;
    /**
     * @return UUID of the resource.
     * 
     */
    private String id;
    /**
     * @return The Lifetime param.
     * 
     */
    private GetIkeCryptoProfileListDataLifetime lifetime;
    /**
     * @return Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    private String name;

    private GetIkeCryptoProfileListData() {}
    /**
     * @return IKEv2 SA reauthentication interval equals authetication-multiple * rekey-lifetime; 0 means reauthentication disabled. Value must be less than or equal to 50. Default: `0`.
     * 
     */
    public Integer authenticationMultiple() {
        return this.authenticationMultiple;
    }
    /**
     * @return The DhGroups param. Individual elements in this list are subject to additional validation. String must be one of these: `&#34;group1&#34;`, `&#34;group2&#34;`, `&#34;group5&#34;`, `&#34;group14&#34;`, `&#34;group19&#34;`, `&#34;group20&#34;`.
     * 
     */
    public List<String> dhGroups() {
        return this.dhGroups;
    }
    /**
     * @return Encryption algorithm. Individual elements in this list are subject to additional validation. String must be one of these: `&#34;des&#34;`, `&#34;3des&#34;`, `&#34;aes-128-cbc&#34;`, `&#34;aes-192-cbc&#34;`, `&#34;aes-256-cbc&#34;`, `&#34;aes-128-gcm&#34;`, `&#34;aes-256-gcm&#34;`.
     * 
     */
    public List<String> encryptions() {
        return this.encryptions;
    }
    /**
     * @return The Hashes param. Individual elements in this list are subject to additional validation. String must be one of these: `&#34;md5&#34;`, `&#34;sha1&#34;`, `&#34;sha256&#34;`, `&#34;sha384&#34;`, `&#34;sha512&#34;`.
     * 
     */
    public List<String> hashes() {
        return this.hashes;
    }
    /**
     * @return UUID of the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Lifetime param.
     * 
     */
    public GetIkeCryptoProfileListDataLifetime lifetime() {
        return this.lifetime;
    }
    /**
     * @return Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIkeCryptoProfileListData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer authenticationMultiple;
        private List<String> dhGroups;
        private List<String> encryptions;
        private List<String> hashes;
        private String id;
        private GetIkeCryptoProfileListDataLifetime lifetime;
        private String name;
        public Builder() {}
        public Builder(GetIkeCryptoProfileListData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationMultiple = defaults.authenticationMultiple;
    	      this.dhGroups = defaults.dhGroups;
    	      this.encryptions = defaults.encryptions;
    	      this.hashes = defaults.hashes;
    	      this.id = defaults.id;
    	      this.lifetime = defaults.lifetime;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder authenticationMultiple(Integer authenticationMultiple) {
            if (authenticationMultiple == null) {
              throw new MissingRequiredPropertyException("GetIkeCryptoProfileListData", "authenticationMultiple");
            }
            this.authenticationMultiple = authenticationMultiple;
            return this;
        }
        @CustomType.Setter
        public Builder dhGroups(List<String> dhGroups) {
            if (dhGroups == null) {
              throw new MissingRequiredPropertyException("GetIkeCryptoProfileListData", "dhGroups");
            }
            this.dhGroups = dhGroups;
            return this;
        }
        public Builder dhGroups(String... dhGroups) {
            return dhGroups(List.of(dhGroups));
        }
        @CustomType.Setter
        public Builder encryptions(List<String> encryptions) {
            if (encryptions == null) {
              throw new MissingRequiredPropertyException("GetIkeCryptoProfileListData", "encryptions");
            }
            this.encryptions = encryptions;
            return this;
        }
        public Builder encryptions(String... encryptions) {
            return encryptions(List.of(encryptions));
        }
        @CustomType.Setter
        public Builder hashes(List<String> hashes) {
            if (hashes == null) {
              throw new MissingRequiredPropertyException("GetIkeCryptoProfileListData", "hashes");
            }
            this.hashes = hashes;
            return this;
        }
        public Builder hashes(String... hashes) {
            return hashes(List.of(hashes));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetIkeCryptoProfileListData", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder lifetime(GetIkeCryptoProfileListDataLifetime lifetime) {
            if (lifetime == null) {
              throw new MissingRequiredPropertyException("GetIkeCryptoProfileListData", "lifetime");
            }
            this.lifetime = lifetime;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetIkeCryptoProfileListData", "name");
            }
            this.name = name;
            return this;
        }
        public GetIkeCryptoProfileListData build() {
            final var _resultValue = new GetIkeCryptoProfileListData();
            _resultValue.authenticationMultiple = authenticationMultiple;
            _resultValue.dhGroups = dhGroups;
            _resultValue.encryptions = encryptions;
            _resultValue.hashes = hashes;
            _resultValue.id = id;
            _resultValue.lifetime = lifetime;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
