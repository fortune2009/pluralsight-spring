package com.example.pluralsighttdge.fundamentals.service;

import com.example.pluralsighttdge.fundamentals.entity.Application;

import java.util.List;

public interface ApplicationService {
    List<Application> listApplications();
    Application findApplication(long id);
}
