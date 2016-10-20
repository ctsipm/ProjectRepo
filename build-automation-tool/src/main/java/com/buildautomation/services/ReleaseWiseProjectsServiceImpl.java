package com.buildautomation.services;

import com.buildautomation.domain.ReleaseWiseProjects;
import com.buildautomation.repositories.ReleaseWiseProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReleaseWiseProjectsServiceImpl implements ReleaseWiseProjectsService {
    private ReleaseWiseProjectsRepository releasewiseprojectsRepository;

    @Autowired
    public void setReleaseWiseProjectsRepository(ReleaseWiseProjectsRepository releasewiseprojectsRepository) {
        this.releasewiseprojectsRepository = releasewiseprojectsRepository;
    }

    @Override
    public Iterable<ReleaseWiseProjects> listAllReleaseWiseProjectss() {
        return releasewiseprojectsRepository.findAll();
    }

    @Override
    public ReleaseWiseProjects getReleaseWiseProjectsById(Integer id) {
        return releasewiseprojectsRepository.findOne(id);
    }

    @Override
    public ReleaseWiseProjects saveReleaseWiseProjects(ReleaseWiseProjects releasewiseprojects) {
        return releasewiseprojectsRepository.save(releasewiseprojects);
    }

    @Override
    public void deleteReleaseWiseProjects(Integer id) {
        releasewiseprojectsRepository.delete(id);
    }
}
