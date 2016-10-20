package com.buildautomation.services;


import com.buildautomation.domain.Queuemanager;

public interface QueuemanagerService {
    Iterable<Queuemanager> listAllQueuemanagers();

    Queuemanager getQueuemanagerById(Integer id);

    Queuemanager saveQueuemanager(Queuemanager product);

    void deleteQueuemanager(Integer id);
}
