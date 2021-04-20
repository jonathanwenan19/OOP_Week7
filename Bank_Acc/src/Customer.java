public class Customer
{
    private String Firstname;
    private String Lastname;
    private Account account;

    public Customer(String firstname, String lastname)
    {
        Firstname = firstname;
        Lastname = lastname;
    }

    public String getFirstname()
    {
        return Firstname;
    }

    public String getLastname()
    {
        return Lastname;
    }

    public Account getAccount()
    {
        return account;
    }

    public void setFirstname(String firstname)
    {
        Firstname = firstname;
    }

    public void setLastname(String lastname)
    {
        Lastname = lastname;
    }

    public void setAccount(Account account)
    {
        this.account = account;
    }
}
