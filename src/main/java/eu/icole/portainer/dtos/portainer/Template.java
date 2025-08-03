package eu.icole.portainer.dtos.portainer;

import eu.icole.portainer.dtos.portainer.Pair;
import eu.icole.portainer.dtos.portainer.TemplateEnv;
import eu.icole.portainer.dtos.portainer.TemplateRepository;
import eu.icole.portainer.dtos.portainer.TemplateVolume;

import java.util.List;

public class Template {

    private Boolean administrator_only;
    private List<String> categories;
    private String command;
    private String description;
    private List<TemplateEnv> env;
    private String hostname;
    private Integer id;
    private String image;
    private Boolean interactive;
    private List<Pair> labels;
    private String logo;
    private String name;
    private String network;
    private String note;
    private String platform;
    private List<String> ports;
    private Boolean privileged;
    private String registry;
    private TemplateRepository repository;
    private String restart_policy;
    private String stackFile;
    private String title;
    private Integer type;
    private List<TemplateVolume> volumes;

    public Template() {
    }

    public Template(Boolean administrator_only, List<String> categories, String command, String description, List<TemplateEnv> env, String hostname, Integer id, String image, Boolean interactive, List<Pair> labels, String logo, String name, String network, String note, String platform, List<String> ports, Boolean privileged, String registry, TemplateRepository repository, String restart_policy, String stackFile, String title, Integer type, List<TemplateVolume> volumes) {
        this.administrator_only = administrator_only;
        this.categories = categories;
        this.command = command;
        this.description = description;
        this.env = env;
        this.hostname = hostname;
        this.id = id;
        this.image = image;
        this.interactive = interactive;
        this.labels = labels;
        this.logo = logo;
        this.name = name;
        this.network = network;
        this.note = note;
        this.platform = platform;
        this.ports = ports;
        this.privileged = privileged;
        this.registry = registry;
        this.repository = repository;
        this.restart_policy = restart_policy;
        this.stackFile = stackFile;
        this.title = title;
        this.type = type;
        this.volumes = volumes;
    }

    public Boolean getAdministrator_only() {
        return administrator_only;
    }

    public void setAdministrator_only(Boolean administrator_only) {
        this.administrator_only = administrator_only;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TemplateEnv> getEnv() {
        return env;
    }

    public void setEnv(List<TemplateEnv> env) {
        this.env = env;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getInteractive() {
        return interactive;
    }

    public void setInteractive(Boolean interactive) {
        this.interactive = interactive;
    }

    public List<Pair> getLabels() {
        return labels;
    }

    public void setLabels(List<Pair> labels) {
        this.labels = labels;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public List<String> getPorts() {
        return ports;
    }

    public void setPorts(List<String> ports) {
        this.ports = ports;
    }

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public TemplateRepository getRepository() {
        return repository;
    }

    public void setRepository(TemplateRepository repository) {
        this.repository = repository;
    }

    public String getRestart_policy() {
        return restart_policy;
    }

    public void setRestart_policy(String restart_policy) {
        this.restart_policy = restart_policy;
    }

    public String getStackFile() {
        return stackFile;
    }

    public void setStackFile(String stackFile) {
        this.stackFile = stackFile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<TemplateVolume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<TemplateVolume> volumes) {
        this.volumes = volumes;
    }

}