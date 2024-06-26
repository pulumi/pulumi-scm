// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.HttpHeaderProfileHttpHeaderInsertionTypeHeader;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class HttpHeaderProfileHttpHeaderInsertionType {
    /**
     * @return The Domains param.
     * 
     */
    private List<String> domains;
    /**
     * @return The Headers param.
     * 
     */
    private List<HttpHeaderProfileHttpHeaderInsertionTypeHeader> headers;
    /**
     * @return The Name param.
     * 
     */
    private String name;

    private HttpHeaderProfileHttpHeaderInsertionType() {}
    /**
     * @return The Domains param.
     * 
     */
    public List<String> domains() {
        return this.domains;
    }
    /**
     * @return The Headers param.
     * 
     */
    public List<HttpHeaderProfileHttpHeaderInsertionTypeHeader> headers() {
        return this.headers;
    }
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderProfileHttpHeaderInsertionType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> domains;
        private List<HttpHeaderProfileHttpHeaderInsertionTypeHeader> headers;
        private String name;
        public Builder() {}
        public Builder(HttpHeaderProfileHttpHeaderInsertionType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domains = defaults.domains;
    	      this.headers = defaults.headers;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder domains(List<String> domains) {
            if (domains == null) {
              throw new MissingRequiredPropertyException("HttpHeaderProfileHttpHeaderInsertionType", "domains");
            }
            this.domains = domains;
            return this;
        }
        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }
        @CustomType.Setter
        public Builder headers(List<HttpHeaderProfileHttpHeaderInsertionTypeHeader> headers) {
            if (headers == null) {
              throw new MissingRequiredPropertyException("HttpHeaderProfileHttpHeaderInsertionType", "headers");
            }
            this.headers = headers;
            return this;
        }
        public Builder headers(HttpHeaderProfileHttpHeaderInsertionTypeHeader... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("HttpHeaderProfileHttpHeaderInsertionType", "name");
            }
            this.name = name;
            return this;
        }
        public HttpHeaderProfileHttpHeaderInsertionType build() {
            final var _resultValue = new HttpHeaderProfileHttpHeaderInsertionType();
            _resultValue.domains = domains;
            _resultValue.headers = headers;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
