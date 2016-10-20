package com.buildautomation.services;


import com.buildautomation.domain.MessageLibraryWithRepo;

public interface MessageLibraryWithRepoService {
    Iterable<MessageLibraryWithRepo> listAllMessageLibraryWithRepos();

    MessageLibraryWithRepo getMessageLibraryWithRepoById(Integer id);

    MessageLibraryWithRepo saveMessageLibraryWithRepo(MessageLibraryWithRepo messagelibrarywithrepo);

    void deleteMessageLibraryWithRepo(Integer id);
}
