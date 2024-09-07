package com.nagscodes.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Worldcontroller {

    @GetMapping("/world")
    public String World() {
        return "World";
    }
}
