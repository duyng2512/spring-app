package com.dinj.docclinic.legacy.service.devService;

import com.dinj.docclinic.legacy.service.iService.iDevService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorDevService implements iDevService {

    @Override
    public String service(){
        System.out.println("[service]: acquiring -> Constructor");
        return "[service]: acquiring";
    }
}
