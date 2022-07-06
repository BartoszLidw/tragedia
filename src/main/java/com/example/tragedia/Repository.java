package com.example.tragedia;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Repository {
    private Map<Long, Alarm> alarms;
    public Repository() {
        alarms = new HashMap<>();
    }
    public Map<Long, Alarm> alarms() {
        return alarms;
    }
}
