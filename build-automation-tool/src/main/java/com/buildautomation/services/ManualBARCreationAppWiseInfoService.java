package com.buildautomation.services;


import com.buildautomation.domain.ManualBARCreationAppWiseInfo;

public interface ManualBARCreationAppWiseInfoService {
    Iterable<ManualBARCreationAppWiseInfo> listAllManualBARCreationAppWiseInfos();

    ManualBARCreationAppWiseInfo getManualBARCreationAppWiseInfoById(Integer id);

    ManualBARCreationAppWiseInfo saveManualBARCreationAppWiseInfo(ManualBARCreationAppWiseInfo manualbarcreationappwiseinfo);

    void deleteManualBARCreationAppWiseInfo(Integer id);
}
