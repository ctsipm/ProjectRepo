package com.buildautomation.repositories;


import com.buildautomation.domain.BuildManually;
import com.buildautomation.domain.ProjectInfo;

import org.springframework.data.repository.CrudRepository;

public interface BuildManuallyRepository extends CrudRepository<BuildManually, Integer>{
}
