// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetSnippetListData;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSnippetListResult {
    /**
     * @return The Data param.
     * 
     */
    private List<GetSnippetListData> datas;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Limit param. A limit of -1 will return all configured items. Default: `200`.
     * 
     */
    private Integer limit;
    /**
     * @return The Name param.
     * 
     */
    private @Nullable String name;
    /**
     * @return The Offset param. Default: `0`.
     * 
     */
    private Integer offset;
    private String tfid;
    /**
     * @return The Total param.
     * 
     */
    private Integer total;

    private GetSnippetListResult() {}
    /**
     * @return The Data param.
     * 
     */
    public List<GetSnippetListData> datas() {
        return this.datas;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Limit param. A limit of -1 will return all configured items. Default: `200`.
     * 
     */
    public Integer limit() {
        return this.limit;
    }
    /**
     * @return The Name param.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The Offset param. Default: `0`.
     * 
     */
    public Integer offset() {
        return this.offset;
    }
    public String tfid() {
        return this.tfid;
    }
    /**
     * @return The Total param.
     * 
     */
    public Integer total() {
        return this.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnippetListResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetSnippetListData> datas;
        private String id;
        private Integer limit;
        private @Nullable String name;
        private Integer offset;
        private String tfid;
        private Integer total;
        public Builder() {}
        public Builder(GetSnippetListResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datas = defaults.datas;
    	      this.id = defaults.id;
    	      this.limit = defaults.limit;
    	      this.name = defaults.name;
    	      this.offset = defaults.offset;
    	      this.tfid = defaults.tfid;
    	      this.total = defaults.total;
        }

        @CustomType.Setter
        public Builder datas(List<GetSnippetListData> datas) {
            if (datas == null) {
              throw new MissingRequiredPropertyException("GetSnippetListResult", "datas");
            }
            this.datas = datas;
            return this;
        }
        public Builder datas(GetSnippetListData... datas) {
            return datas(List.of(datas));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSnippetListResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder limit(Integer limit) {
            if (limit == null) {
              throw new MissingRequiredPropertyException("GetSnippetListResult", "limit");
            }
            this.limit = limit;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder offset(Integer offset) {
            if (offset == null) {
              throw new MissingRequiredPropertyException("GetSnippetListResult", "offset");
            }
            this.offset = offset;
            return this;
        }
        @CustomType.Setter
        public Builder tfid(String tfid) {
            if (tfid == null) {
              throw new MissingRequiredPropertyException("GetSnippetListResult", "tfid");
            }
            this.tfid = tfid;
            return this;
        }
        @CustomType.Setter
        public Builder total(Integer total) {
            if (total == null) {
              throw new MissingRequiredPropertyException("GetSnippetListResult", "total");
            }
            this.total = total;
            return this;
        }
        public GetSnippetListResult build() {
            final var _resultValue = new GetSnippetListResult();
            _resultValue.datas = datas;
            _resultValue.id = id;
            _resultValue.limit = limit;
            _resultValue.name = name;
            _resultValue.offset = offset;
            _resultValue.tfid = tfid;
            _resultValue.total = total;
            return _resultValue;
        }
    }
}