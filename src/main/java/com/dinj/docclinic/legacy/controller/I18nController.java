package com.dinj.docclinic.legacy.controller;

import com.dinj.docclinic.legacy.service.iService.iDevService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final iDevService devService;

    public I18nController(@Qualifier("I18nService") iDevService devService) {
        this.devService = devService;
    }

    public String getService(){
        return devService.service();
    }
}
