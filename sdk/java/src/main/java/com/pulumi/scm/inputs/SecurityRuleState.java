// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scm.inputs.SecurityRuleProfileSettingArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityRuleState extends com.pulumi.resources.ResourceArgs {

    public static final SecurityRuleState Empty = new SecurityRuleState();

    /**
     * The action to be taken when the rule is matched. String must be one of these: `&#34;allow&#34;`, `&#34;deny&#34;`, `&#34;drop&#34;`, `&#34;reset-client&#34;`, `&#34;reset-server&#34;`, `&#34;reset-both&#34;`.
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return The action to be taken when the rule is matched. String must be one of these: `&#34;allow&#34;`, `&#34;deny&#34;`, `&#34;drop&#34;`, `&#34;reset-client&#34;`, `&#34;reset-server&#34;`, `&#34;reset-both&#34;`.
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * The application(s) being accessed.
     * 
     */
    @Import(name="applications")
    private @Nullable Output<List<String>> applications;

    /**
     * @return The application(s) being accessed.
     * 
     */
    public Optional<Output<List<String>>> applications() {
        return Optional.ofNullable(this.applications);
    }

    /**
     * The URL categories being accessed.
     * 
     */
    @Import(name="categories")
    private @Nullable Output<List<String>> categories;

    /**
     * @return The URL categories being accessed.
     * 
     */
    public Optional<Output<List<String>>> categories() {
        return Optional.ofNullable(this.categories);
    }

    /**
     * The description of the security rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the security rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The destination Host Integrity Profile(s).
     * 
     */
    @Import(name="destinationHips")
    private @Nullable Output<List<String>> destinationHips;

    /**
     * @return The destination Host Integrity Profile(s).
     * 
     */
    public Optional<Output<List<String>>> destinationHips() {
        return Optional.ofNullable(this.destinationHips);
    }

    /**
     * The destination address(es).
     * 
     */
    @Import(name="destinations")
    private @Nullable Output<List<String>> destinations;

    /**
     * @return The destination address(es).
     * 
     */
    public Optional<Output<List<String>>> destinations() {
        return Optional.ofNullable(this.destinations);
    }

    /**
     * The Device param.
     * 
     */
    @Import(name="device")
    private @Nullable Output<String> device;

    /**
     * @return The Device param.
     * 
     */
    public Optional<Output<String>> device() {
        return Optional.ofNullable(this.device);
    }

    /**
     * The state of the security rule. Default: `false`.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return The state of the security rule. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * The Folder param.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return The Folder param.
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * The source security zone(s).
     * 
     */
    @Import(name="froms")
    private @Nullable Output<List<String>> froms;

    /**
     * @return The source security zone(s).
     * 
     */
    public Optional<Output<List<String>>> froms() {
        return Optional.ofNullable(this.froms);
    }

    /**
     * The external log forwarding profile.
     * 
     */
    @Import(name="logSetting")
    private @Nullable Output<String> logSetting;

    /**
     * @return The external log forwarding profile.
     * 
     */
    public Optional<Output<String>> logSetting() {
        return Optional.ofNullable(this.logSetting);
    }

    /**
     * The name of the security rule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the security rule.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Negate the destination addresses(es). Default: `false`.
     * 
     */
    @Import(name="negateDestination")
    private @Nullable Output<Boolean> negateDestination;

    /**
     * @return Negate the destination addresses(es). Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> negateDestination() {
        return Optional.ofNullable(this.negateDestination);
    }

    /**
     * Negate the source address(es). Default: `false`.
     * 
     */
    @Import(name="negateSource")
    private @Nullable Output<Boolean> negateSource;

    /**
     * @return Negate the source address(es). Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> negateSource() {
        return Optional.ofNullable(this.negateSource);
    }

    /**
     * The Position param. String must be one of these: `&#34;pre&#34;`, `&#34;post&#34;`. Default: `&#34;pre&#34;`.
     * 
     */
    @Import(name="position")
    private @Nullable Output<String> position;

    /**
     * @return The Position param. String must be one of these: `&#34;pre&#34;`, `&#34;post&#34;`. Default: `&#34;pre&#34;`.
     * 
     */
    public Optional<Output<String>> position() {
        return Optional.ofNullable(this.position);
    }

    /**
     * The security profile object.
     * 
     */
    @Import(name="profileSetting")
    private @Nullable Output<SecurityRuleProfileSettingArgs> profileSetting;

    /**
     * @return The security profile object.
     * 
     */
    public Optional<Output<SecurityRuleProfileSettingArgs>> profileSetting() {
        return Optional.ofNullable(this.profileSetting);
    }

    /**
     * The service(s) being accessed.
     * 
     */
    @Import(name="services")
    private @Nullable Output<List<String>> services;

    /**
     * @return The service(s) being accessed.
     * 
     */
    public Optional<Output<List<String>>> services() {
        return Optional.ofNullable(this.services);
    }

    /**
     * The Snippet param.
     * 
     */
    @Import(name="snippet")
    private @Nullable Output<String> snippet;

    /**
     * @return The Snippet param.
     * 
     */
    public Optional<Output<String>> snippet() {
        return Optional.ofNullable(this.snippet);
    }

    /**
     * The source Host Integrity Profile(s).
     * 
     */
    @Import(name="sourceHips")
    private @Nullable Output<List<String>> sourceHips;

    /**
     * @return The source Host Integrity Profile(s).
     * 
     */
    public Optional<Output<List<String>>> sourceHips() {
        return Optional.ofNullable(this.sourceHips);
    }

    /**
     * The source user(s) or group(s).
     * 
     */
    @Import(name="sourceUsers")
    private @Nullable Output<List<String>> sourceUsers;

    /**
     * @return The source user(s) or group(s).
     * 
     */
    public Optional<Output<List<String>>> sourceUsers() {
        return Optional.ofNullable(this.sourceUsers);
    }

    /**
     * The source address(es).
     * 
     */
    @Import(name="sources")
    private @Nullable Output<List<String>> sources;

    /**
     * @return The source address(es).
     * 
     */
    public Optional<Output<List<String>>> sources() {
        return Optional.ofNullable(this.sources);
    }

    /**
     * The tags associated with the security rule.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return The tags associated with the security rule.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tfid")
    private @Nullable Output<String> tfid;

    public Optional<Output<String>> tfid() {
        return Optional.ofNullable(this.tfid);
    }

    /**
     * The destination security zone(s).
     * 
     */
    @Import(name="tos")
    private @Nullable Output<List<String>> tos;

    /**
     * @return The destination security zone(s).
     * 
     */
    public Optional<Output<List<String>>> tos() {
        return Optional.ofNullable(this.tos);
    }

    private SecurityRuleState() {}

    private SecurityRuleState(SecurityRuleState $) {
        this.action = $.action;
        this.applications = $.applications;
        this.categories = $.categories;
        this.description = $.description;
        this.destinationHips = $.destinationHips;
        this.destinations = $.destinations;
        this.device = $.device;
        this.disabled = $.disabled;
        this.folder = $.folder;
        this.froms = $.froms;
        this.logSetting = $.logSetting;
        this.name = $.name;
        this.negateDestination = $.negateDestination;
        this.negateSource = $.negateSource;
        this.position = $.position;
        this.profileSetting = $.profileSetting;
        this.services = $.services;
        this.snippet = $.snippet;
        this.sourceHips = $.sourceHips;
        this.sourceUsers = $.sourceUsers;
        this.sources = $.sources;
        this.tags = $.tags;
        this.tfid = $.tfid;
        this.tos = $.tos;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityRuleState $;

        public Builder() {
            $ = new SecurityRuleState();
        }

        public Builder(SecurityRuleState defaults) {
            $ = new SecurityRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action to be taken when the rule is matched. String must be one of these: `&#34;allow&#34;`, `&#34;deny&#34;`, `&#34;drop&#34;`, `&#34;reset-client&#34;`, `&#34;reset-server&#34;`, `&#34;reset-both&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action to be taken when the rule is matched. String must be one of these: `&#34;allow&#34;`, `&#34;deny&#34;`, `&#34;drop&#34;`, `&#34;reset-client&#34;`, `&#34;reset-server&#34;`, `&#34;reset-both&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param applications The application(s) being accessed.
         * 
         * @return builder
         * 
         */
        public Builder applications(@Nullable Output<List<String>> applications) {
            $.applications = applications;
            return this;
        }

        /**
         * @param applications The application(s) being accessed.
         * 
         * @return builder
         * 
         */
        public Builder applications(List<String> applications) {
            return applications(Output.of(applications));
        }

        /**
         * @param applications The application(s) being accessed.
         * 
         * @return builder
         * 
         */
        public Builder applications(String... applications) {
            return applications(List.of(applications));
        }

        /**
         * @param categories The URL categories being accessed.
         * 
         * @return builder
         * 
         */
        public Builder categories(@Nullable Output<List<String>> categories) {
            $.categories = categories;
            return this;
        }

        /**
         * @param categories The URL categories being accessed.
         * 
         * @return builder
         * 
         */
        public Builder categories(List<String> categories) {
            return categories(Output.of(categories));
        }

        /**
         * @param categories The URL categories being accessed.
         * 
         * @return builder
         * 
         */
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }

        /**
         * @param description The description of the security rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the security rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destinationHips The destination Host Integrity Profile(s).
         * 
         * @return builder
         * 
         */
        public Builder destinationHips(@Nullable Output<List<String>> destinationHips) {
            $.destinationHips = destinationHips;
            return this;
        }

        /**
         * @param destinationHips The destination Host Integrity Profile(s).
         * 
         * @return builder
         * 
         */
        public Builder destinationHips(List<String> destinationHips) {
            return destinationHips(Output.of(destinationHips));
        }

        /**
         * @param destinationHips The destination Host Integrity Profile(s).
         * 
         * @return builder
         * 
         */
        public Builder destinationHips(String... destinationHips) {
            return destinationHips(List.of(destinationHips));
        }

        /**
         * @param destinations The destination address(es).
         * 
         * @return builder
         * 
         */
        public Builder destinations(@Nullable Output<List<String>> destinations) {
            $.destinations = destinations;
            return this;
        }

        /**
         * @param destinations The destination address(es).
         * 
         * @return builder
         * 
         */
        public Builder destinations(List<String> destinations) {
            return destinations(Output.of(destinations));
        }

        /**
         * @param destinations The destination address(es).
         * 
         * @return builder
         * 
         */
        public Builder destinations(String... destinations) {
            return destinations(List.of(destinations));
        }

        /**
         * @param device The Device param.
         * 
         * @return builder
         * 
         */
        public Builder device(@Nullable Output<String> device) {
            $.device = device;
            return this;
        }

        /**
         * @param device The Device param.
         * 
         * @return builder
         * 
         */
        public Builder device(String device) {
            return device(Output.of(device));
        }

        /**
         * @param disabled The state of the security rule. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled The state of the security rule. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param folder The Folder param.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The Folder param.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param froms The source security zone(s).
         * 
         * @return builder
         * 
         */
        public Builder froms(@Nullable Output<List<String>> froms) {
            $.froms = froms;
            return this;
        }

        /**
         * @param froms The source security zone(s).
         * 
         * @return builder
         * 
         */
        public Builder froms(List<String> froms) {
            return froms(Output.of(froms));
        }

        /**
         * @param froms The source security zone(s).
         * 
         * @return builder
         * 
         */
        public Builder froms(String... froms) {
            return froms(List.of(froms));
        }

        /**
         * @param logSetting The external log forwarding profile.
         * 
         * @return builder
         * 
         */
        public Builder logSetting(@Nullable Output<String> logSetting) {
            $.logSetting = logSetting;
            return this;
        }

        /**
         * @param logSetting The external log forwarding profile.
         * 
         * @return builder
         * 
         */
        public Builder logSetting(String logSetting) {
            return logSetting(Output.of(logSetting));
        }

        /**
         * @param name The name of the security rule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the security rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param negateDestination Negate the destination addresses(es). Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder negateDestination(@Nullable Output<Boolean> negateDestination) {
            $.negateDestination = negateDestination;
            return this;
        }

        /**
         * @param negateDestination Negate the destination addresses(es). Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder negateDestination(Boolean negateDestination) {
            return negateDestination(Output.of(negateDestination));
        }

        /**
         * @param negateSource Negate the source address(es). Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder negateSource(@Nullable Output<Boolean> negateSource) {
            $.negateSource = negateSource;
            return this;
        }

        /**
         * @param negateSource Negate the source address(es). Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder negateSource(Boolean negateSource) {
            return negateSource(Output.of(negateSource));
        }

        /**
         * @param position The Position param. String must be one of these: `&#34;pre&#34;`, `&#34;post&#34;`. Default: `&#34;pre&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder position(@Nullable Output<String> position) {
            $.position = position;
            return this;
        }

        /**
         * @param position The Position param. String must be one of these: `&#34;pre&#34;`, `&#34;post&#34;`. Default: `&#34;pre&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder position(String position) {
            return position(Output.of(position));
        }

        /**
         * @param profileSetting The security profile object.
         * 
         * @return builder
         * 
         */
        public Builder profileSetting(@Nullable Output<SecurityRuleProfileSettingArgs> profileSetting) {
            $.profileSetting = profileSetting;
            return this;
        }

        /**
         * @param profileSetting The security profile object.
         * 
         * @return builder
         * 
         */
        public Builder profileSetting(SecurityRuleProfileSettingArgs profileSetting) {
            return profileSetting(Output.of(profileSetting));
        }

        /**
         * @param services The service(s) being accessed.
         * 
         * @return builder
         * 
         */
        public Builder services(@Nullable Output<List<String>> services) {
            $.services = services;
            return this;
        }

        /**
         * @param services The service(s) being accessed.
         * 
         * @return builder
         * 
         */
        public Builder services(List<String> services) {
            return services(Output.of(services));
        }

        /**
         * @param services The service(s) being accessed.
         * 
         * @return builder
         * 
         */
        public Builder services(String... services) {
            return services(List.of(services));
        }

        /**
         * @param snippet The Snippet param.
         * 
         * @return builder
         * 
         */
        public Builder snippet(@Nullable Output<String> snippet) {
            $.snippet = snippet;
            return this;
        }

        /**
         * @param snippet The Snippet param.
         * 
         * @return builder
         * 
         */
        public Builder snippet(String snippet) {
            return snippet(Output.of(snippet));
        }

        /**
         * @param sourceHips The source Host Integrity Profile(s).
         * 
         * @return builder
         * 
         */
        public Builder sourceHips(@Nullable Output<List<String>> sourceHips) {
            $.sourceHips = sourceHips;
            return this;
        }

        /**
         * @param sourceHips The source Host Integrity Profile(s).
         * 
         * @return builder
         * 
         */
        public Builder sourceHips(List<String> sourceHips) {
            return sourceHips(Output.of(sourceHips));
        }

        /**
         * @param sourceHips The source Host Integrity Profile(s).
         * 
         * @return builder
         * 
         */
        public Builder sourceHips(String... sourceHips) {
            return sourceHips(List.of(sourceHips));
        }

        /**
         * @param sourceUsers The source user(s) or group(s).
         * 
         * @return builder
         * 
         */
        public Builder sourceUsers(@Nullable Output<List<String>> sourceUsers) {
            $.sourceUsers = sourceUsers;
            return this;
        }

        /**
         * @param sourceUsers The source user(s) or group(s).
         * 
         * @return builder
         * 
         */
        public Builder sourceUsers(List<String> sourceUsers) {
            return sourceUsers(Output.of(sourceUsers));
        }

        /**
         * @param sourceUsers The source user(s) or group(s).
         * 
         * @return builder
         * 
         */
        public Builder sourceUsers(String... sourceUsers) {
            return sourceUsers(List.of(sourceUsers));
        }

        /**
         * @param sources The source address(es).
         * 
         * @return builder
         * 
         */
        public Builder sources(@Nullable Output<List<String>> sources) {
            $.sources = sources;
            return this;
        }

        /**
         * @param sources The source address(es).
         * 
         * @return builder
         * 
         */
        public Builder sources(List<String> sources) {
            return sources(Output.of(sources));
        }

        /**
         * @param sources The source address(es).
         * 
         * @return builder
         * 
         */
        public Builder sources(String... sources) {
            return sources(List.of(sources));
        }

        /**
         * @param tags The tags associated with the security rule.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags associated with the security rule.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags associated with the security rule.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public Builder tfid(@Nullable Output<String> tfid) {
            $.tfid = tfid;
            return this;
        }

        public Builder tfid(String tfid) {
            return tfid(Output.of(tfid));
        }

        /**
         * @param tos The destination security zone(s).
         * 
         * @return builder
         * 
         */
        public Builder tos(@Nullable Output<List<String>> tos) {
            $.tos = tos;
            return this;
        }

        /**
         * @param tos The destination security zone(s).
         * 
         * @return builder
         * 
         */
        public Builder tos(List<String> tos) {
            return tos(Output.of(tos));
        }

        /**
         * @param tos The destination security zone(s).
         * 
         * @return builder
         * 
         */
        public Builder tos(String... tos) {
            return tos(List.of(tos));
        }

        public SecurityRuleState build() {
            return $;
        }
    }

}
