import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by Philippe on 1/12/2017.
 */
public class TimeTest {

    private Time time1;

    @org.junit.Before
    public void setUp() throws Exception {

        this.time1 = new Time (4, 48, 30);
    }

    @org.junit.Test
    public void getHours() throws Exception {

        Assert.assertEquals(this.time1.getHours(), new Integer (4));
    }

    @org.junit.Test
    public void getMinutes() throws Exception {

        Assert.assertEquals(this.time1.getMinutes(), new Integer (48));
    }

    @org.junit.Test
    public void getSeconds() throws Exception {

        Assert.assertEquals(this.time1.getSeconds(), new Integer (30));
    }

}