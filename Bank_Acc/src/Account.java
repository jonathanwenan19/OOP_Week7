public class Account
{
    private double balance = 0;

    private double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public Account(double balance)
    {
        this.balance = balance;

    }

    public boolean deposit(double amt)
    {
        balance += amt;
        return true;
    }

    public boolean withdraw(double amt)
    {
        if( amt < balance || balance == 0)
        {
            balance -= amt;
            return true;
        }
        else{return false;}
    }

}
