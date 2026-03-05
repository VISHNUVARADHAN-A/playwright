package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.swing.*;

public class DataproviderDemo
{

    @Test(dataProvider = "newdata")
    void Dataprovidertest(String username, String Password){
        System.out.println(username + " "+ Password);
    }

    @DataProvider(name="newdata")
    public Object[][] getdata(){
        Object[][] data={{"hello","hello1"},{"hi","hi1"},{"am","am1"}};
        return data;
    }


}
