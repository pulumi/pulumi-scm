// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetAntiSpywareSignatureListDataDefaultAction;
import com.pulumi.scm.outputs.GetAntiSpywareSignatureListDataSignature;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAntiSpywareSignatureListData {
    /**
     * @return The Bugtraqs param.
     * 
     */
    private List<String> bugtraqs;
    /**
     * @return The Comment param. String length must not exceed 256 characters.
     * 
     */
    private String comment;
    /**
     * @return The Cves param.
     * 
     */
    private List<String> cves;
    /**
     * @return The DefaultAction param.
     * 
     */
    private GetAntiSpywareSignatureListDataDefaultAction defaultAction;
    /**
     * @return The Direction param. String must be one of these: `&#34;client2server&#34;`, `&#34;server2client&#34;`, `&#34;both&#34;`.
     * 
     */
    private String direction;
    /**
     * @return UUID of the resource.
     * 
     */
    private String id;
    /**
     * @return The References param.
     * 
     */
    private List<String> references;
    /**
     * @return The Severity param. String must be one of these: `&#34;critical&#34;`, `&#34;low&#34;`, `&#34;high&#34;`, `&#34;medium&#34;`, `&#34;informational&#34;`.
     * 
     */
    private String severity;
    /**
     * @return The Signature param.
     * 
     */
    private GetAntiSpywareSignatureListDataSignature signature;
    /**
     * @return threat id range \n\n and \n\n. Value must be between 15000 and 70000000.
     * 
     */
    private Integer threatId;
    /**
     * @return The Threatname param. String length must not exceed 1024 characters.
     * 
     */
    private String threatname;
    /**
     * @return The Vendors param.
     * 
     */
    private List<String> vendors;

    private GetAntiSpywareSignatureListData() {}
    /**
     * @return The Bugtraqs param.
     * 
     */
    public List<String> bugtraqs() {
        return this.bugtraqs;
    }
    /**
     * @return The Comment param. String length must not exceed 256 characters.
     * 
     */
    public String comment() {
        return this.comment;
    }
    /**
     * @return The Cves param.
     * 
     */
    public List<String> cves() {
        return this.cves;
    }
    /**
     * @return The DefaultAction param.
     * 
     */
    public GetAntiSpywareSignatureListDataDefaultAction defaultAction() {
        return this.defaultAction;
    }
    /**
     * @return The Direction param. String must be one of these: `&#34;client2server&#34;`, `&#34;server2client&#34;`, `&#34;both&#34;`.
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return UUID of the resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The References param.
     * 
     */
    public List<String> references() {
        return this.references;
    }
    /**
     * @return The Severity param. String must be one of these: `&#34;critical&#34;`, `&#34;low&#34;`, `&#34;high&#34;`, `&#34;medium&#34;`, `&#34;informational&#34;`.
     * 
     */
    public String severity() {
        return this.severity;
    }
    /**
     * @return The Signature param.
     * 
     */
    public GetAntiSpywareSignatureListDataSignature signature() {
        return this.signature;
    }
    /**
     * @return threat id range \n\n and \n\n. Value must be between 15000 and 70000000.
     * 
     */
    public Integer threatId() {
        return this.threatId;
    }
    /**
     * @return The Threatname param. String length must not exceed 1024 characters.
     * 
     */
    public String threatname() {
        return this.threatname;
    }
    /**
     * @return The Vendors param.
     * 
     */
    public List<String> vendors() {
        return this.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAntiSpywareSignatureListData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> bugtraqs;
        private String comment;
        private List<String> cves;
        private GetAntiSpywareSignatureListDataDefaultAction defaultAction;
        private String direction;
        private String id;
        private List<String> references;
        private String severity;
        private GetAntiSpywareSignatureListDataSignature signature;
        private Integer threatId;
        private String threatname;
        private List<String> vendors;
        public Builder() {}
        public Builder(GetAntiSpywareSignatureListData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bugtraqs = defaults.bugtraqs;
    	      this.comment = defaults.comment;
    	      this.cves = defaults.cves;
    	      this.defaultAction = defaults.defaultAction;
    	      this.direction = defaults.direction;
    	      this.id = defaults.id;
    	      this.references = defaults.references;
    	      this.severity = defaults.severity;
    	      this.signature = defaults.signature;
    	      this.threatId = defaults.threatId;
    	      this.threatname = defaults.threatname;
    	      this.vendors = defaults.vendors;
        }

        @CustomType.Setter
        public Builder bugtraqs(List<String> bugtraqs) {
            if (bugtraqs == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureListData", "bugtraqs");
            }
            this.bugtraqs = bugtraqs;
            return this;
        }
        public Builder bugtraqs(String... bugtraqs) {
            return bugtraqs(List.of(bugtraqs));
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureListData", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder cves(List<String> cves) {
            if (cves == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureListData", "cves");
            }
            this.cves = cves;
            return this;
        }
        public Builder cves(String... cves) {
            return cves(List.of(cves));
        }
        @CustomType.Setter
        public Builder defaultAction(GetAntiSpywareSignatureListDataDefaultAction defaultAction) {
            if (defaultAction == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureListData", "defaultAction");
            }
            this.defaultAction = defaultAction;
            return this;
        }
        @CustomType.Setter
        public Builder direction(String direction) {
            if (direction == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureListData", "direction");
            }
            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureListData", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder references(List<String> references) {
            if (references == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureListData", "references");
            }
            this.references = references;
            return this;
        }
        public Builder references(String... references) {
            return references(List.of(references));
        }
        @CustomType.Setter
        public Builder severity(String severity) {
            if (severity == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureListData", "severity");
            }
            this.severity = severity;
            return this;
        }
        @CustomType.Setter
        public Builder signature(GetAntiSpywareSignatureListDataSignature signature) {
            if (signature == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureListData", "signature");
            }
            this.signature = signature;
            return this;
        }
        @CustomType.Setter
        public Builder threatId(Integer threatId) {
            if (threatId == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureListData", "threatId");
            }
            this.threatId = threatId;
            return this;
        }
        @CustomType.Setter
        public Builder threatname(String threatname) {
            if (threatname == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureListData", "threatname");
            }
            this.threatname = threatname;
            return this;
        }
        @CustomType.Setter
        public Builder vendors(List<String> vendors) {
            if (vendors == null) {
              throw new MissingRequiredPropertyException("GetAntiSpywareSignatureListData", "vendors");
            }
            this.vendors = vendors;
            return this;
        }
        public Builder vendors(String... vendors) {
            return vendors(List.of(vendors));
        }
        public GetAntiSpywareSignatureListData build() {
            final var _resultValue = new GetAntiSpywareSignatureListData();
            _resultValue.bugtraqs = bugtraqs;
            _resultValue.comment = comment;
            _resultValue.cves = cves;
            _resultValue.defaultAction = defaultAction;
            _resultValue.direction = direction;
            _resultValue.id = id;
            _resultValue.references = references;
            _resultValue.severity = severity;
            _resultValue.signature = signature;
            _resultValue.threatId = threatId;
            _resultValue.threatname = threatname;
            _resultValue.vendors = vendors;
            return _resultValue;
        }
    }
}
