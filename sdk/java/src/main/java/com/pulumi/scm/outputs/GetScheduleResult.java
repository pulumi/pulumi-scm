// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetScheduleScheduleType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetScheduleResult {
    /**
     * @return The Id param.
     * 
     */
    private String id;
    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    private String name;
    /**
     * @return The ScheduleType param.
     * 
     */
    private GetScheduleScheduleType scheduleType;
    private String tfid;

    private GetScheduleResult() {}
    /**
     * @return The Id param.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ScheduleType param.
     * 
     */
    public GetScheduleScheduleType scheduleType() {
        return this.scheduleType;
    }
    public String tfid() {
        return this.tfid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduleResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String name;
        private GetScheduleScheduleType scheduleType;
        private String tfid;
        public Builder() {}
        public Builder(GetScheduleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.scheduleType = defaults.scheduleType;
    	      this.tfid = defaults.tfid;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetScheduleResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetScheduleResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder scheduleType(GetScheduleScheduleType scheduleType) {
            if (scheduleType == null) {
              throw new MissingRequiredPropertyException("GetScheduleResult", "scheduleType");
            }
            this.scheduleType = scheduleType;
            return this;
        }
        @CustomType.Setter
        public Builder tfid(String tfid) {
            if (tfid == null) {
              throw new MissingRequiredPropertyException("GetScheduleResult", "tfid");
            }
            this.tfid = tfid;
            return this;
        }
        public GetScheduleResult build() {
            final var _resultValue = new GetScheduleResult();
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.scheduleType = scheduleType;
            _resultValue.tfid = tfid;
            return _resultValue;
        }
    }
}