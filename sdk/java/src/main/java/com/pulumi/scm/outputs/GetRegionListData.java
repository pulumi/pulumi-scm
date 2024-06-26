// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetRegionListDataGeoLocation;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRegionListData {
    /**
     * @return The Addresses param.
     * 
     */
    private List<String> addresses;
    /**
     * @return The GeoLocation param.
     * 
     */
    private GetRegionListDataGeoLocation geoLocation;
    /**
     * @return UUID of the resource.
     * 
     */
    private String id;
    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    private String name;

    private GetRegionListData() {}
    /**
     * @return The Addresses param.
     * 
     */
    public List<String> addresses() {
        return this.addresses;
    }
    /**
     * @return The GeoLocation param.
     * 
     */
    public GetRegionListDataGeoLocation geoLocation() {
        return this.geoLocation;
    }
    /**
     * @return UUID of the resource.
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionListData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> addresses;
        private GetRegionListDataGeoLocation geoLocation;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetRegionListData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.geoLocation = defaults.geoLocation;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder addresses(List<String> addresses) {
            if (addresses == null) {
              throw new MissingRequiredPropertyException("GetRegionListData", "addresses");
            }
            this.addresses = addresses;
            return this;
        }
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }
        @CustomType.Setter
        public Builder geoLocation(GetRegionListDataGeoLocation geoLocation) {
            if (geoLocation == null) {
              throw new MissingRequiredPropertyException("GetRegionListData", "geoLocation");
            }
            this.geoLocation = geoLocation;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRegionListData", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetRegionListData", "name");
            }
            this.name = name;
            return this;
        }
        public GetRegionListData build() {
            final var _resultValue = new GetRegionListData();
            _resultValue.addresses = addresses;
            _resultValue.geoLocation = geoLocation;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
