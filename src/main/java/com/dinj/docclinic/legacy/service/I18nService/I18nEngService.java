package com.dinj.docclinic.legacy.service.I18nService;

import com.dinj.docclinic.legacy.service.iService.iDevService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class I18nEngService implements iDevService {

    @Override
    public String service(){
        System.out.println("[service]: I18n --> 'ENG' ");
        return "[service]: acquiring";
    }
}
