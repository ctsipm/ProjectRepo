package com.buildautomation.services;

import com.buildautomation.domain.Environment;
import com.buildautomation.repositories.EnvironmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnvironmentServiceImpl implements EnvironmentService {
    private EnvironmentRepository EnvironmentRepository;

    @Autowired
    public void setEnvironmentRepository(EnvironmentRepository EnvironmentRepository) {
        this.EnvironmentRepository = EnvironmentRepository;
    }

    @Override
    public Iterable<Environment> listAllEnvironment() {
        return EnvironmentRepository.findAll();
    }

    @Override
    public Environment getEnvironment(Integer id) {
        return EnvironmentRepository.findOne(id);
    }

    @Override
    public Environment saveEnvironment(Environment Environment) {
        return EnvironmentRepository.save(Environment);
    }

    @Override
    public void deleteEnvironment(Integer id) {
        EnvironmentRepository.delete(id);
    }
}
