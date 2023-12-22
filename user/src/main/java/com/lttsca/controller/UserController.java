package com.lttsca.controller;


import com.lttsca.client.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class UserController {

    @Value("${server.port}")
    private int port;
    @Autowired
    private ProductClient productClient;

    @GetMapping("/user")
    public String user() {
        log.info("user ok!  port={}", port);
        //远程调用 product
        String result = productClient.product();
        log.info("远程调用 result: {}", result);
        return "user ok! port=" + port;
    }

}