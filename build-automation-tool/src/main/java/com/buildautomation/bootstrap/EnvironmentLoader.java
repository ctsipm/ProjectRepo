package com.buildautomation.bootstrap;

import com.buildautomation.domain.Environment;
import com.buildautomation.repositories.EnvironmentRepository;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentLoader implements ApplicationListener<ContextRefreshedEvent> {

    private Logger log = Logger.getLogger(EnvironmentLoader.class);

    @Autowired
    public void setEnvironmentRepository(EnvironmentRepository envDetailRepository) {
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Environment shirt = new Environment();
        shirt.setDescription("SANDBOX for testing");
        shirt.setName("SANDBOX");
        
        //envDetailRepository.save(shirt);

        log.info("Saved Shirt - id: " + shirt.getId());

    }
}
