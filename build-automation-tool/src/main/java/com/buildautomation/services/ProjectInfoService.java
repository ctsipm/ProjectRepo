package com.buildautomation.services;


import com.buildautomation.domain.ProjectInfo;

public interface ProjectInfoService {
    Iterable<ProjectInfo> listAllProjectInfos();

    ProjectInfo getProjectInfoById(Integer id);

    ProjectInfo saveProjectInfo(ProjectInfo projectinfo);

    void deleteProjectInfo(Integer id);
}
