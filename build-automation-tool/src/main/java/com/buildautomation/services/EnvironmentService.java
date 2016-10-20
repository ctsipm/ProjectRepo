package com.buildautomation.services;


import com.buildautomation.domain.Environment;

public interface EnvironmentService {
    Iterable<Environment> listAllEnvironment();

    Environment getEnvironment(Integer id);

    Environment saveEnvironment(Environment envDetails);

    void deleteEnvironment(Integer id);
}
