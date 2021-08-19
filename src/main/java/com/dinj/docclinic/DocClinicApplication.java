package com.dinj.docclinic;

import additional.Additional;
import com.dinj.docclinic.legacy.controller.DbController;
import com.dinj.docclinic.legacy.controller.DevController;
import com.dinj.docclinic.legacy.controller.I18nController;
import com.dinj.docclinic.legacy.controller.inject.AcqController;
import com.dinj.docclinic.legacy.controller.inject.ConstructorInjectController;
import com.dinj.docclinic.legacy.controller.inject.PropertyInjectController;
import com.dinj.docclinic.legacy.controller.inject.SetterInjectController;
import com.dinj.docclinic.legacy.service.dbService.AcqServiceImpl;
import com.dinj.docclinic.legacy.service.dbService.dbH2Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.dinj.docclinic", "additional"} )
@SpringBootApplication
public class DocClinicApplication {

    /*
        ApplicationContext context = SpringApplication.run(DocClinicApplication.class, args);
        DevController controller = (DevController) context.getBean("devController");
        I18nController i18nController = (I18nController) context.getBean("i18nController");
        i18nController.getService();

        PropertyInjectController propertyInjectController = (PropertyInjectController) context.getBean("propertyInjectController");
        propertyInjectController.getService();

        SetterInjectController setterInjectController = (SetterInjectController) context.getBean("setterInjectController");
        setterInjectController.getService();

        ConstructorInjectController constructorInjectController = (ConstructorInjectController) context.getBean("constructorInjectController");
        constructorInjectController.getService();

        System.out.println("--------------------------");
        DbController dbController = (DbController) context.getBean("dbController");
        dbController.serviceInfo();
     */
    /*
        ApplicationContext context = SpringApplication.run(DocClinicApplication.class, args);
        Additional additional = (Additional) context.getBean("additional");
        additional.additionalInfo();
     */
    /*
        ApplicationContext context = SpringApplication.run(DocClinicApplication.class, args);
        AcqServiceImpl acqService = (AcqServiceImpl) context.getBean("acqServiceImpl");
        acqService.executeService();
     */

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DocClinicApplication.class, args);
        DevController controller = (DevController) context.getBean("devController");
        I18nController i18nController = (I18nController) context.getBean("i18nController");
        i18nController.getService();

        PropertyInjectController propertyInjectController = (PropertyInjectController) context.getBean("propertyInjectController");
        propertyInjectController.getService();

        SetterInjectController setterInjectController = (SetterInjectController) context.getBean("setterInjectController");
        setterInjectController.getService();

        ConstructorInjectController constructorInjectController = (ConstructorInjectController) context.getBean("constructorInjectController");
        constructorInjectController.getService();

        System.out.println("--------------------------");
        DbController dbController = (DbController) context.getBean("dbController");
        dbController.serviceInfo();
    }
}
