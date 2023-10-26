package bt2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalMultiTest {

        CalMulti calMulti=new CalMulti();
    @Test
    public void multiplication() {
        System.out.println("test");
        double a=2.0;
        double b=3.0;
        Assert.assertEquals(5.0,calMulti.multiplication(a,b),2.0);
        System.out.println("đone");

    }
}