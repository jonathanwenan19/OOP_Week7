import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Customer> Main_Database = new ArrayList<>();
        Bank bank = new Bank("BCA");
        Customer currentAcc = new Customer(null,null);
        Scanner scanner = new Scanner(System.in);
       //BCA machine's ATM machine choices
        System.out.println("1.Log in 2.Number of Customers 3.Logout 4.Deposit 5. Withdraw  6. Create Account 7.Exit");
        System.out.println("What do you want to do?");
        int choice = scanner.nextInt();
        do {
            switch(choice)
            {
                    case 1:

                        // for logging in
                        if(Main_Database.isEmpty())
                            {
                                System.out.println("Empty Database!");
                            }
                        else
                            {
                                System.out.println("Type in your first name!");
                                String fname = scanner.next();
                                System.out.println("Type in your last name!");
                                String lname = scanner.next();
                            }

                        case 2:

                            // returns the amount of customers in the database
                    System.out.println(bank.getNumberofCustomers());

                    case 3:

                        //Logout
                    currentAcc = new Customer(null,null);
                    currentAcc.setAccount(new Account(0));

                    case 4:

                        //Deposit the balance
                    double amount = scanner.nextInt();
                    if(currentAcc.getFirstname()!= null && currentAcc.getLastname()!= null)
                    {
                        currentAcc.getAccount().deposit(amount);
                    }

                    case 5:

                        //Deposit the balance
                    double amount_withdraw = scanner.nextInt();
                    if(currentAcc.getFirstname()!= null && currentAcc.getLastname()!= null)
                    {
                        currentAcc.getAccount().deposit(amount_withdraw);
                    }

                    case 6:

                        //For creating an account
                    System.out.println("What is your first name?");
                    String first = scanner.next();
                    System.out.println("What is your last name");
                    String last = scanner.next();
                    bank.add_customer(first,last);
                    Account newCustomerAccount = new Account(0);

                    // Automatically login
                        currentAcc.setFirstname(first);
                    currentAcc.setLastname(last);
                    currentAcc.setAccount(newCustomerAccount);
            }
            System.out.println("What else do you want to do? (Type a value bigger than 7 or lower than 1 to quit!))");
            int nextChoice = scanner.nextInt();
            if(nextChoice >= 1 && nextChoice< 7)
            {
                continue;

            }
            else
            {break;}
        }while(choice<=0 || choice>=7);
        System.out.println("Have a nice day!");
    }
}
