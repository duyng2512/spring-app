package com.dinj.docclinic.legacy.controller;

import com.dinj.docclinic.legacy.controller.inject.PropertyInjectController;
import com.dinj.docclinic.legacy.service.devService.ConstructorDevService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectControllerTest {

    PropertyInjectController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectController();
        controller.constructorDevService = new ConstructorDevService();
    }

    @Test
    void getService() {
        System.out.println(controller.getService());
    }
}