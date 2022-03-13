package com.example.backendkubewiremockdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.io.StringWriter;
import java.io.PrintWriter;


@Service
public class TheService {

    private static final String WIREMOCK_URL = "http://wiremock:9090/getit";

    @Autowired
    private RestTemplate restTemplate;


    public DomainMessage getWiremockOpinion_MOCK() {
        return new DomainMessage("BUG FIX : Hello from RestApi 3 !!!");
    }

    public DomainMessage getWiremockOpinion() {
        String message;

        try {
            message = restTemplate.getForObject(WIREMOCK_URL, String.class);
        } catch (RestClientException e) {
            // e.getStackTrace();
            // message = e.getStackTrace().

            StringWriter stringWriter = new StringWriter();
            PrintWriter pw = new PrintWriter(stringWriter);
            e.printStackTrace(pw);
            String sT = stringWriter.toString();

            message = sT;
//            message = "FATAL error occurred.";
//            e.printStackTrace();
//            e.getStackTrace();
        }
        return new DomainMessage(message + " :: v6");
    }
}
