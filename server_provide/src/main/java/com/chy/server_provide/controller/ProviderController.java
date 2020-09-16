package com.chy.server_provide.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    @RequestMapping("/get")
    public String getData(){
        return "provide提供数据";
    }
}
