package com.frankmoley.lil.fid;

import com.frankmoley.lil.fid.config.ApplicationConfig;
import com.frankmoley.lil.fid.service.OutputService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static  void  main(String[] args) throws Exception{
        ApplicationContext applicationConfig = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        OutputService outputService = applicationConfig.getBean(OutputService.class);
        for(int i =0 ; i<5;i++){
            outputService.generateOutput();
            Thread.sleep(5000);
        }
    }
}
