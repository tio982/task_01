package com.example.task_01.expression;

public class Greeting {

    private String name;
    private String timeOfDay;

    public Greeting(String name, String timeOfDay) {
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeofday) {
        this.timeOfDay= timeOfDay;
    }
}
