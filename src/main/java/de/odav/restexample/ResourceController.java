package de.odav.restexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ResourceController {
    @GetMapping("/resource")
    public Resource resource(@RequestParam(value = "id") long id) {
        return new Resource(id, new Random(id).nextLong());
    }
}
