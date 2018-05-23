package com.yxw.sofademoprovider;

import com.yxw.sofademoprovider.service.HelloSyncService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource({ "classpath*:rpc-sofa-boot-starter-samples.xml" })
@SpringBootApplication
public class SofaDemoProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SofaDemoProviderApplication.class, args);



	}
}
