package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidateController {

    @RequestMapping("/candidate/")
    public Candidate candidate(@RequestParam(value="name", defaultValue="Facundo") String name) {
        return new Candidate(name);
    }
}