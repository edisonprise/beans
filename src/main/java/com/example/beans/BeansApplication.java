package com.example.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BeansApplication {

	//Se inicia la aplicacion y se obtienen instancias del bean DemoBean,
	//Se pueden observar los mensajes en la consola durante la inicializacion y destruccion de los beans.
	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(BeansApplication.class, args);

		DemoBean bean1 = context.getBean(DemoBean.class);
		DemoBean bean2 = context.getBean(DemoBean.class);

		context.close();
	}

}
