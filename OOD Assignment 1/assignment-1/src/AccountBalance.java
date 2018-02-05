/**
 * Represents the amount within an account balance in dollars and cents where cents is greater than zero
 * and less than or equal to 99 and dollar is an amount greater than or equal to zero.
 */
public class AccountBalance {

    private Integer dollar;
    private Integer cents;

    /**
     *
     * @param dollar represents the dollar amount within the balance
     * @param cents represents the cents amount within the balance
     */
    public AccountBalance (Integer dollar, Integer cents){
        this.dollar = dollar;
        this.cents = cents;
    }

    //> Missing javadoc description for AccountBalance()


    /**
     *
     * @return returns the dollar amount within the account balance
     */
    public Integer getDollar() {
        return this.dollar;
    }

    //> Missing javadoc description for getDollar()


    /**
     *
     * @return returns the cent amount within the account balance
     */
    public Integer getCents() {
        return this.cents;
    }
    //> Missing javadoc description for getCents()

    //> -1 missing javadoc descriptions.

}
