package org.github.ogomezso.scs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;

@SpringBootApplication
public class ScsApplication {

  public static void main(String[] args) {
    SpringApplication.run(ScsApplication.class, args);
  }

}
