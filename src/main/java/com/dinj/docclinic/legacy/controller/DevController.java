package com.dinj.docclinic.legacy.controller;

import com.dinj.docclinic.legacy.service.iService.iDevService;
import org.springframework.stereotype.Controller;

@Controller
public class DevController {
    private final iDevService devService;
    public DevController(iDevService devService) {
        this.devService = devService;
    }
    public String devEcho(){
        return devService.service();
    }
}
