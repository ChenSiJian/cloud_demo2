package com.example.sericefeign.hystrix;

import com.example.sericefeign.service.SchedualServiceRibbon;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceRibbonHys implements SchedualServiceRibbon {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
