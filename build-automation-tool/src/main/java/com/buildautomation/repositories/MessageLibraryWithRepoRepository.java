package com.buildautomation.repositories;

import com.buildautomation.domain.MessageLibraryWithRepo;

import org.springframework.data.repository.CrudRepository;

public interface MessageLibraryWithRepoRepository extends CrudRepository<MessageLibraryWithRepo, Integer>{
}
