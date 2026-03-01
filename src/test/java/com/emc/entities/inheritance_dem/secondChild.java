package com.emc.entities.inheritance_dem;

public class secondChild extends firstchild{
public static void main(String[] args) {
    firstchild fc =new firstchild();
    fc.fromFirstChild();
    fc.fromParent();
    fc.familyname();
    fc.familyfullname();
    

}
}
