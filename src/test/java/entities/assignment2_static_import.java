package entities;
import static java.lang.Integer.*;
import static java.lang.Float.*;
import static java.lang.System.*;
import java.util.Scanner;
public class assignment2_static_import {
    public static void main(String[] args) {
        out.print("enter a int and float");
        Scanner scannobj =  new Scanner(System.in);
        int a = parseInt(scannobj.next());
        //Integer is already imported
        //int a = Integer.parseInt(scannobj.next());
        float b = parseFloat(scannobj.next());
        scannobj.close();
        System.out.println("Minimum: "+Math.min(a,b) +"Exponent of b "+ Math.getExponent(b));
 }
}
