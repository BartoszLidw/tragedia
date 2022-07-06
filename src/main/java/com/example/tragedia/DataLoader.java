package com.example.tragedia;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    private final Repository repository;

    public DataLoader(Repository repository) {
        this.repository = repository;
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {
        initialize();
        System.out.println("Initialized data!");
    }
    public void initialize(){
        for (int i = 0; i < 100; i++) {
Alarm x = new Alarm(i);
repository.alarms().put(Long.valueOf(i), x);
        }
    }
}
