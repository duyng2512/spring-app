package com.dinj.docclinic.legacy.controller.inject;

import com.dinj.docclinic.legacy.service.devService.ConstructorDevService;
import com.dinj.docclinic.legacy.service.iService.iDevService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectController {
    private final iDevService constructorDevService;

    public ConstructorInjectController(@Qualifier("constructorDevService") ConstructorDevService constructorDevService) {
        this.constructorDevService = constructorDevService;
    }

    public String getService(){
        return constructorDevService.service();
    }
}
