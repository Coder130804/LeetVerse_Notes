class Bank extends Thread
{
    static int balance=1000; //shared resource
    int wid_amt;
    Bank(int wid_amt)
    {
        this.wid_amt=wid_amt;
    }
    public synchronized static void withdraw(int amt)  //Static Level Synchronization
    {
        if(amt<=balance)
        {
            balance-=amt;
            System.out.println("Current Thread:"+Thread.currentThread().getName()+" Withdraws: "+amt);
        }
        else
        {
            System.out.println("Insufficient Balance for "+Thread.currentThread().getName()+" who wants to ithdraw: "+amt);
        }
    }
    public void run()
    {
        withdraw(wid_amt);
    }
    public int getbal()
    {
        return balance;
    }
}
/*Static level Synchronization,needed where same resource is shared by both thread
//but to prevent race condition.

//If balance is static (shared by all objects), then static synchronization is 
//the best choice because it enforces a class-level lock, ensuring that no two threads
//can access withdraw() simultaneously from different objects. 

Here not only thread t1,t2 but Bank object(b1,b2) access same resource:balance
*/

/*When balance is non-static, each Bank object (b1, b2) has its own separate balance
so any method of synchronization is applicable and works the same way.

Alternative method: (Static Block)
public void withdraw(int amt)
    {
        synchronized(Bank.class)
        {
        if(amt<=balance)
        {
            balance-=amt;
            System.out.println("Current Thread:"+Thread.currentThread().getName()+" Withdraws: "+amt);
        }
        else
        {
            System.out.println("Insufficient Balance:");
            System.out.println("Current Thread:"+Thread.currentThread().getName()+" Wants to Withdraw: "+amt);
        }
    }
*/