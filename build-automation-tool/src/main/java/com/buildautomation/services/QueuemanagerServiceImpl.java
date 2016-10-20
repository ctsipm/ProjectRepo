package com.buildautomation.services;

import java.util.List;
import java.util.Set;

import com.buildautomation.domain.Queuemanager;
import com.buildautomation.repositories.QueuemanagerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueuemanagerServiceImpl implements QueuemanagerService {
    private QueuemanagerRepository queuemanagerdetailRepository;

    @Autowired
    public void setQueuemanagerRepository(QueuemanagerRepository queuemanagerdetailRepository) {
        this.queuemanagerdetailRepository = queuemanagerdetailRepository;
    }

    @Override
    public Iterable<Queuemanager> listAllQueuemanagers() {
    	
    	return queuemanagerdetailRepository.findAll();
    }

    @Override
    public Queuemanager getQueuemanagerById(Integer id) {
        return queuemanagerdetailRepository.findOne(id);
    }

    @Override
    public Queuemanager saveQueuemanager(Queuemanager queuemanagerdetail) {
        return queuemanagerdetailRepository.save(queuemanagerdetail);
    }

    @Override
    public void deleteQueuemanager(Integer id) {
        queuemanagerdetailRepository.delete(id);
    }
}
