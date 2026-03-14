class Thread2 extends Thread
{
    Print p;
    Thread2(Print p)
    {
        this.p=p;
    }
    public void run()
    {
        p.printing(new String[]{"I","Love","Java","very","much"});
    }
}