package com.dinj.docclinic.legacy.controller;

import com.dinj.docclinic.legacy.controller.inject.SetterInjectController;
import com.dinj.docclinic.legacy.service.devService.ConstructorDevService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectControllerTest {

    SetterInjectController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectController();
        controller.setDevService(new ConstructorDevService());
    }

    @Test
    void getService() {
        controller.getService();
    }
}