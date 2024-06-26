// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.scm.outputs.GetHipObjectAntiMalware;
import com.pulumi.scm.outputs.GetHipObjectCertificate;
import com.pulumi.scm.outputs.GetHipObjectCustomChecks;
import com.pulumi.scm.outputs.GetHipObjectDataLossPrevention;
import com.pulumi.scm.outputs.GetHipObjectDiskBackup;
import com.pulumi.scm.outputs.GetHipObjectDiskEncryption;
import com.pulumi.scm.outputs.GetHipObjectFirewall;
import com.pulumi.scm.outputs.GetHipObjectHostInfo;
import com.pulumi.scm.outputs.GetHipObjectMobileDevice;
import com.pulumi.scm.outputs.GetHipObjectNetworkInfo;
import com.pulumi.scm.outputs.GetHipObjectPatchManagement;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHipObjectResult {
    /**
     * @return The AntiMalware param.
     * 
     */
    private GetHipObjectAntiMalware antiMalware;
    /**
     * @return The Certificate param.
     * 
     */
    private GetHipObjectCertificate certificate;
    /**
     * @return The CustomChecks param.
     * 
     */
    private GetHipObjectCustomChecks customChecks;
    /**
     * @return The DataLossPrevention param.
     * 
     */
    private GetHipObjectDataLossPrevention dataLossPrevention;
    /**
     * @return The Description param. String length must not exceed 255 characters.
     * 
     */
    private String description;
    /**
     * @return The DiskBackup param.
     * 
     */
    private GetHipObjectDiskBackup diskBackup;
    /**
     * @return The DiskEncryption param.
     * 
     */
    private GetHipObjectDiskEncryption diskEncryption;
    /**
     * @return The Firewall param.
     * 
     */
    private GetHipObjectFirewall firewall;
    /**
     * @return The HostInfo param.
     * 
     */
    private GetHipObjectHostInfo hostInfo;
    /**
     * @return The Id param.
     * 
     */
    private String id;
    /**
     * @return The MobileDevice param.
     * 
     */
    private GetHipObjectMobileDevice mobileDevice;
    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    private String name;
    /**
     * @return The NetworkInfo param.
     * 
     */
    private GetHipObjectNetworkInfo networkInfo;
    /**
     * @return The PatchManagement param.
     * 
     */
    private GetHipObjectPatchManagement patchManagement;
    private String tfid;

    private GetHipObjectResult() {}
    /**
     * @return The AntiMalware param.
     * 
     */
    public GetHipObjectAntiMalware antiMalware() {
        return this.antiMalware;
    }
    /**
     * @return The Certificate param.
     * 
     */
    public GetHipObjectCertificate certificate() {
        return this.certificate;
    }
    /**
     * @return The CustomChecks param.
     * 
     */
    public GetHipObjectCustomChecks customChecks() {
        return this.customChecks;
    }
    /**
     * @return The DataLossPrevention param.
     * 
     */
    public GetHipObjectDataLossPrevention dataLossPrevention() {
        return this.dataLossPrevention;
    }
    /**
     * @return The Description param. String length must not exceed 255 characters.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The DiskBackup param.
     * 
     */
    public GetHipObjectDiskBackup diskBackup() {
        return this.diskBackup;
    }
    /**
     * @return The DiskEncryption param.
     * 
     */
    public GetHipObjectDiskEncryption diskEncryption() {
        return this.diskEncryption;
    }
    /**
     * @return The Firewall param.
     * 
     */
    public GetHipObjectFirewall firewall() {
        return this.firewall;
    }
    /**
     * @return The HostInfo param.
     * 
     */
    public GetHipObjectHostInfo hostInfo() {
        return this.hostInfo;
    }
    /**
     * @return The Id param.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The MobileDevice param.
     * 
     */
    public GetHipObjectMobileDevice mobileDevice() {
        return this.mobileDevice;
    }
    /**
     * @return Alphanumeric string [ 0-9a-zA-Z._-]. String length must not exceed 31 characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The NetworkInfo param.
     * 
     */
    public GetHipObjectNetworkInfo networkInfo() {
        return this.networkInfo;
    }
    /**
     * @return The PatchManagement param.
     * 
     */
    public GetHipObjectPatchManagement patchManagement() {
        return this.patchManagement;
    }
    public String tfid() {
        return this.tfid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHipObjectResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetHipObjectAntiMalware antiMalware;
        private GetHipObjectCertificate certificate;
        private GetHipObjectCustomChecks customChecks;
        private GetHipObjectDataLossPrevention dataLossPrevention;
        private String description;
        private GetHipObjectDiskBackup diskBackup;
        private GetHipObjectDiskEncryption diskEncryption;
        private GetHipObjectFirewall firewall;
        private GetHipObjectHostInfo hostInfo;
        private String id;
        private GetHipObjectMobileDevice mobileDevice;
        private String name;
        private GetHipObjectNetworkInfo networkInfo;
        private GetHipObjectPatchManagement patchManagement;
        private String tfid;
        public Builder() {}
        public Builder(GetHipObjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.antiMalware = defaults.antiMalware;
    	      this.certificate = defaults.certificate;
    	      this.customChecks = defaults.customChecks;
    	      this.dataLossPrevention = defaults.dataLossPrevention;
    	      this.description = defaults.description;
    	      this.diskBackup = defaults.diskBackup;
    	      this.diskEncryption = defaults.diskEncryption;
    	      this.firewall = defaults.firewall;
    	      this.hostInfo = defaults.hostInfo;
    	      this.id = defaults.id;
    	      this.mobileDevice = defaults.mobileDevice;
    	      this.name = defaults.name;
    	      this.networkInfo = defaults.networkInfo;
    	      this.patchManagement = defaults.patchManagement;
    	      this.tfid = defaults.tfid;
        }

        @CustomType.Setter
        public Builder antiMalware(GetHipObjectAntiMalware antiMalware) {
            if (antiMalware == null) {
              throw new MissingRequiredPropertyException("GetHipObjectResult", "antiMalware");
            }
            this.antiMalware = antiMalware;
            return this;
        }
        @CustomType.Setter
        public Builder certificate(GetHipObjectCertificate certificate) {
            if (certificate == null) {
              throw new MissingRequiredPropertyException("GetHipObjectResult", "certificate");
            }
            this.certificate = certificate;
            return this;
        }
        @CustomType.Setter
        public Builder customChecks(GetHipObjectCustomChecks customChecks) {
            if (customChecks == null) {
              throw new MissingRequiredPropertyException("GetHipObjectResult", "customChecks");
            }
            this.customChecks = customChecks;
            return this;
        }
        @CustomType.Setter
        public Builder dataLossPrevention(GetHipObjectDataLossPrevention dataLossPrevention) {
            if (dataLossPrevention == null) {
              throw new MissingRequiredPropertyException("GetHipObjectResult", "dataLossPrevention");
            }
            this.dataLossPrevention = dataLossPrevention;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetHipObjectResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder diskBackup(GetHipObjectDiskBackup diskBackup) {
            if (diskBackup == null) {
              throw new MissingRequiredPropertyException("GetHipObjectResult", "diskBackup");
            }
            this.diskBackup = diskBackup;
            return this;
        }
        @CustomType.Setter
        public Builder diskEncryption(GetHipObjectDiskEncryption diskEncryption) {
            if (diskEncryption == null) {
              throw new MissingRequiredPropertyException("GetHipObjectResult", "diskEncryption");
            }
            this.diskEncryption = diskEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder firewall(GetHipObjectFirewall firewall) {
            if (firewall == null) {
              throw new MissingRequiredPropertyException("GetHipObjectResult", "firewall");
            }
            this.firewall = firewall;
            return this;
        }
        @CustomType.Setter
        public Builder hostInfo(GetHipObjectHostInfo hostInfo) {
            if (hostInfo == null) {
              throw new MissingRequiredPropertyException("GetHipObjectResult", "hostInfo");
            }
            this.hostInfo = hostInfo;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetHipObjectResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mobileDevice(GetHipObjectMobileDevice mobileDevice) {
            if (mobileDevice == null) {
              throw new MissingRequiredPropertyException("GetHipObjectResult", "mobileDevice");
            }
            this.mobileDevice = mobileDevice;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetHipObjectResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder networkInfo(GetHipObjectNetworkInfo networkInfo) {
            if (networkInfo == null) {
              throw new MissingRequiredPropertyException("GetHipObjectResult", "networkInfo");
            }
            this.networkInfo = networkInfo;
            return this;
        }
        @CustomType.Setter
        public Builder patchManagement(GetHipObjectPatchManagement patchManagement) {
            if (patchManagement == null) {
              throw new MissingRequiredPropertyException("GetHipObjectResult", "patchManagement");
            }
            this.patchManagement = patchManagement;
            return this;
        }
        @CustomType.Setter
        public Builder tfid(String tfid) {
            if (tfid == null) {
              throw new MissingRequiredPropertyException("GetHipObjectResult", "tfid");
            }
            this.tfid = tfid;
            return this;
        }
        public GetHipObjectResult build() {
            final var _resultValue = new GetHipObjectResult();
            _resultValue.antiMalware = antiMalware;
            _resultValue.certificate = certificate;
            _resultValue.customChecks = customChecks;
            _resultValue.dataLossPrevention = dataLossPrevention;
            _resultValue.description = description;
            _resultValue.diskBackup = diskBackup;
            _resultValue.diskEncryption = diskEncryption;
            _resultValue.firewall = firewall;
            _resultValue.hostInfo = hostInfo;
            _resultValue.id = id;
            _resultValue.mobileDevice = mobileDevice;
            _resultValue.name = name;
            _resultValue.networkInfo = networkInfo;
            _resultValue.patchManagement = patchManagement;
            _resultValue.tfid = tfid;
            return _resultValue;
        }
    }
}
