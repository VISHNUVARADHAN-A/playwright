package test;

import org.testng.annotations.Test;

public class groupingDemo {
@Test(groups={"regression"})
    void test1(){
    System.out.println("regression");
}
    @Test(groups={"regression"})
    void test2(){
        System.out.println("regression");
    }
    @Test(groups={"regression","smoke"})
    void test3(){
        System.out.println("regression + smoke");
    }
    @Test(groups={"regression","sanity"})
    void test4(){
        System.out.println("regression + sanity");
    }
    @Test(groups={"sanity"})
    void test5(){
        System.out.println("sanity");

    }
}
