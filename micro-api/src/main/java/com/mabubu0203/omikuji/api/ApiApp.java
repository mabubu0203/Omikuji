package com.mabubu0203.omikuji.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
    basePackages = {
      "com.mabubu0203.omikuji.api",
    })
public class ApiApp implements CommandLineRunner {

  public static void main(String[] args) {
    System.setProperty("spring.devtools.restart.enabled", "false");
    SpringApplication.run(ApiApp.class, args);
  }

  @Override
  public void run(String... args) {}
}
