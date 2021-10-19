package com.magic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.magic.*")
public class MagicBoot implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MagicBoot.class);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("启动初始化");
    }

}
