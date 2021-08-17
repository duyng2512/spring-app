package com.dinj.docclinic.legacy.service.dbService;

import com.dinj.docclinic.legacy.service.iService.iDbService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("H2")
@Service("dbService")
public class dbH2Service implements iDbService {
    @Override
    public void dbInfo() {
        System.out.println("[DB] ---> H2/ inMem ");
    }
}
