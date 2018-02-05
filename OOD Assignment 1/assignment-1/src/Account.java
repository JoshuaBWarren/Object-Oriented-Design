/**
 * represents an account with an account name and an account balance
 */
public class Account {

    private AccountName name;
    private AccountBalance amount;

    /**
     * represents the account that will have a name and an amount within
     *
     * @param name represents the name of the account holder as first and last name
     * @param amount represents the balance of the account in dollars and cents
     */
    public Account (AccountName name, AccountBalance amount){
        this.name = name;
        this.amount = amount;
    }

    /**
     * represents the name of the owner of the account
     *
     * @return represents the name of the account holder
     */
    public AccountName getName() {
        return this.name;
    }

    /**
     * represents the method that will get the current amount within the account.
     *
     * @return represents the account balance
     */
    public AccountBalance getAmount() {
        return this.amount;
    }

    /**
     * represents the
     *
     * @param deposit represents the amount to add
     * @return represents the new account balance after adding the deposit
     */
    public AccountBalance depositAmount(Integer deposit) {

        return new AccountBalance(this.getAmount().getDollar() + deposit,
                this.getAmount().getCents() + deposit);
    }

    //> Missing javadoc description for depositAmount()

    //> -3 The signature for this method should be to depositAmount(Amount deposit)
    //> however your parameter takes an integer.
    //> Also this method does not account for any carrying. If you add 10 cents to 95
    //> cents the result ought to return 5 cents and also add one to the dollar about.



    /**
     *
     * @param withdraw represents the amount to subtract
     * @return represents the new account balance after subtracting the withdraw
     */
    public AccountBalance withdrawAmount(Integer withdraw) {

        return new AccountBalance(this.getAmount().getDollar() - withdraw,
                this.getAmount().getCents() - withdraw);
    }
    //> Missing javadoc description for withdrawAmount()
    //> -3 The signature for this method should be to withdrawAmount(Amount withdraw)
    //> however your parameter takes an integer.
    //> Also this method does not account for any carrying. If you subtract 10 cents from 5
    //> cents the result ought to return 95 cents and also subtract one from the dollar about.

    //> -2 missing javadoc descriptions.


}
