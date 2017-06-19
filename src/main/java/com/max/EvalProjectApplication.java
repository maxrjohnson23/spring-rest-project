package com.max;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.h2.server.web.WebServlet;


@SpringBootApplication(scanBasePackages = {"com.max"})
public class EvalProjectApplication {

  public static void main(String[] args) {
    SpringApplication.run(EvalProjectApplication.class, args);
  }

}
