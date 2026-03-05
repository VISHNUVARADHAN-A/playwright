package ListenerTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerTest implements ITestListener {
public void onstart(ITestContext arg){
    System.out.println("starting test ....." + arg.getName());
}
    public void onFinish(ITestContext arg){
        System.out.println("finish test ....." + arg.getName());
    }
    public void onTestStart(ITestResult arg0){
        System.out.println("test  starting ....." + arg0.getName());
    }
    public void onTestSkipped(ITestResult arg0){
        System.out.println("skipped test ....." + arg0.getName());
    }
    public void onTestSuccess(ITestResult arg0){
        System.out.println(" test  success ....." + arg0.getName());
    }
    public  void onTestFailure(ITestResult arg0){
        System.out.println(" test failure ....." + arg0.getName());
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0){

    }
}
