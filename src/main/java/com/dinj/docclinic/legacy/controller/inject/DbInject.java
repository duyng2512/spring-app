package com.dinj.docclinic.legacy.controller.inject;

import com.dinj.docclinic.legacy.service.iService.iDbService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DbInject {
    private final iDbService dbService;

    public DbInject(@Qualifier("dbService") iDbService dbService) {
        this.dbService = dbService;
    }

    public void getDbInfo(){
        dbService.dbInfo();
    }

}
