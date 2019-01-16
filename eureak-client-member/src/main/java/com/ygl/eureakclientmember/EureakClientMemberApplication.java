package com.ygl.eureakclientmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * EnableDiscoveryClient 将当前服务注册到eureka上
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EureakClientMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(EureakClientMemberApplication.class, args);
	}

}

