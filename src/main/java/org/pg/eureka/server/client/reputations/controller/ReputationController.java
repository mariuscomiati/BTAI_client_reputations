package org.pg.eureka.server.client.reputations.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class ReputationController {

    private Random random = new Random(0);

    @GetMapping
    public ResponseEntity<Integer> getReputation(@RequestParam String cnp) {
        return ResponseEntity.ok(random.nextInt(150));
    }

}
