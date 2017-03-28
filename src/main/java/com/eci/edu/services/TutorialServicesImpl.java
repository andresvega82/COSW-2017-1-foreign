package com.eci.edu.services;

import com.eci.edu.entities.Tutorial;
import com.eci.edu.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tata on 23/03/17.
 */

@Service
public class TutorialServicesImpl implements InterfaceTutorials{

    @Autowired
    TutorialRepository service;

    @Override
    public void updateTutorial(Tutorial t) {

    }

    @Override
    public List<Tutorial> getTutorials() {

        return service.findAll();
    }

    @Override
    public void addTutorial(Tutorial t) {
        service.save(t);
    }

    @Override
    public List<Tutorial> getTutorialByUserId(Integer id) {
        return null;//service.findTutorialByUserId();
    }

    @Override
    public List<Tutorial> getTutorialsByParams(String params) {
        return service.getTutorialByParams(params);
    }
}
