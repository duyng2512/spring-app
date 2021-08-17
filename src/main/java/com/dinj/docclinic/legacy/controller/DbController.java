package com.dinj.docclinic.legacy.controller;

import com.dinj.docclinic.legacy.service.iService.iDbService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DbController {
    private final iDbService service;

    public DbController(@Qualifier("dbService") iDbService service) {
        this.service = service;
    }

    public void serviceInfo(){
        this.service.dbInfo();
    }
}
