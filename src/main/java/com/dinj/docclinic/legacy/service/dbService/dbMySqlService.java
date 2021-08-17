package com.dinj.docclinic.legacy.service.dbService;

import com.dinj.docclinic.legacy.service.iService.iDbService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("MySQL")
@Service("dbService")
public class dbMySqlService implements iDbService {
    @Override
    public void dbInfo() {
        System.out.println("[DB] ---> Mysql/ port:3036 ");
    }
}
