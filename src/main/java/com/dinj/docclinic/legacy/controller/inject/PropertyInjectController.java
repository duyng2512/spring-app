package com.dinj.docclinic.legacy.controller.inject;

import com.dinj.docclinic.legacy.service.iService.iDevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectController {

    @Qualifier("propertyDevService")
    @Autowired
    public iDevService constructorDevService;
    public String getService(){
        return constructorDevService.service();
    }
}
