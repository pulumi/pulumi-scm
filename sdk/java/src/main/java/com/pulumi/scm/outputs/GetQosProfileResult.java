// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetQosProfileAggregateBandwidth;
import com.pulumi.scm.outputs.GetQosProfileClassBandwidthType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetQosProfileResult {
    /**
     * @return The AggregateBandwidth param.
     * 
     */
    private GetQosProfileAggregateBandwidth aggregateBandwidth;
    /**
     * @return The ClassBandwidthType param.
     * 
     */
    private GetQosProfileClassBandwidthType classBandwidthType;
    /**
     * @return The Folder param.
     * 
     */
    private @Nullable String folder;
    /**
     * @return The Id param.
     * 
     */
    private String id;
    /**
     * @return Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    private String name;
    private String tfid;

    private GetQosProfileResult() {}
    /**
     * @return The AggregateBandwidth param.
     * 
     */
    public GetQosProfileAggregateBandwidth aggregateBandwidth() {
        return this.aggregateBandwidth;
    }
    /**
     * @return The ClassBandwidthType param.
     * 
     */
    public GetQosProfileClassBandwidthType classBandwidthType() {
        return this.classBandwidthType;
    }
    /**
     * @return The Folder param.
     * 
     */
    public Optional<String> folder() {
        return Optional.ofNullable(this.folder);
    }
    /**
     * @return The Id param.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Alphanumeric string begin with letter: [0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    public String tfid() {
        return this.tfid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQosProfileResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetQosProfileAggregateBandwidth aggregateBandwidth;
        private GetQosProfileClassBandwidthType classBandwidthType;
        private @Nullable String folder;
        private String id;
        private String name;
        private String tfid;
        public Builder() {}
        public Builder(GetQosProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregateBandwidth = defaults.aggregateBandwidth;
    	      this.classBandwidthType = defaults.classBandwidthType;
    	      this.folder = defaults.folder;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.tfid = defaults.tfid;
        }

        @CustomType.Setter
        public Builder aggregateBandwidth(GetQosProfileAggregateBandwidth aggregateBandwidth) {
            if (aggregateBandwidth == null) {
              throw new MissingRequiredPropertyException("GetQosProfileResult", "aggregateBandwidth");
            }
            this.aggregateBandwidth = aggregateBandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder classBandwidthType(GetQosProfileClassBandwidthType classBandwidthType) {
            if (classBandwidthType == null) {
              throw new MissingRequiredPropertyException("GetQosProfileResult", "classBandwidthType");
            }
            this.classBandwidthType = classBandwidthType;
            return this;
        }
        @CustomType.Setter
        public Builder folder(@Nullable String folder) {

            this.folder = folder;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetQosProfileResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetQosProfileResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder tfid(String tfid) {
            if (tfid == null) {
              throw new MissingRequiredPropertyException("GetQosProfileResult", "tfid");
            }
            this.tfid = tfid;
            return this;
        }
        public GetQosProfileResult build() {
            final var _resultValue = new GetQosProfileResult();
            _resultValue.aggregateBandwidth = aggregateBandwidth;
            _resultValue.classBandwidthType = classBandwidthType;
            _resultValue.folder = folder;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.tfid = tfid;
            return _resultValue;
        }
    }
}
