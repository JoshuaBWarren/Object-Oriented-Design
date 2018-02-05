import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Philippe on 1/15/2017.
 */
public class AccountTest {

    private Account accountHolderOne;

    @org.junit.Before
    public void setUp() throws Exception {

        this.accountHolderOne = new Account( new AccountName("Bruce", "Wayne"), new AccountBalance(5, 50));
    }

    @org.junit.Test
    public void getName() throws Exception {

        Assert.assertEquals(this.accountHolderOne.getName().getFirstName(), "Bruce");
        Assert.assertEquals(this.accountHolderOne.getName().getLastName(), "Wayne");
    }

    @org.junit.Test
    public void getAmount() throws Exception {

        Assert.assertEquals(this.accountHolderOne.getAmount().getDollar(), new Integer(5));
        Assert.assertEquals(this.accountHolderOne.getAmount().getCents(), new Integer(50));
    }

    @org.junit.Test
    public void depositAmount() throws Exception {

        Assert.assertEquals(this.accountHolderOne.depositAmount(10).getDollar(), new Integer (15));
        Assert.assertEquals(this.accountHolderOne.depositAmount(10).getCents(), new Integer(60));
    }

    @org.junit.Test
    public void withdrawAmount() throws Exception {

        Assert.assertEquals(this.accountHolderOne.withdrawAmount(3).getDollar(), new Integer (2));
        Assert.assertEquals(this.accountHolderOne.withdrawAmount(10).getCents(), new Integer(40));
    }

    //> -2 These tests do not account for situations where there ought to be a carry.

}