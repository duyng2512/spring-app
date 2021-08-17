package com.dinj.docclinic.legacy.controller.inject;

import com.dinj.docclinic.legacy.service.iService.iDevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectController {
    private iDevService devService;

    @Qualifier("setterDevService")
    @Autowired
    public void setDevService(iDevService devService) {
        this.devService = devService;
    }

    public String getService(){
        return devService.service();
    }
}
