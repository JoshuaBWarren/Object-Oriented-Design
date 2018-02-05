/**
 * Represents the first and last name of an account holder
 */
public class AccountName {

    private String firstName;
    private String lastName;

    /**
     *
     * @param firstName represents the first name of the account holder
     * @param lastName represents the last name of the account holder
     */
    public AccountName (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //> Missing javadoc description for AccountName()


    /**
     *
     * @return the first naame of the account holder
     */
    public String getFirstName() {
        return this.firstName;
    }
    //> Missing javadoc description for getFirstName()


    /**
     *
     * @return the last naame of the account holder
     */
    public String getLastName() {
        return this.lastName;
    }
    //> Missing javadoc description for getLastName()

    //> -1 Missing javadoc descrpitors

}
