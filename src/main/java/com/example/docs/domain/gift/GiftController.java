package com.example.docs.domain.gift;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GiftController {
    @GetMapping("/gift")
    public String restDocsTestAPI() {
        return "Merry christmas!";
    }
}
