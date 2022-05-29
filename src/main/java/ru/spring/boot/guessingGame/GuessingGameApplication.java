package ru.spring.boot.guessingGame;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.spring.boot.guessingGame.event.Publish;

@Slf4j
@SpringBootApplication
public class GuessingGameApplication {

	public static void main(String[] args) {

	ConfigurableApplicationContext context = SpringApplication.run(GuessingGameApplication.class, args);

	Publish publish = context.getBean(Publish.class);

	publish.publishEvents();




	}

}
