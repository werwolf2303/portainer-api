package eu.icole.portainer.dtos.release;

import eu.icole.portainer.dtos.release.File;
import eu.icole.portainer.dtos.release.Lock;
import eu.icole.portainer.dtos.release.Metadata;

import java.util.List;
import java.util.Map;

public class Chart {

    private List<File> files;
    private Lock lock;
    private Metadata metadata;
    private List<Integer> schema;
    private List<File> templates;
    private Map<String, Object> values;

    public Chart() {
    }

    public Chart(List<File> files, Lock lock, Metadata metadata, List<Integer> schema, List<File> templates, Map<String, Object> values) {
        this.files = files;
        this.lock = lock;
        this.metadata = metadata;
        this.schema = schema;
        this.templates = templates;
        this.values = values;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public List<Integer> getSchema() {
        return schema;
    }

    public void setSchema(List<Integer> schema) {
        this.schema = schema;
    }

    public List<File> getTemplates() {
        return templates;
    }

    public void setTemplates(List<File> templates) {
        this.templates = templates;
    }

    public Map<String, Object> getValues() {
        return values;
    }

    public void setValues(Map<String, Object> values) {
        this.values = values;
    }

}