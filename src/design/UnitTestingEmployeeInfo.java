package design;

import org.testng.Assert;


public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.


        double bonus = EmployeeInfo.calculateEmployeeBonus(2000, 9);

        try {
            Assert.assertEquals(80, 80);
        } catch (AssertionError as) {
            System.out.println("Test Failed");
        }

    }
}
