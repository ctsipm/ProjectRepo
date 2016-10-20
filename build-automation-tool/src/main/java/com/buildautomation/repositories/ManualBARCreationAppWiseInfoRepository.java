package com.buildautomation.repositories;


import com.buildautomation.domain.ManualBARCreationAppWiseInfo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface ManualBARCreationAppWiseInfoRepository extends CrudRepository<ManualBARCreationAppWiseInfo, Integer>, Repository<ManualBARCreationAppWiseInfo, Integer>{
	
}
