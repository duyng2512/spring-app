package com.dinj.docclinic.legacy.service.devService;

import com.dinj.docclinic.legacy.service.iService.iDevService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryDevService implements iDevService {

    @Override
    public String service() {
        System.out.println("[service]: acquiring -> Primary");
        return "[service]: acquiring";
    }
}
