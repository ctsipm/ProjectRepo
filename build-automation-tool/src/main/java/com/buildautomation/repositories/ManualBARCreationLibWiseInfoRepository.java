package com.buildautomation.repositories;


import com.buildautomation.domain.ManualBARCreationLibWiseInfo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface ManualBARCreationLibWiseInfoRepository extends CrudRepository<ManualBARCreationLibWiseInfo, Integer>, Repository<ManualBARCreationLibWiseInfo, Integer>{
}
