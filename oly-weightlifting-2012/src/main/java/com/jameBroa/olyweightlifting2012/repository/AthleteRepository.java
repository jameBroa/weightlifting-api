package com.jameBroa.olyweightlifting2012.repository;

import com.jameBroa.olyweightlifting2012.Athlete;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AthleteRepository extends MongoRepository<Athlete, ObjectId> {

    Optional<List<Athlete>> findAthleteByCategory(String category);

    Optional<List<Athlete>> findAthleteByRank(Integer rank);

    Optional<List<Athlete>> findAthleteByGroupAndCategory(String group, String category);
}
