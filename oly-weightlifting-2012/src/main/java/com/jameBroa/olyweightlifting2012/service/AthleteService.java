package com.jameBroa.olyweightlifting2012.service;

import com.jameBroa.olyweightlifting2012.Athlete;
import com.jameBroa.olyweightlifting2012.repository.AthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AthleteService {
    @Autowired
    private AthleteRepository athleteRepository;

    public List<Athlete> allAthletes(){
        return athleteRepository.findAll();
    }

    public Optional<List<Athlete>> getAthleteByCategory(String category){
        return athleteRepository.findAthleteByCategory(category);
    }
    public Optional<List<Athlete>> getAthleteByRank(Integer rank){
        return athleteRepository.findAthleteByRank(rank);
    }

    public Optional<List<Athlete>> getAthleteByGroupAndCategory(String group, String category){
        return athleteRepository.findAthleteByGroupAndCategory(group, category);
    }


}
