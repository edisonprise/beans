package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class DemoBean implements InitializingBean, DisposableBean {
    @PostConstruct
    public void customInit() {
        System.out.println("Ejecutando inicializacion personalizada del Bean...");
    }
    @PreDestroy
    public void customDestroy() {
        System.out.println("Ejecutando destruccion personalizada del Bean....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inicializando Bean utilizando InitializingBean....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destruyendo Bean utilizando DisposableBean...");
    }
}
