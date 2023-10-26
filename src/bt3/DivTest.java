package bt3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DivTest {

    Div divTest=new Div();

    @Before
    public void setUp() throws Exception {
        System.out.println("aaaa");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("done");
    }

    @Test
    public void div() {
        double a = 2.0;
        double b = 1.0;
        Assert.assertEquals(3.0, divTest.div(a, b), 0);

    }
}