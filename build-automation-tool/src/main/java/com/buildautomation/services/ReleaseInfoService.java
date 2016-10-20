package com.buildautomation.services;


import com.buildautomation.domain.ReleaseInfo;

public interface ReleaseInfoService {
    Iterable<ReleaseInfo> listAllReleaseInfos();

    ReleaseInfo getReleaseInfoById(Integer id);

    ReleaseInfo saveReleaseInfo(ReleaseInfo releaseinfo);

    void deleteReleaseInfo(Integer id);
}
