// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTagListData {
    /**
     * @return The Color param. String must be one of these: `&#34;Red&#34;`, `&#34;Green&#34;`, `&#34;Blue&#34;`, `&#34;Yellow&#34;`, `&#34;Copper&#34;`, `&#34;Orange&#34;`, `&#34;Purple&#34;`, `&#34;Gray&#34;`, `&#34;Light Green&#34;`, `&#34;Cyan&#34;`, `&#34;Light Gray&#34;`, `&#34;Blue Gray&#34;`, `&#34;Lime&#34;`, `&#34;Black&#34;`, `&#34;Gold&#34;`, `&#34;Brown&#34;`, `&#34;Olive&#34;`, `&#34;Maroon&#34;`, `&#34;Red-Orange&#34;`, `&#34;Yellow-Orange&#34;`, `&#34;Forest Green&#34;`, `&#34;Turquoise Blue&#34;`, `&#34;Azure Blue&#34;`, `&#34;Cerulean Blue&#34;`, `&#34;Midnight Blue&#34;`, `&#34;Medium Blue&#34;`, `&#34;Cobalt Blue&#34;`, `&#34;Violet Blue&#34;`, `&#34;Blue Violet&#34;`, `&#34;Medium Violet&#34;`, `&#34;Medium Rose&#34;`, `&#34;Lavender&#34;`, `&#34;Orchid&#34;`, `&#34;Thistle&#34;`, `&#34;Peach&#34;`, `&#34;Salmon&#34;`, `&#34;Magenta&#34;`, `&#34;Red Violet&#34;`, `&#34;Mahogany&#34;`, `&#34;Burnt Sienna&#34;`, `&#34;Chestnut&#34;`.
     * 
     */
    private String color;
    /**
     * @return The Comments param. String length must not exceed 1023 characters.
     * 
     */
    private String comments;
    /**
     * @return UUID of the resource.
     * 
     */
    private String id;
    /**
     * @return The Name param. String length must not exceed 127 characters.
     * 
     */
    private String name;

    private GetTagListData() {}
    /**
     * @return The Color param. String must be one of these: `&#34;Red&#34;`, `&#34;Green&#34;`, `&#34;Blue&#34;`, `&#34;Yellow&#34;`, `&#34;Copper&#34;`, `&#34;Orange&#34;`, `&#34;Purple&#34;`, `&#34;Gray&#34;`, `&#34;Light Green&#34;`, `&#34;Cyan&#34;`, `&#34;Light Gray&#34;`, `&#34;Blue Gray&#34;`, `&#34;Lime&#34;`, `&#34;Black&#34;`, `&#34;Gold&#34;`, `&#34;Brown&#34;`, `&#34;Olive&#34;`, `&#34;Maroon&#34;`, `&#34;Red-Orange&#34;`, `&#34;Yellow-Orange&#34;`, `&#34;Forest Green&#34;`, `&#34;Turquoise Blue&#34;`, `&#34;Azure Blue&#34;`, `&#34;Cerulean Blue&#34;`, `&#34;Midnight Blue&#34;`, `&#34;Medium Blue&#34;`, `&#34;Cobalt Blue&#34;`, `&#34;Violet Blue&#34;`, `&#34;Blue Violet&#34;`, `&#34;Medium Violet&#34;`, `&#34;Medium Rose&#34;`, `&#34;Lavender&#34;`, `&#34;Orchid&#34;`, `&#34;Thistle&#34;`, `&#34;Peach&#34;`, `&#34;Salmon&#34;`, `&#34;Magenta&#34;`, `&#34;Red Violet&#34;`, `&#34;Mahogany&#34;`, `&#34;Burnt Sienna&#34;`, `&#34;Chestnut&#34;`.
     * 
     */
    public String color() {
        return this.color;
    }
    /**
     * @return The Comments param. String length must not exceed 1023 characters.
     * 
     */
    public String comments() {
        return this.comments;
    }
    /**
     * @return UUID of the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Name param. String length must not exceed 127 characters.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagListData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String color;
        private String comments;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetTagListData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.color = defaults.color;
    	      this.comments = defaults.comments;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder color(String color) {
            if (color == null) {
              throw new MissingRequiredPropertyException("GetTagListData", "color");
            }
            this.color = color;
            return this;
        }
        @CustomType.Setter
        public Builder comments(String comments) {
            if (comments == null) {
              throw new MissingRequiredPropertyException("GetTagListData", "comments");
            }
            this.comments = comments;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTagListData", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetTagListData", "name");
            }
            this.name = name;
            return this;
        }
        public GetTagListData build() {
            final var _resultValue = new GetTagListData();
            _resultValue.color = color;
            _resultValue.comments = comments;
            _resultValue.id = id;
            _resultValue.name = name;
            return _resultValue;
        }
    }
}
