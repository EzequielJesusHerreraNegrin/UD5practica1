package com.ripAdbaisor.business;

/**
 * Restaurant
 */
public class Restaurant {

    protected String name = " ";
    protected String location = " ";
    protected String schedule = " ";
    protected float mark = 0f;

    public Restaurant(String name,String location,String schedule,float mark){
        name = this.name;
        location = this.location;
        schedule = this.schedule;
        mark = this.mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    

}