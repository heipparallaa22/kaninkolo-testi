package com.example.backendkubewiremockdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheController {

    @Autowired
    private TheService theService;

    @GetMapping("/message")
    public DomainMessage getMessage() {
        DomainMessage domainMessage = theService.getWiremockOpinion();
        System.out.println("------------------------- " + domainMessage.toString());
        return domainMessage;
    }
}
