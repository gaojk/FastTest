package com.fast.xinyue.service;

import com.fast.xinyue.domain.Request;
import com.fast.xinyue.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

    private RequestRepository requestRepository;

    @Autowired
    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public void addRequest(Request request) {
        requestRepository.save(request);
    }

}
