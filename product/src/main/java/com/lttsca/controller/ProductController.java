package com.lttsca.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class ProductController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/product")
    public String product() {
        log.info("product ok!  port={}", port);
        return "product ok! port=" + port;
    }

}
