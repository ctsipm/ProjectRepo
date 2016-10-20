package com.buildautomation.services;


import com.buildautomation.domain.Broker;

public interface BrokerService {
    Iterable<Broker> listAllBrokers();

    Broker getBrokerById(Integer id);

    Broker saveBroker(Broker broker);

    void deleteBroker(Integer id);
}
