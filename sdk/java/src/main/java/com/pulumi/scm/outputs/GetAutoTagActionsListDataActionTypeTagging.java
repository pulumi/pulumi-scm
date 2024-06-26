// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAutoTagActionsListDataActionTypeTagging {
    /**
     * @return Add or Remove tag option. String must be one of these: `&#34;add-tag&#34;`, `&#34;remove-tag&#34;`.
     * 
     */
    private String action;
    /**
     * @return Tags for address object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
     * 
     */
    private List<String> tags;
    /**
     * @return Source or Destination Address, User, X-Forwarded-For Address.
     * 
     */
    private String target;
    /**
     * @return The Timeout param.
     * 
     */
    private Integer timeout;

    private GetAutoTagActionsListDataActionTypeTagging() {}
    /**
     * @return Add or Remove tag option. String must be one of these: `&#34;add-tag&#34;`, `&#34;remove-tag&#34;`.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return Tags for address object. List must contain at most 64 elements. Individual elements in this list are subject to additional validation. String length must not exceed 127 characters.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return Source or Destination Address, User, X-Forwarded-For Address.
     * 
     */
    public String target() {
        return this.target;
    }
    /**
     * @return The Timeout param.
     * 
     */
    public Integer timeout() {
        return this.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutoTagActionsListDataActionTypeTagging defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private List<String> tags;
        private String target;
        private Integer timeout;
        public Builder() {}
        public Builder(GetAutoTagActionsListDataActionTypeTagging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.tags = defaults.tags;
    	      this.target = defaults.target;
    	      this.timeout = defaults.timeout;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("GetAutoTagActionsListDataActionTypeTagging", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetAutoTagActionsListDataActionTypeTagging", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder target(String target) {
            if (target == null) {
              throw new MissingRequiredPropertyException("GetAutoTagActionsListDataActionTypeTagging", "target");
            }
            this.target = target;
            return this;
        }
        @CustomType.Setter
        public Builder timeout(Integer timeout) {
            if (timeout == null) {
              throw new MissingRequiredPropertyException("GetAutoTagActionsListDataActionTypeTagging", "timeout");
            }
            this.timeout = timeout;
            return this;
        }
        public GetAutoTagActionsListDataActionTypeTagging build() {
            final var _resultValue = new GetAutoTagActionsListDataActionTypeTagging();
            _resultValue.action = action;
            _resultValue.tags = tags;
            _resultValue.target = target;
            _resultValue.timeout = timeout;
            return _resultValue;
        }
    }
}
