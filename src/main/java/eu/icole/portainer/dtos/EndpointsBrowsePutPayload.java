package eu.icole.portainer.dtos;

import eu.icole.portainer.dtos.release.File;

public class EndpointsBrowsePutPayload {
    private String Path;
    private File file;

    public EndpointsBrowsePutPayload(String path, File file) {
        this.Path = path;
        this.file = file;
    }

    public String getPath() {
        return Path;
    }

    public File getFile() {
        return file;
    }
}
