package com.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.models.Candidate;


@RestController
public class CandidateController {
	
	@GetMapping("/candidate/")
	public Candidate candidate(@RequestParam(value="name", defaultValue="Facundo") String name) {
        return new Candidate(name);
    }
}