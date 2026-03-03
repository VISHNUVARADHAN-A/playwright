package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class test3 {
    @Test
    void startcar(){System.out.println("startcar");}
    @Test(dependsOnMethods  ={"startcar"})
    void drivecar(){System.out.println("drivrcar");}
    @Test(dependsOnMethods  ={"drivecar"})
    void stopcar(){System.out.println("stopcar");}
    @Test(dependsOnMethods ={"startcar","drivecar"})
    void parkcar(){System.out.println("parkcar");}
    @Test(alwaysRun = true)
    void getkeys(){System.out.println("getkeys");}
}
