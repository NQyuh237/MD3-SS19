package bt1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddNSubTest {
    AddNSub addNSub = new AddNSub();

    @Test
    public void add() {
        double a=1.0;
        double b=2.0;
        Assert.assertEquals(2.5,addNSub.add(a,b),1.0);
    }

    @Test
    public void sub() {
        double a=1.0;
        double b=2.0;
        Assert.assertEquals(-1.5,addNSub.sub(a,b),1.0);
    }
}