package com.dinj.docclinic.legacy.controller.inject;

import com.dinj.docclinic.legacy.service.devService.ConstructorDevService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectControllerTest {

    ConstructorInjectController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectController(new ConstructorDevService());
    }

    @Test
    void getService() {
        controller.getService();
    }
}