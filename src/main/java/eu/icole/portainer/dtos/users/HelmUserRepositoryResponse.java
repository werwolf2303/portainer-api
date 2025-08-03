package eu.icole.portainer.dtos.users;

import eu.icole.portainer.dtos.portainer.HelmUserRepository;

import java.util.List;

public class HelmUserRepositoryResponse {

    private String GlobalRepository;
    private List<HelmUserRepository> UserRepositories;

    public HelmUserRepositoryResponse() {
    }

    public HelmUserRepositoryResponse(String GlobalRepository, List<HelmUserRepository> UserRepositories) {
        this.GlobalRepository = GlobalRepository;
        this.UserRepositories = UserRepositories;
    }

    public String getGlobalRepository() {
        return GlobalRepository;
    }

    public void setGlobalRepository(String GlobalRepository) {
        this.GlobalRepository = GlobalRepository;
    }

    public List<HelmUserRepository> getUserRepositories() {
        return UserRepositories;
    }

    public void setUserRepositories(List<HelmUserRepository> UserRepositories) {
        this.UserRepositories = UserRepositories;
    }

}