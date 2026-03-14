class mainMethod
{
    public static void main(String args[])
    {
        Bank b1=new Bank(700);
        System.out.println("Balance:"+Bank.balance);
        Thread t1=new Thread(b1);
        Thread t2=new Thread(b1);
        t1.setName("Rahul");
        t2.setName("Riya");
        t1.start();
        t2.start();
        try
        {
            t1.join();
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Final Balance of Bank Account:"+b1.getbal());
    }
}