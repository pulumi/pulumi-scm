// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetTrafficSteeringRuleListData;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTrafficSteeringRuleListResult {
    /**
     * @return The Data param.
     * 
     */
    private List<GetTrafficSteeringRuleListData> datas;
    /**
     * @return The Folder param. String can either be a specific string(`&#34;Service Connections&#34;`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `&#34;Service Connections&#34;`.
     * 
     */
    private String folder;
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

    private GetTrafficSteeringRuleListResult() {}
    /**
     * @return The Data param.
     * 
     */
    public List<GetTrafficSteeringRuleListData> datas() {
        return this.datas;
    }
    /**
     * @return The Folder param. String can either be a specific string(`&#34;Service Connections&#34;`) or match this regex: `^[0-9a-zA-Z._\s-]{1,}$`. Default: `&#34;Service Connections&#34;`.
     * 
     */
    public String folder() {
        return this.folder;
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

    public static Builder builder(GetTrafficSteeringRuleListResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetTrafficSteeringRuleListData> datas;
        private String folder;
        private String id;
        private Integer limit;
        private @Nullable String name;
        private Integer offset;
        private String tfid;
        private Integer total;
        public Builder() {}
        public Builder(GetTrafficSteeringRuleListResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datas = defaults.datas;
    	      this.folder = defaults.folder;
    	      this.id = defaults.id;
    	      this.limit = defaults.limit;
    	      this.name = defaults.name;
    	      this.offset = defaults.offset;
    	      this.tfid = defaults.tfid;
    	      this.total = defaults.total;
        }

        @CustomType.Setter
        public Builder datas(List<GetTrafficSteeringRuleListData> datas) {
            if (datas == null) {
              throw new MissingRequiredPropertyException("GetTrafficSteeringRuleListResult", "datas");
            }
            this.datas = datas;
            return this;
        }
        public Builder datas(GetTrafficSteeringRuleListData... datas) {
            return datas(List.of(datas));
        }
        @CustomType.Setter
        public Builder folder(String folder) {
            if (folder == null) {
              throw new MissingRequiredPropertyException("GetTrafficSteeringRuleListResult", "folder");
            }
            this.folder = folder;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTrafficSteeringRuleListResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder limit(Integer limit) {
            if (limit == null) {
              throw new MissingRequiredPropertyException("GetTrafficSteeringRuleListResult", "limit");
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
              throw new MissingRequiredPropertyException("GetTrafficSteeringRuleListResult", "offset");
            }
            this.offset = offset;
            return this;
        }
        @CustomType.Setter
        public Builder tfid(String tfid) {
            if (tfid == null) {
              throw new MissingRequiredPropertyException("GetTrafficSteeringRuleListResult", "tfid");
            }
            this.tfid = tfid;
            return this;
        }
        @CustomType.Setter
        public Builder total(Integer total) {
            if (total == null) {
              throw new MissingRequiredPropertyException("GetTrafficSteeringRuleListResult", "total");
            }
            this.total = total;
            return this;
        }
        public GetTrafficSteeringRuleListResult build() {
            final var _resultValue = new GetTrafficSteeringRuleListResult();
            _resultValue.datas = datas;
            _resultValue.folder = folder;
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
