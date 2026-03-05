package test;

import ListenerTest.listenerTest;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerTest.listenerTest.class)
public class ListenerDemo {
@Test
    void test1(){
    System.out.println("test1");
    Assert.assertEquals("A","b");
}
    @Test
    void test2(){
        System.out.println("test12");
        Assert.assertEquals("A","A");
    }
    @Test
    void test3(){
        System.out.println("test1");
        throw new SkipException("this is skipped");
    }

}
