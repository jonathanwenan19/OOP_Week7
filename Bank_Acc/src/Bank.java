public class Bank
{
    private java.util.ArrayList<Customer> customers = new java.util.ArrayList<>();
    private String Bname;
    private int NumberofCustomers;

    public Bank(String bname)
    {
        Bname = bname;
    }
    public void add_customer(String Fname, String Lname)
    {
        customers.add(new Customer(Fname, Lname));
        NumberofCustomers +=1 ;
    }

    public void getCustomer(int index)
    {
        System.out.println(customers.get(index));
    }

    public int getNumberofCustomers()
    {
        return NumberofCustomers;
    }
}
