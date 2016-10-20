package com.buildautomation.services;


import com.buildautomation.domain.ProjectDeployables;

public interface ProjectDeployablesService {
    Iterable<ProjectDeployables> listAllProjectDeployabless();

    ProjectDeployables getProjectDeployablesById(Integer id);

    ProjectDeployables saveProjectDeployables(ProjectDeployables projectdeployables);

    void deleteProjectDeployables(Integer id);
}
