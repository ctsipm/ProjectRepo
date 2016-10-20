package com.buildautomation.services;

import com.buildautomation.domain.LibraryDeployedEGWise;
import com.buildautomation.repositories.LibraryDeployedEGWiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryDeployedEGWiseServiceImpl implements LibraryDeployedEGWiseService {
    private LibraryDeployedEGWiseRepository librarydeployedegwiseRepository;

    @Autowired
    public void setLibraryDeployedEGWiseRepository(LibraryDeployedEGWiseRepository librarydeployedegwiseRepository) {
        this.librarydeployedegwiseRepository = librarydeployedegwiseRepository;
    }

    @Override
    public Iterable<LibraryDeployedEGWise> listAllLibraryDeployedEGWises() {
        return librarydeployedegwiseRepository.findAll();
    }

    @Override
    public LibraryDeployedEGWise getLibraryDeployedEGWiseById(Integer id) {
        return librarydeployedegwiseRepository.findOne(id);
    }

    @Override
    public LibraryDeployedEGWise saveLibraryDeployedEGWise(LibraryDeployedEGWise librarydeployedegwise) {
        return librarydeployedegwiseRepository.save(librarydeployedegwise);
    }

    @Override
    public void deleteLibraryDeployedEGWise(Integer id) {
        librarydeployedegwiseRepository.delete(id);
    }
}
