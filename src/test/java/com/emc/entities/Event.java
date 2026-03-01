package com.emc.entities;

public class Event {
public int id ;
public String name;
public String descriptions;
public long startTime, endTime;
public boolean started;
public Event(int id, String name, String descriptions){
    this.id=id;
    this.name=name;
    this.descriptions= descriptions;
}
}
