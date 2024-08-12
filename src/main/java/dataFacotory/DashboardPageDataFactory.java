package dataFacotory;

import dataobjects.DashboardPageDataObjects;

import java.util.Random;
import java.util.random.RandomGenerator;

public class DashboardPageDataFactory {


    public DashboardPageDataObjects getDashboardPageData (){
        DashboardPageDataObjects data1 = new DashboardPageDataObjects();

        data1.setCustomer_Name("raja ram");
        data1.setDOB("13082022");
        data1.setAddress("Ahmedabad");
        data1.setCity("Ahmedabad");
        data1.setState("gujrat");
        data1.setPinNo("444444");
        data1.setMobileNo("8787878787");
        Random RandomGenerator = new Random();
        int randomInt = RandomGenerator.nextInt(1000);
        data1.setEmail("username"+randomInt+"@gmail.com");
        data1.setPassword("pass@123");
        return data1;
    }

}
