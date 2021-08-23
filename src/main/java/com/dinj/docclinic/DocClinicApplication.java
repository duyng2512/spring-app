package com.dinj.docclinic;

import com.dinj.docclinic.legacy.config.ConstructConfig;
import com.dinj.docclinic.legacy.config.PropertyConfig;
import com.dinj.docclinic.legacy.datasource.DummyDataSource;
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


        DummyDataSource source = context.getBean("dummyDataSource", DummyDataSource.class);
        System.out.println(source.toString());
        System.out.println("-------------------");
        PropertyConfig configuration = context.getBean(PropertyConfig.class);
        System.out.println(configuration.toString());

        ConstructConfig constructConfig = context.getBean(ConstructConfig.class);
        System.out.println(constructConfig.toString());

     */

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DocClinicApplication.class, args);
    }
}
