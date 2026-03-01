package test;

import entities.Event;
import entities.Organizer;
import entities.inheritance_dem.firstchild;

public class Test {
    public static void main(String[] args) {
        
    
Organizer org1 = new Organizer();
org1.id=1234;
org1.name="appele";
System.out.println(org1);
System.out.println(org1.name);
Event evn = new Event(1234,"apple","launch event");
System.out.println(evn.id+" "+evn.name+" "+evn.descriptions);
firstchild fc= new firstchild();
//public fc.fromFirstChild();
fc.fromFirstChild();
// public static firstchild.fromFirstChild();


    }
}
