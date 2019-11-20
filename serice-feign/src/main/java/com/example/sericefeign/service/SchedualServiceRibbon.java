package com.example.sericefeign.service;


import com.example.sericefeign.hystrix.SchedualServiceRibbonHys;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-ribbon",fallback = SchedualServiceRibbonHys.class)
public interface SchedualServiceRibbon {

    @RequestMapping(value = "/hi-ribbon",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
