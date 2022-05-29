package ru.spring.boot.guessingGame.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.ResourceBundle;

@Component
@Slf4j
public class Listener implements ApplicationListener<Event> {

    int digitComputer = (int) (Math.random() * 1000);

    @Override
    public void onApplicationEvent(Event event) {

        ResourceBundle resource = ResourceBundle.getBundle("text", new Locale("en", "Us"));

        if ((event.getNumber()) > 1000 || (event.getNumber() < 0)) {
            log.info(resource.getString("not"));
        } else if (digitComputer == event.getNumber()) {
            log.info(resource.getString("yes") + digitComputer);
        } else if (digitComputer < event.getNumber()) {
            log.info(resource.getString("less"));
        } else log.info(resource.getString("bigger"));

    }
}

