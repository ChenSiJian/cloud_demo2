package com.example.sericefeign.controller;

import com.example.sericefeign.service.SchedualServiceHi;
import com.example.sericefeign.service.SchedualServiceRibbon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @Autowired
    SchedualServiceRibbon schedualServiceRibbon;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }

    @GetMapping(value = "/hi-ribbon")
    public String sayHiRibbon(@RequestParam String name) {
        return schedualServiceRibbon.sayHiFromClientOne(name);
    }

}