package com.buildautomation.services;


import com.buildautomation.domain.EGDetail;

public interface EGDetailService {
	
    Iterable<EGDetail> listAllEGDetails();

    EGDetail getEGDetailById(Integer id);

    EGDetail saveEGDetail(EGDetail egdetail);

    void deleteEGDetail(Integer id);
}
