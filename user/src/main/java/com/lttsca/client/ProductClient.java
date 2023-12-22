package com.lttsca.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("product")
public interface ProductClient {
    @GetMapping("/product")
    String product();

}
