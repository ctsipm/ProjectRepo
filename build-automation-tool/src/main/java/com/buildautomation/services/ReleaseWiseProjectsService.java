package com.buildautomation.services;


import com.buildautomation.domain.ReleaseWiseProjects;

public interface ReleaseWiseProjectsService {
    Iterable<ReleaseWiseProjects> listAllReleaseWiseProjectss();

    ReleaseWiseProjects getReleaseWiseProjectsById(Integer id);

    ReleaseWiseProjects saveReleaseWiseProjects(ReleaseWiseProjects releasewiseprojects);

    void deleteReleaseWiseProjects(Integer id);
}
