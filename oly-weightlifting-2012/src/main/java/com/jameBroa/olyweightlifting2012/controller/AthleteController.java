package com.jameBroa.olyweightlifting2012.controller;

import com.jameBroa.olyweightlifting2012.Athlete;
import com.jameBroa.olyweightlifting2012.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/athletes")
@CrossOrigin(origins="*")
public class AthleteController {
    @Autowired
    private AthleteService athleteService;

    @GetMapping("/")
    public ResponseEntity<Resource> getHomePage(){
        ClassPathResource resource = new ClassPathResource("static/index.html");
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, MediaType.TEXT_HTML_VALUE)
                .body(resource);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Athlete>> getAllAthletes() {
        return new ResponseEntity<List<Athlete>>(athleteService.allAthletes(), HttpStatus.OK);
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<Optional<List<Athlete>>> getAthleteByCategory(@PathVariable String category){
        return new ResponseEntity<Optional<List<Athlete>>>(athleteService.getAthleteByCategory(category), HttpStatus.OK);
    }

    @GetMapping("/rank/{rank}")
    public ResponseEntity<Optional<List<Athlete>>> getAthleteByRank(@PathVariable Integer rank) {
        return new ResponseEntity<Optional<List<Athlete>>>(athleteService.getAthleteByRank(rank), HttpStatus.OK);
    }

    @GetMapping("/groupAndCategory")
    public ResponseEntity<Optional<List<Athlete>>> getAthleteByGroupAndBodyweight(
            @RequestParam String group, @RequestParam String category) {
        return new ResponseEntity<Optional<List<Athlete>>>(athleteService.getAthleteByGroupAndCategory(group, category),
                HttpStatus.OK);
    }

}
