// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobsResult {
    /**
     * @return A description provided by the administrator or service account.
     * 
     */
    private String description;
    /**
     * @return The name of the device.
     * 
     */
    private String deviceName;
    /**
     * @return The timestamp indicating when the job was finished.
     * 
     */
    private String endTs;
    /**
     * @return The Id param.
     * 
     */
    private Integer id;
    /**
     * @return The job result.
     * 
     */
    private Integer jobResult;
    /**
     * @return The current status of the job.
     * 
     */
    private Integer jobStatus;
    /**
     * @return The job type.
     * 
     */
    private Integer jobType;
    /**
     * @return The parent job ID.
     * 
     */
    private Integer parentId;
    /**
     * @return Job completion percentage. Value must be less than or equal to 100.
     * 
     */
    private Integer percent;
    /**
     * @return The result of the job. String must be one of these: `&#34;OK&#34;`, `&#34;FAIL&#34;`, `&#34;PEND&#34;`, `&#34;WAIT&#34;`, `&#34;CANCELLED&#34;`.
     * 
     */
    private String resultStr;
    /**
     * @return The timestamp indicating when the job was created.
     * 
     */
    private String startTs;
    /**
     * @return The current status of the job. String must be one of these: `&#34;ACT&#34;`, `&#34;FIN&#34;`, `&#34;PEND&#34;`, `&#34;PUSHSENT&#34;`, `&#34;PUSHFAIL&#34;`.
     * 
     */
    private String statusStr;
    /**
     * @return The completion summary of the job.
     * 
     */
    private String summary;
    private String tfid;
    /**
     * @return The job type. String must be one of these: `&#34;CommitAll&#34;`, `&#34;CommitAndPush&#34;`, `&#34;NGFW-Bootstrap-Push&#34;`, `&#34;Validate&#34;`.
     * 
     */
    private String typeStr;
    /**
     * @return The administrator or service account that created the job.
     * 
     */
    private String uname;

    private GetJobsResult() {}
    /**
     * @return A description provided by the administrator or service account.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The name of the device.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return The timestamp indicating when the job was finished.
     * 
     */
    public String endTs() {
        return this.endTs;
    }
    /**
     * @return The Id param.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return The job result.
     * 
     */
    public Integer jobResult() {
        return this.jobResult;
    }
    /**
     * @return The current status of the job.
     * 
     */
    public Integer jobStatus() {
        return this.jobStatus;
    }
    /**
     * @return The job type.
     * 
     */
    public Integer jobType() {
        return this.jobType;
    }
    /**
     * @return The parent job ID.
     * 
     */
    public Integer parentId() {
        return this.parentId;
    }
    /**
     * @return Job completion percentage. Value must be less than or equal to 100.
     * 
     */
    public Integer percent() {
        return this.percent;
    }
    /**
     * @return The result of the job. String must be one of these: `&#34;OK&#34;`, `&#34;FAIL&#34;`, `&#34;PEND&#34;`, `&#34;WAIT&#34;`, `&#34;CANCELLED&#34;`.
     * 
     */
    public String resultStr() {
        return this.resultStr;
    }
    /**
     * @return The timestamp indicating when the job was created.
     * 
     */
    public String startTs() {
        return this.startTs;
    }
    /**
     * @return The current status of the job. String must be one of these: `&#34;ACT&#34;`, `&#34;FIN&#34;`, `&#34;PEND&#34;`, `&#34;PUSHSENT&#34;`, `&#34;PUSHFAIL&#34;`.
     * 
     */
    public String statusStr() {
        return this.statusStr;
    }
    /**
     * @return The completion summary of the job.
     * 
     */
    public String summary() {
        return this.summary;
    }
    public String tfid() {
        return this.tfid;
    }
    /**
     * @return The job type. String must be one of these: `&#34;CommitAll&#34;`, `&#34;CommitAndPush&#34;`, `&#34;NGFW-Bootstrap-Push&#34;`, `&#34;Validate&#34;`.
     * 
     */
    public String typeStr() {
        return this.typeStr;
    }
    /**
     * @return The administrator or service account that created the job.
     * 
     */
    public String uname() {
        return this.uname;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String deviceName;
        private String endTs;
        private Integer id;
        private Integer jobResult;
        private Integer jobStatus;
        private Integer jobType;
        private Integer parentId;
        private Integer percent;
        private String resultStr;
        private String startTs;
        private String statusStr;
        private String summary;
        private String tfid;
        private String typeStr;
        private String uname;
        public Builder() {}
        public Builder(GetJobsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.deviceName = defaults.deviceName;
    	      this.endTs = defaults.endTs;
    	      this.id = defaults.id;
    	      this.jobResult = defaults.jobResult;
    	      this.jobStatus = defaults.jobStatus;
    	      this.jobType = defaults.jobType;
    	      this.parentId = defaults.parentId;
    	      this.percent = defaults.percent;
    	      this.resultStr = defaults.resultStr;
    	      this.startTs = defaults.startTs;
    	      this.statusStr = defaults.statusStr;
    	      this.summary = defaults.summary;
    	      this.tfid = defaults.tfid;
    	      this.typeStr = defaults.typeStr;
    	      this.uname = defaults.uname;
        }

        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetJobsResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder deviceName(String deviceName) {
            if (deviceName == null) {
              throw new MissingRequiredPropertyException("GetJobsResult", "deviceName");
            }
            this.deviceName = deviceName;
            return this;
        }
        @CustomType.Setter
        public Builder endTs(String endTs) {
            if (endTs == null) {
              throw new MissingRequiredPropertyException("GetJobsResult", "endTs");
            }
            this.endTs = endTs;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetJobsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder jobResult(Integer jobResult) {
            if (jobResult == null) {
              throw new MissingRequiredPropertyException("GetJobsResult", "jobResult");
            }
            this.jobResult = jobResult;
            return this;
        }
        @CustomType.Setter
        public Builder jobStatus(Integer jobStatus) {
            if (jobStatus == null) {
              throw new MissingRequiredPropertyException("GetJobsResult", "jobStatus");
            }
            this.jobStatus = jobStatus;
            return this;
        }
        @CustomType.Setter
        public Builder jobType(Integer jobType) {
            if (jobType == null) {
              throw new MissingRequiredPropertyException("GetJobsResult", "jobType");
            }
            this.jobType = jobType;
            return this;
        }
        @CustomType.Setter
        public Builder parentId(Integer parentId) {
            if (parentId == null) {
              throw new MissingRequiredPropertyException("GetJobsResult", "parentId");
            }
            this.parentId = parentId;
            return this;
        }
        @CustomType.Setter
        public Builder percent(Integer percent) {
            if (percent == null) {
              throw new MissingRequiredPropertyException("GetJobsResult", "percent");
            }
            this.percent = percent;
            return this;
        }
        @CustomType.Setter
        public Builder resultStr(String resultStr) {
            if (resultStr == null) {
              throw new MissingRequiredPropertyException("GetJobsResult", "resultStr");
            }
            this.resultStr = resultStr;
            return this;
        }
        @CustomType.Setter
        public Builder startTs(String startTs) {
            if (startTs == null) {
              throw new MissingRequiredPropertyException("GetJobsResult", "startTs");
            }
            this.startTs = startTs;
            return this;
        }
        @CustomType.Setter
        public Builder statusStr(String statusStr) {
            if (statusStr == null) {
              throw new MissingRequiredPropertyException("GetJobsResult", "statusStr");
            }
            this.statusStr = statusStr;
            return this;
        }
        @CustomType.Setter
        public Builder summary(String summary) {
            if (summary == null) {
              throw new MissingRequiredPropertyException("GetJobsResult", "summary");
            }
            this.summary = summary;
            return this;
        }
        @CustomType.Setter
        public Builder tfid(String tfid) {
            if (tfid == null) {
              throw new MissingRequiredPropertyException("GetJobsResult", "tfid");
            }
            this.tfid = tfid;
            return this;
        }
        @CustomType.Setter
        public Builder typeStr(String typeStr) {
            if (typeStr == null) {
              throw new MissingRequiredPropertyException("GetJobsResult", "typeStr");
            }
            this.typeStr = typeStr;
            return this;
        }
        @CustomType.Setter
        public Builder uname(String uname) {
            if (uname == null) {
              throw new MissingRequiredPropertyException("GetJobsResult", "uname");
            }
            this.uname = uname;
            return this;
        }
        public GetJobsResult build() {
            final var _resultValue = new GetJobsResult();
            _resultValue.description = description;
            _resultValue.deviceName = deviceName;
            _resultValue.endTs = endTs;
            _resultValue.id = id;
            _resultValue.jobResult = jobResult;
            _resultValue.jobStatus = jobStatus;
            _resultValue.jobType = jobType;
            _resultValue.parentId = parentId;
            _resultValue.percent = percent;
            _resultValue.resultStr = resultStr;
            _resultValue.startTs = startTs;
            _resultValue.statusStr = statusStr;
            _resultValue.summary = summary;
            _resultValue.tfid = tfid;
            _resultValue.typeStr = typeStr;
            _resultValue.uname = uname;
            return _resultValue;
        }
    }
}
