package uk.gov.hmcts.reform.dev.v1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class RootController {
    @GetMapping(value = "/")
    public ResponseEntity<String> unexpectedButNotUnwelcome() {
        return ok("What're you doing up here, or down here... Wait, I'm confused, am I at the top, or the bottom?");
    }
    

}
