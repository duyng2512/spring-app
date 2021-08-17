package com.dinj.docclinic.legacy.service.devService;

import com.dinj.docclinic.legacy.service.iService.iDevService;
import org.springframework.stereotype.Service;

@Service
public class SetterDevService implements iDevService {

    @Override
    public String service(){
        System.out.println("[service]: acquiring -> Setter");
        return "[service]: acquiring";
    }
}
