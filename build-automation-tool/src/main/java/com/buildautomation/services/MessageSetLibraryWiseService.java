package com.buildautomation.services;


import com.buildautomation.domain.MessageSetLibraryWise;

public interface MessageSetLibraryWiseService {
	
    Iterable<MessageSetLibraryWise> listAllMessageSetLibraryWises();

    MessageSetLibraryWise getMessageSetLibraryWiseById(Integer id);

    MessageSetLibraryWise saveMessageSetLibraryWise(MessageSetLibraryWise messagesetlibrarywise);

    void deleteMessageSetLibraryWise(Integer id);
}
