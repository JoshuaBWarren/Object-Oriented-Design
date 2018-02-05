import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by Philippe on 1/12/2017.
 */
public class RunnerTest {

    private Runner thebatman;

    @org.junit.Before
    public void setUp() throws Exception {

        this.thebatman = new Runner ("Bruce Wayne", new Time (0, 2, 33), new Time(0, 3, 15));
    }

    @org.junit.Test
    public void getName() throws Exception {

        Assert.assertEquals(this.thebatman.getName(), "Bruce Wayne");
    }

    @org.junit.Test
    public void getStartTime() throws Exception {

        Assert.assertEquals(this.thebatman.getStartTime().getHours(), new Integer (0));
        Assert.assertEquals(this.thebatman.getStartTime().getMinutes(), new Integer (2));
        Assert.assertEquals(this.thebatman.getStartTime().getSeconds(), new Integer (33));

    }

    @org.junit.Test
    public void getDuration() throws Exception {

        Assert.assertEquals(this.thebatman.getDuration().getHours(), new Integer (0));
        Assert.assertEquals(this.thebatman.getDuration().getMinutes(), new Integer (3));
        Assert.assertEquals(this.thebatman.getDuration().getSeconds(), new Integer (15));

    }

<<<<<<< HEAD
        Assert.assertEquals(this.thebatman.getEndTime().getHours(), new Integer(1));
        Assert.assertEquals(this.thebatman.getEndTime().getMinutes(), new Integer(5));
        Assert.assertEquals(this.thebatman.getEndTime().getSeconds(), new Integer(48));
    }


    //> -2 This does not adequately test for the ends of minutes or hours. There is no carrying
    //> over in your tests. Also more than one test is often required to
    //> sufficiently test your code.

=======
>>>>>>> parent of 748e8d8... Homework 1 done!
}