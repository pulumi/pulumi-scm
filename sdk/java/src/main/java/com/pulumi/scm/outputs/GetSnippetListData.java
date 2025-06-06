// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSnippetListData {
    /**
     * @return The Description param.
     * 
     */
    private String description;
    /**
     * @return The Id param.
     * 
     */
    private String id;
    /**
     * @return The Labels param.
     * 
     */
    private List<String> labels;
    /**
     * @return The Name param.
     * 
     */
    private String name;
    /**
     * @return The Type param. String must be one of these: `&#34;predefined&#34;`, `&#34;custom&#34;`.
     * 
     */
    private String type;

    private GetSnippetListData() {}
    /**
     * @return The Description param.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The Id param.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Labels param.
     * 
     */
    public List<String> labels() {
        return this.labels;
    }
    /**
     * @return The Name param.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Type param. String must be one of these: `&#34;predefined&#34;`, `&#34;custom&#34;`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnippetListData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private List<String> labels;
        private String name;
        private String type;
        public Builder() {}
        public Builder(GetSnippetListData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetSnippetListData", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSnippetListData", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder labels(List<String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetSnippetListData", "labels");
            }
            this.labels = labels;
            return this;
        }
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetSnippetListData", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetSnippetListData", "type");
            }
            this.type = type;
            return this;
        }
        public GetSnippetListData build() {
            final var _resultValue = new GetSnippetListData();
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.name = name;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
