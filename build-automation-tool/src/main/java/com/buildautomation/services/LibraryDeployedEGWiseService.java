package com.buildautomation.services;


import com.buildautomation.domain.LibraryDeployedEGWise;

public interface LibraryDeployedEGWiseService {
    Iterable<LibraryDeployedEGWise> listAllLibraryDeployedEGWises();

    LibraryDeployedEGWise getLibraryDeployedEGWiseById(Integer id);

    LibraryDeployedEGWise saveLibraryDeployedEGWise(LibraryDeployedEGWise librarydeployedegwise);

    void deleteLibraryDeployedEGWise(Integer id);
}
