package com.dinj.docclinic.legacy.service.I18nService;

import com.dinj.docclinic.legacy.repository.EnglishRepository;
import com.dinj.docclinic.legacy.service.iService.iDevService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class I18nEngService implements iDevService {

    private final EnglishRepository englishRepository;

    public I18nEngService(EnglishRepository englishRepository) {
        this.englishRepository = englishRepository;
    }

    @Override
    public String service(){
        System.out.println("[service]: I18n --> 'ENG' ");
        this.englishRepository.getEnString();
        return "[service]: acquiring";
    }
}
