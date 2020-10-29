package com.example.pluralsighttdge.fundamentals.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.pluralsighttdge.fundamentals.entity.Application;
import com.example.pluralsighttdge.fundamentals.repository.ApplicationRepository;

public class Query implements GraphQLQueryResolver {
    private ApplicationRepository applicationRepository;

    public Query(ApplicationRepository applicationRepository){
        this.applicationRepository = applicationRepository;
    }
    public Iterable<Application> findAllApplications() {
        return applicationRepository.findAll();
    }
    public long countApplications() {
        return applicationRepository.count();
    }
}
